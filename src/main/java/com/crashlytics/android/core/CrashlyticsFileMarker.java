package com.crashlytics.android.core;

import io.fabric.sdk.android.services.e.a;
import java.io.File;
import java.io.IOException;

public class CrashlyticsFileMarker {
    private final a fileStore;
    private final String markerName;

    private File getMarkerFile() {
        return new File(this.fileStore.a(), this.markerName);
    }

    public boolean isPresent() {
        return getMarkerFile().exists();
    }

    public boolean remove() {
        return getMarkerFile().delete();
    }

    public boolean create() {
        try {
            return getMarkerFile().createNewFile();
        } catch (IOException unused) {
            new StringBuilder("Error creating marker: ").append(this.markerName);
            return false;
        }
    }

    public CrashlyticsFileMarker(String str, a aVar) {
        this.markerName = str;
        this.fileStore = aVar;
    }
}
