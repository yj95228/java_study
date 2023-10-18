package com.edu.test;

// 예외
class Boom extends Exception{
	Boom(){
		this("This is BoomException");
	}
	Boom(String message){
		super(message);
	}
}

class User{
	public void go() throws Boom {
		int i = 10;
		int j = 0;
		System.out.println("2. go 진입");
		
		// 저 밑에 어느 부분에서 i/j 연산이 진행될 것임
		// 만약에 j가 0이 들어오면 고의적으로 폭탄을 터뜨리겠다
		if(j == 0) throw new Boom("분모가 0이면 안됩니다");
		System.out.println("3. go 진입");
	}
}

public class UserExceptionTest3 {

	public static void main(String[] args) {
		User user = new User();
		System.out.println("1. go... calling");
		try {
			user.go();			
		}catch(Boom e){
			System.out.println(e.getMessage());
		}

	}

}
