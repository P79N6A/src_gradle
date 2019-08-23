package com.ss.android.ugc.aweme.setting.annotation;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Field;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63827a;

    /* renamed from: b  reason: collision with root package name */
    public Field f63828b;

    /* renamed from: c  reason: collision with root package name */
    public AbIntField f63829c;

    /* renamed from: d  reason: collision with root package name */
    public Object f63830d;

    public final String a() throws IllegalAccessException {
        String str;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f63827a, false, 72130, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f63827a, false, 72130, new Class[0], String.class);
        }
        int intValue = ((Integer) this.f63828b.get(this.f63830d)).intValue();
        int[] b2 = this.f63829c.b();
        String[] c2 = this.f63829c.c();
        String str2 = intValue;
        if (c2.length != 0) {
            int i = 0;
            while (true) {
                if (i >= b2.length) {
                    break;
                } else if (b2[i] == intValue) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                str = c2[i];
            } else {
                str = intValue + " (你没有指定过这个数字)";
            }
            str2 = str;
        }
        return str2;
    }

    @NonNull
    public final String b() {
        if (PatchProxy.isSupport(new Object[0], this, f63827a, false, 72131, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f63827a, false, 72131, new Class[0], String.class);
        } else if (TextUtils.isEmpty(this.f63829c.a())) {
            return this.f63828b.getName();
        } else {
            return this.f63829c.a();
        }
    }

    public d(Field field, Object obj) {
        this.f63828b = field;
        this.f63830d = obj;
        field.setAccessible(true);
        this.f63829c = (AbIntField) field.getAnnotation(AbIntField.class);
    }
}
