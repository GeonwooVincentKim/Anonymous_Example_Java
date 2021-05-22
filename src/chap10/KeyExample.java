package chap10;

import java.util.HashMap;

import static java.lang.System.out;

public class KeyExample {
    public static void main(String[] args) {
        HashMap<Key, String> hashMap = new HashMap<Key, String>();
        // out.print(hashMap);
        out.print(hashMap.put(new Key(1), "홍길동"));
    }
}
