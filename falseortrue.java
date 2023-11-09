public class falseortrue {
    public static void main (String[] args){
       int Idade = 32;
        /* Condição: Se for maior ou igual que 18 e menor que 70
                    É TRUE = Votação obrigatória */

       if(Idade >= 18 && Idade < 70){
           System.out.println("Votação obrigatória");
       } else {
           System.out.println("Não é obrigado a votar");
       }

    }
}