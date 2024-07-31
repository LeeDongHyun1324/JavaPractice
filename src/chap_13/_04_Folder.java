package chap_13;

import java.io.File;

public class _04_Folder {
    public static void main(String[] args) {
        String folderName = "A";
        File folder = new File(folderName);

        folder.mkdir(); //폴더 생성
        if (folder.exists()){
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        }

        System.out.println("=====================================================");
        folderName = "A\\B\\C";

        // 윈도우 : C:\Users\lgf06\OneDrive\바탕 화면\
        // 맥 : /Users/lgf06/OneDrive

        folder = new File(folderName);
        // folder.mkdir(); 폴더 1개만 생성
        folder.mkdirs();
        if (folder.exists()){
            System.out.println("폴더가 존재합니다 : " + folder.getAbsolutePath());
        }else{
            System.out.println("폴더 생성 실패 (mkdirs)");
        }
    }
}
