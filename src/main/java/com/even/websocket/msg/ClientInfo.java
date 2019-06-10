package com.even.websocket.msg;

import lombok.Data;

import java.util.Date;
/**
 * socket会话信息
 */
@Data
public class ClientInfo {
        private String clientId;
        private boolean isOnline;
        private long mostSignificantBits;
        private long leastSignificantBits;
        private Date lastConnectedTime;
        // get/set方法 ....
    }