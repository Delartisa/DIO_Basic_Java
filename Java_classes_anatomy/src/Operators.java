public class Operators{
    
public static void main (String[] args){
    int positiveNumber = +10;
    positiveNumber = - positiveNumber; // ao tentar transformar um número positivo em negativo, é possível
    System.out.println(positiveNumber);

    int negativeNumber = -15;
    negativeNumber = + negativeNumber; // diferente do número positivo, o número negativo não se altera
    System.out.println(negativeNumber);

    int otherRandomNumber = 10;
    System.out.println(otherRandomNumber++); // ao usar a incrementação após a variavel, ela só será aplicada na próxima linha de código
    System.out.println(otherRandomNumber);

    int lastRandomNumber = 15;
    System.out.println(++lastRandomNumber); // porém, se usada antes da variável, seu valor será transformado na hora

    // OBS: o mesmo vale para a decrementação

    boolean schrodingerCatIsAlive = true; // aqui, trocamos seu valor com a negação (!) antes da variável
    System.out.println(!schrodingerCatIsAlive);

    // ou usamos schrodingerCatIsAlive = !schrodingerCatIsAlive

    // TERNÁRIOS

    int a = 5;
    int b = 6;
    String result;

    if(a==b){
        result = "true";
    } else{
        result = "false";
    }

    System.out.println(result);

    // or

    String resultado = a!=b ?"verdadeiro" : "falso";
    // a primeira expressão sempre tem que ser booleana, o restante pode ser string, numeros, e booleanos tambem
    System.out.println(resultado);

    int numero1 = 1;
    int numero2 = 2;

    boolean vorF = numero1 == numero2;
    System.out.println(vorF);

    vorF = numero1 != numero2;
    System.out.println(vorF);

    String nomeUm = "Isabelle";
    String mesmoNome = "Isabelle";
    String outroNome = new String("Isabelle");

    System.out.println(nomeUm == mesmoNome);
    System.out.println(nomeUm.equals(mesmoNome));

    System.out.println(nomeUm == outroNome); // operadores relacionais não funcionam bem com strings, por isso se deve usar equals
    System.out.println(nomeUm.equals(outroNome));

    boolean condicaoFalsa1 = false;
    boolean condicaoFalsa2 = false;
    boolean condicaoVerdade1 = true;
    boolean condicaoVerdade2 = true;

    if(condicaoFalsa1 && condicaoFalsa2){
        System.out.println("Ambas são falsas, logo, a condição se torna falsa.");
    } else if (condicaoVerdade1 && condicaoVerdade2) {
        System.out.println("Ambas são verdadeiras, logo a condição se torna verdadeira.");
    } else if (condicaoFalsa1 && condicaoVerdade1) {
        System.out.println("Pelo menos uma das condições é falsa, logo a condição se torna falsa.");
    } else {
        System.out.println("fim.");
    }

    // podemos usar expressoes relacionais junto das condições

    int numeroRelacional1 = 5;
    int numeroRelacional2 = 10;

    if(condicaoVerdade1 && (numeroRelacional1 != numeroRelacional2)){
        System.out.print("Condição verdadeira.");
    }
    
}

}
