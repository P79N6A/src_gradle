package com.xiaomi.push;

import java.util.Map;

public class gr implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public static String f82122a = "wcc-ml-test10.bj";

    /* renamed from: b  reason: collision with root package name */
    public static final String f82123b = af.f81821a;

    /* renamed from: c  reason: collision with root package name */
    public static String f82124c;

    /* renamed from: a  reason: collision with other field name */
    private int f467a;

    /* renamed from: a  reason: collision with other field name */
    private gu f468a;

    /* renamed from: a  reason: collision with other field name */
    private boolean f469a = gq.f452a;

    /* renamed from: b  reason: collision with other field name */
    private boolean f470b = true;

    /* renamed from: d  reason: collision with root package name */
    private String f82125d;

    /* renamed from: e  reason: collision with root package name */
    private String f82126e;

    /* renamed from: f  reason: collision with root package name */
    private String f82127f;

    public gr(Map<String, Integer> map, int i, String str, gu guVar) {
        a(map, i, str, guVar);
    }

    public static final String a() {
        return f82124c != null ? f82124c : ac.a() ? "sandbox.xmpush.xiaomi.com" : ac.b() ? f82123b : "app.chat.xiaomi.net";
    }

    public static final void a(String str) {
        f82124c = str;
    }

    private void a(Map<String, Integer> map, int i, String str, gu guVar) {
        this.f467a = i;
        this.f82125d = str;
        this.f468a = guVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    public int m350a() {
        return this.f467a;
    }

    public void a(boolean z) {
        this.f469a = z;
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m351a() {
        return this.f469a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public byte[] m352a() {
        return null;
    }

    public String b() {
        return this.f82127f;
    }

    public void b(String str) {
        this.f82127f = str;
    }

    public String c() {
        if (this.f82126e == null) {
            this.f82126e = a();
        }
        return this.f82126e;
    }

    public void c(String str) {
        this.f82126e = str;
    }
}
