/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package cuentas;

/**
 * 
 * @author Julio
 *
 */
public class CCuenta {

	/**
	 * 
	 * Declaración de las variables a usar dentro de la clase
	 * @param nombre incluye el nombre del cliente, cuenta almacena el numero de cuenta
	 * @paramsaldo guarda el saldo en la cuenta del cliente y tipo interes marca el tipo de interes a aplicar al cliente
	 */
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Primer constructor de la clase CCuenta declarado vacio
     */
    public CCuenta()
    {
    }
/**
 * Segundo constructor de la clase que recibe de la clase principal un string con el nombre, otro con la cuenta
 * y dos doubles con el el saldo de la cuenta y el tipo de interes y los asigna a las variables correspondientes de la clase
 * @param nom
 * @param cue
 * @param sal
 * @param tipo
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * Setter que asigna el nombre
 * @param nom
 */
    public void asignarNombre(String nom)
    {
        setNombre(nom);
    }
/**
 *Metodo que devuelve el nombre
 * @return String con el nombre del cliente
 */
    public String obtenerNombre()
    {
        return getNombre();
    }

/**
 * Metodo que devuelve el saldo de la cuenta
 * @return double con el valor del saldo en la cuenta
 */
    public double estado()
    {
        return saldo;
    }

/**
 * Metodo que se usa para realizar el ingreso en cuenta
 * @param cantidad, con el valor a ingresar
 * @throws Exception se lanza un mensaje de error si la cantidad a ingresar es negativa
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
/**
 * Metodo que se usa para realizar la retirada de efectivo en cuenta
 * @param cantidad representa el valor de la cantidad de dinero a retirar
 * @throws Exception se lanza un mensaje de error si la cantidad de dinero a retirar es negativa o si el saldo en cuenta es insuficiente para la retirada
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }

/**
 * Metodo que devuelve el numero de la cuenta del cliente
 * @return String con el valor de la cuenta
 */
    public String obtenerCuenta()
    {
        return cuenta;
    }

/**
 * Metodo que devuelve el nombre del cliente
 * @return String con el nombre del cliente
 */
    public String getNombre() {
        return nombre;
    }

/**
 * Setter de la clase para el nombre del cliente
 * @param nombre variable pasada por parametro
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

/**
 * Metodo que devuelve el tipo de interes que se aplica al cliente
 * @return double con el valor del interes aplicado al cliente
 */
    public double getTipoInterés() {
        return tipoInterés;
    }

/**
 * Setter de la clase para el tipo de interes a aplicar al cliente
 * @param tipoInterés con el valor del tipo de interes aplicado al cliente
 */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
