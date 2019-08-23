package io.fabric.sdk.android.services.b;

import io.fabric.sdk.android.i;
import io.fabric.sdk.android.services.d.c;
import io.fabric.sdk.android.services.d.d;
import io.fabric.sdk.android.services.d.e;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Pattern;

public abstract class a {
    private static final Pattern PROTOCOL_AND_HOST_PATTERN = Pattern.compile("http(s?)://[^\\/]+", 2);
    protected final i kit;
    private final c method;
    private final String protocolAndHostOverride;
    private final e requestFactory;
    public final String url;

    /* access modifiers changed from: protected */
    public d getHttpRequest() {
        return getHttpRequest(Collections.emptyMap());
    }

    private String overrideProtocolAndHost(String str) {
        if (!i.b(this.protocolAndHostOverride)) {
            return PROTOCOL_AND_HOST_PATTERN.matcher(str).replaceFirst(this.protocolAndHostOverride);
        }
        return str;
    }

    /* access modifiers changed from: protected */
    public d getHttpRequest(Map<String, String> map) {
        d a2 = this.requestFactory.a(this.method, this.url, map);
        a2.a().setUseCaches(false);
        a2.a().setConnectTimeout(10000);
        return a2.a("User-Agent", "Crashlytics Android SDK/" + this.kit.getVersion()).a("X-CRASHLYTICS-DEVELOPER-TOKEN", "470fa2b4ae81cd56ecbcda9735803434cec591fa");
    }

    public a(i iVar, String str, String str2, e eVar, c cVar) {
        if (str2 == null) {
            throw new IllegalArgumentException("url must not be null.");
        } else if (eVar != null) {
            this.kit = iVar;
            this.protocolAndHostOverride = str;
            this.url = overrideProtocolAndHost(str2);
            this.requestFactory = eVar;
            this.method = cVar;
        } else {
            throw new IllegalArgumentException("requestFactory must not be null.");
        }
    }
}
