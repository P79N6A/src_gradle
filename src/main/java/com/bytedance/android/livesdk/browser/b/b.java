package com.bytedance.android.livesdk.browser.b;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.v.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import java.util.Locale;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9302a;

    public static final class a implements h.b<a> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f9303a;

        @NonNull
        public final h.b.a<a> a(h.b.a<a> aVar) {
            h.b.a<a> aVar2 = aVar;
            if (!PatchProxy.isSupport(new Object[]{aVar2}, this, f9303a, false, 3420, new Class[]{h.b.a.class}, h.b.a.class)) {
                return aVar2.a(new b((byte) 0));
            }
            return (h.b.a) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f9303a, false, 3420, new Class[]{h.b.a.class}, h.b.a.class);
        }
    }

    private b() {
    }

    public final int a() {
        if (PatchProxy.isSupport(new Object[0], this, f9302a, false, 3415, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f9302a, false, 3415, new Class[0], Integer.TYPE)).intValue();
        }
        int intValue = ((Integer) com.bytedance.android.livesdk.browser.a.g.a()).intValue();
        if (intValue == 1 || intValue == 0 || intValue == 2) {
            return intValue;
        }
        return 2;
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public final void a(WebView webView) {
        String str;
        Locale locale;
        String str2;
        String str3;
        WebView webView2 = webView;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{webView2}, this, f9302a, false, 3416, new Class[]{WebView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView2}, this, f9302a, false, 3416, new Class[]{WebView.class}, Void.TYPE);
            return;
        }
        Context context = webView.getContext();
        if (PatchProxy.isSupport(new Object[]{context, webView2}, this, f9302a, false, 3417, new Class[]{Context.class, WebView.class}, String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[]{context, webView2}, this, f9302a, false, 3417, new Class[]{Context.class, WebView.class}, String.class);
        } else {
            String a2 = com.bytedance.android.livesdk.utils.a.a(context, webView2);
            if (a2 == null) {
                a2 = "";
            }
            if (PatchProxy.isSupport(new Object[0], null, com.bytedance.android.live.core.b.a.f7826a, true, 192, new Class[0], Locale.class)) {
                locale = (Locale) PatchProxy.accessDispatch(new Object[0], null, com.bytedance.android.live.core.b.a.f7826a, true, 192, new Class[0], Locale.class);
            } else {
                locale = Resources.getSystem().getConfiguration().locale;
            }
            if (PatchProxy.isSupport(new Object[]{context}, null, com.bytedance.android.live.core.b.a.f7826a, true, 194, new Class[]{Context.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{context}, null, com.bytedance.android.live.core.b.a.f7826a, true, 194, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
            } else if (TextUtils.isEmpty(com.bytedance.ies.e.b.a(context).a("sp_lanuage_last_select_tag", ""))) {
                z = false;
            }
            if (z && com.bytedance.android.live.core.b.a.a(context) != null) {
                locale = com.bytedance.android.live.core.b.a.a(context);
            }
            if (!TextUtils.isEmpty(a2)) {
                StringBuilder sb = new StringBuilder();
                sb.append(a2);
                sb.append(" ");
                sb.append(TTLiveSDKContext.getHostService().a().h());
                sb.append("_");
                sb.append(TTLiveSDKContext.getHostService().a().b());
                sb.append(" AppVersion/");
                sb.append(TTLiveSDKContext.getHostService().a().b());
                sb.append(" JsSdk/2.0 NetType/");
                sb.append(NetworkUtils.getNetworkAccessType(TTLiveSDKContext.getHostService().a().a()).toUpperCase());
                sb.append(" Channel/");
                sb.append(TTLiveSDKContext.getHostService().a().c());
                sb.append(" ByteLocale/");
                sb.append(locale.toString());
                sb.append(" Webcast_ByteLocale/");
                if (PatchProxy.isSupport(new Object[0], this, f9302a, false, 3418, new Class[0], String.class)) {
                    str2 = (String) PatchProxy.accessDispatch(new Object[0], this, f9302a, false, 3418, new Class[0], String.class);
                } else {
                    str2 = com.bytedance.android.live.core.b.b.a(TTLiveSDKContext.getHostService().a().l());
                }
                sb.append(str2);
                sb.append(" Region/");
                if (PatchProxy.isSupport(new Object[0], null, com.bytedance.android.live.core.b.a.f7826a, true, 191, new Class[0], String.class)) {
                    str3 = (String) PatchProxy.accessDispatch(new Object[0], null, com.bytedance.android.live.core.b.a.f7826a, true, 191, new Class[0], String.class);
                } else {
                    str3 = Locale.getDefault().getCountry();
                    if (TextUtils.isEmpty(str3)) {
                        str3 = "";
                    }
                }
                sb.append(str3);
                sb.append(" App/");
                sb.append(TTLiveSDKContext.getHostService().a().h());
                sb.append(" WebcastSDK/1150");
                str = sb.toString();
            } else {
                str = a2;
            }
        }
        if (!TextUtils.isEmpty(str)) {
            webView.getSettings().setUserAgentString(str);
        }
    }
}
