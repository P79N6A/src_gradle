package com.bytedance.frameworks.plugin.c;

import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.e.b;
import com.bytedance.frameworks.plugin.f.g;
import java.lang.reflect.Method;

public final class f extends j {

    static final class a extends i {
        a() {
        }

        public final Object a(Object obj, Method method, Object[] objArr) {
            if (objArr != null && objArr.length > 0 && (objArr[0] instanceof String) && !TextUtils.equals(objArr[0], e.a().getPackageName())) {
                objArr[0] = e.a().getPackageName();
            }
            return super.a(obj, method, objArr);
        }
    }

    static {
        f2174b.put("mkdirs", new a());
    }

    public final void a() {
        Class<?> cls;
        b bVar = new b("mount", this);
        bVar.a();
        try {
            if (Build.VERSION.SDK_INT > 25) {
                cls = Class.forName("android.os.storage.IStorageManager$Stub");
            } else {
                cls = Class.forName("android.os.storage.IMountService$Stub");
            }
            b(b.a(cls, "asInterface", (Class<?>[]) new Class[]{IBinder.class}).invoke(null, new Object[]{bVar.f2178e}));
        } catch (Exception unused) {
            g.c("Hook proxy MountService Failed!!!");
        }
    }
}
