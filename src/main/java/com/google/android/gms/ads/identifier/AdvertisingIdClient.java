package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.annotation.KeepForSdkWithMembers;
import com.google.android.gms.common.internal.zzbo;
import com.google.android.gms.common.zze;
import com.google.android.gms.common.zzo;
import com.google.android.gms.internal.zzfd;
import com.google.android.gms.internal.zzfe;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.q.c;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

@KeepForSdkWithMembers
public class AdvertisingIdClient {
    private final Context mContext;
    @Nullable
    private zzfd zzsA;
    private boolean zzsB;
    private Object zzsC;
    @Nullable
    private zza zzsD;
    private long zzsE;
    @Nullable
    private com.google.android.gms.common.zza zzsz;

    public static final class Info {
        private final String zzsK;
        private final boolean zzsL;

        public Info(String str, boolean z) {
            this.zzsK = str;
            this.zzsL = z;
        }

        public final String getId() {
            return this.zzsK;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.zzsL;
        }

        public final String toString() {
            String str = this.zzsK;
            boolean z = this.zzsL;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    static class zza extends Thread {
        private WeakReference<AdvertisingIdClient> zzsG;
        private long zzsH;
        CountDownLatch zzsI = new CountDownLatch(1);
        boolean zzsJ = false;

        public zza(AdvertisingIdClient advertisingIdClient, long j) {
            this.zzsG = new WeakReference<>(advertisingIdClient);
            this.zzsH = j;
            start();
        }

        private final void disconnect() {
            AdvertisingIdClient advertisingIdClient = (AdvertisingIdClient) this.zzsG.get();
            if (advertisingIdClient != null) {
                advertisingIdClient.finish();
                this.zzsJ = true;
            }
        }

        public final void run() {
            try {
                if (!this.zzsI.await(this.zzsH, TimeUnit.MILLISECONDS)) {
                    disconnect();
                }
            } catch (InterruptedException unused) {
                disconnect();
            }
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000, false);
    }

    public AdvertisingIdClient(Context context, long j, boolean z) {
        this.zzsC = new Object();
        zzbo.zzu(context);
        if (z) {
            Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                context = applicationContext;
            }
        }
        this.mContext = context;
        this.zzsB = false;
        this.zzsE = j;
    }

    @Nullable
    public static Info getAdvertisingIdInfo(Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        boolean z;
        AdvertisingIdClient advertisingIdClient;
        float f2 = 0.0f;
        try {
            Context remoteContext = zzo.getRemoteContext(context);
            if (remoteContext != null) {
                SharedPreferences a2 = c.a(remoteContext, "google_ads_flags", 0);
                z = a2.getBoolean("gads:ad_id_app_context:enabled", false);
                try {
                    f2 = a2.getFloat("gads:ad_id_app_context:ping_ratio", 0.0f);
                } catch (Exception unused) {
                }
                advertisingIdClient = new AdvertisingIdClient(context, -1, z);
                advertisingIdClient.start(false);
                Info info = advertisingIdClient.getInfo();
                advertisingIdClient.zza(info, z, f2, null);
                return info;
            }
        } catch (Exception unused2) {
        }
        z = false;
        advertisingIdClient = new AdvertisingIdClient(context, -1, z);
        try {
            advertisingIdClient.start(false);
            Info info2 = advertisingIdClient.getInfo();
            advertisingIdClient.zza(info2, z, f2, null);
            return info2;
        } catch (Throwable th) {
            advertisingIdClient.zza(null, z, f2, th);
            return null;
        } finally {
            advertisingIdClient.finish();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    private final void start(boolean z) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        zzbo.zzcG("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzsB) {
                finish();
            }
            this.zzsz = zzd(this.mContext);
            this.zzsA = zza(this.mContext, this.zzsz);
            this.zzsB = true;
            if (z) {
                zzaj();
            }
        }
    }

