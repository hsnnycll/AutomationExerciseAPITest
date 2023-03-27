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
        "brands",
        "message"
})
public class BrandsList {

    @JsonProperty("responseCode")
    private int responseCode;

    @JsonProperty("brands")
    private List<Brand> brands;

    @JsonProperty("message")
    private String message;


}
