package edu.eci.cvds.calculadorabean;

import java.util.*;

import javax.faces.bean.*;

@ManagedBean (name="CalculadoraBean")
@ApplicationScoped
public class CalculadoraBean {
	
	private ArrayList<Integer> valores;
	private Integer mean;
	private Integer variance;
	private Integer moda;
	
	public Integer getMean() {
		return mean;
	}
	
	public Integer getVariance() {
		return variance;
	}
	
	public Integer getModa() {
		return moda;
	}
	
	//Metodos
	public void setValores() {
	}
	
	public CalculadoraBean() {
		// TODO Auto-generated constructor stub
	}
	
	public void calcular(String numeros) {
		
		String[] temp = numeros.split(";");
		for (String j:temp) {
			valores.add(Integer.parseInt(j));
		}
		System.out.println(valores);
		calculateMean();
		System.out.println(mean);
		calculateVariance();
		System.out.println(variance);
		claculateMode();
		System.out.println(moda);
	}
	
	private void calculateMean() {
		for(Integer i : valores) {
			mean += i;
		}
		mean /= valores.size();
	}
	
	private void calculateVariance() {
		for(Integer i : valores) {
			variance += (i-mean)^2;
		}
		variance /= valores.size();
	}
	
	private void claculateMode() {
		HashMap<Integer,Integer> buscados = new HashMap();
		Integer res = 0;
		for(Integer i : valores) {
			buscados.put(i, 0);
		}
		for(Integer i : valores) {
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
