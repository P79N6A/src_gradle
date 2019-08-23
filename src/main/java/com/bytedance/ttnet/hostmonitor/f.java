package com.bytedance.ttnet.hostmonitor;

import com.bytedance.common.utility.Logger;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    a f22651a;

    /* renamed from: b  reason: collision with root package name */
    private b f22652b;

    public enum a {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    public interface b {
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        public static final f f22653a = new f((byte) 0);
    }

    private f() {
        a aVar;
        if (Logger.debug()) {
            aVar = a.DEBUG;
        } else {
            aVar = a.OFF;
        }
        this.f22651a = aVar;
        this.f22652b = new b();
    }

    /* synthetic */ f(byte b2) {
        this();
    }

    public static void a(String str, String str2) {
        c.f22653a.f22651a.compareTo(a.ERROR);
    }

    public static void b(String str, String str2) {
        c.f22653a.f22651a.compareTo(a.DEBUG);
    }
}
