// J2.L.P0006 - My Text Editor (MTE)

// Class này để phục vụ cho việc ghi và đọc file bên cái Notepad
// Class này đc tạo thêm dựa vào phút thứ 3:00 trở đi của video hướng dẫn:
// https://www.youtube.com/watch?v=lFkYt2jKrYc

import java.io.File;
import javax.swing.filechooser.FileFilter;

/**
 *
 * @author SE130460
 */
public class FileTypeFilter extends FileFilter
{
    private final String extension;  // Cái đuôi .txt hay .png này nọ, kiểu vậy á!
    private final String description;  // Thật ra ko cần final cũng đc, để sau này thâm nhiều kiểu file nữa cho dễ!

    // Ở đây nó bắt buộc phải có constructor vì 2 cái biến final nó chưa đc khởi tạo gtrị
    public FileTypeFilter(String extension, String description)
    {
        this.extension = extension;
        this.description = description;
    }
    
    @Override
    public boolean accept(File f)
    {
        if (f.isDirectory())
            return true;    // Nếu là 1 thư mục thì mặc định là đúng à??? Là sao nhỉ???
        return f.getName().endsWith(extension);
    }

    @Override
    public String getDescription()
    {
//        return description + String.format(" (*%s)", extension);
        return description + " (*" + extension + ")";   // Tôi nghĩ dòng này tương tự vs dòng trên á!
    }   // Ví dụ: "Text File (*.txt)", "Microsoft Word (*.docx)", kiểu kiểu vậy á!
}