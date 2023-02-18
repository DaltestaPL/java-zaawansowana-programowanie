package org.sda.task24_25;

import java.util.ArrayList;
import java.util.List;

/**
 * Stwórz klasę Basket, która imituje koszyk i przechowuje aktualną ilość elementów w koszyku.
 * Dodaj metodę addToBasket(),
 * która dodaje element do koszyka (zwiększając aktualny stan o 1) oraz metodę removeFromBasket(),
 * która usuwa element z koszyka (zmniejszając aktualny stan o 1).
 *
 * Koszyk może przechowywać od 0 do 10 elementów.
 * W przypadku, kiedy użytkownik chce wykonać akcję usunięcia przy stanie 0 lub dodania przy stanie 10,
 * rzuć odpowiedni runtime exception (BasketFullException lub BasketEmptyException).
 */
public class Basket {

    private final int MAX_ELEMENTS = 10;
    private final int MIN_ELEMENTS = 0;
    private List<String> elements;

    public Basket() {
        this.elements = new ArrayList<>();
    }

    public void setElements(List<String> elements) {
        this.elements = elements;
    }

    public void addToBasket(String element) {
        if (elements.size() == MAX_ELEMENTS) {
            throw new BasketFullException("Kosz jest pełny");
        }
        elements.add(element);
    }

    public void removeFromBasket(String element) {
        if (elements.size() == MIN_ELEMENTS) {
            throw new BasketEmptyException("Kosz jest już pusty");
        }
        elements.remove(element);
    }

    public void removeFromBasketWithCheckedException(String element) throws BasketEmptyCheckedException {
        if (elements.size() == MIN_ELEMENTS) {
            throw new BasketEmptyCheckedException("Kosz jest już pusty");
        }
        elements.remove(element);
    }

}
