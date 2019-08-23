package com.loc;

import java.util.HashMap;
import java.util.Map;

@ao(a = "file")
public class aa {
    @ap(a = "fname", b = 6)

    /* renamed from: a  reason: collision with root package name */
    public String f25392a;
    @ap(a = "md", b = 6)

    /* renamed from: b  reason: collision with root package name */
    public String f25393b;
    @ap(a = "sname", b = 6)

    /* renamed from: c  reason: collision with root package name */
    public String f25394c;
    @ap(a = "version", b = 6)

    /* renamed from: d  reason: collision with root package name */
    public String f25395d;
    @ap(a = "dversion", b = 6)

    /* renamed from: e  reason: collision with root package name */
    public String f25396e;
    @ap(a = "status", b = 6)

    /* renamed from: f  reason: collision with root package name */
    public String f25397f;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        String f25398a;

        /* renamed from: b  reason: collision with root package name */
        String f25399b;

        /* renamed from: c  reason: collision with root package name */
        String f25400c;

        /* renamed from: d  reason: collision with root package name */
        String f25401d;

        /* renamed from: e  reason: collision with root package name */
        String f25402e;

        /* renamed from: f  reason: collision with root package name */
        String f25403f = "copy";

        public a(String str, String str2, String str3, String str4, String str5) {
            this.f25398a = str;
            this.f25399b = str2;
            this.f25400c = str3;
            this.f25401d = str4;
            this.f25402e = str5;
        }

        public final a a(String str) {
            this.f25403f = str;
            return this;
        }

        public final aa a() {
            return new aa(this);
        }
    }

    private aa() {
    }

    public static String a(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("fname", str);
        return n.a((Map<String, String>) hashMap);
    }

    public static String a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("sname", str);
        hashMap.put("dversion", str2);
        return n.a((Map<String, String>) hashMap);
    }

    public static String a(String str, String str2, String str3, String str4) {
        HashMap hashMap = new HashMap();
        hashMap.put("fname", str);
        hashMap.put("sname", str2);
        hashMap.put("dversion", str4);
        hashMap.put("version", str3);
        return n.a((Map<String, String>) hashMap);
    }

    public static String b(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("sname", str);
        hashMap.put("status", str2);
        return n.a((Map<String, String>) hashMap);
    }

    public aa(a aVar) {
        this.f25392a = aVar.f25398a;
        this.f25393b = aVar.f25399b;
        this.f25394c = aVar.f25400c;
        this.f25395d = aVar.f25401d;
        this.f25396e = aVar.f25402e;
        this.f25397f = aVar.f25403f;
    }
}
