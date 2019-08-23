package com.douyin.share.a;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.net.Uri;
import android.text.TextUtils;
import com.douyin.share.d.a.a.d;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public abstract class a {
    public abstract String a();

    public boolean a(Context context) {
        PackageInfo packageInfo;
        if (a() != null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(a(), 0);
            } catch (Exception unused) {
                return false;
            }
        } else {
            packageInfo = null;
        }
        if (packageInfo != null) {
            return true;
        }
        return false;
    }

    public void a(Context context, Uri uri) {
        if (a(context)) {
            Intent intent = new Intent("android.intent.action.SEND");
            intent.setType("image/*");
            if (!TextUtils.isEmpty(a())) {
                intent.setPackage(a());
            }
            intent.putExtra("android.intent.extra.STREAM", uri);
            context.startActivity(Intent.createChooser(intent, ""));
        }
    }

    public IShareService.ShareResult a(Activity activity, IShareService.ShareStruct shareStruct, String str) {
        return d.a(activity, shareStruct, str);
    }
}
