import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        int num=0; 
        Scanner leitor = new Scanner(System.in);
        
        do {
            System.out.println("Digite um número inteiro:");
            num = leitor.nextInt();

            if (num < 0){
                System.out.println("Valor inválido, tente novamente:");
            }
        }while(num < 0);

        if (num == 0){
            System.out.println("Fatorial de 0! = 1");
        }else{
            int resultFatorial = 1;       
            for(int i = num; i > 0; i--){
                resultFatorial = resultFatorial * i;
            }   
            System.out.println(String.format("Fatorial de %d! = %d", num, resultFatorial));
        }      
        leitor.close();
    }
}