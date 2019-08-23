package com.bytedance.aweme.facebook.soloader;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.StrictMode;
import android.support.annotation.Nullable;
import java.io.File;
import java.io.IOException;
import java.util.Collection;

public class ApplicationSoSource extends SoSource {
    private Context applicationContext;
    private int flags;
    private DirectorySoSource soSource;

    public String toString() {
        return this.soSource.toString();
    }

    public boolean checkAndMaybeUpdate() throws IOException {
        try {
            File file = this.soSource.soDirectory;
            Context createPackageContext = this.applicationContext.createPackageContext(this.applicationContext.getPackageName(), 0);
            File file2 = new File(createPackageContext.getApplicationInfo().nativeLibraryDir);
            if (file.equals(file2)) {
                return false;
            }
            this.flags |= 1;
            this.soSource = new DirectorySoSource(file2, this.flags);
            this.soSource.prepare(this.flags);
            this.applicationContext = createPackageContext;
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    public void addToLdLibraryPath(Collection<String> collection) {
        this.soSource.addToLdLibraryPath(collection);
    }

    /* access modifiers changed from: protected */
    public void prepare(int i) throws IOException {
        this.soSource.prepare(i);
    }

    @Nullable
    public File unpackLibrary(String str) throws IOException {
        return this.soSource.unpackLibrary(str);
    }

    public ApplicationSoSource(Context context, int i) {
        this.applicationContext = context.getApplicationContext();
        if (this.applicationContext == null) {
            this.applicationContext = context;
        }
        this.flags = i;
        this.soSource = new DirectorySoSource(new File(this.applicationContext.getApplicationInfo().nativeLibraryDir), i);
    }

    public int loadLibrary(String str, int i, StrictMode.ThreadPolicy threadPolicy) throws IOException {
        return this.soSource.loadLibrary(str, i, threadPolicy);
    }
}
