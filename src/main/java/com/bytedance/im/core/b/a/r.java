package com.bytedance.im.core.b.a;

import com.bytedance.im.core.b.a.c.b;
import com.bytedance.im.core.b.e.d;

public final class r {
    public static String a(String str) {
        return str == null ? "" : str;
    }

    public static void a(b bVar) {
        if (bVar != null) {
            try {
                bVar.a();
            } catch (Exception e2) {
                d.a("close cursor", (Throwable) e2);
                com.bytedance.im.core.c.d.a(e2);
            }
        }
    }

    public static void a(com.bytedance.im.core.b.a.c.d dVar) {
        if (dVar != null) {
            try {
                dVar.c();
            } catch (Exception e2) {
                d.a("close ISQLiteStatement", (Throwable) e2);
                com.bytedance.im.core.c.d.a(e2);
            }
        }
    }
}
