public class TestaContaComExcecaoChecked {
    public static void main(String[] args) {
        Conta c = new Conta();
        try {
            c.deposita(25.0);
        } catch (MinhaException ex) {
            System.out.println("tratamento...");
        }
    }
}
