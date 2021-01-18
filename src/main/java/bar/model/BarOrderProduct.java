package bar.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="bar_order_product")
@Getter
@Setter
public class BarOrderProduct {

    @EmbeddedId
    private BarOrderProductId id;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("barOrderId")
    private BarOrder barOrder;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("productId")
    private Product product;


    private int quantity;

}
