package com.lin.dao;

import com.lin.pojo.Blog;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class BlogMapperImpl extends SqlSessionDaoSupport implements BlogMapper {
    @Override
    public List<Blog> getBlogList() {

//        SqlSession sqlSession = getSqlSession();
//        BlogMapper mapper = sqlSession.getMapper(BlogMapper.class);
//        List<Blog> blogList = mapper.getBlogList();
//        return blogList;

        return getSqlSession().getMapper(BlogMapper.class).getBlogList();
    }
}
