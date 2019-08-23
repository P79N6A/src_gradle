package com.ss.android.ugc.aweme.commercialize.api;

import android.text.TextUtils;
import com.google.common.util.concurrent.q;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.io.Serializable;
import retrofit2.http.GET;

public final class DouPlusRefundApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38492a;

    public interface IApi {
        @GET(a = "/aweme/v2/douplus/refund/check/")
        q<a> check();
    }

    public static class a implements Serializable {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("can_refund")
        public boolean canRefund;
        @SerializedName("url")
        public String url;

        public String getFullUrl() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 30418, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 30418, new Class[0], String.class);
            } else if (!hasUrl()) {
                return null;
            } else {
                return "https://aweme.snssdk.com" + this.url;
            }
        }

        public boolean hasUrl() {
            boolean z = false;
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 30417, new Class[0], Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 30417, new Class[0], Boolean.TYPE)).booleanValue();
            }
            if (!TextUtils.isEmpty(this.url)) {
                z = true;
            }
            return z;
        }
    }

    public static q<a> a() {
        if (PatchProxy.isSupport(new Object[0], null, f38492a, true, 30416, new Class[0], q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[0], null, f38492a, true, 30416, new Class[0], q.class);
        }
        return ((IApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(IApi.class)).check();
    }
}
