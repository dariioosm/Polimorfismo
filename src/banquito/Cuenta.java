package banquito;

import java.io.Serializable;

public abstract class Cuenta implements Serializable {
    protected String codigo;
    protected String titular;
    protected double saldo;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cuenta(String codigo, String titular, double saldo) {
        this.codigo = codigo;
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cuenta [codigo=" + codigo + ", titular=" + titular + ", saldo=" + saldo + "]";
    }

    public abstract double calculaInteres();

}
