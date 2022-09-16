package ku.cs.restaurant.service;

import ku.cs.restaurant.model.Food;
import ku.cs.restaurant.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FoodService {

    @Autowired
    private FoodRepository foodRepository;

    public List<Food> getAll(){
        return foodRepository.findAll();
    }

    public Food create(Food food){
        Food record = foodRepository.save(food);
        return record;
    }

}
