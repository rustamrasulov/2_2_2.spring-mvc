package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImp implements CarService{
    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCarList(int count) {
        return carDao.getCarList(count);
    }
}
