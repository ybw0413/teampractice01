package teampractice01;

//이름 성적 조회

//1.이름 조회 기능
//2.성적 조회 기능

class name {
	
	//1번 누르면 이름 저장 2번 누르면 이름 조회
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

class grade {
	
	//1번 누르면 성적 저장 2번 누르면 성적 조회
	
	private String grade;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
}

public class ProjectMain {
	public static void main(String[] args) {
		// 이름, 성적 조회기능 연동
	}
}