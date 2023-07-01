package Bizhan_ex;

import java.io.*;
import java.util.Scanner;

class Teacher extends Users{
    Scanner scanner1 = new Scanner(System.in);
    private String subject;
    private String group;

    public Teacher(String username, String password, String subject, String group) {
        super(username, password);
        this.subject = subject;
        this.group = group;
    }
    public void saveToFile(String file, String text, boolean append){
        try{
            File f = new File(file);
            FileWriter fw = new FileWriter(f,append);
            PrintWriter pw = new PrintWriter(fw);
            pw.println(text);
            pw.close();
        } catch (IOException e){
            System.out.println("Error, SaveToFiles");
        }
    }
    public void createTest() throws FileNotFoundException {
        //CREATING A FILE
        File answers = new File("Answers.txt");
        File myObj = new File("Test.txt");
        System.out.println("Set a question, give 1 right answer and give 2 incorrect options to select from. " +
                "The computer will randomly make a test with options for you. \nType /done/ when you want to finish");
        boolean loop=true;
        try {
            FileWriter fw = new FileWriter(myObj,false);//TO ERASE ALL DATA FROM PREVIOUS TESTS
            FileWriter fw2 = new FileWriter(answers,false);//TO ERASE ALL DATA FROM PREVIOUS TESTS
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        while (loop) {
            System.out.println("Set a question: ");
            String question = scanner1.nextLine();
            if(question.equals("done")){
                loop=false;
            }else{
            saveToFile("Test.txt", "Question: "+question, true);
            System.out.println("Give the right answer: ");
            String correctAnswer= scanner1.nextLine();
            saveToFile("Answers.txt", correctAnswer, true);//Saves correct options to Answers.txt
            System.out.println("Give the wrong option: ");
            String option1= scanner1.nextLine();
            System.out.println("Give the wrong option: ");
            String option2= scanner1.nextLine();
            int min = 1; // Minimum value of range
            int max = 6; // Maximum value of range
            int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
            switch(random_int){///////////////////////randomly place the answers options
                case 1:
                    saveToFile("Test.txt", correctAnswer, true);
                    saveToFile("Test.txt", option1, true);
                    saveToFile("Test.txt", option2, true);
                    break;
                case 2:
                    saveToFile("Test.txt", option1, true);
                    saveToFile("Test.txt", correctAnswer, true);
                    saveToFile("Test.txt", option2, true);
                    break;
                case 3:
                    saveToFile("Test.txt", correctAnswer, true);
                    saveToFile("Test.txt", option2, true);
                    saveToFile("Test.txt", option1, true);
                    break;
                case 4:
                    saveToFile("Test.txt", option2, true);
                    saveToFile("Test.txt", correctAnswer, true);
                    saveToFile("Test.txt", option1, true);
                    break;
                case 5:
                    saveToFile("Test.txt", option1, true);
                    saveToFile("Test.txt", option2, true);
                    saveToFile("Test.txt", correctAnswer, true);
                    break;
                case 6:
                    saveToFile("Test.txt", option2, true);
                    saveToFile("Test.txt", option1, true);
                    saveToFile("Test.txt", correctAnswer, true);
                    break;
                }
            }
        }
    }
}
