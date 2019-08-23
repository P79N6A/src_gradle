package com.ss.android.ugc.aweme.share;

import a.g;
import a.i;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.n;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.share.a.f;
import com.ss.android.ugc.aweme.thread.h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

public final class be implements n {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64752a;

    /* renamed from: b  reason: collision with root package name */
    private Map<String, String> f64753b = new HashMap();

    public final String a(IShareService.ShareStruct shareStruct, String str) {
        if (!PatchProxy.isSupport(new Object[]{shareStruct, str}, this, f64752a, false, 73104, new Class[]{IShareService.ShareStruct.class, String.class}, String.class)) {
            return cg.a(shareStruct, str);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{shareStruct, str}, this, f64752a, false, 73104, new Class[]{IShareService.ShareStruct.class, String.class}, String.class);
    }

    public final String a(String str, boolean z) {
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f64752a, false, 73103, new Class[]{String.class, Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z)}, this, f64752a, false, 73103, new Class[]{String.class, Boolean.TYPE}, String.class);
        }
        cb cbVar = new cb();
        k a2 = k.a();
        if (PatchProxy.isSupport(new Object[]{a2, str2}, cbVar, cb.f64921a, false, 73288, new Class[]{Context.class, String.class}, Void.TYPE)) {
            cb cbVar2 = cbVar;
            PatchProxy.accessDispatch(new Object[]{a2, str2}, cbVar2, cb.f64921a, false, 73288, new Class[]{Context.class, String.class}, Void.TYPE);
        } else {
            f.a((Context) a2, str2);
        }
        try {
            if (AbTestManager.a().d().useShortShare != 1) {
                return str2;
            }
            String str3 = this.f64753b.get(str2);
            if (TextUtils.isEmpty(str3)) {
                if (!TextUtils.isEmpty(str) && Uri.parse(str).getQueryParameterNames().size() == 0) {
                    return str2;
                }
                final boolean z2 = z;
                i a3 = i.a((Callable<TResult>) new Callable<String>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f64757a;

                    public final /* synthetic */ Object call() throws Exception {
                        String str;
                        if (PatchProxy.isSupport(new Object[0], this, f64757a, false, 73106, new Class[0], String.class)) {
                            return (String) PatchProxy.accessDispatch(new Object[0], this, f64757a, false, 73106, new Class[0], String.class);
                        }
                        String str2 = str2;
                        if (z2) {
                            str = PushConstants.PUSH_TYPE_THROUGH_MESSAGE;
                        } else {
                            str = PushConstants.PUSH_TYPE_NOTIFY;
                        }
                        return ShortenUrlApi.a(str2, "aweme", str);
                    }
                }, (Executor) h.c()).a((g<TResult, TContinuationResult>) new g<String, String>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f64754a;

                    public final /* synthetic */ Object then(i iVar) throws Exception {
                        if (PatchProxy.isSupport(new Object[]{iVar}, this, f64754a, false, 73105, new Class[]{i.class}, String.class)) {
                            return (String) PatchProxy.accessDispatch(new Object[]{iVar}, this, f64754a, false, 73105, new Class[]{i.class}, String.class);
                        } else if (iVar.d()) {
                            return str2;
                        } else {
                            return (String) iVar.e();
                        }
                    }
                });
                try {
                    if (!a3.a(3, TimeUnit.SECONDS)) {
                        return str2;
                    }
                    String str4 = (String) a3.e();
                    try {
                        if (TextUtils.isEmpty(str4)) {
                            return str2;
                        }
                        this.f64753b.put(str2, str4);
                        return str4;
                    } catch (InterruptedException unused) {
                        str3 = str4;
                    }
                } catch (InterruptedException unused2) {
                }
            }
            return str3;
        } catch (Exception unused3) {
            return str2;
        }
    }
}
