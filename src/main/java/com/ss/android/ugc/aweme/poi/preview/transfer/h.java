package com.ss.android.ugc.aweme.poi.preview.transfer;

import android.content.Context;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.preview.b.b;
import com.ss.android.ugc.aweme.poi.preview.transfer.TransferAdapter;
import com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage;
import java.util.HashSet;
import java.util.Set;
import org.jetbrains.annotations.NotNull;

public final class h extends FrameLayout implements com.ss.android.ugc.aweme.poi.preview.b.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f60191a;

    /* renamed from: b  reason: collision with root package name */
    Context f60192b;

    /* renamed from: c  reason: collision with root package name */
    public TransferImage f60193c;

    /* renamed from: d  reason: collision with root package name */
    public ViewPager f60194d;

    /* renamed from: e  reason: collision with root package name */
    TransferAdapter f60195e;

    /* renamed from: f  reason: collision with root package name */
    public g f60196f;
    public ViewPager.OnPageChangeListener g = new TransferLayout$1(this);
    TransferAdapter.a h = new TransferAdapter.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60197a;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f60197a, false, 65472, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f60197a, false, 65472, new Class[0], Void.TYPE);
                return;
            }
            h.this.f60194d.addOnPageChangeListener(h.this.g);
            int i = h.this.f60196f.f60180b;
            if (h.this.f60196f.h) {
                h.this.a(i, 0);
            } else {
                h.this.a(i, 1);
            }
        }
    };
    private a i;
    private Set<Integer> j;
    private TransferImage.b k = new TransferImage.b() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f60199a;

        /* JADX WARNING: Code restructure failed: missing block: B:9:0x008c, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(int r14, int r15, int r16) {
            /*
                r13 = this;
                r7 = r13
                r8 = r16
                r9 = 3
                java.lang.Object[] r0 = new java.lang.Object[r9]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
                r10 = 0
                r0[r10] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
                r11 = 1
                r0[r11] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
                r12 = 2
                r0[r12] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f60199a
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r10] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r11] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r12] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 65473(0xffc1, float:9.1747E-41)
                r1 = r13
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0067
                java.lang.Object[] r0 = new java.lang.Object[r9]
                java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
                r0[r10] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
                r0[r11] = r1
                java.lang.Integer r1 = java.lang.Integer.valueOf(r16)
                r0[r12] = r1
                com.meituan.robust.ChangeQuickRedirect r2 = f60199a
                r3 = 0
                r4 = 65473(0xffc1, float:9.1747E-41)
                java.lang.Class[] r5 = new java.lang.Class[r9]
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r10] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r11] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r12] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r13
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0067:
                r0 = 100
                r1 = r15
                if (r1 != r0) goto L_0x008d
                switch(r14) {
                    case 1: goto L_0x0076;
                    case 2: goto L_0x0070;
                    default: goto L_0x006f;
                }
            L_0x006f:
                goto L_0x008c
            L_0x0070:
                com.ss.android.ugc.aweme.poi.preview.transfer.h r0 = com.ss.android.ugc.aweme.poi.preview.transfer.h.this
                r0.a()
                goto L_0x008c
            L_0x0076:
                com.ss.android.ugc.aweme.poi.preview.transfer.h r0 = com.ss.android.ugc.aweme.poi.preview.transfer.h.this
                r0.b()
                com.ss.android.ugc.aweme.poi.preview.transfer.h r0 = com.ss.android.ugc.aweme.poi.preview.transfer.h.this
                android.support.v4.view.ViewPager r0 = r0.f60194d
                r0.setVisibility(r10)
                com.ss.android.ugc.aweme.poi.preview.transfer.h r0 = com.ss.android.ugc.aweme.poi.preview.transfer.h.this
                com.ss.android.ugc.aweme.poi.preview.transfer.h r1 = com.ss.android.ugc.aweme.poi.preview.transfer.h.this
                com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage r1 = r1.f60193c
                r0.a((android.view.View) r1)
                goto L_0x00b3
            L_0x008c:
                return
            L_0x008d:
                r0 = 201(0xc9, float:2.82E-43)
                switch(r14) {
                    case 1: goto L_0x009b;
                    case 2: goto L_0x0093;
                    default: goto L_0x0092;
                }
            L_0x0092:
                goto L_0x00b3
            L_0x0093:
                if (r8 != r0) goto L_0x00b3
                com.ss.android.ugc.aweme.poi.preview.transfer.h r0 = com.ss.android.ugc.aweme.poi.preview.transfer.h.this
                r0.a()
                goto L_0x00b3
            L_0x009b:
                if (r8 != r0) goto L_0x00b3
                com.ss.android.ugc.aweme.poi.preview.transfer.h r0 = com.ss.android.ugc.aweme.poi.preview.transfer.h.this
                r0.b()
                com.ss.android.ugc.aweme.poi.preview.transfer.h r0 = com.ss.android.ugc.aweme.poi.preview.transfer.h.this
                android.support.v4.view.ViewPager r0 = r0.f60194d
                r0.setVisibility(r10)
                com.ss.android.ugc.aweme.poi.preview.transfer.h r0 = com.ss.android.ugc.aweme.poi.preview.transfer.h.this
                com.ss.android.ugc.aweme.poi.preview.transfer.h r1 = com.ss.android.ugc.aweme.poi.preview.transfer.h.this
                com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage r1 = r1.f60193c
                r0.a((android.view.View) r1)
                return
            L_0x00b3:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.preview.transfer.h.AnonymousClass2.a(int, int, int):void");
        }
    };

    interface a {
        void a();
    }

    public final TransferAdapter getTransAdapter() {
        return this.f60195e;
    }

    public final g getTransConfig() {
        return this.f60196f;
    }

    public final TransferImage.b getTransListener() {
        return this.k;
    }

    @NotNull
    public final g getTransferConfig() {
        return this.f60196f;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f60191a, false, 65467, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60191a, false, 65467, new Class[0], Void.TYPE);
            return;
        }
        b bVar = this.f60196f.q;
        if (bVar != null && this.f60196f.m.size() >= 2) {
            bVar.a(this, this);
            bVar.a(this.f60194d);
        }
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f60191a, false, 65461, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60191a, false, 65461, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        this.f60194d.removeOnPageChangeListener(this.g);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f60191a, false, 65458, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60191a, false, 65458, new Class[0], Void.TYPE);
            return;
        }
        this.j.clear();
        if (PatchProxy.isSupport(new Object[0], this, f60191a, false, 65469, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f60191a, false, 65469, new Class[0], Void.TYPE);
        } else {
            b bVar = this.f60196f.q;
            if (bVar != null && this.f60196f.m.size() >= 2) {
                bVar.b();
            }
        }
        removeAllViews();
        this.i.a();
    }

    public final void setOnLayoutResetListener(a aVar) {
        this.i = aVar;
    }

    h(Context context) {
        super(context);
        this.f60192b = context;
        this.j = new HashSet();
    }

    private void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60191a, false, 65457, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60191a, false, 65457, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a(i2).b(i2);
    }

    /* access modifiers changed from: package-private */
    public final i a(int i2) {
        i iVar;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f60191a, false, 65463, new Class[]{Integer.TYPE}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f60191a, false, 65463, new Class[]{Integer.TYPE}, i.class);
        }
        if (!this.f60196f.c()) {
            iVar = new e(this);
        } else {
            if (this.f60196f.r.a(this.f60196f.m.get(i2))) {
                iVar = new c(this);
            } else {
                iVar = new a(this);
            }
        }
        return iVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0109  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void dismiss(int r11) {
        /*
            r10 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r8 = 0
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f60191a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 65465(0xffb9, float:9.1736E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f60191a
            r3 = 0
            r4 = 65465(0xffb9, float:9.1736E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003a:
            com.ss.android.ugc.aweme.poi.preview.transfer.TransferAdapter r0 = r10.f60195e
            if (r0 != 0) goto L_0x003f
            return
        L_0x003f:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage r0 = r10.f60193c
            r9 = 2
            if (r0 == 0) goto L_0x004d
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage r0 = r10.f60193c
            int r0 = r0.getState()
            if (r0 != r9) goto L_0x004d
            return
        L_0x004d:
            com.ss.android.ugc.aweme.poi.preview.transfer.g r0 = r10.f60196f
            int r0 = r0.e()
            r1 = 0
            if (r0 <= 0) goto L_0x0061
            com.ss.android.ugc.aweme.poi.preview.transfer.g r0 = r10.f60196f
            int r0 = r0.e()
            if (r11 == r0) goto L_0x0070
            r10.f60193c = r1
            goto L_0x007a
        L_0x0061:
            com.ss.android.ugc.aweme.poi.preview.transfer.g r0 = r10.f60196f
            int r0 = r0.i
            if (r0 <= 0) goto L_0x0070
            com.ss.android.ugc.aweme.poi.preview.transfer.g r0 = r10.f60196f
            int r0 = r0.i
            if (r11 < r0) goto L_0x0070
            r10.f60193c = r1
            goto L_0x007a
        L_0x0070:
            com.ss.android.ugc.aweme.poi.preview.transfer.i r0 = r10.a((int) r11)
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage r0 = r0.c(r11)
            r10.f60193c = r0
        L_0x007a:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage r0 = r10.f60193c
            if (r0 != 0) goto L_0x0109
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f60191a
            r3 = 0
            r4 = 65466(0xffba, float:9.1737E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00b6
            java.lang.Object[] r0 = new java.lang.Object[r7]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r11)
            r0[r8] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f60191a
            r3 = 0
            r4 = 65466(0xffba, float:9.1737E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x010f
        L_0x00b6:
            com.ss.android.ugc.aweme.poi.preview.transfer.TransferAdapter r0 = r10.f60195e
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage r0 = r0.a(r11)
            r10.f60193c = r0
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage r0 = r10.f60193c
            if (r0 != 0) goto L_0x00c6
            r10.a()
            goto L_0x010f
        L_0x00c6:
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage r0 = r10.f60193c
            r0.setState(r9)
            com.ss.android.ugc.aweme.poi.preview.view.image.TransferImage r0 = r10.f60193c
            r0.j = r8
            android.animation.ValueAnimator r0 = new android.animation.ValueAnimator
            r0.<init>()
            com.ss.android.ugc.aweme.poi.preview.transfer.g r1 = r10.f60196f
            long r1 = r1.g
            r0.setDuration(r1)
            android.view.animation.AccelerateDecelerateInterpolator r1 = new android.view.animation.AccelerateDecelerateInterpolator
            r1.<init>()
            r0.setInterpolator(r1)
            java.lang.String r1 = "alpha"
            float[] r2 = new float[r9]
            r2 = {1065353216, 0} // fill-array
            android.animation.PropertyValuesHolder r1 = android.animation.PropertyValuesHolder.ofFloat(r1, r2)
            android.animation.PropertyValuesHolder[] r2 = new android.animation.PropertyValuesHolder[r7]
            r2[r8] = r1
            r0.setValues(r2)
            com.ss.android.ugc.aweme.poi.preview.transfer.h$5 r1 = new com.ss.android.ugc.aweme.poi.preview.transfer.h$5
            r1.<init>()
            r0.addUpdateListener(r1)
            com.ss.android.ugc.aweme.poi.preview.transfer.h$6 r1 = new com.ss.android.ugc.aweme.poi.preview.transfer.h$6
            r1.<init>()
            r0.addListener(r1)
            r0.start()
            goto L_0x010f
        L_0x0109:
            android.support.v4.view.ViewPager r0 = r10.f60194d
            r1 = 4
            r0.setVisibility(r1)
        L_0x010f:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f60191a
            r3 = 0
            r4 = 65468(0xffbc, float:9.174E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0133
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f60191a
            r3 = 0
            r4 = 65468(0xffbc, float:9.174E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0133:
            com.ss.android.ugc.aweme.poi.preview.transfer.g r0 = r10.f60196f
            com.ss.android.ugc.aweme.poi.preview.b.b r0 = r0.q
            if (r0 == 0) goto L_0x0146
            com.ss.android.ugc.aweme.poi.preview.transfer.g r1 = r10.f60196f
            java.util.List<java.lang.String> r1 = r1.m
            int r1 = r1.size()
            if (r1 < r9) goto L_0x0146
            r0.a()
        L_0x0146:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.poi.preview.transfer.h.dismiss(int):void");
    }

    public final void a(View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f60191a, false, 65460, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f60191a, false, 65460, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            viewGroup.removeView(view2);
        }
    }

    public final void a(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60191a, false, 65456, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f60191a, false, 65456, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int i4 = i2 - i3;
        int i5 = i2 + i3;
        b(i2);
        this.j.add(Integer.valueOf(i2));
        if (i4 >= 0 && !this.j.contains(Integer.valueOf(i4))) {
            b(i4);
            this.j.add(Integer.valueOf(i4));
        }
        if (i5 < this.f60196f.m.size() && !this.j.contains(Integer.valueOf(i5))) {
            b(i5);
            this.j.add(Integer.valueOf(i5));
        }
    }

    public final void a(final ImageView imageView, final int i2) {
        if (PatchProxy.isSupport(new Object[]{imageView, Integer.valueOf(i2)}, this, f60191a, false, 65464, new Class[]{ImageView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView, Integer.valueOf(i2)}, this, f60191a, false, 65464, new Class[]{ImageView.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        imageView.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f60201a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f60201a, false, 65474, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f60201a, false, 65474, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                h.this.dismiss(i2);
            }
        });
        if (this.f60196f.B != null) {
            imageView.setOnLongClickListener(new View.OnLongClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f60204a;

                public final boolean onLongClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f60204a, false, 65475, new Class[]{View.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{view}, this, f60204a, false, 65475, new Class[]{View.class}, Boolean.TYPE)).booleanValue();
                    }
                    h.this.f60196f.B.a(imageView, i2);
                    return false;
                }
            });
        }
    }
}
