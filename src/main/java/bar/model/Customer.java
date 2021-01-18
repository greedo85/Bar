package bar.model;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="company_name")
    private String companyName;

    @Column
    private String street;

    @Column(name="house_number")
    private String houseNumber;

    @Column(name="flat_number")
    private int flatNumber;

    @Column(name="post_code")
    private String postCode;

    @Column
    private String city;

    @Column
    private String nip;

}
