package com.bytedance.android.livesdk.chatroom.interact.a;

import com.bytedance.android.livesdk.chatroom.interact.a.h;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.utils.b.b;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10262a;

    /* renamed from: f  reason: collision with root package name */
    private static a f10263f;

    /* renamed from: b  reason: collision with root package name */
    public final List<h.a> f10264b = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    final int f10265c = ((((Integer) LiveConfigSettingKeys.PK_AUTO_MATCH_TIME.a()).intValue() / 3) + 1);

    /* renamed from: d  reason: collision with root package name */
    Disposable f10266d;

    /* renamed from: e  reason: collision with root package name */
    boolean f10267e;

    public final boolean c() {
        return this.f10267e;
    }

    private a() {
    }

    public static synchronized a a() {
        synchronized (a.class) {
            if (PatchProxy.isSupport(new Object[0], null, f10262a, true, 4602, new Class[0], a.class)) {
                a aVar = (a) PatchProxy.accessDispatch(new Object[0], null, f10262a, true, 4602, new Class[0], a.class);
                return aVar;
            }
            if (f10263f == null) {
                f10263f = new a();
            }
            a aVar2 = f10263f;
            return aVar2;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f10262a, false, 4604, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10262a, false, 4604, new Class[0], Void.TYPE);
            return;
        }
        if (this.f10267e) {
            this.f10267e = false;
            if (this.f10266d != null) {
                this.f10266d.dispose();
                this.f10266d = null;
            }
            j.q().d().b().cancleMatch().subscribeOn(Schedulers.io()).subscribe(d.f10274b, e.f10276b);
            for (h.a c2 : this.f10264b) {
                if (c2.c()) {
                    break;
                }
            }
        }
    }

    public final void a(h.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f10262a, false, 4607, new Class[]{h.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f10262a, false, 4607, new Class[]{h.a.class}, Void.TYPE);
        } else if (aVar != null && this.f10264b.contains(aVar)) {
            this.f10264b.remove(aVar);
        }
    }

    public final void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f10262a, false, 4603, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f10262a, false, 4603, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.f10267e = true;
        for (h.a a2 : this.f10264b) {
            if (a2.a()) {
                break;
            }
        }
        if (this.f10266d != null) {
            this.f10266d.dispose();
            this.f10266d = null;
        }
        this.f10266d = b.a(0, 3, TimeUnit.SECONDS).take((long) (this.f10265c + 1)).map(new b(this)).observeOn(AndroidSchedulers.mainThread()).subscribe((Consumer<? super T>) new c<Object>(this, j));
    }

    public final void a(h.a aVar, int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{aVar, Integer.valueOf(i)}, this, f10262a, false, 4606, new Class[]{h.a.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar, Integer.valueOf(i)}, this, f10262a, false, 4606, new Class[]{h.a.class, Integer.TYPE}, Void.TYPE);
        } else if (aVar != null) {
            if (this.f10264b.size() < i) {
                i2 = this.f10264b.size();
            } else {
                i2 = i;
            }
            this.f10264b.add(i2, aVar);
        }
    }
}
