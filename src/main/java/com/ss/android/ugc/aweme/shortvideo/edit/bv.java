package com.ss.android.ugc.aweme.shortvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.ae;
import com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity;
import com.ss.android.ugc.aweme.sticker.data.PoiStruct;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public final /* synthetic */ class bv implements ae.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67147a;

    /* renamed from: b  reason: collision with root package name */
    private final VEVideoPublishEditActivity.AnonymousClass6 f67148b;

    /* renamed from: c  reason: collision with root package name */
    private final Effect f67149c;

    bv(VEVideoPublishEditActivity.AnonymousClass6 r1, Effect effect) {
        this.f67148b = r1;
        this.f67149c = effect;
    }

    public final void a(PoiStruct poiStruct, String str) {
        if (PatchProxy.isSupport(new Object[]{poiStruct, str}, this, f67147a, false, 76509, new Class[]{PoiStruct.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiStruct, str}, this, f67147a, false, 76509, new Class[]{PoiStruct.class, String.class}, Void.TYPE);
            return;
        }
        this.f67148b.a(this.f67149c, poiStruct);
    }
}
