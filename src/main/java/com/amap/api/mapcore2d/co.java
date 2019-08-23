package com.amap.api.mapcore2d;

import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;

public class co extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private String f5845a;

    /* renamed from: b  reason: collision with root package name */
    private String f5846b;

    /* renamed from: c  reason: collision with root package name */
    private String f5847c;

    /* renamed from: d  reason: collision with root package name */
    private String f5848d;

    /* renamed from: e  reason: collision with root package name */
    private int f5849e;

    public String a() {
        return this.f5845a;
    }

    public String b() {
        return this.f5847c;
    }

    public String c() {
        return this.f5848d;
    }

    public String d() {
        return this.f5846b;
    }

    public int e() {
        return this.f5849e;
    }

    public co(String str) {
        super(str);
        this.f5845a = "未知的错误";
        this.f5846b = "";
        this.f5847c = "1900";
        this.f5848d = "UnknownError";
        this.f5849e = -1;
        this.f5845a = str;
        a(str);
    }

    private void a(String str) {
        if ("IO 操作异常 - IOException".equals(str)) {
            this.f5849e = 21;
            this.f5847c = "1902";
            this.f5848d = "IOException";
        } else if ("socket 连接异常 - SocketException".equals(str)) {
            this.f5849e = 22;
        } else if ("socket 连接超时 - SocketTimeoutException".equals(str)) {
            this.f5849e = 23;
            this.f5847c = "1802";
            this.f5848d = "SocketTimeoutException";
        } else if ("无效的参数 - IllegalArgumentException".equals(str)) {
            this.f5849e = 24;
            this.f5847c = "1901";
            this.f5848d = "IllegalArgumentException";
        } else if ("空指针异常 - NullPointException".equals(str)) {
            this.f5849e = 25;
            this.f5847c = "1903";
            this.f5848d = "NullPointException";
        } else if ("url异常 - MalformedURLException".equals(str)) {
            this.f5849e = 26;
            this.f5847c = "1803";
            this.f5848d = "MalformedURLException";
        } else if ("未知主机 - UnKnowHostException".equals(str)) {
            this.f5849e = 27;
            this.f5847c = "1804";
            this.f5848d = "UnknownHostException";
        } else if ("服务器连接失败 - UnknownServiceException".equals(str)) {
            this.f5849e = 28;
            this.f5847c = "1805";
            this.f5848d = "CannotConnectToHostException";
        } else if ("协议解析错误 - ProtocolException".equals(str)) {
            this.f5849e = 29;
            this.f5847c = "1801";
            this.f5848d = "ProtocolException";
        } else if ("http连接失败 - ConnectionException".equals(str)) {
            this.f5849e = 30;
            this.f5847c = "1806";
            this.f5848d = "ConnectionException";
        } else if ("未知的错误".equals(str)) {
            this.f5849e = 31;
        } else if ("key鉴权失败".equals(str)) {
            this.f5849e = 32;
        } else if ("requeust is null".equals(str)) {
            this.f5849e = 1;
        } else if ("request url is empty".equals(str)) {
            this.f5849e = 2;
        } else if ("response is null".equals(str)) {
            this.f5849e = 3;
        } else if ("thread pool has exception".equals(str)) {
            this.f5849e = 4;
        } else if ("sdk name is invalid".equals(str)) {
            this.f5849e = 5;
        } else if ("sdk info is null".equals(str)) {
            this.f5849e = 6;
        } else if ("sdk packages is null".equals(str)) {
            this.f5849e = 7;
        } else if ("线程池为空".equals(str)) {
            this.f5849e = 8;
        } else if ("获取对象错误".equals(str)) {
            this.f5849e = BaseLoginOrRegisterActivity.o;
        } else {
            this.f5849e = -1;
        }
    }

    public co(String str, String str2) {
        this(str);
        this.f5846b = str2;
    }
}
