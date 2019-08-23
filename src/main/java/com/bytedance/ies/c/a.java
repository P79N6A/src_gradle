package com.bytedance.ies.c;

import com.squareup.wire.Message;
import java.util.HashMap;
import java.util.Map;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static volatile a f20214b;

    /* renamed from: a  reason: collision with root package name */
    public final Map<Class, Message> f20215a = new HashMap();

    private a() {
    }

    public static a a() {
        if (f20214b != null) {
            return f20214b;
        }
        synchronized (a.class) {
            if (f20214b == null) {
                f20214b = new a();
            }
        }
        return f20214b;
    }

    public final <T extends Message> T a(Class<T> cls) {
        return (Message) this.f20215a.get(cls);
    }

    public final <T extends Message> T a(Class<T> cls, T t) {
        if (t != null) {
            return t;
        }
        return a(cls);
    }
}
