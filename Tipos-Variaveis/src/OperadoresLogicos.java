public class OperadoresLogicos {
    public static void main(String[] args) {
        
    /*
     && Operador Logico "E"
     || Operador Logico "OU"
     */

    boolean condicao1=true;
    boolean condicao2=false;

    if(condicao1 && condicao2){ //se forem iguais é verdadeiro ou verdade
        System.out.println("As duas condições são verdadeiras");
    }else{
        System.out.println("Não são igualmente verdadeiras, uma é true outra e false");
    }

     if(condicao1 || condicao2){ //se 1 ou 2 for verdadeira dá certo
        System.out.println("Uma das condições é verdadeira");
    }else{
        System.out.println("Falso");
    }

     if(condicao1 && ( 7>4 )){ //se forem iguais é verdadeiro ou verdade
        System.out.println("As duas condições são verdadeiras");
    }else{
        System.out.println("Não são iguais");
    }
}
}
