import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Scanner;

import org.apache.poi.xwpf.usermodel.*;

public class SampleDocCreation {


    public static void main(String[] args)throws Exception  {

        //Blank Document
        XWPFDocument document = new XWPFDocument();

        //Write the Document in file system
        FileOutputStream out = new FileOutputStream( new File("createdocument.docx"));

        Scanner Docinput = new Scanner(System.in);
        System.out.println("Enter the Document Summary");
        String summary = Docinput.nextLine();
        XWPFParagraph paragraph = document.createParagraph();
        XWPFRun run = paragraph.createRun();
        run.setText(summary);
        document.write(out);
        out.close();
        System.out.println("Document created successfully");
    }
}
