package com.ss.android.ugc.aweme.photo.setfilter;

import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public final /* synthetic */ class b implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58784a;

    /* renamed from: b  reason: collision with root package name */
    private final EffectPhotoSetFilterActivity f58785b;

    b(EffectPhotoSetFilterActivity effectPhotoSetFilterActivity) {
        this.f58785b = effectPhotoSetFilterActivity;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f58784a, false, 63815, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f58784a, false, 63815, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f58785b.f58731b.setData((Map) obj);
    }
}
