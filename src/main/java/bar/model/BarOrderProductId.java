package bar.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import java.io.Serializable;
@Embeddable
@Getter
@Setter

public class BarOrderProductId implements Serializable {

    @Column(name="bar_order_id")
    private int barOrderId;

    @Column(name="product_id")
    private int productId;




}
