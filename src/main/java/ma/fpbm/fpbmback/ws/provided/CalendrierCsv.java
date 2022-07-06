package ma.fpbm.fpbmback.ws.provided;

import ma.fpbm.fpbmback.beans.Examen;
import ma.fpbm.fpbmback.beans.ProfesseurHasModuleHasEtudiant;
import ma.fpbm.fpbmback.service.imple.ExamenServiceImple;
import ma.fpbm.fpbmback.service.imple.ProfesseurModuleEtudiantServiceImpl;
import ma.fpbm.fpbmback.toExcel.ExcelExport;
import ma.fpbm.fpbmback.toExcel.ToExcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


@RestController
public class CalendrierCsv {

    @Autowired
    private ExamenServiceImple examenService;

    @Autowired
    private ProfesseurModuleEtudiantServiceImpl professeurModuleEtudiantService;

    @GetMapping("/export")
    public String toCsv(HttpServletResponse response) throws IOException {
        response.setContentType("text/csv");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_" + currentDateTime + ".csv";
        response.setHeader(headerKey, headerValue);

        List<Examen> examenList = examenService.findAll();

        ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(), CsvPreference.STANDARD_PREFERENCE);
        String[] csvHeader = {"id", "jour", "heure"};
        String[] nameMapping = {"id", "jour", "heure"};

        csvWriter.writeHeader(csvHeader);
        for(Examen examen : examenList){
            csvWriter.write(examen, nameMapping);
        }
        csvWriter.close();
        return "done";
    }

    @GetMapping("/excelExport")
    public ModelAndView exportToExcel() {
        ModelAndView mav = new ModelAndView();
        mav.setView(new ExcelExport());
        //read data from DB
        List<Examen> list= examenService.findAll();
        List<ProfesseurHasModuleHasEtudiant> listModule = professeurModuleEtudiantService.getAll();
        //send to excelImpl class
        mav.addObject("list", list);
        mav.addObject("listModule",listModule);
        return mav;
    }

    @GetMapping("/export/excel")
    public String exportToExcel(HttpServletResponse response) throws IOException {
        response.setContentType("application/octet-stream");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_" + currentDateTime + ".xlsx";
        response.setHeader(headerKey, headerValue);

        List<Examen> list = examenService.findAll();

        ToExcel excelExporter = new ToExcel(list);

        excelExporter.export(response);
        return "done";
    }
}
