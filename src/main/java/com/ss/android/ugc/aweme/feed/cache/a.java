package com.ss.android.ugc.aweme.feed.cache;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\t\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0002J \u0010#\u001a\u00020\u000f2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%2\b\u0010'\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010(\u001a\u00020!H\u0002J\b\u0010)\u001a\u00020!H\u0002J\n\u0010*\u001a\u0004\u0018\u00010\u0012H\u0002J\n\u0010+\u001a\u0004\u0018\u00010\u0012H\u0002J\n\u0010,\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010-\u001a\u0004\u0018\u00010\u0007J\u001c\u0010.\u001a\u00020\u000f2\b\u0010/\u001a\u0004\u0018\u00010\u00072\b\u0010'\u001a\u0004\u0018\u00010\u0007H\u0002J\u0012\u00100\u001a\u0004\u0018\u00010\u00072\b\u00101\u001a\u0004\u0018\u00010\u0007J\u0012\u00102\u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u00103\u001a\u00020\u000fH\u0002J\u0010\u00104\u001a\u00020\u000f2\b\u00105\u001a\u0004\u0018\u00010\u0007J\u0006\u00106\u001a\u00020\u000fJ\u0006\u00107\u001a\u00020\u000fJ\u0010\u00108\u001a\u00020\u000f2\b\u00109\u001a\u0004\u0018\u00010\u0007J\b\u0010:\u001a\u00020!H\u0002J\u0006\u0010;\u001a\u00020!J\u0016\u0010<\u001a\u00020!2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020>J\b\u0010@\u001a\u0004\u0018\u00010\u0012J\u0012\u0010A\u001a\u00020!2\b\u0010'\u001a\u0004\u0018\u00010\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007XT¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\u00020\u000f8FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006B"}, d2 = {"Lcom/ss/android/ugc/aweme/feed/cache/FeedCacheLoader;", "", "()V", "BUFFER_SIZE", "", "DAY", "FETCH_VIDEO_EVENT", "", "HIT_EVENT", "HOUR", "HTTP_OK", "TAG", "cacheFeedName", "cacheFolder", "enabled", "", "expiredTime", "feedItemList", "Lcom/ss/android/ugc/aweme/feed/model/FeedItemList;", "groupKey", "isStarted", "localCache", "lock", "Ljava/lang/Object;", "sendResponse", "spName", "timeKey", "useCacheFlag", "getUseCacheFlag", "()Z", "setUseCacheFlag", "(Z)V", "cacheFeed", "", "list", "cacheVideo", "response", "Lcom/bytedance/retrofit2/SsResponse;", "Lcom/bytedance/retrofit2/mime/TypedInput;", "groupId", "clean", "cleanExpired", "fetchFeeds", "getCacheFeed", "getFeedPath", "getLocalCache", "getVideo", "url", "getVideoPath", "name", "getVideos", "hitCache", "hitLocal", "path", "isEnabled", "isFirst", "isLocalGroup", "id", "preloadCache", "preloadCacheAsync", "startCache", "download", "", "total", "tryUseCache", "updateData", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45152a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile String f45153b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f45154c = new a();

    /* renamed from: d  reason: collision with root package name */
    private static volatile boolean f45155d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile int f45156e = com.ss.android.ugc.aweme.main.guide.a.f54802d;

    /* renamed from: f  reason: collision with root package name */
    private static volatile FeedItemList f45157f;
    private static volatile boolean g;
    private static Object h = new Object();
    private static volatile boolean i;
    private static volatile boolean j;

    private a() {
    }

    public static boolean c() {
        return f45155d;
    }

    public static boolean a() {
        boolean z = i;
        i = false;
        return z;
    }

    public static boolean d() {
        boolean z = j;
        j = false;
        return z;
    }

    @Nullable
    public final FeedItemList b() {
        if (PatchProxy.isSupport(new Object[0], this, f45152a, false, 40924, new Class[0], FeedItemList.class)) {
            return (FeedItemList) PatchProxy.accessDispatch(new Object[0], this, f45152a, false, 40924, new Class[0], FeedItemList.class);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (h) {
            objectRef.element = f45157f;
        }
        if (((FeedItemList) objectRef.element) != null) {
            j = true;
        }
        f45157f = null;
        g = false;
        i = true;
        return (FeedItemList) objectRef.element;
    }

    public final boolean a(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f45152a, false, 40927, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f45152a, false, 40927, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (str == null || f45153b == null) {
            return false;
        } else {
            String str2 = f45153b;
            Boolean bool = null;
            if (str2 != null) {
                bool = Boolean.valueOf(StringsKt.contains$default((CharSequence) str2, (CharSequence) str, false, 2, (Object) null));
            }
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }
    }
}
