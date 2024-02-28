package J07;

public class MessengerTest {
	public static void main(String[] args) {
		
		IPhoneMessenger iphone = new IPhoneMessenger();
		GalaxtMessenger galaxy = new GalaxtMessenger();
	
		System.out.println("메신저 최소 문자 크기 " + Messenger.MIN_SIZE);
		System.out.println("메신저 최대 문자 크기 " + Messenger.MAX_SIZE);
		
	
		iphone.setLogin(true);
		iphone.getMessage();
		iphone.setMessage("hello");
		iphone.clearMessage();
		
		galaxy.getMessage();
		galaxy.setMessage("hi");
		
		galaxy.fileDownload();
		galaxy.fileUpload();
	}
}
