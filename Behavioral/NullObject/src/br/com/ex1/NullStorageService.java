package br.com.ex1;

/**
 * NullClass -> É a classe fundamental deste pattern. Criada para evitar que façamos != null toda hora
 */
public class NullStorageService extends StorageService {

    @Override
    public void save(Report report) {
        System.out.println("Null object save method. Doing nothing");
    }
}
