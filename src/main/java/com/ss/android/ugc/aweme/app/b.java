package com.ss.android.ugc.aweme.app;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.h;
import com.ss.android.ugc.aweme.commercialize.log.d;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.Callable;

public final /* synthetic */ class b implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33966a;

    /* renamed from: b  reason: collision with root package name */
    private final AdsAppActivity f33967b;

    /* renamed from: c  reason: collision with root package name */
    private final Uri f33968c;

    b(AdsAppActivity adsAppActivity, Uri uri) {
        this.f33967b = adsAppActivity;
        this.f33968c = uri;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f33966a, false, 22126, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f33966a, false, 22126, new Class[0], Object.class);
        }
        AdsAppActivity adsAppActivity = this.f33967b;
        Uri uri = this.f33968c;
        Aweme aweme = h.a().f38876a;
        h.a().f38876a = null;
        if (aweme == null) {
            return null;
        }
        String queryParameter = uri.getQueryParameter("tag");
        if (TextUtils.isEmpty(queryParameter)) {
            queryParameter = "draw_ad";
        }
        d.a().b(aweme).a(queryParameter).b("open_url_appback").a((Context) adsAppActivity);
        return null;
    }
}
