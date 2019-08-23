package com.ss.android.ugc.aweme.story.viewpager2.widget;

import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.viewpager2.widget.ViewPager2;
import java.util.Locale;

public final class ScrollEventAdapter extends RecyclerView.OnScrollListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74412a;

    /* renamed from: c  reason: collision with root package name */
    private static final ViewGroup.MarginLayoutParams f74413c;

    /* renamed from: b  reason: collision with root package name */
    public ViewPager2.a f74414b;
    @NonNull

    /* renamed from: d  reason: collision with root package name */
    private final LinearLayoutManager f74415d;

    /* renamed from: e  reason: collision with root package name */
    private int f74416e;

    /* renamed from: f  reason: collision with root package name */
    private int f74417f;
    private a g = new a();
    private int h;
    private int i;
    private boolean j;
    private boolean k;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        int f74418a;

        /* renamed from: b  reason: collision with root package name */
        float f74419b;

        /* renamed from: c  reason: collision with root package name */
        int f74420c;

        a() {
        }

        /* access modifiers changed from: package-private */
        public final a a() {
            this.f74418a = -1;
            this.f74419b = 0.0f;
            this.f74420c = 0;
            return this;
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        if (this.f74416e == 0) {
            return true;
        }
        return false;
    }

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        f74413c = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f74412a, false, 86542, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74412a, false, 86542, new Class[0], Void.TYPE);
            return;
        }
        this.f74416e = 0;
        this.f74417f = 0;
        this.g.a();
        this.h = -1;
        this.i = -1;
        this.j = false;
        this.k = false;
    }

    private boolean e() {
        if (PatchProxy.isSupport(new Object[0], this, f74412a, false, 86548, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f74412a, false, 86548, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f74415d.getLayoutDirection() == 1) {
            return true;
        } else {
            return false;
        }
    }

    private int f() {
        if (!PatchProxy.isSupport(new Object[0], this, f74412a, false, 86553, new Class[0], Integer.TYPE)) {
            return this.f74415d.findFirstVisibleItemPosition();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f74412a, false, 86553, new Class[0], Integer.TYPE)).intValue();
    }

    /* access modifiers changed from: package-private */
    public final float b() {
        if (PatchProxy.isSupport(new Object[0], this, f74412a, false, 86549, new Class[0], Float.TYPE)) {
            return ((Float) PatchProxy.accessDispatch(new Object[0], this, f74412a, false, 86549, new Class[0], Float.TYPE)).floatValue();
        }
        d();
        return ((float) this.g.f74418a) + this.g.f74419b;
    }

    private a d() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        boolean z;
        int i2;
        int i3;
        float f2;
        if (PatchProxy.isSupport(new Object[0], this, f74412a, false, 86545, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f74412a, false, 86545, new Class[0], a.class);
        }
        a aVar = this.g;
        aVar.f74418a = this.f74415d.findFirstVisibleItemPosition();
        if (aVar.f74418a == -1) {
            return aVar.a();
        }
        View findViewByPosition = this.f74415d.findViewByPosition(aVar.f74418a);
        if (findViewByPosition == null) {
            return aVar.a();
        }
        if (findViewByPosition.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            marginLayoutParams = (ViewGroup.MarginLayoutParams) findViewByPosition.getLayoutParams();
        } else {
            marginLayoutParams = f74413c;
        }
        if (this.f74415d.getOrientation() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = findViewByPosition.getWidth();
            if (!e()) {
                i3 = findViewByPosition.getLeft() - marginLayoutParams.leftMargin;
            } else {
                i3 = (i2 - findViewByPosition.getRight()) + marginLayoutParams.rightMargin;
            }
        } else {
            i2 = findViewByPosition.getHeight();
            i3 = findViewByPosition.getTop() - marginLayoutParams.topMargin;
        }
        aVar.f74420c = -i3;
        if (aVar.f74420c >= 0) {
            if (i2 == 0) {
                f2 = 0.0f;
            } else {
                f2 = ((float) aVar.f74420c) / ((float) i2);
            }
            aVar.f74419b = f2;
            return aVar;
        }
        throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", new Object[]{Integer.valueOf(aVar.f74420c)}));
    }

    ScrollEventAdapter(@NonNull LinearLayoutManager linearLayoutManager) {
        this.f74415d = linearLayoutManager;
        c();
    }

    private void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74412a, false, 86550, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74412a, false, 86550, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if ((this.f74416e != 3 || this.f74417f != 0) && this.f74417f != i2) {
            this.f74417f = i2;
            if (this.f74414b != null) {
                this.f74414b.b(i2);
            }
        }
    }

    private void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74412a, false, 86551, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74412a, false, 86551, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f74414b != null) {
            this.f74414b.a(i2);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f74412a, false, 86547, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f74412a, false, 86547, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i2 != 0) {
            c(i2);
        }
    }

    public final void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i2) {
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i2)}, this, f74412a, false, 86543, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i2)}, this, f74412a, false, 86543, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
        } else if (this.f74416e != 1 && i2 == 1) {
            this.f74416e = 1;
            if (this.i != -1) {
                this.h = this.i;
                this.i = -1;
            } else {
                this.h = f();
            }
            b(1);
        } else if (this.f74416e != 1 || i2 != 2) {
            if (this.f74416e == 1 && i2 == 0) {
                if (this.f74417f == 1 && this.g.f74420c == 0) {
                    if (!this.k) {
                        a(f(), 0.0f, 0);
                    } else {
                        this.j = true;
                    }
                } else if (this.f74417f == 2 && !this.k) {
                    throw new IllegalStateException("RecyclerView sent SCROLL_STATE_SETTLING event without scrolling any further before going to SCROLL_STATE_IDLE");
                }
                if (this.j) {
                    d();
                    if (this.h != this.g.f74418a) {
                        c(this.g.f74418a);
                    }
                }
                if (!this.k || this.j) {
                    b(0);
                    c();
                }
            }
        } else if (!this.k) {
            a(f(), 0.0f, 0);
        } else {
            b(2);
            this.j = true;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, boolean z) {
        int i3;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f74412a, false, 86546, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z)}, this, f74412a, false, 86546, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            i3 = 2;
        } else {
            i3 = 3;
        }
        this.f74416e = i3;
        if (this.i != i2) {
            z2 = true;
        }
        this.i = i2;
        b(2);
        if (z2) {
            c(i2);
        }
    }

    private void a(int i2, float f2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3)}, this, f74412a, false, 86552, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Float.valueOf(f2), Integer.valueOf(i3)}, this, f74412a, false, 86552, new Class[]{Integer.TYPE, Float.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f74414b != null) {
            this.f74414b.a(i2, f2, i3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0076, code lost:
        if (r1 == e()) goto L_0x007b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onScrolled(@android.support.annotation.NonNull android.support.v7.widget.RecyclerView r13, int r14, int r15) {
        /*
            r12 = this;
            r7 = r12
            r8 = 3
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r9 = 0
            r0[r9] = r13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r10 = 1
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r11 = 2
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f74412a
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.support.v7.widget.RecyclerView> r1 = android.support.v7.widget.RecyclerView.class
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 86544(0x15210, float:1.21274E-40)
            r1 = r12
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x005d
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r0[r9] = r13
            java.lang.Integer r1 = java.lang.Integer.valueOf(r14)
            r0[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r15)
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f74412a
            r3 = 0
            r4 = 86544(0x15210, float:1.21274E-40)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class<android.support.v7.widget.RecyclerView> r1 = android.support.v7.widget.RecyclerView.class
            r5[r9] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r12
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x005d:
            r7.k = r10
            com.ss.android.ugc.aweme.story.viewpager2.widget.ScrollEventAdapter$a r0 = r12.d()
            boolean r1 = r7.j
            if (r1 == 0) goto L_0x0095
            r7.j = r9
            if (r15 > 0) goto L_0x007b
            if (r15 != 0) goto L_0x0079
            if (r14 >= 0) goto L_0x0071
            r1 = 1
            goto L_0x0072
        L_0x0071:
            r1 = 0
        L_0x0072:
            boolean r2 = r12.e()
            if (r1 != r2) goto L_0x0079
            goto L_0x007b
        L_0x0079:
            r1 = 0
            goto L_0x007c
        L_0x007b:
            r1 = 1
        L_0x007c:
            if (r1 == 0) goto L_0x0086
            int r1 = r0.f74420c
            if (r1 == 0) goto L_0x0086
            int r1 = r0.f74418a
            int r1 = r1 + r10
            goto L_0x0088
        L_0x0086:
            int r1 = r0.f74418a
        L_0x0088:
            r7.i = r1
            int r1 = r7.h
            int r2 = r7.i
            if (r1 == r2) goto L_0x0095
            int r1 = r7.i
            r12.c(r1)
        L_0x0095:
            int r1 = r0.f74418a
            float r2 = r0.f74419b
            int r3 = r0.f74420c
            r12.a(r1, r2, r3)
            int r1 = r0.f74418a
            int r2 = r7.i
            if (r1 == r2) goto L_0x00a9
            int r1 = r7.i
            r2 = -1
            if (r1 != r2) goto L_0x00b7
        L_0x00a9:
            int r0 = r0.f74420c
            if (r0 != 0) goto L_0x00b7
            int r0 = r7.f74417f
            if (r0 == r10) goto L_0x00b7
            r12.b(r9)
            r12.c()
        L_0x00b7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.viewpager2.widget.ScrollEventAdapter.onScrolled(android.support.v7.widget.RecyclerView, int, int):void");
    }
}
