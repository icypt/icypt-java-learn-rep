package com.icypt.learn.controller;

import com.google.gson.Gson;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * platform：www.icypt.com
 * Author：icypt
 * createTime： 2019/4/28 22:27
 * version：1.0
 * description：
 */
@Controller
@RequestMapping("/json")
public class BigDataJsonController {

    @RequestMapping("/jsonData")
    @ResponseBody
    public Object getJsonData(String selectCode, String flag) {
        List<Map<String, Object>> resultList = new ArrayList<>();
        Map<String, Object> ld = null;
        for(int i=0 ; i < 50; i ++) {
            for(int j=0; j < 20; j ++) {
                Map<String, Object> fwObj = null;
                for(int k=0; k < 500; k ++) {
                    fwObj = new HashMap<>();
                    fwObj.put("ldId", "ld"+i);
                    fwObj.put("ldName", i + "号楼");
                    fwObj.put("dyId", i + "-" + j);
                    fwObj.put("dyName", i + "-" + j + "单元");
                    fwObj.put("fwId", i + "-" + j + "-" + k);
                    fwObj.put("fwName", i + "-" + j + "-" + k + "号房");
                    resultList.add(fwObj);
                }
            }
        }
        if("0".equals(flag)) {
            List<Object> dyResult = new ArrayList<>();
            Map<String, Object> obj = null;
            Map<String, Object> dyIdMap= new HashMap<>();
            for(Map<String, Object> o : resultList) {
                obj = new HashMap<>();
                if(o.get("ldId").equals(selectCode) && !dyIdMap.containsKey(o.get("dyId").toString())) {
                    obj.put("id", o.get("dyId"));
                    obj.put("value", o.get("dyName"));
                    dyIdMap.put(o.get("dyId").toString(),o.get("dyId"));
                    dyResult.add(obj);
                }

            }
            return dyResult;
        }

        if("1".equals(flag)) {
            List<Object> fWResult = new ArrayList<>();
            String[] selectCodeArray = selectCode.split(",");
            Map<String, Object> fwMap= null;
            for(Map<String, Object> o : resultList) {
                fwMap = new HashMap<>();
                if(o.get("ldId").equals(selectCodeArray[0]) && o.get("dyId").equals(selectCodeArray[1])) {
                    fwMap.put("id", o.get("fwId"));
                    fwMap.put("value", o.get("fwName"));
                    fWResult.add(fwMap);
                }

            }
            return  fWResult;
        }
        return null;
    }

    @RequestMapping("/getSdData")
    @ResponseBody
    public Object getSdData() {
        List<Object> resultList = new ArrayList<>();
        Map<String, Object> ld = null;
        for(int i=0 ; i < 50; i ++) {
            ld = new HashMap<>();
            ld.put("id", "ld"+i);
            ld.put("value", i + "号楼");
            resultList.add(ld);
        }
        return resultList;
    }

    @RequestMapping("/getDyData")
    @ResponseBody
    public Object getDyData() {
        List<Object>  dyList = new ArrayList<>();
        Map<String, Object> dyObj = null;
        for(int j=0; j < 10; j ++) {
            dyObj= new HashMap<>();
            dyObj.put("id", "dy" + j);
            dyObj.put("value", j + "单元");
            dyList.add(dyObj);
        }
        return dyList;
    }

    @RequestMapping("/getFhData")
    @ResponseBody
    public Object getFhData() {
        List<Object> fwList = new ArrayList<>();
        Map<String, Object> fwObj = null;
        for(int k=0; k < 500; k ++) {
            fwObj = new HashMap<>();
            fwObj.put("id", "fw" + k);
            fwObj.put("value", k + "号房");
            fwList.add(fwObj);
        }
        return fwList;
    }

    @RequestMapping("/goMobileSelect")
    public String goMobileSelect() {
        return "mobileSelect/mobileSelect";
    }
}
