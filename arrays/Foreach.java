package arrays;

public class Foreach {
    public static void main(String[] args) {
        double[] notas = {9.9, 5.9};
        for (int i =0; i< notas.length; i++){
            System.out.println(notas[i] +  " ");
        }
        System.out.println();
        for(double nota: notas){
            System.err.println(nota +  " ");
        }
    }
    
}
