package com.ss.android.ugc.aweme.feed;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.sharedpref.e;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.preload.f;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.setting.model.AbTestModel;
import com.ss.android.ugc.aweme.utils.da;
import com.ss.android.ugc.aweme.utils.db;
import com.ss.android.ugc.aweme.video.preload.g;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import org.json.JSONObject;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47066a;

    /* renamed from: b  reason: collision with root package name */
    public static Boolean f47067b;

    /* renamed from: c  reason: collision with root package name */
    public static long f47068c = -1;

    /* renamed from: d  reason: collision with root package name */
    public static long f47069d = -1;

    /* renamed from: e  reason: collision with root package name */
    public static long f47070e = -1;

    /* renamed from: f  reason: collision with root package name */
    public static long f47071f = -1;
    public static long g = -1;
    public static long h = -1;
    public static b i;
    public static String j;
    public static Throwable k;
    public static long l;
    public static com.bytedance.ttnet.b.b m;
    public static JSONObject n;
    private static c o = c.FEED;
    private static boolean p;
    private static volatile Boolean q;
    private static List<Aweme> r = new ArrayList();

    public static class a implements Callable {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47072a;

        /* renamed from: b  reason: collision with root package name */
        private Callable f47073b;

        public final Object call() throws Exception {
            int i;
            if (PatchProxy.isSupport(new Object[0], this, f47072a, false, 40135, new Class[0], Object.class)) {
                return PatchProxy.accessDispatch(new Object[0], this, f47072a, false, 40135, new Class[0], Object.class);
            } else if (com.ss.android.g.a.a()) {
                Object a2 = f.a().a(4).a();
                if (a2 == null) {
                    z.a(null, false, 0);
                } else if (!((FeedItemList) a2).isFromLocalCache) {
                    return a2;
                } else {
                    long a3 = e.a().a("key_feed_cache_time", 0);
                    AbTestManager a4 = AbTestManager.a();
                    if (PatchProxy.isSupport(new Object[0], a4, AbTestManager.f63777a, false, 71690, new Class[0], Integer.TYPE)) {
                        i = ((Integer) PatchProxy.accessDispatch(new Object[0], a4, AbTestManager.f63777a, false, 71690, new Class[0], Integer.TYPE)).intValue();
                    } else if (a4.m != null) {
                        i = a4.m.intValue();
                    } else {
                        AbTestModel d2 = a4.d();
                        if (d2 == null) {
                            a4.m = 0;
                            i = a4.m.intValue();
                        } else {
                            a4.m = Integer.valueOf(d2.isFeedLoadCacheV2Time);
                            i = a4.m.intValue();
                        }
                    }
                    if (System.currentTimeMillis() - a3 <= ((long) (i * 3600000))) {
                        z.a(a2, false, a3);
                        return a2;
                    }
                    z.a(a2, true, a3);
                }
                return this.f47073b.call();
            } else {
                Object a5 = f.a().a(4).a();
                if (a5 == null || ((FeedItemList) a5).isFromLocalCache) {
                    return this.f47073b.call();
                }
                return a5;
            }
        }

        public a(Callable callable) {
            this.f47073b = callable;
        }
    }

    public static class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f47074a;

        /* renamed from: b  reason: collision with root package name */
        public Handler f47075b;

        /* renamed from: c  reason: collision with root package name */
        boolean f47076c;

        private b(Handler handler) {
            this.f47075b = handler;
        }

        public final void handleMessage(Message message) {
            if (PatchProxy.isSupport(new Object[]{message}, this, f47074a, false, 40136, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message}, this, f47074a, false, 40136, new Class[]{Message.class}, Void.TYPE);
                return;
            }
            super.handleMessage(message);
            z.f47067b = Boolean.FALSE;
            z.i = null;
            if (this.f47076c && message.obj != null && (message.obj instanceof FeedItemList)) {
                ((FeedItemList) message.obj).setReplaceFake();
            }
            this.f47075b.handleMessage(message);
        }

        public /* synthetic */ b(Handler handler, byte b2) {
            this(handler);
        }
    }

    public enum c {
        NONE,
        FEED,
        DISCOVER,
        SHOOT,
        PROFILE,
        MUSICAL,
        CHALLENGE,
        LOGIN,
        SIGNUP,
        THIRD,
        SHARE,
        NOTIFY,
        NOTICE,
        FOLLOW;
        
        public static ChangeQuickRedirect changeQuickRedirect;
    }

    public static boolean d() {
        return p;
    }

    public static long c() {
        long j2 = f47070e;
        f47070e = 0;
        return j2;
    }

    public static void b() {
        if (PatchProxy.isSupport(new Object[0], null, f47066a, true, 40116, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f47066a, true, 40116, new Class[0], Void.TYPE);
            return;
        }
        if (f47068c < 0) {
            f47068c = SystemClock.elapsedRealtime();
        }
    }

    public static String e() {
        if (PatchProxy.isSupport(new Object[0], null, f47066a, true, 40125, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f47066a, true, 40125, new Class[0], String.class);
        }
        return o.name();
    }

    public static Boolean a() {
        if (PatchProxy.isSupport(new Object[0], null, f47066a, true, 40099, new Class[0], Boolean.class)) {
            return (Boolean) PatchProxy.accessDispatch(new Object[0], null, f47066a, true, 40099, new Class[0], Boolean.class);
        }
        if (q == null) {
            if (PatchProxy.isSupport(new Object[0], null, f47066a, true, 40098, new Class[0], Boolean.TYPE)) {
                ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f47066a, true, 40098, new Class[0], Boolean.TYPE)).booleanValue();
            } else if (GlobalContext.getContext() != null) {
                SharedPreferences a2 = com.ss.android.ugc.aweme.q.c.a(GlobalContext.getContext(), "prefs_feed_check", 0);
                boolean z = a2.getBoolean("key_first_launch", true);
                if (q == null) {
                    q = Boolean.valueOf(z);
                }
                if (q.booleanValue()) {
                    com.ss.android.ugc.aweme.aj.b.b().a(GlobalContext.getContext(), "key_new_user", true);
                }
                a2.edit().putBoolean("key_first_launch", false).apply();
                q.booleanValue();
            }
        }
        return q;
    }

    public static void a(c cVar) {
        o = cVar;
    }

    public static String b(FeedItemList feedItemList) {
        FeedItemList feedItemList2 = feedItemList;
        if (PatchProxy.isSupport(new Object[]{feedItemList2}, null, f47066a, true, 40123, new Class[]{FeedItemList.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{feedItemList2}, null, f47066a, true, 40123, new Class[]{FeedItemList.class}, String.class);
        }
        StringBuilder sb = new StringBuilder();
        if (!CollectionUtils.isEmpty(feedItemList2.items)) {
            for (Aweme aid : feedItemList2.items) {
                sb.append(aid.getAid());
                sb.append(",");
            }
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public static void a(FeedItemList feedItemList) {
        boolean z;
        FeedItemList feedItemList2 = feedItemList;
        if (PatchProxy.isSupport(new Object[]{feedItemList2}, null, f47066a, true, 40121, new Class[]{FeedItemList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{feedItemList2}, null, f47066a, true, 40121, new Class[]{FeedItemList.class}, Void.TYPE);
            return;
        }
        AbTestManager a2 = AbTestManager.a();
        if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71904, new Class[0], Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71904, new Class[0], Boolean.TYPE)).booleanValue();
        } else {
            AbTestModel d2 = a2.d();
            if (d2 != null) {
                z = d2.coldStartPreloadFirstVideoNew;
            } else {
                z = false;
            }
        }
        if (z && db.a().a(da.FEED_FIRST_VIDEO_PRELOAD) && feedItemList2 != null && feedItemList2.items != null) {
            List<Aweme> list = feedItemList2.items;
            if (PatchProxy.isSupport(new Object[]{list, 0}, null, g.f76257a, true, 89272, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list, 0}, null, g.f76257a, true, 89272, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
            } else if (list != null && list.size() != 0 && list.size() > 0) {
                g.f().a(list.get(0));
            }
        }
    }

    public static void a(String str) {
        boolean z;
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3}, null, f47066a, true, 40102, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3}, null, f47066a, true, 40102, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (com.ss.android.g.a.a()) {
            if (PatchProxy.isSupport(new Object[0], null, f47066a, true, 40097, new Class[0], Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f47066a, true, 40097, new Class[0], Boolean.TYPE)).booleanValue();
            } else {
                AbTestManager a2 = AbTestManager.a();
                if (PatchProxy.isSupport(new Object[0], a2, AbTestManager.f63777a, false, 71683, new Class[0], Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[0], a2, AbTestManager.f63777a, false, 71683, new Class[0], Boolean.TYPE)).booleanValue();
                } else if (a2.h != null) {
                    z = a2.h.booleanValue();
                } else {
                    AbTestModel d2 = a2.d();
                    if (d2 == null) {
                        a2.h = Boolean.FALSE;
                        z = false;
                    } else {
                        a2.h = Boolean.valueOf(d2.isFeedLoadCacheV2);
                        z = a2.h.booleanValue();
                    }
                }
            }
            if (z) {
                if (PatchProxy.isSupport(new Object[]{str3}, null, f47066a, true, 40103, new Class[]{String.class}, String.class)) {
                    str2 = (String) PatchProxy.accessDispatch(new Object[]{str3}, null, f47066a, true, 40103, new Class[]{String.class}, String.class);
                } else if (r.size() > 0) {
                    int size = r.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size) {
                            break;
                        } else if (TextUtils.equals(str3, r.get(i2).getAid())) {
                            r.get(i2).setCanCache(false);
                            break;
                        } else {
                            i2++;
                        }
                    }
                    str2 = "";
                    for (int size2 = r.size() - 1; size2 >= 0; size2--) {
                        Aweme aweme = r.get(size2);
                        if (!aweme.getCanCache()) {
                            break;
                        }
                        str2 = aweme.getAid();
                    }
                } else {
                    str2 = "";
                }
                e.a().b("feed_cached_index", str2);
            }
        }
    }

    public static void a(Object obj, boolean z, long j2) {
        String str;
        Object obj2 = obj;
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{obj2, Byte.valueOf(z ? (byte) 1 : 0), new Long(j3)}, null, f47066a, true, 40122, new Class[]{Object.class, Boolean.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj2, Byte.valueOf(z), new Long(j3)}, null, f47066a, true, 40122, new Class[]{Object.class, Boolean.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        d a2 = d.a();
        if (obj2 == null || !(obj2 instanceof FeedItemList)) {
            a2.a("is_cache", PushConstants.PUSH_TYPE_NOTIFY).a("is_timeout", PushConstants.PUSH_TYPE_NOTIFY).a("cache_num", 0).a("group_id_list", "").a("cache_time", j3);
        } else {
            d a3 = a2.a("is_cache", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            if (z) {
                str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
            } else {
                str = PushConstants.PUSH_TYPE_NOTIFY;
            }
            FeedItemList feedItemList = (FeedItemList) obj2;
            a3.a("is_timeout", str).a("cache_num", feedItemList.items.size()).a("group_id_list", b(feedItemList)).a("cache_time", j3);
        }
        r.a("pull_out_cache_video", (Map) a2.f34114b);
    }
}
