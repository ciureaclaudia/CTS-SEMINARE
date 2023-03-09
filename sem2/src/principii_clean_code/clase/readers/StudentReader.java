package principii_clean_code.clase.readers;

import principii_clean_code.clase.Aplicant;
import principii_clean_code.clase.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentReader extends AplicantReader{
    @Override
    public List<Aplicant> readAplicants(String fileName) throws FileNotFoundException {
        List<Aplicant> studenti = new ArrayList<Aplicant>();

        try {
            Scanner input = new Scanner(new File(fileName));
            input.useDelimiter(",|\n");


            while (input.hasNext()) {

                Student student = new Student();
//            String nume = input.next();
//            String prenume = (input.next()).toString();
//            int varsta = Integer.valueOf(input.nextInt());
//            int punctaj = Integer.valueOf(input.nextInt());
//            int nr = Integer.valueOf(input.nextInt());
//            String[] vect = new String[5];
//            for (int i = 0; i < nr; i++)
//                vect[i] = input.next();
                int an_studii = input.nextInt();
                String facultate = (input.next()).toString();
                studenti.add(student);
            }
            input.close();

        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return studenti;
    }
}
