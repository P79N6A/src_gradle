package com.ss.android.ugc.aweme.global.test;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashSet;
import java.util.LinkedHashMap;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f49612a;

    public static LinkedHashMap<String, Object> a(Object obj) throws Exception {
        if (PatchProxy.isSupport(new Object[]{obj}, null, f49612a, true, 49488, new Class[]{Object.class}, LinkedHashMap.class)) {
            return (LinkedHashMap) PatchProxy.accessDispatch(new Object[]{obj}, null, f49612a, true, 49488, new Class[]{Object.class}, LinkedHashMap.class);
        }
        HashSet hashSet = new HashSet();
        hashSet.add("equals");
        hashSet.add("hasCode");
        hashSet.add("getClass");
        hashSet.add("wait");
        Method[] methods = obj.getClass().getMethods();
        LinkedHashMap<String, Object> linkedHashMap = new LinkedHashMap<>();
        for (Method method : methods) {
            if (!Modifier.isStatic(method.getModifiers()) && !hashSet.contains(method.getName())) {
                method.setAccessible(true);
                try {
                    linkedHashMap.put(method.getName(), method.invoke(obj, new Object[0]));
                } catch (Exception e2) {
                    linkedHashMap.put(method.getName(), "error:" + e2.getMessage());
                }
            }
        }
        return linkedHashMap;
    }
}
