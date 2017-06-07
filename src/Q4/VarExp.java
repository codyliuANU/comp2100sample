package Q4;

/**
 * 
 * VarExp - a simple variable expression
 * 
 * @author Eric McCreaht 2016
 *
 */

public class VarExp extends Exp {

	String variable; // this is the name of the variable
	
	public VarExp(String value) {
		this.variable = value;
	}
	
	@Override
	String show() {
		return variable;
	}

	@Override
	public int compareTo(Exp o) {
		if (o instanceof VarExp) return variable.compareTo(((VarExp) o).variable);
		else if (o instanceof LitExp) return 1;
		else return -1;
		
	}
	
	@Override
	public boolean equals(Object o) {
		if (o instanceof VarExp) return variable == ((VarExp) o).variable;
		return false;
	}

	@Override
	public int hashCode() {
		return variable.hashCode();
	}

	@Override
	int countOperations() {
		return 0;
	}
	
	@Override
	Exp replace(Exp subexp, VarExp var) {
		return (subexp.equals(this)? var : this); 
	}
}
