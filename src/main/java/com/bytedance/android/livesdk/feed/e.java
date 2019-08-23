package com.bytedance.android.livesdk.feed;

import com.bytedance.android.live.base.model.Extra;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.a.b;
import com.bytedance.android.live.core.utils.y;
import com.bytedance.android.livesdk.feed.d.c;
import com.bytedance.android.livesdk.feed.d.f;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.subjects.BehaviorSubject;
import io.reactivex.subjects.PublishSubject;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public final class e implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14093a;

    /* renamed from: b  reason: collision with root package name */
    Map<c, a> f14094b = new ConcurrentHashMap();

    /* renamed from: c  reason: collision with root package name */
    BehaviorSubject<Boolean> f14095c = BehaviorSubject.createDefault(Boolean.FALSE);

    /* renamed from: d  reason: collision with root package name */
    PublishSubject<c> f14096d = PublishSubject.create();

    /* renamed from: e  reason: collision with root package name */
    PublishSubject<Boolean> f14097e = PublishSubject.create();

    /* renamed from: f  reason: collision with root package name */
    private b<c, FeedItem> f14098f;
    private List<f> g = new LinkedList();
    private List<Object> h = new y();
    private boolean i;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public ItemRepository f14099a;

        /* renamed from: b  reason: collision with root package name */
        public int f14100b;

        private a(ItemRepository itemRepository) {
            this.f14099a = itemRepository;
        }

        /* synthetic */ a(ItemRepository itemRepository, byte b2) {
            this(itemRepository);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f14093a, false, 8416, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14093a, false, 8416, new Class[0], Void.TYPE);
        } else if (!this.i) {
            this.i = true;
            this.f14095c.onNext(Boolean.TRUE);
        }
    }

    public e(b<c, FeedItem> bVar) {
        this.f14098f = bVar;
    }

    public final void b(f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f14093a, false, 8419, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, f14093a, false, 8419, new Class[]{f.class}, Void.TYPE);
            return;
        }
        this.g.remove(fVar2);
    }

    public final ItemRepository a(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f14093a, false, 8414, new Class[]{c.class}, ItemRepository.class)) {
            return (ItemRepository) PatchProxy.accessDispatch(new Object[]{cVar2}, this, f14093a, false, 8414, new Class[]{c.class}, ItemRepository.class);
        }
        a aVar = this.f14094b.get(cVar2);
        if (aVar != null) {
            return aVar.f14099a;
        }
        return null;
    }

    public final void a(f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f14093a, false, 8418, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, f14093a, false, 8418, new Class[]{f.class}, Void.TYPE);
            return;
        }
        this.g.add(fVar2);
    }

    public final FeedItem b(c cVar, String str) {
        c cVar2 = cVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{cVar2, str2}, this, f14093a, false, 8410, new Class[]{c.class, String.class}, FeedItem.class)) {
            return (FeedItem) PatchProxy.accessDispatch(new Object[]{cVar2, str2}, this, f14093a, false, 8410, new Class[]{c.class, String.class}, FeedItem.class);
        }
        a aVar = this.f14094b.get(cVar2);
        FeedItem feedItem = null;
        if (aVar != null) {
            feedItem = aVar.f14099a.c(str2);
        }
        return feedItem;
    }

    public final void a(c cVar, ItemRepository itemRepository) {
        if (PatchProxy.isSupport(new Object[]{cVar, itemRepository}, this, f14093a, false, 8420, new Class[]{c.class, ItemRepository.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, itemRepository}, this, f14093a, false, 8420, new Class[]{c.class, ItemRepository.class}, Void.TYPE);
        } else if (cVar != null && itemRepository != null) {
            a aVar = this.f14094b.get(cVar);
            if (aVar == null) {
                aVar = new a(itemRepository, (byte) 0);
                this.f14094b.put(cVar, aVar);
                this.f14096d.onNext(cVar);
            }
            if (aVar.f14099a != itemRepository) {
                aVar.f14099a = itemRepository;
            }
            aVar.f14100b++;
        }
    }

    public final boolean b(c cVar, ItemRepository itemRepository) {
        if (PatchProxy.isSupport(new Object[]{cVar, itemRepository}, this, f14093a, false, 8421, new Class[]{c.class, ItemRepository.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{cVar, itemRepository}, this, f14093a, false, 8421, new Class[]{c.class, ItemRepository.class}, Boolean.TYPE)).booleanValue();
        } else if (cVar == null || itemRepository == null) {
            return false;
        } else {
            a aVar = this.f14094b.get(cVar);
            if (aVar != null) {
                aVar.f14100b--;
                if (aVar.f14100b <= 0) {
                    this.f14094b.remove(cVar);
                }
            }
            if (aVar == null || aVar.f14100b == 0) {
                return true;
            }
            return false;
        }
    }

    public final void a(c cVar, String str) {
        if (PatchProxy.isSupport(new Object[]{cVar, str}, this, f14093a, false, 8409, new Class[]{c.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar, str}, this, f14093a, false, 8409, new Class[]{c.class, String.class}, Void.TYPE);
            return;
        }
        a aVar = this.f14094b.get(cVar);
        if (aVar != null) {
            aVar.f14099a.b(str);
        }
        Iterator<Object> it2 = this.h.iterator();
        while (it2.hasNext()) {
            it2.next();
        }
    }

    public final void a(String str, List<FeedItem> list, Extra extra, boolean z) {
        String str2 = str;
        List<FeedItem> list2 = list;
        Extra extra2 = extra;
        if (PatchProxy.isSupport(new Object[]{str2, list2, extra2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f14093a, false, 8417, new Class[]{String.class, List.class, Extra.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, list2, extra2, Byte.valueOf(z)}, this, f14093a, false, 8417, new Class[]{String.class, List.class, Extra.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (Lists.notEmpty(this.g)) {
            for (f a2 : this.g) {
                a2.a(str2, list2, extra2, z);
            }
        }
    }
}
