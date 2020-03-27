package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {


	public static List<Integer> fibonacci() {

		int prev = 0;
		int next = 1;
		int sum = 0;

		List<Integer> series = new ArrayList<>();
		series.add(prev);
		series.add(next);

		do{
			sum = prev + next;
			series.add(sum);
			prev = next;
			next = sum;

		}while (sum < 350);

		return series;
	}

	public static Boolean isFibonacci(Integer a) {

		return fibonacci().contains(a);
	}

	public static void main(String[] args){
		System.out.println(DesafioApplication.fibonacci());
	}


}