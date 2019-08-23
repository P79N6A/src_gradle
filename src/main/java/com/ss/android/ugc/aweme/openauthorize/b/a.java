package com.ss.android.ugc.aweme.openauthorize.b;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.common.util.i;
import com.ss.android.ugc.aweme.openauthorize.a.a;
import com.ss.android.ugc.aweme.openauthorize.d;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/openauthorize/network/CheckLoginState;", "", "()V", "Authorize", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final String f58361a = f58361a;

    /* renamed from: b  reason: collision with root package name */
    public static final C0656a f58362b = new C0656a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/ss/android/ugc/aweme/openauthorize/network/CheckLoginState$Authorize;", "", "()V", "CHECK_LOGIN_STATE_FOR_AUTHORIZE", "", "isLogin", "", "clientKey", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.openauthorize.b.a$a  reason: collision with other inner class name */
    public static final class C0656a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f58363a;

        private C0656a() {
        }

        public /* synthetic */ C0656a(byte b2) {
            this();
        }

        public final boolean a(@NotNull String str) {
            boolean z;
            com.ss.android.ugc.aweme.openauthorize.a.a aVar;
            ArrayList arrayList;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f58363a, false, 63396, new Class[]{String.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f58363a, false, 63396, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(str2, "clientKey");
            try {
                i iVar = new i(a.f58361a);
                if (str2.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    iVar.a("client_key", str2);
                }
                String executeGet = NetworkUtils.executeGet(8192, iVar.a());
                if (!TextUtils.isEmpty(executeGet)) {
                    JSONObject jSONObject = new JSONObject(executeGet);
                    if (TextUtils.equals(jSONObject.optString("message"), "success")) {
                        JSONObject optJSONObject = jSONObject.optJSONObject("data");
                        d dVar = d.f58377d;
                        a.C0655a aVar2 = com.ss.android.ugc.aweme.openauthorize.a.a.f58351f;
                        Intrinsics.checkExpressionValueIsNotNull(optJSONObject, "resDataJson");
                        if (PatchProxy.isSupport(new Object[]{str2, optJSONObject}, aVar2, a.C0655a.f58356a, false, 63395, new Class[]{String.class, JSONObject.class}, com.ss.android.ugc.aweme.openauthorize.a.a.class)) {
                            a.C0655a aVar3 = aVar2;
                            aVar = (com.ss.android.ugc.aweme.openauthorize.a.a) PatchProxy.accessDispatch(new Object[]{str2, optJSONObject}, aVar3, a.C0655a.f58356a, false, 63395, new Class[]{String.class, JSONObject.class}, com.ss.android.ugc.aweme.openauthorize.a.a.class);
                        } else {
                            Intrinsics.checkParameterIsNotNull(str2, "clientKey");
                            Intrinsics.checkParameterIsNotNull(optJSONObject, "jsonObject");
                            aVar = new com.ss.android.ugc.aweme.openauthorize.a.a(str2, optJSONObject.optBoolean("qq_conceal", false), optJSONObject.optBoolean("wx_conceal", false), optJSONObject.optBoolean("need_bind_mobile", false));
                        }
                        if (PatchProxy.isSupport(new Object[]{aVar}, dVar, d.f58374a, false, 63389, new Class[]{com.ss.android.ugc.aweme.openauthorize.a.a.class}, Void.TYPE)) {
                            d dVar2 = dVar;
                            PatchProxy.accessDispatch(new Object[]{aVar}, dVar2, d.f58374a, false, 63389, new Class[]{com.ss.android.ugc.aweme.openauthorize.a.a.class}, Void.TYPE);
                        } else if (aVar != null) {
                            String str3 = aVar.f58352b;
                            if (PatchProxy.isSupport(new Object[0], aVar, com.ss.android.ugc.aweme.openauthorize.a.a.f58350a, false, 63393, new Class[0], ArrayList.class)) {
                                arrayList = (ArrayList) PatchProxy.accessDispatch(new Object[0], aVar, com.ss.android.ugc.aweme.openauthorize.a.a.f58350a, false, 63393, new Class[0], ArrayList.class);
                            } else {
                                arrayList = new ArrayList();
                                if (aVar.f58353c) {
                                    arrayList.add("qzone_sns");
                                }
                                if (aVar.f58354d) {
                                    arrayList.add("weixin");
                                }
                            }
                            if (PatchProxy.isSupport(new Object[]{str3, arrayList}, dVar, d.f58374a, false, 63390, new Class[]{String.class, ArrayList.class}, Void.TYPE)) {
                                d dVar3 = dVar;
                                PatchProxy.accessDispatch(new Object[]{str3, arrayList}, dVar3, d.f58374a, false, 63390, new Class[]{String.class, ArrayList.class}, Void.TYPE);
                            } else {
                                Intrinsics.checkParameterIsNotNull(str3, "clientKey");
                                Intrinsics.checkParameterIsNotNull(arrayList, "platforms");
                                d.f58375b.put(str3, arrayList);
                            }
                            d.f58376c = aVar;
                        }
                        return optJSONObject.optBoolean("login", false);
                    }
                }
            } catch (Exception unused) {
            }
            return false;
        }
    }
}
