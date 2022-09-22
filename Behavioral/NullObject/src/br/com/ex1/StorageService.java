package br.com.ex1;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Classe Pai
 */
public class StorageService {

    public void save(Report report) {
        System.out.println("Writing report out");
        try(PrintWriter writer = new PrintWriter(report.getName()+".txt")) {

            writer.println(report.getName());

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
