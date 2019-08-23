package com.ss.android.ugc.aweme.discover.helper;

import android.os.Handler;
import android.os.Message;
import android.support.v4.view.ViewPager;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.main.cg;
import com.ss.android.ugc.aweme.utils.ey;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class i implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42342a;

    /* renamed from: b  reason: collision with root package name */
    final boolean f42343b;

    /* renamed from: c  reason: collision with root package name */
    public int f42344c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f42345d;

    /* renamed from: e  reason: collision with root package name */
    ViewPager f42346e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f42347f;
    public Handler g;
    Method h;
    private long i;
    private View.OnTouchListener j;

    static class a extends cg<i> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42352a;

        /* renamed from: d  reason: collision with root package name */
        private long f42353d;

        public final /* synthetic */ void a(Object obj) {
            int i;
            i iVar = (i) obj;
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f42352a, false, 36371, new Class[]{i.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{iVar}, this, f42352a, false, 36371, new Class[]{i.class}, Void.TYPE);
            } else if (iVar != null && iVar.g != null && iVar.f42347f) {
                if (PatchProxy.isSupport(new Object[0], iVar, i.f42342a, false, 36366, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], iVar, i.f42342a, false, 36366, new Class[0], Void.TYPE);
                } else if (!iVar.f42347f) {
                    iVar.g.removeCallbacksAndMessages(null);
                } else {
                    int currentItem = iVar.f42346e.getCurrentItem();
                    if (iVar.f42343b) {
                        i = -1;
                    } else {
                        i = 1;
                    }
                    int i2 = currentItem + i;
                    if (i2 < 0) {
                        i2 += iVar.f42344c;
                    }
                    if (iVar.h != null) {
                        try {
                            iVar.h.invoke(iVar.f42346e, new Object[]{Integer.valueOf(i2), Boolean.TRUE, Boolean.TRUE, 1});
                        } catch (IllegalAccessException | InvocationTargetException unused) {
                        }
                    }
                    iVar.f42346e.setCurrentItem(i2, true);
                }
                if (!iVar.f42347f) {
                    iVar.g.removeCallbacksAndMessages(null);
                } else {
                    iVar.g.postDelayed(this, this.f42353d);
                }
            }
        }

        a(i iVar, long j) {
            super(iVar);
            this.f42353d = j;
        }
    }

    public void handleMsg(Message message) {
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f42342a, false, 36368, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42342a, false, 36368, new Class[0], Void.TYPE);
        } else if (this.f42347f) {
            this.f42347f = false;
            this.g.removeCallbacksAndMessages(null);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f42342a, false, 36367, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f42342a, false, 36367, new Class[0], Void.TYPE);
        } else if (!this.f42347f) {
            this.f42347f = true;
            this.g.removeCallbacksAndMessages(null);
            this.g.postDelayed(new a(this, this.i), this.i);
        }
    }

    public i(ViewPager viewPager) {
        this(viewPager, 5000);
    }

    public i(ViewPager viewPager, long j2) {
        this.i = 5000;
        this.f42345d = true;
        this.j = new View.OnTouchListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42348a;

            public final boolean onTouch(View view, MotionEvent motionEvent) {
                if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f42348a, false, 36369, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f42348a, false, 36369, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
                } else if (!i.this.f42345d) {
                    return false;
                } else {
                    int action = motionEvent.getAction();
                    if (action == 2) {
                        i.this.b();
                    } else if (action == 1) {
                        i.this.g.postDelayed(new Runnable() {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f42350a;

                            public final void run() {
                                if (PatchProxy.isSupport(new Object[0], this, f42350a, false, 36370, new Class[0], Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[0], this, f42350a, false, 36370, new Class[0], Void.TYPE);
                                    return;
                                }
                                i.this.a();
                            }
                        }, 2000);
                    }
                    return false;
                }
            }
        };
        this.f42346e = viewPager;
        this.i = j2;
        this.g = new WeakHandler(this);
        Class<ViewPager> cls = ViewPager.class;
        try {
            this.h = cls.getDeclaredMethod("setCurrentItemInternal", new Class[]{Integer.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE});
            this.h.setAccessible(true);
        } catch (NoSuchMethodException unused) {
        }
        viewPager.setOnTouchListener(this.j);
        this.f42343b = ey.a(viewPager.getContext());
    }
}
