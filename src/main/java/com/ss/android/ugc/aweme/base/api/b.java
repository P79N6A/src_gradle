package com.ss.android.ugc.aweme.base.api;

import com.alibaba.fastjson.JSONObject;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.a.a.c;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34527a;

    public static <T> T a(String str, Class<T> cls) throws c {
        if (PatchProxy.isSupport(new Object[]{str, cls}, null, f34527a, true, 24135, new Class[]{String.class, Class.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{str, cls}, null, f34527a, true, 24135, new Class[]{String.class, Class.class}, Object.class);
        }
        try {
            return JSONObject.parseObject(str, cls);
        } catch (Throwable th) {
            throw new c(th);
        }
    }
}
