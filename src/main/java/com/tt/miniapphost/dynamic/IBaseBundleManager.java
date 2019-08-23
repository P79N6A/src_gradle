package com.tt.miniapphost.dynamic;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import com.tt.miniapphost.process.annotation.AnyProcess;

public interface IBaseBundleManager {
    @AnyProcess
    void checkUpdateBaseBundle(@NonNull Context context, boolean z);

    @AnyProcess
    String getSdkCurrentVersionStr(@NonNull Context context);

    boolean handleTmaTest(Context context, Uri uri);

    void preload(Context context);
}
