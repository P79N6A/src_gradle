package com.ss.android.ugc.aweme.profile.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.followrequest.api.FollowRequestApiManager;
import com.ss.android.ugc.aweme.followrequest.model.FollowRequestResponse;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0003J!\u0010\u000e\u001a\u00020\u00052\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00110\u0010\"\u00020\u0011H\u0014¢\u0006\u0002\u0010\u0012J\"\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0002J\u0006\u0010\u0019\u001a\u00020\u0014J\u0012\u0010\u001a\u001a\u00020\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002H\u0014J\u0006\u0010\u001c\u001a\u00020\u0014J\u0006\u0010\u001d\u001a\u00020\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u0006\"\u0004\b\n\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/presenter/FollowRequestModel;", "Lcom/ss/android/ugc/aweme/common/BaseModel;", "Lcom/ss/android/ugc/aweme/followrequest/model/FollowRequestResponse;", "()V", "isLoadMore", "", "()Z", "setLoadMore", "(Z)V", "isLoadSummary", "setLoadSummary", "mMaxTime", "", "mMinTime", "checkParams", "params", "", "", "([Ljava/lang/Object;)Z", "fetchFollowRequest", "", "maxTime", "minTime", "count", "", "getSummary", "handleData", "data", "loadMore", "refresh", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class j extends com.ss.android.ugc.aweme.common.a<FollowRequestResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61640a;

    /* renamed from: f  reason: collision with root package name */
    public static final a f61641f = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public long f61642b;

    /* renamed from: c  reason: collision with root package name */
    public long f61643c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f61644d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f61645e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/presenter/FollowRequestModel$Companion;", "", "()V", "COUNT", "", "COUNT_SUMMARY", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/followrequest/model/FollowRequestResponse;", "kotlin.jvm.PlatformType", "call"}, k = 3, mv = {1, 1, 15})
    static final class b<V> implements Callable<FollowRequestResponse> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f61646a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ long f61647b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ long f61648c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f61649d;

        b(long j, long j2, int i) {
            this.f61647b = j;
            this.f61648c = j2;
            this.f61649d = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public FollowRequestResponse call() {
            if (PatchProxy.isSupport(new Object[0], this, f61646a, false, 67593, new Class[0], FollowRequestResponse.class)) {
                return (FollowRequestResponse) PatchProxy.accessDispatch(new Object[0], this, f61646a, false, 67593, new Class[0], FollowRequestResponse.class);
            }
            try {
                return FollowRequestApiManager.a(this.f61647b, this.f61648c, this.f61649d);
            } catch (ExecutionException e2) {
                RuntimeException a2 = m.a(e2);
                Intrinsics.checkExpressionValueIsNotNull(a2, "RetrofitFactory.getCompatibleException(e)");
                throw a2;
            }
        }
    }

    public final boolean checkParams(@NotNull Object... objArr) {
        Object obj = objArr;
        if (PatchProxy.isSupport(new Object[]{obj}, this, f61640a, false, 67590, new Class[]{Object[].class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f61640a, false, 67590, new Class[]{Object[].class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(obj, "params");
        return true;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f61640a, false, 67588, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61640a, false, 67588, new Class[0], Void.TYPE);
            return;
        }
        this.f61642b = System.currentTimeMillis() / 1000;
        this.f61643c = 1;
        this.f61645e = false;
        this.f61644d = false;
        a(this.f61642b, this.f61643c, 20);
    }

    public final /* synthetic */ void handleData(Object obj) {
        FollowRequestResponse followRequestResponse = (FollowRequestResponse) obj;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{followRequestResponse}, this, f61640a, false, 67592, new Class[]{FollowRequestResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followRequestResponse}, this, f61640a, false, 67592, new Class[]{FollowRequestResponse.class}, Void.TYPE);
        } else if (followRequestResponse == null) {
            this.mData = null;
        } else {
            Collection collection = followRequestResponse.userRequestList;
            if (collection != null && !collection.isEmpty()) {
                z = false;
            }
            if (z) {
                followRequestResponse.hasMore = false;
            }
            if (!this.f61644d || this.mData == null) {
                this.mData = followRequestResponse;
                return;
            }
            this.f61642b = followRequestResponse.maxTime;
            this.f61643c = followRequestResponse.minTime;
            ((FollowRequestResponse) this.mData).maxTime = followRequestResponse.maxTime;
            ((FollowRequestResponse) this.mData).minTime = followRequestResponse.minTime;
            ((FollowRequestResponse) this.mData).hasMore = followRequestResponse.hasMore;
            List<User> list = ((FollowRequestResponse) this.mData).userRequestList;
            List<User> list2 = followRequestResponse.userRequestList;
            Intrinsics.checkExpressionValueIsNotNull(list2, "data.userRequestList");
            list.addAll(list2);
        }
    }

    public final void a(long j, long j2, int i) {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), 20}, this, f61640a, false, 67591, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {new Long(j3), new Long(j4), 20};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f61640a, false, 67591, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        b bVar = new b(j, j2, 20);
        com.ss.android.ugc.aweme.base.m.a().a(this.mHandler, bVar, 0);
    }
}
