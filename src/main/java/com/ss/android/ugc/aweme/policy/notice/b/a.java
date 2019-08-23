package com.ss.android.ugc.aweme.policy.notice.b;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.policy.notice.api.PolicyNoticeApi;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nJ.\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u000f\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\rR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/policy/notice/model/PolicyNoticeModel;", "", "()V", "mApi", "Lcom/ss/android/ugc/aweme/policy/notice/api/PolicyNoticeApi$API;", "getMApi", "()Lcom/ss/android/ugc/aweme/policy/notice/api/PolicyNoticeApi$API;", "mApi$delegate", "Lkotlin/Lazy;", "getPolicyNotice", "", "policyNoticeApprove", "business", "", "policyVersion", "style", "extra", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61095a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f61096b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "mApi", "getMApi()Lcom/ss/android/ugc/aweme/policy/notice/api/PolicyNoticeApi$API;"))};

    /* renamed from: c  reason: collision with root package name */
    public final Lazy f61097c = LazyKt.lazy(C0674a.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/policy/notice/api/PolicyNoticeApi$API;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.policy.notice.b.a$a  reason: collision with other inner class name */
    static final class C0674a extends Lambda implements Function0<PolicyNoticeApi.API> {
        public static final C0674a INSTANCE = new C0674a();
        public static ChangeQuickRedirect changeQuickRedirect;

        C0674a() {
            super(0);
        }

        @NotNull
        public final PolicyNoticeApi.API invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 67086, new Class[0], PolicyNoticeApi.API.class)) {
                return PolicyNoticeApi.f61081a;
            }
            return (PolicyNoticeApi.API) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 67086, new Class[0], PolicyNoticeApi.API.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    public static final class b<TTaskResult, TContinuationResult> implements g<BaseResponse, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f61098a = new b();

        b() {
        }

        public final /* bridge */ /* synthetic */ Object then(i iVar) {
            return null;
        }
    }
}
