package com.ss.android.ugc.aweme.freeflowcard.data;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00032\u00020\u0001:\u0002\u0003\u0004B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/freeflowcard/data/FreeflowNoticeApi;", "", "()V", "Companion", "NoticeApi", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class FreeflowNoticeApi {

    /* renamed from: a  reason: collision with root package name */
    public static IRetrofitService f48598a;

    /* renamed from: b  reason: collision with root package name */
    public static NoticeApi f48599b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f48600c = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bb\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006\u0007"}, d2 = {"Lcom/ss/android/ugc/aweme/freeflowcard/data/FreeflowNoticeApi$NoticeApi;", "", "sendNotice", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "oid", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    interface NoticeApi {
        @NotNull
        @GET(a = "/aweme/v1/notice/send/")
        q<BaseResponse> sendNotice(@NotNull @Query(a = "oid") String str);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/freeflowcard/data/FreeflowNoticeApi$Companion;", "", "()V", "NOTICE_API", "", "api", "Lcom/ss/android/ugc/aweme/freeflowcard/data/FreeflowNoticeApi$NoticeApi;", "retrofitService", "Lcom/ss/android/ugc/aweme/framework/services/IRetrofitService;", "sendNotice", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "oid", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48601a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @NotNull
        public final q<BaseResponse> a(@NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f48601a, false, 46068, new Class[]{String.class}, q.class)) {
                return (q) PatchProxy.accessDispatch(new Object[]{str2}, this, f48601a, false, 46068, new Class[]{String.class}, q.class);
            }
            Intrinsics.checkParameterIsNotNull(str2, "oid");
            try {
                return FreeflowNoticeApi.f48599b.sendNotice(str2);
            } catch (ExecutionException e2) {
                RuntimeException propagateCompatibleException = FreeflowNoticeApi.f48598a.propagateCompatibleException(e2);
                Intrinsics.checkExpressionValueIsNotNull(propagateCompatibleException, "retrofitService.propagateCompatibleException(e)");
                throw propagateCompatibleException;
            }
        }
    }

    static {
        Object service = ServiceManager.get().getService(IRetrofitService.class);
        Intrinsics.checkExpressionValueIsNotNull(service, "ServiceManager.get().get…rofitService::class.java)");
        IRetrofitService iRetrofitService = (IRetrofitService) service;
        f48598a = iRetrofitService;
        Object create = iRetrofitService.createNewRetrofit("https://aweme.snssdk.com").create(NoticeApi.class);
        Intrinsics.checkExpressionValueIsNotNull(create, "retrofitService.createNe…te(NoticeApi::class.java)");
        f48599b = (NoticeApi) create;
    }
}
