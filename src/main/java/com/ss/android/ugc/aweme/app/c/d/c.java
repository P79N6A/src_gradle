package com.ss.android.ugc.aweme.app.c.d;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.download.api.b.b;
import com.ss.android.downloadad.api.a.b;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34070a;

    @NonNull
    public static b a(String str, AwemeRawAd awemeRawAd) {
        String str2 = str;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        if (!PatchProxy.isSupport(new Object[]{str2, awemeRawAd2}, null, f34070a, true, 23458, new Class[]{String.class, AwemeRawAd.class}, b.class)) {
            return f.a().a(new b.a().a(str2).b(str2).c(false).a((Object) awemeRawAd2), str2);
        }
        return (com.ss.android.download.api.b.b) PatchProxy.accessDispatch(new Object[]{str2, awemeRawAd2}, null, f34070a, true, 23458, new Class[]{String.class, AwemeRawAd.class}, com.ss.android.download.api.b.b.class);
    }

    @NonNull
    public static com.ss.android.download.api.b.b a(String str, AwemeRawAd awemeRawAd, boolean z) {
        String str2;
        String str3 = str;
        AwemeRawAd awemeRawAd2 = awemeRawAd;
        if (PatchProxy.isSupport(new Object[]{str3, awemeRawAd2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f34070a, true, 23459, new Class[]{String.class, AwemeRawAd.class, Boolean.TYPE}, com.ss.android.download.api.b.b.class)) {
            return (com.ss.android.download.api.b.b) PatchProxy.accessDispatch(new Object[]{str3, awemeRawAd2, Byte.valueOf(z)}, null, f34070a, true, 23459, new Class[]{String.class, AwemeRawAd.class, Boolean.TYPE}, com.ss.android.download.api.b.b.class);
        }
        e a2 = f.a();
        b.a a3 = new b.a().a(str3).b(str3).c(false).a((Object) awemeRawAd2);
        if (z) {
            str2 = "click_start_detail";
        } else {
            str2 = "click_start";
        }
        return a2.a(a3.h(str2).i("click_pause_detail").j("click_continue_detail").k("click_install_detail").l("click_open_detail"), str3);
    }
}
