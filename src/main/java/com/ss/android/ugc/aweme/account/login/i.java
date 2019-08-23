package com.ss.android.ugc.aweme.account.login;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.account.a.a.b;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public class i {
    @Deprecated

    /* renamed from: a  reason: collision with root package name */
    public static String f32241a = null;
    @Deprecated

    /* renamed from: b  reason: collision with root package name */
    public static String f32242b = null;
    @Deprecated

    /* renamed from: c  reason: collision with root package name */
    public static String f32243c = null;

    /* renamed from: d  reason: collision with root package name */
    private static final String f32244d = "i";

    @Deprecated
    public static void a(@NonNull String str, @NonNull String str2, @Nullable String str3, int i) {
        String str4;
        f32241a = str;
        f32242b = str2;
        if (i == 1) {
            str4 = str3;
        } else {
            str4 = "";
        }
        f32243c = str4;
        if (TextUtils.equals("qzone_sns", str3)) {
            f32243c = "qq";
        }
        r.onEvent(MobClick.obtain().setEventName("login_notify").setLabelName(str));
        b a2 = new b().a("enter_method", str).a("enter_from", str2);
        if (i != 1) {
            str3 = "";
        }
        r.a("login_notify", (Map) a2.a("platform", str3).a("login_last_time", i).f31599b);
    }
}
