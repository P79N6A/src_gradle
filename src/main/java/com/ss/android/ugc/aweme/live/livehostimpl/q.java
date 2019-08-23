package com.ss.android.ugc.aweme.live.livehostimpl;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.bytedance.android.live.base.sp.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.live.LivePlayActivity;

public final /* synthetic */ class q implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53472a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f53473b;

    /* renamed from: c  reason: collision with root package name */
    private final long f53474c;

    /* renamed from: d  reason: collision with root package name */
    private final Bundle f53475d;

    q(Context context, long j, Bundle bundle) {
        this.f53473b = context;
        this.f53474c = j;
        this.f53475d = bundle;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f53472a, false, 55828, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f53472a, false, 55828, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Context context = this.f53473b;
        long j = this.f53474c;
        Bundle bundle = this.f53475d;
        a.a(context);
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        LivePlayActivity.a(context, j, bundle);
    }
}
