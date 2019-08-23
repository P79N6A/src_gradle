package com.ss.android.ugc.aweme.story.shootvideo.edit;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dmt.av.video.v;

public final /* synthetic */ class d implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73476a;

    /* renamed from: b  reason: collision with root package name */
    private final a f73477b;

    d(a aVar) {
        this.f73477b = aVar;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f73476a, false, 85242, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f73476a, false, 85242, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f73477b;
        if (((v) obj).f83072b == 1) {
            aVar.a(false, false);
        } else {
            aVar.a(true, false);
        }
    }
}
