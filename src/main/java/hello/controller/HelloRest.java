package hello.controller;

import hello.domain.City;
import hello.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by elili on 5/19/2016.
 */
@RestController
public class HelloRest
{
    @Autowired
    public CityMapper cityMapper;

    @RequestMapping("/selectCityByName")
    public City selectCityByName(@RequestParam(value = "name", required = false) String name)
    {
        return this.cityMapper.selectCityByName(name);
    }

}
