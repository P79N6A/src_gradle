package com.ss.android.downloadlib;

import android.support.annotation.NonNull;
import com.ss.android.download.api.a;
import com.ss.android.download.api.config.b;
import com.ss.android.download.api.config.d;
import com.ss.android.download.api.config.e;
import com.ss.android.download.api.config.f;
import com.ss.android.download.api.config.g;
import com.ss.android.download.api.config.h;
import com.ss.android.download.api.config.i;
import com.ss.android.download.api.config.j;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.socialbase.appdownloader.AppDownloader;
import com.ss.android.socialbase.appdownloader.depend.IAppDownloadMonitorListener;

public final class c implements a {
    c() {
    }

    public final a a(@NonNull IAppDownloadMonitorListener iAppDownloadMonitorListener) {
        k.j = iAppDownloadMonitorListener;
        AppDownloader.getInstance().setAppDownloadMonitorListener(iAppDownloadMonitorListener);
        return this;
    }

    public final a a(@NonNull com.ss.android.download.api.c.a aVar) {
        k.g = aVar;
        return this;
    }

    public final a a(@NonNull com.ss.android.download.api.config.a aVar) {
        k.h = aVar;
        return this;
    }

    public final a a(@NonNull b bVar) {
        k.f28837b = bVar;
        return this;
    }

    public final a a(@NonNull d dVar) {
        k.f28836a = dVar;
        return this;
    }

    public final a a(@NonNull e eVar) {
        k.f28839d = eVar;
        return this;
    }

    public final a a(@NonNull f fVar) {
        k.f28840e = fVar;
        return this;
    }

    public final a a(@NonNull g gVar) {
        k.f28841f = gVar;
        try {
            k.a(gVar.a());
            k.b(gVar.a());
            if (gVar.a().optInt("hook", 0) == 1) {
                com.ss.android.downloadlib.c.a.a();
            }
        } catch (Exception unused) {
        }
        return this;
    }

    public final a a(@NonNull h hVar) {
        k.f28838c = hVar;
        return this;
    }

    public final a a(@NonNull i iVar) {
        k.i = iVar;
        AppDownloader.getInstance().setFileProviderAuthority(iVar.a());
        return this;
    }

    public final a a(j jVar) {
        k.k = jVar;
        return this;
    }
}
