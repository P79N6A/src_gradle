package com.crashlytics.android.ndk;

import com.crashlytics.android.core.CrashlyticsCore;
import com.crashlytics.android.core.CrashlyticsKitBinder;
import com.crashlytics.android.core.CrashlyticsNdkData;
import com.crashlytics.android.core.CrashlyticsNdkDataProvider;
import io.fabric.sdk.android.c;
import io.fabric.sdk.android.i;
import io.fabric.sdk.android.services.concurrency.l;
import io.fabric.sdk.android.services.e.b;
import java.io.IOException;

public class CrashlyticsNdk extends i<Void> implements CrashlyticsNdkDataProvider {
    private NdkKitController controller;
    private CrashlyticsNdkData crashlyticsNdkData;

    public String getIdentifier() {
        return "com.crashlytics.sdk.android.crashlytics-ndk";
    }

    public String getVersion() {
        return "2.1.0.33";
    }

    public CrashlyticsNdkData getCrashlyticsNdkData() {
        return this.crashlyticsNdkData;
    }

    public static CrashlyticsNdk getInstance() {
        return (CrashlyticsNdk) c.a(CrashlyticsNdk.class);
    }

    /* access modifiers changed from: protected */
    public Void doInBackground() {
        try {
            this.crashlyticsNdkData = this.controller.getNativeData();
        } catch (IOException unused) {
        }
        return null;
    }

    public boolean onPreExecute() {
        CrashlyticsCore crashlyticsCore = (CrashlyticsCore) c.a(CrashlyticsCore.class);
        if (crashlyticsCore != null) {
            return onPreExecute(new BreakpadController(this.context, new JniNativeApi(), new NdkCrashFilesManager(new b(this))), crashlyticsCore, new CrashlyticsKitBinder());
        }
        throw new l("CrashlyticsNdk requires Crashlytics");
    }

    /* access modifiers changed from: package-private */
    public boolean onPreExecute(NdkKitController ndkKitController, CrashlyticsCore crashlyticsCore, CrashlyticsKitBinder crashlyticsKitBinder) {
        this.controller = ndkKitController;
        boolean initialize = ndkKitController.initialize();
        if (initialize) {
            crashlyticsKitBinder.bindCrashEventDataProvider(crashlyticsCore, this);
        }
        return initialize;
    }
}
