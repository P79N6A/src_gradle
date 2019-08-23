package com.ss.android.ugc.aweme.profile.api;

import a.g;
import a.i;
import android.arch.lifecycle.MutableLiveData;
import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ap.a;
import com.ss.android.ugc.aweme.base.sharedpref.c;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.main.bm;
import com.ss.android.ugc.aweme.profile.model.ActivityLinkResponse;
import java.util.concurrent.Callable;
import retrofit2.http.GET;

public final class ActivityLinkManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61301a;

    interface ActivityLinkApi {
        @GET(a = "/aweme/v1/activity/profile_link/")
        q<ActivityLinkResponse> getLinkInfo();
    }

    public static void a(MutableLiveData<a<ActivityLinkResponse>> mutableLiveData) {
        MutableLiveData<a<ActivityLinkResponse>> mutableLiveData2 = mutableLiveData;
        if (PatchProxy.isSupport(new Object[]{mutableLiveData2}, null, f61301a, true, 67423, new Class[]{MutableLiveData.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mutableLiveData2}, null, f61301a, true, 67423, new Class[]{MutableLiveData.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new a<TResult>((ActivityLinkApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(ActivityLinkApi.class))).a((g<TResult, TContinuationResult>) new b<TResult,TContinuationResult>(mutableLiveData2), i.f1052b);
    }

    public static boolean a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f61301a, true, 67424, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f61301a, true, 67424, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        }
        bm bmVar = (bm) c.a(context2, bm.class);
        if (bmVar == null) {
            return false;
        }
        return TextUtils.equals(bmVar.a(""), "true");
    }
}
