package entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Entity(name = "Orders")
public class OrderEntity {
    @Id
    private String id;
    private String item;
    private String price;
    private String name;
    private String quantity;
}
