package harjot.tp03.etude1.Service;

import harjot.tp03.etude1.listeSimplementChainee.ListeSimplementChainee;
import harjot.tp03.utils.Chronometre;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

public class Service {
    ArrayList<Integer> dataSet1;
    ArrayList<Integer> dataSet2;
    ArrayList<Integer> dataSet3;

    public Service() throws Exception {
        dataSet1 = getData(IService.PATH_DATASET_1);
        dataSet2 = getData(IService.PATH_DATASET_2);
        dataSet3 = getData(IService.PATH_DATASET_3);
    }

    public ArrayList<Integer> getData(String path) throws Exception {
        ArrayList<Integer> dataInList = new ArrayList<>();

        File data = new File(path);
        Scanner reader = new Scanner(data);

        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            dataInList.add(Integer.valueOf(line));
        }

        reader.close();
        return dataInList;
    }

    public void appendData(String data, String path) throws Exception {
        File file = new File(path);
        FileWriter fr = new FileWriter(file, true);
        fr.write(data + "\n");
        fr.close();
    }

    public void addStructureInfo(String structureName, long insert, long delete, long search, String path) throws Exception {
        Service service = new Service();

        service.appendData(structureName, path);
        service.appendData("Insert: " + String.valueOf(insert) + "ms", path);
        service.appendData("Delete: " + String.valueOf(delete) + "ms", path);
        service.appendData("Search: " + String.valueOf(search) + "ms", path);
    }

    public void listeSimplementChaineeTimer(int dataSet) throws Exception {
        Service service = new Service();
        Chronometre chronometre = new Chronometre();

        ArrayList<Integer> data = new ArrayList<>();

        switch (dataSet){
            case 1:
                data = service.dataSet1;
                break;
            case 2:
                data = service.dataSet2;
                break;
            case 3:
                data = service.dataSet3;
                break;
        }

        // Liste simplement chainee
        ListeSimplementChainee liste = new ListeSimplementChainee();

        chronometre.start();
        for (int i = 0; i < data.size(); i++) {
            liste.add(data.get(i));
        }
        chronometre.stop();
        long insert = chronometre.getDuration();

        chronometre.reset();

        chronometre.start();
        for (int i = 0; i < liste.getNombreElement(); i++) {
            if (liste.getElementAt(i) == IService.SEARCHED_NUMBER)
                break;
        }
        chronometre.stop();
        long search = chronometre.getDuration();

        chronometre.reset();

        chronometre.start();
        for (int i = 0; i < liste.getNombreElement(); i++) {
            liste.remove(i);
        }
        chronometre.stop();
        long delete = chronometre.getDuration();

        chronometre.reset();

        service.addStructureInfo("Liste simplement chainee", insert, delete, search, "src/data/Resultats.txt");
    }

    public static void main(String[] args) throws Exception {
        Service service = new Service();
        Chronometre chronometre = new Chronometre();

        // Liste simplement chainee
        ListeSimplementChainee liste = new ListeSimplementChainee();

        chronometre.start();
        for (int i = 0; i < service.dataSet1.size(); i++) {
            liste.add(service.dataSet1.get(i));
        }
        chronometre.stop();
        long insert = chronometre.getDuration();

        chronometre.reset();

        chronometre.start();
        for (int i = 0; i < liste.getNombreElement(); i++) {
            if (liste.getElementAt(i) == IService.SEARCHED_NUMBER)
                break;
        }
        chronometre.stop();
        long search = chronometre.getDuration();

        chronometre.reset();

        chronometre.start();
        for (int i = 0; i < liste.getNombreElement(); i++) {
            liste.remove(i);
        }
        chronometre.stop();
        long delete = chronometre.getDuration();

        chronometre.reset();

        service.addStructureInfo("Liste simplement chainee", insert, delete, search, "src/data/Resultats.txt");
    }
}
