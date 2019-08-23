package com.amap.api.mapcore2d;

import java.util.HashMap;
import java.util.Map;

@dn(a = "file")
public class ei {
    @Cdo(a = "fname", b = 6)

    /* renamed from: a  reason: collision with root package name */
    private String f6026a;
    @Cdo(a = "md", b = 6)

    /* renamed from: b  reason: collision with root package name */
    private String f6027b;
    @Cdo(a = "sname", b = 6)

    /* renamed from: c  reason: collision with root package name */
    private String f6028c;
    @Cdo(a = "version", b = 6)

    /* renamed from: d  reason: collision with root package name */
    private String f6029d;
    @Cdo(a = "dversion", b = 6)

    /* renamed from: e  reason: collision with root package name */
    private String f6030e;
    @Cdo(a = "status", b = 6)

    /* renamed from: f  reason: collision with root package name */
    private String f6031f;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f6032a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f6033b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f6034c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f6035d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public String f6036e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public String f6037f = "copy";

        public ei a() {
            return new ei(this);
        }

        public a a(String str) {
            this.f6037f = str;
            return this;
        }

        public a(String str, String str2, String str3, String str4, String str5) {
            this.f6032a = str;
            this.f6033b = str2;
            this.f6034c = str3;
            this.f6035d = str4;
            this.f6036e = str5;
        }
    }

    private ei() {
    }

    public String a() {
        return this.f6026a;
    }

    public String b() {
        return this.f6027b;
    }

    public String c() {
        return this.f6028c;
    }

    public String d() {
        return this.f6029d;
    }

    public String e() {
        return this.f6030e;
    }

    public String f() {
        return this.f6031f;
    }

    public void c(String str) {
        this.f6031f = str;
    }

    public static String a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("sname", str);
        return dm.a((Map<String, String>) hashMap);
    }

    public static String b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("fname", str);
        return dm.a((Map<String, String>) hashMap);
    }

    public ei(a aVar) {
        this.f6026a = aVar.f6032a;
        this.f6027b = aVar.f6033b;
        this.f6028c = aVar.f6034c;
        this.f6029d = aVar.f6035d;
        this.f6030e = aVar.f6036e;
        this.f6031f = aVar.f6037f;
    }

    public static String a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("sname", str);
        hashMap.put("dversion", str2);
        return dm.a((Map<String, String>) hashMap);
    }

    public static String b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("sname", str);
        hashMap.put("status", str2);
        return dm.a((Map<String, String>) hashMap);
    }

    public static String a(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("fname", str);
        hashMap.put("sname", str2);
        hashMap.put("dversion", str4);
        hashMap.put("version", str3);
        return dm.a((Map<String, String>) hashMap);
    }
}
