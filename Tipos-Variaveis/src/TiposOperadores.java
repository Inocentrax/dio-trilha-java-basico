public class TiposOperadores {
    public static void main(String [] args){
    int numero = 5; 
    System.out.println(--numero);//tirou
    System.out.println(++numero);//recolocar
        
    //como transferir um numero de positivo para negativo ?
       int numeros = -5;
       System.out.println(numeros);
       //colocando somente o + não vai funcionar
       numeros = +numeros;
       numeros = numeros * -1;//negativo com negativo é positivo
       System.out.println(numeros);//voltando ao positivo


    boolean variavel = true;
    variavel = !variavel;//inverção
    System.out.println(variavel);//false

    //operador ternario = resumo de condição
    //como se fosse um if, representado por ?:
    //<Expressão condicional> ? <caso condição seja true> : <caso condição seja false>
    int a, b;
    a = 5;
    b = 6;

    /* com if:
    String resultado = "";
    
    if (a==b) //se a for igual a b true senão false
        resultado="verdadeiro";
    else
        resultado="falso";
        System.out.println(resultado);  
    */

    //com ternario 
   // String resultado = a==b ? "verdadeiro" : "falso";
    int resultado = a == b ? 1 : 0; 
    System.out.println(resultado);
    








    }
}
