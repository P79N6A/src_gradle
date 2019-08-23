package com.ss.android.ugc.aweme.app.c.d;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.downloadad.api.a.a;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34069a;

    @NonNull
    public static a a(@NonNull AwemeRawAd awemeRawAd) {
        if (PatchProxy.isSupport(new Object[]{awemeRawAd}, null, f34069a, true, 23456, new Class[]{AwemeRawAd.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{awemeRawAd}, null, f34069a, true, 23456, new Class[]{AwemeRawAd.class}, a.class);
        }
        if (PatchProxy.isSupport(new Object[]{awemeRawAd, null}, null, f34069a, true, 23457, new Class[]{AwemeRawAd.class, Object.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{awemeRawAd, null}, null, f34069a, true, 23457, new Class[]{AwemeRawAd.class, Object.class}, a.class);
        }
        a.C0339a a2 = new a.C0339a().a(awemeRawAd.getLinkMode()).b(awemeRawAd.getDownloadMode()).c(awemeRawAd.isSupportMultiple()).a(true);
        a2.g = null;
        return a2.a();
    }
}
