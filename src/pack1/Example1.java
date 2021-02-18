package pack1;

class MyException extends Exception{
	   String str1;
	   MyException(String str2) {
		str1=str2;
	   }
	   public String toString(){ 
		return ("\n\t MyException Occurred: "+str1) ;
	   }
	}
	class Example1{
	   public static void main(String args[]){
		try{
			System.out.println("\n\t Starting of try block");
			// I'm throwing the custom exception using throw
			throw new MyException("\n\t This is My error Message");
		}
		catch(MyException exp){
			System.out.println("\n\t Catch Block") ;
			System.out.println(exp) ;
		}
	   }
	}