package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.internal.zzbgz;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public final class zzbd {
    private static boolean zzRk;
    private static String zzaIf;
    private static int zzaIg;
    private static Object zzuH = new Object();

    public static String zzaD(Context context) {
        zzaF(context);
        return zzaIf;
    }

    public static int zzaE(Context context) {
        zzaF(context);
        return zzaIg;
    }

    private static void zzaF(Context context) {
        synchronized (zzuH) {
            if (!zzRk) {
                zzRk = true;
                try {
                    Bundle bundle = zzbgz.zzaP(context).getApplicationInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f).metaData;
                    if (bundle != null) {
                        zzaIf = bundle.getString("com.google.app.id");
                        zzaIg = bundle.getInt("com.google.android.gms.version");
                    }
                } catch (PackageManager.NameNotFoundException e2) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e2);
                }
            }
        }
    }
}
