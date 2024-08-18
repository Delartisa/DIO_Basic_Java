public class MyClass { // every class name need start with a uppercase letter
    //if the class is executable, it must contain "public static"
    // void for no return
public static void main (String [] args) { // args -> arguments(paramethers)
    //out -> return
    //print -> show in the screen for the user

    String primeiroNome = "Isabelle";
    String segundoNome = "Duarte Muniz";

    String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

    System.out.println(nomeCompleto);
}

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
}

}
