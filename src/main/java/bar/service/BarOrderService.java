package bar.service;

import bar.model.BarOrder;
import bar.repository.BarOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BarOrderService {

    @Autowired
    BarOrderRepository barOrderRepository;

    public void addBarOrder( BarOrder barOrder ) {
        barOrderRepository.save(barOrder);
    }

    public List<BarOrder> getAllOrders()
    {
        return barOrderRepository.findAll();
    }
}
