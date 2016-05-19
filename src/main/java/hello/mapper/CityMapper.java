package hello.mapper;

import hello.domain.City;
import org.apache.ibatis.annotations.*;

/**
 * Created by elili on 5/19/2016.
 */

@Mapper
public interface CityMapper
{
    @Select("select * from city where state = #{state}")
    City findByState(@Param("state") String state);

    @Insert("insert into City(name,state,country) VALUES(#{name}, #{state}, #{country})")
    void saveCity(@Param("name") String name, @Param("state") String state, @Param("country") String country);

    @Delete("delete from City where name=#{name}")
    void deleteCity(@Param("name") String name);

    @Update("update City set name=#{name},country=#{country}")
    void updateCity(@Param("name") String name, @Param("country") String country);

}


