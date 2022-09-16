package ku.cs.restaurant.service;

import ku.cs.restaurant.model.Desk;
import ku.cs.restaurant.repository.DeskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeskService {
    @Autowired
    private DeskRepository deskRepository;

    public List<Desk> getAll(){
        return deskRepository.findAll();
    }

    public Desk create(Desk desk){
        Desk record = deskRepository.save(desk);
        return record;
    }
}
