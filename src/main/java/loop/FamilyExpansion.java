package loop;

import java.util.ArrayList;
import java.util.List;

public class FamilyExpansion {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        //　要素を追加
        list.add("お父さん");
        list.add("お母さん");
        list.add("お兄ちゃん");
        list.add("妹");
        list.add("猫");

        // 拡張for文
        for (String str : list) {
            System.out.println(str);
        }
    }
}
