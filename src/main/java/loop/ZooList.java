package loop;

import java.util.ArrayList;
import java.util.List;

public class ZooList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // リストに要素を追加する
        list.add("ライオン");
        list.add("パンダ");
        list.add("ゾウ");
        list.add("クマ");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
