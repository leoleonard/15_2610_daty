package two;

import org.apache.commons.io.FileUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Calculations {
    public static void main(String[] args) throws IOException {

        File file = new File("src/two/zestawienia.csv");
        List<String> lines = FileUtils.readLines(file, "UTF-8");
        System.out.println(lines);

        List<String> values = new ArrayList<>();
    }
}
