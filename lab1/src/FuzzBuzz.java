public class FuzzBuzz {

    public FuzzBuzz(){

        for (int i = 0; i < 500; i++) {
            if (i % 5 == 0) {
                System.out.println("fuzz");
            }
            if (i % 7 == 0) {
                System.out.println("buzz");
            }
            if(i % 5 == 0 && i % 7 == 0){
                System.out.println("fuzzbuzz");
            }
        }
    }
}
