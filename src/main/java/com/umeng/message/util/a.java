package com.umeng.message.util;

import android.os.Environment;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private Properties f81407a = new Properties();

    public static a g() throws IOException {
        return new a();
    }

    public boolean b() {
        return this.f81407a.isEmpty();
    }

    public Enumeration<Object> c() {
        return this.f81407a.keys();
    }

    public Set<Object> d() {
        return this.f81407a.keySet();
    }

    public int e() {
        return this.f81407a.size();
    }

    public Collection<Object> f() {
        return this.f81407a.values();
    }

    public Set<Map.Entry<Object, Object>> a() {
        return this.f81407a.entrySet();
    }

    private a() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
        this.f81407a.load(fileInputStream);
        fileInputStream.close();
    }

    public String a(String str) {
        return this.f81407a.getProperty(str);
    }

    public boolean b(Object obj) {
        return this.f81407a.containsValue(obj);
    }

    public boolean a(Object obj) {
        return this.f81407a.containsKey(obj);
    }

    public String a(String str, String str2) {
        return this.f81407a.getProperty(str, str2);
    }
}
