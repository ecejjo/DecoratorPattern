package Decorator;

public abstract class DecoratorIO implements IO {
	
    protected IO nextIO;
	
    protected DecoratorIO(IO nextIO) {
        super();
        this.nextIO = nextIO;
  }
    
	public int readInt(String title) {
		return (this.nextIO.readInt(title));
	}
	
	public char readChar(String title) {
		return (this.nextIO.readChar(title));
	}
	
	public void writeln() {
		this.nextIO.writeln();
	}
	
	public void write(String string) {
		this.nextIO.write(string);
	}
	
	public void writeln(String string) {
		this.nextIO.writeln(string);
	}

}
