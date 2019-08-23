package com.bytedance.frameworks.plugin.c;

import android.content.ClipboardManager;
import android.os.IBinder;
import java.lang.reflect.Method;

public final class c extends j {

    static class a extends b {
        a() {
        }
    }

    static class b extends i {
        b() {
        }

        public final Object a(Object obj, Method method, Object[] objArr) {
            if (objArr != null && objArr.length > 0) {
                int i = 0;
                while (true) {
                    if (i < objArr.length) {
                        if (objArr[i] != null && (objArr[i] instanceof String)) {
                            objArr[i] = com.bytedance.frameworks.plugin.e.a().getPackageName();
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            return super.a(obj, method, objArr);
        }
    }

    /* renamed from: com.bytedance.frameworks.plugin.c.c$c  reason: collision with other inner class name */
    static class C0167c extends b {
        C0167c() {
        }
    }

    static class d extends b {
        d() {
        }
    }

    static class e extends b {
        e() {
        }
    }

    static class f extends b {
        f() {
        }
    }

    static class g extends b {
        g() {
        }
    }

    static {
        f2174b.put("setPrimaryClip", new g());
        f2174b.put("getPrimaryClip", new C0167c());
        f2174b.put("getPrimaryClipDescription", new d());
        f2174b.put("hasPrimaryClip", new f());
        f2174b.put("addPrimaryClipChangedListener", new a());
        f2174b.put("hasClipboardText", new e());
    }

    public final void a() {
        try {
            if (com.bytedance.frameworks.plugin.e.a.b(ClipboardManager.class, "sService") != null) {
                com.bytedance.frameworks.plugin.e.a.a(ClipboardManager.class, "sService", (Object) null);
            }
            b bVar = new b("clipboard", this);
            bVar.a();
            b(com.bytedance.frameworks.plugin.e.b.a(Class.forName("android.content.IClipboard$Stub"), "asInterface", (Class<?>[]) new Class[]{IBinder.class}).invoke(null, new Object[]{bVar.f2178e}));
        } catch (Exception e2) {
            com.bytedance.frameworks.plugin.f.g.a("Hook proxy Clipboard Failed!!!", (Throwable) e2);
        }
    }
}
