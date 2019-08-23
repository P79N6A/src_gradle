package com.ss.android.ugc.aweme.shortvideo.util;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.IAVService;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import com.ss.android.ugc.aweme.shortvideo.util.n;

public final /* synthetic */ class o implements IAVService.MusicWaveDataListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71192a;

    /* renamed from: b  reason: collision with root package name */
    private final n.AnonymousClass8 f71193b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f71194c;

    o(n.AnonymousClass8 r1, boolean z) {
        this.f71193b = r1;
        this.f71194c = z;
    }

    public final void onFinish(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f71192a, false, 80937, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f71192a, false, 80937, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        n.AnonymousClass8 r0 = this.f71193b;
        boolean z = this.f71194c;
        if (obj == null || !(obj instanceof MusicWaveBean)) {
            n.this.a(z, null);
        } else {
            n.this.a(z, (MusicWaveBean) obj);
        }
    }
}
