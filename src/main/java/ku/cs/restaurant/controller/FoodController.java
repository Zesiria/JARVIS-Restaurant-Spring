package ku.cs.restaurant.controller;

import ku.cs.restaurant.model.Food;
import ku.cs.restaurant.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/food")
public class FoodController {

    @Autowired
    private FoodService service;

    @GetMapping
    public List<Food> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Food create(@RequestBody Food food){
        return service.create(food);
    }

}
