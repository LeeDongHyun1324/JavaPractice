package chap_10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class _05_Stream {
    public static void main(String[] args) {
        // 스트림 생성

        //Arrays.stream
        int[] scores = {100, 95, 90, 85, 80};
        IntStream scoreStream = Arrays.stream(scores);

        String[] langs = {"Java", "Python", "C#", "C++", "PHP", "Javascript"};
        //Arrays.stream(langs);
        Stream<String> langStream = Arrays.stream(langs);

        //Collection.stream()
        List<String> langList = new ArrayList<>();
        langList = Arrays.asList("Java", "Python", "C#", "C++", "PHP", "Javascript");
        // System.out.println(langList.size());
        Stream<String> langListStream = langList.stream();

        // Stream.of()
        Stream<String> langListOfStream = Stream.of("Java", "Python", "C#", "C++", "PHP", "Javascript");

        // 스트림 사용
        // 중간 연산 (Intermediate Operation) : filter, map, sorted, distinct, skip , ....
        // 최종 연산 (Terminal Operation) : count, min, max, sum, forEach, anyMatch, allMatch, ...

        // 90점 이상인 점수만 출력
        Arrays.stream(scores).filter(x -> x >= 90).forEach(x -> System.out.println(x));
        // Arrays.stream(scores).filter(x -> x >= 90).forEach(System.out::println);
        System.out.println("=============================");

        // 90점 이상인 사람의 수
        int count = (int)Arrays.stream(scores).filter(x -> x >= 90).count();
        System.out.println(count);
        System.out.println("=============================");

        // 90점 이상인 점수들의 합
        int sum = Arrays.stream(scores).filter(x -> x >= 90).sum();
        System.out.println("sum = " + sum);
        System.out.println("=============================");

        // 90점 이상인 점수들을 정렬
        Arrays.stream(scores).filter(x -> x >= 90).sorted().forEach(System.out::println);
        System.out.println("=============================");

        // "Java", "Python", "C#", "C++", "PHP"
        // C 로 시작하는 프로그래밍 언어
        Arrays.stream(langs).filter(x -> x.startsWith("C")).forEach(System.out::println);
        System.out.println("=============================");

        // Java 라는 글자를 포함하는 언어
        Arrays.stream(langs).filter(x -> x.contains("Java")).forEach(System.out::println);

        System.out.println("=============================");

        // 4글자 이하의 언어를 정렬해서 출력
        langList.stream().filter(x -> x.length() <= 4).sorted().forEach(System.out::println);
        System.out.println("=============================");

        // 4글자 이하의 언어 중에서 C라는 글자를 포함하는 언어
        langList.stream()
                .filter(x -> x.length() <= 4)
                .filter(x -> x.contains("C"))
                .forEach(System.out::println);
        System.out.println("=============================");

        // 4글자 이하의 언어 중에서 C라는 글자를 포함하는 언어가 하나라도 있는지 여부
        boolean anyMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .anyMatch(x -> x.contains("C"));
        System.out.println(anyMatch);
        System.out.println("=============================");

        // 4글자 이하의 언어들은 모두 C라는 글자를 포함하는지 여부
        boolean allMatch = langList.stream()
                .filter(x -> x.length() <= 4)
                .allMatch(x -> x.contains("C"));
        System.out.println(allMatch);
        System.out.println("=============================");

        // 4글자 이하의 언어 중에서 C라는 글자를 포함하는 언어 뒤에 (어려워요) 라는 글자를 함께 출력
        // map
        langList.stream().filter(x -> x.length() <= 4)
                .filter(x -> x.contains("C"))
                .map(x -> x + "(어려워요)")
                .forEach(System.out::println);
        System.out.println("=============================");

        // C라는 글자를 포함하는 언어를 소문자로 출력
        langList.stream()
                .filter(x -> x.contains("C"))
                .map(String::toLowerCase)
                .forEach(System.out::println);
        System.out.println("=============================");

        // C라는 글자를 포함하는 언어를 소문자로 변경하여 리스트로 저장
        List<String> langListStartWithC = langList.stream()
                .filter(x -> x.contains("C"))
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        langListStartWithC.stream().forEach(System.out::println);
        System.out.println("=============================");

    }
}
