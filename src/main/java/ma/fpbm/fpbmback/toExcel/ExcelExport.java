package ma.fpbm.fpbmback.toExcel;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ma.fpbm.fpbmback.beans.Examen;
import ma.fpbm.fpbmback.beans.ProfesseurHasModuleHasEtudiant;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;


import org.springframework.web.servlet.view.document.AbstractXlsView;



public class ExcelExport extends AbstractXlsView {


    @Override
    protected void buildExcelDocument(
            Map<String, Object> model,
            Workbook workbook,
            HttpServletRequest request,
            HttpServletResponse response) throws Exception {

        // define excel file name to be exported
        response.addHeader("Content-Disposition", "attachment;fileName=InvoiceData.xls");

        // read data provided by controller
        @SuppressWarnings("unchecked")
        List<Examen> list = (List<Examen>) model.get("list");
        @SuppressWarnings("unchecked")
        List<ProfesseurHasModuleHasEtudiant> listModule = (List<ProfesseurHasModuleHasEtudiant>) model.get("listModule");

        // create one sheet
        Sheet sheet = workbook.createSheet("Examen");

        // create row0 as a header
        Row row0 = sheet.createRow(0);
        row0.createCell(0).setCellValue("ID");
        row0.createCell(1).setCellValue("jour");
        row0.createCell(2).setCellValue("heure");
        row0.createCell(3).setCellValue("salle");
        row0.createCell(4).setCellValue("section");
        row0.createCell(5).setCellValue("filliere");
        row0.createCell(6).setCellValue("module");
        row0.createCell(7).setCellValue("eff");

        // create row1 onwards from List<T>
        int rowNum = 1;
        for(Examen spec : list) {
            Row row = sheet.createRow(rowNum++);
            row.createCell(0).setCellValue(spec.getId());
            row.createCell(1).setCellValue(spec.getJour());
            row.createCell(2).setCellValue(spec.getHeure());
            row.createCell(3).setCellValue(spec.getSalle().getName());
            row.createCell(4).setCellValue(spec.getProfHasModule().getSection().getName());
            row.createCell(5).setCellValue(spec.getProfHasModule().getModule().getSemestre().getName_semester());
            row.createCell(6).setCellValue(spec.getProfHasModule().getModule().getGroupes());
            int countEff = 0;
            //countEffectif
            for(ProfesseurHasModuleHasEtudiant temp:listModule){
                if(spec.getProfHasModule().getModule().getGroupes().equals(temp.getProfesseurHasModule_id().getModule().getGroupes()) && spec.getProfHasModule().getSection().getName().equals(temp.getProfesseurHasModule_id().getSection().getName())){
                    countEff++;
                }
            }
            row.createCell(7).setCellValue(countEff);
            //professeurModuleEtudiantService.countEffectif("M01:Analyse","section A")
        }
    }
}
