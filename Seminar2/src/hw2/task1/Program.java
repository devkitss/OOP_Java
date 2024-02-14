package hw2.task1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        String QUERY = "select * from students where ";
        String PARAMS = "{\"name\":\"Ivanov\", \"country\":\"Russia\", \"city\":\"Moscow\", \"age\":\"null\"}";
        String[] prm = PARAMS.split(",");
        StringBuilder changePrm = new StringBuilder();
        for (String str : prm){
            if (!str.contains("null")) changePrm.append(str);
        }
        PARAMS = changePrm.toString();
        String[] res = PARAMS.replace("{", "").replace("}", "").split(" ");
        StringBuilder result = new StringBuilder(QUERY);
        for (int i = 0; i < res.length; i++){
            String[] tmp = res[i].split(":");
            res[i] = String.join("=", tmp[0].replaceAll("\"", ""), tmp[1].replaceAll("\"", "'"));
            if (i != res.length - 1){
                result.append(res[i].concat(" and "));
            }else result.append(res[i]);
        }
        System.out.println(result);
    }
}