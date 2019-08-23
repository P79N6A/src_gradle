package com.bytedance.frameworks.plugin.component.broadcast;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.frameworks.plugin.a.b;
import com.bytedance.frameworks.plugin.c.i;
import com.bytedance.frameworks.plugin.e;
import com.bytedance.frameworks.plugin.pm.c;
import java.lang.reflect.Method;

public final class a {

    /* renamed from: com.bytedance.frameworks.plugin.component.broadcast.a$a  reason: collision with other inner class name */
    public static class C0170a extends i {
        public final Object a(Object obj, Method method, Object[] objArr) {
            Intent intent = null;
            if (objArr != null && objArr.length != 0) {
                int length = objArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Intent intent2 = objArr[i];
                    if (intent2 instanceof Intent) {
                        intent = intent2;
                        break;
                    }
                    i++;
                }
            }
            if (intent != null && !intent.getBooleanExtra("start_only_for_android", false)) {
                String str = intent.getPackage();
                if (!TextUtils.isEmpty(str) && c.a(str) && (!c.i(str) || c.k(str) == b.a.ACTIVED.getIndex())) {
                    c.j(str);
                    intent.setPackage(e.a().getPackageName());
                }
            }
            return super.a(obj, method, objArr);
        }

        public final Object a(Object obj, Method method, Object[] objArr, Object obj2) {
            return super.a(obj, method, objArr, obj2);
        }
    }

    public static class b extends i {
        public final Object a(Object obj, Method method, Object[] objArr) {
            if (objArr != null && objArr.length > 0) {
                int i = 0;
                while (true) {
                    if (i >= objArr.length) {
                        break;
                    } else if (objArr[i] == null || !(objArr[i] instanceof String)) {
                        i++;
                    } else if (c.a(objArr[i])) {
                        objArr[i] = e.a().getPackageName();
                    }
                }
            }
            return super.a(obj, method, objArr);
        }
    }
}
