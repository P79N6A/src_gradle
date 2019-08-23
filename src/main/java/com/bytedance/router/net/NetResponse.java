package com.bytedance.router.net;

public class NetResponse {
    public String content = "";
    public int errorCode = -1;

    public String toString() {
        return "[errorCode: " + this.errorCode + ", content:" + this.content + "]";
    }
}
