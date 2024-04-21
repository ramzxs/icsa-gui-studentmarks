import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class MyApp extends JFrame {
    JTable jt;
    JScrollPane jsp = new JScrollPane();

    int MAX = 4;
    Row[] rows = new Row[MAX];
    Object[][] data = new Object[MAX][3];
    String[] cols = { "STUDENT", "MATH", "PHYSICS" };

    public static void main(String[] args) {
        new MyApp();
    }

    public MyApp() {
        this.setTitle("STUDENT MARKS");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        // Objects
        rows[0] = new Row("Jane", 40, 20);
        rows[1] = new Row("Jon", 70, 60);
        rows[2] = new Row("Stewart", 80, 75);
        rows[3] = new Row("Student", 50, 50);

        // Convert array of Rows to 2D array of Objects
        for (int i = 0; i < rows.length; i++) {
            data[i] = new Object[3];
            data[i][0] = rows[i].studentName;
            data[i][1] = rows[i].gradeMath;
            data[i][2] = rows[i].gradePhysics;
        }
        ;

        jt = new JTable(data, cols);
        jsp.setViewportView(jt);

        this.add(jsp);
        this.setVisible(true);
    }
}
