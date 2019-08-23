package io.fabric.sdk.android.services.b;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import io.fabric.sdk.android.c;

public final class g {
    private static String a() {
        return "Fabric could not be initialized, API key missing from AndroidManifest.xml. Add the following tag to your Application element \n\t<meta-data android:name=\"io.fabric.ApiKey\" android:value=\"YOUR_API_KEY\"/>";
    }

    protected static String c(Context context) {
        int a2 = i.a(context, "io.fabric.ApiKey", "string");
        if (a2 == 0) {
            a2 = i.a(context, "com.crashlytics.ApiKey", "string");
        }
        if (a2 != 0) {
            return context.getResources().getString(a2);
        }
        return null;
    }

    protected static String b(Context context) {
        String str = null;
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f).metaData;
            if (bundle == null) {
                return null;
            }
            String string = bundle.getString("io.fabric.ApiKey");
            try {
                if (!"@string/twitter_consumer_secret".equals(string)) {
                    str = string;
                }
                if (str == null) {
                    return bundle.getString("com.crashlytics.ApiKey");
                }
                return str;
            } catch (Exception e2) {
                e = e2;
                str = string;
                new StringBuilder("Caught non-fatal exception while retrieving apiKey: ").append(e);
                return str;
            }
        } catch (Exception e3) {
            e = e3;
            new StringBuilder("Caught non-fatal exception while retrieving apiKey: ").append(e);
            return str;
        }
    }

    public final String a(Context context) {
        String b2 = b(context);
        if (TextUtils.isEmpty(b2)) {
            b2 = c(context);
        }
        if (TextUtils.isEmpty(b2)) {
            new r();
            int a2 = i.a(context, "google_app_id", "string");
            if (a2 != 0) {
                b2 = i.a(context.getResources().getString(a2), "SHA-256").substring(0, 40);
            } else {
                b2 = null;
            }
        }
        if (TextUtils.isEmpty(b2)) {
            if (c.b() || i.e(context)) {
                throw new IllegalArgumentException(a());
            }
            a();
        }
        return b2;
    }
}
