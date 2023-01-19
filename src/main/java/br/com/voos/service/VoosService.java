package br.com.voos.service;

import com.opencsv.CSVReader;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class VoosService {
    private static final String CSV_PATH = "\\C:\\Users\\victo\\Desktop\\csvoos\\DadosVoos.csv";
    public static void main(String[] args) {

        try {
            CSVReader csvReader = new CSVReader(new FileReader(new File(CSV_PATH)));
            List<List<String>> linhas = new ArrayList<List<String>>();

            String [] colunas = null;
            while ( (colunas = csvReader.readNext()) != null){
                linhas.add(Arrays.asList(colunas));
            }
            linhas.forEach(cols -> {
                System.out.println(cols);
            });

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
