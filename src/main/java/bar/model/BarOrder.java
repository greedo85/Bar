package bar.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="bar_order")
public class BarOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private Enum status;

    @Column(name="payment_doc")
    private Enum paymentDoc;

    @ManyToOne
    @JoinColumn(name="cusomer_id", referencedColumnName = "id")
    Customer customer;

    @OneToMany(
            mappedBy = "bar_order",
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<BarOrderProduct> barOrderProducts=new ArrayList<>();

}
