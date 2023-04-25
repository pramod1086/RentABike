package com.pramod.rentabike.model;

public class Bike {
    private static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", unique = true)
    private Integer id;

//    @NotBlank
//    @Column(name = "vin")
    private String vin;

//    @NotBlank
//    @Column(name = "description")
    private String description;

//    @ManyToOne
//    @JoinColumn(name = "point_id")
//    private Point point;
//
//    @Column(name = "available_status")
    private Integer availableStatus;

}
