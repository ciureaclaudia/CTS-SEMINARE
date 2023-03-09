package principii_clean_code.clase.readers;

import principii_clean_code.clase.Aplicant;
import principii_clean_code.clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ElevReader extends AplicantReader {
    @Override
    public List<Aplicant> readAplicants(String fileName) throws FileNotFoundException {

        List<Aplicant> elevi = new ArrayList<Aplicant>();

        try {

            Scanner input2 = new Scanner(new File(fileName));
            input2.useDelimiter(",|\n");

            while (input2.hasNext()) {

                Elev elev = new Elev();
                super.readAplicant(input2, elev);

                int clasa = input2.nextInt();
                String tutore = input2.next();

                elevi.add(elev);
            }

            input2.close();

        } catch (FileNotFoundException e){
            e.printStackTrace();
        }
        return elevi;
    }
}
