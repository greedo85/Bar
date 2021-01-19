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

    @ManyToOne
    @MapsId("barOrderId")
    @JoinColumn(name="bar_order_id")
    private BarOrder barOrder;

    @ManyToOne
    @MapsId("productId")
    @JoinColumn(name="product_id")
    private Product product;

    private int quantity;

}
