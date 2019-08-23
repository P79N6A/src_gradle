package com.ss.android.ugc.aweme.story.shootvideo.edit;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.port.in.ae;
import com.ss.android.ugc.aweme.sticker.data.PoiStruct;
import com.ss.android.ugc.aweme.story.shootvideo.edit.a;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

public final /* synthetic */ class q implements ae.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f73507a;

    /* renamed from: b  reason: collision with root package name */
    private final a.AnonymousClass5 f73508b;

    /* renamed from: c  reason: collision with root package name */
    private final Effect f73509c;

    q(a.AnonymousClass5 r1, Effect effect) {
        this.f73508b = r1;
        this.f73509c = effect;
    }

    public final void a(PoiStruct poiStruct, String str) {
        if (PatchProxy.isSupport(new Object[]{poiStruct, str}, this, f73507a, false, 85267, new Class[]{PoiStruct.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{poiStruct, str}, this, f73507a, false, 85267, new Class[]{PoiStruct.class, String.class}, Void.TYPE);
            return;
        }
        a.AnonymousClass5 r0 = this.f73508b;
        Effect effect = this.f73509c;
        if (a.this.g != null) {
            a.this.g.b();
        }
        PoiStruct poiStruct2 = "NULL".equalsIgnoreCase(poiStruct.getPoiId()) ? null : poiStruct;
        a.this.A.a(a.this.g(), a.this.a());
        if (a.this.A instanceof com.ss.android.ugc.aweme.shortvideo.edit.infosticker.interact.poi.a) {
            a.this.A.a(poiStruct2);
            a.this.A.a(effect.unzipPath);
            a.this.A.v = effect.effect_id;
        }
    }
}
