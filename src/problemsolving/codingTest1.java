package problemsolving;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class codingTest1 {
    public static void main(String[] args) throws IOException {
        String line = findPackage("81 : (1,53.38,$45) (2,88.62,$98) (3,78.48,$81) (4,72.30,$76) (5,30.18,$9) (6,46.34,$48)");
        System.out.println(line);
    }

    private static String findPackage (String line) {
        Integer packLimit = 100;
        String arr[] = line.split(":");
        String lm = arr[0].replaceAll(" ","");
        packLimit = Integer.valueOf(lm);
        String packages[] = arr[1].split(" ");
        List<String> filteredWtPack = new ArrayList<>();
        for(int i=1; i<packages.length; i++) {
            String strPack = packages[i].replace("(", "");
            strPack = strPack.replace(")", "");
            if (filterByWeight(strPack, packLimit)) {
                filteredWtPack.add(strPack);
            }
        }
        String index = filterByCost(filteredWtPack, packLimit);
        if (index.equals("0")) {
            return "-";
        } else {
            return index;
        }
    }

    private static boolean filterByWeight(String strPack, Integer packLimit) {
        String contents[] = strPack.split(",");
        if (Double.valueOf(contents[1]) <= Double.valueOf(packLimit)) {
            return true;
        } else {
            return false;
        }
    }

    private static String filterByCost (List<String> toFilterByCost, Integer packLimit) {
        Integer maxCost = 0;
        Double lessWt = 0.0;
        String ind = null;
        StringBuffer outIndex = new StringBuffer();
        for(String pack : toFilterByCost) {
            String contents[] = pack.split(",");
            Integer cost = Integer.valueOf(contents[2].replace("$",""));
//		      System.out.println(cost);
            Double wt = Double.valueOf(contents[1]);
            if (maxCost < cost) {
                maxCost = cost;
                lessWt = wt;
                ind = contents[0];
//		        System.out.println(maxCost);
            } else if (maxCost == cost && (wt + lessWt ) < packLimit) {
                outIndex.append(contents[0]);
            } else if (maxCost == cost && (wt + lessWt ) > packLimit) {
                if (wt < lessWt) {
                    if (outIndex.length() > 0) {
                        outIndex.append(",");
                    }
                    outIndex.append(contents[0]);
                }
            }
        }
        if (outIndex.length() > 0) {
            outIndex.append(",");
        }
        outIndex.append(ind);
        return outIndex.toString();
    }
}
