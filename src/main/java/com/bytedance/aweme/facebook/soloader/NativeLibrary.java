package com.bytedance.aweme.facebook.soloader;

import android.support.annotation.Nullable;
import java.util.List;

public abstract class NativeLibrary {
    private static final String TAG = "com.bytedance.aweme.facebook.soloader.NativeLibrary";
    private boolean mLibrariesLoaded = false;
    @Nullable
    private List<String> mLibraryNames;
    @Nullable
    private volatile UnsatisfiedLinkError mLinkError = null;
    private Boolean mLoadLibraries = Boolean.TRUE;
    private final Object mLock = new Object();

    /* access modifiers changed from: protected */
    public void initialNativeCheck() throws UnsatisfiedLinkError {
    }

    @Nullable
    public UnsatisfiedLinkError getError() {
        return this.mLinkError;
    }

    public void ensureLoaded() throws UnsatisfiedLinkError {
        if (!loadLibraries()) {
            throw this.mLinkError;
        }
    }

    @Nullable
    public boolean loadLibraries() {
        synchronized (this.mLock) {
            if (!this.mLoadLibraries.booleanValue()) {
                boolean z = this.mLibrariesLoaded;
                return z;
            }
            try {
                if (this.mLibraryNames != null) {
                    for (String loadLibrary : this.mLibraryNames) {
                        SoLoader.loadLibrary(loadLibrary);
                    }
                }
                initialNativeCheck();
                this.mLibrariesLoaded = true;
                this.mLibraryNames = null;
            } catch (UnsatisfiedLinkError e2) {
                this.mLinkError = e2;
                this.mLibrariesLoaded = false;
            } catch (Throwable th) {
                this.mLinkError = new UnsatisfiedLinkError("Failed loading libraries");
                this.mLinkError.initCause(th);
                this.mLibrariesLoaded = false;
            }
            this.mLoadLibraries = Boolean.FALSE;
            boolean z2 = this.mLibrariesLoaded;
            return z2;
        }
    }

    protected NativeLibrary(List<String> list) {
        this.mLibraryNames = list;
    }
}
