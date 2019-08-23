package com.ss.android.ugc.aweme.tools;

import android.support.v4.util.Pools;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final class ai extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74615a;

    /* renamed from: d  reason: collision with root package name */
    private static final Pools.SimplePool<ai> f74616d = new Pools.SimplePool<>(1);

    /* renamed from: b  reason: collision with root package name */
    public List f74617b;

    /* renamed from: c  reason: collision with root package name */
    public long f74618c;

    private ai() {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f74615a, false, 86982, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74615a, false, 86982, new Class[0], Void.TYPE);
            return;
        }
        f74616d.release(this);
    }

    public final String toString() {
        if (PatchProxy.isSupport(new Object[0], this, f74615a, false, 86983, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f74615a, false, 86983, new Class[0], String.class);
        }
        return "RecordingProgressUpdateEvent{timeSpeedModels=" + this.f74617b + ", elapsedTimeInMicros=" + this.f74618c + '}';
    }

    public static ai a(List list, long j) {
        List list2 = list;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{list2, new Long(j2)}, null, f74615a, true, 86981, new Class[]{List.class, Long.TYPE}, ai.class)) {
            return (ai) PatchProxy.accessDispatch(new Object[]{list2, new Long(j2)}, null, f74615a, true, 86981, new Class[]{List.class, Long.TYPE}, ai.class);
        }
        ai aiVar = (ai) f74616d.acquire();
        if (aiVar == null) {
            aiVar = new ai();
        }
        aiVar.f74617b = list2;
        aiVar.f74618c = j2;
        return aiVar;
    }
}
