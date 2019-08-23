package com.ss.android.ugc.aweme.fe.method;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.IAccountUserService;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.b;
import com.ss.android.ugc.aweme.fe.base.BaseCommonJavaMethod;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001c\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\u000e"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/UserInfoMethod;", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod;", "iesJsBridge", "Lcom/bytedance/ies/web/jsbridge/IESJsBridge;", "(Lcom/bytedance/ies/web/jsbridge/IESJsBridge;)V", "getUserInfo", "", "res", "Lorg/json/JSONObject;", "handle", "params", "iReturn", "Lcom/ss/android/ugc/aweme/fe/base/BaseCommonJavaMethod$IReturn;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class UserInfoMethod extends BaseCommonJavaMethod {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44514a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f44515b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/ss/android/ugc/aweme/fe/method/UserInfoMethod$Companion;", "", "()V", "BRIDGE_NAME_USER_INFO", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    public UserInfoMethod() {
        this(null, 1);
    }

    public UserInfoMethod(@Nullable com.bytedance.ies.f.a.a aVar) {
        super(aVar);
    }

    private /* synthetic */ UserInfoMethod(com.bytedance.ies.f.a.a aVar, int i) {
        this(null);
    }

    public final void a(@Nullable JSONObject jSONObject, @Nullable BaseCommonJavaMethod.a aVar) {
        String str;
        BaseCommonJavaMethod.a aVar2 = aVar;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{jSONObject, aVar2}, this, f44514a, false, 39837, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, aVar2}, this, f44514a, false, 39837, new Class[]{JSONObject.class, BaseCommonJavaMethod.a.class}, Void.TYPE);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f44514a, false, 39836, new Class[]{JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f44514a, false, 39836, new Class[]{JSONObject.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(jSONObject2, "res");
            long j = -1;
            String str2 = "";
            String str3 = "";
            String str4 = "";
            String str5 = "";
            IAccountUserService a2 = d.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "AccountUserProxyService.get()");
            User curUser = a2.getCurUser();
            if (curUser != null) {
                IAccountUserService a3 = d.a();
                Intrinsics.checkExpressionValueIsNotNull(a3, "AccountUserProxyService.get()");
                if (a3.isLogin()) {
                    IAccountUserService a4 = d.a();
                    Intrinsics.checkExpressionValueIsNotNull(a4, "AccountUserProxyService.get()");
                    j = Long.parseLong(a4.getCurUserId());
                    str2 = curUser.getNickname();
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (TextUtils.isEmpty(curUser.getUniqueId())) {
                        str3 = curUser.getShortId();
                        str = "user.shortId";
                    } else {
                        str3 = curUser.getUniqueId();
                        str = "user.uniqueId";
                    }
                    Intrinsics.checkExpressionValueIsNotNull(str3, str);
                    str4 = curUser.getBindPhone();
                    Intrinsics.checkExpressionValueIsNotNull(str4, "user.bindPhone");
                    str5 = curUser.getSecUid();
                    Intrinsics.checkExpressionValueIsNotNull(str5, "user.secUid");
                    UrlModel avatarMedium = curUser.getAvatarMedium();
                    if (!(avatarMedium == null || avatarMedium.getUrlList() == null || avatarMedium.getUrlList().isEmpty())) {
                        jSONObject2.put("avatar_url", avatarMedium.getUrlList().get(0));
                    }
                    z = true;
                }
            }
            jSONObject2.put("is_login", z);
            jSONObject2.put("success", z);
            jSONObject2.put("user_id", String.valueOf(j));
            jSONObject2.put("nickname", str2);
            jSONObject2.put("unique_id", str3);
            jSONObject2.put("bind_phone", str4);
            jSONObject2.put("code", 1);
            jSONObject2.put("sec_user_id", str5);
            Long b2 = b.f39372b.b(curUser);
            if (b2 != null) {
                jSONObject2.put("decoration_id", b2.longValue());
            }
        }
        aVar2.a(jSONObject2);
    }
}
