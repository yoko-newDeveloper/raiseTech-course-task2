package loop;

import java.util.ArrayList;
import java.util.List;

public class ZooList {
    public static void main(String[] args) {
        List<String> animals = new ArrayList<>();

        // リストに要素を追加する
        animals.add("ライオン");
        animals.add("パンダ");
        animals.add("ゾウ");
        animals.add("クマ");

        for (String zoo : animals) {
            System.out.println(zoo);
        }
    }
}
