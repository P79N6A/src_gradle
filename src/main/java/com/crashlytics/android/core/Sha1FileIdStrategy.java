package com.crashlytics.android.core;

import com.crashlytics.android.core.BinaryImagesConverter;
import io.fabric.sdk.android.services.b.i;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Sha1FileIdStrategy implements BinaryImagesConverter.FileIdStrategy {
    Sha1FileIdStrategy() {
    }

    public String createId(File file) throws IOException {
        return getFileSHA(file.getPath());
    }

    private static String getFileSHA(String str) throws IOException {
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(str));
            try {
                String b2 = i.b((InputStream) bufferedInputStream2);
                i.a((Closeable) bufferedInputStream2);
                return b2;
            } catch (Throwable th) {
                th = th;
                bufferedInputStream = bufferedInputStream2;
                i.a((Closeable) bufferedInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i.a((Closeable) bufferedInputStream);
            throw th;
        }
    }
}
