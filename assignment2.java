public class assignment2 {
    public static void main(String[] args) throws Exception {
        int count = 0;

         while (count !=3){
            System.out.println("MARRION CHINO");
            count ++;
        }
        // do while loop

         int i = 0;
         do {
            System.out.println("BENITEZ");
             i ++;
        } while (i != 4);

        //for loop

        for (int l = 0; l != 5;  l++) {
            System.out.println("MIERR");
        }
        // char array
        
        String[] myFirstName = {"M","A","R","R","I","O","N","C","H","I","N","O"};

        for (int counter = 0; counter < myFirstName.length; counter++) {
            System.out.println(myFirstName[counter]);
        }

        // char array in reverse
        
        String[] myfirstname = {"O","N","I","H","C","N","O","I","R","R","A","M"};

        for (int l = 0; l < myFirstName.length; l++) {
            System.out.println(myfirstname[l]);
}
    }
}