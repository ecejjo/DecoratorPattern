package Decorator;

public class UppercaseIO extends DecoratorIO {
	
	public UppercaseIO(IO decoratedIO) {
		super(decoratedIO);
	}
	
	public void writeln(String string) {
		string = string.toUpperCase();
		this.nextIO.writeln(string);
	}

}
