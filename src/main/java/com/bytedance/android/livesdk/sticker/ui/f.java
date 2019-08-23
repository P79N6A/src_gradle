package com.bytedance.android.livesdk.sticker.ui;

import com.bytedance.android.livesdk.sticker.b.a;
import com.bytedance.android.livesdk.sticker.ui.LiveGestureMagicPageAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;

public final /* synthetic */ class f implements LiveGestureMagicPageAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17389a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveGestureMagicPageAdapter f17390b;

    /* renamed from: c  reason: collision with root package name */
    private final EffectCategoryResponse f17391c;

    /* renamed from: d  reason: collision with root package name */
    private final int f17392d;

    f(LiveGestureMagicPageAdapter liveGestureMagicPageAdapter, EffectCategoryResponse effectCategoryResponse, int i) {
        this.f17390b = liveGestureMagicPageAdapter;
        this.f17391c = effectCategoryResponse;
        this.f17392d = i;
    }

    public final void a(Boolean bool, a aVar) {
        if (PatchProxy.isSupport(new Object[]{bool, aVar}, this, f17389a, false, 13461, new Class[]{Boolean.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bool, aVar}, this, f17389a, false, 13461, new Class[]{Boolean.class, a.class}, Void.TYPE);
            return;
        }
        this.f17390b.a(aVar, bool.booleanValue(), this.f17391c, this.f17392d);
    }
}
