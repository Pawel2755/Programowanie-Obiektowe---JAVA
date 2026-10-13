import java.util.Scanner;

public class Main {
//ZADANIE 2

    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj liczbę n: ");
        int n = scanner.nextInt();
        int suma=0;
        int liczba =0;

        if (n%2==0){
            System.out.println("Liczba jest parzysta");
        }else{
            System.out.println("Liczba nie jest parzysta");
        }
        if(n%3==0){
            System.out.println("Liczba jest podzielna przez 3");
        }else {
            System.out.println("Liczba nie jest podzielna przez 3");
        }
        for(int i =1;i<=n;i++){
             suma += i;
        }
        System.out.printf("Suma: %d %n",suma);
        for(int i =1;i<=n;i++){
            if(i%2==0){
                liczba++;
            }
        }
        System.out.printf("Liczb parzystych: %d",liczba);


        scanner.close();
    }*/

//ZADANIE 3

    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] liczby = new int[10];

        System.out.print("Podaj 10 liczb całkowitych: ");
        for (int i=0;i<10;i++) {
            liczby[i] = scanner.nextInt();
        }
        int max = liczby[0];
        int min = liczby[0];
        int suma =0;
        for(int i=0;i<10;i++){
            if (liczby[i]>max){
                max = liczby[i];
            }
        }
        System.out.printf("Największa wartość: %d %n",max);

        for(int i=0;i<10;i++){
            if (liczby[i]<min){
                min = liczby[i];
            }
        }
        System.out.printf("Najmniejsza wartość: %d %n",min);

        for(int i=0;i<10;i++){
            suma +=liczby[i];
        }
        System.out.printf("Suma wszystkich elementów: %d %n",suma);

        double srednia =  (double) suma / 10;


        System.out.printf("Średnia arytmetyczna: %.2f %n" ,srednia);

        int wiekszeodsredniej=0;
        for(int i=0;i<10;i++){
            if(liczby[i]>srednia){
                wiekszeodsredniej++;
            }
        }

        System.out.printf("Liczba wartości większych od średniej: %d %n",wiekszeodsredniej);

        scanner.close();
    }*/

//ZADANIE 4

    /*public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //brakowało średnika ,błąd wykryty przez kompilator

        System.out.print("Podaj liczbę: ");
        int liczba = scanner.nextInt();

        if (liczba % 2 == 0) {  //wartość zmienniej liczba była przypisywana zamiast porównania, błąd wykryty przez kompilator
            System.out.println("Liczba jest parzysta");
        }
        else {
            System.out.println("Liczba jest nieparzysta"); //brakowało średnika, błąd wykryty przez kompilator
        }

        for (int i = 0; i <= 5; i++) {   //zamiast inkrementacji była dekrementacja (nieskończona pętla), błąd ujawni się dopiero po zużyciu zasobów poprzez zawieszenie się programu
            System.out.println(i);
        }

        scanner.close();
    }*/




}