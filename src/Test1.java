
import java.awt.*;

import java.awt.print.*;

public class Test1

implements Printable {

	private static Font fnt = new Font("Helvetica", Font.PLAIN, 24);

	public static void main(String[] args) {

		// Get a PrinterJob

		PrinterJob job = PrinterJob.getPrinterJob();

		// Specify the Printable is an instance of SimplePrint

		job.setPrintable(new Test1());

		// Put up the dialog box

		if (job.printDialog()) {

			// Print the job if the user didn't cancel printing

			try {

				job.print();

			}

			catch (Exception e) {

				/* handle exception */}

		}

		System.exit(0);

	}

	public int print(Graphics g, PageFormat pf, int pageIndex) throws

	PrinterException {

		// pageIndex 0 to 4 corresponds to page numbers 1 to 5.

		if (pageIndex >= 1) {

			return Printable.NO_SUCH_PAGE;

		}

		g.setFont(fnt);

		g.setColor(Color.green);

		g.drawString("Page " + (pageIndex + 1), 100, 100);

		g.drawRect(200, 200, 400, 300);

		return Printable.PAGE_EXISTS;

	}

}
