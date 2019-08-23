package com.ss.android.ugc.aweme.face2face.net;

import android.os.Handler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.lang.ref.WeakReference;
import java.util.Observable;
import java.util.Observer;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43952a;

    /* renamed from: b  reason: collision with root package name */
    public Handler f43953b;

    /* renamed from: c  reason: collision with root package name */
    public a f43954c;

    /* renamed from: d  reason: collision with root package name */
    public long f43955d;

    /* renamed from: e  reason: collision with root package name */
    public b f43956e;

    /* renamed from: f  reason: collision with root package name */
    private d f43957f;
    private C0550c g;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43958a;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<c> f43960c;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f43958a, false, 39146, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f43958a, false, 39146, new Class[0], Void.TYPE);
                return;
            }
            c cVar = (c) this.f43960c.get();
            if (!(cVar == null || cVar.f43956e == null)) {
                cVar.f43956e.a(cVar);
            }
        }

        a(c cVar) {
            this.f43960c = new WeakReference<>(cVar);
        }
    }

    public interface b {
        void a(c cVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.face2face.net.c$c  reason: collision with other inner class name */
    class C0550c extends Observable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43961a;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f43961a, false, 39147, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f43961a, false, 39147, new Class[0], Void.TYPE);
                return;
            }
            setChanged();
            notifyObservers();
        }

        private C0550c() {
        }

        /* synthetic */ C0550c(c cVar, byte b2) {
            this();
        }
    }

    class d implements Observer {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43963a;

        private d() {
        }

        /* synthetic */ d(c cVar, byte b2) {
            this();
        }

        public final void update(Observable observable, Object obj) {
            if (PatchProxy.isSupport(new Object[]{observable, obj}, this, f43963a, false, 39148, new Class[]{Observable.class, Object.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{observable, obj}, this, f43963a, false, 39148, new Class[]{Observable.class, Object.class}, Void.TYPE);
                return;
            }
            c.this.f43953b.postDelayed(c.this.f43954c, c.this.f43955d);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f43952a, false, 39144, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43952a, false, 39144, new Class[0], Void.TYPE);
            return;
        }
        this.g.a();
    }

    public final c a() {
        if (PatchProxy.isSupport(new Object[0], this, f43952a, false, 39143, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], this, f43952a, false, 39143, new Class[0], c.class);
        } else if (this.f43953b == null || this.f43954c == null) {
            throw new RuntimeException("please call createTask method create polling task!");
        } else if (this.f43955d > 0) {
            this.f43953b.removeCallbacks(this.f43954c);
            this.f43953b.post(this.f43954c);
            return this;
        } else {
            throw new RuntimeException("please set HeartBeatRate by setHearBeatRate method!");
        }
    }

    public final c a(b bVar) {
        this.f43956e = bVar;
        return this;
    }

    public final c a(int i) {
        if (PatchProxy.isSupport(new Object[]{1}, this, f43952a, false, 39142, new Class[]{Integer.TYPE}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{1}, this, f43952a, false, 39142, new Class[]{Integer.TYPE}, c.class);
        }
        this.f43955d = 1000;
        this.f43953b = new Handler();
        this.f43954c = new a(this);
        this.f43957f = new d(this, (byte) 0);
        this.g = new C0550c(this, (byte) 0);
        this.g.addObserver(this.f43957f);
        return this;
    }
}
