package com.douyin.share.a.a.a;

import com.bytedance.common.utility.StringUtils;
import java.util.Arrays;
import java.util.HashSet;

public final class a {
    public static boolean a(String str) {
        if (StringUtils.isEmpty(str)) {
            return false;
        }
        if (str.startsWith("http://") || str.startsWith("https://")) {
            return true;
        }
        return false;
    }

    public static boolean a(Class<?> cls, Class<?> cls2) {
        HashSet hashSet = new HashSet();
        for (Class<?> cls3 = cls; cls3 != Object.class; cls3 = cls3.getSuperclass()) {
            hashSet.addAll(Arrays.asList(cls3.getInterfaces()));
        }
        return hashSet.contains(cls2);
    }
}
