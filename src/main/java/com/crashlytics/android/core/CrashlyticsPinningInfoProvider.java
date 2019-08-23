package com.crashlytics.android.core;

import io.fabric.sdk.android.services.d.f;
import java.io.InputStream;

public class CrashlyticsPinningInfoProvider implements f {
    private final PinningInfoProvider pinningInfo;

    public long getPinCreationTimeInMillis() {
        return -1;
    }

    public String getKeyStorePassword() {
        return this.pinningInfo.getKeyStorePassword();
    }

    public InputStream getKeyStoreStream() {
        return this.pinningInfo.getKeyStoreStream();
    }

    public String[] getPins() {
        return this.pinningInfo.getPins();
    }

    public CrashlyticsPinningInfoProvider(PinningInfoProvider pinningInfoProvider) {
        this.pinningInfo = pinningInfoProvider;
    }
}
