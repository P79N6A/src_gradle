package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.user.b;
import com.bytedance.android.livesdk.user.e;
import com.bytedance.android.livesdk.user.f;
import com.bytedance.android.livesdk.user.i;
import com.bytedance.android.livesdk.user.k;
import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.bytedance.ies.f.b.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import org.json.JSONObject;

public final class af extends c<JSONObject, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9547a;

    /* renamed from: b  reason: collision with root package name */
    private Disposable f9548b;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void a(Throwable th) {
        b(th);
    }

    public final void d_() {
        if (PatchProxy.isSupport(new Object[0], this, f9547a, false, 3734, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f9547a, false, 3734, new Class[0], Void.TYPE);
            return;
        }
        if (this.f9548b != null) {
            this.f9548b.dispose();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(a aVar, Context context) {
        if (PatchProxy.isSupport(new Object[]{aVar, context}, this, f9547a, false, 3737, new Class[]{a.class, Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, context}, this, f9547a, false, 3737, new Class[]{a.class, Context.class}, Void.TYPE);
        } else if (aVar != null) {
            if (!TTLiveSDKContext.getHostService().k().c()) {
                if (context instanceof FragmentActivity) {
                    this.f9548b = TTLiveSDKContext.getHostService().k().a((FragmentActivity) context, i.a().a(ac.a((int) C0906R.string.deu)).a(-1).d("search_result").c("recommend").e("follow").a()).subscribe(new ah(this, aVar, context), new ai(this));
                }
            } else if (aVar.f18694f) {
                this.f9548b = TTLiveSDKContext.getHostService().k().a(((b.C0124b) ((b.a) f.a().a(aVar.f18689a)).c(aVar.f18690b)).c()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new aj(this), new ak(this));
            } else {
                this.f9548b = TTLiveSDKContext.getHostService().k().a(((k.b) ((k.b) ((k.b) f.c().a(aVar.f18689a)).a(aVar.f18690b)).a(aVar.f18692d)).c()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new al(this), new am(this));
            }
        }
    }

    public final /* synthetic */ void a(@NonNull Object obj, @NonNull com.bytedance.ies.f.b.f fVar) throws Exception {
        com.bytedance.ies.f.b.f fVar2 = fVar;
        JSONObject jSONObject = (JSONObject) obj;
        if (PatchProxy.isSupport(new Object[]{jSONObject, fVar2}, this, f9547a, false, 3733, new Class[]{JSONObject.class, com.bytedance.ies.f.b.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, fVar2}, this, f9547a, false, 3733, new Class[]{JSONObject.class, com.bytedance.ies.f.b.f.class}, Void.TYPE);
            return;
        }
        String optString = jSONObject.optString("type");
        JSONObject optJSONObject = jSONObject.optJSONObject("args");
        if (optJSONObject != null) {
            if (TextUtils.equals("follow", optString)) {
                Context context = fVar2.f20640a;
                if (PatchProxy.isSupport(new Object[]{optJSONObject, context}, this, f9547a, false, 3735, new Class[]{JSONObject.class, Context.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{optJSONObject, context}, this, f9547a, false, 3735, new Class[]{JSONObject.class, Context.class}, Void.TYPE);
                } else {
                    long parseLong = Long.parseLong(optJSONObject.getString("user_id"));
                    String string = optJSONObject.getString("from_label");
                    String optString2 = optJSONObject.optString(PushConstants.WEB_URL);
                    a aVar = new a();
                    aVar.f18693e = a.C0136a.FromWeb;
                    aVar.f18689a = parseLong;
                    aVar.f18691c = optString2;
                    aVar.f18690b = string;
                    aVar.f18694f = true;
                    a(aVar, context);
                    return;
                }
            } else {
                if (TextUtils.equals("unfollow", optString)) {
                    Context context2 = fVar2.f20640a;
                    if (PatchProxy.isSupport(new Object[]{optJSONObject, context2}, this, f9547a, false, 3736, new Class[]{JSONObject.class, Context.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{optJSONObject, context2}, this, f9547a, false, 3736, new Class[]{JSONObject.class, Context.class}, Void.TYPE);
                    } else {
                        long parseLong2 = Long.parseLong(optJSONObject.getString("user_id"));
                        String optString3 = optJSONObject.optString("from_label", "");
                        String optString4 = optJSONObject.optString(PushConstants.WEB_URL, "");
                        e k = TTLiveSDKContext.getHostService().k();
                        String a2 = ac.a((int) C0906R.string.cve);
                        ag agVar = new ag(this, optJSONObject, parseLong2, optString4, optString3, context2);
                        k.a(a2, agVar, context2, optString3, "", parseLong2, false);
                        return;
                    }
                }
            }
        }
        d();
    }
}
