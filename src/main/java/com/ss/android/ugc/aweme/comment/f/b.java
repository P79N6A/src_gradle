package com.ss.android.ugc.aweme.comment.f;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0005J\u000e\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\u0007J\u000e\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\rJ\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\rJ\u000e\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0006\u0010\u0006\u001a\u00020\tJ\u0006\u0010\u001b\u001a\u00020\tR\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/ss/android/ugc/aweme/comment/statistics/CommentSupportStatistics;", "", "()V", "map", "Ljava/util/concurrent/ConcurrentHashMap;", "", "start", "", "end", "", "reset", "setActualReturnCount", "actualReturnCount", "", "setGroupId", "groupId", "setMethodName", "methodName", "setOffset", "offset", "setRequireCount", "requireCount", "setTotalCount", "totalCount", "setup", "response", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "upload", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36441a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap<String, String> f36442b = new ConcurrentHashMap<>();

    /* renamed from: c  reason: collision with root package name */
    private long f36443c;

    private void c() {
        if (PatchProxy.isSupport(new Object[0], this, f36441a, false, 27398, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36441a, false, 27398, new Class[0], Void.TYPE);
            return;
        }
        this.f36442b.clear();
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f36441a, false, 27399, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36441a, false, 27399, new Class[0], Void.TYPE);
            return;
        }
        c();
        this.f36443c = System.currentTimeMillis();
        this.f36442b.put("TimeStamp", String.valueOf(this.f36443c));
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f36441a, false, 27408, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36441a, false, 27408, new Class[0], Void.TYPE);
            return;
        }
        if (!this.f36442b.containsKey("UserId")) {
            IAccountUserService a2 = d.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
            if (a2.isLogin()) {
                IAccountUserService a3 = d.a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "AccountUserProxyService.get()");
                String curUserId = a3.getCurUserId();
                Intrinsics.checkExpressionValueIsNotNull(curUserId, "AccountUserProxyService.get().curUserId");
                this.f36442b.put("UserId", curUserId);
            }
        }
        if (!this.f36442b.containsKey("DeviceId")) {
            String b2 = com.ss.android.d.d.b();
            Intrinsics.checkExpressionValueIsNotNull(b2, "DeviceRegisterManager.getDeviceId()");
            this.f36442b.put("UserId", b2);
        }
        try {
            n.a("aweme_comment_list_api_monitor_log", new JSONObject(this.f36442b));
        } catch (Throwable unused) {
        }
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f36441a, false, 27405, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f36441a, false, 27405, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f36442b.put("ActualReturnCount", String.valueOf(i));
    }

    public final void b(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f36441a, false, 27406, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f36441a, false, 27406, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f36442b.put("TotalCount", String.valueOf(i));
    }

    public final void a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f36441a, false, 27404, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f36441a, false, 27404, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        this.f36442b.put("Offset", String.valueOf(j));
    }

    public final void a(@NotNull BaseResponse baseResponse) {
        if (PatchProxy.isSupport(new Object[]{baseResponse}, this, f36441a, false, 27407, new Class[]{BaseResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{baseResponse}, this, f36441a, false, 27407, new Class[]{BaseResponse.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(baseResponse, "response");
        if (baseResponse instanceof BaseCommentResponse) {
            LogPbBean logPbBean = ((BaseCommentResponse) baseResponse).logPd;
            if (logPbBean != null) {
                String imprId = logPbBean.getImprId();
                if (imprId != null) {
                    this.f36442b.put("LogID", imprId);
                }
            }
        }
        this.f36442b.put("ErrorCode", String.valueOf(baseResponse.status_code));
    }

    public final void b(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f36441a, false, 27402, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f36441a, false, 27402, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "groupId");
        this.f36442b.put("GroupId", str2);
    }

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f36441a, false, 27401, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f36441a, false, 27401, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "methodName");
        this.f36442b.put("MethodName", str2);
    }
}
