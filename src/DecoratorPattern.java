
import Decorator.JavaIO;
import Decorator.UnderlineIO;
import Decorator.UppercaseIO;

public class DecoratorPattern {
	
    public static void main(String[] args) {
    	
    	JavaIO myIO = new JavaIO();
        myIO.writeln("This is a write from an IO object.");
        
        UnderlineIO myUnderlineIO = new UnderlineIO(myIO);
        myUnderlineIO.writeln("This is a write from an UnderlineIO object.");
        
        UppercaseIO myUppercaseIO = new UppercaseIO(myIO);
        myUppercaseIO.writeln("This is a write from an UppercaseIO object.");
        
        UppercaseIO myUppercaseIO2 = new UppercaseIO(myUnderlineIO);
        myUppercaseIO2.writeln("This is a write from an UnderlineIO + UppercaseIO object.");
    }

}
