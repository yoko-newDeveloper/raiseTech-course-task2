package loop;

import java.util.ArrayList;
import java.util.List;

public class FamilyExpansion {
    public static void main(String[] args) {
        List<String> family = new ArrayList<>();

        //　要素を追加
        family.add("お父さん");
        family.add("お母さん");
        family.add("お兄ちゃん");
        family.add("妹");
        family.add("猫");

        // 拡張for文
        for (String member : family) {
            System.out.println(member);
        }
    }
}
