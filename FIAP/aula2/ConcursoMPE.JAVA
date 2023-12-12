public class ConcursoMPE {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("João",20,"joao@gmail.com");
        System.out.println(p.nome + "");
        System.out.println(p.idade + "");
        System.out.println(p.email);
    }
}

class Pessoa {
    public String nome;
    private int idade;
    protectec String email;
    Pessoa(String n, int i, String e) {
        nome=n;
        idade=i;
        email=e;
    }
}