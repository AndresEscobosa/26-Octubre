package modelo;

public enum Operador{
	
	SUMAR("+") {
		@Override
		public float resultado(float ope1, float ope2) {
			// TODO Auto-generated method stub
			return ope1+ope2;
		}
	},
	RESTA("-") {
		@Override
		public float resultado(float ope1, float ope2) {
			// TODO Auto-generated method stub
			return ope1-ope2;
		}
	},
	MULTIPLICAR("*") {
		@Override
		public float resultado(float ope1, float ope2) {
			// TODO Auto-generated method stub
			return ope1*ope2;
		}
	},
	DIVIDIR("/") {
		@Override
		public float resultado(float ope1, float ope2) {
			// TODO Auto-generated method stub
			return ope1/ope2;
		}
	};
	
	private String tipo;
	
	Operador(String tipo){
		this.tipo=tipo;
	}
	
	public abstract float resultado(float ope1, float ope2);
}
