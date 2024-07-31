package chap_13;

import java.io.File;
import java.io.IOException;

public class _03_File {
    public static void main(String[] args) {
        // 파일 생성 + 정보 얻어 오기
        String fileName = "test.txt";
        File file = new File(fileName);
        try {
            file.createNewFile();   // 파일 생성 있다면 그냥 넘어가 덮어쓰기 x
            if(file.exists()){
                System.out.println("파일 이름 : " + file.getName());
                System.out.println("파일 절대 경로 : " + file.getAbsolutePath());
                System.out.println("파일 크기 (Byte) : " + file.length());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
