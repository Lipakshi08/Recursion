//  Reverse of a string 

public class Reverse{
    public static void printReverse(String str, int idx){
        if(idx == 0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        printReverse(str, idx-1);
    }
    public static void main(String[] args){
        String str = "PROGRAMMING";
        printReverse(str, str.length()-1);
    }
}