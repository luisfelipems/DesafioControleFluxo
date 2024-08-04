import java.util.Scanner;

public class Contador{

    public static void main(String[] args) {
        
        Scanner terminal = new Scanner(System.in);

		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();

		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
        
        System.out.println("Os números digitados são: " + parametroUm +" e "+ parametroDois);

        try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
            //e.printStackTrace(); Retorno da exception sobre o erro que ocorreu.

            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}      
    }

    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção		
        if(parametroUm>parametroDois){
            throw new ParametrosInvalidosException();
        }
        
        else{            
            //realizar o for para imprimir os números com base na variável contagem
            int contador = (parametroUm - parametroDois) * -1;

            for( int i = 0; i <= contador; i++){
                System.out.println("Imprimindo o número: " + i);
            }
        }
	}
}