package zerobase._2week;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Task {

    private static final String FILE_NAME = "property.html";
    private static final String LINE_SEPARATOR = "\n";
    private static final String ENCODING = "UTF-8";

    public static void main(String[] args) {

        try {
            File file = new File(FILE_NAME);
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write("<!DOCTYPE HTML>" + LINE_SEPARATOR);
            writer.write("<head>" + LINE_SEPARATOR);
            writer.write("  <title>김용환_2주차 과제</title>" + LINE_SEPARATOR);
            writer.write("  <meta charset=" + '"' + ENCODING + '"' + "/>" + LINE_SEPARATOR);
            writer.write("  <style>" + LINE_SEPARATOR);
            writer.write("      table { border-collapse: collapse; width: 100%; }" + LINE_SEPARATOR);
            writer.write("      th, td { border: solid 1px #000; }" + LINE_SEPARATOR);
            writer.write("  </style>" + LINE_SEPARATOR);
            writer.write("</head>" + LINE_SEPARATOR);

            writer.write("<body>" + LINE_SEPARATOR);
            writer.write("  <H1>자바 환경정보</H1>" + LINE_SEPARATOR);
            writer.write("  <table>" + LINE_SEPARATOR);

            writer.write("      <tr>" + LINE_SEPARATOR);
            writer.write("          <th>Key</th>" + LINE_SEPARATOR);
            writer.write("          <th>Value</th>" + LINE_SEPARATOR);
            writer.write("      </tr>" + LINE_SEPARATOR);

            for(Object k : System.getProperties().keySet()) {
                String key = k.toString();
                String value = System.getProperty(key);
                writer.write("      <tr>" + LINE_SEPARATOR);
                writer.write("          <td>" + key + "</td>" + LINE_SEPARATOR);
                writer.write("          <td>" + value + "</td>" + LINE_SEPARATOR);
                writer.write("      </tr>" + LINE_SEPARATOR);
            }

            writer.write("  </table>" + LINE_SEPARATOR);
            writer.write("</body>" + LINE_SEPARATOR);
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
