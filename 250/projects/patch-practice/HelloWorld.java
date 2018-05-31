/**
 *Super complex hello world
 */
public class HelloWorld{
    private Talker talkers[]=new Talker[2];

    public HelloWorld(){
	talkers[0]=new Hello();
	talkers[1]=new World();
    }

    public void sayHello(){
	StringBuilder bldr = new StringBuilder();
	for(Talker t:talkers){
	    bldr.append(t.talk());
	    bldr.append(" ");
	}
	System.out.println(bldr.toString());
    }

    private interface Talker{
	public String talk();
    }

    private class Hello implements Talker{
	public String talk(){
	    return "Hello";
	}
    }

    private class World implements Talker{
	public String talk(){
	    return "World";
	}
    }

    public static void main(String[] args){
	HelloWorld helloworld = new HelloWorld();
	helloworld.sayHello();
    }
}
