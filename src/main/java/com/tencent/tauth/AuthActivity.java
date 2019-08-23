package com.tencent.tauth;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.tencent.connect.common.AssistActivity;
import com.tencent.connect.common.b;
import com.tencent.open.a.f;
import com.tencent.open.d.h;

public class AuthActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private static int f79773a;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        if (getIntent() == null) {
            f.d("openSDK_LOG.AuthActivity", "-->onCreate, getIntent() return null");
            finish();
            return;
        }
        Uri uri = null;
        try {
            uri = getIntent().getData();
        } catch (Exception e2) {
            f.e("openSDK_LOG.AuthActivity", "-->onCreate, getIntent().getData() has exception! " + e2.getMessage());
        }
        f.a("openSDK_LOG.AuthActivity", "-->onCreate, uri: " + uri);
        f.c("openSDK_LOG.AuthActivity", "-->handleActionUri--start");
        if (uri == null || uri.toString() == null || uri.toString().equals("")) {
            f.d("openSDK_LOG.AuthActivity", "-->handleActionUri, uri invalid");
            finish();
            return;
        }
        String uri2 = uri.toString();
        Bundle a2 = h.a(uri2.substring(uri2.indexOf("#") + 1));
        if (a2 == null) {
            f.d("openSDK_LOG.AuthActivity", "-->handleActionUri, bundle is null");
            finish();
            return;
        }
        String string = a2.getString("action");
        f.c("openSDK_LOG.AuthActivity", "-->handleActionUri, action: " + string);
        if (string == null) {
            finish();
        } else if (string.equals("shareToQQ") || string.equals("shareToQzone") || string.equals("sendToMyComputer") || string.equals("shareToTroopBar")) {
            if (string.equals("shareToQzone") && com.tencent.open.d.f.a((Context) this, "com.tencent.mobileqq") != null && com.tencent.open.d.f.a(com.tencent.open.d.f.a((Context) this, "com.tencent.mobileqq"), "5.2.0") < 0) {
                int i = f79773a + 1;
                f79773a = i;
                if (i == 2) {
                    f79773a = 0;
                    finish();
                    return;
                }
            }
            f.c("openSDK_LOG.AuthActivity", "-->handleActionUri, most share action, start assistactivity");
            Intent intent = new Intent(this, AssistActivity.class);
            intent.putExtras(a2);
            intent.setFlags(603979776);
            startActivity(intent);
            finish();
        } else if (string.equals("addToQQFavorites")) {
            Intent intent2 = getIntent();
            intent2.putExtras(a2);
            intent2.putExtra("key_action", "action_share");
            b a3 = b.a().a(string);
            if (a3 != null) {
                b.a();
                b.a(intent2, a3);
            }
            finish();
        } else {
            if (string.equals("sharePrize")) {
                Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
                try {
                    str = h.d(a2.getString("response")).getString("activityid");
                } catch (Exception e3) {
                    f.b("openSDK_LOG.AuthActivity", "sharePrize parseJson has exception.", e3);
                    str = "";
                }
                if (!TextUtils.isEmpty(str)) {
                    launchIntentForPackage.putExtra("sharePrize", true);
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("activityid", str);
                    launchIntentForPackage.putExtras(bundle2);
                }
                startActivity(launchIntentForPackage);
            }
            finish();
        }
    }
}
