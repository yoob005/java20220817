package ch10.book.exercise.e07;

public class LoginExample {
	public static void main(String[] args) {
		try {
			login("white" , "12345");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		try {
			login("blue", "54321");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void login(String id, String password) throws NotExistIDException, WrongPasswordException {
		//id가 "blue"가 아니라면 NotExistIDException 발생
		
		if(!id.equals("blue")) {
			throw new NotExistIDException("아이디가 존재하지 않습니다");
			
		}
		
		//password ㄱ12345 아니면 Wrongpassword발생
		if(!password.equals("12345")){
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}
	}
}
