package com.crashlytics.android.core;

import android.content.Context;
import android.os.Bundle;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public class ManifestUnityVersionProvider implements UnityVersionProvider {
    private final Context context;
    private final String packageName;

    public String getUnityVersion() {
        try {
            Bundle bundle = this.context.getPackageManager().getApplicationInfo(this.packageName, SearchJediMixFeedAdapter.f42517f).metaData;
            if (bundle != null) {
                return bundle.getString("io.fabric.unity.crashlytics.version");
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public ManifestUnityVersionProvider(Context context2, String str) {
        this.context = context2;
        this.packageName = str;
    }
}
