package cn.zchenger.manager.response;

import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 响应对象
 */
public class ServerResponse {
    private static ObjectMapper  mapper= new ObjectMapper();
    private String json;


    void setResult(Object obj){

    }

}
