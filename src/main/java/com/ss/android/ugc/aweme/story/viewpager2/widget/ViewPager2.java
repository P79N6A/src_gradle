package com.ss.android.ugc.aweme.story.viewpager2.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.Px;
import android.support.annotation.RequiresApi;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.LinearSmoothScroller;
import android.support.v7.widget.PagerSnapHelper;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.story.R$styleable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class ViewPager2 extends ViewGroup {
    public static ChangeQuickRedirect j;

    /* renamed from: a  reason: collision with root package name */
    private final Rect f74421a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    private final Rect f74422b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    private a f74423c = new a(3);

    /* renamed from: d  reason: collision with root package name */
    private RecyclerViewImpl f74424d;

    /* renamed from: e  reason: collision with root package name */
    private LinearLayoutManager f74425e;

    /* renamed from: f  reason: collision with root package name */
    private ScrollEventAdapter f74426f;
    private b g;
    private a h;
    int k;
    public boolean l = true;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Orientation {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ScrollState {
    }

    class LinearLayoutManagerImpl extends LinearLayoutManager {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74435a;

        LinearLayoutManagerImpl(Context context) {
            super(context);
        }

        public void onInitializeAccessibilityNodeInfo(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, @NonNull AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            AccessibilityNodeInfoCompat accessibilityNodeInfoCompat2 = accessibilityNodeInfoCompat;
            if (PatchProxy.isSupport(new Object[]{recycler, state, accessibilityNodeInfoCompat2}, this, f74435a, false, 86576, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class, AccessibilityNodeInfoCompat.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recycler, state, accessibilityNodeInfoCompat2}, this, f74435a, false, 86576, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class, AccessibilityNodeInfoCompat.class}, Void.TYPE);
                return;
            }
            super.onInitializeAccessibilityNodeInfo(recycler, state, accessibilityNodeInfoCompat);
            if (!ViewPager2.this.l) {
                accessibilityNodeInfoCompat2.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_BACKWARD);
                accessibilityNodeInfoCompat2.removeAction(AccessibilityNodeInfoCompat.AccessibilityActionCompat.ACTION_SCROLL_FORWARD);
                accessibilityNodeInfoCompat2.setScrollable(false);
            }
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
            if (PatchProxy.isSupport(new Object[]{recyclerView, state, Integer.valueOf(i)}, this, f74435a, false, 86577, new Class[]{RecyclerView.class, RecyclerView.State.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recyclerView, state, Integer.valueOf(i)}, this, f74435a, false, 86577, new Class[]{RecyclerView.class, RecyclerView.State.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            SmoothScroller smoothScroller = new SmoothScroller(recyclerView.getContext());
            smoothScroller.setTargetPosition(i);
            startSmoothScroll(smoothScroller);
        }

        public boolean performAccessibilityAction(@NonNull RecyclerView.Recycler recycler, @NonNull RecyclerView.State state, int i, @Nullable Bundle bundle) {
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{recycler, state, Integer.valueOf(i), bundle}, this, f74435a, false, 86575, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class, Integer.TYPE, Bundle.class}, Boolean.TYPE)) {
                Object[] objArr = {recycler, state, Integer.valueOf(i), bundle};
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, f74435a, false, 86575, new Class[]{RecyclerView.Recycler.class, RecyclerView.State.class, Integer.TYPE, Bundle.class}, Boolean.TYPE)).booleanValue();
            }
            if (i2 == 4096 || i2 == 8192) {
                if (!ViewPager2.this.l) {
                    return false;
                }
            }
            return super.performAccessibilityAction(recycler, state, i, bundle);
        }
    }

    class RecyclerViewImpl extends RecyclerView {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74437a;

        public CharSequence getAccessibilityClassName() {
            return "androidx.viewpager.widget.ViewPager";
        }

        /* access modifiers changed from: package-private */
        public final boolean a(MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f74437a, false, 86581, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f74437a, false, 86581, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (!ViewPager2.this.l || !super.onTouchEvent(motionEvent)) {
                return false;
            } else {
                return true;
            }
        }

        /* access modifiers changed from: package-private */
        public final boolean b(MotionEvent motionEvent) {
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f74437a, false, 86582, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f74437a, false, 86582, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (!ViewPager2.this.l || !super.onInterceptTouchEvent(motionEvent)) {
                return false;
            } else {
                return true;
            }
        }

        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            if (PatchProxy.isSupport(new Object[]{accessibilityEvent}, this, f74437a, false, 86578, new Class[]{AccessibilityEvent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{accessibilityEvent}, this, f74437a, false, 86578, new Class[]{AccessibilityEvent.class}, Void.TYPE);
                return;
            }
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.k);
            accessibilityEvent.setToIndex(ViewPager2.this.k);
        }

        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            MotionEvent motionEvent2 = motionEvent;
            if (!PatchProxy.isSupport(new Object[]{motionEvent2}, this, f74437a, false, 86580, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ViewPager2.this.onInterceptTouchEvent(motionEvent2);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f74437a, false, 86580, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }

        @SuppressLint({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            MotionEvent motionEvent2 = motionEvent;
            if (!PatchProxy.isSupport(new Object[]{motionEvent2}, this, f74437a, false, 86579, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                return ViewPager2.this.onTouchEvent(motionEvent2);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f74437a, false, 86579, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }

        RecyclerViewImpl(Context context) {
            super(context);
        }
    }

    static class SmoothScroller extends LinearSmoothScroller {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74439a;

        public SmoothScroller(Context context) {
            super(context);
        }

        public int calculateTimeForScrolling(int i) {
            if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f74439a, false, 86588, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                return super.calculateTimeForScrolling(i) * 3;
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f74439a, false, 86588, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
        }
    }

    public static abstract class a {
        public void a(int i) {
        }

        public void a(int i, float f2, @Px int i2) {
        }

        public void b(int i) {
        }
    }

    public interface b {
        void b(@NonNull View view, float f2);
    }

    static class c extends View.BaseSavedState {
        static final Parcelable.Creator<c> CREATOR = new Parcelable.ClassLoaderCreator<c>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f74446a;

            public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
                return new c[i];
            }

            public final /* synthetic */ Object createFromParcel(Parcel parcel) {
                Parcel parcel2 = parcel;
                if (!PatchProxy.isSupport(new Object[]{parcel2}, this, f74446a, false, 86586, new Class[]{Parcel.class}, c.class)) {
                    return createFromParcel(parcel2, null);
                }
                return (c) PatchProxy.accessDispatch(new Object[]{parcel2}, this, f74446a, false, 86586, new Class[]{Parcel.class}, c.class);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public c createFromParcel(Parcel parcel, ClassLoader classLoader) {
                Parcel parcel2 = parcel;
                ClassLoader classLoader2 = classLoader;
                if (PatchProxy.isSupport(new Object[]{parcel2, classLoader2}, this, f74446a, false, 86585, new Class[]{Parcel.class, ClassLoader.class}, c.class)) {
                    return (c) PatchProxy.accessDispatch(new Object[]{parcel2, classLoader2}, this, f74446a, false, 86585, new Class[]{Parcel.class, ClassLoader.class}, c.class);
                } else if (Build.VERSION.SDK_INT >= 24) {
                    return new c(parcel2, classLoader2);
                } else {
                    return new c(parcel2);
                }
            }
        };

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74440a;

        /* renamed from: b  reason: collision with root package name */
        int f74441b;

        /* renamed from: c  reason: collision with root package name */
        int f74442c;

        /* renamed from: d  reason: collision with root package name */
        int f74443d;

        /* renamed from: e  reason: collision with root package name */
        boolean f74444e;

        /* renamed from: f  reason: collision with root package name */
        boolean f74445f;
        Parcelable g;

        c(Parcelable parcelable) {
            super(parcelable);
        }

        c(Parcel parcel) {
            super(parcel);
            a(parcel, null);
        }

        @RequiresApi(24)
        c(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            boolean z;
            boolean z2 = false;
            if (PatchProxy.isSupport(new Object[]{parcel, classLoader}, this, f74440a, false, 86583, new Class[]{Parcel.class, ClassLoader.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel, classLoader}, this, f74440a, false, 86583, new Class[]{Parcel.class, ClassLoader.class}, Void.TYPE);
                return;
            }
            this.f74441b = parcel.readInt();
            this.f74442c = parcel.readInt();
            this.f74443d = parcel.readInt();
            if (parcel.readByte() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.f74444e = z;
            if (parcel.readByte() != 0) {
                z2 = true;
            }
            this.f74445f = z2;
            this.g = parcel.readParcelable(classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            if (PatchProxy.isSupport(new Object[]{parcel, Integer.valueOf(i)}, this, f74440a, false, 86584, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{parcel, Integer.valueOf(i)}, this, f74440a, false, 86584, new Class[]{Parcel.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f74441b);
            parcel.writeInt(this.f74442c);
            parcel.writeInt(this.f74443d);
            parcel.writeByte(this.f74444e ? (byte) 1 : 0);
            parcel.writeByte(this.f74445f ? (byte) 1 : 0);
            parcel.writeParcelable(this.g, i);
        }
    }

    static class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f74447a;

        /* renamed from: b  reason: collision with root package name */
        private final int f74448b;

        /* renamed from: c  reason: collision with root package name */
        private final RecyclerView f74449c;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f74447a, false, 86587, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f74447a, false, 86587, new Class[0], Void.TYPE);
                return;
            }
            this.f74449c.smoothScrollToPosition(this.f74448b);
        }

        d(int i, RecyclerView recyclerView) {
            this.f74448b = i;
            this.f74449c = recyclerView;
        }
    }

    public int getCurrentItem() {
        return this.k;
    }

    @NonNull
    public RecyclerView getRecyclerView() {
        return this.f74424d;
    }

    private RecyclerView.OnChildAttachStateChangeListener a() {
        if (!PatchProxy.isSupport(new Object[0], this, j, false, 86555, new Class[0], RecyclerView.OnChildAttachStateChangeListener.class)) {
            return new RecyclerView.OnChildAttachStateChangeListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f74428a;

                public void onChildViewDetachedFromWindow(@NonNull View view) {
                }

                public void onChildViewAttachedToWindow(@NonNull View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f74428a, false, 86573, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f74428a, false, 86573, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
                    if (layoutParams.width != -1 || layoutParams.height != -1) {
                        throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
                    }
                }
            };
        }
        return (RecyclerView.OnChildAttachStateChangeListener) PatchProxy.accessDispatch(new Object[0], this, j, false, 86555, new Class[0], RecyclerView.OnChildAttachStateChangeListener.class);
    }

    @Nullable
    public RecyclerView.Adapter getAdapter() {
        if (!PatchProxy.isSupport(new Object[0], this, j, false, 86561, new Class[0], RecyclerView.Adapter.class)) {
            return this.f74424d.getAdapter();
        }
        return (RecyclerView.Adapter) PatchProxy.accessDispatch(new Object[0], this, j, false, 86561, new Class[0], RecyclerView.Adapter.class);
    }

    public int getOrientation() {
        if (!PatchProxy.isSupport(new Object[0], this, j, false, 86566, new Class[0], Integer.TYPE)) {
            return this.f74425e.getOrientation();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, j, false, 86566, new Class[0], Integer.TYPE)).intValue();
    }

    @Nullable
    public Parcelable onSaveInstanceState() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, j, false, 86557, new Class[0], Parcelable.class)) {
            return (Parcelable) PatchProxy.accessDispatch(new Object[0], this, j, false, 86557, new Class[0], Parcelable.class);
        }
        c cVar = new c(super.onSaveInstanceState());
        cVar.f74441b = this.f74424d.getId();
        cVar.f74442c = getOrientation();
        cVar.f74443d = this.k;
        cVar.f74444e = this.l;
        if (this.f74425e.findFirstCompletelyVisibleItemPosition() != this.k) {
            z = true;
        }
        cVar.f74445f = z;
        RecyclerView.Adapter adapter = this.f74424d.getAdapter();
        if (adapter instanceof com.ss.android.ugc.aweme.story.viewpager2.adapter.a) {
            cVar.g = ((com.ss.android.ugc.aweme.story.viewpager2.adapter.a) adapter).a();
        }
        return cVar;
    }

    public void setUserInputEnabled(boolean z) {
        this.l = z;
    }

    public void setPageTransformer(@Nullable b bVar) {
        this.g.f74453b = bVar;
    }

    public ViewPager2(@NonNull Context context) {
        super(context);
        a(context, (AttributeSet) null);
    }

    public void setAdapter(@Nullable RecyclerView.Adapter adapter) {
        RecyclerView.Adapter adapter2 = adapter;
        if (PatchProxy.isSupport(new Object[]{adapter2}, this, j, false, 86560, new Class[]{RecyclerView.Adapter.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{adapter2}, this, j, false, 86560, new Class[]{RecyclerView.Adapter.class}, Void.TYPE);
            return;
        }
        this.f74424d.setAdapter(adapter2);
    }

    public final void a(@NonNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, j, false, 86569, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, j, false, 86569, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.f74423c.a(aVar2);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (!PatchProxy.isSupport(new Object[]{motionEvent2}, this, j, false, 86572, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return this.f74424d.b(motionEvent2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, j, false, 86572, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (PatchProxy.isSupport(new Object[]{parcelable}, this, j, false, 86558, new Class[]{Parcelable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcelable}, this, j, false, 86558, new Class[]{Parcelable.class}, Void.TYPE);
        } else if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
        } else {
            c cVar = (c) parcelable;
            super.onRestoreInstanceState(cVar.getSuperState());
            setOrientation(cVar.f74442c);
            this.k = cVar.f74443d;
            this.l = cVar.f74444e;
            if (cVar.f74445f) {
                final ScrollEventAdapter scrollEventAdapter = this.f74426f;
                final a aVar = this.h;
                scrollEventAdapter.f74414b = null;
                final RecyclerViewImpl recyclerViewImpl = this.f74424d;
                recyclerViewImpl.post(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f74430a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f74430a, false, 86574, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f74430a, false, 86574, new Class[0], Void.TYPE);
                            return;
                        }
                        scrollEventAdapter.f74414b = aVar;
                        scrollEventAdapter.a(ViewPager2.this.k);
                        recyclerViewImpl.scrollToPosition(ViewPager2.this.k);
                    }
                });
            } else {
                this.f74426f.a(this.k);
            }
            if (cVar.g != null) {
                this.f74424d.getAdapter();
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = motionEvent;
        if (!PatchProxy.isSupport(new Object[]{motionEvent2}, this, j, false, 86571, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return this.f74424d.a(motionEvent2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, j, false, 86571, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
    }

    public void onViewAdded(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, j, false, 86562, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, j, false, 86562, new Class[]{View.class}, Void.TYPE);
            return;
        }
        throw new IllegalStateException(getClass().getSimpleName() + " does not support direct child views");
    }

    public void setCurrentItem(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, j, false, 86567, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, j, false, 86567, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        a(i, true);
    }

    public void setOrientation(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, j, false, 86565, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, j, false, 86565, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f74425e.setOrientation(i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: android.app.Activity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void dispatchRestoreInstanceState(android.util.SparseArray<android.os.Parcelable> r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = j
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.util.SparseArray> r1 = android.util.SparseArray.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 86559(0x1521f, float:1.21295E-40)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = j
            r3 = 0
            r4 = 86559(0x1521f, float:1.21295E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.util.SparseArray> r1 = android.util.SparseArray.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            int r0 = r18.getId()
            java.lang.Object r0 = r8.get(r0)
            android.os.Parcelable r0 = (android.os.Parcelable) r0
            boolean r1 = r0 instanceof com.ss.android.ugc.aweme.story.viewpager2.widget.ViewPager2.c
            if (r1 == 0) goto L_0x005a
            com.ss.android.ugc.aweme.story.viewpager2.widget.ViewPager2$c r0 = (com.ss.android.ugc.aweme.story.viewpager2.widget.ViewPager2.c) r0
            int r0 = r0.f74441b
            com.ss.android.ugc.aweme.story.viewpager2.widget.ViewPager2$RecyclerViewImpl r1 = r7.f74424d
            int r1 = r1.getId()
            java.lang.Object r2 = r8.get(r0)
            r8.put(r1, r2)
            r8.remove(r0)
        L_0x005a:
            super.dispatchRestoreInstanceState(r19)     // Catch:{ Exception -> 0x005e }
            return
        L_0x005e:
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r7
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.base.utils.i.f71959a
            r14 = 1
            r15 = 82337(0x141a1, float:1.15379E-40)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r0[r10] = r1
            java.lang.Class<android.app.Activity> r17 = android.app.Activity.class
            r16 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            r1 = 0
            if (r0 == 0) goto L_0x0097
            java.lang.Object[] r11 = new java.lang.Object[r9]
            r11[r10] = r7
            r12 = 0
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.story.base.utils.i.f71959a
            r14 = 1
            r15 = 82337(0x141a1, float:1.15379E-40)
            java.lang.Class[] r0 = new java.lang.Class[r9]
            java.lang.Class<android.view.View> r1 = android.view.View.class
            r0[r10] = r1
            java.lang.Class<android.app.Activity> r17 = android.app.Activity.class
            r16 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            goto L_0x00b0
        L_0x0097:
            android.content.Context r0 = r18.getContext()
        L_0x009b:
            if (r0 == 0) goto L_0x00b0
            boolean r2 = r0 instanceof android.app.Activity
            if (r2 == 0) goto L_0x00a5
            r1 = r0
            android.app.Activity r1 = (android.app.Activity) r1
            goto L_0x00b0
        L_0x00a5:
            boolean r2 = r0 instanceof android.content.ContextWrapper
            if (r2 == 0) goto L_0x00b0
            android.content.ContextWrapper r0 = (android.content.ContextWrapper) r0
            android.content.Context r0 = r0.getBaseContext()
            goto L_0x009b
        L_0x00b0:
            if (r1 == 0) goto L_0x00b5
            r1.finish()
        L_0x00b5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.viewpager2.widget.ViewPager2.dispatchRestoreInstanceState(android.util.SparseArray):void");
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    private void b(Context context, AttributeSet attributeSet) {
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        if (PatchProxy.isSupport(new Object[]{context2, attributeSet2}, this, j, false, 86556, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, attributeSet2}, this, j, false, 86556, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, R$styleable.ViewPager2);
        try {
            try {
                setOrientation(obtainStyledAttributes.getInt(0, 0));
                obtainStyledAttributes.recycle();
            } catch (Throwable th) {
                th = th;
                obtainStyledAttributes.recycle();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (PatchProxy.isSupport(new Object[]{context, attributeSet}, this, j, false, 86554, new Class[]{Context.class, AttributeSet.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context, attributeSet}, this, j, false, 86554, new Class[]{Context.class, AttributeSet.class}, Void.TYPE);
            return;
        }
        this.f74424d = new RecyclerViewImpl(context);
        this.f74424d.setId(ViewCompat.generateViewId());
        this.f74425e = new LinearLayoutManagerImpl(context);
        this.f74424d.setLayoutManager(this.f74425e);
        b(context, attributeSet);
        this.f74424d.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f74424d.addOnChildAttachStateChangeListener(a());
        new PagerSnapHelper().attachToRecyclerView(this.f74424d);
        this.f74426f = new ScrollEventAdapter(this.f74425e);
        this.f74424d.addOnScrollListener(this.f74426f);
        this.h = new a(3);
        this.f74426f.f74414b = this.h;
        this.h.a((a) new a() {
            public final void a(int i) {
                ViewPager2.this.k = i;
            }
        });
        this.h.a((a) this.f74423c);
        this.g = new b(this.f74425e);
        this.h.a((a) this.g);
        attachViewToParent(this.f74424d, 0, this.f74424d.getLayoutParams());
    }

    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, j, false, 86563, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, j, false, 86563, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        measureChild(this.f74424d, i, i2);
        int measuredWidth = this.f74424d.getMeasuredWidth();
        int measuredHeight = this.f74424d.getMeasuredHeight();
        int measuredState = this.f74424d.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i, measuredState), resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i2, measuredState << 16));
    }

    public final void a(int i, boolean z) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, j, false, 86568, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, j, false, 86568, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        RecyclerView.Adapter adapter = getAdapter();
        if (adapter != null && adapter.getItemCount() > 0) {
            int min = Math.min(Math.max(i, 0), adapter.getItemCount() - 1);
            if (min == this.k && this.f74426f.a()) {
                return;
            }
            if (min != this.k || !z) {
                float f2 = (float) this.k;
                this.k = min;
                if (!this.f74426f.a()) {
                    f2 = this.f74426f.b();
                }
                this.f74426f.a(min, z);
                if (!z) {
                    this.f74424d.scrollToPosition(min);
                    return;
                }
                float f3 = (float) min;
                if (Math.abs(f3 - f2) > 3.0f) {
                    RecyclerViewImpl recyclerViewImpl = this.f74424d;
                    if (f3 > f2) {
                        i2 = min - 3;
                    } else {
                        i2 = min + 3;
                    }
                    recyclerViewImpl.scrollToPosition(i2);
                    this.f74424d.post(new d(min, this.f74424d));
                    return;
                }
                this.f74424d.smoothScrollToPosition(min);
            }
        }
    }

    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context, attributeSet);
    }

    @RequiresApi(21)
    public ViewPager2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        a(context, attributeSet);
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, j, false, 86564, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, this, j, false, 86564, new Class[]{Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        int measuredWidth = this.f74424d.getMeasuredWidth();
        int measuredHeight = this.f74424d.getMeasuredHeight();
        this.f74421a.left = getPaddingLeft();
        this.f74421a.right = (i3 - i) - getPaddingRight();
        this.f74421a.top = getPaddingTop();
        this.f74421a.bottom = (i4 - i2) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f74421a, this.f74422b);
        this.f74424d.layout(this.f74422b.left, this.f74422b.top, this.f74422b.right, this.f74422b.bottom);
    }
}
