package com.bytedance.android.livesdk.sign;

import android.os.Bundle;
import android.support.annotation.Nullable;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment;
import com.bytedance.android.livesdk.sign.a;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.verify.ZhimaVerifyApi;
import com.bytedance.android.livesdk.verify.model.ZhimaStatusResponse;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import org.json.JSONException;
import org.json.JSONObject;

public class BroadcastSigningFragment extends TTLiveBrowserFragment implements a.C0120a {
    public static ChangeQuickRedirect V;
    private a W;
    private boolean X;
    private CompositeDisposable Y = new CompositeDisposable();

    public final void i() {
        this.X = true;
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, V, false, 13327, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, V, false, 13327, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.Y.clear();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, V, false, 13325, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, V, false, 13325, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.X) {
            this.Y.add(((ZhimaVerifyApi) j.q().d().a(ZhimaVerifyApi.class)).getCertificationStatus().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe((Consumer<? super T>) new Consumer<d<ZhimaStatusResponse>>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f17224a;

                public final /* synthetic */ void accept(Object obj) throws Exception {
                    d dVar = (d) obj;
                    if (PatchProxy.isSupport(new Object[]{dVar}, this, f17224a, false, 13328, new Class[]{d.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dVar}, this, f17224a, false, 13328, new Class[]{d.class}, Void.TYPE);
                        return;
                    }
                    ZhimaStatusResponse zhimaStatusResponse = (ZhimaStatusResponse) dVar.f7871b;
                    if (zhimaStatusResponse.is_verified) {
                        BroadcastSigningFragment.this.c(1);
                    } else if (zhimaStatusResponse.certification_step == 3) {
                        BroadcastSigningFragment.this.c(2);
                    } else {
                        BroadcastSigningFragment.this.c(0);
                    }
                }
            }));
        }
    }

    public final void c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, V, false, 13326, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, V, false, 13326, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            try {
                this.M.a().a("H5_signStatus", jSONObject);
            } catch (JSONException unused) {
            }
        } catch (JSONException unused2) {
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, V, false, 13324, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, V, false, 13324, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        this.W = new a(getActivity(), this);
        this.M.c().a("openHostVerify", (com.bytedance.ies.f.a.d) this.W);
    }
}
