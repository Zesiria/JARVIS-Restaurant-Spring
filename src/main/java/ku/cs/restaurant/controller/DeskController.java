package ku.cs.restaurant.controller;

import ku.cs.restaurant.model.Desk;
import ku.cs.restaurant.service.DeskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/table")
public class DeskController {
    @Autowired
    private DeskService service;

    @GetMapping
    public List<Desk> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Desk create(@RequestBody Desk desk){
        return service.create(desk);
    }
}
