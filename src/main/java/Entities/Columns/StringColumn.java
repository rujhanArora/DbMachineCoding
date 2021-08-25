package main.java.Entities.Columns;

import main.java.Entities.Constraints.Constraint;
import main.java.Entities.DataType;
import main.java.Entities.Exceptions.InvalidColumnNameException;
import java.util.List;

public class StringColumn extends Column {
    public StringColumn(String name, List<Constraint> constraints) throws InvalidColumnNameException {
        super(name, DataType.STRING, constraints);
        // Add a list of permissible constraints as well, in future
    }
}
