package com.loc;

import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;

public final class cx extends Exception {

    /* renamed from: a  reason: collision with root package name */
    private String f25726a;

    /* renamed from: b  reason: collision with root package name */
    private String f25727b;

    /* renamed from: c  reason: collision with root package name */
    private String f25728c;

    /* renamed from: d  reason: collision with root package name */
    private String f25729d;

    /* renamed from: e  reason: collision with root package name */
    private int f25730e;

    public cx(String str) {
        super(str);
        this.f25726a = "未知的错误";
        this.f25727b = "";
        this.f25728c = "1900";
        this.f25729d = "UnknownError";
        this.f25730e = -1;
        this.f25726a = str;
        if ("IO 操作异常 - IOException".equals(str)) {
            this.f25730e = 21;
            this.f25728c = "1902";
            this.f25729d = "IOException";
        } else if ("socket 连接异常 - SocketException".equals(str)) {
            this.f25730e = 22;
        } else if ("socket 连接超时 - SocketTimeoutException".equals(str)) {
            this.f25730e = 23;
            this.f25728c = "1802";
            this.f25729d = "SocketTimeoutException";
        } else if ("无效的参数 - IllegalArgumentException".equals(str)) {
            this.f25730e = 24;
            this.f25728c = "1901";
            this.f25729d = "IllegalArgumentException";
        } else if ("空指针异常 - NullPointException".equals(str)) {
            this.f25730e = 25;
            this.f25728c = "1903";
            this.f25729d = "NullPointException";
        } else if ("url异常 - MalformedURLException".equals(str)) {
            this.f25730e = 26;
            this.f25728c = "1803";
            this.f25729d = "MalformedURLException";
        } else if ("未知主机 - UnKnowHostException".equals(str)) {
            this.f25730e = 27;
            this.f25728c = "1804";
            this.f25729d = "UnknownHostException";
        } else if ("服务器连接失败 - UnknownServiceException".equals(str)) {
            this.f25730e = 28;
            this.f25728c = "1805";
            this.f25729d = "CannotConnectToHostException";
        } else if ("协议解析错误 - ProtocolException".equals(str)) {
            this.f25730e = 29;
            this.f25728c = "1801";
            this.f25729d = "ProtocolException";
        } else if ("http连接失败 - ConnectionException".equals(str)) {
            this.f25730e = 30;
            this.f25728c = "1806";
            this.f25729d = "ConnectionException";
        } else if ("未知的错误".equals(str)) {
            this.f25730e = 31;
        } else if ("key鉴权失败".equals(str)) {
            this.f25730e = 32;
        } else if ("requeust is null".equals(str)) {
            this.f25730e = 1;
        } else if ("request url is empty".equals(str)) {
            this.f25730e = 2;
        } else if ("response is null".equals(str)) {
            this.f25730e = 3;
        } else if ("thread pool has exception".equals(str)) {
            this.f25730e = 4;
        } else if ("sdk name is invalid".equals(str)) {
            this.f25730e = 5;
        } else if ("sdk info is null".equals(str)) {
            this.f25730e = 6;
        } else if ("sdk packages is null".equals(str)) {
            this.f25730e = 7;
        } else if ("线程池为空".equals(str)) {
            this.f25730e = 8;
        } else if ("获取对象错误".equals(str)) {
            this.f25730e = BaseLoginOrRegisterActivity.o;
        } else {
            this.f25730e = -1;
        }
    }

    public cx(String str, String str2) {
        this(str);
        this.f25727b = str2;
    }

    public final String a() {
        return this.f25726a;
    }

    public final void a(int i) {
        this.f25730e = i;
    }

    public final String b() {
        return this.f25728c;
    }

    public final String c() {
        return this.f25729d;
    }

    public final String d() {
        return this.f25727b;
    }

    public final int e() {
        return this.f25730e;
    }
}
