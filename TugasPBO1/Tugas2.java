import javax.swing.JOptionPane;

public class Tugas2 {
    public static void main(String[] args) {

        // Input (kotak pertanyaan)
        String belajar = JOptionPane.showInputDialog("Anda sedang belajar apa?");

        // Output (popup message)
        JOptionPane.showMessageDialog(null, "Belajar " + belajar + " sangat mudah");
    }
}