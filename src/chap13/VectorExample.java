package chap13;

import java.util.List;
import java.util.Vector;

import static java.lang.System.out;

public class VectorExample {
    public static void main(String[] args) {
        List<Board> list = new Vector<Board>();
        out.println(list);

        list.add(new Board("제목1", "내용1", "글쓴이"));
        out.println(list);
    }
}
