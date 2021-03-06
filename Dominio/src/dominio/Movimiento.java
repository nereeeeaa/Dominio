package dominio;

import java.util.Date;

/**
 * Clase para crear los movimientos de una cuenta bancaria
 * @author Win10_Irina_2018
 *
 */
public class Movimiento {
	
	protected String mConcepto;
	protected Date mFecha;
	protected double mImporte;
	
	/**
	 * Contructor por defecto que al atributo fecha le asigna una fecha
	 * @author Aitor
	 */
	public Movimiento()
	{
		mFecha=new Date();
	}
	
	/**
	 * Metodo que devuelve el importe de un movimiento
	 * @author Aitor
	 * @return Devuelve el importe del movimiento
	 */
	public double getImporte()
	{
		return mImporte;
	}



	/**
	 * metodo que devuelve el concepto del movimiento
	 * @author Balirina
	 * @return el concepto
	 */
	public String getConcepto()
	{
		return mConcepto;
	}
	
	/**
	 * Metodo que sobreescribe el movimiento con el parametro que recibe el metodo
	 * @author Balirina
	 * @param nuevo concepto
	 */
	public void setConcepto(String newMConcepto)
	{
		mConcepto=newMConcepto;

	}
	
	/** Metodo que te devuelve la fecha en la que has realizado cierto movimiento 
	 * author Nerea
	 * @return Devuelve la fecha en la que has realizado el movimiento
	 */
	public Date getFecha()
	{
		return mFecha;
	}
	/** Metodo que inserta una nueva fecha cuando haces cualquier movimiento
	 * author  Nerea
	 */
	
	public void setFecha(Date newMFecha)
	{
		mFecha= newMFecha;
	}
	/** Metodo que i
	 * author Nerea
	 */
	
	public void setImporte(double newMImporte)
	{
		mImporte= newMImporte;
	}
}
