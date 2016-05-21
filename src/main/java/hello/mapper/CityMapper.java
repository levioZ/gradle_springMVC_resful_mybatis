package hello.mapper;

import hello.domain.City;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by elili on 5/19/2016.
 */

@Mapper
public interface CityMapper
{
    City selectCityByName(String name);
    void saveCtiys(List<City> citys);

}


