package com.google.android.gms.security;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.internal.zzbo;
import com.google.android.gms.common.zze;
import com.google.android.gms.common.zzo;
import java.lang.reflect.Method;

public class ProviderInstaller {
    /* access modifiers changed from: private */
    public static final zze zzbCG = zze.zzoW();
    private static Method zzbCH = null;
    private static final Object zzuH = new Object();

    public interface ProviderInstallListener {
        void onProviderInstallFailed(int i, Intent intent);

        void onProviderInstalled();
    }

    public static void installIfNeeded(Context context) throws GooglePlayServicesRepairableException, GooglePlayServicesNotAvailableException {
        zzbo.zzb(context, (Object) "Context must not be null");
        zze.zzas(context);
        Context remoteContext = zzo.getRemoteContext(context);
        if (remoteContext != null) {
            synchronized (zzuH) {
                try {
                    if (zzbCH == null) {
                        zzbCH = remoteContext.getClassLoader().loadClass("com.google.android.gms.common.security.ProviderInstallerImpl").getMethod("insertProvider", new Class[]{Context.class});
                    }
                    zzbCH.invoke(null, new Object[]{remoteContext});
                } catch (Exception e2) {
                    String valueOf = String.valueOf(e2.getMessage());
                    if (valueOf.length() != 0) {
                        "Failed to install provider: ".concat(valueOf);
                    } else {
                        new String("Failed to install provider: ");
                    }
                    throw new GooglePlayServicesNotAvailableException(8);
                } catch (Throwable th) {
                    throw th;
                }
            }
            return;
        }
        throw new GooglePlayServicesNotAvailableException(8);
    }

    public static void installIfNeededAsync(Context context, ProviderInstallListener providerInstallListener) {
        zzbo.zzb(context, (Object) "Context must not be null");
        zzbo.zzb(providerInstallListener, (Object) "Listener must not be null");
        zzbo.zzcz("Must be called on the UI thread");
        new zza(context, providerInstallListener).execute(new Void[0]);
    }
}
