public class OperadoresRelacionais {
    public static void main(String[] args) {
        /*
         == se duas variaveis são iguais
         != se uma variavel é diferente da outra
         >  se uma é maior que a outra
         >= maior ou igual a outra
         <  menor que a outra
         <= menor ou igual a outra 
         */

        String nomeUm = "Robert";
        String nomeDois = new String ("Robert");
        System.out.println(nomeUm.equals(nomeDois));
        //equals compara conteudos, bom para comparação de objetos

        //para operadores podemos usar 
        int num1 = 1;
        int num2 = 2;

        boolean igual= num1 == num2;
        boolean diferente =  num1 != num2;
        boolean maiorQ =  num1 >= num2;

        System.out.println("Numero 1 é igual ao Numero 2?"+igual);
        System.out.println("Numero 1 é diferente de Numero 2?"+diferente);
        System.out.println("Numero 1 é maior ou igual ao Numero 2? "+maiorQ);


        
    }
}
