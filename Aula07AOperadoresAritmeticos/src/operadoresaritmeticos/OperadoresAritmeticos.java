/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author Usuario
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1 + n2) / 2; // ESSE PRIMEIRO " + " É O OPERADOR DE ADIÇÃO
        System.out.println("A média é igual a " + m); // ESSE SEGUNDO " + " DE
        // CONCATENAÇÃO, JA QUE SE TRATA DE STRINGS
        System.out.printf("A média entre %d e %d é = %.2f \n", n1, n2, m);*/
        
        /* OPERADORES UNÁRIOS
        ++ INCREMENTO A++ A = A + 1, OS ++ INCREMENTAM APENAS 1 UNIDADE
        -- DECREMENTO A-- A = A - 1, OS -- DECREMENTAM APENAS 1 UNIDADE
        */
        /* PÓS INCREMENTO
        int numero = 5;
        numero++;
        System.out.println(numero);*/
        
        // PÓS INCREMENTO
        /*int numero = 5;
        int valor = 5 + numero++; /* O ++ QUANDO ELE VEM DEPOIS DO NÚMERO, 
        SIGNIFICA O SEGUINTE: UTILIZE O NÚMERO, OU SEJA, 5(NUMERO) + 5(VALOR)
        E DEPOIS DE FAZER A SOMA, SOMA + 1 NO NUMERO, O RESULTADO FINAL É 10.
        RESUMINDO: O ++ DEPOIS FUNCIONA ASSIM, FAZ-SE TODAS AS OPERAÇÕES 
        SOLICITADAS, E NO FINAL SOMA +1 AO 5(NUMERO), QUE PASSA A SER 6(NUMERO)
        System.out.println(valor); RESULTADO É 10
        System.out.println(numero); RESULTADO É 6*/
        
        // PRÉ INCREMENTO
        /*int numero = 5;
        int valor = 5 + ++numero; /* O ++ QUANDO ELE VEM ANTES DO NUMERO 
        SIGNIFICA O SEGUINTE: UTILIZE O NUMERO, OU SEJA, 5(VALOR) E SOME 
        COM O 5(NUMERO) JÁ PRÉ INCREMENTADO DE 1 UNIDADE, OU SEJA + 1. SENDO
        ASSIM 0 5(NUMERO) JÁ ESTÁ VALENDO 6(NUMERo), O RESULTADO FINAL É 11
        System.out.println(valor);*/
        
        // PÓS DECREMENTO 
        /*int numero = 10;
        int valor = 4 + numero--; // MESMO RECIOCÍNIO DO PÓS INCREMENTO, SO QUE
        // AGORA PÓS DECREMENTANDO
        System.out.println(valor);
        System.out.println(numero);*/
        
        // PRÉ DECREMENTO 
        /*int numero = 10;
        int valor = 4 + --numero; // MESMO RECIOCÍNIO DO PRÉ INCREMENTO, SO QUE
        // AGORA PRÉ DECREMENTANDO
        System.out.println(valor);
        System.out.println(numero);*/
        
        
        /*OPERADORES DE ATRIBUIÇÃO
        += | SOMAR E ATRIBUIR       | A += B | A = A + B
        -= | SUBTRAIR E ATRIBUIR    | A -= B | A = A - B
        *= | MULTIPLICAR E ATRIBUIR | A *= B | A = A * B
        /= | DIVIDIR E ATRIBUIR     | A /= B | A = A / B
        %= | RESTO E ATRIBUIR       | A %= B A = |A % B
        */
        
        /* EXEMPLOS
        int som = 4;
        som += 2; // som = som + 2
        System.out.println(som);
        
        int sub = 4;
        sub -= 2; // sub = sub - 2
        System.out.println(sub);
        
        int mul = 4;
        mul *= 2; // mul = mul * 2
        System.out.println(mul);
        
        int div = 4;
        div /= 2; // div = div / 2
        System.out.println(div);
        
        int res = 4;
        res %= 2; // res = res % 2
        System.out.println(res);*/
        
        
        /* CLASSE MATH
        PI   | CONSTANTE π   | MATH.PI       | 3.1415...
        POW  | EXPONENCIAÇÃO | MATH.POW(5,2) | 25
        SQRT | RAIZ QUADRADA | MATH.SQRT(25) | 5
        CBRT | RAIZ CÚBICA   | MATH.CBRT(27) | 3
        */
        
        
        /* ARREDONDAMENTOS
        ABS   | VALOR ABSOLUTO            | MATH.ABS(-10)   | 10
        FLOOR | ARREDONDA PARA BAIXO      | MATH.FLOOR(3.9) | 3
        CEIL  | ARRDONDA PARA CIMA        | MATH.CEIL(4.2   | 5
        ROUND | ARREDONDA ARITMETICAMENTE | MATH.ROUND(5.6) |
        */
        
        /*
        float valor = 8.9f;
        int arredondarParaBaixo = (int) Math.floor(valor);
        System.out.println(arredondarParaBaixo);*/
        
        /*
        float valor = 8.1f;
        int arredondarParaCima = (int) Math.ceil(valor);
        System.out.println(arredondarParaCima);*/
        
        /*float valor = 8.5f;
        int arredondarAritmeticamente = (int) Math.round(valor);
        System.out.println(arredondarAritmeticamente);*/
        
        /*float valor = 8.4f;
        int arredondarAritmeticamente = (int) Math.round(valor);
        System.out.println(arredondarAritmeticamente);*/
        
        
        /* GERADOR DE NÚMEROS
        MATH.RANDOM() | 0.0 A 1.0
        5 + MATH.RANDOM() | * (10-5) | NÚMEROS DE 5 A 10
        0 + MATH.RANDOM() | * (9-5) | NÚMEROS DE 0 A 9
        2 + MATH.RANDOM() | * (1.000.000-5) | NÚMEROS DE 2 A 1.000.000
        */
        
        /* // GERANDO NÚMEROS ALEATÓRIOS DE 0.0 A 1.0
        double aleatorio = Math.random();
        System.out.println(aleatorio);*/
        
        
        /* // GERANDO NÚMEROS ALEATÓRIOS DE 5 A 10
        double aleatorio = Math.random();
        int numero = 5 + (int) (aleatorio * (10 - 5));
        System.out.println(numero);
        
        // GERANDO NÚMEROS ALEATÓRIOS DE 5 A 10
        double aleatorio = Math.random();
        int numero = (int) (5 + aleatorio * (10 - 5));
        System.out.println(numero);
        */
        
        /* // GERANDO NÚMEROS ALEATÓRIOS DE 15 A 50
        double aleatorio = Math.random();
        int numero = 15 + (int) (aleatorio * (50 - 15));
        System.out.println(numero);
        
        // GERANDO NÚMEROS ALEATÓRIOS DE 15 A 50
        double aleatorio = Math.random();
        int numero = (int) (15 + aleatorio * (50 - 15));
        System.out.println(numero);*/
        
        /*
        int n = 4;
        System.out.println("O valor da variável é " + n++);
        
        int n1 = 4;
        System.out.println("O valor da variável é " + ++n1);*/
        
        /*
        int n1 = 2, n2 = 5;
        double resultado = n2 / n1;
        System.out.println(resultado);*/
        
        /*
        int v1 = 7, v2 = v1 % 2, v3 = 2;
        v3 += v2;
        System.out.println(v1 + " " + v2 + " " + v3);*/
    }
    
}
