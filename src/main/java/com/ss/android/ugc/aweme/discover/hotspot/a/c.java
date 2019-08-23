package com.ss.android.ugc.aweme.discover.hotspot.a;

import com.bytedance.jedi.model.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.api.HotSearchApi;
import com.ss.android.ugc.aweme.discover.model.HotSearchEntity;
import com.ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.ss.android.ugc.aweme.discover.model.HotSearchListResponse;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\u0018\u00002 \u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0001B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H\u0014J \u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0005H\u0014J\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\u0006\u0010\f\u001a\u00020\u0002H\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/hotspot/data/HotSpotsFetcher;", "Lcom/bytedance/jedi/model/fetcher/AbstractFetcher;", "", "", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchItem;", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchListResponse;", "type", "", "(I)V", "getType", "()I", "convertKeyActual", "req", "convertValActual", "resp", "requestActual", "Lio/reactivex/Observable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class c extends a<String, List<? extends HotSearchItem>, String, HotSearchListResponse> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42433a;

    /* renamed from: b  reason: collision with root package name */
    public final int f42434b;

    public c(int i) {
        this.f42434b = i;
    }

    public final /* synthetic */ Observable b(Object obj) {
        String str = (String) obj;
        if (PatchProxy.isSupport(new Object[]{str}, this, f42433a, false, 36574, new Class[]{String.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{str}, this, f42433a, false, 36574, new Class[]{String.class}, Observable.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "req");
        Observable subscribeOn = HotSearchApi.a.a().getHotSearchList(1, Integer.valueOf(this.f42434b), str).subscribeOn(Schedulers.io());
        Intrinsics.checkExpressionValueIsNotNull(subscribeOn, "HotSearchApi.INSTANCE.ge…scribeOn(Schedulers.io())");
        return subscribeOn;
    }

    public final /* synthetic */ Object c(Object obj) {
        String str = (String) obj;
        if (PatchProxy.isSupport(new Object[]{str}, this, f42433a, false, 36572, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str}, this, f42433a, false, 36572, new Class[]{String.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "req");
        return str;
    }

    public final /* synthetic */ Object a(Object obj, Object obj2) {
        String str = (String) obj;
        HotSearchListResponse hotSearchListResponse = (HotSearchListResponse) obj2;
        if (PatchProxy.isSupport(new Object[]{str, hotSearchListResponse}, this, f42433a, false, 36573, new Class[]{String.class, HotSearchListResponse.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str, hotSearchListResponse}, this, f42433a, false, 36573, new Class[]{String.class, HotSearchListResponse.class}, List.class);
        }
        Intrinsics.checkParameterIsNotNull(str, "req");
        Intrinsics.checkParameterIsNotNull(hotSearchListResponse, "resp");
        HotSearchEntity data = hotSearchListResponse.getData();
        Intrinsics.checkExpressionValueIsNotNull(data, "resp.data");
        return data.getList();
    }
}
