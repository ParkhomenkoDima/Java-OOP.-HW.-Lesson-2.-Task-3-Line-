package OopHomeWork2.Line;

import java.util.ArrayList;

public class Lines {
    private final ArrayList<Line> lines = new ArrayList<>();

    public final void addLine(Line line) {
        lines.add(line);
    }

    public final double sumAllLinesLength() {
        double sumAllLinesLength = 0;

        for (Line line : lines) {
            sumAllLinesLength += line.lengthCalc();
        }

        return sumAllLinesLength;
    }

    public final Line maxLine() {
        double maxLineLength = 0;
        int counter = -1;


        for (Line line : lines) {
            if (line.lengthCalc() > maxLineLength){
                maxLineLength = line.lengthCalc();
                counter++;
            }
        }

        return lines.get(counter);
    }

}
