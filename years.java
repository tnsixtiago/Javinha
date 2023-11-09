public class years {
    public static void main(String [] args) {
        int[] idades = new int[]{10, 23, 64};

        boolean menorDeIdade = false;
        boolean maiorDeIdade = false;
        boolean idoso = false;

        for (int idade : idades) {
            menorDeIdade ^= idade < 18;
            maiorDeIdade ^= idade >=18 && idade < 52;
            idoso ^= idade >= 53;
        }

        System.out.println("Menor de idade: " + menorDeIdade);
        System.out.println("Adulto: " + maiorDeIdade);
        System.out.println("Idoso: " + idoso);


    }
}

 /*
Neste código, estou treinando a minha lógica;
O que eu quero que aconteça, quero que ele leia maior de idade e menor de idade
quero entender como funciona o XOR em código
por exemplo (Se não for menor de idade, quero que ele leia o maior de idade SE for maior que 53
quero que ele mostre que é idoso e fale a idade da pessoa e vice versa.
Já entendi que o XOR é um só retorna TRUE se os valores forem opostos.
Igual nesse código, as variáveis foram dadas como false desde o inicio.

Creio que irei ter que fazer if e elseif pela primeira vez.


*/