package com.google.android.gms.ads.identifier;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class zza extends Thread {
    private /* synthetic */ String zzsF;

    zza(AdvertisingIdClient advertisingIdClient, String str) {
        this.zzsF = str;
    }

    public final void run() {
        HttpURLConnection httpURLConnection;
        new zzb();
        try {
            httpURLConnection = (HttpURLConnection) new URL(this.zzsF).openConnection();
            httpURLConnection.getResponseCode();
            httpURLConnection.disconnect();
        } catch (IOException | IndexOutOfBoundsException | RuntimeException unused) {
        } catch (Throwable th) {
            httpURLConnection.disconnect();
            throw th;
        }
    }
}
