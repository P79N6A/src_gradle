package com.bytedance.android.live.core.setting;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Field;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f8162a;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v0, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.support.annotation.NonNull
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.List<com.bytedance.android.live.core.setting.l> a(java.lang.String[] r17) {
        /*
            r0 = r17
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f8162a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r7[r9] = r3
            java.lang.Class<java.util.List> r8 = java.util.List.class
            r3 = 0
            r5 = 1
            r6 = 887(0x377, float:1.243E-42)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0035
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f8162a
            r13 = 1
            r14 = 887(0x377, float:1.243E-42)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<java.lang.String[]> r0 = java.lang.String[].class
            r15[r9] = r0
            java.lang.Class<java.util.List> r16 = java.util.List.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            java.util.List r0 = (java.util.List) r0
            return r0
        L_0x0035:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            int r2 = r0.length
            r3 = 0
        L_0x003c:
            if (r3 >= r2) goto L_0x0078
            r4 = r0[r3]
            java.lang.Class r4 = java.lang.Class.forName(r4)     // Catch:{ Exception -> 0x0075 }
            java.lang.reflect.Field[] r4 = r4.getFields()     // Catch:{ Exception -> 0x0075 }
            int r5 = r4.length     // Catch:{ Exception -> 0x0075 }
            r6 = 0
        L_0x004a:
            if (r6 >= r5) goto L_0x0075
            r7 = r4[r6]     // Catch:{ Exception -> 0x0075 }
            int r8 = r7.getModifiers()     // Catch:{ Exception -> 0x0075 }
            boolean r8 = java.lang.reflect.Modifier.isStatic(r8)     // Catch:{ Exception -> 0x0075 }
            if (r8 == 0) goto L_0x0072
            r8 = 0
            java.lang.Object r7 = r7.get(r8)     // Catch:{ IllegalAccessException -> 0x005e }
            goto L_0x005f
        L_0x005e:
            r7 = r8
        L_0x005f:
            com.bytedance.android.live.core.setting.l r7 = a((java.lang.Object) r7)     // Catch:{ Exception -> 0x0075 }
            if (r7 == 0) goto L_0x0072
            java.lang.String r8 = com.bytedance.android.live.core.setting.m.b(r7)     // Catch:{ Exception -> 0x0075 }
            boolean r8 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0075 }
            if (r8 != 0) goto L_0x0072
            r1.add(r7)     // Catch:{ Exception -> 0x0075 }
        L_0x0072:
            int r6 = r6 + 1
            goto L_0x004a
        L_0x0075:
            int r3 = r3 + 1
            goto L_0x003c
        L_0x0078:
            java.util.Comparator r0 = com.bytedance.android.live.core.setting.e.f8164b
            java.util.Collections.sort(r1, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.live.core.setting.d.a(java.lang.String[]):java.util.List");
    }

    private static l a(Object obj) {
        l lVar;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, null, f8162a, true, 888, new Class[]{Object.class}, l.class)) {
            return (l) PatchProxy.accessDispatch(new Object[]{obj2}, null, f8162a, true, 888, new Class[]{Object.class}, l.class);
        } else if (obj2 instanceof l) {
            return (l) obj2;
        } else {
            try {
                Class<?> cls = obj.getClass();
                Field declaredField = cls.getDeclaredField("name");
                declaredField.setAccessible(true);
                String str = (String) declaredField.get(obj2);
                Field declaredField2 = cls.getDeclaredField("description");
                declaredField2.setAccessible(true);
                String str2 = (String) declaredField2.get(obj2);
                Field declaredField3 = cls.getDeclaredField("defaultValue");
                declaredField3.setAccessible(true);
                Object obj3 = declaredField3.get(obj2);
                if (obj3 != null) {
                    Field declaredField4 = cls.getDeclaredField("option");
                    declaredField4.setAccessible(true);
                    lVar = new l(str, obj3, str2, (String[]) declaredField4.get(obj2));
                } else {
                    Field declaredField5 = cls.getDeclaredField("type");
                    declaredField5.setAccessible(true);
                    lVar = new l(str, (Class) declaredField5.get(obj2), str2);
                }
            } catch (Exception unused) {
                lVar = null;
            }
            return lVar;
        }
    }
}
