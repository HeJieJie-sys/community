package com.nowcoder.community;

import com.nowcoder.community.dao.AlphaDao;
import com.nowcoder.community.dao.AlphaDaoHibernateImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeansException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
@ContextConfiguration(classes = CommunityApplication.class) //以它为配置类
class CommunityApplicationTests implements ApplicationContextAware {

	private ApplicationContext applicationContext;//spring容器

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;//把容器传进来
	}
	@Test
	public void testApplicationContext(){
		System.out.println(applicationContext);//显示容器 管理bean
		AlphaDao alphaDao= applicationContext.getBean(AlphaDaoHibernateImpl.class);//获取bean 按照类型
		System.out.println(alphaDao.select());//调用方法并输出
	}
}
