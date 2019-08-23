package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.v4.util.SimpleArrayMap;
import android.text.TextUtils;
import com.google.android.gms.common.util.zzj;
import com.google.android.gms.internal.zzbgz;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;

public final class zzs {
    private static final SimpleArrayMap<String, String> zzaHo = new SimpleArrayMap<>();

    private static String zzaB(Context context) {
        String packageName = context.getPackageName();
        try {
            return zzbgz.zzaP(context).zzcM(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        return null;
     */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String zzg(android.content.Context r2, int r3) {
        /*
            android.content.res.Resources r0 = r2.getResources()
            r1 = 20
            if (r3 == r1) goto L_0x003f
            r1 = 0
            switch(r3) {
                case 1: goto L_0x0037;
                case 2: goto L_0x002f;
                case 3: goto L_0x0027;
                case 4: goto L_0x0026;
                case 5: goto L_0x001f;
                case 6: goto L_0x0026;
                case 7: goto L_0x0018;
                case 8: goto L_0x0017;
                case 9: goto L_0x0017;
                case 10: goto L_0x0017;
                case 11: goto L_0x0017;
                default: goto L_0x000c;
            }
        L_0x000c:
            switch(r3) {
                case 16: goto L_0x0017;
                case 17: goto L_0x0010;
                case 18: goto L_0x0026;
                default: goto L_0x000f;
            }
        L_0x000f:
            return r1
        L_0x0010:
            java.lang.String r3 = "common_google_play_services_sign_in_failed_title"
            java.lang.String r2 = zzz(r2, r3)
            return r2
        L_0x0017:
            return r1
        L_0x0018:
            java.lang.String r3 = "common_google_play_services_network_error_title"
            java.lang.String r2 = zzz(r2, r3)
            return r2
        L_0x001f:
            java.lang.String r3 = "common_google_play_services_invalid_account_title"
            java.lang.String r2 = zzz(r2, r3)
            return r2
        L_0x0026:
            return r1
        L_0x0027:
            r2 = 2131559428(0x7f0d0404, float:1.87442E38)
            java.lang.String r2 = r0.getString(r2)
            return r2
        L_0x002f:
            r2 = 2131559437(0x7f0d040d, float:1.8744218E38)
            java.lang.String r2 = r0.getString(r2)
            return r2
        L_0x0037:
            r2 = 2131559431(0x7f0d0407, float:1.8744206E38)
            java.lang.String r2 = r0.getString(r2)
            return r2
        L_0x003f:
            java.lang.String r3 = "common_google_play_services_restricted_profile_title"
            java.lang.String r2 = zzz(r2, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzs.zzg(android.content.Context, int):java.lang.String");
    }

    @NonNull
    public static String zzh(Context context, int i) {
        String zzz = i == 6 ? zzz(context, "common_google_play_services_resolution_required_title") : zzg(context, i);
        return zzz == null ? context.getResources().getString(C0906R.string.a0b) : zzz;
    }

    @NonNull
    public static String zzi(Context context, int i) {
        Resources resources = context.getResources();
        String zzaB = zzaB(context);
        if (i == 5) {
            return zzl(context, "common_google_play_services_invalid_account_text", zzaB);
        }
        if (i == 7) {
            return zzl(context, "common_google_play_services_network_error_text", zzaB);
        }
        if (i == 9) {
            return resources.getString(C0906R.string.a0d, new Object[]{zzaB});
        } else if (i == 20) {
            return zzl(context, "common_google_play_services_restricted_profile_text", zzaB);
        } else {
            switch (i) {
                case 1:
                    return resources.getString(C0906R.string.a0_, new Object[]{zzaB});
                case 2:
                    if (zzj.zzaH(context)) {
                        return resources.getString(C0906R.string.a0i);
                    }
                    return resources.getString(C0906R.string.a0f, new Object[]{zzaB});
                case 3:
                    return resources.getString(C0906R.string.a07, new Object[]{zzaB});
                default:
                    switch (i) {
                        case SearchJediMixFeedAdapter.f42514c /*?: ONE_ARG  (16 int)*/:
                            return zzl(context, "common_google_play_services_api_unavailable_text", zzaB);
                        case 17:
                            return zzl(context, "common_google_play_services_sign_in_failed_text", zzaB);
                        case 18:
                            return resources.getString(C0906R.string.a0h, new Object[]{zzaB});
                        default:
                            return resources.getString(C0906R.string.a0c, new Object[]{zzaB});
                    }
            }
        }
    }

    @NonNull
    public static String zzj(Context context, int i) {
        return i == 6 ? zzl(context, "common_google_play_services_resolution_required_text", zzaB(context)) : zzi(context, i);
    }

    @NonNull
    public static String zzk(Context context, int i) {
        int i2;
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                i2 = C0906R.string.a09;
                break;
            case 2:
                i2 = C0906R.string.a0e;
                break;
            case 3:
                i2 = C0906R.string.a06;
                break;
            default:
                i2 = 17039370;
                break;
        }
        return resources.getString(i2);
    }

    private static String zzl(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String zzz = zzz(context, str);
        if (zzz == null) {
            zzz = resources.getString(C0906R.string.a0c);
        }
        return String.format(resources.getConfiguration().locale, zzz, new Object[]{str2});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0059, code lost:
        return null;
     */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String zzz(android.content.Context r4, java.lang.String r5) {
        /*
            android.support.v4.util.SimpleArrayMap<java.lang.String, java.lang.String> r0 = zzaHo
            monitor-enter(r0)
            android.support.v4.util.SimpleArrayMap<java.lang.String, java.lang.String> r1 = zzaHo     // Catch:{ all -> 0x0061 }
            java.lang.Object r1 = r1.get(r5)     // Catch:{ all -> 0x0061 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0061 }
            if (r1 == 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x000f:
            android.content.res.Resources r4 = com.google.android.gms.common.GooglePlayServicesUtil.getRemoteResource(r4)     // Catch:{ all -> 0x0061 }
            r1 = 0
            if (r4 != 0) goto L_0x0018
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x0018:
            java.lang.String r2 = "string"
            java.lang.String r3 = "com.google.android.gms"
            int r2 = r4.getIdentifier(r5, r2, r3)     // Catch:{ all -> 0x0061 }
            if (r2 != 0) goto L_0x0039
            java.lang.String r4 = "Missing resource: "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0061 }
            int r2 = r5.length()     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0032
            r4.concat(r5)     // Catch:{ all -> 0x0061 }
            goto L_0x0037
        L_0x0032:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0061 }
            r5.<init>(r4)     // Catch:{ all -> 0x0061 }
        L_0x0037:
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x0039:
            java.lang.String r4 = r4.getString(r2)     // Catch:{ all -> 0x0061 }
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x005a
            java.lang.String r4 = "Got empty resource: "
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ all -> 0x0061 }
            int r2 = r5.length()     // Catch:{ all -> 0x0061 }
            if (r2 == 0) goto L_0x0053
            r4.concat(r5)     // Catch:{ all -> 0x0061 }
            goto L_0x0058
        L_0x0053:
            java.lang.String r5 = new java.lang.String     // Catch:{ all -> 0x0061 }
            r5.<init>(r4)     // Catch:{ all -> 0x0061 }
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r1
        L_0x005a:
            android.support.v4.util.SimpleArrayMap<java.lang.String, java.lang.String> r1 = zzaHo     // Catch:{ all -> 0x0061 }
            r1.put(r5, r4)     // Catch:{ all -> 0x0061 }
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            return r4
        L_0x0061:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0061 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.zzs.zzz(android.content.Context, java.lang.String):java.lang.String");
    }
}
