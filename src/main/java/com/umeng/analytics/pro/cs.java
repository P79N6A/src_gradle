package com.umeng.analytics.pro;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class cs implements Serializable {

    /* renamed from: d  reason: collision with root package name */
    private static Map<Class<? extends cg>, Map<? extends cn, cs>> f80588d = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final String f80589a;

    /* renamed from: b  reason: collision with root package name */
    public final byte f80590b;

    /* renamed from: c  reason: collision with root package name */
    public final ct f80591c;

    public static Map<? extends cn, cs> a(Class<? extends cg> cls) {
        if (!f80588d.containsKey(cls)) {
            try {
                cls.newInstance();
            } catch (InstantiationException e2) {
                throw new RuntimeException("InstantiationException for TBase class: " + cls.getName() + ", message: " + e2.getMessage());
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("IllegalAccessException for TBase class: " + cls.getName() + ", message: " + e3.getMessage());
            }
        }
        return f80588d.get(cls);
    }

    public static void a(Class<? extends cg> cls, Map<? extends cn, cs> map) {
        f80588d.put(cls, map);
    }

    public cs(String str, byte b2, ct ctVar) {
        this.f80589a = str;
        this.f80590b = b2;
        this.f80591c = ctVar;
    }
}
