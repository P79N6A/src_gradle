package com.ss.android.ugc.aweme.livewallpaper.a;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.a.b.d;
import com.ss.android.ugc.a.c;
import com.ss.android.ugc.a.e;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.video.b;

public abstract class a implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53570a;

    /* renamed from: b  reason: collision with root package name */
    protected Aweme f53571b;

    /* renamed from: c  reason: collision with root package name */
    protected Activity f53572c;

    /* renamed from: d  reason: collision with root package name */
    protected com.ss.android.ugc.aweme.shortvideo.view.d f53573d;

    /* renamed from: e  reason: collision with root package name */
    protected String f53574e;

    /* renamed from: f  reason: collision with root package name */
    protected String f53575f;
    protected String g;
    protected String h;
    protected String i;
    public int j;
    private int k;
    private Handler l = new Handler(Looper.getMainLooper());
    private Runnable m = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53576a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f53576a, false, 56034, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53576a, false, 56034, new Class[0], Void.TYPE);
                return;
            }
            if (a.this.f53573d != null) {
                com.ss.android.ugc.aweme.shortvideo.view.d dVar = a.this.f53573d;
                int i = 100;
                if (a.this.j < 100) {
                    i = a.this.j;
                }
                dVar.setProgress(i);
            }
        }
    };

    public abstract boolean b(Aweme aweme);

    public abstract void c();

    public abstract String d();

    public abstract void e();

    public abstract void f();

    private void g() {
        if (PatchProxy.isSupport(new Object[0], this, f53570a, false, 56032, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53570a, false, 56032, new Class[0], Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.app.application.initialization.a.a(new e.a().a(this.f53574e).b(this.h).a(), (d) this);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f53570a, false, 56026, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53570a, false, 56026, new Class[0], Void.TYPE);
            return;
        }
        b.c(this.h);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f53570a, false, 56027, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53570a, false, 56027, new Class[0], Void.TYPE);
            return;
        }
        if (this.f53573d != null) {
            try {
                this.f53573d.dismiss();
            } catch (Exception unused) {
            }
            this.f53573d = null;
        }
    }

    public a(Activity activity) {
        this.f53572c = activity;
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f53570a, false, 56025, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f53570a, false, 56025, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f53573d == null) {
            this.f53573d = com.ss.android.ugc.aweme.shortvideo.view.d.b(this.f53572c, str);
            this.f53573d.setIndeterminate(false);
        }
        this.f53573d.setProgress(0);
    }

    public void onError(c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f53570a, false, 56024, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f53570a, false, 56024, new Class[]{c.class}, Void.TYPE);
        } else if (this.f53572c != null) {
            if (this.k < 3) {
                this.k++;
                g();
                return;
            }
            f();
        }
    }

    public final void a(Aweme aweme) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = true;
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f53570a, false, 56022, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f53570a, false, 56022, new Class[]{Aweme.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f53570a, false, 56028, new Class[]{Aweme.class}, Boolean.TYPE)) {
            z4 = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f53570a, false, 56028, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (aweme != null) {
            if (PatchProxy.isSupport(new Object[]{aweme}, this, f53570a, false, 56029, new Class[]{Aweme.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f53570a, false, 56029, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
            } else {
                if (PatchProxy.isSupport(new Object[]{aweme}, this, f53570a, false, 56030, new Class[]{Aweme.class}, Boolean.TYPE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f53570a, false, 56030, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
                } else if (aweme.getAuthor() == null || !TextUtils.equals(com.ss.android.ugc.aweme.account.d.a().getCurUserId(), aweme.getAuthorUid())) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                if (!z2) {
                    if (PatchProxy.isSupport(new Object[]{aweme}, this, f53570a, false, 56031, new Class[]{Aweme.class}, Boolean.TYPE)) {
                        z3 = ((Boolean) PatchProxy.accessDispatch(new Object[]{aweme}, this, f53570a, false, 56031, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
                    } else if (aweme.getStatus() == null || aweme.getStatus().getPrivateStatus() != 1) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    if (z3) {
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this.f53572c, (int) C0906R.string.dr1).a();
            } else if (!NetworkUtils.isNetworkAvailable(this.f53572c)) {
                com.bytedance.ies.dmt.ui.d.a.b((Context) this.f53572c, this.f53572c.getString(C0906R.string.c2j)).a();
            } else if (b(aweme)) {
                z4 = false;
            }
        }
        if (z4) {
            b();
            return;
        }
        this.f53571b = aweme;
        c();
        if (b.b(this.i)) {
            e();
            b();
            return;
        }
        a(d());
        g();
        if (PatchProxy.isSupport(new Object[0], this, f53570a, false, 56033, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53570a, false, 56033, new Class[0], Void.TYPE);
            return;
        }
        this.l.postDelayed(new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53578a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f53578a, false, 56035, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f53578a, false, 56035, new Class[0], Void.TYPE);
                    return;
                }
                if (a.this.j == 0) {
                    a.this.f();
                }
            }
        }, 60000);
    }

    public void onDownloadProgress(int i2, long j2, long j3) {
        long j4 = j2;
        long j5 = j3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), new Long(j4), new Long(j5)}, this, f53570a, false, 56023, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), new Long(j4), new Long(j5)}, this, f53570a, false, 56023, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        if (this.f53572c != null) {
            this.j = i2;
            com.ss.android.b.a.a.a.b(this.m);
        }
    }
}
