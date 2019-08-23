package com.mapbox.mapboxsdk.http;

import android.content.res.AssetManager;
import android.os.AsyncTask;
import com.mapbox.mapboxsdk.b;
import com.mapbox.mapboxsdk.d;
import com.mapbox.mapboxsdk.log.Logger;
import java.io.IOException;
import java.io.InputStream;

public final class e extends AsyncTask<String, Void, byte[]> {

    /* renamed from: a  reason: collision with root package name */
    private a f26498a;

    public interface a {
        void a(byte[] bArr);
    }

    e(a aVar) {
        this.f26498a = aVar;
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ void onPostExecute(Object obj) {
        byte[] bArr = (byte[]) obj;
        super.onPostExecute(bArr);
        if (bArr != null && this.f26498a != null) {
            this.f26498a.a(bArr);
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object doInBackground(Object[] objArr) {
        AssetManager assets = d.b().getAssets();
        return a(assets, "integration/" + ((String[]) objArr)[0].substring(8).replaceAll("%20", " ").replaceAll("%2c", ","));
    }

    private static byte[] a(AssetManager assetManager, String str) {
        byte[] bArr;
        Throwable th = null;
        try {
            InputStream open = assetManager.open(str);
            try {
                bArr = new byte[open.available()];
                try {
                    open.read(bArr);
                    if (open != null) {
                        try {
                            open.close();
                        } catch (IOException e2) {
                            e = e2;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                bArr = null;
                if (open != null) {
                    if (th != null) {
                        try {
                            open.close();
                        } catch (Throwable th5) {
                            com.google.a.a.a.a.a.a.a(th, th5);
                        }
                    } else {
                        open.close();
                    }
                }
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            bArr = null;
            Logger.e("Mbgl-LocalRequestTask", "Load file failed", e);
            b.a("Load file failed", e);
            return bArr;
        }
        return bArr;
    }
}
