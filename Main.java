import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // Storing objects of different data types
        // [1, 2, "sainath"];
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] input_arr = input.split(" ");
        ArrayList <Object> arr = new ArrayList<>();
        for(var i:input_arr){
            try{
                arr.add(i);
            }catch(Exception err){
                System.out.println("err.getMessage(): "+err.getMessage());
            }
        }
        for(var i:arr){
            System.out.println(i);
        }
   
}
    
}