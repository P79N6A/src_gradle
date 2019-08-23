package com.ss.android.ugc.aweme.discover.api;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.SearchSugResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ExecutionException;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class SearchSugApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42094a;

    /* renamed from: b  reason: collision with root package name */
    private static IRetrofitService f42095b;

    /* renamed from: c  reason: collision with root package name */
    private static API f42096c;

    public interface API {
        @GET(a = "/aweme/v1/search/sug/")
        q<SearchSugResponse> getSearchSugList(@Query(a = "keyword") String str, @Query(a = "source") String str2);
    }

    static {
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        f42095b = iRetrofitService;
        f42096c = (API) iRetrofitService.createNewRetrofit("https://aweme.snssdk.com").create(API.class);
    }

    public static SearchSugResponse a(String str, String str2) throws Exception {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f42094a, true, 36074, new Class[]{String.class, String.class}, SearchSugResponse.class)) {
            return (SearchSugResponse) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f42094a, true, 36074, new Class[]{String.class, String.class}, SearchSugResponse.class);
        }
        try {
            return (SearchSugResponse) f42096c.getSearchSugList(str3, str4).get();
        } catch (ExecutionException e2) {
            throw f42095b.propagateCompatibleException(e2);
        }
    }
}
