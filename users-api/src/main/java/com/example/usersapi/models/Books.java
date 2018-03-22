package com.example.usersapi.models;

import lombok.*;
import java.util.Date;
import org.apache.commons.lang.time.DateUtils;
import javax.persistence.*;

@Data
@AllArgsConstructor @NoArgsConstructor @Getter @Setter
@Entity @Table(name = "BOOKS")
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DAY")
//    @Type(type="date")  - not needed
    private Date day;

    @Column(name = "TOTAL")
    private Integer total;

    @Column(name = "BORROW")
    private Integer borrow;

    @Column(name = "AVAILABLE")
    private Integer available;

}