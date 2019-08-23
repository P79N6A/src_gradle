package com.bytedance.android.livesdk.feed.f;

import android.os.Bundle;
import android.support.annotation.NonNull;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.g.a;
import com.bytedance.android.livesdkapi.g.g;
import com.bytedance.android.livesdkapi.g.i;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public final class c extends g implements i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14116a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Bundle> f14117b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final List<Room> f14118c = new ArrayList();

    public final void a(int i, FeedItem feedItem) {
    }

    public final void b(int i) {
    }

    public final void c(long j) {
    }

    @NonNull
    public final List<Room> d() {
        return this.f14118c;
    }

    public final int b() {
        if (!PatchProxy.isSupport(new Object[0], this, f14116a, false, 8704, new Class[0], Integer.TYPE)) {
            return this.f14117b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f14116a, false, 8704, new Class[0], Integer.TYPE)).intValue();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f14116a, false, 8706, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14116a, false, 8706, new Class[0], Void.TYPE);
            return;
        }
        super.c();
        this.f14117b.clear();
        this.f14118c.clear();
    }

    public c(List<Room> list) {
        a(list);
    }

    private void a(List<Room> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f14116a, false, 8702, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f14116a, false, 8702, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f14117b.clear();
        this.f14118c.clear();
        if (!Lists.isEmpty(list)) {
            this.f14118c.addAll(list);
            for (Room a2 : list) {
                this.f14117b.add(a.a(a2));
            }
        }
    }

    public final int a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (!PatchProxy.isSupport(new Object[]{bundle2}, this, f14116a, false, 8707, new Class[]{Bundle.class}, Integer.TYPE)) {
            return this.f14117b.indexOf(bundle2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{bundle2}, this, f14116a, false, 8707, new Class[]{Bundle.class}, Integer.TYPE)).intValue();
    }

    public final Bundle a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f14116a, false, 8703, new Class[]{Integer.TYPE}, Bundle.class)) {
            return this.f14117b.get(i);
        }
        return (Bundle) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f14116a, false, 8703, new Class[]{Integer.TYPE}, Bundle.class);
    }

    public final void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f14116a, false, 8705, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f14116a, false, 8705, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        for (int i = 0; i < this.f14117b.size(); i++) {
            if (this.f14118c.get(i).getId() == j) {
                this.f14117b.remove(i);
                this.f14118c.remove(i);
                e();
                return;
            }
        }
    }
}
