package ch06.book.exercise.p15;

public class MemberService {
	
	
	public String id;
	
	public String password;
	
	
	public static boolean login(String id ,String password) {
		
		
		if(id == "hong"&& password == "12345") {
			
			return true;
		}else {
			return false;
		}
		
				
	}

	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}
	
	
}
