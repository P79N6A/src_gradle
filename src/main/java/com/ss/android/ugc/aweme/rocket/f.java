package com.ss.android.ugc.aweme.rocket;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import com.rocket.android.api.FusionFuelSdk;
import com.ss.android.ugc.aweme.account.c;
import com.ss.android.ugc.aweme.im.b;
import com.ss.android.ugc.aweme.main.MainActivity;
import com.ss.android.ugc.aweme.y;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63655a;

    private static void a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f63655a, true, 70892, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f63655a, true, 70892, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        Intent intent = new Intent(context2, MainActivity.class);
        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", "NOTIFICATION");
        ActivityCompat.startActivity(context2, intent, null);
    }

    private static void b(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f63655a, true, 70894, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2}, null, f63655a, true, 70894, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (context2 instanceof Activity) {
            Intent authorizeActivityStartIntent = c.c().getAuthorizeActivityStartIntent(context2);
            authorizeActivityStartIntent.putExtra("is_login", false);
            authorizeActivityStartIntent.putExtra("platform", "flipchat");
            ((Activity) context2).startActivityForResult(authorizeActivityStartIntent, PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE);
        }
    }

    private static void a(Uri uri) {
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{uri2}, null, f63655a, true, 70893, new Class[]{Uri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uri2}, null, f63655a, true, 70893, new Class[]{Uri.class}, Void.TYPE);
            return;
        }
        String queryParameter = uri2.getQueryParameter(TimeDisplaySetting.TIME_DISPLAY_SETTING);
        if (!(queryParameter == null || b.a() == null)) {
            b.a().onFlipChatPushMsgUpdate(uri2.getQueryParameter("desc"), Long.parseLong(queryParameter));
        }
    }

    public static void a(Context context, Uri uri) {
        Context context2 = context;
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{context2, uri2}, null, f63655a, true, 70890, new Class[]{Context.class, Uri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, uri2}, null, f63655a, true, 70890, new Class[]{Context.class, Uri.class}, Void.TYPE);
            return;
        }
        if (context2 instanceof Activity) {
            if (!d.f63651b.isLogin()) {
                Intent intent = new Intent(context2, FlipChatLoginActivity.class);
                intent.putExtra("flip_chat_uri", uri2);
                context2.startActivity(intent);
                return;
            }
            b(context, uri);
        }
    }

    public static void b(Context context, Uri uri) {
        final Context context2 = context;
        final Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{context2, uri2}, null, f63655a, true, 70891, new Class[]{Context.class, Uri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, uri2}, null, f63655a, true, 70891, new Class[]{Context.class, Uri.class}, Void.TYPE);
        } else if (context2 != null && uri2 != null) {
            a(context);
            if (d.f63651b.isBindFlipChat()) {
                FusionFuelSdk.openSchema(context2, uri.toString());
                return;
            }
            c.c().setAuthorzieBindResult(new y() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f63656a;

                public final void a(String str, boolean z) {
                    if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f63656a, false, 70895, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f63656a, false, 70895, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
                        return;
                    }
                    if (z && d.f63651b.isBindFlipChat()) {
                        FusionFuelSdk.openSchema(context2, uri2.toString());
                        c.c().setAuthorzieBindResult(null);
                    }
                }
            });
            b(context);
            a(uri);
        }
    }
}
