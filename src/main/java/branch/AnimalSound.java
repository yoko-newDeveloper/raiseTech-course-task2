package branch;

import java.util.ArrayList;
import java.util.List;

public class AnimalSound {
    public static void main(String[] args) {
        List<List<String>> animalSounds = new ArrayList<>();
        animalSounds.add(List.of("1", "わん！", "犬"));
        animalSounds.add(List.of("2", "にゃー！", "猫"));
        animalSounds.add(List.of("3", "ぴよ！", "鳥"));

        // コマンドライン引数で数値を入力する
        if (args.length == 0) {
            System.out.println("何も入力されていません。引数を入力してください。");
            return;
        }

        String input = args[0];
        boolean found = false;

        for (List<String> animalSound : animalSounds) {
            if (animalSound.get(0).equals(input)) {
                String sound = animalSound.get(1);
                String animal = animalSound.get(2);
                System.out.println("鳴き声：" + sound + " 動物：" + animal);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("他の動物です。");
        }
    }
}