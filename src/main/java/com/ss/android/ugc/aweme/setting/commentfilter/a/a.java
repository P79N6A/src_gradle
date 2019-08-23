package com.ss.android.ugc.aweme.setting.commentfilter.a;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.setting.commentfilter.api.CommentFilterApi;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012R#\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u00068BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/commentfilter/model/CommentFilterModel;", "", "mDataCenter", "Lcom/ss/android/ugc/aweme/arch/widgets/base/DataCenter;", "(Lcom/ss/android/ugc/aweme/arch/widgets/base/DataCenter;)V", "mApi", "Lcom/ss/android/ugc/aweme/setting/commentfilter/api/CommentFilterApi$API;", "kotlin.jvm.PlatformType", "getMApi", "()Lcom/ss/android/ugc/aweme/setting/commentfilter/api/CommentFilterApi$API;", "mApi$delegate", "Lkotlin/Lazy;", "getMDataCenter", "()Lcom/ss/android/ugc/aweme/arch/widgets/base/DataCenter;", "getCommentFilterKeywords", "", "setCommentFilterKeywords", "keywords", "", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63878a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f63879b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(a.class), "mApi", "getMApi()Lcom/ss/android/ugc/aweme/setting/commentfilter/api/CommentFilterApi$API;"))};

    /* renamed from: d  reason: collision with root package name */
    public static final C0692a f63880d = new C0692a((byte) 0);
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final DataCenter f63881c;

    /* renamed from: e  reason: collision with root package name */
    private final Lazy f63882e = LazyKt.lazy(c.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/setting/commentfilter/model/CommentFilterModel$Companion;", "", "()V", "LIST_KEYWORDS", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.a.a$a  reason: collision with other inner class name */
    public static final class C0692a {
        private C0692a() {
        }

        public /* synthetic */ C0692a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/setting/commentfilter/api/Words;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    public static final class b<TTaskResult, TContinuationResult> implements g<com.ss.android.ugc.aweme.setting.commentfilter.api.a, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63883a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ a f63884b;

        public b(a aVar) {
            this.f63884b = aVar;
        }

        public final /* synthetic */ Object then(i iVar) {
            i iVar2 = iVar;
            if (PatchProxy.isSupport(new Object[]{iVar2}, this, f63883a, false, 72193, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar2}, this, f63883a, false, 72193, new Class[]{i.class}, Void.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar2, AdvanceSetting.NETWORK_TYPE);
            if (iVar.c() || iVar.d()) {
                return null;
            } else if (iVar.b()) {
                DataCenter dataCenter = this.f63884b.f63881c;
                if (dataCenter != null) {
                    dataCenter.a("list_keywords", (Object) ((com.ss.android.ugc.aweme.setting.commentfilter.api.a) iVar.e()).f63899b);
                }
                return null;
            } else {
                return null;
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/setting/commentfilter/api/CommentFilterApi$API;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<CommentFilterApi.API> {
        public static final c INSTANCE = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
            super(0);
        }

        public final CommentFilterApi.API invoke() {
            return CommentFilterApi.f63897a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/base/api/BaseResponse;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    public static final class d<TTaskResult, TContinuationResult> implements g<BaseResponse, Object> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f63885a;

        /* renamed from: b  reason: collision with root package name */
        public static final d f63886b = new d();

        d() {
        }

        public final /* synthetic */ Object then(i iVar) {
            i iVar2 = iVar;
            if (PatchProxy.isSupport(new Object[]{iVar2}, this, f63885a, false, 72194, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar2}, this, f63885a, false, 72194, new Class[]{i.class}, Void.class);
            }
            Intrinsics.checkExpressionValueIsNotNull(iVar2, AdvanceSetting.NETWORK_TYPE);
            if (iVar.c() || iVar.d()) {
                return null;
            }
            iVar.b();
            return null;
        }
    }

    public final CommentFilterApi.API a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f63878a, false, 72190, new Class[0], CommentFilterApi.API.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f63878a, false, 72190, new Class[0], CommentFilterApi.API.class);
        } else {
            value = this.f63882e.getValue();
        }
        return (CommentFilterApi.API) value;
    }

    public a(@Nullable DataCenter dataCenter) {
        this.f63881c = dataCenter;
    }
}
