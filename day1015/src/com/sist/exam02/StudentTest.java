package com.sist.exam02;

import java.util.Scanner;
public class StudentTest {

	public static void main(String[] args) {
		/*
			UnderGraduate underGraduate = new UnderGraduate("홍길동", "20211234", "컴퓨터공학", 1, 15, "방송댄스"); 
		Graduate graduate = new Graduate("이순신", "20211235", "인공지능", 2, 18, "연구조교", 1);
		System.out.println(underGraduate);
		System.out.println(graduate);*/	
		
		Student s1;
		Scanner sc = new Scanner(System.in);
		int studenttype;
		String name, no,major;
		int grade;
		double credits;
		
		do{
		System.out.print("학생 유형를 입력하세요. 1:학부생 ,2:대학원생==>");
		studenttype = sc.nextInt();
		}while(studenttype !=1 && studenttype !=2);
		
		System.out.print("학생의 이름을 입력하세요==>");
		name = sc.next();

		System.out.print("학번을 입력하세요==>");
		no = sc.next();
		
		System.out.print("학부을 입력하세요==>");
		major = sc.next();
		
		System.out.print("학년을 입력하세요==>");
		grade = sc.nextInt();
		
		System.out.print("학점을 입력하세요==>");
		credits = sc.nextDouble();	

		
		if(studenttype ==1){
				String club;
				System.out.print("동아리 명을 입력하세요==>");
				club = sc.next();
				s1 = new UnderGraduate(name,no,major,grade,credits,club);
		}else{
				String type;
				double rate;
				System.out.print("조교유형을 입력하세요==>");
				type = sc.next();
				System.out.print("장학금비율을 입력하세요==>");
				rate = sc.nextDouble();
				s1 = new Graduate(name,no,major,grade,credits,type,rate);
		}		
		System.out.println(s1);	
		
		// TODO Auto-generated method stub
		
	}
}
