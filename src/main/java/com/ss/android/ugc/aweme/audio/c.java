package com.ss.android.ugc.aweme.audio;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Point;
import android.support.annotation.NonNull;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.audio.b;
import com.ss.android.ugc.aweme.audio.i;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.poi.widget.d;
import com.ss.android.ugc.aweme.shortvideo.f.f;
import java.util.Map;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

@SuppressLint({"LogNotTimber"})
public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2712a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f2713b = a.a();

    /* renamed from: c  reason: collision with root package name */
    static int f2714c;
    private static int n;

    /* renamed from: d  reason: collision with root package name */
    public Activity f2715d;

    /* renamed from: e  reason: collision with root package name */
    public LinearLayout f2716e;

    /* renamed from: f  reason: collision with root package name */
    public i f2717f = i.a();
    public i.a g;
    public g h = g.a();
    public boolean i;
    String j;
    public com.ss.android.ugc.aweme.poi.widget.c k;
    public b.a l;
    public boolean m;
    private ViewStub o;
    private ImageView p;
    private boolean q;

    @Subscribe(a = ThreadMode.MAIN)
    public void onVideoStatusChanged(f fVar) {
        if (fVar != null) {
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f2712a, false, 23894, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2712a, false, 23894, new Class[0], Void.TYPE);
            return;
        }
        this.f2716e.postDelayed(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f34403a;

            public final void run() {
                int i;
                if (PatchProxy.isSupport(new Object[0], this, f34403a, false, 23902, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f34403a, false, 23902, new Class[0], Void.TYPE);
                    return;
                }
                c.this.k = new com.ss.android.ugc.aweme.poi.widget.c(c.this.f2715d, true);
                if (c.this.i) {
                    c.this.k.c(C0906R.string.cle);
                } else {
                    c.this.k.c(C0906R.string.cld);
                }
                c.this.k.e(c.this.f2715d.getResources().getColor(C0906R.color.a3c));
                c.this.k.o = c.this.k.r + 2000;
                com.ss.android.ugc.aweme.poi.widget.c cVar = c.this.k;
                if (PatchProxy.isSupport(new Object[]{8388613}, cVar, com.ss.android.ugc.aweme.poi.widget.c.f61054a, false, 66943, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    com.ss.android.ugc.aweme.poi.widget.c cVar2 = cVar;
                    PatchProxy.accessDispatch(new Object[]{8388613}, cVar2, com.ss.android.ugc.aweme.poi.widget.c.f61054a, false, 66943, new Class[]{Integer.TYPE}, Void.TYPE);
                } else {
                    cVar.l = 8388613;
                    if (cVar.f61056c != null) {
                        cVar.f61056c.setBubbleOrientation(com.ss.android.ugc.aweme.poi.widget.c.d(cVar.l));
                    }
                }
                c.this.k.f();
                c.this.k.m = false;
                c.this.k.a(false);
                c.this.k.setOnDismissListener(new PopupWindow.OnDismissListener() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f34405a;

                    public final void onDismiss() {
                        if (PatchProxy.isSupport(new Object[0], this, f34405a, false, 23903, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f34405a, false, 23903, new Class[0], Void.TYPE);
                            return;
                        }
                        Activity activity = c.this.f2715d;
                        if (PatchProxy.isSupport(new Object[]{activity}, null, g.f34417a, true, 23907, new Class[]{Context.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{activity}, null, g.f34417a, true, 23907, new Class[]{Context.class}, Void.TYPE);
                        } else {
                            com.ss.android.ugc.aweme.aj.b.b().a((Context) activity, "has_show_volume_guide", true);
                        }
                        c.this.k = null;
                    }
                });
                com.ss.android.ugc.aweme.poi.widget.c cVar3 = c.this.k;
                LinearLayout linearLayout = c.this.f2716e;
                if (PatchProxy.isSupport(new Object[]{linearLayout}, cVar3, com.ss.android.ugc.aweme.poi.widget.c.f61054a, false, 66959, new Class[]{View.class}, Void.TYPE)) {
                    com.ss.android.ugc.aweme.poi.widget.c cVar4 = cVar3;
                    PatchProxy.accessDispatch(new Object[]{linearLayout}, cVar4, com.ss.android.ugc.aweme.poi.widget.c.f61054a, false, 66959, new Class[]{View.class}, Void.TYPE);
                } else if (!(cVar3.f61057d.isFinishing() || linearLayout == null || linearLayout.getWindowToken() == null)) {
                    UIUtils.dip2Px(cVar3.f61057d, 16.0f);
                    UIUtils.dip2Px(cVar3.f61057d, 16.0f);
                    float dip2Px = UIUtils.dip2Px(cVar3.f61057d, 36.0f);
                    cVar3.getContentView().removeCallbacks(cVar3.q);
                    if (!cVar3.isShowing()) {
                        if (cVar3.f61059f == 0 || cVar3.g == 0) {
                            cVar3.getContentView().measure(Integer.MIN_VALUE, Integer.MIN_VALUE);
                        } else {
                            cVar3.getContentView().measure(View.MeasureSpec.makeMeasureSpec(cVar3.f61059f, 1073741824), View.MeasureSpec.makeMeasureSpec(cVar3.g, 1073741824));
                        }
                        int[] iArr = new int[2];
                        if (cVar3.t != null) {
                            Point point = (Point) cVar3.t.a();
                            iArr[0] = point.x;
                            iArr[1] = point.y;
                        } else {
                            linearLayout.getLocationOnScreen(iArr);
                        }
                        cVar3.l = 80;
                        cVar3.i = p.b(cVar3.f61057d) - cVar3.c();
                        cVar3.j = 0;
                        int d2 = com.ss.android.ugc.aweme.poi.widget.c.d(cVar3.l);
                        if (linearLayout.getMeasuredHeight() > 0) {
                            i = linearLayout.getMeasuredHeight();
                        } else {
                            i = (int) dip2Px;
                        }
                        cVar3.f61056c.a(d2, (float) (cVar3.c() - i));
                        cVar3.a();
                        cVar3.showAtLocation(linearLayout, 0, cVar3.i, iArr[1] + cVar3.j + i);
                        cVar3.a(true, cVar3.l);
                        cVar3.k = false;
                        if (cVar3.o > 0) {
                            cVar3.getContentView().postDelayed(cVar3.q, cVar3.o);
                        }
                    } else {
                        d.a(cVar3);
                    }
                }
                r.a("mute_guide_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "homepage_hot").f34114b);
            }
        }, 1000);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2712a, false, 23897, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2712a, false, 23897, new Class[0], Void.TYPE);
            return;
        }
        if (this.f2716e != null) {
            b(a.e(this.f2715d));
        }
        if (this.f2716e != null && !g.a(this.f2715d) && !this.q) {
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2712a, false, 23892, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2712a, false, 23892, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.m = true;
        a.a((Context) this.f2715d, z);
        b(z);
        if (!z && a.b(this.f2715d) == 0 && f2714c > 0) {
            a.a(this.f2715d, f2714c, 4);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ boolean c(boolean z) {
        int i2;
        if (z) {
            if (f2714c == 0) {
                i2 = a.b(this.f2715d);
            } else if (f2714c >= n) {
                i2 = f2714c;
            } else {
                i2 = f2714c + 1;
            }
            f2714c = i2;
            if (!this.i) {
                return false;
            }
        } else if (f2714c > 1) {
            f2714c--;
        }
        if (f2714c <= 0 || !this.i) {
            b(a.e(this.f2715d));
        } else {
            a(false);
            a.a(this.f2715d, f2714c, 4);
        }
        return false;
    }

    public final void b(boolean z) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2712a, false, 23895, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2712a, false, 23895, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.p != null) {
            this.i = z;
            ImageView imageView = this.p;
            if (z) {
                i2 = 2130839883;
            } else {
                i2 = 2130839884;
            }
            imageView.setImageResource(i2);
        }
    }

    public c(Activity activity, @NonNull ViewStub viewStub) {
        this.f2715d = activity;
        this.o = viewStub;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00cc  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00f2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00f3  */
    @android.annotation.SuppressLint({"AnonymousInnerClass"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(int r20, java.lang.String r21) {
        /*
            r19 = this;
            r7 = r19
            r8 = r21
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r10 = 0
            r0[r10] = r1
            r11 = 1
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f2712a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 23891(0x5d53, float:3.3478E-41)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004b
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0[r10] = r1
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f2712a
            r3 = 0
            r4 = 23891(0x5d53, float:3.3478E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x004b:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 != 0) goto L_0x0052
            return
        L_0x0052:
            r7.j = r8
            android.app.Activity r0 = r7.f2715d
            int r0 = com.ss.android.ugc.aweme.audio.a.a(r0)
            n = r0
            android.app.Activity r0 = r7.f2715d
            int r0 = com.ss.android.ugc.aweme.audio.a.b(r0)
            if (r0 <= 0) goto L_0x0066
            f2714c = r0
        L_0x0066:
            com.ss.android.ugc.aweme.audio.g r0 = r7.h
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.audio.g.f34417a
            r15 = 0
            r16 = 23908(0x5d64, float:3.3502E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Integer.TYPE
            r13 = r0
            r17 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r1 == 0) goto L_0x0096
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.audio.g.f34417a
            r15 = 0
            r16 = 23908(0x5d64, float:3.3502E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Integer.TYPE
            r13 = r0
            r17 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
        L_0x0094:
            r8 = r0
            goto L_0x00a5
        L_0x0096:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r0.d()
            if (r0 != 0) goto L_0x00a2
            r8 = 0
            goto L_0x00a5
        L_0x00a2:
            int r0 = r0.videoSoundGuideModeOldUser
            goto L_0x0094
        L_0x00a5:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f2712a
            r3 = 0
            r4 = 23893(0x5d55, float:3.3481E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00f0
            java.lang.Object[] r0 = new java.lang.Object[r9]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f2712a
            r3 = 0
            r4 = 23893(0x5d55, float:3.3481E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
        L_0x00f0:
            if (r8 != 0) goto L_0x00f3
            return
        L_0x00f3:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f2712a
            r3 = 0
            r4 = 23896(0x5d58, float:3.3485E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0117
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f2712a
            r3 = 0
            r4 = 23896(0x5d58, float:3.3485E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x017d
        L_0x0117:
            android.widget.LinearLayout r0 = r7.f2716e
            if (r0 != 0) goto L_0x0148
            android.view.ViewStub r0 = r7.o
            int r0 = r0.getLayoutResource()
            if (r0 > 0) goto L_0x012b
            android.view.ViewStub r0 = r7.o
            r1 = 2131690841(0x7f0f0559, float:1.9010737E38)
            r0.setLayoutResource(r1)
        L_0x012b:
            android.view.ViewStub r0 = r7.o
            android.view.View r0 = r0.inflate()
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r7.f2716e = r0
            android.widget.LinearLayout r0 = r7.f2716e
            android.view.View r0 = r0.getChildAt(r10)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r7.p = r0
            android.app.Activity r0 = r7.f2715d
            boolean r0 = com.ss.android.ugc.aweme.audio.a.e(r0)
            r7.b(r0)
        L_0x0148:
            android.widget.LinearLayout r0 = r7.f2716e
            r1 = 1056964608(0x3f000000, float:0.5)
            com.bytedance.ies.dmt.ui.e.b.a(r0, r1)
            com.ss.android.ugc.aweme.audio.e r0 = new com.ss.android.ugc.aweme.audio.e
            r0.<init>(r7)
            r7.g = r0
            com.ss.android.ugc.aweme.audio.i r0 = r7.f2717f
            com.ss.android.ugc.aweme.audio.i$a r1 = r7.g
            r0.a(r1)
            com.ss.android.ugc.aweme.audio.b$a r0 = r7.l
            if (r0 != 0) goto L_0x0168
            com.ss.android.ugc.aweme.audio.c$2 r0 = new com.ss.android.ugc.aweme.audio.c$2
            r0.<init>()
            r7.l = r0
        L_0x0168:
            com.ss.android.ugc.aweme.audio.b r0 = com.ss.android.ugc.aweme.audio.b.a()
            android.app.Activity r1 = r7.f2715d
            com.ss.android.ugc.aweme.audio.b$a r2 = r7.l
            r0.a(r1, r2)
            android.widget.LinearLayout r0 = r7.f2716e
            com.ss.android.ugc.aweme.audio.f r1 = new com.ss.android.ugc.aweme.audio.f
            r1.<init>(r7)
            r0.setOnClickListener(r1)
        L_0x017d:
            com.ss.android.ugc.aweme.audio.g r0 = com.ss.android.ugc.aweme.audio.g.a()
            boolean r0 = r0.f34421e
            if (r0 == 0) goto L_0x018f
            android.app.Activity r0 = r7.f2715d
            boolean r0 = com.ss.android.ugc.aweme.audio.a.e(r0)
            r7.b(r0)
            return
        L_0x018f:
            android.app.Activity r0 = r7.f2715d
            boolean r0 = com.ss.android.ugc.aweme.audio.g.a(r0)
            com.ss.android.ugc.aweme.audio.g r1 = com.ss.android.ugc.aweme.audio.g.a()
            r1.f34421e = r11
            if (r8 != r11) goto L_0x01b1
            android.app.Activity r0 = r7.f2715d
            boolean r0 = com.ss.android.ugc.aweme.audio.a.c(r0)
            if (r0 != 0) goto L_0x01e5
            android.app.Activity r0 = r7.f2715d
            boolean r0 = com.ss.android.ugc.aweme.audio.a.d(r0)
            if (r0 != 0) goto L_0x01e5
            r7.a(r11)
            return
        L_0x01b1:
            if (r8 != r9) goto L_0x01e5
            com.ss.android.ugc.aweme.audio.g r1 = r7.h
            boolean r1 = r1.f34420d
            if (r1 == 0) goto L_0x01ba
            return
        L_0x01ba:
            android.app.Activity r1 = r7.f2715d
            boolean r1 = com.ss.android.ugc.aweme.audio.a.d(r1)
            if (r1 == 0) goto L_0x01c3
            return
        L_0x01c3:
            android.app.Activity r1 = r7.f2715d
            int r1 = com.ss.android.ugc.aweme.audio.a.b(r1)
            android.app.Activity r2 = r7.f2715d
            com.ss.android.ugc.aweme.audio.a.a(r2)
            r7.m = r11
            android.app.Activity r2 = r7.f2715d
            com.ss.android.ugc.aweme.audio.a.a((android.content.Context) r2, (boolean) r11)
            r7.b(r10)
            r7.q = r11
            com.ss.android.ugc.aweme.audio.g r2 = r7.h
            com.ss.android.ugc.aweme.audio.d r3 = new com.ss.android.ugc.aweme.audio.d
            r3.<init>(r7, r1, r0)
            r2.h = r3
            r7.i = r10
        L_0x01e5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.audio.c.a(int, java.lang.String):void");
    }
}
