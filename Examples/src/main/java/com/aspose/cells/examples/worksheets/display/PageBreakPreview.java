package com.aspose.cells.examples.worksheets.display;

import com.aspose.cells.*;
import com.aspose.cells.examples.Utils;

public class PageBreakPreview {

	public static void main(String[] args) throws Exception {
		// ExStart:1
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(PageBreakPreview.class);

		// Instantiating a Excel object by excel file path
		Workbook workbook = new Workbook(dataDir + "book1.xls");

		// Adding a new worksheet to the Workbook object
		WorksheetCollection worksheets = workbook.getWorksheets();

		Worksheet worksheet = worksheets.get(0);

		// Displaying the worksheet in page break preview
		worksheet.setPageBreakPreview(true);

		// Saving the modified Excel file in default format
		workbook.save(dataDir + "output.xls");

		// Print message
		System.out.println("Page break preview is enabled for sheet 1, please check the output document.");
		// ExEnd:1
	}
}
