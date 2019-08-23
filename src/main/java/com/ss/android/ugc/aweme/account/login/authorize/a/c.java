package com.ss.android.ugc.aweme.account.login.authorize.a;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.sdk.account.api.call.BaseApiResponse;
import com.bytedance.sdk.account.api.call.a;
import com.bytedance.sdk.account.api.call.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

public final class c extends a<d> {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f32124c;

    /* renamed from: d  reason: collision with root package name */
    private final WeakReference<a> f32125d;

    public c(@NonNull a aVar) {
        this.f32125d = new WeakReference<>(aVar);
    }

    public final /* synthetic */ void a(BaseApiResponse baseApiResponse) {
        d dVar = (d) baseApiResponse;
        if (PatchProxy.isSupport(new Object[]{dVar}, this, f32124c, false, 20205, new Class[]{d.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar}, this, f32124c, false, 20205, new Class[]{d.class}, Void.TYPE);
            return;
        }
        if (dVar.success) {
            if (this.f32125d.get() != null) {
                ((a) this.f32125d.get()).a(dVar.f22252a, dVar.f22252a.f22520e);
            }
        } else if (this.f32125d.get() != null) {
            String str = dVar.f22257f;
            if (dVar.result != null) {
                JSONObject optJSONObject = dVar.result.optJSONObject("data");
                if (TextUtils.isEmpty(str) && optJSONObject != null && optJSONObject.has("profile_key")) {
                    str = optJSONObject.optString("profile_key", "");
                }
            }
            ((a) this.f32125d.get()).a(dVar.error, dVar.errorMsg, dVar.f22254c, str, dVar);
        }
    }
}
