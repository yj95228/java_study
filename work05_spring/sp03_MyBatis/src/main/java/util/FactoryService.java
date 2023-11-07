package util;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

// SqlSessionFactory를 받아오는 기능을 하는 코드
public class FactoryService {
	private static SqlSessionFactory factory = null;
	static {
		try {
			// 1. MyBatis 핵심설정문서를 읽어들인다
			Reader r = Resources.getResourceAsReader("config/SqlMapConfig.xml");
			
			// 2. SqlSessionFactory를 생성
			factory = new SqlSessionFactoryBuilder().build(r);
			System.out.println("SqlSessionFactory 생성");
			
		}catch(IOException e) {
			System.out.println(e);
		}
	} // static
	
	public static SqlSessionFactory getFactory() {
		return factory;
	}
}
