package com.ss.android.ugc.aweme.shortvideo.i;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;

public final /* synthetic */ class f implements IAVService.MusicWaveDataListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68202a;

    /* renamed from: b  reason: collision with root package name */
    private final a f68203b;

    f(a aVar) {
        this.f68203b = aVar;
    }

    public final void onFinish(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, f68202a, false, 78292, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj2}, this, f68202a, false, 78292, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        a aVar = this.f68203b;
        if (obj2 == null || !(obj2 instanceof MusicWaveBean)) {
            aVar.a((MusicWaveBean) null);
        } else {
            aVar.a((MusicWaveBean) obj2);
        }
    }
}
