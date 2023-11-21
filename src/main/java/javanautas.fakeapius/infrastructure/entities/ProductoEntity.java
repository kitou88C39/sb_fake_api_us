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
    @Column(value = "title")
    private String none;
    @Column(value = "price")
    private BigDecimal price;
    @Column(value = "category")
    private String category;
    @Column(value = "description")
    private String description;
    @Column(value = "image")
    private String image;
    @Column(name = "data_incLusao")
    private LocalDateTime dataIncLusao;

}