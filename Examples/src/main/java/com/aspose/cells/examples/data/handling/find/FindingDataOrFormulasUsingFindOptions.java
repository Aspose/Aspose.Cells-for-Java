package com.aspose.cells.examples.data.handling.find;

import com.aspose.cells.*;
import com.aspose.cells.examples.Utils;

public class FindingDataOrFormulasUsingFindOptions {

	public static void main(String[] args) throws Exception {
		// ExStart:FindingDataOrFormulasUsingFindOptions
		// The path to the documents directory.
		String dataDir = Utils.getSharedDataDir(FindingDataOrFormulasUsingFindOptions.class) + "data/";

		// Instantiating a Workbook object
		Workbook workbook = new Workbook(dataDir + "book1.xls");

		// Accessing the first worksheet in the Excel file
		Worksheet worksheet = workbook.getWorksheets().get(0);

		// Finding the cell containing the specified formula
		Cells cells = worksheet.getCells();

		// Instantiate FindOptions
		FindOptions findOptions = new FindOptions();

		// Finding the cell with a formula that contains an input string
		findOptions.setLookAtType(LookAtType.CONTAINS);
		Cell cell = cells.find("SUM", null, findOptions);

		// Printing the name of the cell found after searching worksheet
		System.out.println("Name of the cell containing String: " + cell.getName());
		// ExEnd:FindingDataOrFormulasUsingFindOptions
	}
}
