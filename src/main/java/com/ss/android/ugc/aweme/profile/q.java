package com.ss.android.ugc.aweme.profile;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.rocket.android.opensdk.IRocketAPI;
import com.rocket.android.opensdk.RocketAPIFactory;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.share.RocketFansGroupInfo;
import com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.ss.android.ugc.aweme.utils.ey;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61666a;

    public static boolean a() {
        if (Build.VERSION.SDK_INT >= 21) {
            return true;
        }
        return false;
    }

    public static boolean a(Context context) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2}, null, f61666a, true, 67276, new Class[]{Context.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{context2}, null, f61666a, true, 67276, new Class[]{Context.class}, Boolean.TYPE)).booleanValue();
        } else if (Build.VERSION.SDK_INT < 21) {
            return false;
        } else {
            IRocketAPI createRocketAPI = RocketAPIFactory.createRocketAPI(context2, "rs9760739781918870", true);
            if (createRocketAPI != null && createRocketAPI.isRocketInstalled()) {
                return createRocketAPI.isRocketSupportAPI();
            }
            return false;
        }
    }

    public static boolean a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f61666a, true, 67277, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, null, f61666a, true, 67277, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        } else if (!a() || !TextUtils.equals("rocket", str2)) {
            return false;
        } else {
            return true;
        }
    }

    public static void a(Context context, RocketFansGroupInfo rocketFansGroupInfo) {
        Context context2 = context;
        if (PatchProxy.isSupport(new Object[]{context2, rocketFansGroupInfo}, null, f61666a, true, 67275, new Class[]{Context.class, RocketFansGroupInfo.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, rocketFansGroupInfo}, null, f61666a, true, 67275, new Class[]{Context.class, RocketFansGroupInfo.class}, Void.TYPE);
        } else if (context2 != null && rocketFansGroupInfo != null) {
            IRocketAPI createRocketAPI = RocketAPIFactory.createRocketAPI(context2, "rs9760739781918870", true);
            if (!createRocketAPI.isRocketInstalled() || !createRocketAPI.isRocketSupportAPI()) {
                String downloadUrl = rocketFansGroupInfo.getDownloadUrl();
                if (!TextUtils.isEmpty(downloadUrl)) {
                    ey.b("rocket_token", context2, rocketFansGroupInfo.getToken());
                    try {
                        Intent intent = new Intent(context2, CrossPlatformActivity.class);
                        intent.setData(Uri.parse(downloadUrl));
                        context2.startActivity(intent);
                    } catch (Exception unused) {
                        a.b(context2, (int) C0906R.string.c0n).a();
                    }
                }
            } else {
                String schema = rocketFansGroupInfo.getSchema();
                if (!TextUtils.isEmpty(schema)) {
                    ey.b("rocket_token", context2, rocketFansGroupInfo.getToken());
                    try {
                        Intent intent2 = new Intent();
                        intent2.setAction("android.intent.action.VIEW");
                        intent2.addCategory("android.intent.category.DEFAULT");
                        intent2.setData(Uri.parse(schema));
                        context2.startActivity(intent2);
                    } catch (Exception unused2) {
                        a.b(context2, (int) C0906R.string.c0n).a();
                    }
                }
            }
        }
    }
}
