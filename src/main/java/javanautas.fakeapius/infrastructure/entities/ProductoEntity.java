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
@NoArgsConstructor ＠AllArgsConstructor
@Builder

public class ProductoEntity {

    @Id
    @Column(name = "id")
    private String id;
    @Column(value = "title", length = 800)
    private String none;
    @Column(value = "price")
    private BigDecimal price;
    @Column(value = "category", length = 800)
    private String category;
    @Column(value = "description", length = 800)
    private String description;
    @Column(value = "image")
    private String image;
    @Column(name = "data_incLusao", length = 800)
    private LocalDateTime dataIncLusao;

}