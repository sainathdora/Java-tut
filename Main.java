import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine();
        HashMap<String, String>inputinfo = new HashMap<>();

        while (t-- > 0) {
            int n = scanner.nextInt();
            scanner.nextLine();
            String s = scanner.nextLine();
            // Your code goes here
            if((inputinfo.get(n+"")==null)){
                inputinfo.put(n+"", s); 
            }else{
                String new_n = n+"";
                String new_t =t+"";
                String newkey = new_n + new_t;
               
                inputinfo.put(newkey, s);
            }
        }
        
        for(String i:inputinfo.keySet()){
            String val = inputinfo.get(i);
            System.out.println(EncodedOutput(val));
        }
        // System.out.println("Encoded o/p(10): "+ EncodedOutput(10+""));
    }
    public static String EncodedOutput(String value){
       
        int times = value.length()/2;
        String Final = "";
        for(int i = 0; i<times; i++){
            int start = i*2;
            int end = start+2;
            String sub = value.substring(start, end);
            String encoded = enchodetwoString(sub);
            Final += encoded;
        }
        return Final;
    }
    public static String enchodetwoString(String s){
        switch (s) {
            case "00":
                return "A";
            case "01":
                return "T";
            case "10":
                return "C";
            case "11":
                return "G";
            default:
                return " ";
        }
        

    }
    
}
