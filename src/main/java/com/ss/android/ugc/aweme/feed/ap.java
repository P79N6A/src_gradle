package com.ss.android.ugc.aweme.feed;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.base.share.ShareInfo;
import com.ss.android.ugc.aweme.feed.share.i;
import com.ss.android.ugc.aweme.framework.core.a;
import com.ss.android.ugc.aweme.i18n.c;
import com.ss.android.ugc.aweme.share.cc;
import com.ss.android.ugc.aweme.u;

public final class ap {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45047a;

    public static String a(ShareInfo shareInfo, String str, boolean z) {
        ShareInfo shareInfo2 = shareInfo;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{shareInfo2, str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f45047a, true, 40256, new Class[]{ShareInfo.class, String.class, Boolean.TYPE}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{shareInfo2, str2, Byte.valueOf(z)}, null, f45047a, true, 40256, new Class[]{ShareInfo.class, String.class, Boolean.TYPE}, String.class);
        } else if (shareInfo2 == null) {
            return "";
        } else {
            return u.a().a(i.a(a(shareInfo2, str2, shareInfo.getShareUrl()).getShareUrl()), z);
        }
    }

    private static ShareInfo a(ShareInfo shareInfo, String str, String str2) {
        String str3;
        String str4;
        ShareInfo shareInfo2 = shareInfo;
        String str5 = str;
        String str6 = str2;
        if (PatchProxy.isSupport(new Object[]{shareInfo2, str5, str6}, null, f45047a, true, 40255, new Class[]{ShareInfo.class, String.class, String.class}, ShareInfo.class)) {
            return (ShareInfo) PatchProxy.accessDispatch(new Object[]{shareInfo2, str5, str6}, null, f45047a, true, 40255, new Class[]{ShareInfo.class, String.class, String.class}, ShareInfo.class);
        }
        if (TextUtils.isEmpty(str2) || str6.contains("utm_source")) {
            str3 = str6.replaceAll("utm_source=\\w*_?\\w?", "utm_source=" + str5);
        } else {
            com.ss.android.common.util.i iVar = new com.ss.android.common.util.i(str6);
            iVar.a("utm_source", str5);
            iVar.a("utm_campaign", "client_share");
            iVar.a("utm_medium", "android");
            if (PatchProxy.isSupport(new Object[0], null, f45047a, true, 40257, new Class[0], String.class)) {
                str4 = (String) PatchProxy.accessDispatch(new Object[0], null, f45047a, true, 40257, new Class[0], String.class);
            } else if (!c.a()) {
                str4 = "aweme";
            } else {
                str4 = a.b().f3305c;
            }
            iVar.a(PushConstants.EXTRA_APPLICATION_PENDING_INTENT, str4);
            if (!cc.a()) {
                iVar.a("iid", AppLog.getInstallId());
            }
            str3 = iVar.a();
        }
        if (shareInfo2 != null) {
            shareInfo2.setShareUrl(str3);
        }
        return shareInfo2;
    }
}
