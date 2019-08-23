package com.bytedance.android.livesdk.feed.adapter;

import android.os.Handler;
import android.os.Looper;
import android.support.annotation.NonNull;
import android.support.v4.util.Pair;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.paging.adapter.SimplePagingAdapter;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.live.core.utils.aj;
import com.bytedance.android.live.core.viewholder.a;
import com.bytedance.android.livesdk.feed.ItemRepository;
import com.bytedance.android.livesdk.feed.b;
import com.bytedance.android.livesdk.feed.d.c;
import com.bytedance.android.livesdk.feed.g;
import com.bytedance.common.utility.Lists;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.subjects.PublishSubject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class BaseFeedAdapter extends SimplePagingAdapter<FeedItem> {
    public static ChangeQuickRedirect o;
    private Map<String, Long> A;
    private Map<String, Long> B;
    private boolean C;
    public Handler p;
    public c q;
    Map<String, Long> r;
    public PublishSubject<Pair<FeedItem, Long>> s;
    public PublishSubject<FeedItem> t;
    public PublishSubject<Object> u;
    public PublishSubject<Object> v;
    public PublishSubject<Boolean> w;
    public PublishSubject<Object> x;
    public boolean y;
    private g z;

    static class ItemComparator extends DiffUtil.ItemCallback<FeedItem> {
        public /* bridge */ /* synthetic */ boolean areContentsTheSame(@NonNull Object obj, @NonNull Object obj2) {
            return false;
        }

        public /* bridge */ /* synthetic */ boolean areItemsTheSame(@NonNull Object obj, @NonNull Object obj2) {
            return false;
        }

        private ItemComparator() {
        }

        /* synthetic */ ItemComparator(byte b2) {
            this();
        }
    }

    public int b(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, o, false, 8471, new Class[]{Integer.TYPE}, Integer.TYPE)) {
            return -8888;
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, o, false, 8471, new Class[]{Integer.TYPE}, Integer.TYPE)).intValue();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 8481, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 8481, new Class[0], Void.TYPE);
            return;
        }
        a(this.r, false);
    }

    public final List<FeedItem> e() {
        if (!PatchProxy.isSupport(new Object[0], this, o, false, 8486, new Class[0], List.class)) {
            return this.z.a(this.q).f();
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, o, false, 8486, new Class[0], List.class);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 8477, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 8477, new Class[0], Void.TYPE);
            return;
        }
        this.p.removeCallbacksAndMessages(null);
        if (b.f13987b && ((Boolean) com.bytedance.android.livesdk.feed.j.b.f14215f.a()).booleanValue()) {
            this.x.onNext(i.f8107b);
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 8476, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 8476, new Class[0], Void.TYPE);
            return;
        }
        a(this.A, true);
        if (b.f13987b && ((Boolean) com.bytedance.android.livesdk.feed.j.b.f14215f.a()).booleanValue()) {
            this.x.onNext(i.f8107b);
        }
    }

    public final FeedItem c(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, o, false, 8487, new Class[]{Integer.TYPE}, FeedItem.class)) {
            return (FeedItem) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, o, false, 8487, new Class[]{Integer.TYPE}, FeedItem.class);
        }
        ItemRepository a2 = this.z.a(this.q);
        if (a2 != null && !Lists.isEmpty(a2.f()) && i >= 0 && i < a2.f().size() && e().get(i).item != null) {
            return a2.c(e().get(i).item.getMixId());
        }
        return null;
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, o, false, 8472, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, o, false, 8472, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewAttachedToWindow(viewHolder);
        if (!this.y) {
            int a2 = a(viewHolder.getAdapterPosition());
            if (a2 >= 0 && a2 < a(getItemCount())) {
                FeedItem feedItem = (FeedItem) getItem(a2);
                if (PatchProxy.isSupport(new Object[]{feedItem}, this, o, false, 8473, new Class[]{FeedItem.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{feedItem}, this, o, false, 8473, new Class[]{FeedItem.class}, Void.TYPE);
                } else if (feedItem != null && feedItem.item != null) {
                    String mixId = feedItem.item.getMixId();
                    if (!this.C) {
                        if (this.B == null) {
                            this.B = new HashMap();
                        }
                        this.B.put(mixId, -1L);
                    } else if (this.r.get(mixId) == null) {
                        this.r.put(mixId, Long.valueOf(aj.a()));
                    }
                }
            }
        }
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.ViewHolder viewHolder) {
        if (PatchProxy.isSupport(new Object[]{viewHolder}, this, o, false, 8475, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewHolder}, this, o, false, 8475, new Class[]{RecyclerView.ViewHolder.class}, Void.TYPE);
            return;
        }
        super.onViewDetachedFromWindow(viewHolder);
        int a2 = a(viewHolder.getAdapterPosition());
        if (a2 >= 0 && a2 < a(getItemCount())) {
            FeedItem feedItem = (FeedItem) getItem(a2);
            if (PatchProxy.isSupport(new Object[]{feedItem}, this, o, false, 8474, new Class[]{FeedItem.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{feedItem}, this, o, false, 8474, new Class[]{FeedItem.class}, Void.TYPE);
            } else if (feedItem != null && feedItem.item != null) {
                String mixId = feedItem.item.getMixId();
                if (this.r.get(mixId) != null) {
                    long longValue = this.r.get(mixId).longValue();
                    Long l = this.A.get(mixId);
                    if (l == null) {
                        l = 0L;
                    }
                    this.A.put(mixId, Long.valueOf(l.longValue() + (aj.a() - longValue)));
                    this.r.remove(mixId);
                }
            }
        }
    }

    public final void a(boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z2 ? (byte) 1 : 0)}, this, o, false, 8480, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z2)}, this, o, false, 8480, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.C = z2;
        if (!z2) {
            a(this.r, false);
        } else if (!(this.B == null || this.B.size() == 0)) {
            long a2 = aj.a();
            for (Map.Entry<String, Long> key : this.B.entrySet()) {
                this.r.put((String) key.getKey(), Long.valueOf(a2));
            }
            this.B.clear();
            this.B = null;
        }
        this.w.onNext(Boolean.valueOf(z2));
    }

    public BaseFeedAdapter(Map<Integer, a> map, g gVar) {
        this(new ItemComparator((byte) 0), map, gVar);
    }

    private void a(String str, long j) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, new Long(j2)}, this, o, false, 8485, new Class[]{String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, new Long(j2)}, this, o, false, 8485, new Class[]{String.class, Long.TYPE}, Void.TYPE);
            return;
        }
        if (j2 > 0 && j2 >= 50) {
            FeedItem b2 = this.z.b(this.q, str);
            if (b2 != null) {
                this.s.onNext(new Pair(b2, Long.valueOf(j)));
            }
        }
    }

    public final /* synthetic */ int a(int i, Object obj) {
        FeedItem feedItem = (FeedItem) obj;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), feedItem}, this, o, false, 8469, new Class[]{Integer.TYPE, FeedItem.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), feedItem}, this, o, false, 8469, new Class[]{Integer.TYPE, FeedItem.class}, Integer.TYPE)).intValue();
        }
        if (PatchProxy.isSupport(new Object[]{feedItem}, this, o, false, 8470, new Class[]{FeedItem.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{feedItem}, this, o, false, 8470, new Class[]{FeedItem.class}, Integer.TYPE)).intValue();
        } else if (feedItem == null) {
            return -8888;
        } else {
            return b(feedItem.type);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(Map<String, Long> map, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{map, Byte.valueOf(z2 ? (byte) 1 : 0)}, this, o, false, 8484, new Class[]{Map.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{map, Byte.valueOf(z2)}, this, o, false, 8484, new Class[]{Map.class, Boolean.TYPE}, Void.TYPE);
        } else if (map == null || map.size() == 0) {
        } else {
            for (Map.Entry next : map.entrySet()) {
                String str = (String) next.getKey();
                long longValue = ((Long) next.getValue()).longValue();
                if (!z2 && longValue > 0) {
                    longValue = aj.a() - longValue;
                }
                a(str, longValue);
            }
            map.clear();
        }
    }

    private BaseFeedAdapter(DiffUtil.ItemCallback<FeedItem> itemCallback, Map<Integer, a> map, g gVar) {
        super(itemCallback, map);
        this.p = new Handler(Looper.getMainLooper());
        this.s = PublishSubject.create();
        this.t = PublishSubject.create();
        this.u = PublishSubject.create();
        this.v = PublishSubject.create();
        this.w = PublishSubject.create();
        this.x = PublishSubject.create();
        this.C = true;
        this.z = gVar;
        this.r = new HashMap();
        this.A = new HashMap();
        this.t.subscribe(new a(this), b.f13951a);
    }
}
