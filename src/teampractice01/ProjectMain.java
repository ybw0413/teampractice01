package teampractice01;

import java.util.ArrayList;
import java.util.Scanner;

//�̸� ���� ��ȸ

//1.�̸� ��ȸ ���
//2.���� ��ȸ ���

class name {
	
	//1�� ������ �̸� ���� 2�� ������ �̸� ��ȸ
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
	
	//1�� ������ ���� ���� 2�� ������ ���� ��ȸ
	
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
		// �̸�, ���� ��ȸ��� ����
		Scanner input =new Scanner(System.in);
	    String name;
		ArrayList<name> arr= new ArrayList<name>();
		int num;
	    while (true) {
	    	System.out.println("1 �̸� ����");
	    	System.out.println("2 ��� �̸� ���");
	    	num=input.nextInt();
	    	switch(num){
	    	case 1:System.out.println("�̸� �Է�");
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