package com.amap.api.services.a;

import java.util.HashMap;
import java.util.Map;

@cf(a = "file")
public class cu {
    @cg(a = "fname", b = 6)

    /* renamed from: a  reason: collision with root package name */
    private String f6751a;
    @cg(a = "md", b = 6)

    /* renamed from: b  reason: collision with root package name */
    private String f6752b;
    @cg(a = "sname", b = 6)

    /* renamed from: c  reason: collision with root package name */
    private String f6753c;
    @cg(a = "version", b = 6)

    /* renamed from: d  reason: collision with root package name */
    private String f6754d;
    @cg(a = "dversion", b = 6)

    /* renamed from: e  reason: collision with root package name */
    private String f6755e;
    @cg(a = "status", b = 6)

    /* renamed from: f  reason: collision with root package name */
    private String f6756f;

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f6757a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f6758b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f6759c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f6760d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public String f6761e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public String f6762f = "copy";

        public cu a() {
            return new cu(this);
        }

        public a a(String str) {
            this.f6762f = str;
            return this;
        }

        public a(String str, String str2, String str3, String str4, String str5) {
            this.f6757a = str;
            this.f6758b = str2;
            this.f6759c = str3;
            this.f6760d = str4;
            this.f6761e = str5;
        }
    }

    private cu() {
    }

    public String a() {
        return this.f6751a;
    }

    public String b() {
        return this.f6752b;
    }

    public String c() {
        return this.f6753c;
    }

    public String d() {
        return this.f6754d;
    }

    public String e() {
        return this.f6755e;
    }

    public String f() {
        return this.f6756f;
    }

    public void c(String str) {
        this.f6756f = str;
    }

    public static String a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("sname", str);
        return ce.a((Map<String, String>) hashMap);
    }

    public static String b(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("fname", str);
        return ce.a((Map<String, String>) hashMap);
    }

    public cu(a aVar) {
        this.f6751a = aVar.f6757a;
        this.f6752b = aVar.f6758b;
        this.f6753c = aVar.f6759c;
        this.f6754d = aVar.f6760d;
        this.f6755e = aVar.f6761e;
        this.f6756f = aVar.f6762f;
    }

    public static String a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("sname", str);
        hashMap.put("dversion", str2);
        return ce.a((Map<String, String>) hashMap);
    }

    public static String b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("sname", str);
        hashMap.put("status", str2);
        return ce.a((Map<String, String>) hashMap);
    }

    public static String a(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("fname", str);
        hashMap.put("sname", str2);
        hashMap.put("dversion", str4);
        hashMap.put("version", str3);
        return ce.a((Map<String, String>) hashMap);
    }
}
