package com.ss.android.ugc.aweme.shortvideo.guide;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import javax.annotation.Nullable;

public class DefaultStickerGuidePresenter implements IStickerGuidePresenter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3951a;

    /* renamed from: b  reason: collision with root package name */
    private FrameLayout f3952b;

    /* renamed from: c  reason: collision with root package name */
    private e f3953c;

    /* renamed from: d  reason: collision with root package name */
    private f f3954d;

    /* renamed from: e  reason: collision with root package name */
    private FaceStickerBean f3955e;

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void hide() {
        if (PatchProxy.isSupport(new Object[0], this, f3951a, false, 77430, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3951a, false, 77430, new Class[0], Void.TYPE);
            return;
        }
        if (this.f3953c != null) {
            this.f3953c.a(true);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DefaultStickerGuidePresenter(android.widget.FrameLayout r10) {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.shortvideo.guide.c.f67989a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.guide.c> r7 = com.ss.android.ugc.aweme.shortvideo.guide.c.class
            r2 = 0
            r4 = 1
            r5 = 77426(0x12e72, float:1.08497E-40)
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            r3 = 0
            com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.shortvideo.guide.c.f67989a
            r5 = 1
            r6 = 77426(0x12e72, float:1.08497E-40)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.guide.c> r8 = com.ss.android.ugc.aweme.shortvideo.guide.c.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.shortvideo.guide.c r0 = (com.ss.android.ugc.aweme.shortvideo.guide.c) r0
            goto L_0x002d
        L_0x0028:
            com.ss.android.ugc.aweme.shortvideo.guide.c r0 = new com.ss.android.ugc.aweme.shortvideo.guide.c
            r0.<init>()
        L_0x002d:
            r9.<init>(r0, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.guide.DefaultStickerGuidePresenter.<init>(android.widget.FrameLayout):void");
    }

    public final void a(LifecycleOwner lifecycleOwner) {
        if (PatchProxy.isSupport(new Object[]{lifecycleOwner}, this, f3951a, false, 77429, new Class[]{LifecycleOwner.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{lifecycleOwner}, this, f3951a, false, 77429, new Class[]{LifecycleOwner.class}, Void.TYPE);
            return;
        }
        lifecycleOwner.getLifecycle().addObserver(this);
    }

    public final void a(@Nullable FaceStickerBean faceStickerBean) {
        if (PatchProxy.isSupport(new Object[]{faceStickerBean}, this, f3951a, false, 77428, new Class[]{FaceStickerBean.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{faceStickerBean}, this, f3951a, false, 77428, new Class[]{FaceStickerBean.class}, Void.TYPE);
            return;
        }
        if (this.f3953c != null) {
            this.f3953c.a(false);
        }
        if (faceStickerBean == null || (faceStickerBean.equals(this.f3955e) && !faceStickerBean.getTypes().contains("Game2DV2"))) {
            this.f3955e = faceStickerBean;
            return;
        }
        this.f3955e = faceStickerBean;
        this.f3953c = this.f3954d.a(faceStickerBean);
        this.f3953c.a(this.f3952b);
    }

    private DefaultStickerGuidePresenter(f fVar, FrameLayout frameLayout) {
        this.f3952b = frameLayout;
        this.f3954d = fVar;
    }
}
