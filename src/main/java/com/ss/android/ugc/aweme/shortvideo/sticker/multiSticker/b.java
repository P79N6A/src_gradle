package com.ss.android.ugc.aweme.shortvideo.sticker.multiSticker;

import android.arch.lifecycle.Observer;
import android.support.v4.util.Pair;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class b implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f70167a;

    /* renamed from: b  reason: collision with root package name */
    private final a f70168b;

    b(a aVar) {
        this.f70168b = aVar;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f70167a, false, 79806, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f70167a, false, 79806, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f70168b;
        Pair pair = (Pair) obj;
        if (pair != null) {
            int i = -1;
            int intValue = pair.first == null ? -1 : ((Integer) pair.first).intValue();
            if (pair.second != null) {
                i = ((Integer) pair.second).intValue();
            }
            if (intValue >= 0 && i != intValue) {
                aVar.f70152c.f70158c = i;
                aVar.f70152c.notifyItemChanged(intValue);
            }
        }
    }
}
