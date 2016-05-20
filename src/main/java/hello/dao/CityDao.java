package hello.dao;

import hello.domain.City;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by elili on 5/20/2016.
 */
@Component
public class CityDao
{
    @Autowired
    private SqlSession sqlSession;

    public City selectCityByName(String name)
    {
        return this.sqlSession.selectOne("selectCityByName", name);
    }
}
