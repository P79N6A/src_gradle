package com.amap.api.services.a;

import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;

public class be extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private String f6582a;

    /* renamed from: b  reason: collision with root package name */
    private String f6583b;

    /* renamed from: c  reason: collision with root package name */
    private String f6584c;

    /* renamed from: d  reason: collision with root package name */
    private String f6585d;

    /* renamed from: e  reason: collision with root package name */
    private int f6586e;

    public String a() {
        return this.f6582a;
    }

    public String b() {
        return this.f6584c;
    }

    public String c() {
        return this.f6585d;
    }

    public String d() {
        return this.f6583b;
    }

    public void a(int i) {
        this.f6586e = i;
    }

    public be(String str) {
        super(str);
        this.f6582a = "未知的错误";
        this.f6583b = "";
        this.f6584c = "1900";
        this.f6585d = "UnknownError";
        this.f6586e = -1;
        this.f6582a = str;
        a(str);
    }

    private void a(String str) {
        if ("IO 操作异常 - IOException".equals(str)) {
            this.f6586e = 21;
            this.f6584c = "1902";
            this.f6585d = "IOException";
        } else if ("socket 连接异常 - SocketException".equals(str)) {
            this.f6586e = 22;
        } else if ("socket 连接超时 - SocketTimeoutException".equals(str)) {
            this.f6586e = 23;
            this.f6584c = "1802";
            this.f6585d = "SocketTimeoutException";
        } else if ("无效的参数 - IllegalArgumentException".equals(str)) {
            this.f6586e = 24;
            this.f6584c = "1901";
            this.f6585d = "IllegalArgumentException";
        } else if ("空指针异常 - NullPointException".equals(str)) {
            this.f6586e = 25;
            this.f6584c = "1903";
            this.f6585d = "NullPointException";
        } else if ("url异常 - MalformedURLException".equals(str)) {
            this.f6586e = 26;
            this.f6584c = "1803";
            this.f6585d = "MalformedURLException";
        } else if ("未知主机 - UnKnowHostException".equals(str)) {
            this.f6586e = 27;
            this.f6584c = "1804";
            this.f6585d = "UnknownHostException";
        } else if ("服务器连接失败 - UnknownServiceException".equals(str)) {
            this.f6586e = 28;
            this.f6584c = "1805";
            this.f6585d = "CannotConnectToHostException";
        } else if ("协议解析错误 - ProtocolException".equals(str)) {
            this.f6586e = 29;
            this.f6584c = "1801";
            this.f6585d = "ProtocolException";
        } else if ("http连接失败 - ConnectionException".equals(str)) {
            this.f6586e = 30;
            this.f6584c = "1806";
            this.f6585d = "ConnectionException";
        } else if ("未知的错误".equals(str)) {
            this.f6586e = 31;
        } else if ("key鉴权失败".equals(str)) {
            this.f6586e = 32;
        } else if ("requeust is null".equals(str)) {
            this.f6586e = 1;
        } else if ("request url is empty".equals(str)) {
            this.f6586e = 2;
        } else if ("response is null".equals(str)) {
            this.f6586e = 3;
        } else if ("thread pool has exception".equals(str)) {
            this.f6586e = 4;
        } else if ("sdk name is invalid".equals(str)) {
            this.f6586e = 5;
        } else if ("sdk info is null".equals(str)) {
            this.f6586e = 6;
        } else if ("sdk packages is null".equals(str)) {
            this.f6586e = 7;
        } else if ("线程池为空".equals(str)) {
            this.f6586e = 8;
        } else if ("获取对象错误".equals(str)) {
            this.f6586e = BaseLoginOrRegisterActivity.o;
        } else {
            this.f6586e = -1;
        }
    }

    public be(String str, String str2) {
        this(str);
        this.f6583b = str2;
    }
}
