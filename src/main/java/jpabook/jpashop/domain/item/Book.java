package jpabook.jpashop.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.DiscriminatorValue;

@Getter
@Setter
@DiscriminatorValue("B")
public class Book  extends Item{

    private String author;

    private String isbn;

}
