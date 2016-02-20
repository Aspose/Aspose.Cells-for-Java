package com.aspose.cells.examples.asposefeatures.search;

import com.aspose.cells.Cell;
import com.aspose.cells.Cells;
import com.aspose.cells.FindOptions;
import com.aspose.cells.LookAtType;
import com.aspose.cells.Workbook;
import com.aspose.cells.Worksheet;
import com.aspose.cells.examples.Utils;

public class AsposeFindCellsWithString
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AsposeFindCellsWithString.class);

        //Instantiating a Workbook object
        Workbook workbook = new Workbook(dataDir + "workbook.xls");

        //Accessing the first worksheet in the Excel file
        Worksheet worksheet = workbook.getWorksheets().get(0);

        //Finding the cell containing the specified formula
        Cells cells = worksheet.getCells();

        //Instantiate FindOptions
        FindOptions findOptions = new FindOptions();

        //Finding the cell containing a string value that starts with "Or"
        findOptions.setLookAtType(LookAtType.START_WITH);

        Cell cell = cells.find("SH",null,findOptions);

        //Printing the name of the cell found after searching worksheet
        System.out.println("Name of the cell containing String: " + cell.getName());
    }
}
