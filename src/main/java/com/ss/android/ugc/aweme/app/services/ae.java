package com.ss.android.ugc.aweme.app.services;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.main.h.v;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J(\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\bH\u0016J \u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0016¨\u0006\u0010"}, d2 = {"Lcom/ss/android/ugc/aweme/app/services/WebviewService;", "Lcom/ss/android/ugc/aweme/main/service/IWebViewService;", "()V", "openWebPage", "", "context", "Landroid/content/Context;", "url", "", "isHideNavBar", "", "background", "", "title", "openWebPageWithHeader", "headStr", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class ae implements v {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34271a;

    public final void a(@NotNull Context context, @NotNull String str, @NotNull String str2) {
        Context context2 = context;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{context2, str3, str4}, this, f34271a, false, 23682, new Class[]{Context.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str3, str4}, this, f34271a, false, 23682, new Class[]{Context.class, String.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(str3, PushConstants.WEB_URL);
        Intrinsics.checkParameterIsNotNull(str4, "headStr");
        Intent intent = new Intent(context2, CrossPlatformActivity.class);
        intent.setData(Uri.parse(str));
        if (!(context2 instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("hide_nav_bar", true);
        intent.putExtra("wap_headers", str4);
        context2.startActivity(intent);
    }

    public final void a(@NotNull Context context, @NotNull String str, boolean z) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2, (byte) 1}, this, f34271a, false, 23679, new Class[]{Context.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2, (byte) 1}, this, f34271a, false, 23679, new Class[]{Context.class, String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(str2, PushConstants.WEB_URL);
        Intent intent = new Intent(context2, CrossPlatformActivity.class);
        intent.setData(Uri.parse(str));
        if (!(context2 instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("hide_nav_bar", true);
        context2.startActivity(intent);
    }

    public final void a(@NotNull Context context, @NotNull String str, boolean z, int i) {
        Context context2 = context;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{context2, str2, (byte) 1, -1}, this, f34271a, false, 23681, new Class[]{Context.class, String.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, str2, (byte) 1, -1}, this, f34271a, false, 23681, new Class[]{Context.class, String.class, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(context2, "context");
        Intrinsics.checkParameterIsNotNull(str2, PushConstants.WEB_URL);
        Intent intent = new Intent(context2, CrossPlatformActivity.class);
        intent.setData(Uri.parse(str));
        if (!(context2 instanceof Activity)) {
            intent.addFlags(268435456);
        }
        intent.putExtra("hide_nav_bar", true);
        intent.putExtra("bundle_webview_background", -1);
        intent.putExtra("status_bar_color", "000000");
        context2.startActivity(intent);
    }
}
