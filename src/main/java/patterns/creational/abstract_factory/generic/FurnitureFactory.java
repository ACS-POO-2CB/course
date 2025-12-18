package patterns.creational.abstract_factory.generic;


import java.util.ArrayList;
import java.util.List;

public interface FurnitureFactory {
    Chair createChair();

    Table createTable();

    default List<Object>  getDefaultOrder() {
        return List.of(createTable(),createChair(),createChair());
    }
}
