package com.ss.android.ugc.aweme.live.c;

import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53340a;

    /* renamed from: b  reason: collision with root package name */
    static final i f53341b = new b();

    private b() {
    }

    public final boolean apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f53340a, false, 55962, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f53340a, false, 55962, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        CacheKey cacheKey = (CacheKey) obj;
        return cacheKey.getUriString().equals(cacheKey.getUriString());
    }
}
