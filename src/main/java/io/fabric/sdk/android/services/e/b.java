package io.fabric.sdk.android.services.e;

import android.content.Context;
import io.fabric.sdk.android.i;
import java.io.File;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f83291a;

    /* renamed from: b  reason: collision with root package name */
    private final String f83292b;

    /* renamed from: c  reason: collision with root package name */
    private final String f83293c;

    public final File a() {
        File filesDir = this.f83291a.getFilesDir();
        if (filesDir == null || (!filesDir.exists() && !filesDir.mkdirs())) {
            return null;
        }
        return filesDir;
    }

    public b(i iVar) {
        if (iVar.context != null) {
            this.f83291a = iVar.context;
            this.f83292b = iVar.getPath();
            this.f83293c = "Android/" + this.f83291a.getPackageName();
            return;
        }
        throw new IllegalStateException("Cannot get directory before context has been set. Call Fabric.with() first");
    }
}
