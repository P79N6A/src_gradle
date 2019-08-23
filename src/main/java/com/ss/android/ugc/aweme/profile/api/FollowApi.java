package com.ss.android.ugc.aweme.profile.api;

import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.http.QueryMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.global.config.settings.g;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import io.reactivex.Observable;
import java.util.HashMap;
import java.util.Map;

public final class FollowApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61317a;

    /* renamed from: b  reason: collision with root package name */
    public static final FollowService f61318b = ((FollowService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(FollowService.class));

    public interface FollowService {
        @GET("/aweme/v3/f2f/follow/")
        Call<FollowStatus> face2FaceFollow(@Query(a = "user_id") String str);

        @GET("/aweme/v1/commit/follow/user/")
        Call<FollowStatus> follow(@QueryMap Map<String, String> map);

        @GET("/aweme/v1/remove/follower/")
        Observable<BaseResponse> remove(@Query(a = "user_id") String str);
    }

    public static Observable<BaseResponse> a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f61317a, true, 67447, new Class[]{String.class}, Observable.class)) {
            return f61318b.remove(str2);
        }
        return (Observable) PatchProxy.accessDispatch(new Object[]{str2}, null, f61317a, true, 67447, new Class[]{String.class}, Observable.class);
    }

    public static FollowStatus a(String str, String str2, int i, int i2, int i3, @Nullable String str3, int i4) throws Exception {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str6, Integer.valueOf(i4)}, null, f61317a, true, 67445, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, FollowStatus.class)) {
            return (FollowStatus) PatchProxy.accessDispatch(new Object[]{str4, str5, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str6, Integer.valueOf(i4)}, null, f61317a, true, 67445, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, FollowStatus.class);
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str2) || g.b().bF().intValue() == 0) {
            hashMap.put("user_id", str4);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("sec_user_id", str5);
        }
        hashMap.put("type", String.valueOf(i));
        hashMap.put("channel_id", String.valueOf(i3));
        if (i2 != -1) {
            hashMap.put("from", String.valueOf(i2));
            hashMap.put("from_pre", String.valueOf(i4));
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("item_id", str6);
        }
        FollowStatus followStatus = (FollowStatus) f61318b.follow(hashMap).execute().body();
        followStatus.userId = str4;
        return followStatus;
    }
}
