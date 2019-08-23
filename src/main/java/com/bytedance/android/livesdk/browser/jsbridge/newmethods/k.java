package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.text.TextUtils;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdkapi.i.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Function;
import org.json.JSONObject;

public final /* synthetic */ class k implements Function {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9597a;

    /* renamed from: b  reason: collision with root package name */
    private final String f9598b;

    /* renamed from: c  reason: collision with root package name */
    private final JSONObject f9599c;

    /* renamed from: d  reason: collision with root package name */
    private final JSONObject f9600d;

    /* renamed from: e  reason: collision with root package name */
    private final JSONObject f9601e;

    k(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        this.f9598b = str;
        this.f9599c = jSONObject;
        this.f9600d = jSONObject2;
        this.f9601e = jSONObject3;
    }

    public final Object apply(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9597a, false, 3677, new Class[]{Object.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{obj}, this, f9597a, false, 3677, new Class[]{Object.class}, Object.class);
        }
        String str = this.f9598b;
        JSONObject jSONObject = this.f9599c;
        JSONObject jSONObject2 = this.f9600d;
        JSONObject jSONObject3 = this.f9601e;
        if (TextUtils.equals((String) obj, "post")) {
            return j.a(str, jSONObject, jSONObject2, jSONObject3);
        }
        if (PatchProxy.isSupport(new Object[]{str, jSONObject, jSONObject2}, null, j.f9593a, true, 3674, new Class[]{String.class, JSONObject.class, JSONObject.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{str, jSONObject, jSONObject2}, null, j.f9593a, true, 3674, new Class[]{String.class, JSONObject.class, JSONObject.class}, JSONObject.class);
        }
        return new JSONObject(new String(((d) TTLiveSDKContext.getHostService().h().a(j.a(str, jSONObject2), j.a(jSONObject)).a()).f18821e));
    }
}
