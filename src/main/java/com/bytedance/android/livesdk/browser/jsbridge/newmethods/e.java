package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.ies.f.b.d;
import com.bytedance.ies.f.b.f;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.NetworkUtils;

public final class e extends d<Object, a> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9578a;

    static class a {
        @SerializedName("appName")

        /* renamed from: a  reason: collision with root package name */
        String f9579a;
        @SerializedName("aid")

        /* renamed from: b  reason: collision with root package name */
        int f9580b;
        @SerializedName("appVersion")

        /* renamed from: c  reason: collision with root package name */
        String f9581c;
        @SerializedName("versionCode")

        /* renamed from: d  reason: collision with root package name */
        String f9582d;
        @SerializedName("netType")

        /* renamed from: e  reason: collision with root package name */
        String f9583e;
        @SerializedName("orientation")

        /* renamed from: f  reason: collision with root package name */
        String f9584f;
        @SerializedName("device_id")
        String g;
        @SerializedName("user_id")
        long h;
        @SerializedName("screenWidth")
        float i;
        @SerializedName("screenHeight")
        float j;

        a() {
        }
    }

    @Nullable
    public final /* synthetic */ Object invoke(@NonNull Object obj, @NonNull f fVar) throws Exception {
        String str;
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{obj, fVar2}, this, f9578a, false, 3664, new Class[]{Object.class, f.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{obj, fVar2}, this, f9578a, false, 3664, new Class[]{Object.class, f.class}, a.class);
        }
        a aVar = new a();
        com.bytedance.android.livesdkapi.host.d a2 = TTLiveSDKContext.getHostService().a();
        aVar.f9579a = a2.h();
        aVar.f9580b = 1128;
        String customVersion = AppLog.getCustomVersion();
        if (TextUtils.isEmpty(customVersion)) {
            customVersion = a2.b();
        }
        aVar.f9581c = customVersion;
        aVar.f9582d = a2.b();
        aVar.f9583e = NetworkUtils.getNetworkAccessType(a2.a());
        if (!(fVar2.f20640a instanceof Activity)) {
            str = "vertical";
        } else if (((Activity) fVar2.f20640a).getRequestedOrientation() == 1) {
            str = "vertical";
        } else {
            str = "horizontal";
        }
        aVar.f9584f = str;
        if (f.a.PRIVATE.equals(fVar2.f20642c)) {
            aVar.g = AppLog.getServerDeviceId();
            aVar.h = TTLiveSDKContext.getHostService().k().b();
        }
        aVar.i = ac.e(ac.c());
        aVar.j = ac.e(ac.b());
        return aVar;
    }
}
