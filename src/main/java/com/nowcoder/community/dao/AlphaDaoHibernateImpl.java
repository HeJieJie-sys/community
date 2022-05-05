package com.nowcoder.community.dao;//模拟访问数据库

import org.springframework.stereotype.Repository;

@Repository//得有注解才能使spring扫到这个bean
public class AlphaDaoHibernateImpl implements AlphaDao{

    @Override
    public String select() {
        return "Hibernate";
    }
}
