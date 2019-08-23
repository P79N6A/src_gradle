package com.ss.android.ugc.aweme.lancet;

import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.SsResponse;
import com.bytedance.retrofit2.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.a.b.a;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import org.json.JSONException;
import org.json.JSONObject;

public final class j implements c<String> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f52960a;

    /* renamed from: b  reason: collision with root package name */
    private IUserService f52961b;

    /* renamed from: c  reason: collision with root package name */
    private String f52962c;

    /* renamed from: d  reason: collision with root package name */
    private a f52963d;

    public final void a(Call<String> call, Throwable th) {
    }

    public final void a(Call<String> call, SsResponse<String> ssResponse) {
        if (PatchProxy.isSupport(new Object[]{call, ssResponse}, this, f52960a, false, 55010, new Class[]{Call.class, SsResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{call, ssResponse}, this, f52960a, false, 55010, new Class[]{Call.class, SsResponse.class}, Void.TYPE);
            return;
        }
        this.f52961b.logout();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorDesc", "api return errorcode==8");
            jSONObject.put("errorUrl", this.f52962c);
            jSONObject.put("errorResponse", this.f52963d.getResponse());
        } catch (JSONException unused) {
        }
        n.b("aweme_user_logout", "", jSONObject);
    }

    public j(IUserService iUserService, String str, a aVar) {
        this.f52961b = iUserService;
        this.f52962c = str;
        this.f52963d = aVar;
    }
}
