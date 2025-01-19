package Practice_problem02;

public class print_series {
    public static void main(String [] args) {
        for(int i=2;i<22;i+=2) {
          System.out.print(i+" ");
        }
        System.out.println();
        int i=2;
        while(i<22) {
            System.out.print(i+" ");
            i+=2;
        }
        System.out.println();
        i=2;
        do{
            System.out.print(i+" ");
            i+=2;
        } while(i<22);
        System.out.println();

        for(int j=1;j<21;j+=2) {
            System.out.print(j+" ");
          }
          System.out.println();
          int j=1;
          while(j<21) {
              System.out.print(j+" ");
              j+=2;
          }
          System.out.println();
          j=1;
          do{
              System.out.print(j+" ");
              j+=2;
          } while(j<21);
          System.out.println();
    }
}
