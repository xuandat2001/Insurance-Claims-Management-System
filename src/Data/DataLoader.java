package Data;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 * @author <Ung Xuan Dat - s3932156>
 */
public class DataLoader {
    private String fileName;

    public DataLoader(String fileName) {
        this.fileName = fileName;
    }

    public List<String[]> readDataFromFile() {
        List<String[]> dataList = new ArrayList<>();
        try {
            // Create a File object for the input file
            File file = new File(fileName);

            // Check if the file exists
            if (!file.exists()) {
                System.out.println("File not found.");
            }
            Scanner fileScanner = new Scanner(file);
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().trim(); // Trim the line to remove whitespace
                if (!line.isEmpty()) {
                    String[] parts = line.split(",", 2); // split the line into two strings by the comma and assign them into a String Array
                    dataList.add(parts); //add the String Array into List
                }
            }
            fileScanner.close();

        } catch (IOException e) {
            // Handle IO exception
            e.printStackTrace();
        } catch (Exception e) {
            // Handle other exceptions
            e.printStackTrace();
        }
        return dataList;
    }
}

