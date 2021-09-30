package edu.eci.cvds.calculadorabean;

import java.util.*;

import javax.faces.bean.*;

@ManagedBean (name="CalculadoraBean")
@ApplicationScoped
public class CalculadoraBean {
	
	private ArrayList<Double> valores = new ArrayList();
	private Double mean = 0.0;
	private Double variance = 0.0;
	private Double moda = 0.0;
	
	public Double getMean() {
		return mean;
	}
	
	public Double getVariance() {
		return variance;
	}
	
	public Double getModa() {
		return moda;
	}
	
	//Metodos
	public void setValores() {
	}
	
	public CalculadoraBean() {
		// TODO Auto-generated constructor stub
	}
	
	public void calcular(String numeros) {
		String[] splitedNumbers = numeros.split(";");
		for (String j : splitedNumbers) {
			valores.add(Double.parseDouble(j));
		}
		calculateMean();
		calculateVariance();
		claculateMode();
	}
	
	private void calculateMean() {
		mean = 0.0;
		for(Double i : valores) {
			mean += i;
		}
		mean /= valores.size();
	}
	
	private void calculateVariance() {
		variance = 0.0;
		for(Double i : valores) {
			variance += Math.pow(i-mean,2);
		}
		variance /= valores.size();
	}
	
	private void claculateMode() {
		moda = 0.0;
		HashMap<Double,Double> buscados = new HashMap();
		Double res = 0.0;
		for(Double i : valores) {
			buscados.put(i, 0.0);
		}
		for(Double i : valores) {
			buscados.put(i, buscados.get(i) + 1);
		}
		moda = (Double) buscados.keySet().toArray()[0];
		for(Double j : buscados.keySet()) {
			if (buscados.get(j) > buscados.get(moda)) {
				moda = j;
			}
		}
	}
	
	private void restart() {
		// TODO Auto-generated method stub
		valores.clear();
		mean = 0.0;
		variance = 0.0;
		moda = 0.0;
	}
}
