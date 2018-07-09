package outputstream;

import java.io.*;
/**
 * 文件的复制
 * */
public class CopyFile {
    public static void main(String[] args) throws Exception{
        if(args.length != 2) {
            System.out.println("命令行参数输入有误，请检查");
            System.exit(1);
        }
        File fileInput = new File(args[0]);
        File fileOutput = new File(args[1]);

        if(!fileInput.exists()) {
            System.out.println("被复制的文件不存在");
            System.exit(1);
        }

        InputStream inputStream = new FileInputStream(fileInput);
        OutputStream outputStream = new FileOutputStream(fileOutput);


        if(inputStream != null && outputStream != null) {
            int temp = 0;
            while((temp = inputStream.read()) != (-1)) {
                outputStream.write(temp);
            }

        }

        inputStream.close();;
        outputStream.close();


    }
}
