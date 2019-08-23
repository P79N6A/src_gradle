package com.ss.android.ugc.aweme.shortvideo.cut;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class x implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66608a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity f66609b;

    x(CutMultiVideoActivity cutMultiVideoActivity) {
        this.f66609b = cutMultiVideoActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f66608a, false, 75463, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f66608a, false, 75463, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        CutMultiVideoActivity cutMultiVideoActivity = this.f66609b;
        Long l = (Long) obj;
        if (cutMultiVideoActivity.w != null) {
            cutMultiVideoActivity.w.seek(l.longValue());
        }
    }
}
