package com.company.sh.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Song  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String type;
    private String date;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "singer_id", referencedColumnName = "id")
    private Singer singer;


}
