package com.ss.android.ugc.aweme.story.comment.discretescrollview;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.IntRange;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.R$styleable;
import com.ss.android.ugc.aweme.story.comment.discretescrollview.DiscreteScrollLayoutManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class DiscreteScrollView extends RecyclerView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72156a;

    /* renamed from: f  reason: collision with root package name */
    private static final int f72157f = a.HORIZONTAL.ordinal();

    /* renamed from: b  reason: collision with root package name */
    public DiscreteScrollLayoutManager f72158b;

    /* renamed from: c  reason: collision with root package name */
    public List<b> f72159c;

    /* renamed from: d  reason: collision with root package name */
    public List<a> f72160d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f72161e;

    public interface a<T extends RecyclerView.ViewHolder> {
        void a(@Nullable T t, int i);
    }

    public interface b<T extends RecyclerView.ViewHolder> {
        void b();
    }

    class c implements DiscreteScrollLayoutManager.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72162a;

        public final void c() {
            if (PatchProxy.isSupport(new Object[0], this, f72162a, false, 82815, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72162a, false, 82815, new Class[0], Void.TYPE);
                return;
            }
            DiscreteScrollView.this.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f72164a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f72164a, false, 82817, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f72164a, false, 82817, new Class[0], Void.TYPE);
                        return;
                    }
                    DiscreteScrollView.this.b();
                }
            });
        }

        public final void d() {
            if (PatchProxy.isSupport(new Object[0], this, f72162a, false, 82816, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72162a, false, 82816, new Class[0], Void.TYPE);
                return;
            }
            DiscreteScrollView.this.b();
        }

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f72162a, false, 82812, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72162a, false, 82812, new Class[0], Void.TYPE);
            } else if (!DiscreteScrollView.this.f72159c.isEmpty()) {
                int i = DiscreteScrollView.this.f72158b.l;
                RecyclerView.ViewHolder a2 = DiscreteScrollView.this.a(i);
                if (a2 != null) {
                    DiscreteScrollView discreteScrollView = DiscreteScrollView.this;
                    if (PatchProxy.isSupport(new Object[]{a2, Integer.valueOf(i)}, discreteScrollView, DiscreteScrollView.f72156a, false, 82805, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                        DiscreteScrollView discreteScrollView2 = discreteScrollView;
                        PatchProxy.accessDispatch(new Object[]{a2, Integer.valueOf(i)}, discreteScrollView2, DiscreteScrollView.f72156a, false, 82805, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    Iterator<b> it2 = discreteScrollView.f72159c.iterator();
                    while (it2.hasNext()) {
                        it2.next();
                    }
                }
            }
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f72162a, false, 82813, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f72162a, false, 82813, new Class[0], Void.TYPE);
            } else if (!DiscreteScrollView.this.f72160d.isEmpty() || !DiscreteScrollView.this.f72159c.isEmpty()) {
                int i = DiscreteScrollView.this.f72158b.l;
                RecyclerView.ViewHolder a2 = DiscreteScrollView.this.a(i);
                if (a2 != null) {
                    DiscreteScrollView discreteScrollView = DiscreteScrollView.this;
                    if (PatchProxy.isSupport(new Object[]{a2, Integer.valueOf(i)}, discreteScrollView, DiscreteScrollView.f72156a, false, 82807, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
                        DiscreteScrollView discreteScrollView2 = discreteScrollView;
                        PatchProxy.accessDispatch(new Object[]{a2, Integer.valueOf(i)}, discreteScrollView2, DiscreteScrollView.f72156a, false, 82807, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
                    } else {
                        Iterator<b> it2 = discreteScrollView.f72159c.iterator();
                        while (it2.hasNext()) {
                            it2.next();
                        }
                    }
                    DiscreteScrollView.this.a(a2, i);
                }
            }
        }

        private c() {
        }

        public final void a(float f2) {
            if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f72162a, false, 82814, new Class[]{Float.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f72162a, false, 82814, new Class[]{Float.TYPE}, Void.TYPE);
            } else if (!DiscreteScrollView.this.f72159c.isEmpty()) {
                int currentItem = DiscreteScrollView.this.getCurrentItem();
                int c2 = DiscreteScrollView.this.f72158b.c();
                if (currentItem != c2) {
                    DiscreteScrollView.this.a(f2, currentItem, c2, DiscreteScrollView.this.a(currentItem), DiscreteScrollView.this.a(c2));
                }
            }
        }

        public final void a(boolean z) {
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72162a, false, 82811, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72162a, false, 82811, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (DiscreteScrollView.this.f72161e) {
                DiscreteScrollView discreteScrollView = DiscreteScrollView.this;
                if (!z) {
                    i = 2;
                }
                discreteScrollView.setOverScrollMode(i);
            }
            if (z) {
                DiscreteScrollView.this.a();
            }
        }

        /* synthetic */ c(DiscreteScrollView discreteScrollView, byte b2) {
            this();
        }
    }

    public boolean isNestedScrollingEnabled() {
        return false;
    }

    public int getCurrentItem() {
        return this.f72158b.l;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f72156a, false, 82806, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72156a, false, 82806, new Class[0], Void.TYPE);
            return;
        }
        for (b b2 : this.f72159c) {
            b2.b();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f72156a, false, 82810, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72156a, false, 82810, new Class[0], Void.TYPE);
        } else if (!this.f72160d.isEmpty()) {
            int i = this.f72158b.l;
            a(a(i), i);
        }
    }

    public DiscreteScrollView(Context context) {
        super(context);
        a((AttributeSet) null);
    }

    public void setItemTransformer(com.ss.android.ugc.aweme.story.comment.discretescrollview.transform.a aVar) {
        this.f72158b.u = aVar;
    }

    public void setItemTransitionTimeMillis(@IntRange(from = 10) int i) {
        this.f72158b.q = i;
    }

    public void setSlideOnFling(boolean z) {
        this.f72158b.t = z;
    }

    public void setSlideOnFlingThreshold(int i) {
        this.f72158b.s = i;
    }

    private void a(AttributeSet attributeSet) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{attributeSet}, this, f72156a, false, 82791, new Class[]{AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{attributeSet}, this, f72156a, false, 82791, new Class[]{AttributeSet.class}, Void.TYPE);
            return;
        }
        this.f72159c = new ArrayList();
        this.f72160d = new ArrayList();
        int i = f72157f;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.DiscreteScrollView);
            int i2 = obtainStyledAttributes.getInt(0, f72157f);
            obtainStyledAttributes.recycle();
            i = i2;
        }
        if (getOverScrollMode() == 2) {
            z = false;
        }
        this.f72161e = z;
        this.f72158b = new DiscreteScrollLayoutManager(getContext(), new c(this, (byte) 0), a.values()[i]);
        setLayoutManager(this.f72158b);
    }

    public void setLayoutManager(RecyclerView.LayoutManager layoutManager) {
        RecyclerView.LayoutManager layoutManager2 = layoutManager;
        if (PatchProxy.isSupport(new Object[]{layoutManager2}, this, f72156a, false, 82792, new Class[]{RecyclerView.LayoutManager.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{layoutManager2}, this, f72156a, false, 82792, new Class[]{RecyclerView.LayoutManager.class}, Void.TYPE);
        } else if (layoutManager2 instanceof DiscreteScrollLayoutManager) {
            super.setLayoutManager(layoutManager);
        } else {
            throw new IllegalArgumentException("添加layoutManager失败");
        }
    }

    public void setOffscreenItems(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72156a, false, 82796, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72156a, false, 82796, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f72158b.a(i);
    }

    public void setOrientation(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f72156a, false, 82795, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f72156a, false, 82795, new Class[]{a.class}, Void.TYPE);
            return;
        }
        DiscreteScrollLayoutManager discreteScrollLayoutManager = this.f72158b;
        if (PatchProxy.isSupport(new Object[]{aVar}, discreteScrollLayoutManager, DiscreteScrollLayoutManager.f72148a, false, 82775, new Class[]{a.class}, Void.TYPE)) {
            DiscreteScrollLayoutManager discreteScrollLayoutManager2 = discreteScrollLayoutManager;
            PatchProxy.accessDispatch(new Object[]{aVar}, discreteScrollLayoutManager2, DiscreteScrollLayoutManager.f72148a, false, 82775, new Class[]{a.class}, Void.TYPE);
            return;
        }
        discreteScrollLayoutManager.o = aVar.createHelper();
        discreteScrollLayoutManager.v.f();
        discreteScrollLayoutManager.v.e();
    }

    public void setOverScrollEnabled(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72156a, false, 82798, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72156a, false, 82798, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f72161e = z;
        setOverScrollMode(2);
    }

    @Nullable
    public final RecyclerView.ViewHolder a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72156a, false, 82794, new Class[]{Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72156a, false, 82794, new Class[]{Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        View findViewByPosition = this.f72158b.findViewByPosition(i);
        if (findViewByPosition != null) {
            return getChildViewHolder(findViewByPosition);
        }
        return null;
    }

    public void setClampTransformProgressAfter(@IntRange(from = 1) int i) {
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72156a, false, 82797, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72156a, false, 82797, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (i2 > 1) {
            DiscreteScrollLayoutManager discreteScrollLayoutManager = this.f72158b;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, discreteScrollLayoutManager, DiscreteScrollLayoutManager.f72148a, false, 82774, new Class[]{Integer.TYPE}, Void.TYPE)) {
                DiscreteScrollLayoutManager discreteScrollLayoutManager2 = discreteScrollLayoutManager;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, discreteScrollLayoutManager2, DiscreteScrollLayoutManager.f72148a, false, 82774, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            discreteScrollLayoutManager.r = i2;
            discreteScrollLayoutManager.a();
        } else {
            throw new IllegalArgumentException("must be >= 1");
        }
    }

    public DiscreteScrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(attributeSet);
    }

    public boolean fling(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f72156a, false, 82793, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f72156a, false, 82793, new Class[]{Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        boolean fling = super.fling(i, i2);
        if (fling) {
            this.f72158b.a(i, i2);
        } else {
            this.f72158b.b();
        }
        return fling;
    }

    public final void a(RecyclerView.ViewHolder viewHolder, int i) {
        RecyclerView.ViewHolder viewHolder2 = viewHolder;
        if (PatchProxy.isSupport(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f72156a, false, 82809, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder2, Integer.valueOf(i)}, this, f72156a, false, 82809, new Class[]{RecyclerView.ViewHolder.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        for (a a2 : this.f72160d) {
            a2.a(viewHolder2, i);
        }
    }

    public DiscreteScrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(attributeSet);
    }

    public final void a(float f2, int i, int i2, RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2), viewHolder, viewHolder2}, this, f72156a, false, 82808, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE, RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2), Integer.valueOf(i), Integer.valueOf(i2), viewHolder, viewHolder2}, this, f72156a, false, 82808, new Class[]{Float.TYPE, Integer.TYPE, Integer.TYPE, RecyclerView.ViewHolder.class, RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        Iterator<b> it2 = this.f72159c.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }
}
