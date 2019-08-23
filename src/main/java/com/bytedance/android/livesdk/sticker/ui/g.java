package com.bytedance.android.livesdk.sticker.ui;

import com.bytedance.android.livesdk.sticker.b.a;
import com.bytedance.android.livesdk.sticker.ui.LiveGestureMagicPageAdapter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.effectmanager.effect.model.EffectCategoryResponse;

public final /* synthetic */ class g implements LiveGestureMagicPageAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17393a;

    /* renamed from: b  reason: collision with root package name */
    private final LiveGestureMagicPageAdapter f17394b;

    /* renamed from: c  reason: collision with root package name */
    private final EffectCategoryResponse f17395c;

    /* renamed from: d  reason: collision with root package name */
    private final int f17396d;

    g(LiveGestureMagicPageAdapter liveGestureMagicPageAdapter, EffectCategoryResponse effectCategoryResponse, int i) {
        this.f17394b = liveGestureMagicPageAdapter;
        this.f17395c = effectCategoryResponse;
        this.f17396d = i;
    }

    public final void a(Boolean bool, a aVar) {
        if (PatchProxy.isSupport(new Object[]{bool, aVar}, this, f17393a, false, 13462, new Class[]{Boolean.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bool, aVar}, this, f17393a, false, 13462, new Class[]{Boolean.class, a.class}, Void.TYPE);
            return;
        }
        this.f17394b.a(aVar, bool.booleanValue(), this.f17395c, this.f17396d);
    }
}
