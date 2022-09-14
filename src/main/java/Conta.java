public class Conta {
    private double saldo;
    void deposita(double valor) throws MinhaException {
    }

    public void saca(double valor) {
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }

        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) throws MinhaException {
        this.saca(valor);
        destino.deposita(valor);
    }
}
