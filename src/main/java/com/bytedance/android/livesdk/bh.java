package com.bytedance.android.livesdk;

import android.app.Activity;
import android.arch.lifecycle.Observer;
import android.net.Uri;
import android.os.Build;
import android.view.ViewGroup;
import com.bytedance.android.live.core.utils.t;
import com.bytedance.android.livesdk.browser.c.b;
import com.bytedance.android.livesdk.chatroom.model.f;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class bh implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9253a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentD f9254b;

    bh(StartLiveFragmentD startLiveFragmentD) {
        this.f9254b = startLiveFragmentD;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f9253a, false, 2856, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f9253a, false, 2856, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        StartLiveFragmentD startLiveFragmentD = this.f9254b;
        f.a aVar = (f.a) obj;
        if (PatchProxy.isSupport(new Object[]{aVar}, startLiveFragmentD, StartLiveFragmentD.u, false, 2844, new Class[]{f.a.class}, Void.TYPE)) {
            StartLiveFragmentD startLiveFragmentD2 = startLiveFragmentD;
            PatchProxy.accessDispatch(new Object[]{aVar}, startLiveFragmentD2, StartLiveFragmentD.u, false, 2844, new Class[]{f.a.class}, Void.TYPE);
            return;
        }
        startLiveFragmentD.C = aVar;
        if (startLiveFragmentD.getActivity() != null && aVar != null && !StringUtils.isEmpty(aVar.f11117a) && !t.a(aVar.f11118b)) {
            b f2 = j.q().f();
            if (startLiveFragmentD.D == null) {
                startLiveFragmentD.D = f2.a((Activity) startLiveFragmentD.getActivity(), (b.d) new bf(startLiveFragmentD));
                if (Build.VERSION.SDK_INT <= 19) {
                    startLiveFragmentD.D.f9317b.setLayerType(1, null);
                }
                startLiveFragmentD.D.f9317b.setBackgroundColor(0);
                startLiveFragmentD.D.f9317b.setLayoutParams(startLiveFragmentD.v.findViewById(C0906R.id.dx4).getLayoutParams());
                ((ViewGroup) startLiveFragmentD.v.findViewById(C0906R.id.aii)).addView(startLiveFragmentD.D.f9317b);
                startLiveFragmentD.D.f9317b.setVisibility(4);
                f2.a(startLiveFragmentD.D, Uri.parse(aVar.f11117a).buildUpon().appendQueryParameter("is_anchor", "true").appendQueryParameter("mode", "live_create").appendQueryParameter("user_id", String.valueOf(TTLiveSDKContext.getHostService().k().b())).toString());
                return;
            }
            f2.a(startLiveFragmentD.D, Uri.parse(aVar.f11117a).buildUpon().appendQueryParameter("is_anchor", "true").appendQueryParameter("mode", "live_create").appendQueryParameter("user_id", String.valueOf(TTLiveSDKContext.getHostService().k().b())).toString());
        }
    }
}
