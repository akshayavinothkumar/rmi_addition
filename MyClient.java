import java.rmi.*;

public class MyClient{
	public static void main(String[] args){
		try{
			Adder stub = (Adder) Naming.lookup("rmi://localhost:1099/AdderService");
			System.out.println(stub.add(6, 9));
		}catch(Exception e){}
	}
}