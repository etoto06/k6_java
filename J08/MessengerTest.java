package J08;
interface Messenger{
	String getMessage();
	void setMessage(String msg);
}/*
class GalaxyMessenger implements Messenger{
	public String getMessage()){
		
	}
	
}*/
public class MessengerTest {
public static void main(String[] args) {
	GalaxyMessenger galaxy = new GalaxyMessenger();
	Messenger test = new  Messenger() {
		public String getMeesage() {
			return "test";
		}
		public void setMeesage(String msg) {
			System.out.println("메시지 = : + msg");
		}
	}; //여기에 왜 세미콜론 해야하는지 ? 
	
}
}

