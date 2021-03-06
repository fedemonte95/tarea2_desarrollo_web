/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import dao.Car;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.bean.ManagedProperty;
import javax.inject.Named;


/**
 *
 * @author fede
 */
@Named(value = "basicView")
@RequestScoped
public class BasicView implements Serializable {
     
    private List<Car> cars;
     
    @ManagedProperty("#{carService}")
    private CarService service;
 
    @PostConstruct
    public void init() {
        cars = service.createCars(10);
    }
     
    public List<Car> getCars() {
        return cars;
    }
 
    public void setService(CarService service) {
        this.service = service;
    }
}