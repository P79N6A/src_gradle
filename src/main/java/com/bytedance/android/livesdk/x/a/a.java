package com.bytedance.android.livesdk.x.a;

import android.content.Context;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdkapi.f;
import com.bytedance.common.utility.NetworkUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class a implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18585a;

    public final void a(f.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f18585a, false, 13331, new Class[]{f.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f18585a, false, 13331, new Class[]{f.a.class}, Void.TYPE);
            return;
        }
        Context context = aVar.b().f18760a;
        if (!NetworkUtils.isNetworkAvailable(context)) {
            com.bytedance.android.live.uikit.d.a.a(context, (int) C0906R.string.csv);
        } else if (NetworkUtils.getNetworkType(context) == NetworkUtils.NetworkType.MOBILE_2G) {
            com.bytedance.android.live.uikit.d.a.a(context, (int) C0906R.string.dg1);
        } else if (TTLiveSDKContext.getHostService().k().a().childrenManagerForbidCreateLiveRoom()) {
            com.bytedance.android.live.uikit.d.a.a(context, (int) C0906R.string.cqp);
        } else {
            aVar.a();
        }
    }
}
