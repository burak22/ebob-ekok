import java.util.Scanner;
public class HelloWorld{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sayı 1: ");
        int x = sc.nextInt();
        System.out.println("Sayı 2: ");
        int y = sc.nextInt();
        int smaller = (x<y)? x:y;
        int ebob = 1;
        int ekok = x*y;
        //EBOB
        int i = smaller;
        while(i >= 1){
            if(x%i == 0 && y%i == 0){
                ebob = i;
                break;
            }
            i--;
        }
        //Ekok
        int j = 1;
        while(j<=x*y){
            if(j%x == 0 && j%y==0){
                ekok = j;
                break;
            }
            j++;
        }
        //EKOK ayrıca (x*y)/EBOB olduğundan ebobu bulduktan sonra da whilea gerek kalmadan EKOK bulunabilir.

        System.out.printf("EBOB(%d,%d) = %d",x,y,ebob);
        System.out.printf("\nEKOK(%d,%d) = %d",x,y,ekok);
        sc.close();

    }            
}