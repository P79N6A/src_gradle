package com.ss.android.ugc.aweme.follow.a;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.ss.android.ugc.aweme.utils.bm;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u000e\u001a\u00020\u000bH\u0002J\u0006\u0010\u000f\u001a\u00020\u0010J\b\u0010\u0011\u001a\u0004\u0018\u00010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J\u0012\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0002J\u000e\u0010\u0016\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/follow/cache/FollowFeedCache;", "", "()V", "cache", "Ljava/io/File;", "cacheDirPath", "", "cacheFilePath", "gson", "Lcom/google/gson/Gson;", "checkDataNotNull", "", "data", "Lcom/ss/android/ugc/aweme/follow/presenter/FollowFeedList;", "checkFileExistsAndCreate", "clearCache", "", "getCache", "json2Obj", "str", "obj2Json", "list", "putCache", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47735a;

    /* renamed from: b  reason: collision with root package name */
    public static final String f47736b = (b.f() + File.separator + "follow_feed_cache");

    /* renamed from: c  reason: collision with root package name */
    public static final String f47737c = (f47736b + File.separator + "cache");

    /* renamed from: d  reason: collision with root package name */
    public static final a f47738d = new a();

    /* renamed from: e  reason: collision with root package name */
    private static File f47739e = bm.a(f47737c, true);

    /* renamed from: f  reason: collision with root package name */
    private static final Gson f47740f = new Gson();

    private a() {
    }

    static {
        bm.a(f47736b, false);
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f47735a, false, 44630, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f47735a, false, 44630, new Class[0], Boolean.TYPE)).booleanValue();
        }
        File file = f47739e;
        if (file != null && file.exists()) {
            return true;
        }
        bm.a(f47736b, false);
        File a2 = bm.a(f47737c, true);
        f47739e = a2;
        if (a2 == null || !a2.exists()) {
            return false;
        }
        return true;
    }

    public final FollowFeedList a(String str) {
        FollowFeedList followFeedList;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f47735a, false, 44629, new Class[]{String.class}, FollowFeedList.class)) {
            return (FollowFeedList) PatchProxy.accessDispatch(new Object[]{str2}, this, f47735a, false, 44629, new Class[]{String.class}, FollowFeedList.class);
        }
        try {
            followFeedList = (FollowFeedList) f47740f.fromJson(str2, FollowFeedList.class);
        } catch (Exception unused) {
            followFeedList = null;
        }
        return followFeedList;
    }

    public final String a(FollowFeedList followFeedList) {
        String str;
        FollowFeedList followFeedList2 = followFeedList;
        if (PatchProxy.isSupport(new Object[]{followFeedList2}, this, f47735a, false, 44628, new Class[]{FollowFeedList.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{followFeedList2}, this, f47735a, false, 44628, new Class[]{FollowFeedList.class}, String.class);
        }
        try {
            str = f47740f.toJson((Object) followFeedList2);
            if (str == null) {
                str = "";
            }
        } catch (Exception unused) {
            str = "";
        }
        return str;
    }
}
