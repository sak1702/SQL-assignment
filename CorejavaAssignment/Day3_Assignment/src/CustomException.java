package com.sonataAssignment;

public class CustomException extends Exception {

		public static void main(String[] args) throws MyOwnException{
			int Esal=10000;
			if(Esal<100000) {
				throw new MyOwnException("Employee Annual Salary is less than 100000");
			}
			else System.out.println("Employee Annual Salary is more than 100001");
		}
	}


