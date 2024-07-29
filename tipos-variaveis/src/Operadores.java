public class Operadores {
    public static void main(String[] args) {        
        
        
        //String nomeCompleto = "LINGUAGEM" + "JAVA";

        //System.out.println(nomeCompleto);


        String concatenacao ="?";

        concatenacao = 1+1+1+"1";

        System.out.println (concatenacao);

        concatenacao = 1+"1"+1+1;

        System.out.println (concatenacao);

        concatenacao = 1+"1"+1+"1";

        System.out.println (concatenacao);

        concatenacao = "1"+1+1+1;

        System.out.println (concatenacao);

        concatenacao = "1"+(1+1+1);
        
        System.out.println (concatenacao);
    



        int numero = 5;

        numero = -numero;

        System.out.println(- numero);

        System.out.println(numero);

        

        numero = + numero;

        System.out.println(+ numero);

        System.out.println(numero);


       
        numero = numero *-1;

        System.out.println(numero);



       /* x repeticao */

       numero = numero +2;

       System.out.println(numero);

       //System.out.println( ++ numero);

       System.out.println( -- numero);

       
       
       /* boolean */

        boolean variavel = true;

        System.out.println(variavel);

        variavel = !variavel;

        System.out.println(variavel);


        /* Ternario

        Exemplo de condicional utilizando uma estrutura if/else  */

    int a,b;

    a = 6;
    b = 6;

    /* String resultado = "";

    if(a==b)
        resultado = "verdadeiro";

    else
        resultado = "falso";

    System.out.println(resultado); */

String resultado = a==b ? "verdadeiro" : "falso";

System.out.println(resultado);



/*Operadores Logicos */

boolean condicao1 = true;

boolean condicao2 = false;

if (condicao1 && (7>4)){
    System.out.println("As duas condições são verdadeiras");
}

if (condicao1 || condicao2){
    System.out.println("Uma das condições é verdadeira");
}

    System.out.println("fim");


/* operadores relacionais */

/*String nomeUm = "Gleison";
String nomeDois = "Gleison";

        System.out.println(nomeUm == nomeDois);*/


String nomeUm = "Gleison";
String nomeDois = new String ("Gleison");

        System.out.println(nomeUm. equals (nomeDois));



int numero1 = 1;
int numero2 = 2;

boolean simNao = numero1 == numero2;

if (numero1 < numero2){
            System.out.println("a nossa condicao é verdadeira");
}

            System.out.println("Numero1 é igual a numero2 ?" + simNao);


        simNao = numero1 != numero2;

            System.out.println("Numero1 é diferente a numero2 ?" + simNao);


        simNao = numero1 > numero2;

            System.out.println("Numero1 é maior que numero2 ?" + simNao);





    /*if (numero1>numero 2)

        System.out.println("Numero 1 maior que numero 2");

   
    if (numero1 < numero2)

        System.out.println("Numero 1 menoe que numero 2"); */



    
 
    }
    
}
