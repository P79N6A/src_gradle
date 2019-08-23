package com.google.android.gms.security;

import android.content.Context;
import android.os.AsyncTask;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import com.google.android.gms.common.zze;
import com.google.android.gms.security.ProviderInstaller;

public final class zza extends AsyncTask<Void, Void, Integer> {
    private /* synthetic */ ProviderInstaller.ProviderInstallListener zzbCI;
    private /* synthetic */ Context zztH;

    zza(Context context, ProviderInstaller.ProviderInstallListener providerInstallListener) {
        this.zztH = context;
        this.zzbCI = providerInstallListener;
    }

    /* access modifiers changed from: private */
    /* renamed from: zzb */
    public final Integer doInBackground(Void... voidArr) {
        int connectionStatusCode;
        try {
            ProviderInstaller.installIfNeeded(this.zztH);
            connectionStatusCode = 0;
        } catch (GooglePlayServicesRepairableException e2) {
            connectionStatusCode = e2.getConnectionStatusCode();
        } catch (GooglePlayServicesNotAvailableException e3) {
            connectionStatusCode = e3.errorCode;
        }
        return Integer.valueOf(connectionStatusCode);
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        Integer num = (Integer) obj;
        if (num.intValue() == 0) {
            this.zzbCI.onProviderInstalled();
            return;
        }
        zze unused = ProviderInstaller.zzbCG;
        this.zzbCI.onProviderInstallFailed(num.intValue(), zze.zza(this.zztH, num.intValue(), "pi"));
    }
}
