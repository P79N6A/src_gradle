package com.ss.android.ugc.aweme.account.login.twostep;

import a.i;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J&\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006J \u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\r\u001a\u00020\u0006JT\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00062\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthApi;", "", "()V", "DEBUG", "", "TAG", "", "api", "Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthApi$Api;", "verifyPassword", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthApi$TwoStepApiResponse;", "verifyTicket", "aid", "encryptedPass", "verifySms", "verifyThirdParty", "platform", "code", "state", "openId", "accessToken", "expiresIn", "Api", "TwoStepApiResponse", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public final class TwoStepAuthApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32266a;

    /* renamed from: b  reason: collision with root package name */
    public static final TwoStepAuthApi f32267b = new TwoStepAuthApi();

    /* renamed from: c  reason: collision with root package name */
    private static final boolean f32268c = com.ss.android.ugc.aweme.g.a.a();

    /* renamed from: d  reason: collision with root package name */
    private static Api f32269d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\bf\u0018\u00002\u00020\u0001J:\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00062\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\t\u001a\u00020\u0006H'J$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H'Jb\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\u00062\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0006H'¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthApi$Api;", "", "verifyPassword", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthApi$TwoStepApiResponse;", "verify_ticket", "", "aid", "encryptedPass", "mixMode", "verifySms", "verifyThirdParty", "platform", "code", "state", "openId", "accessToken", "expiresIn", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public interface Api {
        @NotNull
        @GET(a = "/passport/account/verify/")
        i<a> verifyPassword(@Nullable @Query(a = "verify_ticket") String str, @NotNull @Query(a = "aid") String str2, @Nullable @Query(a = "password") String str3, @NotNull @Query(a = "mix_mode") String str4);

        @NotNull
        @GET(a = "/passport/upsms/verify/")
        i<a> verifySms(@Nullable @Query(a = "verify_ticket") String str, @NotNull @Query(a = "aid") String str2);

        @NotNull
        @GET(a = "/passport/auth/verify/")
        i<a> verifyThirdParty(@Nullable @Query(a = "verify_ticket") String str, @Nullable @Query(a = "platform") String str2, @Nullable @Query(a = "code") String str3, @Nullable @Query(a = "state") String str4, @Nullable @Query(a = "openId") String str5, @Nullable @Query(a = "access_token") String str6, @Nullable @Query(a = "expires_in") String str7);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\b\u0018\u00002\u00020\u0001:\u0001\u0014B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthApi$TwoStepApiResponse;", "", "message", "", "data", "Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthApi$TwoStepApiResponse$Data;", "(Ljava/lang/String;Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthApi$TwoStepApiResponse$Data;)V", "getData", "()Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthApi$TwoStepApiResponse$Data;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Data", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32270a;
        @SerializedName("message")
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public final String f32271b;
        @SerializedName("data")
        @Nullable

        /* renamed from: c  reason: collision with root package name */
        public final C0409a f32272c;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\n\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthApi$TwoStepApiResponse$Data;", "", "ticket", "", "errorCode", "", "errorDescription", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getErrorCode", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getErrorDescription", "()Ljava/lang/String;", "getTicket", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/ss/android/ugc/aweme/account/login/twostep/TwoStepAuthApi$TwoStepApiResponse$Data;", "equals", "", "other", "hashCode", "toString", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
        /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$a$a  reason: collision with other inner class name */
        public static final class C0409a {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32273a;
            @SerializedName("ticket")
            @Nullable

            /* renamed from: b  reason: collision with root package name */
            public final String f32274b;
            @SerializedName("error_code")
            @Nullable

            /* renamed from: c  reason: collision with root package name */
            public final Integer f32275c;
            @SerializedName("description")
            @Nullable

            /* renamed from: d  reason: collision with root package name */
            public final String f32276d;

            public final boolean equals(@Nullable Object obj) {
                if (PatchProxy.isSupport(new Object[]{obj}, this, f32273a, false, 20392, new Class[]{Object.class}, Boolean.TYPE)) {
                    return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f32273a, false, 20392, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
                }
                if (this != obj) {
                    if (obj instanceof C0409a) {
                        C0409a aVar = (C0409a) obj;
                        if (!Intrinsics.areEqual((Object) this.f32274b, (Object) aVar.f32274b) || !Intrinsics.areEqual((Object) this.f32275c, (Object) aVar.f32275c) || !Intrinsics.areEqual((Object) this.f32276d, (Object) aVar.f32276d)) {
                            return false;
                        }
                    }
                    return false;
                }
                return true;
            }

            public final int hashCode() {
                int i = 0;
                if (PatchProxy.isSupport(new Object[0], this, f32273a, false, 20391, new Class[0], Integer.TYPE)) {
                    return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f32273a, false, 20391, new Class[0], Integer.TYPE)).intValue();
                }
                String str = this.f32274b;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                Integer num = this.f32275c;
                int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
                String str2 = this.f32276d;
                if (str2 != null) {
                    i = str2.hashCode();
                }
                return hashCode2 + i;
            }

            @NotNull
            public final String toString() {
                if (PatchProxy.isSupport(new Object[0], this, f32273a, false, 20390, new Class[0], String.class)) {
                    return (String) PatchProxy.accessDispatch(new Object[0], this, f32273a, false, 20390, new Class[0], String.class);
                }
                return "Data(ticket=" + this.f32274b + ", errorCode=" + this.f32275c + ", errorDescription=" + this.f32276d + ")";
            }
        }

        public final boolean equals(@Nullable Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, f32270a, false, 20388, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f32270a, false, 20388, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            }
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (!Intrinsics.areEqual((Object) this.f32271b, (Object) aVar.f32271b) || !Intrinsics.areEqual((Object) this.f32272c, (Object) aVar.f32272c)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            int i = 0;
            if (PatchProxy.isSupport(new Object[0], this, f32270a, false, 20387, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f32270a, false, 20387, new Class[0], Integer.TYPE)).intValue();
            }
            String str = this.f32271b;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            C0409a aVar = this.f32272c;
            if (aVar != null) {
                i = aVar.hashCode();
            }
            return hashCode + i;
        }

        @NotNull
        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f32270a, false, 20386, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f32270a, false, 20386, new Class[0], String.class);
            }
            return "TwoStepApiResponse(message=" + this.f32271b + ", data=" + this.f32272c + ")";
        }
    }

    private TwoStepAuthApi() {
    }

    static {
        Object create = ((IRetrofitService) w.a(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(Api.class);
        Intrinsics.checkExpressionValueIsNotNull(create, "ModuleStore.getService(I… .create(Api::class.java)");
        f32269d = (Api) create;
    }

    @Nullable
    public final i<a> a(@Nullable String str, @NotNull String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, this, f32266a, false, 20382, new Class[]{String.class, String.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str3, str4}, this, f32266a, false, 20382, new Class[]{String.class, String.class}, i.class);
        }
        Intrinsics.checkParameterIsNotNull(str4, "aid");
        try {
            return f32269d.verifySms(str3, str4);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public final i<a> a(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6}, this, f32266a, false, 20383, new Class[]{String.class, String.class, String.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str4, str5, str6}, this, f32266a, false, 20383, new Class[]{String.class, String.class, String.class}, i.class);
        }
        Intrinsics.checkParameterIsNotNull(str4, "verifyTicket");
        Intrinsics.checkParameterIsNotNull(str5, "aid");
        Intrinsics.checkParameterIsNotNull(str6, "encryptedPass");
        try {
            return f32269d.verifyPassword(str4, str5, str6, PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        } catch (Exception unused) {
            return null;
        }
    }

    @Nullable
    public final i<a> a(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
        String str8;
        String str9;
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, str4, str5, str6, str7}, this, f32266a, false, 20384, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str, str2, str3, str4, str5, str6, str7}, this, f32266a, false, 20384, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class}, i.class);
        }
        try {
            if (TextUtils.isEmpty(str3)) {
                str8 = null;
            } else {
                str8 = str3;
            }
            if (TextUtils.isEmpty(str6)) {
                str9 = null;
            } else {
                str9 = str6;
            }
            return f32269d.verifyThirdParty(str, str2, str8, str4, str5, str9, str7);
        } catch (Exception unused) {
            return null;
        }
    }
}
