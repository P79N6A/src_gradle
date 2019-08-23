package com.ss.android.ugc.aweme.live.feedpage;

import android.annotation.SuppressLint;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.util.Log;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.ss.android.ugc.aweme.follow.presenter.RoomStruct;
import com.ss.android.ugc.aweme.follow.presenter.h;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.ss.android.ugc.aweme.profile.model.User;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53382a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final String f53383b = "c";

    /* renamed from: c  reason: collision with root package name */
    public static final Long f53384c = 0L;
    private static com.ss.android.e.c<c> j = new com.ss.android.e.c<c>() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53388a;

        public final /* synthetic */ Object a() {
            if (!PatchProxy.isSupport(new Object[0], this, f53388a, false, 55663, new Class[0], c.class)) {
                return new c();
            }
            return (c) PatchProxy.accessDispatch(new Object[0], this, f53388a, false, 55663, new Class[0], c.class);
        }
    };
    @SuppressLint({"UseSparseArrays"})

    /* renamed from: d  reason: collision with root package name */
    public Map<Long, Long> f53385d = new HashMap(20);
    @SuppressLint({"UseSparseArrays"})

    /* renamed from: e  reason: collision with root package name */
    public Map<Long, Long> f53386e = new HashMap(20);

    /* renamed from: f  reason: collision with root package name */
    public com.bytedance.android.live.core.a.c<Long, Long> f53387f = new com.bytedance.android.live.core.a.c<>(20);
    public LiveStateApi g = ((LiveStateApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://" + com.ss.android.ugc.aweme.live.a.a()).create(LiveStateApi.class));
    private a h = null;
    private ArrayDeque<a> i = new ArrayDeque<>(10);

    @MainThread
    final class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f53389a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f53390b;

        /* renamed from: c  reason: collision with root package name */
        final Long f53391c;

        /* renamed from: d  reason: collision with root package name */
        Set<Long> f53392d;

        /* renamed from: f  reason: collision with root package name */
        private final Long f53394f;
        private List<Consumer<Map<Long, Long>>> g = new ArrayList(3);

        /* access modifiers changed from: package-private */
        public void a() {
            if (PatchProxy.isSupport(new Object[0], this, f53389a, false, 55668, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53389a, false, 55668, new Class[0], Void.TYPE);
                return;
            }
            this.f53390b = false;
            a(c.this.f53385d);
            c.this.b();
        }

        public final void run() {
            Long l;
            long j;
            if (PatchProxy.isSupport(new Object[0], this, f53389a, false, 55665, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f53389a, false, 55665, new Class[0], Void.TYPE);
                return;
            }
            this.f53390b = true;
            c.this.f53387f.a(this.f53391c, this.f53394f);
            long currentTimeMillis = System.currentTimeMillis();
            if (this.f53391c.longValue() != 0) {
                c cVar = c.this;
                long longValue = this.f53391c.longValue();
                long j2 = longValue;
                if (PatchProxy.isSupport(new Object[]{new Long(longValue)}, cVar, c.f53382a, false, 55658, new Class[]{Long.TYPE}, Long.class)) {
                    c cVar2 = cVar;
                    l = (Long) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, cVar2, c.f53382a, false, 55658, new Class[]{Long.TYPE}, Long.class);
                } else {
                    Long l2 = cVar.f53386e.get(Long.valueOf(j2));
                    if (l2 == null) {
                        j = 0;
                    } else {
                        j = l2.longValue();
                    }
                    l = Long.valueOf(j);
                }
                if (currentTimeMillis - l.longValue() < c.c()) {
                    a();
                    return;
                }
            }
            this.f53392d = new HashSet(c.this.f53387f.a().keySet());
            StringBuilder sb = new StringBuilder();
            this.f53392d.add(this.f53391c);
            if (!CollectionUtils.isEmpty(this.f53392d)) {
                for (Long valueOf : this.f53392d) {
                    sb.append(String.valueOf(valueOf));
                    sb.append(",");
                }
            }
            c.this.g.liveStates(sb.toString()).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread()).subscribe(new d(this, currentTimeMillis), new e(this));
        }

        private void a(@NonNull Map<Long, Long> map) {
            if (PatchProxy.isSupport(new Object[]{map}, this, f53389a, false, 55670, new Class[]{Map.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{map}, this, f53389a, false, 55670, new Class[]{Map.class}, Void.TYPE);
            } else if (!CollectionUtils.isEmpty(this.g)) {
                for (Consumer accept : this.g) {
                    try {
                        accept.accept(map);
                    } catch (Exception e2) {
                        com.ss.android.ugc.aweme.framework.a.a.a("LiveStateManager", "onResult:" + Log.getStackTraceString(e2));
                    }
                }
            }
        }

        @MainThread
        public final void a(Consumer<Map<Long, Long>> consumer) {
            Consumer<Map<Long, Long>> consumer2 = consumer;
            if (PatchProxy.isSupport(new Object[]{consumer2}, this, f53389a, false, 55669, new Class[]{Consumer.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{consumer2}, this, f53389a, false, 55669, new Class[]{Consumer.class}, Void.TYPE);
                return;
            }
            this.g.add(consumer2);
        }

        public final boolean a(Long l) {
            if (PatchProxy.isSupport(new Object[]{l}, this, f53389a, false, 55664, new Class[]{Long.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{l}, this, f53389a, false, 55664, new Class[]{Long.class}, Boolean.TYPE)).booleanValue();
            } else if (this.f53392d == null || !this.f53392d.contains(l)) {
                return false;
            } else {
                return true;
            }
        }

        a(Long l, Long l2, Consumer<Map<Long, Long>> consumer) {
            this.f53391c = l;
            this.f53394f = l2;
            this.g.add(consumer);
        }
    }

    public static c a() {
        if (PatchProxy.isSupport(new Object[0], null, f53382a, true, 55652, new Class[0], c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[0], null, f53382a, true, 55652, new Class[0], c.class);
        }
        return (c) j.b();
    }

    private static boolean d() {
        if (PatchProxy.isSupport(new Object[0], null, f53382a, true, 55660, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f53382a, true, 55660, new Class[0], Boolean.TYPE)).booleanValue();
        }
        try {
            return SettingsManagerProxy.inst().get().bw().booleanValue();
        } catch (com.bytedance.ies.a unused) {
            return false;
        }
    }

    private static boolean e() {
        if (PatchProxy.isSupport(new Object[0], null, f53382a, true, 55661, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f53382a, true, 55661, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (com.ss.android.g.a.a() || !d()) {
            return true;
        }
        return false;
    }

    public static long c() {
        if (PatchProxy.isSupport(new Object[0], null, f53382a, true, 55662, new Class[0], Long.TYPE)) {
            return ((Long) PatchProxy.accessDispatch(new Object[0], null, f53382a, true, 55662, new Class[0], Long.TYPE)).longValue();
        }
        try {
            return SettingsManagerProxy.inst().get().bx().longValue();
        } catch (com.bytedance.ies.a unused) {
            return 60000;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f53382a, false, 55657, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f53382a, false, 55657, new Class[0], Void.TYPE);
        } else if (this.h == null || !this.h.f53390b) {
            a pollLast = this.i.pollLast();
            this.h = pollLast;
            if (pollLast != null) {
                pollLast.run();
            }
        }
    }

    public final void a(FeedItemList feedItemList) {
        FeedItemList feedItemList2 = feedItemList;
        if (PatchProxy.isSupport(new Object[]{feedItemList2}, this, f53382a, false, 55653, new Class[]{FeedItemList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItemList2}, this, f53382a, false, 55653, new Class[]{FeedItemList.class}, Void.TYPE);
        } else if (!e()) {
            if (feedItemList2 == null || CollectionUtils.isEmpty(feedItemList2.items)) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            for (Aweme next : feedItemList2.items) {
                if (next.isLive() || next.getAuthor().isLive()) {
                    a(currentTimeMillis, next.getAuthor());
                }
            }
        }
    }

    public final void a(FollowFeedList followFeedList) {
        if (PatchProxy.isSupport(new Object[]{followFeedList}, this, f53382a, false, 55654, new Class[]{FollowFeedList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followFeedList}, this, f53382a, false, 55654, new Class[]{FollowFeedList.class}, Void.TYPE);
        } else if (!e() && followFeedList != null && !CollectionUtils.isEmpty(followFeedList.getItems())) {
            long currentTimeMillis = System.currentTimeMillis();
            for (FollowFeed next : followFeedList.getItems()) {
                if (next.getFeedType() == 65298) {
                    h roomStruct = next.getRoomStruct();
                    if (roomStruct != null) {
                        RoomStruct roomStruct2 = roomStruct.f47797a;
                        if (roomStruct2 != null) {
                            roomStruct2.owner.roomId = roomStruct2.id;
                            a(currentTimeMillis, roomStruct2.owner);
                        }
                    }
                } else {
                    Aweme aweme = next.getAweme();
                    if (aweme != null && aweme.getAuthor().isLive()) {
                        a(currentTimeMillis, aweme.getAuthor());
                    }
                }
            }
        }
    }

    private void a(long j2, User user) {
        long j3 = j2;
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), user2}, this, f53382a, false, 55655, new Class[]{Long.TYPE, User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), user2}, this, f53382a, false, 55655, new Class[]{Long.TYPE, User.class}, Void.TYPE);
        } else if (!e()) {
            Long valueOf = Long.valueOf(user.getUid());
            this.f53385d.put(valueOf, Long.valueOf(user2.roomId));
            this.f53386e.put(valueOf, Long.valueOf(j2));
            this.f53387f.a(valueOf, Long.valueOf(user2.roomId));
        }
    }

    @MainThread
    public final void a(Class cls, User user, Consumer<Map<Long, Long>> consumer) {
        User user2 = user;
        Consumer<Map<Long, Long>> consumer2 = consumer;
        if (PatchProxy.isSupport(new Object[]{cls, user2, consumer2}, this, f53382a, false, 55656, new Class[]{Class.class, User.class, Consumer.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cls, user2, consumer2}, this, f53382a, false, 55656, new Class[]{Class.class, User.class, Consumer.class}, Void.TYPE);
        } else if (!e()) {
            Long valueOf = Long.valueOf(user.getUid());
            if (this.h == null || !this.h.a(valueOf)) {
                this.i.addFirst(new a(valueOf, Long.valueOf(user2.roomId), consumer2));
                b();
                return;
            }
            this.h.a(consumer2);
        }
    }
}
