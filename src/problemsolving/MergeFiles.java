package problemsolving;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class MergeFiles {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		mergeFiles();
	}
	

    private static void mergeFiles() throws IOException{

        FileInputStream input1 = null;
        FileInputStream input2 = null;
        Scanner sc1 = null;
        Scanner sc2 = null;
        String home = System.getProperty("user.home");
        String path1 = home + "/Desktop/input1.txt";
        String path2 = home + "/Desktop/input2.txt";

        LinkedList<String> mergeResult = new LinkedList<>();

        input1 = new FileInputStream(path1);
        sc1 = new Scanner(input1);
        input2 = new FileInputStream(path2);
        sc2 = new Scanner(input2);
        String line1 = null;
        String line2 = null;

        while(sc1.hasNext()) {
            line1 = sc1.nextLine();
            if (sc2.hasNext()) {
               line2 = sc2.nextLine();
            }
            if (line1.compareTo(line2) < 0) {
                String line3 = null;
                if (sc1.hasNext()) {
                    line3 = sc1.nextLine();
                    if (line3.compareTo(line2) < 0) {
                        mergeResult.add(line1);
                        mergeResult.add(line3);
                        mergeResult.add(line2);
                    } else {
                        mergeResult.add(line1);
                        mergeResult.add(line2);
                        mergeResult.add(line3);
                    }
                } else {
                    mergeResult.add(line2);
                }
            } else {
                String line4 = null;
                if (sc2.hasNext()) {
                    line4 = sc2.nextLine();
                    if (line4.compareTo(line1) < 0) {
                        mergeResult.add(line2);
                        mergeResult.add(line4);
                        mergeResult.add(line1);
                    } else {
                        mergeResult.add(line2);
                        mergeResult.add(line1);
                        mergeResult.add(line4);
                    }
                } else {
                    mergeResult.add(line1);
                }
            }
        }
        System.out.println(mergeResult.toString());

    }


}
