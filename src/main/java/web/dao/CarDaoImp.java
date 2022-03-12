package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {

    private List<Car> carList = new ArrayList<Car>();
    {
        carList.add(new Car("Volvo", "S90", 2020));
        carList.add(new Car("VAZ", "21043", 1993));
        carList.add(new Car("Horhe", "4-15 PS", 1901));
        carList.add(new Car("Audi", "Quattro", 1984));
        carList.add(new Car("Honda", "Civic", 2008));
    }

    @Override
    public List<Car> getCarList(int count) {
        if (count == 0 || count > 4) {
            return carList;
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}
