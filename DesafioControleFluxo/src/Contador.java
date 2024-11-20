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
                System.out.println("Errata: "+ e.getMessage());
            }
            
        }
             
        }
        static void contar (int parametroUm, int parametroDois) throws ParametroInvalidoException {
    
            int contagem = parametroDois - parametroUm;
            
            if (parametroUm>parametroDois) { 
                throw new ParametroInvalidoException();
                
            }
            for(contagem=parametroUm; contagem<=parametroDois; contagem++) {
                System.out.println("Imprimindo o numero "+ contagem);
                
            }

    } 
    
}
