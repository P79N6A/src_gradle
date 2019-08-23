package com.ss.android.ugc.aweme.commercialize.api;

import com.google.common.util.concurrent.q;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.Required;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.io.Serializable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class CouponRedeemApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38490a;

    /* renamed from: b  reason: collision with root package name */
    private static RetroApi f38491b;

    public interface RetroApi {
        @GET(a = "/aweme/v2/coupon/qrcode/detail/")
        q<b> getCouponDetail(@Query(a = "code_id") String str);

        @GET(a = "/aweme/v2/coupon/validate/")
        q<c> redeemCoupon(@Query(a = "code_id") String str);
    }

    public static class a extends com.ss.android.ugc.aweme.base.api.c implements Serializable {
        @SerializedName("user_avatar")
        @Required
        public UrlModel avatar;
        @SerializedName("head_image_url")
        @Required
        public UrlModel headImage;
        @SerializedName("merchant_name")
        @Required
        public String merchantName;
        @SerializedName("title")
        @Required
        public String title;
        @SerializedName("username")
        @Required
        public String username;
    }

    public static class b implements Serializable {
        @SerializedName("coupon")
        public a coupon;
        @SerializedName("status_code")
        public int statusCode;
        @SerializedName("status_msg")
        public String statusMsg;
    }

    public static class c implements Serializable {
        @SerializedName("status_code")
        public int statusCode;
        @SerializedName("status_msg")
        public String statusMsg;
    }

    public static RetroApi a() {
        if (PatchProxy.isSupport(new Object[0], null, f38490a, true, 30415, new Class[0], RetroApi.class)) {
            return (RetroApi) PatchProxy.accessDispatch(new Object[0], null, f38490a, true, 30415, new Class[0], RetroApi.class);
        }
        if (f38491b == null) {
            synchronized (CouponRedeemApi.class) {
                if (f38491b == null) {
                    f38491b = (RetroApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RetroApi.class);
                }
            }
        }
        return f38491b;
    }

    public static q<b> a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f38490a, true, 30413, new Class[]{String.class}, q.class)) {
            return a().getCouponDetail(str2);
        }
        return (q) PatchProxy.accessDispatch(new Object[]{str2}, null, f38490a, true, 30413, new Class[]{String.class}, q.class);
    }
}
