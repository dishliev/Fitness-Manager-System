package fitnessmanagersystem;

import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.io.FileOutputStream;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfContentByte;
import com.lowagie.text.pdf.PdfWriter;
import static fitnessmanagersystem.SearchClient.jTable1_clients;
import java.io.FileNotFoundException;
import javax.swing.table.TableModel;

public class JTable2Pdf extends JFrame {

    private JTable table;

    public JTable2Pdf() {
        getContentPane().setLayout(new BorderLayout());

    }

    // private void createTable() {

    public Object[][] createTable(JTable table) {
        TableModel dtm = table.getModel();
        int nRow = dtm.getRowCount(), nCol = dtm.getColumnCount();
        Object[][] tableData = new Object[nRow][nCol];
        for (int i = 0; i < nRow; i++) {
            for (int j = 0; j < nCol; j++) {
                tableData[i][j] = dtm.getValueAt(i, j);
            }
        }
        return tableData;
    }

    private void print() {
        Document document = new Document(PageSize.A4.rotate());
        try {
            PdfWriter writer = 
                    PdfWriter.getInstance(document, new FileOutputStream
        ("C:\\Users\\DISHLIEV\\Desktop\\jTsdfb11ablwe.pdf"));

            document.open();
            PdfContentByte cb = writer.getDirectContent();      

            cb.saveState();
            Graphics2D g2 = cb.createGraphicsShapes(500, 500);

            Shape oldClip = g2.getClip();
            g2.clipRect(0, 0, 500, 500);

            table.print(g2);
            g2.setClip(oldClip);

            g2.dispose();
            cb.restoreState();
        } catch (FileNotFoundException | DocumentException e) {
            System.err.println(e.getMessage());
        }
        document.close();
    }

    public static void main(String[] args) {
        JTable2Pdf frame = new JTable2Pdf();
        frame.pack();
        frame.setVisible(true);
        frame.print();
    }
}
      

     /* 
      int RowIndex = jTable1.getRowCount();
int ColumnIndex = jTable1.getColumnCount();
Object selectedObject = (Object) jTable1.getModel().getValueAt(RowIndex, ColumnIndex);


   // Object[][] data = {{ "a", "b", "e", 4, false } };
    //String[] columnNames = { "A", "B", "C", "D", "E" };

    table = new JTable(RowIndex, ColumnIndex);

    JPanel tPanel = new JPanel(new BorderLayout());
    tPanel.add(table.getTableHeader(), BorderLayout.NORTH);
    tPanel.add(table, BorderLayout.CENTER);

    getContentPane().add(tPanel, BorderLayout.CENTER);
  }*/