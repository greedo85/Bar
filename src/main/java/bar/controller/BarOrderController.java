package bar.controller;

import bar.model.BarOrder;
import bar.service.BarOrderService;
import jdk.nashorn.internal.objects.annotations.Getter;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BarOrderController {

    @Autowired
    BarOrderService barOrderService;

    @PostMapping("/barorders")
    public void addBarOrder( @RequestBody BarOrder barOrder  ) {
        barOrderService.addBarOrder(barOrder);
    }

    @GetMapping("/barorders")
    public List<BarOrder> getAllOrders()
    {
        return barOrderService.getAllOrders();
    }
}
