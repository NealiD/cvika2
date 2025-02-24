import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        System.out.println((new Fraction(1400,150).toString()));
        System.out.println(new Fraction(52440,3620));
        System.out.println(new Fraction(1300,1260));
        File inputDir=new File("C:/data/input");
        File[] inputFiles= inputDir.listFiles();
        for(File inputFile : inputFiles)
        {
            System.out.println("Reading "+inputFile);
            ExamRecord[] records = readInputFile(inputFile.toPath());
            //System.out.println("Ukázka: "+records[0].getName());
        }
    }
    public static ExamRecord[] readInputFile(Path path)
    {
        List<String> lines = Files.readAllLines(path);
        List<ExamRecord> resultList = new ArrayList<>();
        for(String line : lines)
        {
            String[] split= line.split("[:=;]");
            resultList.add(new ExamRecord(
                    Fraction.parse(split[1]),
                    split[0]
                        ));
        }
        return resultList.toArray(new ExamRecord[0]);
    }

}
