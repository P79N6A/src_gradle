package com.ss.android.common.applog.a;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.aa;
import com.ss.android.common.applog.ab;
import com.ss.android.ugc.aweme.shortvideo.ea;
import java.util.ArrayList;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f28065a;
    private static volatile c l;
    private static volatile a o;

    /* renamed from: b  reason: collision with root package name */
    public boolean f28066b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f28067c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f28068d = true;

    /* renamed from: e  reason: collision with root package name */
    public long f28069e = ab.a();

    /* renamed from: f  reason: collision with root package name */
    public d f28070f;
    public b g;
    public final List<d> h = new ArrayList();
    public boolean i = false;
    public final Runnable j = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f28077a;

        public final void run() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, f28077a, false, 15709, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f28077a, false, 15709, new Class[0], Void.TYPE);
                return;
            }
            StringBuilder sb = new StringBuilder("closeCurrentSession currentSession is null : ");
            if (c.this.f28070f == null) {
                z = true;
            }
            sb.append(z);
            if (c.this.f28070f != null) {
                if (c.this.i) {
                    c.this.g.a(c.this.f28070f);
                } else {
                    c.this.h.add(c.this.f28070f);
                }
                c.this.f28070f = null;
                c.this.g.a();
            }
        }
    };
    public final Runnable k = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f28079a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f28079a, false, 15710, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f28079a, false, 15710, new Class[0], Void.TYPE);
                return;
            }
            c.this.i = true;
            for (d a2 : new ArrayList(c.this.h)) {
                c.this.g.a(a2);
            }
            c.this.h.clear();
        }
    };
    private Handler m;
    private Context n;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f28065a, false, 15702, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f28065a, false, 15702, new Class[0], Void.TYPE);
            return;
        }
        this.f28066b = false;
        this.h.clear();
        this.i = false;
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f28065a, false, 15705, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f28065a, false, 15705, new Class[0], Void.TYPE);
            return;
        }
        d().removeMessages(1);
    }

    @NonNull
    private Handler d() {
        Handler handler;
        if (PatchProxy.isSupport(new Object[0], this, f28065a, false, 15697, new Class[0], Handler.class)) {
            return (Handler) PatchProxy.accessDispatch(new Object[0], this, f28065a, false, 15697, new Class[0], Handler.class);
        }
        if (this.m == null) {
            synchronized (this) {
                if (this.m == null) {
                    if (PatchProxy.isSupport(new Object[0], this, f28065a, false, 15696, new Class[0], Handler.class)) {
                        handler = (Handler) PatchProxy.accessDispatch(new Object[0], this, f28065a, false, 15696, new Class[0], Handler.class);
                    } else {
                        handler = new Handler(aa.a().getLooper()) {

                            /* renamed from: a  reason: collision with root package name */
                            public static ChangeQuickRedirect f28071a;

                            public final void handleMessage(Message message) {
                                boolean z;
                                Message message2 = message;
                                boolean z2 = true;
                                if (PatchProxy.isSupport(new Object[]{message2}, this, f28071a, false, 15707, new Class[]{Message.class}, Void.TYPE)) {
                                    PatchProxy.accessDispatch(new Object[]{message2}, this, f28071a, false, 15707, new Class[]{Message.class}, Void.TYPE);
                                    return;
                                }
                                super.handleMessage(message);
                                if (message2.what == 1) {
                                    if (c.this.f28070f != null) {
                                        Object obj = message2.obj;
                                        if (obj instanceof String) {
                                            String str = (String) obj;
                                            String str2 = c.this.f28070f.f28093c;
                                            if (PatchProxy.isSupport(new Object[]{str, str2}, null, ab.f28103a, true, 15671, new Class[]{Object.class, Object.class}, Boolean.TYPE)) {
                                                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{str, str2}, null, ab.f28103a, true, 15671, new Class[]{Object.class, Object.class}, Boolean.TYPE)).booleanValue();
                                            } else if (str != null) {
                                                z = str.equals(str2);
                                            } else if (str2 == null) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            if (!c.this.f28068d || !c.this.f28067c) {
                                                z2 = false;
                                            }
                                            if (z && z2) {
                                                c.this.f28070f.h = System.currentTimeMillis();
                                                c.this.g.b(c.this.f28070f);
                                                c.this.a(str);
                                                c.this.a();
                                                return;
                                            }
                                        }
                                    }
                                    c.this.g.a();
                                    c.this.a();
                                }
                            }
                        };
                    }
                    this.m = handler;
                }
            }
        }
        return this.m;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f28065a, false, 15698, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f28065a, false, 15698, new Class[0], Void.TYPE);
            return;
        }
        boolean a2 = o.a();
        if (this.f28067c != a2) {
            new StringBuilder("tryCorrectTaskState newIsTaskRunning : ").append(a2);
            if (a2) {
                if (PatchProxy.isSupport(new Object[0], this, f28065a, false, 15706, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f28065a, false, 15706, new Class[0], Void.TYPE);
                } else {
                    final long a3 = ab.a();
                    aa.a().c(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f28088a;

                        public final void run() {
                            if (PatchProxy.isSupport(new Object[0], this, f28088a, false, 15713, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f28088a, false, 15713, new Class[0], Void.TYPE);
                                return;
                            }
                            if (!c.this.f28067c) {
                                c.this.f28067c = true;
                                if (c.this.f28068d) {
                                    c.this.f28066b = true;
                                    if (c.this.f28070f == null) {
                                        c.this.f28070f = new d(a3);
                                        c.this.g.a();
                                        c.this.a(c.this.f28070f.f28093c);
                                        return;
                                    }
                                    long j = a3 - c.this.f28070f.h;
                                    if (j <= ea.f66827f) {
                                        StringBuilder sb = new StringBuilder("task time diff ");
                                        sb.append(j);
                                        sb.append(" , is less than 15000");
                                        sb.append(" so , merge in previous session");
                                        aa.a().b(c.this.j);
                                        c.this.f28070f.i += j;
                                        c.this.f28070f.h = a3;
                                        c.this.g.b(c.this.f28070f);
                                        c.this.a(c.this.f28070f.f28093c);
                                        return;
                                    }
                                    StringBuilder sb2 = new StringBuilder("task time diff ");
                                    sb2.append(j);
                                    sb2.append(" , is bigger than 15000");
                                    sb2.append(" so close current session and create new session");
                                    aa.a().b(c.this.j);
                                    c.this.j.run();
                                    c.this.f28070f = new d(a3);
                                    c.this.g.a();
                                    c.this.a(c.this.f28070f.f28093c);
                                }
                            }
                        }
                    });
                }
            } else {
                if (PatchProxy.isSupport(new Object[0], this, f28065a, false, 15701, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f28065a, false, 15701, new Class[0], Void.TYPE);
                    return;
                }
                final long a4 = ab.a();
                aa.a().c(new Runnable() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f28081a;

                    public final void run() {
                        if (PatchProxy.isSupport(new Object[0], this, f28081a, false, 15711, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f28081a, false, 15711, new Class[0], Void.TYPE);
                            return;
                        }
                        if (c.this.f28067c) {
                            c.this.f28067c = false;
                            if (c.this.f28068d && c.this.f28070f != null) {
                                c.this.f28070f.h = a4;
                                aa.a().a(c.this.j, ea.f66827f);
                                c.this.g.b(c.this.f28070f);
                                c.this.c();
                            }
                        }
                    }
                });
            }
        }
    }

    private c(Context context) {
        this.n = context.getApplicationContext();
        this.g = new b(context);
    }

    public static c a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, null, f28065a, true, 15699, new Class[]{Context.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{context}, null, f28065a, true, 15699, new Class[]{Context.class}, c.class);
        }
        if (l == null) {
            synchronized (c.class) {
                if (l == null) {
                    l = new c(context.getApplicationContext());
                }
            }
        }
        return l;
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f28065a, false, 15704, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f28065a, false, 15704, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Handler d2 = d();
        d2.removeMessages(1);
        d2.sendMessageDelayed(Message.obtain(d2, 1, str2), 5000);
    }
}
