package com.ss.android.ugc.aweme.app.g;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.ag.h;

public final class a implements h.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2651a;

    public final String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f2651a, false, 23578, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, this, f2651a, false, 23578, new Class[]{String.class}, String.class);
        }
        if (!TextUtils.isEmpty(str) && (str2.startsWith("aweme://webview/") || str2.startsWith("aweme://ame/webview/"))) {
            Uri parse = Uri.parse(str);
            if (!(parse == null || parse.getQueryParameter("rn_schema") == null)) {
                return Uri.parse(parse.getQueryParameter("rn_schema")).buildUpon().appendQueryParameter("fallback_url", parse.getQueryParameter(PushConstants.WEB_URL)).appendQueryParameter("rn_schema", parse.getQueryParameter("rn_schema")).build().toString();
            }
        } else if (!TextUtils.isEmpty(str) && (str2.startsWith("http://") || str2.startsWith("https://"))) {
            str2 = "aweme://webview/?url=" + Uri.encode(str);
        }
        String str3 = str2;
        try {
            if (com.ss.android.ugc.aweme.live.a.d() != null && com.ss.android.ugc.aweme.live.a.d().a(GlobalContext.getContext(), Uri.parse(str3))) {
                str3 = "";
            }
        } catch (Throwable th) {
            ExceptionMonitor.ensureNotReachHere(th);
        }
        return str3;
    }
}
