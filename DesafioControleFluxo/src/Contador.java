import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        try (Scanner terminal = new Scanner(System.in)) {
            System.out.println("Digite o primeiro parâmetro");
            int parametroUm = terminal.nextInt();
            System.out.println("Digite o segundo parâmetro");
            int parametroDois = terminal.nextInt();

            try {
               contar (parametroUm, parametroDois);
                
            } catch (ParametroInvalidoException e) {
            }
        }
        
           
        }
        static void contar (int parametroUm, int parametroDois) throws ParametroInvalidoException {
    
            int contagem = parametroDois - parametroUm;
            
            if (parametroUm>parametroDois) { 
                System.out.println("O segundo parâmetro deve ser maior que o primeiro");
                
            }
            for(contagem=parametroUm; contagem<=parametroDois; contagem++) {
                System.out.println("Imprimindo numero "+ contagem);
            
            }
            
            
    
    } 
    
}
