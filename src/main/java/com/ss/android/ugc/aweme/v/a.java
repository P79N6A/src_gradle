package com.ss.android.ugc.aweme.v;

import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\nH\u0002J\u001a\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\n\u0010\u0012\u001a\u00060\u0013j\u0002`\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u001e\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\tj\b\u0012\u0004\u0012\u00020\u0006`\nX\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\f\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\f\u0018\u0001`\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/monitor/ApiErrorMonitor;", "", "()V", "GSON", "Lcom/google/gson/Gson;", "MONITOR_LOG_TYPE", "", "TAG", "WHITE_LIST", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "sWhiteCodelist", "", "getWhiteCodeList", "monitor", "", "request", "Lcom/bytedance/retrofit2/client/Request;", "ex", "Ljava/lang/Exception;", "Lkotlin/Exception;", "network_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75976a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final Gson f75977b = new Gson();

    /* renamed from: c  reason: collision with root package name */
    public static final String f75978c = f75978c;

    /* renamed from: d  reason: collision with root package name */
    public static final a f75979d = new a();

    /* renamed from: e  reason: collision with root package name */
    private static final String f75980e = f75980e;

    /* renamed from: f  reason: collision with root package name */
    private static ArrayList<Integer> f75981f;
    private static final ArrayList<String> g = CollectionsKt.arrayListOf("/service/1/update_token/", "/aweme/v1/aweme/detail/", "/aweme/v1/user/", "/aweme/v1/abtest/param/", "/aweme/v1/commerce/settings", "/aweme/v1/feed/", "/aweme/v1/settings/", "/aweme/v1/story/", "/aweme/v1/user/settings/", "/aweme/v1/im/cloud/token/", "/aweme/v1/upload/contacts/", "/aweme/v1/aweme/post/", "/aweme/v1/poi/search/", "/aweme/v1/user/", "/aweme/v1/commit/follow/user/", "/aweme/v1/multi/aweme/detail/", "/aweme/v1/comment/publish/", "/aweme/v1/general/search/", "/passport/user/logout/", "/aweme/v1/commit/item/digg/", "/aweme/v1/poi/vertical/aweme/", "/user/mobile/reset_password/", "/passport/auth/login/", "/aweme/v1/create/aweme/", "/aweme/v1/recommend/user/", "/aweme/v2/comment/list/", "/passport/mobile/login/", "/aweme/v1/user/follower/list/", "/aweme/v1/notice/count/", "/aweme/v1/friend/feed/", "/aweme/v1/aweme/stats/", "/aweme/v1/hot/search/list/", "/aweme/v1/recommend/challenge/");

    private a() {
    }

    public final ArrayList<Integer> a() {
        if (PatchProxy.isSupport(new Object[0], this, f75976a, false, 59746, new Class[0], ArrayList.class)) {
            return (ArrayList) PatchProxy.accessDispatch(new Object[0], this, f75976a, false, 59746, new Class[0], ArrayList.class);
        }
        if (f75981f == null) {
            synchronized (f75979d) {
                if (f75981f != null) {
                    ArrayList<Integer> arrayList = f75981f;
                    return arrayList;
                }
                f75981f = new ArrayList<>();
                for (String str : g) {
                    ArrayList<Integer> arrayList2 = f75981f;
                    if (arrayList2 == null) {
                        Intrinsics.throwNpe();
                    }
                    arrayList2.add(Integer.valueOf(str.hashCode()));
                }
            }
        }
        return f75981f;
    }
}
