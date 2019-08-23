package com.ss.android.ugc.aweme.live.livehostimpl;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.android.live.base.sp.a;
import com.bytedance.android.livesdkapi.host.k;
import com.bytedance.common.utility.NetworkUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.live.LivePlayActivity;

public final class p implements k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53471a;

    public final void a(Context context, long j, Bundle bundle) {
        Context context2 = context;
        long j2 = j;
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{context2, new Long(j2), bundle2}, this, f53471a, false, 55827, new Class[]{Context.class, Long.TYPE, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, new Long(j2), bundle2}, this, f53471a, false, 55827, new Class[]{Context.class, Long.TYPE, Bundle.class}, Void.TYPE);
        } else if (NetworkUtils.isWifi(context) || a.b(context) || !(context2 instanceof Activity) || (!com.ss.android.g.a.a() && (com.ss.android.g.a.a() || com.ss.android.ugc.aweme.freeflowcard.freeflowmember.a.f3325c.b()))) {
            LivePlayActivity.a(context, j, bundle);
        } else {
            new a.C0185a(context2).b((int) C0906R.string.drf).a((int) C0906R.string.a0v, (DialogInterface.OnClickListener) new q(context2, j2, bundle2)).b((int) C0906R.string.pm, r.f53477b).a().b();
        }
    }
}
