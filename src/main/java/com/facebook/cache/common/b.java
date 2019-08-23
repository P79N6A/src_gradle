package com.facebook.cache.common;

import com.facebook.common.f.c;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public final class b {
    private static String c(CacheKey cacheKey) throws UnsupportedEncodingException {
        return c.a(cacheKey.getUriString().getBytes("UTF-8"));
    }

    public static String b(CacheKey cacheKey) {
        try {
            if (cacheKey instanceof c) {
                return c(((c) cacheKey).f23426a.get(0));
            }
            return c(cacheKey);
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static List<String> a(CacheKey cacheKey) {
        try {
            if (cacheKey instanceof c) {
                List<CacheKey> list = ((c) cacheKey).f23426a;
                ArrayList arrayList = new ArrayList(list.size());
                for (int i = 0; i < list.size(); i++) {
                    arrayList.add(c(list.get(i)));
                }
                return arrayList;
            }
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(c(cacheKey));
            return arrayList2;
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException(e2);
        }
    }
}