    private static zzfd zza(Context context, com.google.android.gms.common.zza zza2) throws IOException {
        try {
            return zzfe.zzc(zza2.zza(10000, TimeUnit.MILLISECONDS));
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    private final void zza(Info info, boolean z, float f2, Throwable th) {
        if (Math.random() <= ((double) f2)) {
            Bundle bundle = new Bundle();
            bundle.putString("app_context", z ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY);
            if (info != null) {
                bundle.putString("limit_ad_tracking", info.isLimitAdTrackingEnabled() ? PushConstants.PUSH_TYPE_THROUGH_MESSAGE : PushConstants.PUSH_TYPE_NOTIFY);
            }
            if (!(info == null || info.getId() == null)) {
                bundle.putString("ad_id_size", Integer.toString(info.getId().length()));
            }
            if (th != null) {
                bundle.putString("error", th.getClass().getName());
            }
            Uri.Builder buildUpon = Uri.parse("https://pagead2.googlesyndication.com/pagead/gen_204?id=gmob-apps").buildUpon();
            for (String str : bundle.keySet()) {
                buildUpon.appendQueryParameter(str, bundle.getString(str));
            }
            new zza(this, buildUpon.build().toString()).start();
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:2|3|(3:5|6|7)|8|9|(1:11)|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void zzaj() {
        /*
            r6 = this;
            java.lang.Object r0 = r6.zzsC
            monitor-enter(r0)
            com.google.android.gms.ads.identifier.AdvertisingIdClient$zza r1 = r6.zzsD     // Catch:{ all -> 0x0026 }
            if (r1 == 0) goto L_0x0013
            com.google.android.gms.ads.identifier.AdvertisingIdClient$zza r1 = r6.zzsD     // Catch:{ all -> 0x0026 }
            java.util.concurrent.CountDownLatch r1 = r1.zzsI     // Catch:{ all -> 0x0026 }
            r1.countDown()     // Catch:{ all -> 0x0026 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$zza r1 = r6.zzsD     // Catch:{ InterruptedException -> 0x0013 }
            r1.join()     // Catch:{ InterruptedException -> 0x0013 }
        L_0x0013:
            long r1 = r6.zzsE     // Catch:{ all -> 0x0026 }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0024
            com.google.android.gms.ads.identifier.AdvertisingIdClient$zza r1 = new com.google.android.gms.ads.identifier.AdvertisingIdClient$zza     // Catch:{ all -> 0x0026 }
            long r2 = r6.zzsE     // Catch:{ all -> 0x0026 }
            r1.<init>(r6, r2)     // Catch:{ all -> 0x0026 }
            r6.zzsD = r1     // Catch:{ all -> 0x0026 }
        L_0x0024:
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0026 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.zzaj():void");
    }

    private static com.google.android.gms.common.zza zzd(Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int isGooglePlayServicesAvailable = zze.zzoW().isGooglePlayServicesAvailable(context);
            if (isGooglePlayServicesAvailable == 0 || isGooglePlayServicesAvailable == 2) {
                com.google.android.gms.common.zza zza2 = new com.google.android.gms.common.zza();
                Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                intent.setPackage("com.google.android.gms");
                try {
                    if (com.google.android.gms.common.stats.zza.zzrU().zza(context, intent, zza2, 1)) {
                        return zza2;
                    }
                    throw new IOException("Connection failure");
                } catch (Throwable th) {
                    throw new IOException(th);
                }
            } else {
                throw new IOException("Google Play services not available");
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new GooglePlayServicesNotAvailableException(9);
        }
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        finish();
        super.finalize();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0028, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void finish() {
        /*
            r2 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.zzbo.zzcG(r0)
            monitor-enter(r2)
            android.content.Context r0 = r2.mContext     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0027
            com.google.android.gms.common.zza r0 = r2.zzsz     // Catch:{ all -> 0x0029 }
            if (r0 != 0) goto L_0x000f
            goto L_0x0027
        L_0x000f:
            boolean r0 = r2.zzsB     // Catch:{ IllegalArgumentException | Throwable -> 0x001d }
            if (r0 == 0) goto L_0x001d
            com.google.android.gms.common.stats.zza.zzrU()     // Catch:{ IllegalArgumentException | Throwable -> 0x001d }
            android.content.Context r0 = r2.mContext     // Catch:{ IllegalArgumentException | Throwable -> 0x001d }
            com.google.android.gms.common.zza r1 = r2.zzsz     // Catch:{ IllegalArgumentException | Throwable -> 0x001d }
            r0.unbindService(r1)     // Catch:{ IllegalArgumentException | Throwable -> 0x001d }
        L_0x001d:
            r0 = 0
            r2.zzsB = r0     // Catch:{ all -> 0x0029 }
            r0 = 0
            r2.zzsA = r0     // Catch:{ all -> 0x0029 }
            r2.zzsz = r0     // Catch:{ all -> 0x0029 }
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            return
        L_0x0027:
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            return
        L_0x0029:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0029 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.finish():void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:39|40|41) */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0065, code lost:
        throw new java.io.IOException("Remote exception");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x005e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.google.android.gms.ads.identifier.AdvertisingIdClient.Info getInfo() throws java.io.IOException {
        /*
            r4 = this;
            java.lang.String r0 = "Calling this from your main thread can lead to deadlock"
            com.google.android.gms.common.internal.zzbo.zzcG(r0)
            monitor-enter(r4)
            boolean r0 = r4.zzsB     // Catch:{ all -> 0x0066 }
            if (r0 != 0) goto L_0x003d
            java.lang.Object r0 = r4.zzsC     // Catch:{ all -> 0x0066 }
            monitor-enter(r0)     // Catch:{ all -> 0x0066 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$zza r1 = r4.zzsD     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0032
            com.google.android.gms.ads.identifier.AdvertisingIdClient$zza r1 = r4.zzsD     // Catch:{ all -> 0x003a }
            boolean r1 = r1.zzsJ     // Catch:{ all -> 0x003a }
            if (r1 == 0) goto L_0x0032
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            r0 = 0
            r4.start(r0)     // Catch:{ Exception -> 0x0029 }
            boolean r0 = r4.zzsB     // Catch:{ all -> 0x0066 }
            if (r0 == 0) goto L_0x0021
            goto L_0x003d
        L_0x0021:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "AdvertisingIdClient cannot reconnect."
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0029:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = "AdvertisingIdClient cannot reconnect."
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0066 }
            throw r1     // Catch:{ all -> 0x0066 }
        L_0x0032:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x003a }
            java.lang.String r2 = "AdvertisingIdClient is not connected."
            r1.<init>(r2)     // Catch:{ all -> 0x003a }
            throw r1     // Catch:{ all -> 0x003a }
        L_0x003a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003a }
            throw r1     // Catch:{ all -> 0x0066 }
        L_0x003d:
            com.google.android.gms.common.zza r0 = r4.zzsz     // Catch:{ all -> 0x0066 }
            com.google.android.gms.common.internal.zzbo.zzu(r0)     // Catch:{ all -> 0x0066 }
            com.google.android.gms.internal.zzfd r0 = r4.zzsA     // Catch:{ all -> 0x0066 }
            com.google.android.gms.common.internal.zzbo.zzu(r0)     // Catch:{ all -> 0x0066 }
            com.google.android.gms.ads.identifier.AdvertisingIdClient$Info r0 = new com.google.android.gms.ads.identifier.AdvertisingIdClient$Info     // Catch:{ RemoteException -> 0x005e }
            com.google.android.gms.internal.zzfd r1 = r4.zzsA     // Catch:{ RemoteException -> 0x005e }
            java.lang.String r1 = r1.getId()     // Catch:{ RemoteException -> 0x005e }
            com.google.android.gms.internal.zzfd r2 = r4.zzsA     // Catch:{ RemoteException -> 0x005e }
            r3 = 1
            boolean r2 = r2.zzb(r3)     // Catch:{ RemoteException -> 0x005e }
            r0.<init>(r1, r2)     // Catch:{ RemoteException -> 0x005e }
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            r4.zzaj()
            return r0
        L_0x005e:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x0066 }
            java.lang.String r1 = "Remote exception"
            r0.<init>(r1)     // Catch:{ all -> 0x0066 }
            throw r0     // Catch:{ all -> 0x0066 }
        L_0x0066:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0066 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.identifier.AdvertisingIdClient.getInfo():com.google.android.gms.ads.identifier.AdvertisingIdClient$Info");
    }

    public void start() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        start(true);
    }
}
