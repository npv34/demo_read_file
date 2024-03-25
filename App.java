import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        boolean isExist = false;
        while (!isExist) {
            System.out.println("0: exists");
            System.out.println("1: Add Student");
            System.out.println("2: Show list student");
            String key = scanner.nextLine();

            switch (key) {
                case "1":
                    System.out.println("Nhap ten hoc vien");
                    String name = scanner.nextLine();
                    saveData(name);
                    break;
                case "2":
                    showListStudent();
                    break;
                case "0":
                    isExist = true;

            }

        }


        // Thao tac file
        /*
            * doc - ghi
            b1: tao object file
            b2: ghi noi dung vao file
                - noi dung lay tu ban phim
            b3: ghi noi dung vao file
               - ghi de noi dung
               - ghi tiep noi dung
            b4: xu ly noi dung da doc tu file

            * Xoa file
         */
    }

    public static void saveData(String name) throws FileNotFoundException {
        File myFile = new File("src/data.txt");
        if (!myFile.exists()) {
            System.out.println("File does not exist");
        } else {
            System.out.println("File exists");
        }

        Scanner myScanner = new Scanner(myFile);
        StringBuilder data = new StringBuilder();
        while (myScanner.hasNext()) {
            data.append(myScanner.nextLine());
            data.append("\n");
        }

        PrintWriter printWriter = new PrintWriter(myFile);
        printWriter.append(data.toString());
        printWriter.append(name);
        printWriter.close();
    }

    public static void  showListStudent() throws IOException {
        File myFile = new File("src/data.txt");
        if (!myFile.exists()) {
            System.out.println("File does not exist");
        } else {
            System.out.println("File exists");
        }

        Scanner myScanner = new Scanner(myFile);
        while (myScanner.hasNextLine()) {
            System.out.println(myScanner.nextLine());
        }
        myScanner.close();
    }
}
