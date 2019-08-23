package io.fabric.sdk.android.services.c;

import java.io.IOException;

public interface e {
    void cancelTimeBasedFileRollOver();

    boolean rollFileOver() throws IOException;
}
