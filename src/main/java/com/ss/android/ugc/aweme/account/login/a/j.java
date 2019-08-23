package com.ss.android.ugc.aweme.account.login.a;

import com.bytedance.sdk.account.api.call.c;
import com.bytedance.sdk.account.f.a.k;
import com.bytedance.sdk.account.f.b.a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.i.e;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0016¨\u0006\u000b"}, d2 = {"Lcom/ss/android/ugc/aweme/account/login/callbacks/CommonSendCodeCallback;", "Lcom/bytedance/sdk/account/mobile/thread/call/SendCodeCallback;", "()V", "onError", "", "response", "Lcom/bytedance/sdk/account/api/call/MobileApiResponse;", "Lcom/bytedance/sdk/account/mobile/query/SendCodeQueryObj;", "error", "", "onSuccess", "awemeaccount_douyinCnRelease"}, k = 1, mv = {1, 1, 13})
public class j extends i {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f32073e;

    /* renamed from: a */
    public void g(@Nullable c<k> cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f32073e, false, 20230, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f32073e, false, 20230, new Class[]{c.class}, Void.TYPE);
        } else if (PatchProxy.isSupport(new Object[0], null, e.f31992a, true, 20051, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, e.f31992a, true, 20051, new Class[0], Void.TYPE);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("event", "on send code success");
            e eVar = e.f31993b;
            String hashMap2 = hashMap.toString();
            Intrinsics.checkExpressionValueIsNotNull(hashMap2, "map.toString()");
            eVar.c(hashMap2);
        }
    }

    public void a(@Nullable c<k> cVar, int i) {
        Integer num;
        String str;
        c<k> cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2, Integer.valueOf(i)}, this, f32073e, false, 20231, new Class[]{c.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2, Integer.valueOf(i)}, this, f32073e, false, 20231, new Class[]{c.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        String str2 = null;
        if (cVar2 != null) {
            num = Integer.valueOf(cVar2.error);
        } else {
            num = null;
        }
        if (num == null) {
            str = "";
        } else {
            if (cVar2 == null) {
                Intrinsics.throwNpe();
            }
            str = String.valueOf(cVar2.error);
        }
        if (cVar2 != null) {
            str2 = cVar2.errorMsg;
        }
        if (PatchProxy.isSupport(new Object[]{str, str2}, null, e.f31992a, true, 20052, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2}, null, e.f31992a, true, 20052, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("event", "on send code error");
        if (str == null) {
            str = "";
        }
        hashMap.put("errorCode", str);
        if (str2 == null) {
            str2 = "";
        }
        hashMap.put("errorMsg", str2);
        e eVar = e.f31993b;
        String hashMap2 = hashMap.toString();
        Intrinsics.checkExpressionValueIsNotNull(hashMap2, "map.toString()");
        eVar.c(hashMap2);
    }
}
