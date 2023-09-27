import exceptions.ParametosInvalidosException;

public class Contar {

    static void contar(int parametroUm, int parametroDois) throws ParametosInvalidosException{
        
        if(parametroUm > parametroDois){
            throw new ParametosInvalidosException();
        }else{
            int contagem = parametroDois - parametroUm;
            for(int i = 0; i < contagem; i++){
                System.out.println("Iterações: " + (i+1));            
            }    
        }
    }
    
}
