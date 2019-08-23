package com.ss.android.ugc.aweme.story.base.view.viewpager;

import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.uikit.viewpager.SSViewPager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.story.feed.c.g;
import com.ss.android.ugc.aweme.story.feed.view.adapter.StoryMainPagerAdapter;
import com.ss.android.ugc.aweme.story.feed.view.adapter.c;
import com.ss.android.ugc.aweme.story.feed.viewmodel.ChangeUserModeViewModel;
import java.util.ArrayList;
import java.util.Iterator;

public class ParentViewPager extends SSViewPager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72058a = null;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f72059b = true;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f72060c = true;

    /* renamed from: d  reason: collision with root package name */
    public boolean f72061d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f72062e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f72063f;
    public Handler g;
    public Runnable h;
    public ArrayList<a> i;
    public ViewPager.OnPageChangeListener j;
    private float k;
    private float l;
    private long m;
    private long n;
    private GestureDetector o;

    public interface a {
        void a();

        void a(boolean z);

        void b();

        void b(boolean z);

        void c();

        void c(boolean z);
    }

    private c getCurViewHolder() {
        if (PatchProxy.isSupport(new Object[0], this, f72058a, false, 82572, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, f72058a, false, 82572, new Class[0], c.class);
        }
        int currentItem = getCurrentItem();
        if (getChildAt(currentItem) != null) {
            return (c) getChildAt(currentItem).getTag();
        }
        return null;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f72058a, false, 82564, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72058a, false, 82564, new Class[0], Void.TYPE);
            return;
        }
        postDelayed(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72078a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f72078a, false, 82586, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f72078a, false, 82586, new Class[0], Void.TYPE);
                    return;
                }
                ParentViewPager.this.j.onPageSelected(ParentViewPager.this.getCurrentItem());
            }
        }, 10);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f72058a, false, 82576, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72058a, false, 82576, new Class[0], Void.TYPE);
            return;
        }
        if (this.i != null) {
            Iterator<a> it2 = this.i.iterator();
            while (it2.hasNext()) {
                it2.next().b();
            }
        }
    }

    public ParentViewPager(Context context) {
        this(context, null);
    }

    private void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72058a, false, 82574, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72058a, false, 82574, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f72061d = false;
        if (this.i != null) {
            Iterator<a> it2 = this.i.iterator();
            while (it2.hasNext()) {
                it2.next().b(z);
            }
        }
    }

    private void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f72058a, false, 82578, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f72058a, false, 82578, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.i != null) {
            Iterator<a> it2 = this.i.iterator();
            while (it2.hasNext()) {
                it2.next().c(z);
            }
        }
    }

    private boolean a(float f2) {
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f72058a, false, 82566, new Class[]{Float.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f72058a, false, 82566, new Class[]{Float.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (f2 >= ((float) (UIUtils.getScreenWidth(getContext()) / 3))) {
            return true;
        } else {
            return false;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        String str;
        MotionEvent motionEvent2 = motionEvent;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f72058a, false, 82565, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f72058a, false, 82565, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (this.f72062e || !this.o.onTouchEvent(motionEvent2)) {
            switch (motionEvent.getAction()) {
                case 0:
                    if (!this.f72063f) {
                        this.l = motionEvent.getY();
                        this.k = motionEvent.getX();
                        this.m = System.currentTimeMillis();
                        boolean a2 = a(motionEvent.getX());
                        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(a2 ? (byte) 1 : 0)}, this, f72058a, false, 82573, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(a2)}, this, f72058a, false, 82573, new Class[]{Boolean.TYPE}, Void.TYPE);
                        } else if (this.i != null) {
                            Iterator<a> it2 = this.i.iterator();
                            while (it2.hasNext()) {
                                it2.next().a(a2);
                            }
                        }
                        this.g.postDelayed(this.h, 500);
                        break;
                    } else {
                        this.g.removeCallbacks(this.h);
                        break;
                    }
                case 1:
                    if (!this.f72063f) {
                        if (System.currentTimeMillis() - this.m < 500 && Math.abs(motionEvent.getX() - this.k) < 48.0f && Math.abs(motionEvent.getY() - this.l) < 48.0f) {
                            b(a(motionEvent.getX()));
                        }
                        a(a(motionEvent.getX()));
                        this.g.removeCallbacks(this.h);
                        break;
                    } else {
                        c curViewHolder = getCurViewHolder();
                        if (curViewHolder != null) {
                            if (PatchProxy.isSupport(new Object[0], curViewHolder, c.f72720a, false, 83994, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], curViewHolder, c.f72720a, false, 83994, new Class[0], Void.TYPE);
                            } else {
                                com.ss.android.ugc.aweme.story.feed.view.adapter.a j2 = curViewHolder.j();
                                if (j2 != null) {
                                    j2.f();
                                }
                            }
                            if (PatchProxy.isSupport(new Object[0], curViewHolder, c.f72720a, false, 83995, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], curViewHolder, c.f72720a, false, 83995, new Class[0], Void.TYPE);
                            } else {
                                com.ss.android.ugc.aweme.story.feed.view.adapter.a j3 = curViewHolder.j();
                                if (j3 != null) {
                                    j3.m();
                                }
                            }
                        }
                        this.g.removeCallbacks(this.h);
                        this.f72063f = false;
                        break;
                    }
                case 2:
                    if (!this.f72063f) {
                        if (!PatchProxy.isSupport(new Object[]{motionEvent2}, this, f72058a, false, 82569, new Class[]{MotionEvent.class}, Void.TYPE)) {
                            if (System.currentTimeMillis() - this.n > 3000) {
                                if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f72058a, false, 82567, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f72058a, false, 82567, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
                                } else if (getAdapter() == null || getCurrentItem() != getAdapter().getCount() - 1 || motionEvent.getX() - this.k >= 0.0f) {
                                    z = false;
                                } else {
                                    z = true;
                                }
                                if (PatchProxy.isSupport(new Object[]{motionEvent2}, this, f72058a, false, 82568, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f72058a, false, 82568, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
                                } else if (getAdapter() == null || getCurrentItem() != 0 || motionEvent.getX() - this.k <= 0.0f) {
                                    z2 = false;
                                }
                                if (z || z2) {
                                    int dip2Px = (int) UIUtils.dip2Px(getContext(), 50.0f);
                                    float abs = Math.abs(motionEvent.getX() - this.k);
                                    if (abs > Math.abs(motionEvent.getY() - this.l) && abs > ((float) dip2Px)) {
                                        this.n = System.currentTimeMillis();
                                        b<String> a3 = ChangeUserModeViewModel.a((FragmentActivity) getContext());
                                        if (z) {
                                            str = "slide_left";
                                        } else {
                                            str = "slide_right";
                                        }
                                        a3.setValue(str);
                                        ((FragmentActivity) getContext()).supportFinishAfterTransition();
                                        break;
                                    }
                                }
                            }
                        } else {
                            PatchProxy.accessDispatch(new Object[]{motionEvent2}, this, f72058a, false, 82569, new Class[]{MotionEvent.class}, Void.TYPE);
                            break;
                        }
                    } else {
                        this.g.removeCallbacks(this.h);
                        break;
                    }
                    break;
                case 3:
                    this.g.removeCallbacks(this.h);
                    if (this.i != null) {
                        Iterator<a> it3 = this.i.iterator();
                        while (it3.hasNext()) {
                            it3.next().c();
                        }
                        break;
                    }
                    break;
            }
            return super.onTouchEvent(motionEvent);
        } else {
            this.g.removeCallbacks(this.h);
            return true;
        }
    }

    public int getChildDrawingOrder(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72058a, false, 82579, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f72058a, false, 82579, new Class[]{Integer.TYPE, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        try {
            return super.getChildDrawingOrder(i2, i3);
        } catch (IndexOutOfBoundsException unused) {
            return i3;
        }
    }

    public ParentViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.g = new Handler() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72064a;

            public final void handleMessage(Message message) {
                if (PatchProxy.isSupport(new Object[]{message}, this, f72064a, false, 82580, new Class[]{Message.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{message}, this, f72064a, false, 82580, new Class[]{Message.class}, Void.TYPE);
                    return;
                }
                super.handleMessage(message);
            }
        };
        this.h = new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72066a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f72066a, false, 82581, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f72066a, false, 82581, new Class[0], Void.TYPE);
                    return;
                }
                ParentViewPager parentViewPager = ParentViewPager.this;
                if (PatchProxy.isSupport(new Object[0], parentViewPager, ParentViewPager.f72058a, false, 82575, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], parentViewPager, ParentViewPager.f72058a, false, 82575, new Class[0], Void.TYPE);
                    return;
                }
                if (!parentViewPager.f72061d) {
                    if (parentViewPager.i != null) {
                        Iterator<a> it2 = parentViewPager.i.iterator();
                        while (it2.hasNext()) {
                            it2.next().a();
                        }
                    }
                    parentViewPager.f72061d = true;
                }
            }
        };
        this.j = new ViewPager.OnPageChangeListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72072a;

            /* renamed from: b  reason: collision with root package name */
            int f72073b = -1;

            /* renamed from: c  reason: collision with root package name */
            boolean f72074c = true;

            /* renamed from: e  reason: collision with root package name */
            private boolean f72076e;

            /* renamed from: f  reason: collision with root package name */
            private int f72077f;

            public void onPageScrollStateChanged(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72072a, false, 82585, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72072a, false, 82585, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                switch (i) {
                    case 0:
                        return;
                    case 1:
                    case 2:
                        ParentViewPager.this.f72062e = true;
                        ParentViewPager.this.g.removeCallbacks(ParentViewPager.this.h);
                        break;
                }
            }

            public void onPageSelected(int i) {
                boolean z;
                int i2;
                int i3 = i;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f72072a, false, 82584, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f72072a, false, 82584, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                com.ss.android.ugc.aweme.story.player.c.d().a();
                ParentViewPager.this.f72062e = false;
                if (i3 >= this.f72077f) {
                    z = true;
                } else {
                    z = false;
                }
                this.f72076e = z;
                this.f72073b = i3;
                if (this.f72076e) {
                    i2 = i3 - 1;
                } else {
                    i2 = i3 + 1;
                }
                for (int i4 = 0; i4 < ParentViewPager.this.getChildCount(); i4++) {
                    c cVar = (c) ParentViewPager.this.getChildAt(i4).getTag();
                    if (cVar != null) {
                        if (this.f72074c && g.a(cVar.f72725f, ((StoryMainPagerAdapter) ParentViewPager.this.getAdapter()).b(i2))) {
                            boolean z2 = this.f72076e;
                            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, cVar, c.f72720a, false, 83968, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, cVar, c.f72720a, false, 83968, new Class[]{Boolean.TYPE}, Void.TYPE);
                            } else {
                                com.ss.android.ugc.aweme.story.feed.view.adapter.a b2 = cVar.b(cVar.f72722c.getCurrentItem());
                                if (b2 != null) {
                                    b2.e();
                                }
                                if (!cVar.g() && g.b(cVar.f72725f) && cVar.f72725f.getCurPos() > 0) {
                                    cVar.g.a(g.a(cVar.f72725f));
                                }
                            }
                        } else if (g.a(cVar.f72725f, ((StoryMainPagerAdapter) ParentViewPager.this.getAdapter()).b(i3))) {
                            cVar.a(this.f72076e);
                        }
                    }
                }
                this.f72077f = i3;
            }

            public void onPageScrolled(int i, float f2, int i2) {
                if (f2 < 1.0E-10f) {
                    ParentViewPager.this.f72062e = false;
                } else {
                    ParentViewPager.this.f72062e = true;
                }
                if (i == this.f72073b && f2 < 1.0E-10f) {
                    this.f72077f = i;
                    this.f72073b = -1;
                }
            }
        };
        setOverScrollMode(2);
        setOffscreenPageLimit(Integer.MAX_VALUE);
        if (PatchProxy.isSupport(new Object[0], this, f72058a, false, 82563, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72058a, false, 82563, new Class[0], Void.TYPE);
        } else {
            addOnPageChangeListener(this.j);
        }
        this.o = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72068a;

            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f2, float f3) {
                if (PatchProxy.isSupport(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f72068a, false, 82582, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent, motionEvent2, Float.valueOf(f2), Float.valueOf(f3)}, this, f72068a, false, 82582, new Class[]{MotionEvent.class, MotionEvent.class, Float.TYPE, Float.TYPE}, Boolean.TYPE)).booleanValue();
                } else if (ParentViewPager.this.f72061d || f3 >= 0.0f || ParentViewPager.this.f72062e) {
                    return false;
                } else {
                    String str = (String) ChangeUserModeViewModel.a((FragmentActivity) ParentViewPager.this.getContext()).getValue();
                    if (TextUtils.equals(str, "slide_left") || TextUtils.equals(str, "slide_right")) {
                        return false;
                    }
                    ParentViewPager.this.b();
                    return true;
                }
            }
        });
        if (PatchProxy.isSupport(new Object[]{context}, this, f72058a, false, 82562, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f72058a, false, 82562, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.story.base.a.a.a().a("on_show_sticker_pop_up_window", Boolean.class).observe((LifecycleOwner) context, new Observer<Boolean>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f72070a;

            public final /* synthetic */ void onChanged(@Nullable Object obj) {
                Boolean bool = (Boolean) obj;
                if (PatchProxy.isSupport(new Object[]{bool}, this, f72070a, false, 82583, new Class[]{Boolean.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bool}, this, f72070a, false, 82583, new Class[]{Boolean.class}, Void.TYPE);
                    return;
                }
                if (bool != null) {
                    ParentViewPager.this.f72063f = bool.booleanValue();
                }
            }
        });
    }
}
