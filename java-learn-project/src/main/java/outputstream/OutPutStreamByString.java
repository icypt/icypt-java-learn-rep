package outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutPutStreamByString {
    public static void main(String[] args) throws Exception{
        String output = "hello world";
        String filePath = "D:\\output.txt";
        OutputStream ops = new FileOutputStream(filePath);
        ops.write(output.getBytes());
        ops.close();
        System.out.println("======写入结束========");
    }
}
