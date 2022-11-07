package dos;

class Activity{
	  public String string1;
	  public String string2;
	  public String operator;

	  public Activity(String string1, String string2, String operator){
	    this.string1=string1;
	    this.string2=string2;
	    this.operator=operator;
	  }

	}



public class ex3 {
	  //Implement the two function given in description in here...
	  public String handleException(Activity a){
	    try{
	      if(a.string1==null || a.string2==null){
	        throw new NullPointerException();
	      }
	      char op= a.operator.charAt(0);
	      if(op!='+' && op!='-'){
	        throw new Exception();
	      }
	    }catch(NullPointerException e){
	      return "Null values found";
	    }catch(Exception e){
	      return a.operator;
	    }
	    return "No Exception Found";
	  }
	  public String doOperation(Activity a){
	    char op= a.operator.charAt(0);
	    switch(op){
	      case '+':
	      return a.string1+a.string2;
	      case '-':
	      {
	        String rr=a.string1.replace(a.string2, "");
	        return rr;
	      }
	    }
	    return "";
	  }
}