public class MinhaClasse {
    public static void main (String[] args) {
        String primeiroNome = "Lucas";
        String segundoNome = "Mariana";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Qual o melhor casal que existe? " + primeiroNome.concat(" e ").concat(segundoNome);
    }
}
