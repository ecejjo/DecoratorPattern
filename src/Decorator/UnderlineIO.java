package Decorator;

public class UnderlineIO extends DecoratorIO {

	public UnderlineIO(IO decoratedIO) {
		super(decoratedIO);
		// TODO Auto-generated constructor stub
	}
	
	public void writeln(String string) {
		string = "___" + string + "___";
		this.nextIO.writeln(string);
	}

}
