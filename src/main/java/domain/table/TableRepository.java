package domain.table;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class TableRepository {
    private static final List<Table> tables = new ArrayList<>();

    static {
        tables.add(new Table(1));
        tables.add(new Table(2));
        tables.add(new Table(3));
        tables.add(new Table(5));
        tables.add(new Table(6));
        tables.add(new Table(8));
    }

    public static List<Table> tables() {
        return Collections.unmodifiableList(tables);
    }

    public static Table findById(int tableNumber) {
        Table findTable = tables.stream()
                .filter(table -> table.getNumber() == tableNumber)
                .findAny()
                .orElseThrow(() -> new NoSuchElementException(String.format("%d는 없는 테이블 번호입니다.", tableNumber)));
        return findTable;
    }
}
