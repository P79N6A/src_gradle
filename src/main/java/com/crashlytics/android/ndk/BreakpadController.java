package com.crashlytics.android.ndk;

import android.content.Context;
import com.crashlytics.android.core.CrashlyticsNdkData;
import java.io.File;
import java.io.IOException;
import java.util.TreeSet;

public class BreakpadController implements NdkKitController {
    private final Context context;
    private final CrashFilesManager filesManager;
    private final NativeApi nativeApi;

    public CrashlyticsNdkData getNativeData() throws IOException {
        TreeSet allNativeDirectories = this.filesManager.getAllNativeDirectories();
        if (!allNativeDirectories.isEmpty()) {
            allNativeDirectories.pollFirst();
        }
        return new CrashlyticsNdkData(allNativeDirectories);
    }

    public boolean initialize() {
        File newNativeDirectory = this.filesManager.getNewNativeDirectory();
        if (newNativeDirectory == null) {
            return false;
        }
        try {
            return this.nativeApi.initialize(newNativeDirectory.getCanonicalPath(), this.context.getAssets());
        } catch (IOException unused) {
            return false;
        }
    }

    BreakpadController(Context context2, NativeApi nativeApi2, CrashFilesManager crashFilesManager) {
        this.context = context2;
        this.nativeApi = nativeApi2;
        this.filesManager = crashFilesManager;
    }
}
