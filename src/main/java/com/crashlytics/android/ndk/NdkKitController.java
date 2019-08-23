package com.crashlytics.android.ndk;

import com.crashlytics.android.core.CrashlyticsNdkData;
import java.io.IOException;

public interface NdkKitController {
    CrashlyticsNdkData getNativeData() throws IOException;

    boolean initialize();
}
