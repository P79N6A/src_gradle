package com.ss.android.ugc.aweme.story.base.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import retrofit2.n;

public final class c implements IRetrofit {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71922a;

    /* renamed from: b  reason: collision with root package name */
    final n f71923b;

    public c(String str) {
        this.f71923b = a.a(str);
    }

    public final <T> T create(Class<T> cls) {
        Class<T> cls2 = cls;
        if (!PatchProxy.isSupport(new Object[]{cls2}, this, f71922a, false, 82215, new Class[]{Class.class}, Object.class)) {
            return this.f71923b.a(cls2);
        }
        return PatchProxy.accessDispatch(new Object[]{cls2}, this, f71922a, false, 82215, new Class[]{Class.class}, Object.class);
    }
}
