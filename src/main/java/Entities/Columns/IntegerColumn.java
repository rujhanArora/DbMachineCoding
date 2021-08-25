package main.java.Entities.Columns;

import main.java.Entities.Constraints.Constraint;
import main.java.Entities.DataType;
import main.java.Entities.Exceptions.InvalidColumnNameException;
import java.util.List;

public class IntegerColumn extends Column {
    public IntegerColumn(String name, List<Constraint> constraints) throws InvalidColumnNameException {
        super(name, DataType.INTEGER, constraints);
        // Add a list of permissible constraints as well, in future
    }
}
