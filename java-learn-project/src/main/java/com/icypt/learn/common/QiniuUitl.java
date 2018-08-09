package com.icypt.learn.common;

import com.google.gson.Gson;
import com.qiniu.common.QiniuException;
import com.qiniu.common.Zone;
import com.qiniu.http.Response;
import com.qiniu.storage.Configuration;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;

import java.io.UnsupportedEncodingException;

public class QiniuUitl {
    public static final String ACCESS_KEY = "3Wkog8GNaAhgKNYuXAslVLQmDUNxu-niGYTWMWXe";
    public static final String SECRET_KEY = "7uJaIXJ2I2UppENp5w4zACpkDm3JmBoaipHUruNf";
    public static final String BUCKET = "java-core";

    /**
     *
     * @param key 文件名称
     * @param uploadData 要上传的文件
     */
    public static void uploadFileByBateArray(String key, byte[] uploadData) {
        Configuration cfg = new Configuration(Zone.zone0());
        UploadManager uploadManager = new UploadManager(cfg);
        Auth auth = Auth.create(ACCESS_KEY, SECRET_KEY);
        String upToken = auth.uploadToken(BUCKET);
        try {
            Response response = uploadManager.put(uploadData, key, upToken);
            //解析上传成功的结果
            DefaultPutRet putRet = new Gson().fromJson(response.bodyString(), DefaultPutRet.class);
            System.out.println(putRet.key);
            System.out.println(putRet.hash);
        } catch (QiniuException ex) {
            Response r = ex.response;
            System.err.println(r.toString());
            try {
                System.err.println(r.bodyString());
            } catch (QiniuException ex2) {
                //ignore
            }
        }

    }
}
