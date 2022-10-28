package lab3p1_diegomartinez;

import java.util.Scanner;

public class Lab3P1_DiegoMartinez {
    
    public static void main(String[] args) {
        Scanner read=new Scanner(System.in);
        int opcion;
        do{
           System.out.println("Menu");
           System.out.println("1 -> Diptongo");
           System.out.println("2 -> Sumatoria Pi");
           System.out.println("3 -> Time Clock");
           System.out.println("4 -> Salida");
        opcion=read.nextInt(); 
           switch (opcion){
            
               case 1:
                 String palabra;
                 System.out.println("1 -> Diptongo");
                 System.out.println("Ingrese su palabra:");
                 palabra = read.next();
                 int c1=0;
                 for(int i=0;i<palabra.length();i++){
                     char letra=palabra.charAt(i);
                     switch(letra){
                         case 'a':
                         case 'e':
                         case 'i':
                         case 'o':
                         case 'u': 
                            c1++;
                         break;
                         
                         default:
                             c1=0;
                     }
                     if (c1==2){
                         break;
                     }
                 }
                 if (c1==2){
                         System.out.println("Si es diptongo");
                     }
                     else{
                         System.out.println("No es diptongo");
                     }
               break;
               case 2:
                   double n,pi;
                   pi=0;
                   System.out.println("2 -> Sumatoria Pi");
                   System.out.println("Ingrese el numero limite: ");
                   n=read.nextDouble();
                   for (double c2=0;c2<n;c2++){
                       pi+=(Math.pow(-1, c2))/(2*c2+1);
                   }
                   pi*=4;
                   System.out.println("Resultado: "+pi);
                    break;
                   
               case 3:
                   int n3;
                   System.out.println("3 -> Time Clock");
                   System.out.println("Ingrese un numero para el tamano del reloj");
                   n3=read.nextInt();
                   while (n3%2==0){
                       System.out.println("Numero no valido, tiene que ser impar");
                       n3=read.nextInt();
                   }
                   int s=1;
                   System.out.println("");
                   for(int j=1;j<=n3-1;j++){
                       for(int i=1;i<=s;i++){
                           System.out.print(" ");  
                       }
                       s++;
                       for(int a=1;a<=2*(n3-j)-1;a++){
                           System.out.print("*");
                       }
                       System.out.println("");
                   }
                   s=n3-1;
                   for(int j=1;j<=n3;j++){
                       for(int i=1;i<=s;i++){
                           System.out.print(" ");  
                       }
                       s--;
                       for(int a=1;a<=2*j-1;a++){
                           System.out.print("*");
                       }
                       System.out.println("");
                   }
               break;
           } 
        }
        while(opcion!=4);
    }
    
}
