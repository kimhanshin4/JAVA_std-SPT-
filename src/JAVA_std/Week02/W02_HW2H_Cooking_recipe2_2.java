package JAVA_std.Week02;

import java.util.*;

public class W02_HW2H_Cooking_recipe2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String CollectionName = sc.next();
        String title = sc.nextLine();

        switch (CollectionName) {
            //↓ List
            case "List":
                ArrayList<String> strList = new ArrayList<>();

                String titleText; // 타이틀용 텍스트를 따로 받기 위한 String 선언!
                titleText = sc.nextLine(); // 타이틀 입력값을 우선적으로 타이틀용 변수에 대입.

                while (true) {
                    // 한 줄 씩 입력 받아서 strList에 저장하게끔

                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
                    strList.add(text);
                }
                titleText = "[ List로 저장된 ♡" + titleText + "♡ ]"; // 괄호로 감싸준 제목 + text와 차별화
                System.out.println(titleText);

                // strList를 한 줄 씩 출력
                for (int i = 0; i < strList.size(); i++) {
                    int num = i + 1;

                    System.out.println(num + ". " + strList.get(i));
                }
                break;

            //↓ Map
            case "Map":
                Map<Integer, String> strMap = new HashMap<>();

                String titleText2; // 타이틀용 텍스트를 따로 받기 위한 String 선언!
                titleText2 = sc.nextLine(); // 타이틀 입력값을 우선적으로 타이틀용 변수에 대입.

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
                titleText2 = "[ Map으로 저장된 ♡" + titleText2 + "♡ ]"; // 괄호로 감싸준 제목 + text와 차별화
                System.out.println(titleText2);

                // strMap를 한 줄 씩 출력
                for (int i = 0; i < strMap.size(); i++) {
                    int num = i + 1;
                    System.out.println(num + ". " + strMap.get(i + 1)); // 현 i=0, lineNum을 1로 저장했기에 => i+1
                }
                break;

            //↓ Set
            case "Set":
                LinkedHashSet<String> strSet = new LinkedHashSet<>();

                String titleText3; // 타이틀용 텍스트를 따로 받기 위한 String 선언!
                titleText3 = sc.nextLine(); // 타이틀 입력값을 우선적으로 타이틀용 변수에 대입.

                while (true) {
                    // 한 줄 씩 입력 받아서 strSet에 저장하게끔
                    String text = sc.nextLine();
                    if (Objects.equals(text, "끝")) {
                        break;
                    }
//                    lineNum = linNum +1;
                    strSet.add(text);
                }
                titleText3 = "[ Set으로 저장된 ♡" + titleText3 + "♡ ]"; // 괄호로 감싸준 제목 + text와 차별화
                System.out.println(titleText3);

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
