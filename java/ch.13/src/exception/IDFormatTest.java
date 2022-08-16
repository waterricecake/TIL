package exception;

public class IDFormatTest {
	
	private String userID;

	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) throws IDFormatException {
		if (userID == null){
			throw new IDFormatException("ID Can't be null");
		}
		else if(userID.length()<8 || userID.length()>20){
			throw new IDFormatException("ID'S length must be over 8 and under 20");
		}
		
		
		this.userID = userID;
	}
	public static void main(String[] args) {
		IDFormatTest idTest = new IDFormatTest();
		
		String myId = null;
		
		try {
			idTest.setUserID(myId);
		}catch(IDFormatException e) {
			System.out.println(e);
		}
		
		
	}

}
