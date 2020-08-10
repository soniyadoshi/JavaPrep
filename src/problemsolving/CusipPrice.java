package problemsolving;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CusipPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            Map<String, String> cusipMap = getCusipClosingPrice();
            System.out.println(cusipMap.toString());
        }catch (Exception e) {
            System.out.println("Exception occured while reading file");
        }

	}
	
    private static Map<String, String> getCusipClosingPrice() throws IOException{

        FileInputStream inputStream = null;
        Scanner sc = null;
        String home = System.getProperty("user.home");
        String path = home+"/Desktop/CUSIP.txt";
        Map<String, String> cusipPriceMap = new HashMap<>();

        try {
            inputStream = new FileInputStream(path);
            sc = new Scanner(inputStream);
            String key = null;
            int cusipCount = -1;
            String lastPrice = null;
            while(sc.hasNextLine()) {
                String line = sc.nextLine();
                if (isCusip(line)) {
                    cusipCount++;
                    if (cusipCount != 0) {
                        cusipPriceMap.put(key, lastPrice);
                    }
                    key = line;
                } else {
                    lastPrice = line;
                }
            }
            cusipPriceMap.put(key, lastPrice);
        } finally {
            if (inputStream != null) {
                inputStream.close();
            } if (sc !=null) {
                sc.close();
            }
        }
       return cusipPriceMap;
    }
    private static boolean isCusip(String line) {
        boolean flg = false;
        if (line.matches("[a-zA-Z0-9]+") && line.length() == 8) {
            flg = true;
        }
        return flg;
    }
}

