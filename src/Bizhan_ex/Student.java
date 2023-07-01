package Bizhan_ex;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

class Student extends Users {
    private double gpa;
    private String nickName;

    public Student(String username, String password, double gpa, String nickName) {
        super(username, password);
        this.gpa = gpa;
        this.nickName = nickName;
    }

    public long countLines(String fileName) {
        Path path = Paths.get(fileName);

        long lines = 0;
        try {
            lines = Files.lines(path).count();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }

    public void attemptTest() {
        //To solve a test create another file with the right answers and then compare them!!!!!!
        File test = new File("Test.txt");
        File answers = new File("Answers.txt");
        //READ A FILE TEST
        String line;
        int i = 0;
        while (i < countLines("Test.txt")) {
            try (BufferedReader br = new BufferedReader(new FileReader("Test.txt"))) {
                br.readLine();
                line = br.readLine();
                System.out.println(line);
                i++;
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
/*try {
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }//*/