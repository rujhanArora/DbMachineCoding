package main.java.Entities.Columns;

import main.java.Entities.DataType;
import main.java.Entities.Exceptions.InvalidConstraintException;

import main.java.Entities.Cells.Cell;
import main.java.Entities.Constraints.Constraint;
import main.java.Entities.Exceptions.InvalidColumnNameException;

import java.util.ArrayList;
import java.util.List;

public class Column {
    private String name;

    // List of constraints applied
    List<Constraint> constraints;

    // Datatype
    DataType dataType;

    public Column(String name, DataType dataType, List<Constraint> constraints) throws InvalidColumnNameException {
        // Some basic validation. Can add more in future as well
        if (name == null || name == "") {
            // the message can be better suited in production code
            throw new InvalidColumnNameException("Invalid column name");
        }
        this.name = name;
        this.constraints = (constraints == null) ? new ArrayList<>() : constraints;
    }

    public String getName() {
        return this.name;
    }
    public void addConstraint() {}

    public void removeConstraint() {}

    public void validate(Cell cell) throws InvalidConstraintException {
        for (Constraint constraint : constraints) {
            constraint.validateCell(cell);
        }
    }
}


shivansh.gaur@razorpay.com