package arrays;
import java.util.Arrays;
public class Exercicio {
    public static void main(String[] args) {
        double [] NotasAlunoA = new double[3];
        NotasAlunoA[0] = 9;
        NotasAlunoA[1] = 8;
        NotasAlunoA[2] = 10;
        
        System.out.println(Arrays.toString(NotasAlunoA)); 
        double total = 0;
        for (int i = 0; i < NotasAlunoA.length; i++) {
            total += NotasAlunoA[i];
            
        }
        double media_A = total / NotasAlunoA.length;
        System.out.println(media_A);
        if ( media_A >= 7){
            System.out.println("PARABÉNS VOCÊ PASSOU!!!!!");
        }else
            System.out.println("REPROVADO!!!!!!");

        double[] NotasAlunoB = {6, 9, 7};
        double total_B = 0;
            for (int i = 0; i < NotasAlunoB.length; i++) {
                total_B += NotasAlunoB[i];
                
            }
         double media_B = total_B / NotasAlunoA.length;
        System.out.println(media_B);

        if ( media_B >= 7){
            System.out.println("PARABÉNS VOCÊ PASSOU!!!!!");
        }else
            System.out.println("REPROVADO!!!!!!");


    }   
    
}
