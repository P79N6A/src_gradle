package com.ss.android.ugc.aweme.account;

import a.g;
import a.i;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.model.h;
import org.json.JSONObject;

public final /* synthetic */ class b implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f31684a;

    /* renamed from: b  reason: collision with root package name */
    private final a f31685b;

    b(a aVar) {
        this.f31685b = aVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f31684a, false, 19531, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f31684a, false, 19531, new Class[]{i.class}, Object.class);
        }
        a aVar = this.f31685b;
        if (iVar.b()) {
            JSONObject jSONObject = new JSONObject((String) iVar.e());
            if (jSONObject.has("message") && TextUtils.equals(jSONObject.optString("message"), "success") && aVar.f31592b != null) {
                aVar.f31592b.a((h) new Gson().fromJson(jSONObject.optString("data"), h.class));
            }
            return null;
        }
        return null;
    }
}
