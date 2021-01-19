package bar.model;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.HashSet;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "bar_order")
public class BarOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "payment_doc", columnDefinition = "ENUM('INVOICE', 'RECEIPT'")
    @Enumerated(EnumType.STRING)
    private Payment paymentDoc;

    @Column(columnDefinition = "ENUM('OPENED', 'CLOSED'")
    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    Customer customer;

    @OneToMany(
            mappedBy = "barOrder"
    )
    private List<BarOrderProduct> barOrderProducts = new ArrayList<>();
}
