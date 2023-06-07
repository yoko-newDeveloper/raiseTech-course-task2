package loop;

import java.util.ArrayList;
import java.util.List;

public class FamilyExpansion {
    public static void main(String[] args) {
        List<String> familys = new ArrayList<>();

        //　要素を追加
        familys.add("お父さん");
        familys.add("お母さん");
        familys.add("お兄ちゃん");
        familys.add("妹");
        familys.add("猫");

        // 拡張for文
        for (String family : familys) {
            System.out.println(family);
        }
    }
}
