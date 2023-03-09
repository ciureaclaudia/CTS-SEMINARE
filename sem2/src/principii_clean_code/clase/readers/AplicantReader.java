package principii_clean_code.clase.readers;

import principii_clean_code.clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Scanner;

public abstract class AplicantReader {
    //clasa abstracta

    //sterg atributul din metoda
    List<Aplicant> readAplicants(String fileName) throws FileNotFoundException{
        return null;
    }

    public  void readAplicant(Scanner scanner, Aplicant aplicant){
        String nume = scanner.next();
        String prenume = scanner.next();
        int varsta = scanner.nextInt();
        int punctaj = scanner.nextInt();
        int nrProiecte = scanner.nextInt();
        String[] vect = new String[5];
        for (int i = 0; i < nrProiecte; i++)
            vect[i] = scanner.next();

        aplicant.setNume(nume);
        aplicant.setPrenume(prenume);
        aplicant.setVarsta(varsta);
        aplicant.setPunctaj(punctaj);
        aplicant.setNr_proiecte(nrProiecte,vect);




    }


}
