package com.bytedance.frameworks.plugin.c;

import android.os.IBinder;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputMethodManager;
import com.bytedance.frameworks.plugin.b.f;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.f.g;
import java.lang.reflect.Method;

public final class d extends j {

    static class a extends i {
        a() {
        }

        public final Object a(Object obj, Method method, Object[] objArr) {
            if (objArr != null && objArr.length > 0) {
                for (EditorInfo editorInfo : objArr) {
                    if (editorInfo instanceof EditorInfo) {
                        EditorInfo editorInfo2 = editorInfo;
                        if (!TextUtils.equals(e.a().getPackageName(), editorInfo2.packageName)) {
                            editorInfo2.packageName = e.a().getPackageName();
                        }
                    }
                }
            }
            return null;
        }
    }

    static class b extends i {
        b() {
        }

        public final Object a(Object obj, Method method, Object[] objArr) {
            if (objArr != null && objArr.length > 0) {
                for (EditorInfo editorInfo : objArr) {
                    if (editorInfo instanceof EditorInfo) {
                        EditorInfo editorInfo2 = editorInfo;
                        if (!TextUtils.equals(e.a().getPackageName(), editorInfo2.packageName)) {
                            editorInfo2.packageName = e.a().getPackageName();
                        }
                    }
                }
            }
            return null;
        }
    }

    static {
        f2174b.put("startInput", new a());
        f2174b.put("windowGainedFocus", new b());
    }

    public final void a() {
        try {
            if (!f.b(e.a())) {
                if (com.bytedance.frameworks.plugin.e.a.b(InputMethodManager.class, "sInstance") != null) {
                    com.bytedance.frameworks.plugin.e.a.a(InputMethodManager.class, "sInstance", (Object) null);
                }
                b bVar = new b("input_method", this);
                bVar.a();
                b(com.bytedance.frameworks.plugin.e.b.a(Class.forName("com.android.internal.view.IInputMethodManager$Stub"), "asInterface", (Class<?>[]) new Class[]{IBinder.class}).invoke(null, new Object[]{bVar.f2178e}));
            }
        } catch (Exception e2) {
            g.a("Hook proxy InputMethodManager Failed!!!", (Throwable) e2);
        }
    }
}
