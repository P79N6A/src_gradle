package com.ss.android.ugc.aweme.photomovie.edit.change;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.photomovie.edit.b;
import com.ss.android.ugc.aweme.photomovie.transition.d;
import com.ss.android.ugc.aweme.photomovie.transition.e;
import com.ss.android.ugc.aweme.photomovie.transition.f;
import com.ss.android.ugc.aweme.shortvideo.bc;
import com.ss.android.ugc.aweme.shortvideo.imageframe.ImageFrameView;

public class PhotoMovieChangeModule implements LifecycleObserver, View.OnClickListener, e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3723a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f3724b = new Handler();

    /* renamed from: c  reason: collision with root package name */
    public com.ss.android.ugc.aweme.photomovie.edit.player.a f3725c;

    /* renamed from: d  reason: collision with root package name */
    public ImageFrameView f3726d;

    /* renamed from: e  reason: collision with root package name */
    public ImageFrameView f3727e;

    /* renamed from: f  reason: collision with root package name */
    public int f3728f;
    public Drawable g;
    public Drawable h;
    public a i;
    private Context j;
    private d k;
    private b l;
    private TextView m;
    private TextView n;
    private ImageView o;
    private ImageView p;
    private ImageView q;
    private ImageView r;

    public interface a {
        void a(int i, int i2);
    }

    @NonNull
    public final d a() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f3723a, false, 64051, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3723a, false, 64051, new Class[0], Void.TYPE);
            return;
        }
        this.f3724b.removeCallbacksAndMessages(null);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f3723a, false, 64053, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3723a, false, 64053, new Class[0], Void.TYPE);
            return;
        }
        this.n.setAlpha(0.6f);
        this.o.setAlpha(0.0f);
        this.f3726d.setAlpha(0.6f);
        this.f3727e.setAlpha(1.0f);
        this.p.setAlpha(1.0f);
        this.m.setAlpha(1.0f);
        this.q.setImageDrawable(this.g);
        this.r.setImageDrawable(this.h);
        this.f3725c.a(0);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f3723a, false, 64054, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3723a, false, 64054, new Class[0], Void.TYPE);
            return;
        }
        this.p.setAlpha(0.0f);
        this.f3727e.setAlpha(0.6f);
        this.m.setAlpha(0.6f);
        this.f3726d.setAlpha(1.0f);
        this.o.setAlpha(1.0f);
        this.n.setAlpha(1.0f);
        this.r.setImageDrawable(this.g);
        this.q.setImageDrawable(this.h);
        this.f3725c.a(1);
    }

    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f3723a, false, 64052, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f3723a, false, 64052, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == C0906R.id.asy) {
            if (this.f3728f != this.f3725c.a().mPlayType) {
                this.f3725c.a(this.f3728f);
            }
            this.l.b(this);
            return;
        }
        if (id == C0906R.id.at3) {
            this.l.b(this);
            if (!(this.f3728f == this.f3725c.a().mPlayType || this.i == null)) {
                this.i.a(this.f3725c.a().mPlayType, this.f3728f);
            }
        } else if (id == C0906R.id.at2) {
            if (this.f3725c.a().mPlayType != 1) {
                a(1, this.p, this.o, this.f3727e, this.f3726d, this.m, this.n, this.r, this.q);
                this.f3725c.a(1);
            }
        } else if (id == C0906R.id.at1 && this.f3725c.a().mPlayType != 0) {
            a(0, this.o, this.p, this.f3726d, this.f3727e, this.n, this.m, this.q, this.r);
            this.f3725c.a(0);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v19, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: java.lang.Object[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.shortvideo.imageframe.ImageFrameView r21, int[] r22) {
        /*
            r20 = this;
            r7 = r20
            r8 = r21
            r9 = r22
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            r12 = 1
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f3723a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.imageframe.ImageFrameView> r1 = com.ss.android.ugc.aweme.shortvideo.imageframe.ImageFrameView.class
            r5[r11] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 64057(0xfa39, float:8.9763E-41)
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0047
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f3723a
            r3 = 0
            r4 = 64057(0xfa39, float:8.9763E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.imageframe.ImageFrameView> r1 = com.ss.android.ugc.aweme.shortvideo.imageframe.ImageFrameView.class
            r5[r11] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r20
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0047:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f3723a
            r3 = 0
            r4 = 64056(0xfa38, float:8.9762E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.imageframe.ImageFrameView> r1 = com.ss.android.ugc.aweme.shortvideo.imageframe.ImageFrameView.class
            r5[r11] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.imageframe.c> r6 = com.ss.android.ugc.aweme.shortvideo.imageframe.c.class
            r1 = r20
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0089
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f3723a
            r3 = 0
            r4 = 64056(0xfa38, float:8.9762E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.imageframe.ImageFrameView> r1 = com.ss.android.ugc.aweme.shortvideo.imageframe.ImageFrameView.class
            r5[r11] = r1
            java.lang.Class<int[]> r1 = int[].class
            r5[r12] = r1
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.imageframe.c> r6 = com.ss.android.ugc.aweme.shortvideo.imageframe.c.class
            r1 = r20
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.shortvideo.imageframe.c r0 = (com.ss.android.ugc.aweme.shortvideo.imageframe.c) r0
        L_0x0087:
            r10 = r0
            goto L_0x00cf
        L_0x0089:
            com.ss.android.ugc.aweme.shortvideo.imageframe.c$a r0 = new com.ss.android.ugc.aweme.shortvideo.imageframe.c$a
            android.content.Context r1 = r7.j
            r0.<init>(r1, r9)
            r1 = 80
            r0.f68232d = r1
            r1 = 1065353216(0x3f800000, float:1.0)
            r0.g = r1
            r0.f68231c = r11
            r0.j = r8
            java.lang.Object[] r13 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.imageframe.c.a.f68229a
            r16 = 0
            r17 = 77527(0x12ed7, float:1.08638E-40)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.imageframe.c> r19 = com.ss.android.ugc.aweme.shortvideo.imageframe.c.class
            r14 = r0
            r18 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r1 == 0) goto L_0x00c9
            java.lang.Object[] r13 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.imageframe.c.a.f68229a
            r16 = 0
            r17 = 77527(0x12ed7, float:1.08638E-40)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.imageframe.c> r19 = com.ss.android.ugc.aweme.shortvideo.imageframe.c.class
            r14 = r0
            r18 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            com.ss.android.ugc.aweme.shortvideo.imageframe.c r0 = (com.ss.android.ugc.aweme.shortvideo.imageframe.c) r0
            goto L_0x0087
        L_0x00c9:
            com.ss.android.ugc.aweme.shortvideo.imageframe.c r1 = new com.ss.android.ugc.aweme.shortvideo.imageframe.c
            r1.<init>(r0, r11)
            r10 = r1
        L_0x00cf:
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.shortvideo.imageframe.ImageFrameView.f68213a
            r3 = 0
            r4 = 77515(0x12ecb, float:1.08622E-40)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.imageframe.c> r1 = com.ss.android.ugc.aweme.shortvideo.imageframe.c.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0101
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = com.ss.android.ugc.aweme.shortvideo.imageframe.ImageFrameView.f68213a
            r3 = 0
            r4 = 77515(0x12ecb, float:1.08622E-40)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.imageframe.c> r1 = com.ss.android.ugc.aweme.shortvideo.imageframe.c.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r21
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0155
        L_0x0101:
            com.ss.android.ugc.aweme.shortvideo.imageframe.c r0 = r8.f68214b
            if (r0 == 0) goto L_0x010a
            com.ss.android.ugc.aweme.shortvideo.imageframe.c r0 = r8.f68214b
            r0.a()
        L_0x010a:
            r8.f68214b = r10
            com.ss.android.ugc.aweme.shortvideo.imageframe.c r0 = r8.f68214b
            java.lang.Object[] r13 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.imageframe.c.f68221a
            r16 = 0
            r17 = 77519(0x12ecf, float:1.08627E-40)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r1 == 0) goto L_0x0138
            java.lang.Object[] r13 = new java.lang.Object[r11]
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.shortvideo.imageframe.c.f68221a
            r16 = 0
            r17 = 77519(0x12ecf, float:1.08627E-40)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0155
        L_0x0138:
            boolean r1 = r0.g
            if (r1 != 0) goto L_0x0155
            r0.g = r12
            java.io.File[] r1 = r0.f68224d
            if (r1 == 0) goto L_0x014a
            com.ss.android.ugc.aweme.shortvideo.imageframe.d r0 = r0.f68223c
            android.os.Handler r0 = r0.f68238d
            r0.sendEmptyMessage(r11)
            goto L_0x0155
        L_0x014a:
            int[] r1 = r0.f68225e
            if (r1 == 0) goto L_0x0155
            com.ss.android.ugc.aweme.shortvideo.imageframe.d r0 = r0.f68223c
            android.os.Handler r0 = r0.f68238d
            r0.sendEmptyMessage(r12)
        L_0x0155:
            com.ss.android.ugc.aweme.photomovie.edit.change.PhotoMovieChangeModule$5 r0 = new com.ss.android.ugc.aweme.photomovie.edit.change.PhotoMovieChangeModule$5
            r0.<init>(r8, r9)
            r8.setOnLoadFinishListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.photomovie.edit.change.PhotoMovieChangeModule.a(com.ss.android.ugc.aweme.shortvideo.imageframe.ImageFrameView, int[]):void");
    }

    public PhotoMovieChangeModule(@NonNull LifecycleOwner lifecycleOwner, @NonNull Context context, @NonNull FrameLayout frameLayout, @NonNull com.ss.android.ugc.aweme.photomovie.edit.player.a aVar, @NonNull b bVar) {
        lifecycleOwner.getLifecycle().addObserver(this);
        this.j = context;
        this.f3725c = aVar;
        this.l = bVar;
        int dip2Px = (int) UIUtils.dip2Px(context, 9.0f);
        int c2 = com.ss.android.ugc.aweme.themechange.base.b.f74589e.c();
        int b2 = com.ss.android.ugc.aweme.themechange.base.b.f74589e.b();
        this.g = bc.a(b2, b2, 0, dip2Px);
        this.h = bc.a(c2, c2, 0, dip2Px);
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.aeh, frameLayout, false);
        this.k = new com.ss.android.ugc.aweme.photomovie.transition.b(frameLayout, inflate);
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f3723a, false, 64050, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f3723a, false, 64050, new Class[]{View.class}, Void.TYPE);
        } else {
            inflate.findViewById(C0906R.id.asy).setOnClickListener(this);
            inflate.findViewById(C0906R.id.at3).setOnClickListener(this);
            ((TextView) inflate.findViewById(C0906R.id.dg_)).setText(C0906R.string.cnm);
            this.o = (ImageView) inflate.findViewById(C0906R.id.at2);
            this.o.setOnClickListener(this);
            this.p = (ImageView) inflate.findViewById(C0906R.id.at1);
            this.p.setOnClickListener(this);
            this.f3726d = (ImageFrameView) inflate.findViewById(C0906R.id.at5);
            this.f3727e = (ImageFrameView) inflate.findViewById(C0906R.id.at4);
            this.n = (TextView) inflate.findViewById(C0906R.id.d1c);
            this.m = (TextView) inflate.findViewById(C0906R.id.d1b);
            this.q = (ImageView) inflate.findViewById(C0906R.id.at0);
            this.r = (ImageView) inflate.findViewById(C0906R.id.asz);
            if (this.f3725c.a().mPlayType == 0) {
                b();
            } else {
                c();
            }
        }
        this.k.a((f) new f.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58889a;

            public final void d() {
                if (PatchProxy.isSupport(new Object[0], this, f58889a, false, 64059, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f58889a, false, 64059, new Class[0], Void.TYPE);
                    return;
                }
                super.d();
                PhotoMovieChangeModule.this.f3726d.a();
                PhotoMovieChangeModule.this.f3727e.a();
            }

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f58889a, false, 64058, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f58889a, false, 64058, new Class[0], Void.TYPE);
                    return;
                }
                super.a();
                PhotoMovieChangeModule.this.f3728f = PhotoMovieChangeModule.this.f3725c.a().mPlayType;
                if (PhotoMovieChangeModule.this.f3728f == 0) {
                    PhotoMovieChangeModule.this.b();
                } else {
                    PhotoMovieChangeModule.this.c();
                }
                PhotoMovieChangeModule.this.a(PhotoMovieChangeModule.this.f3726d, a.f58906a);
                PhotoMovieChangeModule.this.a(PhotoMovieChangeModule.this.f3727e, a.f58907b);
            }
        });
    }

    private void a(int i2, ImageView imageView, ImageView imageView2, ImageView imageView3, ImageView imageView4, TextView textView, TextView textView2, ImageView imageView5, ImageView imageView6) {
        ImageView imageView7 = imageView;
        ImageView imageView8 = imageView2;
        ImageView imageView9 = imageView3;
        ImageView imageView10 = imageView4;
        TextView textView3 = textView;
        TextView textView4 = textView2;
        final ImageView imageView11 = imageView5;
        final ImageView imageView12 = imageView6;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), imageView7, imageView8, imageView9, imageView10, textView3, textView4, imageView11, imageView12}, this, f3723a, false, 64055, new Class[]{Integer.TYPE, ImageView.class, ImageView.class, ImageView.class, ImageView.class, TextView.class, TextView.class, ImageView.class, ImageView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), imageView7, imageView8, imageView9, imageView10, textView3, textView4, imageView11, imageView12}, this, f3723a, false, 64055, new Class[]{Integer.TYPE, ImageView.class, ImageView.class, ImageView.class, ImageView.class, TextView.class, TextView.class, ImageView.class, ImageView.class}, Void.TYPE);
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView7, "alpha", new float[]{1.0f, 0.0f});
        ofFloat.setDuration(100);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView3, "alpha", new float[]{1.0f, 0.6f});
        ofFloat2.setDuration(100);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView9, "alpha", new float[]{1.0f, 0.6f});
        ofFloat3.setDuration(100);
        animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3});
        animatorSet.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58891a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f58891a, false, 64060, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f58891a, false, 64060, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationEnd(animator);
                imageView11.setImageDrawable(PhotoMovieChangeModule.this.g);
            }
        });
        AnimatorSet animatorSet2 = new AnimatorSet();
        ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView8, "alpha", new float[]{0.0f, 1.0f});
        ofFloat4.setDuration(200);
        ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(textView4, "alpha", new float[]{0.6f, 1.0f});
        ofFloat5.setDuration(200);
        ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView10, "alpha", new float[]{0.6f, 1.0f});
        ofFloat6.setDuration(200);
        animatorSet2.playTogether(new Animator[]{ofFloat4, ofFloat5, ofFloat6});
        animatorSet2.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58894a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f58894a, false, 64061, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f58894a, false, 64061, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationEnd(animator);
                imageView12.setImageDrawable(PhotoMovieChangeModule.this.h);
            }
        });
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.play(animatorSet2).after(animatorSet);
        final int i3 = i2;
        animatorSet3.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f58897a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f58897a, false, 64062, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f58897a, false, 64062, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                super.onAnimationEnd(animator);
                if (i3 == 1) {
                    PhotoMovieChangeModule.this.c();
                } else {
                    PhotoMovieChangeModule.this.b();
                }
            }
        });
        animatorSet3.start();
    }
}
