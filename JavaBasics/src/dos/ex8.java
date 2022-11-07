package dos;

import java.util.regex.Pattern;

class TransactionParty {
	  String seller;
	  String buyer;
	    public TransactionParty(String seller, String buyer){
	      this.seller=seller;
	      this.buyer=buyer;
	    }
	}

	class Receipt{
	  TransactionParty transactionParty;
	  String productsQR;
	  public Receipt(TransactionParty transactionParty, String productsQR){
	    this.transactionParty=transactionParty;
	    this.productsQR=productsQR;
	  }
	}


	class GenerateReceipt{
	  public int verifyParty(Receipt r){
	    String name1= r.transactionParty.seller;
	    String name2= r.transactionParty.buyer;

	    boolean f1= Pattern.matches("[A-Za-Z]{1,}[A-Za-z'-]*[A-Za-Z]{1}", name1);
	    boolean f2= Pattern.matches("[A-Za-Z]{1,}[A-Za-z'-]*[A-Za-Z]{1}", name2);

	    if(f1 && f2)
	    return 2;
	    else if(f1 || f2)
	    return 1;
	    else
	    return 0;

	  }
	  public String clalcGST(Receipt r){
	    String[] arr= r.productsQR.split("[,@]");
	    double GST=0;

	    for(int i=0;i<arr.length-1;i+=2){
	      GST+=((Integer.valueOf(arr[i])*Integer.valueOf(arr[i]))*0.12);
	    }
	    int gst= (int)Math.floor(GST);
	    return Integer.toString(gst);
	  }
	}

public class ex8 {

}
