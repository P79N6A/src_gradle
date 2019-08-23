package io.fabric.sdk.android.services.d;

import java.io.InputStream;

public interface f {
    String getKeyStorePassword();

    InputStream getKeyStoreStream();

    long getPinCreationTimeInMillis();

    String[] getPins();
}
