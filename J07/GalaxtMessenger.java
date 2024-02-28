package J07;

public class GalaxtMessenger implements Messenger{
	
	public String getMessage() {
		return "galaxy";
	}
	
	public void setMessage(String msg) {
		System.out.println("galaxy에서 메세지를 설정합니다 :" +msg);
	}
	
	public void changeKeyboard() {
		System.out.println("키보드변경");
	}
	
	public void fileDownload() {
		System.out.println("파일을 다운로드합니다.");
	}

	public void fileUpload() {
		System.out.println("파일을 업로드합니다");
	}

}
