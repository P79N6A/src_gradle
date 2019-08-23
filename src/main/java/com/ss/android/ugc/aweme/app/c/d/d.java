package com.ss.android.ugc.aweme.app.c.d;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.download.api.c.b;
import com.ss.android.downloadad.api.a.c;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34071a;

    public static c a(Context context, @NonNull Aweme aweme) {
        Context context2 = context;
        Aweme aweme2 = aweme;
        if (!PatchProxy.isSupport(new Object[]{context2, aweme2}, null, f34071a, true, 23460, new Class[]{Context.class, Aweme.class}, c.class)) {
            return a(context2, aweme2, false, null);
        }
        return (c) PatchProxy.accessDispatch(new Object[]{context2, aweme2}, null, f34071a, true, 23460, new Class[]{Context.class, Aweme.class}, c.class);
    }

    public static c a(String str, @NonNull MobClick mobClick) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, mobClick}, null, f34071a, true, 23462, new Class[]{String.class, MobClick.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{str2, mobClick}, null, f34071a, true, 23462, new Class[]{String.class, MobClick.class}, c.class);
        }
        long j = 0;
        try {
            j = Long.parseLong(mobClick.getValue());
        } catch (Exception unused) {
        }
        return new c.a().a(false).b(mobClick.getExtValueLong()).a(j).d(str2).a(mobClick.getExtJson()).a();
    }

    public static c a(Context context, @NonNull Aweme aweme, boolean z, String str) {
        long j;
        String str2;
        String str3;
        String str4 = str;
        if (PatchProxy.isSupport(new Object[]{context, aweme, Byte.valueOf(z ? (byte) 1 : 0), str4}, null, f34071a, true, 23461, new Class[]{Context.class, Aweme.class, Boolean.TYPE, String.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{context, aweme, Byte.valueOf(z), str4}, null, f34071a, true, 23461, new Class[]{Context.class, Aweme.class, Boolean.TYPE, String.class}, c.class);
        }
        AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
        List<String> list = null;
        if (awemeRawAd == null) {
            return null;
        }
        try {
            j = Long.parseLong(g.b(awemeRawAd));
            try {
                if (awemeRawAd.getClickTrackUrlList() != null) {
                    list = awemeRawAd.getClickTrackUrlList().getUrlList();
                }
            } catch (Exception unused) {
            }
        } catch (Exception unused2) {
            j = 0;
        }
        String openUrl = awemeRawAd.getOpenUrl();
        if (z && com.ss.android.ugc.aweme.commercialize.utils.c.b(openUrl)) {
            Uri.Builder buildUpon = Uri.parse("snssdk1128://adx").buildUpon();
            if (str4 != null) {
                buildUpon.appendQueryParameter("tag", str4);
            }
            openUrl = com.ss.android.ugc.aweme.commercialize.utils.c.a(openUrl, buildUpon.toString());
        }
        e a2 = f.a();
        c.a b2 = new c.a().a(j).b(g.a(awemeRawAd));
        if (PatchProxy.isSupport(new Object[]{aweme}, null, com.ss.android.ugc.aweme.commercialize.utils.c.f39774a, true, 32231, new Class[]{Aweme.class}, String.class)) {
            str2 = (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, com.ss.android.ugc.aweme.commercialize.utils.c.f39774a, true, 32231, new Class[]{Aweme.class}, String.class);
        } else {
            str2 = "";
            if (aweme != null && aweme.isAd()) {
                str2 = aweme.getAwemeRawAd().getLogExtra();
            }
        }
        c.a c2 = b2.a(str2).b(com.ss.android.ugc.aweme.commercialize.utils.c.e(aweme)).d(com.ss.android.ugc.aweme.commercialize.utils.c.a(aweme)).c("");
        if (PatchProxy.isSupport(new Object[]{aweme}, null, com.ss.android.ugc.aweme.commercialize.utils.c.f39774a, true, 32228, new Class[]{Aweme.class}, String.class)) {
            str3 = (String) PatchProxy.accessDispatch(new Object[]{aweme}, null, com.ss.android.ugc.aweme.commercialize.utils.c.f39774a, true, 32228, new Class[]{Aweme.class}, String.class);
        } else if (aweme == null || !aweme.isAd()) {
            str3 = "";
        } else {
            str3 = aweme.getAwemeRawAd().getAppName();
        }
        return a2.a(c2.e(str3).a(list).a(new b(openUrl, awemeRawAd.getWebUrl(), awemeRawAd.getWebTitle())), awemeRawAd.getQuickAppUrl());
    }
}
