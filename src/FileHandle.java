import java.util.HashMap;
import java.io.File; // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException; // Import the IOException class to handle errors
import java.util.Scanner;

public class FileHandle {
    String fileName;

    public FileHandle(String fileName) {
        this.fileName = fileName;
    }

    public void write(String input) {
        try {
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(input);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void read() {
        int flag = 0;
        HashMap<String, Integer> map = new HashMap<>();
        RightPanel.boxes.clear();
        RightPanel.relationShips.clear();

        try {
            File myObj = new File(fileName);
            int boxNumber = 0;
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if (data.toString().contains("RELATIONSHIP")) {
                    flag = 1;
                    continue;
                }
                if (flag == 0) {
                    String[] splitString = data.split(",", 4);
                    map.put(splitString[0], boxNumber);
                    boxNumber++;
                    int x = Integer.parseInt(splitString[1]);
                    int y = Integer.parseInt(splitString[2]);
                    Box temp = new Box(x, y, splitString[3]);
                    RightPanel.boxes.add(temp);
                } else {
                    System.out.println(data);

                    String[] splitString = data.split(",", 3);
                    String relationType = splitString[0];
                    int i = map.get(splitString[1]);
                    int j = map.get(splitString[2]);
                    // System.out.println(i + " : " + j);
                    if (relationType.contains("Associate")) {
                        RightPanel.rightPanel.createRelations(i, j, 2);
                    } else if (relationType.contains("Inherit")) {
                        RightPanel.rightPanel.createRelations(i, j, 0);
                    } else if (relationType.contains("Comp")) {
                        RightPanel.rightPanel.createRelations(i, j, 1);
                    }
                }

            }
            myReader.close();
            RightPanel.rightPanel.updateRightPanel();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void create() {
        try {
            File myObj = new File(fileName);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
