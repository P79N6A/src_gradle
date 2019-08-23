package com.ss.android.ugc.aweme.story.shootvideo.edit;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dmt.av.video.w;

public final /* synthetic */ class e implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73478a;

    /* renamed from: b  reason: collision with root package name */
    private final a f73479b;

    e(a aVar) {
        this.f73479b = aVar;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f73478a, false, 85243, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f73478a, false, 85243, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f73479b;
        if (((w) obj).g == 1) {
            aVar.a(false, false);
        } else {
            aVar.a(true, false);
        }
    }
}
