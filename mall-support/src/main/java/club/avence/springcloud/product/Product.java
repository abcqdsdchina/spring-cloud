package club.avence.springcloud.product;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain=true)
public class Product {
    private Long id;
    private String category;
    private String name;
    private String description;
}
