package club;

import java.util.LinkedList;
import java.io.*;

public class FileHandler {

    private final String fileName = "src/main/java/club/resources/members.csv";
    private final String tempFileName = "src/main/java/club/resources/members.temp";

    public LinkedList<Member> readFile() {
        var m = new LinkedList<Member>();
        String lineRead;
        String[] splitLine;
        Member member;
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            lineRead = reader.readLine();
            while (lineRead != null) {
                splitLine = lineRead.split(", ");
                if(splitLine[0].equals("S")) {
                    member = new SingleClubMember('S', Integer.parseInt(splitLine[1]), splitLine[2], Double.parseDouble(splitLine[3]), Integer.parseInt(splitLine[4]));
                } else {
                    member = new MultiClubMember('M', Integer.parseInt(splitLine[1]), splitLine[2], Double.parseDouble(splitLine[3]), Integer.parseInt(splitLine[4]));
                }
                m.add(member);
                lineRead = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return m;
    }

    public void appendFile(String member) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(member + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void overWriteFile(LinkedList<Member> members) {
        String s;
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(tempFileName, false))) {
            for (int i = 0; i < members.size(); i++) {
                s = members.get(i).toString();
                writer.write(s + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try {
            File f = new File(fileName);
            File tf = new File(tempFileName);
            f.delete();
            tf.renameTo(f);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
