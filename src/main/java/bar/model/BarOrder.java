package bar.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

import java.util.ArrayList;

import java.util.List;

@Entity
@Table(name = "bar_order")
@Getter
@Setter
public class BarOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(columnDefinition = "ENUM('OPENED', 'CLOSED'")
    @Enumerated(EnumType.STRING)
    private Status status;

    @Column(name = "payment_doc", columnDefinition = "ENUM('INVOICE', 'RECEIPT'")
    @Enumerated(EnumType.STRING)
    private Payment paymentDoc;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "id")
    Customer customer;


    @OneToMany
            (
                    mappedBy = "barOrder",
                    cascade = CascadeType.ALL
            )
    private List<BarOrderProduct> barOrderProducts = new ArrayList<>();
}


