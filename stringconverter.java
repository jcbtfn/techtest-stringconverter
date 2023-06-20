import java.util.ArrayList;

public static void stringconverter(String stringkey) {

    ArrayList<Integer> stringkeyconversion = new ArrayList<Integer>();
    
    for (int i = 0; i < stringkey.length(); i++) {
        if (stringkey.charAt(i) == 0) {
            System.out.println("Encontré un 0");
        }
    }

} 

public static void main(String args[]) {  
        System.out.println("Hello World");
        stringconverter("AB0>Z0");  
}  