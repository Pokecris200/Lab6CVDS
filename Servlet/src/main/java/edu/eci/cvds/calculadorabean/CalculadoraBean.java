package edu.eci.cvds.calculadorabean;

import java.util.*;

import javax.faces.bean.*;

@ManagedBean (name="CalculadoraBean")
@ApplicationScoped
public class CalculadoraBean {
	
	private ArrayList<Integer> valores;
	
	//Metodos
	public void setValores(List<Integer> numeros)
	{
		valores = (ArrayList<Integer>) numeros;
	}
	public ArrayList<Integer> getValores() {
		return valores;
	}
	
	public CalculadoraBean() {
		// TODO Auto-generated constructor stub
	}
	private Integer calculateMean(List<Integer> numeros) {
		Integer res = 0;
		for(Integer i : numeros) {
			res += i;
		}
		res /= numeros.size();
		return res;
	}
	private Integer calculateVariance(List<Integer> numeros) {
		Integer res = 0;
		Integer media = calculateMean(numeros);
		for(Integer i : numeros) {
			res += (i-media)^2;
		}
		res /= numeros.size();
		return res;
	}
	private Integer claculateMode(List<Integer> numeros) {
		HashMap<Integer,Integer> buscados = new HashMap();
		Integer res = 0;
		for(Integer i : numeros) {
			buscados.put(i, 0);
		}
		for(Integer i : numeros) {
			buscados.put(i, buscados.get(i) + 1);
		}
		res = buscados.get(buscados.keySet().toArray()[0]);
		for(Integer j : buscados.keySet()) {
			if (buscados.get(j) > buscados.get(res)) {
				res = j;
			}
		}
		return res;
	}
	private void restart() {
		// TODO Auto-generated method stub
	}
}
