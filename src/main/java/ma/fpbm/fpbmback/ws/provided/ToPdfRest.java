package ma.fpbm.fpbmback.ws.provided;

import com.google.zxing.WriterException;
import com.itextpdf.text.DocumentException;
import ma.fpbm.fpbmback.ToPdf.GeneratePV;
import ma.fpbm.fpbmback.beans.Examen;
import ma.fpbm.fpbmback.beans.ExamenHasProfesseurHasModuleHasEtudiant;
import ma.fpbm.fpbmback.repository.ExamenRepository;
import ma.fpbm.fpbmback.service.imple.ExamenHasProfesseurHasModuleHasEtudiantImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("topdf")
public class ToPdfRest {

    @Autowired
    private ExamenRepository examenRepository;

    @Autowired
    private ExamenHasProfesseurHasModuleHasEtudiantImple examenHasProfesseurHasModuleHasEtudiantImple;

    @GetMapping("/{id}")
    public void exportToPDF(HttpServletResponse response, @PathVariable Long id) throws DocumentException, IOException, WriterException {
        Examen examen = examenRepository.findById(id).orElseThrow();
        List<ExamenHasProfesseurHasModuleHasEtudiant> list = examenHasProfesseurHasModuleHasEtudiantImple.getAll();
        response.setContentType("application/pdf");
        DateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
        String currentDateTime = dateFormatter.format(new Date());

        String headerKey = "Content-Disposition";
        String headerValue = "attachment; filename=users_" + currentDateTime + ".pdf";
        response.setHeader(headerKey, headerValue);
        GeneratePV exporter = new GeneratePV(examen,list);
        exporter.export(response);

    }
}
