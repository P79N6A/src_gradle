package com.douyin.share.a.c;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.u;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    public static String f23151a = ".systemshare.targetchosen.action";

    private static boolean a() {
        if (Build.VERSION.SDK_INT >= 22) {
            return true;
        }
        return false;
    }

    private static PendingIntent a(Context context, String str) {
        Intent intent = new Intent(context.getPackageName() + f23151a);
        intent.setPackage(context.getPackageName());
        intent.putExtra("extra_type", str);
        return PendingIntent.getBroadcast(context.getApplicationContext(), 0, intent, 1342177280);
    }

    public static IShareService.ShareResult a(Context context, IShareService.ShareStruct shareStruct) {
        Intent intent;
        IShareService.ShareResult shareResult = new IShareService.ShareResult();
        if (shareStruct == null || context == null) {
            shareResult.success = false;
            return shareResult;
        }
        Intent intent2 = new Intent();
        intent2.setAction("android.intent.action.SEND");
        intent2.setType("text/plain");
        intent2.putExtra("android.intent.extra.TEXT", shareStruct.title + "【抖音短视频】\n" + u.a().a(shareStruct.url, shareStruct.boolPersist));
        if (a()) {
            intent = Intent.createChooser(intent2, "", a(context, "text/plain").getIntentSender());
        } else {
            intent = Intent.createChooser(intent2, "");
        }
        context.startActivity(intent);
        shareResult.success = true;
        shareResult.type = "more";
        shareResult.identifier = shareStruct.identifier;
        return shareResult;
    }
}
