package com.ss.android.ugc.aweme.base.api;

import android.support.annotation.CallSuper;
import android.support.v4.util.ArrayMap;
import com.google.gson.JsonSyntaxException;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public abstract class c {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final Object sLock = new Object();
    private static final Map<Class<?>, List<Field>> sRequiredMap = Collections.synchronizedMap(new ArrayMap());

    @CallSuper
    public <T> T checkValid() throws Throwable {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 24137, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 24137, new Class[0], Object.class);
        }
        Class<?> cls = getClass();
        if (sRequiredMap.get(cls) == null) {
            synchronized (sLock) {
                initRequiredFieldMap(cls);
            }
        }
        List list = sRequiredMap.get(cls);
        int size = list.size();
        while (i < size) {
            try {
                Field field = (Field) list.get(i);
                if (field.get(this) != null) {
                    i++;
                } else {
                    throw new JsonSyntaxException("Unexpected null value in " + cls.getName() + ", required field: " + field.getName());
                }
            } catch (IllegalAccessException unused) {
                throw new AssertionError();
            }
        }
        return this;
    }

    private void initRequiredFieldMap(Class<?> cls) {
        Class<?> cls2 = cls;
        if (PatchProxy.isSupport(new Object[]{cls2}, this, changeQuickRedirect, false, 24138, new Class[]{Class.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls2}, this, changeQuickRedirect, false, 24138, new Class[]{Class.class}, Void.TYPE);
            return;
        }
        Field[] declaredFields = cls.getDeclaredFields();
        ArrayList arrayList = new ArrayList(declaredFields.length);
        for (Field field : declaredFields) {
            if (field.getAnnotation(Required.class) != null) {
                field.setAccessible(true);
                arrayList.add(field);
            }
        }
        sRequiredMap.put(cls2, Collections.unmodifiableList(arrayList));
    }
}
