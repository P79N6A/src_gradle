package com.ss.android.ugc.aweme.discover.hitrank;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.utils.dr;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u0005\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\nJ\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\nJ&\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\n2\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0011R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hitrank/RankTaskManager;", "", "()V", "activityApi", "Lcom/ss/android/ugc/aweme/discover/hitrank/RankApi;", "afterHitRank", "", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "actionType", "", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "sendRealRequest", "uid", "", "hashTagNames", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42391a;

    /* renamed from: b  reason: collision with root package name */
    static RankApi f42392b;

    /* renamed from: c  reason: collision with root package name */
    public static final f f42393c = new f();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 15})
    static final class a<V> implements Callable<TResult> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42394a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f42395b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f42396c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ List f42397d;

        a(String str, int i, List list) {
            this.f42395b = str;
            this.f42396c = i;
            this.f42397d = list;
        }

        public final /* synthetic */ Object call() {
            if (PatchProxy.isSupport(new Object[0], this, f42394a, false, 36407, new Class[0], BaseResponse.class)) {
                return (BaseResponse) PatchProxy.accessDispatch(new Object[0], this, f42394a, false, 36407, new Class[0], BaseResponse.class);
            }
            f fVar = f.f42393c;
            RankApi rankApi = f.f42392b;
            if (rankApi == null) {
                Intrinsics.throwNpe();
            }
            return (BaseResponse) rankApi.finishHitRankTask(this.f42395b, 1, this.f42396c, this.f42397d, dr.a().a(this.f42395b)).get();
        }
    }

    private f() {
    }

    public final void a(@NotNull String str, int i) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, this, f42391a, false, 36406, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, this, f42391a, false, 36406, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "uid");
        f42393c.a(str2, i, null);
    }

    public final void a(@Nullable Aweme aweme, int i) {
        String str;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{aweme, Integer.valueOf(i)}, this, f42391a, false, 36403, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme, Integer.valueOf(i)}, this, f42391a, false, 36403, new Class[]{Aweme.class, Integer.TYPE}, Void.TYPE);
        } else if (!com.ss.android.g.a.a()) {
            StringBuilder sb = new StringBuilder();
            User user = null;
            if (aweme != null) {
                str = aweme.getDesc();
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(" : ");
            sb.append(i2);
            if (i2 != 0) {
                if (aweme != null) {
                    user = aweme.getAuthor();
                }
                if (user != null) {
                    a(aweme.getAuthor(), i2);
                }
            }
        }
    }

    public final void a(@Nullable User user, int i) {
        String str;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(i)}, this, f42391a, false, 36404, new Class[]{User.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(i)}, this, f42391a, false, 36404, new Class[]{User.class, Integer.TYPE}, Void.TYPE);
        } else if (!com.ss.android.g.a.a()) {
            StringBuilder sb = new StringBuilder();
            if (user != null) {
                str = user.getNickname();
            } else {
                str = null;
            }
            sb.append(str);
            sb.append(" : ");
            sb.append(i2);
            if (user == null || !a.a(user)) {
                return;
            }
            String uid = user.getUid();
            Intrinsics.checkExpressionValueIsNotNull(uid, "user.uid");
            a(uid, i2);
        }
    }

    public final void a(@NotNull String str, int i, @Nullable List<String> list) {
        String str2 = str;
        List<String> list2 = list;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), list2}, this, f42391a, false, 36405, new Class[]{String.class, Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), list2}, this, f42391a, false, 36405, new Class[]{String.class, Integer.TYPE, List.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "uid");
        IAccountUserService a2 = d.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
        if (a2.isLogin()) {
            if (f42392b == null) {
                f42392b = (RankApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RankApi.class);
            }
            i.a((Callable<TResult>) new a<TResult>(str2, i, list2));
        }
    }
}
