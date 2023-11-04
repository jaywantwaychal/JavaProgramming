package programming;

public class CountingValleys {


    public static void main(String[] args) {
        int counter = 0;
        int valleys = 0;
        String path = "UUUDUDDDDDUU";
        char[] chars=    path.toCharArray();
        for(int i =0;i < path.length(); i++) {
            if( chars[i] == 'U') {
                counter++;
                if(counter == 0 )
                    valleys++;
            }else {
                counter--;
            }

        }
        System.out.println(valleys);
    }
}
