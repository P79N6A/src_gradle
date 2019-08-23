package com.toutiao.proxyserver.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80002a;

    /* renamed from: b  reason: collision with root package name */
    public String f80003b;

    /* renamed from: c  reason: collision with root package name */
    public String f80004c;

    /* renamed from: d  reason: collision with root package name */
    public String f80005d;

    /* renamed from: e  reason: collision with root package name */
    public String f80006e;

    /* renamed from: f  reason: collision with root package name */
    public String f80007f;
    public String g;
    public String h;
    public String i;
    public long j;
    public int k;
    public Map<String, String> l;

    public String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f80002a, false, 91773, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f80002a, false, 91773, new Class[0], String.class);
        }
        return "RequestModel{key='" + this.f80003b + '\'' + ", hostName='" + this.f80004c + '\'' + ", dnsAddr='" + this.f80005d + '\'' + ", originUrl='" + this.f80006e + '\'' + ", finalUrl='" + this.f80007f + '\'' + ", localIp='" + this.g + '\'' + ", remoteIp='" + this.h + '\'' + ", userAgent='" + this.i + '\'' + '}';
    }
}
