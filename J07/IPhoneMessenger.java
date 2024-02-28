package J07;

public class IPhoneMessenger implements Messenger {
	
	public String getMessage() {
		return"iphone";
	}
	
	public void setMessage(String msg) {
		System.out.println("i폰에서 메세지를 설정합니다 :" +msg);
	}
	
	public void clearMessage() {
		System.out.println("좌우로 흔들어 문자열을 지웁니다");
		
	}

	public void setLogin(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
