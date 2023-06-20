import java.util.ArrayList;
import java.util.Arrays;

class StringConverter {

    public static Integer patternValue(ArrayList<Integer> keypattern) {
        if (keypattern.isEmpty()){
            return 0;
        }
        return 1;
    }

    public static Integer patternValue(Integer i) {

        ArrayList<Integer> keypattern = new ArrayList<>(Arrays.asList(7, 3, 1));
        return keypattern.get[(i % keypattern.size())];

    }

    public static void stringconverter(String stringkey) {

        ArrayList<Integer> stringkeyconversion = new ArrayList<Integer>();
        ArrayList<Integer> keypattern = new ArrayList<>(Arrays.asList(7, 3, 1));
        Integer sumOfValues = 0;
        
        
        for (int i = 0; i < stringkey.length(); i++) {

            System.out.println(keypattern.toString());
            System.out.println("Al valor " + i + " le sumo " + keypattern.get((i % keypattern.size())));

            if (stringkey.charAt(i) == '>') {
                stringkeyconversion.add(0);

            } else if (Character.getNumericValue(stringkey.charAt(i)) == -1) {
                System.out.println("ERROR: INVALID KEY.");
                return;

            } else {
                stringkeyconversion.add(Character.getNumericValue(stringkey.charAt(i)));
            }


            System.out.println("Va quedando así: " + stringkeyconversion.toString());

        }

    } 

    public static void main(String[] args) {  
            System.out.println("Hello World");
            StringConverter.stringconverter("A1B02>23Z+0A5Ñ");
            StringConverter.stringconverter("A1B02>23ZT0A5N");  
    }  

}

