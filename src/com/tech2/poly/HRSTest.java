package com.tech2.poly;

	abstract class Employee{
	String name;
	int salary;
	public abstract void calcSalary();
	public abstract void calcBonus();
	}
	class Salesman extends Employee {
		public void calcSalary() {
			System.out.println("Salesman 급여 = 기본급 +판매수당");
		}
		public void calcBonus() {
			System.out.println("Salesman 보너스 =기본급 *12*4");
		}
	}
	class Consultant extends Employee{
		public void calcSalary() {
			System.out.println("Consultant 급여 = 기본급+ 컨설팅 특별 수당");
		}
		public void calcBonus() {
			System.out.println("Consultant 보너스 =기본급 *12*2");
		}
	}
	abstract class Manager extends Employee{
		public void calcSalart() {
			System.out.println("Manager 급여 = 기본급+팀 성과 수당");
		}
	}
	 class Director extends Manager{
		public void calcBonus() {
			System.out.println("Director 보너스 =기본급*12*6");
		}

		@Override
		public void calcSalary() {
			// TODO Auto-generated method stub
			
		}

	
	}
	public class HRSTest {
		
		public static void calcTax(Employee s) { //Employee 부모라서 다 받을수있음
//			System.out.println("소득세를 계산합니다");
			System.out.println("Salesman비교 :"+(s instanceof Salesman)); //instanceof는 비교할때
			if (s instanceof Salesman) {
				//책 356쪽 해보기
				System.out.println("Salesman입니다.");
			}else 	if(s instanceof Director) { 
				System.out.println("Director입니다.");
			}else 	if(s instanceof Consultant) { 
				System.out.println("Consultant입니다.");
			}
		}
		public static void main(String[] args) {
			Salesman s=new Salesman();
			Consultant c=new Consultant();
			Director d=new Director();
			
			Employee arr[]=new  Employee[3];
			
			arr[0]=s;
			arr[1]=c;
			arr[2]=d;
			
//			calcTax(arr[0]);
//			calcTax(arr[1]);
//			calcTax(arr[2]);
			
			calcTax(d); //비교
			
			
//			for (Employee object : arr) {
//				calcTax(object);
//			}
			for (int i = 0; i < arr.length; i++) {
				System.out.println(arr[i]);
			}
			
			
//			s.calcBonus();
//			c.calcBonus();
//			d.calcBonus();	
//			System.out.println(s.toString());
//			System.out.println(c.toString());
//			System.out.println(d.toString());
//			calcTax(s);
//			calcTax(c);
//			calcTax(d);
		}
		
}
