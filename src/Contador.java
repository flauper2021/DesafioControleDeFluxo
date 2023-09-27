import java.util.Scanner;
import exceptions.ParametosInvalidosException;

public class Contador extends Contar {
    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);
        int parametroUm;
        int parametroDois;
        

        System.out.println("Digite um numero: ");
        parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo numero: ");
        parametroDois = terminal.nextInt();

        try{
            Contar.contar(parametroUm,  parametroDois);
                    
        }
        catch(ParametosInvalidosException exception){
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }
    }
}
