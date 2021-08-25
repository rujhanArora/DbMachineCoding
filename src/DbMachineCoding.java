import main.java.Entities.Cells.Cell;
import main.java.Entities.Cells.IntegerCell;
import main.java.Entities.Cells.StringCell;
import main.java.Entities.Columns.Column;
import main.java.Entities.Columns.IntegerColumn;
import main.java.Entities.Columns.StringColumn;
import main.java.Entities.Constraints.Constraint;
import main.java.Entities.Constraints.IntegerRangeConstraint;
import main.java.Entities.Constraints.StringLengthConstraint;
import main.java.Entities.Row;
import main.java.Entities.Table;
import java.util.ArrayList;
import java.util.List;

public class DbMachineCoding {
    public static void main(String args[]) {
        try {
            List<Column> columns = new ArrayList<>();

            // Constraints to column
            List<Constraint> constraints = new ArrayList<>();
            constraints.add(new IntegerRangeConstraint(-255, 255));
            Column c1 = new IntegerColumn("age", constraints);
            columns.add(c1);

            constraints = new ArrayList<>();
            constraints.add(new StringLengthConstraint());
            Column c2 = new StringColumn("name", constraints);
            columns.add(c2);

            Table users = new Table("users", columns);

            List<Cell> cells = new ArrayList<>();
            cells.add(new IntegerCell(c1, 4));
            cells.add(new StringCell(c2, "rujhan"));

            Long rowId = users.addRow(cells);

            Row row = users.getRowById(rowId);
            if (row != null) {
                row.print();
            }

//            cells = new ArrayList<>();
//            cells.add(new IntegerCell(c1, 300));
//            rowId = users.addRow(cells);
//
//            row = users.getRowById(rowId);
//            if (row != null) {
//                row.print();
//            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
