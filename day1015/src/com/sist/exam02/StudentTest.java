package com.sist.exam02;

import java.util.Scanner;
public class StudentTest {

	public static void main(String[] args) {
		/*
			UnderGraduate underGraduate = new UnderGraduate("ȫ�浿", "20211234", "��ǻ�Ͱ���", 1, 15, "��۴�"); 
		Graduate graduate = new Graduate("�̼���", "20211235", "�ΰ�����", 2, 18, "��������", 1);
		System.out.println(underGraduate);
		System.out.println(graduate);*/	
		
		Student s1;
		Scanner sc = new Scanner(System.in);
		int studenttype;
		String name, no,major;
		int grade;
		double credits;
		
		do{
		System.out.print("�л� ������ �Է��ϼ���. 1:�кλ� ,2:���п���==>");
		studenttype = sc.nextInt();
		}while(studenttype !=1 && studenttype !=2);
		
		System.out.print("�л��� �̸��� �Է��ϼ���==>");
		name = sc.next();

		System.out.print("�й��� �Է��ϼ���==>");
		no = sc.next();
		
		System.out.print("�к��� �Է��ϼ���==>");
		major = sc.next();
		
		System.out.print("�г��� �Է��ϼ���==>");
		grade = sc.nextInt();
		
		System.out.print("������ �Է��ϼ���==>");
		credits = sc.nextDouble();	

		
		if(studenttype ==1){
				String club;
				System.out.print("���Ƹ� ���� �Է��ϼ���==>");
				club = sc.next();
				s1 = new UnderGraduate(name,no,major,grade,credits,club);
		}else{
				String type;
				double rate;
				System.out.print("���������� �Է��ϼ���==>");
				type = sc.next();
				System.out.print("���бݺ����� �Է��ϼ���==>");
				rate = sc.nextDouble();
				s1 = new Graduate(name,no,major,grade,credits,type,rate);
		}		
		System.out.println(s1);	
		
		// TODO Auto-generated method stub
		
	}
}
