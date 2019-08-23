package com.ss.android.ugc.aweme.profile.viewmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.api.RoomRetrofitApi;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/profile/viewmodel/LiveViewModel;", "", "()V", "api", "Lcom/ss/android/ugc/aweme/profile/api/RoomRetrofitApi;", "kotlin.jvm.PlatformType", "roomInfo", "Lio/reactivex/Observable;", "Lcom/ss/android/ugc/aweme/profile/model/RoomResponse;", "roomId", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63183a;

    /* renamed from: b  reason: collision with root package name */
    public final RoomRetrofitApi f63184b = ((RoomRetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://webcast-hl.amemv.com").create(RoomRetrofitApi.class));
}
