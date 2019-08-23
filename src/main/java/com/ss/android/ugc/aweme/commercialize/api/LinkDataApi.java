package com.ss.android.ugc.aweme.commercialize.api;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.List;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class LinkDataApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38496a;

    /* renamed from: b  reason: collision with root package name */
    private static final RealApi f38497b = ((RealApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RealApi.class));

    interface RealApi {
        @GET(a = "https://aweme.snssdk.com/api/ad/v1/adlink/")
        i<c> requestLinkData(@Query(a = "ad_from") String str, @Query(a = "item_ids") String str2);
    }

    public static void a(String str, List<Aweme> list) {
        String str2 = str;
        List<Aweme> list2 = list;
        if (PatchProxy.isSupport(new Object[]{str2, list2}, null, f38496a, true, 30420, new Class[]{String.class, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, list2}, null, f38496a, true, 30420, new Class[]{String.class, List.class}, Void.TYPE);
        } else if (list2 != null && !list.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                if (list2.get(i).needPreloadAdLink()) {
                    sb.append(list2.get(i).getAid());
                    sb.append(",");
                }
            }
            if (sb.length() > 1) {
                String substring = sb.substring(0, sb.length() - 1);
                if (PatchProxy.isSupport(new Object[]{str2, substring}, null, f38496a, true, 30421, new Class[]{String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{str2, substring}, null, f38496a, true, 30421, new Class[]{String.class, String.class}, Void.TYPE);
                } else if (str2 != null && str.length() != 0 && substring != null && substring.length() != 0) {
                    f38497b.requestLinkData(str2, substring).a(b.f38500b);
                }
            }
        }
    }
}
