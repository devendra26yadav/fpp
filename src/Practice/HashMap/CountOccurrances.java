package Practice.HashMap;

import java.util.HashMap;
import java.util.Map;

public class CountOccurrances {
    public static void main(String[] args) {
        String input ="5, 3.14, 7, 5, 3.14, 2, 7.0, 8.5 hello world 100, 2, 5.0";
        String[] tokens = input.split("[,;|\\s]+");
        Map<Integer,Integer> integerMap = new HashMap<>();
        Map<Double,Integer> doubleMap = new HashMap<>();
        double floatSum =0;
        int intSum =0;
        for(String data:tokens){
           try{
               if(data.contains(".")){
                   double val = Double.parseDouble(data);
                   doubleMap.put(val,doubleMap.getOrDefault(val,0)+1);
               }else{
                   int ival = Integer.parseInt(data);
                   integerMap.put(ival,integerMap.getOrDefault(ival,0)+1);
               }
           }catch (NumberFormatException e){

           }
        }

        System.out.println("Integer values ");
        for (var isets:integerMap.entrySet()){
            System.out.println(isets.getKey()+" : "+isets.getValue());
            intSum+=isets.getKey();
        }
        System.out.println("Floating point number ");
        for (var fsets:doubleMap.entrySet()){
            System.out.println(fsets.getKey()+" : "+fsets.getValue());
            floatSum+=fsets.getKey();
        }

        System.out.println("Unique Integer Sum : "+intSum);
        System.out.println("Unique Float Sum : "+floatSum);

    }
}
