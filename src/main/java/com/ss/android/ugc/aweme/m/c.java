package com.ss.android.ugc.aweme.m;

import com.bytedance.common.utility.CommonHttpException;
import com.bytedance.common.utility.NetworkClient;
import com.bytedance.usergrowth.data.a.a.a;
import com.bytedance.usergrowth.data.a.a.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.AppLog;
import java.util.Map;

public final class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54107a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f54108b = "c";

    c() {
    }

    public final String a(long j, String str, boolean z, Map<String, String> map) throws Exception {
        String str2 = str;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{102400L, str2, (byte) 1, map2}, this, f54107a, false, 49492, new Class[]{Long.TYPE, String.class, Boolean.TYPE, Map.class}, String.class)) {
            Object[] objArr = {102400L, str2, (byte) 1, map2};
            return (String) PatchProxy.accessDispatch(objArr, this, f54107a, false, 49492, new Class[]{Long.TYPE, String.class, Boolean.TYPE, Map.class}, String.class);
        }
        return NetworkClient.getDefault().get(AppLog.addCommonParams(str2, false), map2, new NetworkClient.ReqContext());
    }

    public final String a(String str, byte[] bArr, boolean z, boolean z2, String str2) throws a {
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3, bArr, (byte) 1, (byte) 0, str2}, this, f54107a, false, 49493, new Class[]{String.class, byte[].class, Boolean.TYPE, Boolean.TYPE, String.class}, String.class)) {
            Object[] objArr = {str3, bArr, (byte) 1, (byte) 0, str2};
            return (String) PatchProxy.accessDispatch(objArr, this, f54107a, false, 49493, new Class[]{String.class, byte[].class, Boolean.TYPE, Boolean.TYPE, String.class}, String.class);
        }
        try {
            return NetworkClient.getDefault().post(AppLog.addCommonParams(str3, false), bArr, false, str2, false);
        } catch (CommonHttpException unused) {
            return "";
        }
    }
}
