package szamgep;

public class Analyz {

	public enum Operators
	{
		PLUS("+"),
		MINUS("-"),
		DIV("/"),
		MULTIP("*");
		private final String operator;
		Operators(String operator) {
			this.operator = operator;
		}
		public String getOperator() {
			return this.operator;
		}
		public static Operators getOperatorName(String statement) {
			for (Operators operator : Operators.values()) {
				if(statement.equals(operator.getOperator())) {
					return operator;
				}
			}
			return null;
		}
		
	};
	
	
	
}
