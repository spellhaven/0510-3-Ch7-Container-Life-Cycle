package com.spellhaven.spring0510_3;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		// 컨테이너의 흥망성쇠, 즉 컨테이너의 Life Cycle(생명주기)를 연습 삼아 한 번 만들어 봤다.
		// 교) 사실 pdf만 보면 되는데... 걍 함 만들어봄 ㅋ
		// 우리) 🤮
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext(); // 컨테이너 ctx 생성
		
		ctx.load("classpath:applicationCTX.xml"); // 컨테이너 파일 설정
		ctx.refresh(); // 컨테이너 재로딩. ctx.load()를 했으면 그냥 ctx.refresh()까지 써 줘야 한다...
		
		Student stu1 = ctx.getBean("student1", Student.class); //컨테이너 사용
		System.out.println(stu1.getName()); // 컨테이너 사용
		
		ctx.close(); // 컨테이너 종료
	}

}
