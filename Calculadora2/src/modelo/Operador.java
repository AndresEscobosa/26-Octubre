package modelo;

import java.util.function.DoubleBinaryOperator;

public enum Operador{
	
	SUMAR("+") {
		@Override
		public double resultado(double ope1, double ope2) {
			// TODO Auto-generated method stub
			return ope1+ope2;
		}
	},
	RESTA("-") {
		@Override
		public double resultado(double ope1, double ope2) {
			// TODO Auto-generated method stub
			return ope1-ope2;
		}
	},
	MULTIPLICAR("*") {
		@Override
		public double resultado(double ope1, double ope2) {
			// TODO Auto-generated method stub
			return ope1*ope2;
		}
	},
	DIVIDIR("/") {
		@Override
		public double resultado(double ope1, double ope2) {
			// TODO Auto-generated method stub
			return ope1/ope2;
		}
	};
	
	private String tipo;
	
	Operador(String tipo){
		this.tipo=tipo;
	}
	
	public abstract double resultado(double ope1, double ope2);
}
