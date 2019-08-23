package com.ss.android.ugc.aweme.video.e;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.util.i;
import com.ss.android.ugc.aweme.app.SharePrefCache;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76055a;

    public static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f76055a, true, 89322, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f76055a, true, 89322, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str) || !str2.contains("aweme/v1/play")) {
            return str2;
        } else {
            return b(str).a();
        }
    }

    public static i b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f76055a, true, 89323, new Class[]{String.class}, i.class)) {
            return (i) PatchProxy.accessDispatch(new Object[]{str2}, null, f76055a, true, 89323, new Class[]{String.class}, i.class);
        }
        i iVar = new i(str2);
        if (!((Boolean) SharePrefCache.inst().getTTRegion().c()).booleanValue()) {
            iVar.a("pass-region", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        }
        if (!((Boolean) SharePrefCache.inst().getTTRoute().c()).booleanValue()) {
            iVar.a("pass-route", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        }
        return new i(AppLog.addCommonParams(iVar.toString(), true));
    }
}
