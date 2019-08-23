package com.ss.android.ugc.aweme.story.comment.discretescrollview;

import android.content.Context;
import android.graphics.Point;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;
import com.ss.android.ugc.aweme.story.comment.discretescrollview.a;
import java.util.Locale;

public class DiscreteScrollLayoutManager extends RecyclerView.LayoutManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72148a;
    private int A;
    @NonNull
    private final b B;

    /* renamed from: b  reason: collision with root package name */
    protected Point f72149b = new Point();

    /* renamed from: c  reason: collision with root package name */
    protected Point f72150c = new Point();

    /* renamed from: d  reason: collision with root package name */
    protected Point f72151d = new Point();

    /* renamed from: e  reason: collision with root package name */
    protected int f72152e;

    /* renamed from: f  reason: collision with root package name */
    protected int f72153f;
    public int g;
    protected int h;
    protected int i;
    protected int j;
    protected int k;
    public int l = -1;
    protected int m = -1;
    protected SparseArray<View> n = new SparseArray<>();
    public a.C0753a o;
    protected boolean p;
    public int q = c.f69428f;
    int r;
    public int s = PushConstants.BROADCAST_MESSAGE_ARRIVE;
    public boolean t;
    public com.ss.android.ugc.aweme.story.comment.discretescrollview.transform.a u;
    public c v;
    private Context w;
    private int x;
    private boolean y;
    private int z;

    class DiscreteLinearSmoothScroller extends LinearSmoothScroller {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72154a;

        public int calculateTimeForScrolling(int i) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72154a, false, 82789, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                return (int) (Math.max(0.01f, ((float) Math.min(Math.abs(i), DiscreteScrollLayoutManager.this.h)) / ((float) DiscreteScrollLayoutManager.this.h)) * ((float) DiscreteScrollLayoutManager.this.q));
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72154a, false, 82789, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }

        @Nullable
        public PointF computeScrollVectorForPosition(int i) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72154a, false, 82790, new Class[]{Integer.TYPE}, PointF.class)) {
                return new PointF((float) DiscreteScrollLayoutManager.this.o.a(DiscreteScrollLayoutManager.this.k), (float) DiscreteScrollLayoutManager.this.o.b(DiscreteScrollLayoutManager.this.k));
            }
            return (PointF) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72154a, false, 82790, new Class[]{Integer.TYPE}, PointF.class);
        }

        public DiscreteLinearSmoothScroller(Context context) {
            super(context);
        }

        public int calculateDxToMakeVisible(View view, int i) {
            if (!PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f72154a, false, 82787, new Class[]{View.class, Integer.TYPE}, Integer.TYPE)) {
                return DiscreteScrollLayoutManager.this.o.a(-DiscreteScrollLayoutManager.this.k);
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f72154a, false, 82787, new Class[]{View.class, Integer.TYPE}, Integer.TYPE)).intValue();
        }

        public int calculateDyToMakeVisible(View view, int i) {
            if (!PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i)}, this, f72154a, false, 82788, new Class[]{View.class, Integer.TYPE}, Integer.TYPE)) {
                return DiscreteScrollLayoutManager.this.o.b(-DiscreteScrollLayoutManager.this.k);
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i)}, this, f72154a, false, 82788, new Class[]{View.class, Integer.TYPE}, Integer.TYPE)).intValue();
        }
    }

    public interface a {
    }

    public interface b {
        void a();

        void a(float f2);

        void a(boolean z);

        void b();

        void c();

        void d();
    }

    public boolean isAutoMeasureEnabled() {
        return true;
    }

    private void a(RecyclerView.Recycler recycler, b bVar, int i2) {
        RecyclerView.Recycler recycler2 = recycler;
        b bVar2 = bVar;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{recycler2, bVar2, Integer.valueOf(i2)}, this, f72148a, false, 82736, new Class[]{RecyclerView.Recycler.class, b.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recycler2, bVar2, Integer.valueOf(i2)}, this, f72148a, false, 82736, new Class[]{RecyclerView.Recycler.class, b.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        int applyTo = bVar2.applyTo(1);
        if (this.m == -1 || !bVar2.sameAs(this.m - this.l)) {
            z2 = true;
        }
        this.f72149b.set(this.f72151d.x, this.f72151d.y);
        int i3 = this.l;
        while (true) {
            i3 += applyTo;
            if (e(i3)) {
                if (i3 == this.m) {
                    z2 = true;
                }
                this.o.a(bVar2, this.h, this.f72149b);
                if (!a(this.f72149b, i2)) {
                    if (z2) {
                        break;
                    }
                } else {
                    a(recycler, i3, this.f72149b);
                }
            } else {
                break;
            }
        }
    }

    private void a(RecyclerView.Recycler recycler, int i2, Point point) {
        RecyclerView.Recycler recycler2 = recycler;
        int i3 = i2;
        Point point2 = point;
        if (PatchProxy.isSupport(new Object[]{recycler2, Integer.valueOf(i2), point2}, this, f72148a, false, 82737, new Class[]{RecyclerView.Recycler.class, Integer.TYPE, Point.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recycler2, Integer.valueOf(i2), point2}, this, f72148a, false, 82737, new Class[]{RecyclerView.Recycler.class, Integer.TYPE, Point.class}, Void.TYPE);
        } else if (i3 >= 0) {
            View view = this.n.get(i3);
            if (view == null) {
                View a2 = this.v.a(i3, recycler2);
                this.v.a(a2, point2.x - this.f72152e, point2.y - this.f72153f, this.f72152e + point2.x, this.f72153f + point2.y);
                return;
            }
            this.v.a(view);
            this.n.remove(i3);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f72148a, false, 82746, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72148a, false, 82746, new Class[0], Void.TYPE);
            return;
        }
        if (this.u != null) {
            int i2 = this.h * this.r;
            for (int i3 = 0; i3 < this.v.a(); i3++) {
                View a2 = this.v.a(i3);
                this.u.a(a2, a(a2, i2));
            }
        }
    }

    public final void a(int i2, int i3) {
        int i4;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72148a, false, 82754, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72148a, false, 82754, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int c2 = this.o.c(i2, i3);
        int applyTo = this.l + b.fromDelta(c2).applyTo(this.t ? Math.abs(c2 / this.s) : 1);
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(applyTo)}, this, f72148a, false, 82778, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            i4 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(applyTo)}, this, f72148a, false, 82778, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        } else {
            int b2 = this.v.b();
            if (this.l == 0 || applyTo >= 0) {
                int i5 = b2 - 1;
                i4 = (this.l == i5 || applyTo < b2) ? applyTo : i5;
            } else {
                i4 = 0;
            }
        }
        if ((c2 * this.j >= 0) && e(i4)) {
            z2 = true;
        }
        if (z2) {
            c(i4);
        } else {
            b();
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72148a, false, 82773, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72148a, false, 82773, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.x = i2;
        this.g = this.h * i2;
        this.v.e();
    }

    private boolean a(Point point, int i2) {
        if (PatchProxy.isSupport(new Object[]{point, Integer.valueOf(i2)}, this, f72148a, false, 82785, new Class[]{Point.class, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{point, Integer.valueOf(i2)}, this, f72148a, false, 82785, new Class[]{Point.class, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        return this.o.a(point, this.f72152e, this.f72153f, i2, this.g);
    }

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f72148a, false, 82757, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72148a, false, 82757, new Class[0], Void.TYPE);
            return;
        }
        DiscreteLinearSmoothScroller discreteLinearSmoothScroller = new DiscreteLinearSmoothScroller(this.w);
        discreteLinearSmoothScroller.setTargetPosition(this.l);
        this.v.a((RecyclerView.SmoothScroller) discreteLinearSmoothScroller);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f72148a, false, 82755, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72148a, false, 82755, new Class[0], Void.TYPE);
            return;
        }
        this.k = -this.j;
        if (this.k != 0) {
            g();
        }
    }

    public boolean canScrollHorizontally() {
        if (!PatchProxy.isSupport(new Object[0], this, f72148a, false, 82749, new Class[0], Boolean.TYPE)) {
            return this.o.b();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72148a, false, 82749, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public boolean canScrollVertically() {
        if (!PatchProxy.isSupport(new Object[0], this, f72148a, false, 82750, new Class[0], Boolean.TYPE)) {
            return this.o.a();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72148a, false, 82750, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final View d() {
        if (!PatchProxy.isSupport(new Object[0], this, f72148a, false, 82781, new Class[0], View.class)) {
            return this.v.a(0);
        }
        return (View) PatchProxy.accessDispatch(new Object[0], this, f72148a, false, 82781, new Class[0], View.class);
    }

    public final View e() {
        if (!PatchProxy.isSupport(new Object[0], this, f72148a, false, 82782, new Class[0], View.class)) {
            return this.v.a(this.v.a() - 1);
        }
        return (View) PatchProxy.accessDispatch(new Object[0], this, f72148a, false, 82782, new Class[0], View.class);
    }

    public RecyclerView.LayoutParams generateDefaultLayoutParams() {
        if (!PatchProxy.isSupport(new Object[0], this, f72148a, false, 82771, new Class[0], RecyclerView.LayoutParams.class)) {
            return new RecyclerView.LayoutParams(-2, -2);
        }
        return (RecyclerView.LayoutParams) PatchProxy.accessDispatch(new Object[0], this, f72148a, false, 82771, new Class[0], RecyclerView.LayoutParams.class);
    }

    public Parcelable onSaveInstanceState() {
        if (PatchProxy.isSupport(new Object[0], this, f72148a, false, 82769, new Class[0], Parcelable.class)) {
            return (Parcelable) PatchProxy.accessDispatch(new Object[0], this, f72148a, false, 82769, new Class[0], Parcelable.class);
        }
        Bundle bundle = new Bundle();
        if (this.m != -1) {
            this.l = this.m;
        }
        bundle.putInt("extra_position", this.l);
        return bundle;
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f72148a, false, 82738, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72148a, false, 82738, new Class[0], Void.TYPE);
            return;
        }
        this.n.clear();
        for (int i2 = 0; i2 < this.v.a(); i2++) {
            View a2 = this.v.a(i2);
            this.n.put(this.v.c(a2), a2);
        }
        for (int i3 = 0; i3 < this.n.size(); i3++) {
            this.v.b(this.n.valueAt(i3));
        }
    }

    private boolean h() {
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[0], this, f72148a, false, 82780, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72148a, false, 82780, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (((float) Math.abs(this.j)) >= ((float) this.h) * 0.6f) {
            z2 = true;
        }
        return z2;
    }

    private void i() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f72148a, false, 82783, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72148a, false, 82783, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != -1) {
            i2 = Math.abs(this.j + this.k);
        } else {
            i2 = this.h;
        }
        float f2 = (float) i2;
        this.B.a(-Math.min(Math.max(-1.0f, ((float) this.j) / f2), 1.0f));
    }

    public final int c() {
        if (PatchProxy.isSupport(new Object[0], this, f72148a, false, 82772, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f72148a, false, 82772, new Class[0], Integer.TYPE)).intValue();
        } else if (this.j == 0) {
            return this.l;
        } else {
            if (this.m != -1) {
                return this.m;
            }
            return this.l + b.fromDelta(this.j).applyTo(1);
        }
    }

    private void b(int i2) {
        if (this.l != i2) {
            this.l = i2;
            this.y = true;
        }
    }

    public int computeHorizontalScrollExtent(RecyclerView.State state) {
        if (!PatchProxy.isSupport(new Object[]{state}, this, f72148a, false, 82764, new Class[]{RecyclerView.State.class}, Integer.TYPE)) {
            return b(state);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{state}, this, f72148a, false, 82764, new Class[]{RecyclerView.State.class}, Integer.TYPE)).intValue();
    }

    public int computeHorizontalScrollOffset(RecyclerView.State state) {
        if (!PatchProxy.isSupport(new Object[]{state}, this, f72148a, false, 82763, new Class[]{RecyclerView.State.class}, Integer.TYPE)) {
            return a(state);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{state}, this, f72148a, false, 82763, new Class[]{RecyclerView.State.class}, Integer.TYPE)).intValue();
    }

    public int computeHorizontalScrollRange(RecyclerView.State state) {
        if (!PatchProxy.isSupport(new Object[]{state}, this, f72148a, false, 82762, new Class[]{RecyclerView.State.class}, Integer.TYPE)) {
            return c(state);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{state}, this, f72148a, false, 82762, new Class[]{RecyclerView.State.class}, Integer.TYPE)).intValue();
    }

    public int computeVerticalScrollExtent(RecyclerView.State state) {
        if (!PatchProxy.isSupport(new Object[]{state}, this, f72148a, false, 82761, new Class[]{RecyclerView.State.class}, Integer.TYPE)) {
            return b(state);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{state}, this, f72148a, false, 82761, new Class[]{RecyclerView.State.class}, Integer.TYPE)).intValue();
    }

    public int computeVerticalScrollOffset(RecyclerView.State state) {
        if (!PatchProxy.isSupport(new Object[]{state}, this, f72148a, false, 82760, new Class[]{RecyclerView.State.class}, Integer.TYPE)) {
            return a(state);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{state}, this, f72148a, false, 82760, new Class[]{RecyclerView.State.class}, Integer.TYPE)).intValue();
    }

    public int computeVerticalScrollRange(RecyclerView.State state) {
        if (!PatchProxy.isSupport(new Object[]{state}, this, f72148a, false, 82759, new Class[]{RecyclerView.State.class}, Integer.TYPE)) {
            return c(state);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{state}, this, f72148a, false, 82759, new Class[]{RecyclerView.State.class}, Integer.TYPE)).intValue();
    }

    private int b(RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{state}, this, f72148a, false, 82766, new Class[]{RecyclerView.State.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{state}, this, f72148a, false, 82766, new Class[]{RecyclerView.State.class}, Integer.TYPE)).intValue();
        } else if (getItemCount() == 0) {
            return 0;
        } else {
            return (int) (((float) c(state)) / ((float) getItemCount()));
        }
    }

    private int c(RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{state}, this, f72148a, false, 82767, new Class[]{RecyclerView.State.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{state}, this, f72148a, false, 82767, new Class[]{RecyclerView.State.class}, Integer.TYPE)).intValue();
        } else if (getItemCount() == 0) {
            return 0;
        } else {
            return this.h * (getItemCount() - 1);
        }
    }

    private int d(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72148a, false, 82779, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return b.fromDelta(i2).applyTo(this.h - Math.abs(this.j));
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72148a, false, 82779, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    private boolean e(int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72148a, false, 82784, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72148a, false, 82784, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (i3 >= 0) {
            if (i3 < this.v.b()) {
                return true;
            }
        }
        return false;
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (PatchProxy.isSupport(new Object[]{accessibilityEvent}, this, f72148a, false, 82776, new Class[]{AccessibilityEvent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{accessibilityEvent}, this, f72148a, false, 82776, new Class[]{AccessibilityEvent.class}, Void.TYPE);
            return;
        }
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (this.v.a() > 0) {
            AccessibilityRecordCompat asRecord = AccessibilityEventCompat.asRecord(accessibilityEvent);
            asRecord.setFromIndex(getPosition(d()));
            asRecord.setToIndex(getPosition(e()));
        }
    }

    public void onItemsChanged(RecyclerView recyclerView) {
        if (PatchProxy.isSupport(new Object[]{recyclerView}, this, f72148a, false, 82742, new Class[]{RecyclerView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView}, this, f72148a, false, 82742, new Class[]{RecyclerView.class}, Void.TYPE);
            return;
        }
        this.l = Math.min(Math.max(0, this.l), this.v.b() - 1);
        this.y = true;
    }

    public void onLayoutCompleted(RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{state}, this, f72148a, false, 82732, new Class[]{RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{state}, this, f72148a, false, 82732, new Class[]{RecyclerView.State.class}, Void.TYPE);
        } else if (this.p) {
            this.B.c();
            this.p = false;
        } else {
            if (this.y) {
                this.B.d();
                this.y = false;
            }
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.isSupport(new Object[]{parcelable}, this, f72148a, false, 82770, new Class[]{Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcelable}, this, f72148a, false, 82770, new Class[]{Parcelable.class}, Void.TYPE);
            return;
        }
        this.l = ((Bundle) parcelable).getInt("extra_position");
    }

    public void scrollToPosition(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72148a, false, 82747, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72148a, false, 82747, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.l != i2) {
            this.l = i2;
            this.v.e();
        }
    }

    private void b(RecyclerView.Recycler recycler) {
        if (PatchProxy.isSupport(new Object[]{recycler}, this, f72148a, false, 82739, new Class[]{RecyclerView.Recycler.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recycler}, this, f72148a, false, 82739, new Class[]{RecyclerView.Recycler.class}, Void.TYPE);
            return;
        }
        for (int i2 = 0; i2 < this.n.size(); i2++) {
            this.v.a(this.n.valueAt(i2), recycler);
        }
        this.n.clear();
    }

    private void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72148a, false, 82758, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72148a, false, 82758, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (this.l != i2) {
            this.k = -this.j;
            this.k += b.fromDelta(i2 - this.l).applyTo(Math.abs(i2 - this.l) * this.h);
            this.m = i2;
            g();
        }
    }

    private int a(RecyclerView.State state) {
        if (PatchProxy.isSupport(new Object[]{state}, this, f72148a, false, 82765, new Class[]{RecyclerView.State.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{state}, this, f72148a, false, 82765, new Class[]{RecyclerView.State.class}, Integer.TYPE)).intValue();
        }
        int b2 = b(state);
        return (this.l * b2) + ((int) ((((float) this.j) / ((float) this.h)) * ((float) b2)));
    }

    public void onScrollStateChanged(int i2) {
        boolean z2;
        boolean z3 = true;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f72148a, false, 82751, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f72148a, false, 82751, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.i == 0 && this.i != i2) {
            this.B.a();
        }
        if (i2 == 0) {
            if (PatchProxy.isSupport(new Object[0], this, f72148a, false, 82752, new Class[0], Boolean.TYPE)) {
                z3 = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f72148a, false, 82752, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                if (this.m != -1) {
                    this.l = this.m;
                    this.m = -1;
                    this.j = 0;
                }
                b fromDelta = b.fromDelta(this.j);
                if (Math.abs(this.j) == this.h) {
                    this.l += fromDelta.applyTo(1);
                    this.j = 0;
                }
                if (h()) {
                    this.k = d(this.j);
                } else {
                    this.k = -this.j;
                }
                if (this.k != 0) {
                    g();
                    z3 = false;
                }
            }
            if (z3) {
                this.B.b();
            } else {
                return;
            }
        } else if (i2 == 1) {
            if (PatchProxy.isSupport(new Object[0], this, f72148a, false, 82753, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72148a, false, 82753, new Class[0], Void.TYPE);
            } else {
                if (Math.abs(this.j) > this.h) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    int i3 = this.j / this.h;
                    this.l += i3;
                    this.j -= i3 * this.h;
                }
                if (h()) {
                    this.l += b.fromDelta(this.j).applyTo(1);
                    this.j = -d(this.j);
                }
                this.m = -1;
                this.k = 0;
            }
        }
        this.i = i2;
    }

    private int a(b bVar) {
        boolean z2;
        int i2;
        boolean z3 = true;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f72148a, false, 82756, new Class[]{b.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{bVar}, this, f72148a, false, 82756, new Class[]{b.class}, Integer.TYPE)).intValue();
        } else if (this.k != 0) {
            return Math.abs(this.k);
        } else {
            if (bVar.applyTo(this.j) > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (bVar == b.START && this.l == 0) {
                if (this.j != 0) {
                    z3 = false;
                }
                if (!z3) {
                    i3 = Math.abs(this.j);
                }
            } else if (bVar == b.END && this.l == this.v.b() - 1) {
                if (this.j != 0) {
                    z3 = false;
                }
                if (!z3) {
                    i3 = Math.abs(this.j);
                }
            } else {
                if (z2) {
                    i2 = this.h - Math.abs(this.j);
                } else {
                    i2 = this.h + Math.abs(this.j);
                }
                i3 = i2;
                z3 = false;
            }
            this.B.a(z3);
            return i3;
        }
    }

    private void a(RecyclerView.Recycler recycler) {
        if (PatchProxy.isSupport(new Object[]{recycler}, this, f72148a, false, 82735, new Class[]{RecyclerView.Recycler.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recycler}, this, f72148a, false, 82735, new Class[]{RecyclerView.Recycler.class}, Void.TYPE);
            return;
        }
        f();
        this.o.a(this.f72150c, this.j, this.f72151d);
        int a2 = this.o.a(this.v.c(), this.v.d());
        if (a(this.f72151d, a2)) {
            a(recycler, this.l, this.f72151d);
        }
        a(recycler, b.START, a2);
        a(recycler, b.END, a2);
        b(recycler);
    }

    private float a(View view, int i2) {
        if (!PatchProxy.isSupport(new Object[]{view, Integer.valueOf(i2)}, this, f72148a, false, 82777, new Class[]{View.class, Integer.TYPE}, Float.TYPE)) {
            return Math.min(Math.max(-1.0f, this.o.a(this.f72150c, getDecoratedLeft(view) + this.f72152e, getDecoratedTop(view) + this.f72153f) / ((float) i2)), 1.0f);
        }
        return ((Float) PatchProxy.accessDispatch(new Object[]{view, Integer.valueOf(i2)}, this, f72148a, false, 82777, new Class[]{View.class, Integer.TYPE}, Float.TYPE)).floatValue();
    }

    public void onAdapterChanged(RecyclerView.Adapter adapter, RecyclerView.Adapter adapter2) {
        if (PatchProxy.isSupport(new Object[]{adapter, adapter2}, this, f72148a, false, 82768, new Class[]{RecyclerView.Adapter.class, RecyclerView.Adapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adapter, adapter2}, this, f72148a, false, 82768, new Class[]{RecyclerView.Adapter.class, RecyclerView.Adapter.class}, Void.TYPE);
            return;
        }
        this.m = -1;
        this.k = 0;
        this.j = 0;
        boolean z2 = adapter2 instanceof a;
        this.l = 0;
        this.v.f();
    }

    private int a(int i2, RecyclerView.Recycler recycler) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), recycler}, this, f72148a, false, 82745, new Class[]{Integer.TYPE, RecyclerView.Recycler.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), recycler}, this, f72148a, false, 82745, new Class[]{Integer.TYPE, RecyclerView.Recycler.class}, Integer.TYPE)).intValue();
        } else if (this.v.a() == 0) {
            return 0;
        } else {
            b fromDelta = b.fromDelta(i2);
            int a2 = a(fromDelta);
            if (a2 <= 0) {
                return 0;
            }
            int applyTo = fromDelta.applyTo(Math.min(a2, Math.abs(i2)));
            this.j += applyTo;
            if (this.k != 0) {
                this.k -= applyTo;
            }
            this.o.a(-applyTo, this.v);
            if (this.o.a(this)) {
                a(recycler);
            }
            i();
            a();
            return applyTo;
        }
    }

    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        boolean z2;
        int i2;
        int i3;
        boolean z3;
        RecyclerView.Recycler recycler2 = recycler;
        if (PatchProxy.isSupport(new Object[]{recycler2, state}, this, f72148a, false, 82730, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recycler2, state}, this, f72148a, false, 82730, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class}, Void.TYPE);
        } else if (state.getItemCount() == 0) {
            c cVar = this.v;
            if (PatchProxy.isSupport(new Object[]{recycler2}, cVar, c.f72168a, false, 82823, new Class[]{RecyclerView.Recycler.class}, Void.TYPE)) {
                c cVar2 = cVar;
                PatchProxy.accessDispatch(new Object[]{recycler2}, cVar2, c.f72168a, false, 82823, new Class[]{RecyclerView.Recycler.class}, Void.TYPE);
            } else {
                cVar.f72169b.removeAndRecycleAllViews(recycler2);
            }
            this.m = -1;
            this.l = -1;
            this.k = 0;
            this.j = 0;
        } else {
            if (PatchProxy.isSupport(new Object[]{state}, this, f72148a, false, 82731, new Class[]{RecyclerView.State.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{state}, this, f72148a, false, 82731, new Class[]{RecyclerView.State.class}, Void.TYPE);
            } else if (this.l == -1 || this.l >= state.getItemCount()) {
                this.l = 0;
            }
            if (PatchProxy.isSupport(new Object[]{state}, this, f72148a, false, 82734, new Class[]{RecyclerView.State.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{state}, this, f72148a, false, 82734, new Class[]{RecyclerView.State.class}, Void.TYPE);
            } else {
                if (state.isMeasuring() || (this.v.c() == this.z && this.v.d() == this.A)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (z3) {
                    this.z = this.v.c();
                    this.A = this.v.d();
                    this.v.f();
                }
                this.f72150c.set(this.v.c() / 2, this.v.d() / 2);
            }
            if (!this.p) {
                if (this.v.a() == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.p = z2;
                if (this.p) {
                    if (PatchProxy.isSupport(new Object[]{recycler2}, this, f72148a, false, 82733, new Class[]{RecyclerView.Recycler.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{recycler2}, this, f72148a, false, 82733, new Class[]{RecyclerView.Recycler.class}, Void.TYPE);
                    } else {
                        View a2 = this.v.a(0, recycler2);
                        c cVar3 = this.v;
                        if (PatchProxy.isSupport(new Object[]{a2}, cVar3, c.f72168a, false, 82830, new Class[]{View.class}, Integer.TYPE)) {
                            c cVar4 = cVar3;
                            i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{a2}, cVar4, c.f72168a, false, 82830, new Class[]{View.class}, Integer.TYPE)).intValue();
                        } else {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a2.getLayoutParams();
                            i2 = cVar3.f72169b.getDecoratedMeasuredWidth(a2) + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                        }
                        c cVar5 = this.v;
                        if (PatchProxy.isSupport(new Object[]{a2}, cVar5, c.f72168a, false, 82831, new Class[]{View.class}, Integer.TYPE)) {
                            c cVar6 = cVar5;
                            i3 = ((Integer) PatchProxy.accessDispatch(new Object[]{a2}, cVar6, c.f72168a, false, 82831, new Class[]{View.class}, Integer.TYPE)).intValue();
                        } else {
                            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) a2.getLayoutParams();
                            i3 = cVar5.f72169b.getDecoratedMeasuredHeight(a2) + marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                        }
                        this.f72152e = i2 / 2;
                        this.f72153f = i3 / 2;
                        this.h = this.o.b(i2, i3);
                        this.g = this.h * this.x;
                        c cVar7 = this.v;
                        if (PatchProxy.isSupport(new Object[]{a2, recycler2}, cVar7, c.f72168a, false, 82820, new Class[]{View.class, RecyclerView.Recycler.class}, Void.TYPE)) {
                            c cVar8 = cVar7;
                            PatchProxy.accessDispatch(new Object[]{a2, recycler2}, cVar8, c.f72168a, false, 82820, new Class[]{View.class, RecyclerView.Recycler.class}, Void.TYPE);
                        } else {
                            cVar7.f72169b.detachAndScrapView(a2, recycler2);
                        }
                    }
                }
            }
            c cVar9 = this.v;
            if (PatchProxy.isSupport(new Object[]{recycler2}, cVar9, c.f72168a, false, 82821, new Class[]{RecyclerView.Recycler.class}, Void.TYPE)) {
                c cVar10 = cVar9;
                PatchProxy.accessDispatch(new Object[]{recycler2}, cVar10, c.f72168a, false, 82821, new Class[]{RecyclerView.Recycler.class}, Void.TYPE);
            } else {
                cVar9.f72169b.detachAndScrapAttachedViews(recycler2);
            }
            a(recycler);
            a();
        }
    }

    public DiscreteScrollLayoutManager(@NonNull Context context, @NonNull b bVar, @NonNull a aVar) {
        this.w = context;
        this.B = bVar;
        this.o = aVar.createHelper();
        this.v = new c(this);
        this.r = 1;
    }

    public void onItemsAdded(RecyclerView recyclerView, int i2, int i3) {
        int i4 = 0;
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72148a, false, 82740, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72148a, false, 82740, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int i5 = this.l;
        if (this.l != -1) {
            if (this.l >= i2) {
                i4 = Math.min(this.l + i3, this.v.b() - 1);
            } else {
                i4 = i5;
            }
        }
        b(i4);
    }

    public int scrollHorizontallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), recycler, state}, this, f72148a, false, 82743, new Class[]{Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, Integer.TYPE)) {
            return a(i2, recycler);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), recycler, state}, this, f72148a, false, 82743, new Class[]{Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, Integer.TYPE)).intValue();
    }

    public int scrollVerticallyBy(int i2, RecyclerView.Recycler recycler, RecyclerView.State state) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), recycler, state}, this, f72148a, false, 82744, new Class[]{Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, Integer.TYPE)) {
            return a(i2, recycler);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), recycler, state}, this, f72148a, false, 82744, new Class[]{Integer.TYPE, RecyclerView.Recycler.class, RecyclerView.State.class}, Integer.TYPE)).intValue();
    }

    public void onItemsRemoved(RecyclerView recyclerView, int i2, int i3) {
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72148a, false, 82741, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72148a, false, 82741, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int i5 = this.l;
        if (this.v.b() == 0) {
            i5 = -1;
        } else if (this.l >= i4) {
            if (this.l < i4 + i3) {
                this.l = -1;
            }
            i5 = Math.max(0, this.l - i3);
        }
        b(i5);
    }

    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i2) {
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{recyclerView, state, Integer.valueOf(i2)}, this, f72148a, false, 82748, new Class[]{RecyclerView.class, RecyclerView.State.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{recyclerView, state, Integer.valueOf(i2)}, this, f72148a, false, 82748, new Class[]{RecyclerView.class, RecyclerView.State.class, Integer.TYPE}, Void.TYPE);
        } else if (this.l != i3 && this.m == -1) {
            if (PatchProxy.isSupport(new Object[]{state, Integer.valueOf(i2)}, this, f72148a, false, 82786, new Class[]{RecyclerView.State.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{state, Integer.valueOf(i2)}, this, f72148a, false, 82786, new Class[]{RecyclerView.State.class, Integer.TYPE}, Void.TYPE);
            } else if (i3 < 0 || i3 >= state.getItemCount()) {
                throw new IllegalArgumentException(String.format(Locale.US, "target position out of bounds: position=%d, itemCount=%d", new Object[]{Integer.valueOf(i2), Integer.valueOf(state.getItemCount())}));
            }
            if (this.l == -1) {
                this.l = i3;
            } else {
                c(i3);
            }
        }
    }
}
