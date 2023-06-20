import java.util.ArrayList;
import java.util.Arrays;

class StringConverter {

    public static Integer stringconverter(String stringkey) {

        ArrayList<Integer> keypattern = new ArrayList<>(Arrays.asList(7, 3, 1));
        Integer summationOfValues = 0;
        
        for (int i = 0; i < stringkey.length(); i++) {

            if (!keypattern.isEmpty()){
                summationOfValues = summationOfValues + keypattern.get((i % keypattern.size()));
            }

            if (stringkey.charAt(i) == '>') {
                continue;

            } else if (Character.getNumericValue(stringkey.charAt(i)) == -1) {
                System.out.println("ERROR: INVALID KEY.");
                return -1;

            } else {
                summationOfValues = summationOfValues + Character.getNumericValue(stringkey.charAt(i));
            }

        }

        return (summationOfValues % 10);

    } 

    public static void main(String[] args) {  
            System.out.println(StringConverter.stringconverter("A1B02>23Z+0A5Ñ"));
            System.out.println(StringConverter.stringconverter("A1B02>23ZT0A5N"));  
    }  

}

