package com.facebook.imagepipeline.nativecode;

import com.facebook.b.c;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public interface e {
    boolean isWebpNativelySupported(c cVar);

    void transcodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i) throws IOException;

    void transcodeWebpToPng(InputStream inputStream, OutputStream outputStream) throws IOException;
}
