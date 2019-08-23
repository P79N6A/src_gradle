package com.ss.android.ugc.aweme.al;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.BuildConfig;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.io.FileSystem;

public final class b implements a, Closeable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33300a;

    /* renamed from: b  reason: collision with root package name */
    public final DiskLruCache f33301b;

    public final void close() throws IOException {
        if (PatchProxy.isSupport(new Object[0], this, f33300a, false, 82094, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33300a, false, 82094, new Class[0], Void.TYPE);
            return;
        }
        if (this.f33301b != null) {
            this.f33301b.close();
        }
    }

    public b(File file, int i, long j) throws IOException {
        this.f33301b = DiskLruCache.create(FileSystem.SYSTEM, file, BuildConfig.VERSION_CODE, 2, 16777216);
    }
}
