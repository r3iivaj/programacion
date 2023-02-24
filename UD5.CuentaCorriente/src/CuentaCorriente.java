/*
 * Javi Ruiz License
 */

public class CuentaCorriente {

    private double saldoActual;
    private long numCuenta;
    private String pin;

    public CuentaCorriente(int saldoActual, long numCuenta, String pin) {
//        if(saldoActual)
        if (numCuenta <= 100000) {
            throw new IllegalArgumentException("Escriba un numero correcto de cuenta");
        }
        if (pin.length() > 4) {
            throw new IllegalArgumentException("El pin solo puede tener 4 digitos");
        }
        this.saldoActual = saldoActual;
        this.numCuenta = numCuenta;
        this.pin = pin;
    }

    public double consultaSaldo() {
        return saldoActual;
    }

    public long getNumCuenta() {
        return numCuenta;
    }

    public boolean intentaAccesoConPin(String p) {
        if (p == this.pin) {
            return true;
        } else {
            return false;
        }
    }

    public void ingresa(double importe) {
        if (importe <= 0) {
            throw new IllegalArgumentException("El importe debe ser mayor que cero");
        }
        saldoActual = saldoActual + importe;
    }

    public void abona(double importe) {
        if (importe <= 0) {
            throw new IllegalArgumentException("El importe debe ser mayor que cero");
        }
        saldoActual = saldoActual - importe;

    }

}
