import java.io.*;

public class FileIOOperations {
    public static void main(String[] args) {
        String fileName = "example.txt";
        String content = "Hello, this is a sample text!";

        writeFile(fileName, content);
        readFile(fileName);
    }

    public static void writeFile(String fileName, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.err.println("Error writing file: " + e.getMessage());
        }
    }

    public static void readFile(String file
