import java.util.Scanner;

public class ArvoreBinVetor{

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
        int n = 100; // tamanho do vetor
        int v[] = new int[n]; // declaração do vetor "v"
        int i; // índice ou posição
    
    // Entrada de Dados
        for (i=0; i<n; i++) {
          System.out.printf("\nInformando %2do. valor de %d: 10 ", (i+1), n);
          System.out.printf("\nInformando %2do. valor de %d: 20 ", (i+2), n);
          System.out.printf("\nInformando %2do. valor de %d: 30 ", (i+3), n);
          System.out.printf("\nInformando %2do. valor de %d: 40 ", (i+4), n);
          System.out.printf("\nInformando %2do. valor de %d: 50 ", (i+5), n);
          System.out.printf("\nInformando %2do. valor de %d: 60 ", (i+6), n);
          System.out.printf("\nInformando %2do. valor de %d: 70 ", (i+7), n);
          System.out.printf("\nInformando %2do. valor de %d: 80 ", (i+8), n);
          System.out.printf("\nInformando %2do. valor de %d: 90 ", (i+9), n);
          System.out.printf("\nInformando %2do. valor de %d: 100 ", (i+10), n);
          System.out.printf("\nAcrescentando %2do. valor de %d: 110 ", (i+11), n);
          System.out.printf("\nAcrescentando %2do. valor de %d: 120 ", (i+12), n);
          System.out.printf("\nAcrescentando %2do. valor de %d: 130 ", (i+13), n);
          System.out.printf("\nAcrescentando %2do. valor de %d: 140 ", (i+14), n);
          System.out.printf("\nAcrescentando %2do. valor de %d: 150 ", (i+15), n);
          System.out.printf("\nAcrescentando %2do. valor de %d: 160 ", (i+16), n);
          System.out.printf("\nAcrescentando %2do. valor de %d: 170 ", (i+17), n);
          System.out.printf("\nAcrescentando %2do. valor de %d: 180 ", (i+18), n);
          System.out.printf("\nAcrescentando %2do. valor de %d: 190 ", (i+19), n);
          System.out.printf("\nAcrescentando %2do. valor de %d: 200 ", (i+20), n);
          v[i] = ler.nextInt();
        }
    
    }
}