package io.fabric.sdk.android.services.c;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

public final class g extends h {
    public final OutputStream a(File file) throws IOException {
        return new GZIPOutputStream(new FileOutputStream(file));
    }

    public g(Context context, File file, String str, String str2) throws IOException {
        super(context, file, str, str2);
    }
}
