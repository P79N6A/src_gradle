package com.facebook.react.modules.network;

import android.os.Build;
import com.facebook.common.logging.FLog;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import okhttp3.ConnectionSpec;
import okhttp3.OkHttpClient;
import okhttp3.TlsVersion;

public class OkHttpClientProvider {
    @Nullable
    private static OkHttpClient sClient;
    @Nullable
    private static OkHttpClientFactory sFactory;

    public static OkHttpClient getOkHttpClient() {
        if (sClient == null) {
            sClient = createClient();
        }
        return sClient;
    }

    public static OkHttpClient createClient() {
        if (sFactory != null) {
            return sFactory.createNewNetworkModuleClient();
        }
        return createClientBuilder().build();
    }

    public static OkHttpClient.Builder createClientBuilder() {
        return enableTls12OnPreLollipop(new OkHttpClient.Builder().connectTimeout(0, TimeUnit.MILLISECONDS).readTimeout(0, TimeUnit.MILLISECONDS).writeTimeout(0, TimeUnit.MILLISECONDS).cookieJar(new ReactCookieJarContainer()));
    }

    public static void replaceOkHttpClient(OkHttpClient okHttpClient) {
        sClient = okHttpClient;
    }

    public static void setOkHttpClientFactory(OkHttpClientFactory okHttpClientFactory) {
        sFactory = okHttpClientFactory;
    }

    public static OkHttpClient.Builder enableTls12OnPreLollipop(OkHttpClient.Builder builder) {
        if (Build.VERSION.SDK_INT >= 16 && Build.VERSION.SDK_INT <= 19) {
            try {
                builder.sslSocketFactory(new TLSSocketFactory());
                ConnectionSpec build = new ConnectionSpec.Builder(ConnectionSpec.MODERN_TLS).tlsVersions(TlsVersion.TLS_1_2).build();
                ArrayList arrayList = new ArrayList();
                arrayList.add(build);
                arrayList.add(ConnectionSpec.COMPATIBLE_TLS);
                arrayList.add(ConnectionSpec.CLEARTEXT);
                builder.connectionSpecs(arrayList);
            } catch (Exception e2) {
                FLog.e("OkHttpClientProvider", "Error while enabling TLS 1.2", (Throwable) e2);
            }
        }
        return builder;
    }
}
