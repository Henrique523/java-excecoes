public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (Exception ex) {
            String message = ex.getMessage();
            System.out.println("Arithmetic Exception " + message);
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaException {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaException {
        System.out.println("Ini do metodo2");
        for(int i = 1; i <= 5; i++) {
            System.out.println(i);
//                int a = 1 / 0;
            Conta conta = null;
            conta.deposita(25.0);
        }
        System.out.println("Fim do metodo2");
    }
}