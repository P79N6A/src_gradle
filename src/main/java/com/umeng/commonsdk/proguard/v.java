package com.umeng.commonsdk.proguard;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class v implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    private static Map<Class<? extends j>, Map<? extends q, v>> f80863d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final String f80864a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f80865b;

    /* renamed from: c  reason: collision with root package name */
    public final w f80866c;

    public static Map<? extends q, v> a(Class<? extends j> cls) {
        if (!f80863d.containsKey(cls)) {
            try {
                cls.newInstance();
            } catch (InstantiationException e2) {
                throw new RuntimeException("InstantiationException for TBase class: " + cls.getName() + ", message: " + e2.getMessage());
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("IllegalAccessException for TBase class: " + cls.getName() + ", message: " + e3.getMessage());
            }
        }
        return f80863d.get(cls);
    }

    public static void a(Class<? extends j> cls, Map<? extends q, v> map) {
        f80863d.put(cls, map);
    }

    public v(String str, byte b2, w wVar) {
        this.f80864a = str;
        this.f80865b = b2;
        this.f80866c = wVar;
    }
}
