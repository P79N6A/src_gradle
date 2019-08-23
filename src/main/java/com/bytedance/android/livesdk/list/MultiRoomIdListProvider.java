package com.bytedance.android.livesdk.list;

import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.livesdk.chatroom.bl.h;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.g.a;
import com.bytedance.android.livesdkapi.g.g;
import com.bytedance.common.utility.Lists;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MultiRoomIdListProvider extends g implements LifecycleObserver {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f1861a;

    /* renamed from: b  reason: collision with root package name */
    List<Long> f1862b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    List<Room> f1863c;

    /* renamed from: d  reason: collision with root package name */
    Bundle f1864d;

    /* renamed from: e  reason: collision with root package name */
    private final List<Bundle> f1865e = new ArrayList();
    private Disposable g;

    public final void a(int i, FeedItem feedItem) {
    }

    public final void b(int i) {
    }

    public final int b() {
        if (!PatchProxy.isSupport(new Object[0], this, f1861a, false, 10229, new Class[0], Integer.TYPE)) {
            return this.f1862b.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f1861a, false, 10229, new Class[0], Integer.TYPE)).intValue();
    }

    @NonNull
    public final List<Room> d() {
        if (!PatchProxy.isSupport(new Object[0], this, f1861a, false, 10227, new Class[0], List.class)) {
            return new ArrayList();
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, f1861a, false, 10227, new Class[0], List.class);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f1861a, false, 10225, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f1861a, false, 10225, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.dispose();
            this.g = null;
        }
    }

    public final int a(Bundle bundle) {
        Bundle bundle2 = bundle;
        if (PatchProxy.isSupport(new Object[]{bundle2}, this, f1861a, false, 10230, new Class[]{Bundle.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{bundle2}, this, f1861a, false, 10230, new Class[]{Bundle.class}, Integer.TYPE)).intValue();
        }
        return this.f1862b.indexOf(Long.valueOf(bundle2.getLong("live.intent.extra.ROOM_ID")));
    }

    public final Bundle a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f1861a, false, 10228, new Class[]{Integer.TYPE}, Bundle.class)) {
            return (Bundle) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f1861a, false, 10228, new Class[]{Integer.TYPE}, Bundle.class);
        } else if (!CollectionUtils.isEmpty(this.f1865e) && this.f1865e.size() > i) {
            return this.f1865e.get(i);
        } else {
            Bundle bundle = new Bundle(this.f1864d);
            if (i >= 0 && i < this.f1862b.size()) {
                bundle.putLong("live.intent.extra.ROOM_ID", this.f1862b.get(i).longValue());
            }
            return bundle;
        }
    }

    public final void a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f1861a, false, 10226, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f1861a, false, 10226, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        Iterator<Long> it2 = this.f1862b.iterator();
        while (it2.hasNext()) {
            if (it2.next().longValue() == j2) {
                it2.remove();
                return;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(List<Room> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f1861a, false, 10224, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f1861a, false, 10224, new Class[]{List.class}, Void.TYPE);
            return;
        }
        this.f1865e.clear();
        if (!Lists.isEmpty(list)) {
            for (Room a2 : list) {
                this.f1865e.add(a.a(a2));
            }
        }
    }

    public MultiRoomIdListProvider(Lifecycle lifecycle, long[] jArr, Bundle bundle) {
        this.f1864d = bundle;
        for (long valueOf : jArr) {
            this.f1862b.add(Long.valueOf(valueOf));
        }
        lifecycle.addObserver(this);
        if (jArr != null) {
            this.g = h.a().a(jArr).observeOn(AndroidSchedulers.mainThread()).subscribe(new a(this), b.f15774b);
        }
    }
}
