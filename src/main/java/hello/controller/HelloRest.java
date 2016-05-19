package hello.controller;

import hello.domain.City;
import hello.mapper.CityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
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
    private CityMapper cityMapper;

    @RequestMapping("/findByState")
    public City findByState(@RequestParam(value = "name", required = false) String name)
    {
        return this.cityMapper.findByState("CA");
    }

    @RequestMapping("/saveCity")
    public void saveCity(@RequestBody City city)
    {
       this.cityMapper.saveCity(city.getName(),city.getState(),city.getCountry());
    }
    @RequestMapping("/deleteCity")
    public void deleteCity(@RequestParam(value = "name", required = true) String name)
    {
        this.cityMapper.deleteCity(name);
    }
    @RequestMapping("/updateCity")
    public void updateCity(@RequestParam(value = "name", required = true) String name, @RequestParam(value = "country", required = true) String country)
    {
      this.cityMapper.updateCity(name,country);
    }
}
