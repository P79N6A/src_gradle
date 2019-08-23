package com.ss.android.ugc.aweme.freeflowcard.freeflowmember;

import com.bytedance.frameworks.baselib.network.http.retrofit.converter.gson.GsonConverterFactory;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.Converter;
import com.bytedance.retrofit2.Retrofit;
import com.bytedance.retrofit2.client.Client;
import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.ttnet.retrofit.SsRetrofitClient;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Executor;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0018B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0012R#\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048FX\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/TelecomApi;", "", "()V", "api", "Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/TelecomApi$ITelecomApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/TelecomApi$ITelecomApi;", "api$delegate", "Lkotlin/Lazy;", "provider", "Lcom/bytedance/retrofit2/client/Client$Provider;", "getProvider", "()Lcom/bytedance/retrofit2/client/Client$Provider;", "getTelecomOpenIdData", "Lcom/bytedance/retrofit2/Call;", "Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/TelecomOpenIdDataResponse;", "clientId", "", "clientType", "format", "version", "sign", "timestamp", "ITelecomApi", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class TelecomApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48643a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f48644b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(TelecomApi.class), "api", "getApi()Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/TelecomApi$ITelecomApi;"))};
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    static final Client.Provider f48645c = b.f48649b;

    /* renamed from: d  reason: collision with root package name */
    static final Lazy f48646d = LazyKt.lazy(a.INSTANCE);

    /* renamed from: e  reason: collision with root package name */
    public static final TelecomApi f48647e = new TelecomApi();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001JJ\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\u00062\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u000b\u001a\u00020\u0006H'¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/TelecomApi$ITelecomApi;", "", "getTelecomOpenId", "Lcom/bytedance/retrofit2/Call;", "Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/TelecomOpenIdDataResponse;", "clientId", "", "clientType", "format", "version", "sign", "timestamp", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface ITelecomApi {
        @FormUrlEncoded
        @POST("http://open.e.189.cn/openapi/flow/getOpenId.do")
        @NotNull
        Call<TelecomOpenIdDataResponse> getTelecomOpenId(@Field(a = "clientId") @NotNull String str, @Field(a = "clientType") @NotNull String str2, @Field(a = "format") @NotNull String str3, @Field(a = "version") @NotNull String str4, @Field(a = "sign") @NotNull String str5, @Field(a = "timestamp") @NotNull String str6);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/freeflowcard/freeflowmember/TelecomApi$ITelecomApi;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class a extends Lambda implements Function0<ITelecomApi> {
        public static final a INSTANCE = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
            super(0);
        }

        public final ITelecomApi invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 46124, new Class[0], ITelecomApi.class)) {
                return (ITelecomApi) new Retrofit.a().a(TelecomApi.f48645c).a("http://open.e.189.cn").a((Executor) new com.bytedance.frameworks.baselib.network.http.retrofit.a()).a((Converter.Factory) GsonConverterFactory.create()).a().create(ITelecomApi.class);
            }
            return (ITelecomApi) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 46124, new Class[0], ITelecomApi.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/bytedance/ttnet/retrofit/SsRetrofitClient;", "get"}, k = 3, mv = {1, 1, 15})
    static final class b implements Client.Provider {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f48648a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f48649b = new b();

        b() {
        }

        public final /* synthetic */ Client get() {
            SsRetrofitClient ssRetrofitClient;
            if (PatchProxy.isSupport(new Object[0], this, f48648a, false, 46125, new Class[0], SsRetrofitClient.class)) {
                ssRetrofitClient = (SsRetrofitClient) PatchProxy.accessDispatch(new Object[0], this, f48648a, false, 46125, new Class[0], SsRetrofitClient.class);
            } else {
                ssRetrofitClient = new SsRetrofitClient();
            }
            return ssRetrofitClient;
        }
    }

    private TelecomApi() {
    }
}
