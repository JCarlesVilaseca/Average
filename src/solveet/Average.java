package solveet;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Average calculator for fixed number of samples
 * 
 * @author JCarles Vilaseca
 * @version 1.0
 */
@ManagedBean
@SessionScoped
public class Average {
	public static final int CANTIDAD_MUESTRAS = 5;
	
	private Float[] sampling;

	/**
	 * Initilize array of samples to 0
	 */
	public Average()
	{
		sampling = new Float[CANTIDAD_MUESTRAS];
		
		for(int i=0;i<sampling.length;i++)
			sampling[i] = 0f;
	}
	
	/**
	 * Set sampling values
	 * 
	 * @param valores Array of samples
	 */
	public void setSampling(Float[] valores)
	{
		sampling = valores;
	}
	
	/**
	 * Get sampling values
	 * 
	 * @return Array of samples
	 */
	public Float[] getSampling()
	{
		return sampling;
	}
	
	/**
	 * Solve the average of sampling values
	 * 
	 * @return Valor average result, 0 if empty array
	 */
	public float getResult()
	{
		if (sampling == null || sampling.length == 0) return 0;
		
		float sum = 0;
		
		for(float sample: sampling)
			sum += sample;
		
		return sum  / sampling.length;
	}
}
