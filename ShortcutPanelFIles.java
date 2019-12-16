import javax.swing.*;
import javax.swing.filechooser.FileSystemView;
import java.io.File;

public class ShortcutPanelFIles {
    public static void main(String[] args) throws Exception {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        JFileChooser chooser = new JFileChooser();
        FileSystemView view = chooser.getFileSystemView();
        System.out.println("The shortcut panel files: ");
        File[] chooserShortcutPanelFiles = view.getChooserShortcutPanelFiles();
        for (File chooserShortcutPanelFile : chooserShortcutPanelFiles) {
            System.out.println(chooserShortcutPanelFile);
        }
        chooser.showOpenDialog(null);
    }
}