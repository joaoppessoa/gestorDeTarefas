package Interfaces;

import Classes.Tasks;

import java.io.FileNotFoundException;
import java.io.IOException;


public interface Crud {
    public String create(Tasks t) throws IOException, FileNotFoundException;
    public Tasks read() throws IOException, FileNotFoundException;
    public String update(String title, String description) throws IOException, FileNotFoundException;;
    public String delete(Tasks t) throws IOException, FileNotFoundException;;
}
