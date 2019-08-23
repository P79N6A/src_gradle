package com.ss.android.ugc.aweme.opensdk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.feed.model.Aweme;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58378a;

    public static void a(@NonNull Context context, @NonNull Aweme aweme) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, aweme}, null, f58378a, true, 63400, new Class[]{Context.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, aweme}, null, f58378a, true, 63400, new Class[]{Context.class, Aweme.class}, Void.TYPE);
        } else if (context2 != null && aweme != null && aweme.getOpenPlatformStruct() != null && !TextUtils.isEmpty(aweme.getOpenPlatformStruct().getLink())) {
            Intent intent = new Intent(context2, CrossPlatformActivity.class);
            intent.setData(Uri.parse(aweme.getOpenPlatformStruct().getLink()));
            intent.putExtra("bundle_user_webview_title", true);
            context2.startActivity(intent);
        }
    }
}
