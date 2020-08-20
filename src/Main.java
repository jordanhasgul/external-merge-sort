import java.nio.file.Path;
import java.nio.file.Paths;

public class Main
{
    public static void main(String[] args) throws Exception
    {
        Path fromPath = Paths.get(args[1]);
        Path toPath = Paths.get(args[2]);

        switch (args[0])
        {
            case "copy":
                CsvUtils.copyCsv(fromPath, toPath);
                break;
            case "sort":
                String columnName = args[3];
                CsvUtils.sortCsv(fromPath, toPath, columnName);
                break;
        }
    }
}
