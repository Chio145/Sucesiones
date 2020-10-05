package RocioAguirre;

import java.util.Scanner;

public class  Series {
Scanner num = new Scanner(System.in);
int N;
 public void Nprimos(){
     System.out.println("Ingresa un número entero positivo: ");
    N= num.nextInt();
     System.out.println("Números primos: ");
    for (int i=1;i<=N;i++){
        int count=0;

        for(int j=1;j<=i;j++){
            if (i%j==0)
                count++;
        }
        if(count==2)
            System.out.print(i + " ");

    }
 }
    public void Fibonnaci(){

        System.out.println("\nSucesión de Fibonacci: ");

        int a = 0, b = 1, c;
        for (int z =0 ;z < N; z++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;

        }
    }
}
