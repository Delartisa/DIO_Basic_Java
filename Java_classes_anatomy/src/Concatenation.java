public class Concatenation {

    public static void main(String[] args) {
        String concatenacao;

        concatenacao = 1+1+1+"1"; // 1
        System.out.println(concatenacao);

        concatenacao = 1+1+"1"+1; // 2
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1"; // 3
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1; // 4 | * toda vez que o sistema identifica um caractere, ele não faz mais operações matemática, a não ser em caso de evidências, como no próximo exemplo
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1); // 5
        System.out.println(concatenacao);
    }

}