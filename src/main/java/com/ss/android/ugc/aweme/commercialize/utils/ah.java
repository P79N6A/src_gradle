package com.ss.android.ugc.aweme.commercialize.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ad.smartphone.a.c;
import com.ss.android.common.AppContext;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import org.json.JSONException;
import org.json.JSONObject;

public final /* synthetic */ class ah implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39693a;

    /* renamed from: b  reason: collision with root package name */
    private final AppContext f39694b;

    ah(AppContext appContext) {
        this.f39694b = appContext;
    }

    public final void a(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        String str8 = str4;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str5, str6, str7, str8, jSONObject2}, this, f39693a, false, 32564, new Class[]{String.class, String.class, String.class, String.class, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {str5, str6, str7, str8, jSONObject2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f39693a, false, 32564, new Class[]{String.class, String.class, String.class, String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        try {
            g.a(this.f39694b.getContext(), jSONObject2, str8);
        } catch (JSONException unused) {
        }
        r.onEvent(MobClick.obtain().setEventName(str6).setLabelName(str7).setValue(str5).setJsonObject(jSONObject2));
    }
}
