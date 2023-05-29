package loop;

import java.util.ArrayList;
import java.util.List;

public class ZooList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        // リストに要素を追加する
        list.add("ライオン");
        list.add("パンダ");
        list.add("ゾウ");
        list.add("クマ");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
