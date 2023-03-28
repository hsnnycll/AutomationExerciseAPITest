package pojo;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonPropertyOrder({
        "responseCode",
        "products",
        "message"
})
public class ProductList {

    @JsonProperty("responseCode")
    private int responseCode;

    @JsonProperty("products")
    private List<Product> products;

    @JsonProperty("message")
    private String message;
}
