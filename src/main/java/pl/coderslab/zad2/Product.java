package pl.coderslab.zad2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Product {
    private Long id;
    private String name;
    private Double price;

}
