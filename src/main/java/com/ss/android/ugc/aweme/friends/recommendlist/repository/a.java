package com.ss.android.ugc.aweme.friends.recommendlist.repository;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0014J\u001a\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0002H\u0014J\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/DislikeRecommendFetcher;", "Lcom/bytedance/jedi/model/fetcher/AbstractFetcher;", "", "()V", "service", "Lcom/ss/android/ugc/aweme/friends/recommendlist/repository/RecommendApi;", "convertKeyActual", "req", "convertValActual", "resp", "requestActual", "Lio/reactivex/Observable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a extends com.bytedance.jedi.model.d.a<String, String, String, String> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48987a;

    /* renamed from: b  reason: collision with root package name */
    private final RecommendApi f48988b = RecommendApi.f48981a.a();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "", "apply", "(Lkotlin/Unit;)Ljava/lang/String;"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.friends.recommendlist.repository.a$a  reason: collision with other inner class name */
    static final class C0583a<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48989a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ String f48990b;

        C0583a(String str) {
            this.f48990b = str;
        }

        public final /* synthetic */ Object apply(Object obj) {
            Unit unit = (Unit) obj;
            if (PatchProxy.isSupport(new Object[]{unit}, this, f48989a, false, 46748, new Class[]{Unit.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{unit}, this, f48989a, false, 46748, new Class[]{Unit.class}, String.class);
            }
            Intrinsics.checkParameterIsNotNull(unit, AdvanceSetting.NETWORK_TYPE);
            return this.f48990b;
        }
    }

    public final /* synthetic */ Observable b(Object obj) {
        String str = (String) obj;
        if (PatchProxy.isSupport(new Object[]{str}, this, f48987a, false, 46745, new Class[]{String.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{str}, this, f48987a, false, 46745, new Class[]{String.class}, Observable.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "req");
        Observable map = this.f48988b.dislikeRecommend(str).map(new C0583a(str));
        Intrinsics.checkExpressionValueIsNotNull(map, "service.dislikeRecommend(req).map { req }");
        return map;
    }

    public final /* synthetic */ Object c(Object obj) {
        String str = (String) obj;
        if (PatchProxy.isSupport(new Object[]{str}, this, f48987a, false, 46746, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f48987a, false, 46746, new Class[]{String.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "req");
        return str;
    }

    public final /* synthetic */ Object a(Object obj, Object obj2) {
        String str = (String) obj;
        String str2 = (String) obj2;
        if (PatchProxy.isSupport(new Object[]{str, str2}, this, f48987a, false, 46747, new Class[]{String.class, String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str, str2}, this, f48987a, false, 46747, new Class[]{String.class, String.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "req");
        Intrinsics.checkParameterIsNotNull(str2, "resp");
        return str2;
    }
}
