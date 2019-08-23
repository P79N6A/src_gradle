package com.bytedance.android.livesdk.feed;

import android.app.Activity;
import android.arch.lifecycle.Lifecycle;
import android.arch.lifecycle.LifecycleObserver;
import android.arch.lifecycle.OnLifecycleEvent;
import android.content.Context;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.uikit.refresh.b;
import com.bytedance.android.livesdk.feed.adapter.BaseFeedAdapter;
import com.bytedance.android.livesdk.feed.g.b;
import com.bytedance.android.livesdk.feed.l.c;
import com.bytedance.android.livesdk.feed.roomdetector.a;
import com.bytedance.android.livesdk.feed.roomdetector.e;
import com.bytedance.android.livesdkapi.depend.d.g;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.f;
import com.bytedance.common.utility.NetworkUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import java.util.HashMap;
import java.util.LinkedHashMap;

public abstract class BaseFeedRoomPlayComponent implements LifecycleObserver, g.c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f1849a;

    /* renamed from: b  reason: collision with root package name */
    public final String f1850b;

    /* renamed from: c  reason: collision with root package name */
    protected final RecyclerView f1851c;

    /* renamed from: d  reason: collision with root package name */
    protected final RecyclerView.LayoutManager f1852d;

    /* renamed from: e  reason: collision with root package name */
    protected final BaseFeedAdapter f1853e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    protected final BannerSwipeRefreshLayout f1854f;
    protected final View g;
    protected final TextureView h;
    protected final g i;
    protected final Activity j;
    protected com.bytedance.android.livesdk.feed.roomdetector.a k;
    protected IPerspectiveWindowScrollListener l;
    protected boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    private boolean q;
    private final RecyclerView.AdapterDataObserver r = new RecyclerView.AdapterDataObserver() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13913a;

        public void onChanged() {
            if (PatchProxy.isSupport(new Object[0], this, f13913a, false, 8374, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f13913a, false, 8374, new Class[0], Void.TYPE);
                return;
            }
            super.onChanged();
            a(true);
        }

        private void a(boolean z) {
            boolean z2;
            boolean z3 = true;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f13913a, false, 8378, new Class[]{Boolean.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f13913a, false, 8378, new Class[]{Boolean.TYPE}, Void.TYPE);
                return;
            }
            if (BaseFeedRoomPlayComponent.this.l == null || BaseFeedRoomPlayComponent.this.l.f13926c <= 0) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (BaseFeedRoomPlayComponent.this.f1853e.getItemCount() > 0) {
                z3 = false;
            }
            if (z2 && z3) {
                BaseFeedRoomPlayComponent.this.c(false);
            } else if (z2 || z3) {
                if (z2 && z) {
                    BaseFeedRoomPlayComponent.this.c(false);
                    BaseFeedRoomPlayComponent.this.d();
                }
            } else {
                BaseFeedRoomPlayComponent.this.d();
            }
        }

        public void onItemRangeInserted(int i, int i2) {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f13913a, false, 8375, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f13913a, false, 8375, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.onItemRangeInserted(i, i2);
            if (i <= BaseFeedRoomPlayComponent.this.l.f13925b) {
                z = true;
            }
            a(z);
        }

        public void onItemRangeRemoved(int i, int i2) {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f13913a, false, 8377, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f13913a, false, 8377, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.onItemRangeRemoved(i, i2);
            if (i <= BaseFeedRoomPlayComponent.this.l.f13925b) {
                z = true;
            }
            a(z);
        }

        public void onItemRangeMoved(int i, int i2, int i3) {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f13913a, false, 8376, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f13913a, false, 8376, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.onItemRangeMoved(i, i2, i3);
            if (i <= BaseFeedRoomPlayComponent.this.l.f13925b || i2 <= BaseFeedRoomPlayComponent.this.l.f13925b) {
                z = true;
            }
            a(z);
        }
    };
    private final Runnable s = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13915a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f13915a, false, 8379, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f13915a, false, 8379, new Class[0], Void.TYPE);
                return;
            }
            if (!(!BaseFeedRoomPlayComponent.this.m || !BaseFeedRoomPlayComponent.this.n || BaseFeedRoomPlayComponent.this.f1851c == null || BaseFeedRoomPlayComponent.this.f1851c.getAdapter() == null || BaseFeedRoomPlayComponent.this.f1851c.getAdapter().getItemCount() == 0 || !BaseFeedRoomPlayComponent.this.b() || BaseFeedRoomPlayComponent.this.l == null)) {
                BaseFeedRoomPlayComponent.this.l.onScrollStateChanged(BaseFeedRoomPlayComponent.this.f1851c, 0);
            }
        }
    };

    public abstract class IPerspectiveWindowScrollListener extends RecyclerView.OnScrollListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f13924a;

        /* renamed from: b  reason: collision with root package name */
        int f13925b = -1;

        /* renamed from: c  reason: collision with root package name */
        long f13926c = -1;

        /* renamed from: d  reason: collision with root package name */
        protected LinkedHashMap<Long, Long> f13927d = new LinkedHashMap<>();

        /* renamed from: e  reason: collision with root package name */
        protected LinkedHashMap<Long, Long> f13928e = new LinkedHashMap<>();

        /* renamed from: f  reason: collision with root package name */
        protected LinkedHashMap<Long, Long> f13929f = new LinkedHashMap<>();

        public abstract int a(boolean z);

        public abstract void a(int i, int i2);

        public abstract void b();

        public void d() {
        }

        public abstract void f();

        public void g() {
        }

        public int[] c() {
            return new int[]{-1, -1};
        }

        public void a() {
            if (PatchProxy.isSupport(new Object[0], this, f13924a, false, 8386, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f13924a, false, 8386, new Class[0], Void.TYPE);
                return;
            }
            this.f13925b = -1;
            this.f13926c = -1;
            if (BaseFeedRoomPlayComponent.this.g != null) {
                BaseFeedRoomPlayComponent.this.g.setVisibility(4);
            }
            BaseFeedRoomPlayComponent.this.b(false);
        }

        /* access modifiers changed from: package-private */
        public final Room e() {
            if (PatchProxy.isSupport(new Object[0], this, f13924a, false, 8387, new Class[0], Room.class)) {
                return (Room) PatchProxy.accessDispatch(new Object[0], this, f13924a, false, 8387, new Class[0], Room.class);
            }
            FeedItem c2 = BaseFeedRoomPlayComponent.this.f1853e.c(this.f13925b);
            if (c2 == null || c2.type != 1) {
                return null;
            }
            return (Room) c2.item;
        }

        public final void h() {
            if (PatchProxy.isSupport(new Object[0], this, f13924a, false, 8393, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f13924a, false, 8393, new Class[0], Void.TYPE);
                return;
            }
            this.f13927d.clear();
            this.f13928e.clear();
            this.f13929f.clear();
        }

        public void a(int[] iArr) {
            if (BaseFeedRoomPlayComponent.this.m && BaseFeedRoomPlayComponent.this.n && iArr[1] >= 0) {
            }
        }

        IPerspectiveWindowScrollListener() {
        }

        /* access modifiers changed from: package-private */
        public final Room a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f13924a, false, 8388, new Class[]{Integer.TYPE}, Room.class)) {
                return (Room) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f13924a, false, 8388, new Class[]{Integer.TYPE}, Room.class);
            }
            FeedItem c2 = BaseFeedRoomPlayComponent.this.f1853e.c(i);
            if (c2 == null || c2.type != 1) {
                return null;
            }
            return (Room) c2.item;
        }

        private void a(Room room) {
            if (PatchProxy.isSupport(new Object[]{room}, this, f13924a, false, 8392, new Class[]{Room.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{room}, this, f13924a, false, 8392, new Class[]{Room.class}, Void.TYPE);
                return;
            }
            if (room != null) {
                HashMap hashMap = new HashMap();
                if (c.c() || c.d()) {
                    hashMap.put("enter_from_merge", "live_" + BaseFeedRoomPlayComponent.this.f1850b);
                } else {
                    hashMap.put("enter_from_merge", "live_merge");
                }
                hashMap.put("enter_method", "live_cover");
                hashMap.put("anchor_id", String.valueOf(room.getOwnerUserId()));
                hashMap.put("request_id", String.valueOf(room.getRequestId()));
                hashMap.put("room_id", String.valueOf(room.getId()));
                hashMap.put("is_success", PushConstants.PUSH_TYPE_NOTIFY);
                hashMap.put("time", String.valueOf(SystemClock.currentThreadTimeMillis() - BaseFeedRoomPlayComponent.this.l.f13929f.get(Long.valueOf(room.getId())).longValue()));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live");
                hashMap.put("event_type", "other");
                hashMap.put("event_module", BaseFeedRoomPlayComponent.this.f1850b);
                b.a().a("live_window_show_start", hashMap);
            }
        }

        /* access modifiers changed from: package-private */
        public final void b(int i) {
            g.d a2;
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f13924a, false, 8391, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f13924a, false, 8391, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (BaseFeedRoomPlayComponent.this.m && BaseFeedRoomPlayComponent.this.n) {
                if (BaseFeedRoomPlayComponent.this.i != null) {
                    BaseFeedRoomPlayComponent.this.i.c(true);
                }
                if (i2 == this.f13925b) {
                    FeedItem c2 = BaseFeedRoomPlayComponent.this.f1853e.c(this.f13925b);
                    if (c2 == null || c2.type != 1) {
                        this.f13926c = 0;
                    } else {
                        Room room = (Room) c2.item;
                        this.f13926c = room.getId();
                        if (!BaseFeedRoomPlayComponent.this.a(room)) {
                            BaseFeedRoomPlayComponent.this.i.d(BaseFeedRoomPlayComponent.this.h.getContext());
                            if (BaseFeedRoomPlayComponent.this.g != null) {
                                BaseFeedRoomPlayComponent.this.g.setVisibility(4);
                            }
                            BaseFeedRoomPlayComponent.this.e();
                            BaseFeedRoomPlayComponent.this.b(false);
                            return;
                        } else if (BaseFeedRoomPlayComponent.this.i.f() && room.isPullUrlValid() && TextUtils.equals(BaseFeedRoomPlayComponent.this.i.h(), room.buildPullUrl())) {
                            if (!(BaseFeedRoomPlayComponent.this.g == null || BaseFeedRoomPlayComponent.this.g.getVisibility() == 0)) {
                                if (BaseFeedRoomPlayComponent.this.i.g()) {
                                    BaseFeedRoomPlayComponent.this.b(true);
                                    BaseFeedRoomPlayComponent.this.c(room);
                                    BaseFeedRoomPlayComponent.this.g.setVisibility(0);
                                    int e2 = BaseFeedRoomPlayComponent.this.i.e();
                                    a(65535 & e2, e2 >> 16);
                                } else {
                                    return;
                                }
                            }
                            b();
                            return;
                        }
                    }
                }
                BaseFeedRoomPlayComponent.this.g.setVisibility(4);
                d();
                this.f13925b = i2;
                BaseFeedRoomPlayComponent.this.e();
                FeedItem c3 = BaseFeedRoomPlayComponent.this.f1853e.c(this.f13925b);
                if (c3 == null || c3.type != 1) {
                    this.f13926c = 0;
                    return;
                }
                Room room2 = (Room) c3.item;
                this.f13926c = room2.getId();
                if (!NetworkUtils.isWifi(ac.e())) {
                    if (b.f13989d && NetworkUtils.getNetworkType(ac.e()) != NetworkUtils.NetworkType.MOBILE_4G) {
                        return;
                    }
                    if (c.c() && !com.bytedance.android.livesdk.feed.b.b.c().b().a().a()) {
                        return;
                    }
                    if (!b.f13987b) {
                        if (((float) (System.currentTimeMillis() - ((Long) com.bytedance.android.livesdkapi.e.a.f18750e.a()).longValue())) > ((Float) com.bytedance.android.livesdk.feed.j.b.f14210a.a()).floatValue() * 8.64E7f) {
                            com.bytedance.android.live.uikit.d.a.a((Context) BaseFeedRoomPlayComponent.this.j, (int) C0906R.string.cww);
                            com.bytedance.android.livesdkapi.e.a.f18750e.a(Long.valueOf(System.currentTimeMillis()));
                        }
                    }
                }
                if (room2.getStatus() == 4 || room2.getMosaicStatus() != 0 || !room2.isPullUrlValid() || room2.isLiveTypeAudio()) {
                    BaseFeedRoomPlayComponent.this.i.d(BaseFeedRoomPlayComponent.this.h.getContext());
                    return;
                }
                f.a aVar = room2.getStreamUrlExtraSafely().o;
                try {
                    g gVar = BaseFeedRoomPlayComponent.this.i;
                    String buildPullUrl = room2.buildPullUrl();
                    TextureView textureView = BaseFeedRoomPlayComponent.this.h;
                    int ordinal = room2.getStreamType().ordinal();
                    if (aVar == null) {
                        a2 = null;
                    } else {
                        a2 = g.d.a().a(aVar.f18732a).b(aVar.f18733b).a(aVar.f18734c).a();
                    }
                    gVar.a(buildPullUrl, textureView, ordinal, a2, BaseFeedRoomPlayComponent.this, room2.getSdkParams());
                    BaseFeedRoomPlayComponent.this.i.a(true, BaseFeedRoomPlayComponent.this.h.getContext());
                    BaseFeedRoomPlayComponent.this.b(room2);
                    this.f13929f.put(Long.valueOf(room2.getId()), Long.valueOf(SystemClock.currentThreadTimeMillis()));
                    a(room2);
                } catch (Exception unused) {
                    this.f13926c = 0;
                }
            }
        }

        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i)}, this, f13924a, false, 8389, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i)}, this, f13924a, false, 8389, new Class[]{RecyclerView.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && BaseFeedRoomPlayComponent.this.m) {
                b(a(true));
                a(c());
            }
        }

        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (PatchProxy.isSupport(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f13924a, false, 8390, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{recyclerView, Integer.valueOf(i), Integer.valueOf(i2)}, this, f13924a, false, 8390, new Class[]{RecyclerView.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            super.onScrolled(recyclerView, i, i2);
            if (BaseFeedRoomPlayComponent.this.g == null || BaseFeedRoomPlayComponent.this.g.getVisibility() == 0) {
                b();
            }
        }
    }

    public interface a {
        RecyclerView a();

        BaseFeedAdapter b();

        BannerSwipeRefreshLayout c();

        View d();

        TextureView e();

        g f();

        Lifecycle g();

        Activity h();

        String i();
    }

    /* access modifiers changed from: package-private */
    public abstract void b(boolean z);

    /* access modifiers changed from: package-private */
    public abstract boolean b();

    /* access modifiers changed from: package-private */
    public abstract IPerspectiveWindowScrollListener c();

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onCreate() {
        this.o = true;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onDestroy() {
        this.o = false;
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f1849a, false, 8369, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f1849a, false, 8369, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null) {
            this.k.b();
            this.k = null;
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f1849a, false, 8360, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f1849a, false, 8360, new Class[0], Void.TYPE);
            return;
        }
        this.m = false;
        if (b() && this.n) {
            c(false);
        }
        this.q = false;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f1849a, false, 8359, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f1849a, false, 8359, new Class[0], Void.TYPE);
            return;
        }
        this.m = true;
        this.p = true;
        d();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onStop() {
        if (PatchProxy.isSupport(new Object[0], this, f1849a, false, 8361, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f1849a, false, 8361, new Class[0], Void.TYPE);
            return;
        }
        this.p = false;
        if (b() && this.j.isFinishing()) {
            c(true);
        }
        e();
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f1849a, false, 8366, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f1849a, false, 8366, new Class[0], Void.TYPE);
            return;
        }
        if (b() && this.m && this.n) {
            this.f1851c.removeCallbacks(this.s);
            this.f1851c.postDelayed(this.s, 1000);
        }
    }

    public final void a() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f1849a, false, 8362, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f1849a, false, 8362, new Class[0], Void.TYPE);
        } else if (!b()) {
            if (!(this.f1851c == null || this.l == null)) {
                this.f1851c.removeOnScrollListener(this.l);
                this.l.a();
            }
        } else {
            if (PatchProxy.isSupport(new Object[0], this, f1849a, false, 8365, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f1849a, false, 8365, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                if (this.f1851c != null) {
                    if (this.l != null) {
                        this.f1851c.removeOnScrollListener(this.l);
                        this.l.a();
                        this.f1853e.unregisterAdapterDataObserver(this.r);
                    }
                    this.l = c();
                    if (this.l != null) {
                        this.f1851c.addOnScrollListener(this.l);
                        this.f1853e.registerAdapterDataObserver(this.r);
                        if (this.f1854f != null) {
                            this.f1854f.setStartEndRefreshListener(new b.a() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f13917a;

                                /* renamed from: b  reason: collision with root package name */
                                boolean f13918b;

                                public final void a() {
                                    if (PatchProxy.isSupport(new Object[0], this, f13917a, false, 8380, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f13917a, false, 8380, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    if (BaseFeedRoomPlayComponent.this.l != null && BaseFeedRoomPlayComponent.this.l.f13926c > 0) {
                                        BaseFeedRoomPlayComponent.this.c(false);
                                        this.f13918b = true;
                                    }
                                }

                                public final void b() {
                                    if (PatchProxy.isSupport(new Object[0], this, f13917a, false, 8381, new Class[0], Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[0], this, f13917a, false, 8381, new Class[0], Void.TYPE);
                                        return;
                                    }
                                    if (this.f13918b) {
                                        BaseFeedRoomPlayComponent.this.d();
                                    }
                                    this.f13918b = false;
                                }
                            });
                        }
                        z = true;
                    }
                }
                z = false;
            }
            if (z) {
                if (this.l.f13926c > 0) {
                    c(false);
                }
                d();
            }
        }
    }

    BaseFeedRoomPlayComponent(a aVar) {
        this.g = aVar.d();
        this.h = aVar.e();
        this.i = aVar.f();
        this.f1851c = aVar.a();
        this.f1852d = this.f1851c.getLayoutManager();
        this.f1853e = aVar.b();
        this.f1854f = aVar.c();
        this.j = aVar.h();
        this.f1850b = aVar.i();
        aVar.g().addObserver(this);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f1849a, false, 8363, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f1849a, false, 8363, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.n != z) {
            this.n = z;
            if (z) {
                d();
                return;
            }
            if (b() && this.m) {
                c(false);
            }
        }
    }

    public final void b(Room room) {
        final Room room2 = room;
        if (PatchProxy.isSupport(new Object[]{room2}, this, f1849a, false, 8368, new Class[]{Room.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{room2}, this, f1849a, false, 8368, new Class[]{Room.class}, Void.TYPE);
        } else if (this.p && room2 != null) {
            if (this.k == null) {
                e eVar = new e(room.getId(), room.getStreamId(), true, new a.C0102a() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f13920a;

                    /* renamed from: d  reason: collision with root package name */
                    private boolean f13923d = true;

                    public final boolean a() {
                        if (!this.f13923d || !BaseFeedRoomPlayComponent.this.p || !BaseFeedRoomPlayComponent.this.o) {
                            return false;
                        }
                        return true;
                    }

                    public final void b() {
                        if (PatchProxy.isSupport(new Object[0], this, f13920a, false, 8383, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f13920a, false, 8383, new Class[0], Void.TYPE);
                            return;
                        }
                        this.f13923d = false;
                        BaseFeedRoomPlayComponent.this.a(room2.getId());
                    }

                    public final void c() {
                        if (PatchProxy.isSupport(new Object[0], this, f13920a, false, 8384, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], this, f13920a, false, 8384, new Class[0], Void.TYPE);
                            return;
                        }
                        this.f13923d = false;
                        BaseFeedRoomPlayComponent.this.a(room2.getId());
                    }

                    public final void a(int i) {
                        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f13920a, false, 8382, new Class[]{Integer.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f13920a, false, 8382, new Class[]{Integer.TYPE}, Void.TYPE);
                            return;
                        }
                        this.f13923d = false;
                        BaseFeedRoomPlayComponent.this.a(-1);
                    }

                    public final void a(long j, long j2) {
                        long j3 = j;
                        long j4 = j2;
                        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4)}, this, f13920a, false, 8385, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4)}, this, f13920a, false, 8385, new Class[]{Long.TYPE, Long.TYPE}, Void.TYPE);
                            return;
                        }
                        this.f13923d = false;
                        BaseFeedRoomPlayComponent.this.a(j3, (int) j4);
                    }
                });
                this.k = eVar;
            }
            this.k.a();
        }
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f1849a, false, 8367, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f1849a, false, 8367, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        e();
        if (this.f1851c != null) {
            this.f1851c.removeCallbacks(this.s);
        }
        if (this.g != null) {
            this.g.setVisibility(4);
        }
        b(false);
        if (this.i != null) {
            if (z) {
                this.i.e(this.h.getContext());
            } else {
                this.i.d(this.h.getContext());
            }
        }
        if (this.l != null) {
            this.l.a();
        }
    }

    public final void c(Room room) {
        Room room2;
        if (PatchProxy.isSupport(new Object[]{room}, this, f1849a, false, 8371, new Class[]{Room.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{room}, this, f1849a, false, 8371, new Class[]{Room.class}, Void.TYPE);
            return;
        }
        if (room == null) {
            room2 = this.l.e();
        } else {
            room2 = room;
        }
        if (room2 != null) {
            Long l2 = this.l.f13929f.get(Long.valueOf(room2.getId()));
            if (l2 != null) {
                long currentThreadTimeMillis = SystemClock.currentThreadTimeMillis() - l2.longValue();
                HashMap hashMap = new HashMap();
                if (c.c() || c.d()) {
                    hashMap.put("enter_from_merge", "live_" + this.f1850b);
                } else {
                    hashMap.put("enter_from_merge", "live_merge");
                }
                hashMap.put("enter_method", "live_cover");
                hashMap.put("is_success", PushConstants.PUSH_TYPE_NOTIFY);
                hashMap.put("time", String.valueOf(currentThreadTimeMillis));
                hashMap.put("anchor_id", String.valueOf(room2.getOwnerUserId()));
                hashMap.put("request_id", String.valueOf(room2.getRequestId()));
                hashMap.put("room_id", String.valueOf(room2.getId()));
                hashMap.put("event_belong", "live_view");
                hashMap.put("event_page", "live");
                hashMap.put("event_type", "other");
                hashMap.put("event_module", this.f1850b);
                com.bytedance.android.livesdk.feed.g.b.a().a("live_window_show_finish", hashMap);
            }
        }
    }

    public final void a(long j2) {
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f1849a, false, 8372, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f1849a, false, 8372, new Class[]{Long.TYPE}, Void.TYPE);
        } else if (this.f1851c != null && this.f1851c.getScrollState() == 0 && this.l != null) {
            Room e2 = this.l.e();
            if (e2 != null) {
                if (j2 == e2.getId()) {
                    this.i.d(this.h.getContext());
                    this.g.setVisibility(4);
                    b(false);
                    e2.setStatus(4);
                    this.l.f();
                    return;
                }
                for (FeedItem feedItem : this.f1853e.e()) {
                    if (feedItem.type == 1) {
                        Room room = (Room) feedItem.item;
                        if (room.getId() == j2) {
                            room.setStatus(4);
                        }
                    }
                }
            }
        }
    }

    public final boolean a(Room room) {
        if (PatchProxy.isSupport(new Object[]{room}, this, f1849a, false, 8364, new Class[]{Room.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{room}, this, f1849a, false, 8364, new Class[]{Room.class}, Boolean.TYPE)).booleanValue();
        } else if (room == null || room.getMosaicStatus() != 0 || room.isLiveTypeAudio()) {
            return false;
        } else {
            return true;
        }
    }

    public final void a(long j2, int i2) {
        long j3 = j2;
        int i3 = i2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), Integer.valueOf(i2)}, this, f1849a, false, 8373, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), Integer.valueOf(i2)}, this, f1849a, false, 8373, new Class[]{Long.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.o && this.f1851c != null && this.l != null && this.l.e() != null) {
            Room e2 = this.l.e();
            if (j3 == e2.getId()) {
                this.i.d(this.h.getContext());
                this.g.setVisibility(4);
                b(false);
                e2.setMosaicStatus(i3);
                this.l.f();
                return;
            }
            for (FeedItem feedItem : this.f1853e.e()) {
                if (feedItem.type == 1) {
                    Room room = (Room) feedItem.item;
                    if (room.getId() == j3) {
                        room.setMosaicStatus(i3);
                    }
                }
            }
        }
    }

    public final void a(g.b bVar, Object obj) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{bVar, obj}, this, f1849a, false, 8370, new Class[]{g.b.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar, obj}, this, f1849a, false, 8370, new Class[]{g.b.class, Object.class}, Void.TYPE);
        } else if (this.p) {
            if (bVar == g.b.DISPLAYED_PLAY) {
                if (this.f1851c.getScrollState() == 0) {
                    if (!(this.g == null || this.g.getVisibility() == 0)) {
                        this.g.setVisibility(0);
                        this.g.setAlpha(0.0f);
                        this.g.animate().alpha(1.0f).setDuration(100).start();
                    }
                    b(true);
                    c((Room) null);
                    int e2 = this.i.e();
                    this.l.a(e2 & 65535, e2 >> 16);
                    this.l.b();
                    this.l.g();
                    this.q = true;
                }
            } else if (bVar == g.b.VIDEO_SIZE_CHANGED && this.f1851c.getScrollState() == 0) {
                if (this.g.getVisibility() != 0 && !this.q) {
                    this.g.setVisibility(0);
                    this.g.setAlpha(0.0f);
                    this.g.animate().alpha(1.0f).setDuration(100).start();
                }
                try {
                    i2 = Integer.valueOf(String.valueOf(obj)).intValue();
                } catch (Throwable unused) {
                    i2 = -1;
                }
                if (i2 >= 0) {
                    this.l.a(i2 & 65535, i2 >> 16);
                    this.l.b();
                }
            }
        }
    }
}
