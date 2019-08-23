package com.ss.android.ugc.aweme.longvideo.view;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.ImageView;
import com.facebook.c.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.anim.b;
import com.ss.android.ugc.aweme.anim.d;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.feed.k.h;
import com.ss.android.ugc.aweme.festival.christmas.a;

public class LongVideoDiggAnimationView extends AppCompatImageView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53974a;

    /* renamed from: b  reason: collision with root package name */
    c f53975b;

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.anim.c<ImageView> f53976c = new com.ss.android.ugc.aweme.anim.c<ImageView>() {

        /* renamed from: b  reason: collision with root package name */
        public static ChangeQuickRedirect f53981b;

        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0039, code lost:
            if (r1 == null) goto L_0x003b;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a() {
            /*
                r9 = this;
                r0 = 0
                java.lang.Object[] r1 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r3 = f53981b
                java.lang.Class[] r6 = new java.lang.Class[r0]
                java.lang.Class r7 = java.lang.Void.TYPE
                r4 = 0
                r5 = 56796(0xdddc, float:7.9588E-41)
                r2 = r9
                boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
                if (r1 == 0) goto L_0x0025
                java.lang.Object[] r2 = new java.lang.Object[r0]
                com.meituan.robust.ChangeQuickRedirect r4 = f53981b
                r5 = 0
                r6 = 56796(0xdddc, float:7.9588E-41)
                java.lang.Class[] r7 = new java.lang.Class[r0]
                java.lang.Class r8 = java.lang.Void.TYPE
                r3 = r9
                com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                return
            L_0x0025:
                super.a()
                com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r0 = com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.this
                r1 = 254(0xfe, float:3.56E-43)
                r0.setImageAlpha(r1)
                boolean r1 = com.ss.android.ugc.aweme.festival.christmas.a.a()
                if (r1 == 0) goto L_0x003b
                android.graphics.drawable.Drawable r1 = com.ss.android.ugc.aweme.festival.common.FestivalResHandler.a()
                if (r1 != 0) goto L_0x0048
            L_0x003b:
                com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r1 = com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.this
                android.content.Context r1 = r1.getContext()
                r2 = 2130838053(0x7f020225, float:1.7281077E38)
                android.graphics.drawable.Drawable r1 = android.support.v4.content.ContextCompat.getDrawable(r1, r2)
            L_0x0048:
                r0.setImageDrawable(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.AnonymousClass2.a():void");
        }
    };

    public LongVideoDiggAnimationView(Context context) {
        super(context);
    }

    public final void a(View view) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{view}, this, f53974a, false, 56792, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f53974a, false, 56792, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f53974a, false, 56791, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f53974a, false, 56791, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            Boolean bool = (Boolean) getTag(a.cr6);
            if (bool == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
        }
        if (z) {
            h.a(view);
            return;
        }
        if (isSelected() || com.ss.android.ugc.aweme.theme.a.a(getContext())) {
            h.a(view);
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f53974a, false, 56793, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53974a, false, 56793, new Class[0], Void.TYPE);
            } else {
                animate().scaleY(0.0f).scaleX(0.0f).setDuration(200).setInterpolator(new AccelerateDecelerateInterpolator()).withEndAction(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f53977a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f53977a, false, 56794, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f53977a, false, 56794, new Class[0], Void.TYPE);
                            return;
                        }
                        b.a().a(k.a(), "new_follow_anim_likes_explode", new d() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f53979a;

                            /* JADX WARNING: Code restructure failed: missing block: B:7:0x0049, code lost:
                                if (r0 == null) goto L_0x004b;
                             */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final void a(@android.support.annotation.Nullable com.facebook.c.b.k r11, java.lang.String r12) {
                                /*
                                    r10 = this;
                                    r7 = 2
                                    java.lang.Object[] r0 = new java.lang.Object[r7]
                                    r8 = 0
                                    r0[r8] = r11
                                    r9 = 1
                                    r0[r9] = r12
                                    com.meituan.robust.ChangeQuickRedirect r2 = f53979a
                                    java.lang.Class[] r5 = new java.lang.Class[r7]
                                    java.lang.Class<com.facebook.c.b.k> r1 = com.facebook.c.b.k.class
                                    r5[r8] = r1
                                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                                    r5[r9] = r1
                                    java.lang.Class r6 = java.lang.Void.TYPE
                                    r3 = 0
                                    r4 = 56795(0xdddb, float:7.9587E-41)
                                    r1 = r10
                                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                                    if (r0 == 0) goto L_0x003f
                                    java.lang.Object[] r0 = new java.lang.Object[r7]
                                    r0[r8] = r11
                                    r0[r9] = r12
                                    com.meituan.robust.ChangeQuickRedirect r2 = f53979a
                                    r3 = 0
                                    r4 = 56795(0xdddb, float:7.9587E-41)
                                    java.lang.Class[] r5 = new java.lang.Class[r7]
                                    java.lang.Class<com.facebook.c.b.k> r1 = com.facebook.c.b.k.class
                                    r5[r8] = r1
                                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                                    r5[r9] = r1
                                    java.lang.Class r6 = java.lang.Void.TYPE
                                    r1 = r10
                                    com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                                    return
                                L_0x003f:
                                    boolean r0 = com.ss.android.ugc.aweme.festival.christmas.a.a()
                                    if (r0 == 0) goto L_0x004b
                                    android.graphics.drawable.Drawable r0 = com.ss.android.ugc.aweme.festival.common.FestivalResHandler.b()
                                    if (r0 != 0) goto L_0x005a
                                L_0x004b:
                                    com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView$1 r0 = com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.AnonymousClass1.this
                                    com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r0 = com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.this
                                    android.content.Context r0 = r0.getContext()
                                    r1 = 2130838958(0x7f0205ae, float:1.7282913E38)
                                    android.graphics.drawable.Drawable r0 = android.support.v4.content.ContextCompat.getDrawable(r0, r1)
                                L_0x005a:
                                    if (r0 == 0) goto L_0x008f
                                    r1 = 120(0x78, float:1.68E-43)
                                    r2 = 114(0x72, float:1.6E-43)
                                    r0.setBounds(r8, r8, r1, r2)
                                    com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView$1 r1 = com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.AnonymousClass1.this
                                    com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r1 = com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.this
                                    com.facebook.c.e r2 = new com.facebook.c.e
                                    r2.<init>()
                                    com.facebook.c.e r2 = r2.a(r11)
                                    com.facebook.c.e$a r2 = r2.f23423c
                                    android.util.Pair[] r3 = new android.util.Pair[r9]
                                    java.lang.String r4 = "keyframes"
                                    android.graphics.Matrix r5 = new android.graphics.Matrix
                                    r5.<init>()
                                    android.util.Pair r0 = android.util.Pair.create(r0, r5)
                                    android.util.Pair r0 = android.util.Pair.create(r4, r0)
                                    r3[r8] = r0
                                    com.facebook.c.e$a r0 = r2.a(r3)
                                    com.facebook.c.c r0 = r0.a()
                                    r1.f53975b = r0
                                L_0x008f:
                                    com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView$1 r0 = com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.AnonymousClass1.this
                                    com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r0 = com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.this
                                    android.view.ViewPropertyAnimator r1 = r0.animate()
                                    r2 = 1065353216(0x3f800000, float:1.0)
                                    android.view.ViewPropertyAnimator r1 = r1.scaleX(r2)
                                    android.view.ViewPropertyAnimator r1 = r1.scaleY(r2)
                                    r2 = 1
                                    android.view.ViewPropertyAnimator r1 = r1.setDuration(r2)
                                    r1.start()
                                    r0.setVisibility(r8)
                                    r1 = 0
                                    r0.setLayerType(r9, r1)
                                    com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView$1 r1 = com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.AnonymousClass1.this
                                    com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r1 = com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.this
                                    com.facebook.c.c r1 = r1.f53975b
                                    r0.setImageDrawable(r1)
                                    r0.setImageAlpha(r8)
                                    com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView$1 r0 = com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.AnonymousClass1.this
                                    com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r0 = com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.this
                                    com.facebook.c.c r0 = r0.f53975b
                                    r0.a()
                                    com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView$1 r0 = com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.AnonymousClass1.this
                                    com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r0 = com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.this
                                    com.facebook.c.c r0 = r0.f53975b
                                    r0.c()
                                    com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView$1 r0 = com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.AnonymousClass1.this
                                    com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r0 = com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.this
                                    com.facebook.c.c r0 = r0.f53975b
                                    com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView$1 r1 = com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.AnonymousClass1.this
                                    com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView r1 = com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.this
                                    com.ss.android.ugc.aweme.anim.c<android.widget.ImageView> r1 = r1.f53976c
                                    r0.a((com.facebook.c.c.C0251c) r1)
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.longvideo.view.LongVideoDiggAnimationView.AnonymousClass1.AnonymousClass1.a(com.facebook.c.b.k, java.lang.String):void");
                            }
                        });
                    }
                }).start();
            }
        }
    }

    public LongVideoDiggAnimationView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LongVideoDiggAnimationView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
