package com.ss.android.ugc.aweme.setting.annotation;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import java.lang.reflect.Field;
import java.util.ArrayList;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63809a;

    static void a() {
        String str;
        if (PatchProxy.isSupport(new Object[0], null, f63809a, true, 72117, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f63809a, true, 72117, new Class[0], Void.TYPE);
            return;
        }
        AbTestModel d2 = AbTestManager.a().d();
        for (Field field : d2.getClass().getDeclaredFields()) {
            if (PatchProxy.isSupport(new Object[]{field, d2}, null, c.f63821a, true, 72126, new Class[]{Field.class, Object.class}, c.class)) {
                c cVar = (c) PatchProxy.accessDispatch(new Object[]{field, d2}, null, c.f63821a, true, 72126, new Class[]{Field.class, Object.class}, c.class);
            } else if (field.getAnnotation(Deprecated.class) == null) {
                if (field.getAnnotation(AbExtraField.class) == null) {
                    c.f63823c.add(new c(field, d2));
                } else {
                    c cVar2 = new c(field, d2);
                    if (PatchProxy.isSupport(new Object[0], cVar2, c.f63821a, false, 72127, new Class[0], String.class)) {
                        str = (String) PatchProxy.accessDispatch(new Object[0], cVar2, c.f63821a, false, 72127, new Class[0], String.class);
                    } else {
                        str = cVar2.f63824d.a();
                    }
                    if (!c.f63822b.containsKey(str)) {
                        c.f63822b.put(str, new ArrayList());
                    }
                    c.f63822b.get(str).add(cVar2);
                    c.f63823c.add(cVar2);
                }
            }
        }
    }
}
