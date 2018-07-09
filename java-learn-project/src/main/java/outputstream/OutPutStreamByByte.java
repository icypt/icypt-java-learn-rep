package outputstream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutPutStreamByByte {
    public static void main(String[] args) throws Exception{
        byte[] outputArray = "hello world".getBytes();
        String filePath = "D:\\output.txt";
        OutputStream ops = new FileOutputStream(filePath);
        for(int i=0; i < outputArray.length; i++) {
            ops.write(outputArray[i]);
        }
        ops.close();
        System.out.println("======写入结束========");
    }
}
