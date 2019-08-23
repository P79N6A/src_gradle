package com.bytedance.android.livesdk.gift;

import android.os.SystemClock;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.live.utility.b;
import com.bytedance.android.livesdk.gift.domain.api.PropApi;
import com.bytedance.android.livesdk.gift.model.Prop;
import com.bytedance.android.livesdkapi.host.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class q {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f15399a;

    /* renamed from: e  reason: collision with root package name */
    private static q f15400e;

    /* renamed from: b  reason: collision with root package name */
    public final List<Prop> f15401b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final List<a> f15402c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    boolean f15403d = false;

    public interface a {
        void a(List<Prop> list);
    }

    private q() {
    }

    public static synchronized q a() {
        synchronized (q.class) {
            if (PatchProxy.isSupport(new Object[0], null, f15399a, true, 9304, new Class[0], q.class)) {
                q qVar = (q) PatchProxy.accessDispatch(new Object[0], null, f15399a, true, 9304, new Class[0], q.class);
                return qVar;
            }
            if (f15400e == null) {
                f15400e = new q();
            }
            q qVar2 = f15400e;
            return qVar2;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f15399a, false, 9307, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f15399a, false, 9307, new Class[0], Void.TYPE);
        } else if (!this.f15403d) {
            this.f15403d = true;
            ((PropApi) ((h) b.a(h.class)).c().create(PropApi.class)).getPropList().compose(i.a()).subscribe(new r(this, SystemClock.uptimeMillis()), new s(this), new t(this));
        }
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f15399a, false, 9311, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f15399a, false, 9311, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Set set = (Set) com.bytedance.android.livesdk.w.b.K.a();
        for (Prop next : this.f15401b) {
            if (next.reddotTip && !set.contains(Long.valueOf(next.id))) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        if (PatchProxy.isSupport(new Object[0], this, f15399a, false, 9310, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f15399a, false, 9310, new Class[0], Boolean.TYPE)).booleanValue();
        } else if ((System.currentTimeMillis() / 86400000) - (((Long) com.bytedance.android.livesdk.w.b.p.a()).longValue() / 86400000) < 1) {
            return false;
        } else {
            for (Prop next : this.f15401b) {
                if (next.nextExpire > 0 && next.nextExpire - ((System.currentTimeMillis() / 1000) + next.getNowTimeDiff()) < 86400) {
                    com.bytedance.android.livesdk.w.b.p.a(Long.valueOf(System.currentTimeMillis()));
                    return true;
                }
            }
            return false;
        }
    }

    public final Prop a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f15399a, false, 9306, new Class[]{Long.TYPE}, Prop.class)) {
            return (Prop) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f15399a, false, 9306, new Class[]{Long.TYPE}, Prop.class);
        }
        for (Prop next : this.f15401b) {
            if (next.id == j2) {
                return next;
            }
        }
        return null;
    }

    public final void a(List<Prop> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f15399a, false, 9305, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f15399a, false, 9305, new Class[]{List.class}, Void.TYPE);
        } else if (!list.isEmpty()) {
            for (Prop next : list) {
                Prop a2 = a(next.id);
                if (a2 != null) {
                    this.f15401b.set(this.f15401b.indexOf(a2), next);
                }
            }
            for (a a3 : this.f15402c) {
                a3.a(this.f15401b);
            }
        }
    }
}
