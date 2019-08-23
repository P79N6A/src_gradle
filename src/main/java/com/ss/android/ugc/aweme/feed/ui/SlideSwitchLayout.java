package com.ss.android.ugc.aweme.feed.ui;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.utils.p;
import com.ss.android.ugc.aweme.base.utils.u;
import com.ss.android.ugc.aweme.feed.listener.h;
import com.ss.android.ugc.aweme.feed.listener.i;
import com.ss.android.ugc.aweme.feed.listener.j;
import java.util.ArrayList;
import java.util.List;

public class SlideSwitchLayout extends HorizontalScrollView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f46302a;

    /* renamed from: e  reason: collision with root package name */
    public static final int f46303e = p.c(k.a());
    public static final int g = u.a(8.0d);
    private static final int r = ViewConfiguration.getMaximumFlingVelocity();
    private static final int w = u.a(500.0d);
    private j A;
    private com.ss.android.ugc.aweme.feed.listener.k B;
    private i C;

    /* renamed from: b  reason: collision with root package name */
    public int f46304b;

    /* renamed from: c  reason: collision with root package name */
    boolean f46305c;

    /* renamed from: d  reason: collision with root package name */
    public List<a> f46306d;

    /* renamed from: f  reason: collision with root package name */
    public boolean f46307f;
    public long h;
    public boolean i;
    public int j;
    public int k;
    boolean l;
    public h m;
    private boolean n;
    private int o;
    private int p;
    private VelocityTracker q;
    private int s;
    private int t;
    private int u;
    private boolean v;
    private boolean x;
    private boolean y;
    private Runnable z;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f46315a;

        /* renamed from: b  reason: collision with root package name */
        public int f46316b;

        /* renamed from: c  reason: collision with root package name */
        public String f46317c;

        /* renamed from: d  reason: collision with root package name */
        public boolean f46318d = true;

        public int hashCode() {
            if (!PatchProxy.isSupport(new Object[0], this, f46315a, false, 43051, new Class[0], Integer.TYPE)) {
                return this.f46317c.hashCode();
            }
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f46315a, false, 43051, new Class[0], Integer.TYPE)).intValue();
        }

        public boolean equals(Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, f46315a, false, 43050, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f46315a, false, 43050, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            } else if (this == obj) {
                return true;
            } else {
                if (!(obj instanceof a)) {
                    return false;
                }
                return this.f46317c.equals(((a) obj).f46317c);
            }
        }

        public a(String str, int i) {
            this.f46317c = str;
            this.f46316b = i;
        }
    }

    public void fling(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f46302a, false, 43031, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f46302a, false, 43031, new Class[]{Integer.TYPE}, Void.TYPE);
        }
    }

    public int getCurrentItem() {
        return this.k;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f46302a, false, 43011, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46302a, false, 43011, new Class[0], Void.TYPE);
            return;
        }
        c(this.k);
    }

    public String getCurrentItemName() {
        if (!PatchProxy.isSupport(new Object[0], this, f46302a, false, 43032, new Class[0], String.class)) {
            return this.f46306d.get(this.k).f46317c;
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f46302a, false, 43032, new Class[0], String.class);
    }

    public void onFinishInflate() {
        if (PatchProxy.isSupport(new Object[0], this, f46302a, false, 43013, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46302a, false, 43013, new Class[0], Void.TYPE);
            return;
        }
        super.onFinishInflate();
        this.q = VelocityTracker.obtain();
    }

    public void setCanScroll(boolean z2) {
        this.f46307f = z2;
    }

    public void setOnFeedScrollListener(i iVar) {
        this.C = iVar;
    }

    public void setOnFlingEndListener(j jVar) {
        this.A = jVar;
    }

    public void setOnFlingToIndexListener(com.ss.android.ugc.aweme.feed.listener.k kVar) {
        this.B = kVar;
    }

    public void setOnPageChangeListener(h hVar) {
        this.m = hVar;
    }

    public void setOverScrollLeftAction(Runnable runnable) {
        this.z = runnable;
    }

    public void setScrowToChildWhenRequestChildFocus(boolean z2) {
        this.n = z2;
    }

    public SlideSwitchLayout(Context context) {
        this(context, null);
    }

    public static int a(int i2) {
        return i2 * f46303e;
    }

    private a a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f46302a, false, 43034, new Class[]{String.class}, a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[]{str}, this, f46302a, false, 43034, new Class[]{String.class}, a.class);
        }
        for (int i2 = 0; i2 < this.f46306d.size(); i2++) {
            a aVar = this.f46306d.get(i2);
            if (TextUtils.equals(aVar.f46317c, str)) {
                return aVar;
            }
        }
        return null;
    }

    private a b(int i2) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f46302a, false, 43035, new Class[]{Integer.TYPE}, a.class)) {
            return this.f46306d.get(i2);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f46302a, false, 43035, new Class[]{Integer.TYPE}, a.class);
    }

    private void c(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f46302a, false, 43044, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f46302a, false, 43044, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        setScrollX(a(i2));
    }

    public int computeScrollDeltaToGetChildRectOnScreen(Rect rect) {
        if (PatchProxy.isSupport(new Object[]{rect}, this, f46302a, false, 43047, new Class[]{Rect.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{rect}, this, f46302a, false, 43047, new Class[]{Rect.class}, Integer.TYPE)).intValue();
        } else if (this.n) {
            return super.computeScrollDeltaToGetChildRectOnScreen(rect);
        } else {
            return 0;
        }
    }

    public void onWindowFocusChanged(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f46302a, false, 43012, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f46302a, false, 43012, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.onWindowFocusChanged(z2);
        if (z2) {
            a();
        }
    }

    public void setCurrentItem(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f46302a, false, 43037, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f46302a, false, 43037, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{str2, ""}, this, f46302a, false, 43039, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, ""}, this, f46302a, false, 43039, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        a(str2, true, "");
    }

    private boolean b(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f46302a, false, 43017, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f46302a, false, 43017, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!d(motionEvent) || !c(motionEvent)) {
            return false;
        } else {
            return true;
        }
    }

    private boolean c(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f46302a, false, 43018, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f46302a, false, 43018, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (Exception e2) {
            com.ss.android.ugc.aweme.framework.a.a.a((Throwable) e2);
            return false;
        }
    }

    private boolean d(MotionEvent motionEvent) {
        boolean z2;
        boolean z3;
        int i2;
        int i3;
        boolean z4;
        boolean z5;
        boolean z6 = false;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f46302a, false, 43019, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f46302a, false, 43019, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        int findPointerIndex = motionEvent.findPointerIndex(this.s);
        if (findPointerIndex == -1) {
            return false;
        }
        int x2 = (int) motionEvent.getX(findPointerIndex);
        if (Math.abs(x2 - this.o) <= f46303e) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x2 - this.o > 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2) {
            int i4 = this.p - (x2 - this.o);
            if (this.k <= 0) {
                i2 = this.k;
            } else {
                i2 = this.k - 1;
            }
            if (this.k >= this.f46304b) {
                i3 = this.f46304b;
            } else {
                i3 = this.k + 1;
            }
            if (i4 < 0 || !b(i2).f46318d) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (i4 <= this.f46304b * f46303e && b(i3).f46318d) {
                z6 = true;
            }
            if (z3) {
                z5 = z4;
            } else {
                z5 = z6;
            }
            if (!z4 && !this.y && this.z != null) {
                this.y = true;
                this.z.run();
            }
        }
        return z2;
    }

    private void setCurrentItem(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f46302a, false, 43036, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f46302a, false, 43036, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), ""}, this, f46302a, false, 43038, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), ""}, this, f46302a, false, 43038, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        a(i2, true, "");
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f46302a, false, 43020, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f46302a, false, 43020, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.f46307f) {
            return false;
        } else {
            if (this.i) {
                return true;
            }
            if (this.h != 0 && System.currentTimeMillis() - this.h < 150) {
                return this.l;
            }
            if (!canScrollHorizontally(-1) && !canScrollHorizontally(1)) {
                return false;
            }
            this.l = false;
            switch (motionEvent.getAction()) {
                case 0:
                    this.t = (int) motionEvent.getX();
                    this.u = (int) motionEvent.getY();
                    a(motionEvent);
                    this.v = true;
                    break;
                case 1:
                    this.l = false;
                    break;
                case 2:
                    float abs = Math.abs(((float) this.t) - motionEvent.getX());
                    float abs2 = Math.abs(((float) this.u) - motionEvent.getY());
                    if ((abs > ((float) g) || abs2 > ((float) g)) && this.v) {
                        if (abs - abs2 >= 0.0f) {
                            this.l = true;
                        } else {
                            this.l = false;
                        }
                        this.v = false;
                        break;
                    }
                default:
                    this.l = true;
                    break;
            }
            return this.l;
        }
    }

    public void setCanScrollToProfile(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f46302a, false, 43007, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, f46302a, false, 43007, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{"page_profile", Byte.valueOf(z2)}, this, f46302a, false, 43008, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{"page_profile", Byte.valueOf(z2)}, this, f46302a, false, 43008, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        a a2 = a("page_profile");
        if (a2 != null) {
            a2.f46318d = z2;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        byte b2;
        int i2;
        int i3 = 1;
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f46302a, false, 43015, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f46302a, false, 43015, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        } else if (!this.f46307f) {
            return super.onTouchEvent(motionEvent);
        } else {
            int action = motionEvent.getAction();
            if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f46302a, false, 43028, new Class[]{MotionEvent.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f46302a, false, 43028, new Class[]{MotionEvent.class}, Void.TYPE);
            } else {
                if (this.q == null) {
                    this.q = VelocityTracker.obtain();
                }
                this.q.addMovement(motionEvent);
            }
            switch (action) {
                case 0:
                    return a(motionEvent);
                case 1:
                case 3:
                    int x2 = (int) motionEvent.getX();
                    VelocityTracker velocityTracker = this.q;
                    if (x2 <= this.t) {
                        b2 = 1;
                    } else {
                        b2 = 0;
                    }
                    if (PatchProxy.isSupport(new Object[]{velocityTracker, Byte.valueOf(b2)}, this, f46302a, false, 43022, new Class[]{VelocityTracker.class, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{velocityTracker, Byte.valueOf(b2)}, this, f46302a, false, 43022, new Class[]{VelocityTracker.class, Boolean.TYPE}, Void.TYPE);
                    } else {
                        velocityTracker.computeCurrentVelocity(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE, (float) r);
                        float xVelocity = velocityTracker.getXVelocity(this.s);
                        int scrollX = getScrollX() % f46303e;
                        if (scrollX != 0) {
                            int scrollX2 = getScrollX() / f46303e;
                            if (Math.abs(xVelocity) < ((float) w)) {
                                if (scrollX <= f46303e / 2) {
                                    i3 = 0;
                                }
                                i2 = scrollX2 + i3;
                            } else {
                                if (xVelocity >= 0.0f) {
                                    i3 = 0;
                                }
                                i2 = scrollX2 + i3;
                            }
                            int a2 = com.ss.android.ugc.aweme.base.utils.k.a(i2, 0, this.f46304b);
                            if (this.B != null) {
                                this.B.a(a2);
                            }
                            setCurrentItem(a2);
                            if (PatchProxy.isSupport(new Object[0], this, f46302a, false, 43029, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f46302a, false, 43029, new Class[0], Void.TYPE);
                            } else if (this.q != null) {
                                this.q.clear();
                                this.q.recycle();
                                this.q = null;
                            }
                        } else if (!(this.A == null || b2 == 0)) {
                            this.A.a();
                        }
                    }
                    this.x = false;
                    boolean b3 = b(motionEvent);
                    this.y = false;
                    return b3;
                case 2:
                    if (this.C != null) {
                        getScrollX();
                    }
                    return b(motionEvent);
                default:
                    return false;
            }
        }
    }

    private boolean a(MotionEvent motionEvent) {
        if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f46302a, false, 43016, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f46302a, false, 43016, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        this.s = motionEvent.getPointerId(0);
        this.o = (int) motionEvent.getX();
        this.p = getScrollX();
        return super.onTouchEvent(motionEvent);
    }

    public SlideSwitchLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void scrollBy(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f46302a, false, 43030, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f46302a, false, 43030, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if ((-i2) != f46303e) {
            super.scrollBy(i2, i3);
        }
    }

    public void scrollTo(int i2, int i3) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f46302a, false, 43046, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3)}, this, f46302a, false, 43046, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.scrollTo(i2, i3);
    }

    private void a(final int i2, final String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str}, this, f46302a, false, 43045, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str}, this, f46302a, false, 43045, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        post(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46310a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f46310a, false, 43049, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f46310a, false, 43049, new Class[0], Void.TYPE);
                    return;
                }
                SlideSwitchLayout.this.smoothScrollTo(SlideSwitchLayout.a(i2), 0);
                SlideSwitchLayout.this.h = System.currentTimeMillis();
                SlideSwitchLayout.this.j = SlideSwitchLayout.this.k;
                SlideSwitchLayout.this.k = i2;
            }
        });
        this.i = true;
        postDelayed(new Runnable() {
            public final void run() {
                SlideSwitchLayout.this.i = false;
            }
        }, 150);
    }

    public SlideSwitchLayout(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.n = true;
        this.f46306d = new ArrayList(5);
        this.f46307f = true;
        this.v = false;
        this.i = false;
        this.j = 0;
        this.k = 0;
        this.x = false;
        this.l = false;
        if (PatchProxy.isSupport(new Object[0], this, f46302a, false, 43009, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f46302a, false, 43009, new Class[0], Void.TYPE);
            return;
        }
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f46308a;

            public final boolean onPreDraw() {
                if (PatchProxy.isSupport(new Object[0], this, f46308a, false, 43048, new Class[0], Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f46308a, false, 43048, new Class[0], Boolean.TYPE)).booleanValue();
                }
                SlideSwitchLayout.this.getViewTreeObserver().removeOnPreDrawListener(this);
                SlideSwitchLayout slideSwitchLayout = SlideSwitchLayout.this;
                if (PatchProxy.isSupport(new Object[0], slideSwitchLayout, SlideSwitchLayout.f46302a, false, 43010, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], slideSwitchLayout, SlideSwitchLayout.f46302a, false, 43010, new Class[0], Void.TYPE);
                } else if (!slideSwitchLayout.f46305c) {
                    slideSwitchLayout.f46305c = true;
                    slideSwitchLayout.a();
                }
                return false;
            }
        });
    }

    private void a(int i2, boolean z2, String str) {
        int i3 = i2;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2 ? (byte) 1 : 0), str2}, this, f46302a, false, 43043, new Class[]{Integer.TYPE, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Byte.valueOf(z2), str2}, this, f46302a, false, 43043, new Class[]{Integer.TYPE, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (z2) {
            if (!(i3 == this.k && getScrollX() == a(i2))) {
                a(i2, str2);
            }
        } else if (i3 != this.k) {
            this.j = this.k;
            this.k = i3;
            if (this.f46305c) {
                c(this.k);
                if (this.m != null) {
                }
            }
        }
    }

    public final void a(String str, boolean z2, String str2) {
        String str3 = str;
        String str4 = str2;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{str3, Byte.valueOf(z2 ? (byte) 1 : 0), str4}, this, f46302a, false, 43042, new Class[]{String.class, Boolean.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, Byte.valueOf(z2), str4}, this, f46302a, false, 43042, new Class[]{String.class, Boolean.TYPE, String.class}, Void.TYPE);
            return;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= this.f46306d.size()) {
                break;
            } else if (TextUtils.equals(str, this.f46306d.get(i3).f46317c)) {
                i2 = i3;
                break;
            } else {
                i3++;
            }
        }
        a(i2, z2, str4);
    }

    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f46302a, false, 43014, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f46302a, false, 43014, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i4 != 0) {
            int i6 = i2;
        } else if (i2 == f46303e) {
            setCurrentItem("page_home");
            return;
        }
        super.onScrollChanged(i2, i3, i4, i5);
    }
}
