package main.java.Entities;

import main.java.Entities.Cells.Cell;

import java.util.List;

public class Row {
    private long id;
    private List<Cell> cells;

    public Row( List<Cell> cells, long id) {
        this.id = id;
        this.cells = cells;
    }

    public long getId() {
        return id;
    }

    public void print() {
        System.out.println("id: " + id);
        for (Cell cell: cells) {
            cell.print();
        }
    }
}
