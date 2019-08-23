package com.ss.android.ugc.aweme.web.jsbridge;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.base.activity.b;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\u001c\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/web/jsbridge/OpenThirdLoginVerifyMethod;", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod;", "iesJsBridge", "Lcom/bytedance/ies/web/jsbridge/IESJsBridge;", "(Lcom/bytedance/ies/web/jsbridge/IESJsBridge;)V", "getIesJsBridge", "()Lcom/bytedance/ies/web/jsbridge/IESJsBridge;", "getPlatformAppID", "", "platform", "handle", "", "params", "Lorg/json/JSONObject;", "iReturn", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod$IReturn;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class OpenThirdLoginVerifyMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76660a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final com.bytedance.ies.f.a.a f76661b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "onActivityResult"}, k = 3, mv = {1, 1, 15})
    static final class a implements b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76662a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ OpenThirdLoginVerifyMethod f76663b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ BaseCommonJavaMethod.a f76664c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ String f76665d;

        a(OpenThirdLoginVerifyMethod openThirdLoginVerifyMethod, BaseCommonJavaMethod.a aVar, String str) {
            this.f76663b = openThirdLoginVerifyMethod;
            this.f76664c = aVar;
            this.f76665d = str;
        }

        public final boolean a(int i, int i2, Intent intent) {
            String str;
            Intent intent2 = intent;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f76662a, false, 90015, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f76662a, false, 90015, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Boolean.TYPE)).booleanValue();
            }
            if (i2 == -1 && i == 10000) {
                String stringExtra = intent2.getStringExtra("access_token");
                if (stringExtra == null) {
                    stringExtra = "";
                }
                String stringExtra2 = intent2.getStringExtra("access_token_secret");
                if (stringExtra2 == null) {
                    stringExtra2 = "";
                }
                String stringExtra3 = intent2.getStringExtra("code");
                if (stringExtra3 == null) {
                    stringExtra3 = "";
                }
                if (!Intrinsics.areEqual((Object) stringExtra, (Object) "") || !Intrinsics.areEqual((Object) stringExtra2, (Object) "") || !Intrinsics.areEqual((Object) stringExtra3, (Object) "")) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        if (Intrinsics.areEqual((Object) "line", (Object) this.f76665d)) {
                            jSONObject.put("access_token", Uri.encode(stringExtra));
                            jSONObject.put("access_token_secret", Uri.encode(stringExtra2));
                            jSONObject.put("code", Uri.encode(stringExtra3));
                        } else {
                            jSONObject.put("access_token", stringExtra);
                            jSONObject.put("access_token_secret", stringExtra2);
                            jSONObject.put("code", stringExtra3);
                        }
                        jSONObject.put("platform", this.f76665d);
                        OpenThirdLoginVerifyMethod openThirdLoginVerifyMethod = this.f76663b;
                        String str2 = this.f76665d;
                        if (PatchProxy.isSupport(new Object[]{str2}, openThirdLoginVerifyMethod, OpenThirdLoginVerifyMethod.f76660a, false, 90013, new Class[]{String.class}, String.class)) {
                            OpenThirdLoginVerifyMethod openThirdLoginVerifyMethod2 = openThirdLoginVerifyMethod;
                            str = (String) PatchProxy.accessDispatch(new Object[]{str2}, openThirdLoginVerifyMethod2, OpenThirdLoginVerifyMethod.f76660a, false, 90013, new Class[]{String.class}, String.class);
                        } else {
                            if (str2 != null) {
                                int hashCode = str2.hashCode();
                                if (hashCode != -1240244679) {
                                    if (hashCode != -916346253) {
                                        if (hashCode != 3765) {
                                            if (hashCode != 28903346) {
                                                if (hashCode == 497130182) {
                                                    if (str2.equals("facebook")) {
                                                        if (com.ss.android.g.a.b()) {
                                                            str = "310";
                                                        } else {
                                                            str = "";
                                                        }
                                                    }
                                                }
                                            } else if (str2.equals("instagram")) {
                                                if (com.ss.android.g.a.b()) {
                                                    str = "312";
                                                } else {
                                                    str = "204";
                                                }
                                            }
                                        } else if (str2.equals("vk")) {
                                            if (com.ss.android.g.a.b()) {
                                                str = "334";
                                            } else {
                                                str = "";
                                            }
                                        }
                                    } else if (str2.equals("twitter")) {
                                        if (com.ss.android.g.a.b()) {
                                            str = "313";
                                        } else {
                                            str = "504";
                                        }
                                    }
                                } else if (str2.equals("google")) {
                                    if (com.ss.android.g.a.b()) {
                                        str = "311";
                                    } else {
                                        str = "";
                                    }
                                }
                            }
                            str = "";
                        }
                        jSONObject.put("platform_app_id", str);
                        BaseCommonJavaMethod.a aVar = this.f76664c;
                        if (aVar != null) {
                            aVar.a((Object) jSONObject);
                        }
                    } catch (JSONException unused) {
                        BaseCommonJavaMethod.a aVar2 = this.f76664c;
                        if (aVar2 != null) {
                            aVar2.a(0, "failed");
                        }
                        return true;
                    }
                } else {
                    BaseCommonJavaMethod.a aVar3 = this.f76664c;
                    if (aVar3 != null) {
                        aVar3.a(0, "");
                    }
                    return true;
                }
            } else {
                BaseCommonJavaMethod.a aVar4 = this.f76664c;
                if (aVar4 != null) {
                    aVar4.a(0, "");
                }
            }
            return true;
        }
    }

    public OpenThirdLoginVerifyMethod(@Nullable com.bytedance.ies.f.a.a aVar) {
        super(aVar);
        this.f76661b = aVar;
    }

    public final void a(@Nullable JSONObject jSONObject, @Nullable BaseCommonJavaMethod.a aVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{jSONObject, aVar}, this, f76660a, false, 90014, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, aVar}, this, f76660a, false, 90014, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
        } else if (this.f3123e != null && this.f76661b != null) {
            if (jSONObject != null) {
                str = jSONObject.getString("platform");
            } else {
                str = null;
            }
            Context context = (Context) this.f3123e.get();
            if (context instanceof CrossPlatformActivity) {
                CrossPlatformActivity crossPlatformActivity = (CrossPlatformActivity) context;
                crossPlatformActivity.a((b) new a(this, aVar, str));
                Intent authorizeActivityStartIntent = c.c().getAuthorizeActivityStartIntent(crossPlatformActivity);
                authorizeActivityStartIntent.putExtra("platform", str);
                authorizeActivityStartIntent.putExtra("is_login", false);
                authorizeActivityStartIntent.putExtra("is_only_fetch_token", true);
                crossPlatformActivity.startActivityForResult(authorizeActivityStartIntent, 10000);
                return;
            }
            aVar.a(0, "");
        }
    }
}
