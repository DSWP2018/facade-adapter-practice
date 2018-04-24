package implementations;

import interfaces.Tables;

public class TableOrganize implements Tables {
    @Override
    public String setCenterpiece() {
        return "Centerpiece set";
    }

    @Override
    public String getClothNapkins() {
        return "Cloth Napkins set";
    }

    @Override
    public String setTableCloth() {
        return "Table Cloth set";
    }
}
