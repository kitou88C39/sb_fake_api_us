package javanautas.fakeapius.infrastructure.entities;

import org.springframework.stereotype.Indexed;

import jakarta.presistence.Entity;
import jakarta.presistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity(name = "ProductoEntity")
@Table(name = "produtos")
@Getter
@Setter
@RequiredArgsConstructor
@Builder

public class ProductoEntity {

    @Id
    @Column(name = "id")
    private String id;

    @JsonProperty(value = "title")
    private String none;
    @JsonProperty(value = "price")
    private BigDecimal price;
    @JsonProperty(value = "category")
    private String category;
    @JsonProperty(value = "description")
    private String description;
    @JsonProperty(value = "image")
    private String image;

}