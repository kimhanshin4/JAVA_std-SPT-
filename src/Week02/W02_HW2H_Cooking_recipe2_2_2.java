package Week02;

import java.util.*;

public class W02_HW2H_Cooking_recipe2_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String CollectionName = sc.nextLine();
        String title = sc.nextLine();

        switch (CollectionName) {
            //↓ List
            case "List":
                ArrayList<String> strList = new ArrayList<>();
                while (true) {
                    // 한 줄 씩 입력 받아서 strList에 저장하게끔
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
                    strList.add(text);
                }
                title = "[ List로 저장된 ♡" + title + "♡ ]"; // 괄호로 감싸준 제목
                System.out.println(title);

                // strList를 한 줄 씩 출력
                for (int i = 0; i < strList.size(); i++) {
                    int num = i + 1;
                    System.out.println(num + ". " + strList.get(i));
                }
                break;

            //↓ Map
            case "Map":
                Map<Integer, String> strMap = new HashMap<>();
                int lineNum = 1;// put()에 index와 입력값을 넣어주기 위한 인덱스 선언

                while (true) {
                    // 한 줄 씩 입력 받아서 strMap에 저장하게끔
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
//                    lineNum = linNum +1;
                    strMap.put(lineNum++, text);
                }
                title = "[ Map으로 저장된 ♡" + title + "♡ ]"; // 괄호로 감싸준 제목
                System.out.println(title);

                // strMap를 한 줄 씩 출력
                for (int i = 0; i < strMap.size(); i++) {
                    int num = i + 1;
                    System.out.println(num + ". " + strMap.get(i + 1)); // 현 i=0, lineNum을 1로 저장했기에 => i+1
                }
                break;

            //↓ Set
            case "Set":
                LinkedHashSet<String> strSet = new LinkedHashSet<>();

                while (true) {
                    // 한 줄 씩 입력 받아서 strMap에 저장하게끔
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
//                    lineNum = linNum +1;
                    strSet.add(text);
                }
                title = "[ Set으로 저장된 ♡" + title + "♡ ]"; // 괄호로 감싸준 제목
                System.out.println(title);

                Iterator iterator = strSet.iterator();

                // strSet를 한 줄 씩 출력
                for (int i = 0; i < strSet.size(); i++) {
                    int num = i + 1;
                    System.out.println(num + ". " + iterator.next()); // 현 i=0, lineNum을 1로 저장했기에 => i+1
                }
                break;

            // List, Map, Set 모두 아닐 경우
            default:
                System.out.println("저장할 수 없는 자료구조입니다.");
        }
    }
}