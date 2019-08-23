package com.bytedance.android.livesdk.feed.f;

import android.arch.lifecycle.Observer;
import android.arch.paging.PagedList;
import android.os.Bundle;
import android.support.annotation.NonNull;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.paging.b;
import com.bytedance.android.livesdk.feed.d.c;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.g.g;
import com.bytedance.android.livesdkapi.g.i;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;

public final class a extends g implements i {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14107a;

    /* renamed from: b  reason: collision with root package name */
    PagedList<FeedItem> f14108b = null;

    /* renamed from: c  reason: collision with root package name */
    final PagedList.Callback f14109c = new PagedList.Callback() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f14112a;

        private void a() {
            if (PatchProxy.isSupport(new Object[0], this, f14112a, false, 8701, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f14112a, false, 8701, new Class[0], Void.TYPE);
                return;
            }
            a.this.a();
            a.this.e();
        }

        public final void onChanged(int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f14112a, false, 8698, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f14112a, false, 8698, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            a();
        }

        public final void onInserted(int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f14112a, false, 8699, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f14112a, false, 8699, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            a();
        }

        public final void onRemoved(int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f14112a, false, 8700, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f14112a, false, 8700, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            a();
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private final FeedRepository f14110d;

    /* renamed from: e  reason: collision with root package name */
    private final List<Bundle> f14111e = new ArrayList();
    private final List<Room> g = new ArrayList();
    private final Observer<PagedList<FeedItem>> h = new b(this);

    @NonNull
    public final List<Room> d() {
        return this.g;
    }

    public final int b() {
        if (!PatchProxy.isSupport(new Object[0], this, f14107a, false, 8688, new Class[0], Integer.TYPE)) {
            return this.f14111e.size();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f14107a, false, 8688, new Class[0], Integer.TYPE)).intValue();
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f14107a, false, 8693, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14107a, false, 8693, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.f14110d == null || this.f14110d.i() == null)) {
            this.f14110d.i().a().removeObserver(this.h);
        }
        if (this.f14108b != null) {
            this.f14108b.removeWeakCallback(this.f14109c);
            this.f14108b = null;
        }
        this.f14111e.clear();
        this.g.clear();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f14107a, false, 8687, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14107a, false, 8687, new Class[0], Void.TYPE);
            return;
        }
        this.f14111e.clear();
        this.g.clear();
        if (this.f14110d != null && !Lists.isEmpty(this.f14110d.f())) {
            for (FeedItem feedItem : this.f14110d.f()) {
                if (feedItem.item instanceof Room) {
                    this.f14111e.add(com.bytedance.android.livesdkapi.g.a.a((Room) feedItem.item));
                    this.g.add((Room) feedItem.item);
                }
            }
        }
    }

    public final int a(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f14107a, false, 8689, new Class[]{Bundle.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{bundle}, this, f14107a, false, 8689, new Class[]{Bundle.class}, Integer.TYPE)).intValue();
        }
        long j = bundle.getLong("live.intent.extra.ROOM_ID", -1);
        for (int i = 0; i < this.f14111e.size(); i++) {
            if (this.f14111e.get(i).getLong("live.intent.extra.ROOM_ID", 0) == j) {
                return i;
            }
        }
        return -1;
    }

    public final int b(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f14107a, false, 8694, new Class[]{Long.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f14107a, false, 8694, new Class[]{Long.TYPE}, Integer.TYPE)).intValue();
        }
        for (int i = 0; i < this.f14111e.size(); i++) {
            if (this.f14111e.get(i).getLong("live.intent.extra.ROOM_ID") == j) {
                return i;
            }
        }
        return 0;
    }

    public final Bundle a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f14107a, false, 8686, new Class[]{Integer.TYPE}, Bundle.class)) {
            return this.f14111e.get(i);
        }
        return (Bundle) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f14107a, false, 8686, new Class[]{Integer.TYPE}, Bundle.class);
    }

    public final void b(int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f14107a, false, 8690, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f14107a, false, 8690, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f14110d != null) {
            b i3 = this.f14110d.i();
            if (i3 != null) {
                Boolean bool = (Boolean) i3.d().getValue();
                if (bool != null && bool.booleanValue()) {
                    this.f14110d.a(null, "detail_loadmore");
                    if (!(this.f14110d.i() == null || this.f14110d.i().a().getValue() == null || ((PagedList) this.f14110d.i().a().getValue()).isEmpty())) {
                        PagedList pagedList = (PagedList) this.f14110d.i().a().getValue();
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f14107a, false, 8691, new Class[]{Integer.TYPE}, Integer.TYPE)) {
                            i2 = ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f14107a, false, 8691, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
                        } else if (this.f14108b == null || this.f14108b.size() <= 0) {
                            i2 = i + 6;
                        } else {
                            i2 = this.f14108b.size();
                        }
                        pagedList.loadAround(i2);
                    }
                }
            }
        }
    }

    public final void c(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f14107a, false, 8695, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f14107a, false, 8695, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        if (this.f14110d != null) {
            FeedItem c2 = this.f14110d.c(String.valueOf(j));
            if (c2 != null) {
                int indexOf = this.f14110d.f().indexOf(c2);
                if (!(indexOf < 0 || this.f14110d.j() == null || this.f14110d.j().f14068b == null)) {
                    ((com.bytedance.android.livesdk.feed.d.b) this.f14110d.j().f14068b).f14069a.setValue(Integer.valueOf(indexOf));
                }
            }
        }
    }

    public final void a(long j) {
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f14107a, false, 8692, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f14107a, false, 8692, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        if (this.f14110d != null) {
            this.f14110d.b(String.valueOf(j));
        }
    }

    public a(c cVar, com.bytedance.android.livesdk.feed.g gVar) {
        this.f14110d = (FeedRepository) gVar.a(cVar);
        a();
        if (this.f14110d != null && this.f14110d.i() != null) {
            this.f14110d.i().a().observeForever(this.h);
        }
    }

    public final void a(int i, FeedItem feedItem) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), feedItem}, this, f14107a, false, 8696, new Class[]{Integer.TYPE, FeedItem.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), feedItem}, this, f14107a, false, 8696, new Class[]{Integer.TYPE, FeedItem.class}, Void.TYPE);
        } else if (feedItem != null && i < this.f14111e.size() && i >= 0) {
            FeedItem c2 = this.f14110d.c(String.valueOf(a(i).getLong("live.intent.extra.ROOM_ID")));
            if (c2 != null) {
                int b2 = this.f14110d.i().b(c2);
                c2.banners = feedItem.banners;
                c2.data = feedItem.data;
                c2.item = feedItem.item;
                c2.logPb = feedItem.logPb;
                c2.object = feedItem.object;
                c2.orderType = feedItem.orderType;
                c2.repeatDisable = feedItem.repeatDisable;
                c2.resId = feedItem.resId;
                c2.searchId = feedItem.searchId;
                c2.tags = feedItem.tags;
                c2.searchReqId = feedItem.searchReqId;
                c2.type = feedItem.type;
                this.f14110d.i().a(b2);
            }
        }
    }
}
