package com.ss.android.ugc.aweme.feed.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.commercialize.model.j;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.ugc.aweme.proto.ChallengeStructV2;
import java.util.List;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45065a;

    public static j a(String str, j jVar) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, jVar}, null, f45065a, true, 40884, new Class[]{String.class, j.class}, j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[]{str2, jVar}, null, f45065a, true, 40884, new Class[]{String.class, j.class}, j.class);
        } else if (str2 == null) {
            return jVar;
        } else {
            return (j) m.d().fromJson(str2, j.class);
        }
    }

    public static AwemeRawAd a(String str, AwemeRawAd awemeRawAd) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, awemeRawAd}, null, f45065a, true, 40883, new Class[]{String.class, AwemeRawAd.class}, AwemeRawAd.class)) {
            return (AwemeRawAd) PatchProxy.accessDispatch(new Object[]{str2, awemeRawAd}, null, f45065a, true, 40883, new Class[]{String.class, AwemeRawAd.class}, AwemeRawAd.class);
        } else if (str2 == null) {
            return awemeRawAd;
        } else {
            return (AwemeRawAd) m.d().fromJson(str2, AwemeRawAd.class);
        }
    }

    public static String a(List<ChallengeStructV2> list, String str) {
        List<ChallengeStructV2> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, str}, null, f45065a, true, 40882, new Class[]{List.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{list2, str}, null, f45065a, true, 40882, new Class[]{List.class, String.class}, String.class);
        } else if (list2 == null) {
            return str;
        } else {
            return m.d().toJson((Object) list2);
        }
    }
}
