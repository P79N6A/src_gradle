package com.ss.android.ugc.aweme.discover.d.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.discover.api.HotSearchApi;
import com.ss.android.ugc.aweme.discover.model.HotSearchEntity;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.discover.model.HotSearchListResponse;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0014¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/repo/fetcher/HotSearchWordsFetcher;", "Lcom/bytedance/jedi/model/fetcher/SimpleFetcher;", "", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchListResponse;", "()V", "requestActual", "Lio/reactivex/Observable;", "req", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c extends com.bytedance.jedi.model.d.c<Integer, HotSearchListResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42224a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchListResponse;", "it", "apply"}, k = 3, mv = {1, 1, 15})
    static final class a<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42225a;

        /* renamed from: b  reason: collision with root package name */
        public static final a f42226b = new a();

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            HotSearchListResponse hotSearchListResponse = (HotSearchListResponse) obj;
            if (PatchProxy.isSupport(new Object[]{hotSearchListResponse}, this, f42225a, false, 37363, new Class[]{HotSearchListResponse.class}, HotSearchListResponse.class)) {
                return (HotSearchListResponse) PatchProxy.accessDispatch(new Object[]{hotSearchListResponse}, this, f42225a, false, 37363, new Class[]{HotSearchListResponse.class}, HotSearchListResponse.class);
            }
            Intrinsics.checkParameterIsNotNull(hotSearchListResponse, AdvanceSetting.NETWORK_TYPE);
            HotSearchEntity data = hotSearchListResponse.getData();
            Intrinsics.checkExpressionValueIsNotNull(data, "it.data");
            for (HotSearchItem logPb : data.getList()) {
                logPb.setLogPb(hotSearchListResponse.getLogPb());
            }
            return hotSearchListResponse;
        }
    }

    public final /* synthetic */ Observable b(Object obj) {
        int intValue = ((Number) obj).intValue();
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(intValue)}, this, f42224a, false, 37362, new Class[]{Integer.TYPE}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(intValue)}, this, f42224a, false, 37362, new Class[]{Integer.TYPE}, Observable.class);
        }
        Observable subscribeOn = HotSearchApi.a.a().getHotSearchList(Integer.valueOf(intValue), 0, "").map(a.f42226b).subscribeOn(Schedulers.io());
        Intrinsics.checkExpressionValueIsNotNull(subscribeOn, "HotSearchApi.INSTANCE.ge…scribeOn(Schedulers.io())");
        return subscribeOn;
    }
}
