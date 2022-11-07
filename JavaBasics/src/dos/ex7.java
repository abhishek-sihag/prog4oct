package dos;

import java.util.regex.Pattern;

class Email{
	Header header;
	String body;
	String greetings;
	Email(Header header, String body, String greetings){
		this.header=header;
		this.body=body;
		this.greetings=greetings;
	}
}
class Header{
	String from;
	String to;
	Header(String from, String to){
		this.from=from;
		this.to=to;
	}
}


class EmailOperations{
	public int emailVerify(Email e){
		String fr= e.header.from;
		String t= e.header.to;
		int i;
		if(Pattern.matches("[a-zA-Z_]{1,}\\@\\w{1,}\\.\\w{1,}",fr) && Pattern.matches("[a-zA-Z_]{1,}\\@\\w{1,}\\.\\w{1,}",t)){
		i=2;
		} else if (Pattern.matches("[a-zA-Z_]{1,}\\@\\w{1,}\\.\\w{1,}",fr) || Pattern.matches("[a-zA-Z_]{1,}\\@\\w{1,}\\.\\w{1,}",t)){
		i=1;
		}else {
		i=0;
    }
	return i;
	}

	public String bodyEncryption(Email e){
		char[] sml={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		char[] caps= {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		String b=e.body;
		StringBuffer bd= new StringBuffer(b);

		for(int i=0;i<b.length();i++){
			for(int j=0;j<26;j++){
				if(b.charAt(i)==sml[j]){
					if(j==24){
						bd.setCharAt(i, sml[1]);
					}else {
						bd.setCharAt(i, sml[j+3]);
					}}else if(b.charAt(i)==caps[j]){
						if(j==25){
							bd.setCharAt(i, caps[2]);
						}else {
							bd.setCharAt(i, caps[j+3]);}
						}else{}
					}
				}
			String stf= new String(bd);
			return stf;
	
	}
    public String greetingMessage(Email e){
		String gr= e.greetings;
		String fr= e.header.from;
		String[] name= fr.split("@",2);
		String name1= name[0];
		String msg= gr+" "+name1;
		return msg;
	}
}
public class ex7 {

}
