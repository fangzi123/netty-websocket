package com.even.websocket.msg;

import lombok.Data;

/**
     * 消息对象
     */
@Data
public class MessageInfo {
    //源客户端id
    private String sourceClientId;
    //目标客户端id
    private String targetClientId;
    //消息内容
    private String msg;
    // get/set方法 ....
}