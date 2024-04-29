/**
 *
 * @author matheus.luz
 */
public class Cliente {
    private String nomeCliente;
    private double saldo;
    private String agencia;
    private int numeroDaConta;

    /**
     * @return String return the nomeCliente
     */
    public String getNomeCliente() {
        return nomeCliente;
    }

    /**
     * @param nomeCliente the nomeCliente to set
     */
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    /**
     * @return double return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return String return the agencia
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * @param agencia the agencia to set
     */
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    /**
     * @return int return the numeroDaConta
     */
    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    /**
     * @param numeroDaConta the numeroDaConta to set
     */
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

}
