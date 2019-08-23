package com.bytedance.android.livesdk;

import android.arch.lifecycle.Observer;
import android.support.v4.app.FragmentTransaction;
import com.bytedance.android.livesdk.utils.ai;
import com.bytedance.android.livesdkapi.j.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class aq implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9060a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveActivityProxy f9061b;

    aq(StartLiveActivityProxy startLiveActivityProxy) {
        this.f9061b = startLiveActivityProxy;
    }

    public final void onChanged(Object obj) {
        StartLivePreviewFragment startLivePreviewFragment;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9060a, false, 2768, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9060a, false, 2768, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        StartLiveActivityProxy startLiveActivityProxy = this.f9061b;
        Boolean bool = (Boolean) obj;
        if (TTLiveSDKContext.getHostService().e() != null) {
            TTLiveSDKContext.getHostService().e();
            TTLiveSDKContext.getHostService().e().b(a.LiveResource.getPackageName());
        }
        if (bool != null && bool.booleanValue()) {
            if (startLiveActivityProxy.f1829b != null && startLiveActivityProxy.f1829b.isShowing()) {
                startLiveActivityProxy.f1829b.dismiss();
            }
            FragmentTransaction beginTransaction = startLiveActivityProxy.f1870f.getSupportFragmentManager().beginTransaction();
            if (PatchProxy.isSupport(new Object[0], null, StartLivePreviewFragment.f8869a, true, 2993, new Class[0], StartLivePreviewFragment.class)) {
                startLivePreviewFragment = (StartLivePreviewFragment) PatchProxy.accessDispatch(new Object[0], null, StartLivePreviewFragment.f8869a, true, 2993, new Class[0], StartLivePreviewFragment.class);
            } else {
                startLivePreviewFragment = new StartLivePreviewFragment();
            }
            beginTransaction.replace(C0906R.id.aic, startLivePreviewFragment);
            beginTransaction.commitAllowingStateLoss();
        } else if (startLiveActivityProxy.f1830c > 3) {
            ai.a((int) C0906R.string.dco);
            if (startLiveActivityProxy.f1829b != null && startLiveActivityProxy.f1829b.isShowing()) {
                startLiveActivityProxy.f1829b.dismiss();
            }
            startLiveActivityProxy.f1870f.finish();
        } else {
            s.INST.loadResources();
            startLiveActivityProxy.f1830c++;
        }
    }
}
