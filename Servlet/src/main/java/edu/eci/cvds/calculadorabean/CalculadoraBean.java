package edu.eci.cvds.calculadorabean;

import java.util.*;

import javax.faces.bean.*;

@ManagedBean (name="CalculadoraBean")
@ApplicationScoped
public class CalculadoraBean {
	
	private ArrayList<Integer> valores;
	public Integer mean;
	public Integer variance;
	public Integer moda;
	
	//Metodos
	public void setValores(List<Integer> numeros)
	{
		valores = (ArrayList<Integer>) numeros;
	}
	
	public CalculadoraBean() {
		// TODO Auto-generated constructor stub
	}
	
	private void calculateMean(List<Integer> numeros) {
		for(Integer i : numeros) {
			mean += i;
		}
		mean /= numeros.size();
	}
	
	private void calculateVariance(List<Integer> numeros) {
		for(Integer i : numeros) {
			variance += (i-mean)^2;
		}
		variance /= numeros.size();
	}
	
	private void claculateMode(List<Integer> numeros) {
		HashMap<Integer,Integer> buscados = new HashMap();
		Integer res = 0;
		for(Integer i : numeros) {
			buscados.put(i, 0);
		}
		for(Integer i : numeros) {
			buscados.put(i, buscados.get(i) + 1);
		}
		moda = buscados.get(buscados.keySet().toArray()[0]);
		for(Integer j : buscados.keySet()) {
			if (buscados.get(j) > buscados.get(moda)) {
				moda = j;
			}
		}
	}
	
	private void restart() {
		// TODO Auto-generated method stub
		valores = null;
		mean = null;
		variance = null;
		moda = null;
	}
}
