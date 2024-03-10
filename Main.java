import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] input_arr = input.split(" ");
        ArrayList <Integer> arr = new ArrayList<>();
        for(var i:input_arr){
            try{
                arr.add(Integer.parseInt(i));
            }catch(Exception err){
                System.out.println("err.getMessage(): "+err.getMessage());
            }
        }
       
}
    
}