package teampractice01;

import java.util.ArrayList;
import java.util.Scanner;

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
	public void print() {
		System.out.println(name);
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
		Scanner input =new Scanner(System.in);
	    String name;
		ArrayList<name> arr= new ArrayList<name>();
		int num;
	    while (true) {
	    	System.out.println("1 이름 저장");
	    	System.out.println("2 모든 이름 출력");
	    	num=input.nextInt();
	    	switch(num){
	    	case 1:System.out.println("이름 입력");
	    	name=input.next();
	    	name n= new name();
	    	n.setName(name);
	    	arr.add(n);
	    		
	    		break;
	    	case 2:
	    		
	    		System.out.println("=========");
	    		for(name nn :arr) {
	    			System.out.println(nn.getName());
	    		}
	    		
	    		break;
		
		
	}
}
}
}