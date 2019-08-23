package com.ss.android.ugc.aweme.openauthorize;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.http.a.b.e;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0014\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0016J(\u0010\u0015\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0014\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001b\u001a\u00020\u0006H\u0016J\b\u0010\u001c\u001a\u00020\u0019H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/ss/android/ugc/aweme/openauthorize/AwemeAuthorizePlatformDepend;", "Lcom/bytedance/sdk/account/bdplatform/api/BDAuthorizePlatformDepend;", "thirdClientKeyProvider", "Lcom/ss/android/ugc/aweme/openauthorize/IThirdClientKeyProvider;", "(Lcom/ss/android/ugc/aweme/openauthorize/IThirdClientKeyProvider;)V", "OPEN_AUTHORIZE_HOST", "", "clientKeyProvider", "Ljava/lang/ref/WeakReference;", "executorService", "Ljava/util/concurrent/ThreadPoolExecutor;", "authHost", "checkRequestException", "", "e", "", "execute", "", "p0", "Ljava/lang/Runnable;", "executeGet", "executePost", "p1", "", "isLogin", "", "isNetworkEnable", "ticketHost", "updateLoginStatus", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b implements com.bytedance.sdk.account.bdplatform.a.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58357a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<e> f58358b;

    /* renamed from: c  reason: collision with root package name */
    private final String f58359c = "open.douyin.com";

    /* renamed from: d  reason: collision with root package name */
    private ThreadPoolExecutor f58360d;

    @NotNull
    public final String d() {
        return "aweme.snssdk.com";
    }

    @NotNull
    public final String e() {
        return "open.douyin.com";
    }

    public final boolean c() {
        if (!PatchProxy.isSupport(new Object[0], this, f58357a, false, 63352, new Class[0], Boolean.TYPE)) {
            return NetworkUtils.isNetworkAvailable(k.a());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58357a, false, 63352, new Class[0], Boolean.TYPE)).booleanValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003e, code lost:
        if (r2 == null) goto L_0x0040;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f58357a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 63356(0xf77c, float:8.878E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f58357a
            r5 = 0
            r6 = 63356(0xf77c, float:8.878E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002c:
            com.ss.android.ugc.aweme.openauthorize.b.a$a r1 = com.ss.android.ugc.aweme.openauthorize.b.a.f58362b     // Catch:{ Exception -> 0x0047 }
            java.lang.ref.WeakReference<com.ss.android.ugc.aweme.openauthorize.e> r2 = r9.f58358b     // Catch:{ Exception -> 0x0047 }
            if (r2 == 0) goto L_0x0040
            java.lang.Object r2 = r2.get()     // Catch:{ Exception -> 0x0047 }
            com.ss.android.ugc.aweme.openauthorize.e r2 = (com.ss.android.ugc.aweme.openauthorize.e) r2     // Catch:{ Exception -> 0x0047 }
            if (r2 == 0) goto L_0x0040
            java.lang.String r2 = r2.getClientKey()     // Catch:{ Exception -> 0x0047 }
            if (r2 != 0) goto L_0x0042
        L_0x0040:
            java.lang.String r2 = ""
        L_0x0042:
            boolean r1 = r1.a(r2)     // Catch:{ Exception -> 0x0047 }
            r0 = r1
        L_0x0047:
            boolean r1 = com.ss.android.g.a.a()
            if (r1 != 0) goto L_0x006c
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r2 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            boolean r1 = r1.isLogin()
            if (r1 == 0) goto L_0x006c
            if (r0 != 0) goto L_0x006c
            android.content.Context r1 = com.ss.android.common.applog.GlobalContext.getContext()
            r2 = 2131561105(0x7f0d0a91, float:1.8747601E38)
            com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.ui.d.a.b((android.content.Context) r1, (int) r2)
            r1.a()
        L_0x006c:
            if (r0 != 0) goto L_0x0088
            r1 = 1
            com.ss.android.ugc.aweme.account.util.n.g(r1)
            com.ss.android.ugc.aweme.IAccountUserService r1 = com.ss.android.ugc.aweme.account.d.a()
            com.ss.android.ugc.aweme.IAccountUserService r2 = com.ss.android.ugc.aweme.account.d.a()
            java.lang.String r3 = "AccountUserProxyService.get()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r3)
            java.lang.String r2 = r2.getCurUserId()
            java.lang.String r3 = "authorize"
            r1.delete(r2, r3)
        L_0x0088:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.openauthorize.b.b():boolean");
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f58357a, false, 63351, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f58357a, false, 63351, new Class[0], Boolean.TYPE)).booleanValue();
        }
        IAccountUserService a2 = d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        return a2.isLogin();
    }

    public b(@Nullable e eVar) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 5, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
        this.f58360d = threadPoolExecutor;
        this.f58358b = new WeakReference<>(eVar);
    }

    public final void a(@Nullable Runnable runnable) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{runnable2}, this, f58357a, false, 63355, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable2}, this, f58357a, false, 63355, new Class[]{Runnable.class}, Void.TYPE);
            return;
        }
        this.f58360d.execute(runnable2);
    }

    @NotNull
    public final String a(@Nullable String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f58357a, false, 63353, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f58357a, false, 63353, new Class[]{String.class}, String.class);
        }
        String executeGet = NetworkUtils.executeGet(Integer.MAX_VALUE, str2);
        Intrinsics.checkExpressionValueIsNotNull(executeGet, "NetworkUtils.executeGet(Int.MAX_VALUE, p0)");
        return executeGet;
    }

    @NotNull
    public final String a(@Nullable String str, @Nullable Map<String, String> map) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, map}, this, f58357a, false, 63354, new Class[]{String.class, Map.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, map}, this, f58357a, false, 63354, new Class[]{String.class, Map.class}, String.class);
        }
        Collection arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            arrayList.add(new e((String) next.getKey(), (String) next.getValue()));
        }
        String executePost = NetworkUtils.executePost(Integer.MAX_VALUE, str2, (List) arrayList);
        Intrinsics.checkExpressionValueIsNotNull(executePost, "NetworkUtils.executePost…ntry.key, entry.value) })");
        return executePost;
    }
}
