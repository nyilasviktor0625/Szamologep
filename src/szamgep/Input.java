package szamgep;

import java.io.IOException;
import java.util.Scanner;

public class Input {
	int num;
	String text;
	
	
	
	public Input(int num, String text) {
		this.num = num;
		this.text = text;
	}

	public String getExpressionFromSystemIn() {
		Scanner sc = new Scanner(System.in);
		String expression = sc.nextLine();
		return expression;
	}
	
	public String[] parse(String expression)
	{
		String[] returnValue;
		if (expression.length() > 3) // 3 + 3
		{
			returnValue = expression.split(" ");
		}
		else {
			returnValue = expression.split("");
		}
		return returnValue;
	}
	
	public void assertExpression(String [] parts) throws Exception{
		if(parts.length != 3) {
			throw new Exception("Rossz érték");
		}
	}
	
	
/*	
public String szamol() throws IOException {
	
		
		
		
		if (returnValue[1].equals("+")) {
			result =String.valueOf(Integer.parseInt(returnValue[0]) + Integer.parseInt(returnValue[2]));
		}
		if (returnValue[1].equals("-")) {
			result =String.valueOf(Integer.parseInt(returnValue[0]) - Integer.parseInt(returnValue[2]));
		}
		if (returnValue[1].equals("*")) {
			result =String.valueOf(Integer.parseInt(returnValue[0]) * Integer.parseInt(returnValue[2]));
		}
		if (returnValue[1].equals("/")) {
			result =String.valueOf(Integer.parseInt(returnValue[0]) / Integer.parseInt(returnValue[2]));
		}

		return result;
	}
	*/
}
