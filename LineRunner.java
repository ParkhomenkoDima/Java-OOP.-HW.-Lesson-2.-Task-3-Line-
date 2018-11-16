package OopHomeWork2.Line;

public class LineRunner {
/*  Point (точка).
            Свойства: x, y.
    Line (линия).
            Свойства: начальная точка, конечная точка.
            Методы: подсчет длины линии.
    Lines (линии).
            Свойства: список линий.
            Методы: добавление линии, суммарная длина всех линий, нахождение самой длинной линии.
    Клиентский класс LineRunner: протестировать функционал предыдущих классов.*/

    public static void main(String[] args) {
        Lines lines = new Lines();

        lines.addLine(new Line( new Point(0,0), new Point(10,10)));
        lines.addLine(new Line( new Point(0,10), new Point(10,10)));
        lines.addLine(new Line( new Point(10,0), new Point(10,10)));

        System.out.println("Самая длинная линия: " + lines.maxLine());
        System.out.println("Сумма длин всех линий: " + lines.sumAllLinesLength());
    }

}
