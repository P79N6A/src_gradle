package com.bytedance.android.livesdk.verify;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.browser.fragment.TTLiveBrowserFragment;
import com.bytedance.android.livesdk.browser.jsbridge.c.j;
import com.bytedance.android.livesdk.verify.model.a;
import com.bytedance.common.utility.Logger;
import com.bytedance.ies.f.a.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import java.net.URLEncoder;

public class VerifyBrowserFragment extends TTLiveBrowserFragment implements j.a {
    public static ChangeQuickRedirect V;
    j W;
    private a X;
    private boolean Y;
    private CompositeDisposable Z = new CompositeDisposable();

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, V, false, 13838, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, V, false, 13838, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        this.Z.clear();
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, V, false, 13836, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, V, false, 13836, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (this.Y && this.X != null) {
            this.Z.add(((ZhimaVerifyApi) com.bytedance.android.livesdk.v.j.q().d().a(ZhimaVerifyApi.class)).queryPollingStatus(this.X.f17716c, this.X.f17714a).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new b(this), new c(this)));
        }
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, V, false, 13837, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, V, false, 13837, new Class[]{a.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(aVar.f17714a) && !TextUtils.isEmpty(aVar.f17715b) && !TextUtils.isEmpty(aVar.f17716c)) {
            this.X = aVar;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("alipays://platformapi/startapp?appId=20000067&url=" + URLEncoder.encode(aVar.f17715b)));
            getActivity().startActivity(intent);
            Logger.debug();
            this.Y = true;
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, V, false, 13835, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, V, false, 13835, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        getActivity();
        this.W = new j(this, this.M.c());
        this.M.c().a("openZmCert", (d) this.W);
    }
}
