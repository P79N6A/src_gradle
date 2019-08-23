package com.bytedance.android.livesdk.schema;

import android.content.Context;
import android.net.Uri;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.d;
import com.bytedance.android.live.core.widget.BaseDialogFragment;
import com.bytedance.android.livesdk.browser.c.b;
import com.bytedance.android.livesdk.schema.a.c;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.common.utility.StringUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;

public final class n implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17202a;

    public final boolean canHandle(Uri uri) {
        boolean z;
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{uri2}, this, f17202a, false, 13181, new Class[]{Uri.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{uri2}, this, f17202a, false, 13181, new Class[]{Uri.class}, Boolean.TYPE)).booleanValue();
        }
        if (!TextUtils.equals("webcast_webview", uri.getHost())) {
            if (PatchProxy.isSupport(new Object[]{uri2}, this, f17202a, false, 13187, new Class[]{Uri.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{uri2}, this, f17202a, false, 13187, new Class[]{Uri.class}, Boolean.TYPE)).booleanValue();
            } else if (uri2 == null) {
                z = false;
            } else {
                z = TextUtils.equals(uri2.getQueryParameter("__live_platform__"), "webcast");
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean handle(Context context, Uri uri) {
        Context context2 = context;
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{context2, uri2}, this, f17202a, false, 13182, new Class[]{Context.class, Uri.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2, uri2}, this, f17202a, false, 13182, new Class[]{Context.class, Uri.class}, Boolean.TYPE)).booleanValue();
        }
        String queryParameter = uri2.getQueryParameter(PushConstants.WEB_URL);
        if (StringUtils.isEmpty(queryParameter)) {
            return false;
        }
        String queryParameter2 = uri2.getQueryParameter("type");
        if (queryParameter2 == null) {
            return a(queryParameter, context2, uri2);
        }
        char c2 = 65535;
        int hashCode = queryParameter2.hashCode();
        if (hashCode != 106852524) {
            if (hashCode == 110066619 && queryParameter2.equals("fullscreen")) {
                c2 = 1;
            }
        } else if (queryParameter2.equals("popup")) {
            c2 = 0;
        }
        if (c2 != 0) {
            return a(queryParameter, context2, uri2);
        }
        if (TextUtils.equals("bottom", uri2.getQueryParameter("gravity"))) {
            if (PatchProxy.isSupport(new Object[]{queryParameter, context2, uri2}, this, f17202a, false, 13183, new Class[]{String.class, Context.class, Uri.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{queryParameter, context2, uri2}, this, f17202a, false, 13183, new Class[]{String.class, Context.class, Uri.class}, Boolean.TYPE)).booleanValue();
            }
            BaseDialogFragment a2 = j.q().f().a(com.bytedance.android.livesdk.browser.c.c.a(queryParameter).a(a(uri2, "radius", 8), a(uri2, "radius", 8), 0, 0).b(a(uri2, "height", 400)).a((int) ac.e(ac.c())).e(80));
            FragmentActivity b2 = d.b(context);
            if (b2 == null) {
                return false;
            }
            BaseDialogFragment.a(b2, (DialogFragment) a2);
            return true;
        }
        if (PatchProxy.isSupport(new Object[]{queryParameter, context2, uri2}, this, f17202a, false, 13184, new Class[]{String.class, Context.class, Uri.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{queryParameter, context2, uri2}, this, f17202a, false, 13184, new Class[]{String.class, Context.class, Uri.class}, Boolean.TYPE)).booleanValue();
        }
        BaseDialogFragment a3 = j.q().f().a(com.bytedance.android.livesdk.browser.c.c.a(queryParameter).d(a(uri2, "radius", 8)).b(a(uri2, "height", 400)).a(a(uri2, "width", (int) com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c.f69428f)).e(17));
        FragmentActivity b3 = d.b(context);
        if (b3 == null) {
            return false;
        }
        BaseDialogFragment.a(b3, (DialogFragment) a3);
        return true;
    }

    private static int a(Uri uri, String str, int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{uri, str, Integer.valueOf(i)}, null, f17202a, true, 13186, new Class[]{Uri.class, String.class, Integer.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{uri, str, Integer.valueOf(i)}, null, f17202a, true, 13186, new Class[]{Uri.class, String.class, Integer.TYPE}, Integer.TYPE)).intValue();
        }
        try {
            String queryParameter = uri.getQueryParameter(str);
            queryParameter.getClass();
            i2 = Integer.parseInt(queryParameter);
        } catch (Exception unused) {
            i2 = i;
        }
        return i2;
    }

    private boolean a(String str, Context context, Uri uri) {
        boolean z;
        String str2;
        String str3;
        Context context2 = context;
        Uri uri2 = uri;
        boolean z2 = false;
        if (PatchProxy.isSupport(new Object[]{str, context2, uri2}, this, f17202a, false, 13185, new Class[]{String.class, Context.class, Uri.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, context2, uri2}, this, f17202a, false, 13185, new Class[]{String.class, Context.class, Uri.class}, Boolean.TYPE)).booleanValue();
        }
        b f2 = j.q().f();
        b.a b2 = com.bytedance.android.livesdk.browser.c.c.b(str);
        if (a(uri2, "hide_nav_bar", 0) == 1) {
            z = true;
        } else {
            z = false;
        }
        b.a a2 = b2.a(z);
        if (uri2 != null) {
            str2 = uri2.getQueryParameter("status_bar_color");
        } else {
            str2 = "";
        }
        b.a b3 = a2.b(str2);
        if (uri2 != null) {
            str3 = uri2.getQueryParameter("status_bar_bg_color");
        } else {
            str3 = "";
        }
        b.a c2 = b3.c(str3);
        if (a(uri2, "hide_status_bar", 0) == 1) {
            z2 = true;
        }
        f2.a(context2, c2.b(z2));
        return true;
    }
}
