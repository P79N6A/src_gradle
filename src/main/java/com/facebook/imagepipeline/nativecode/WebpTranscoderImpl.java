package com.facebook.imagepipeline.nativecode;

import android.os.Build;
import com.facebook.b.b;
import com.facebook.b.c;
import com.facebook.common.internal.DoNotStrip;
import com.facebook.common.internal.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

@DoNotStrip
public class WebpTranscoderImpl implements e {
    @DoNotStrip
    private static native void nativeTranscodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i) throws IOException;

    @DoNotStrip
    private static native void nativeTranscodeWebpToPng(InputStream inputStream, OutputStream outputStream) throws IOException;

    public boolean isWebpNativelySupported(c cVar) {
        if (cVar == b.f23293f) {
            if (Build.VERSION.SDK_INT >= 14) {
                return true;
            }
            return false;
        } else if (cVar == b.g || cVar == b.h || cVar == b.i) {
            return com.facebook.common.g.c.f2347c;
        } else {
            if (cVar == b.j) {
                return false;
            }
            throw new IllegalArgumentException("Image format is not a WebP.");
        }
    }

    public void transcodeWebpToPng(InputStream inputStream, OutputStream outputStream) throws IOException {
        d.ensure();
        nativeTranscodeWebpToPng((InputStream) Preconditions.checkNotNull(inputStream), (OutputStream) Preconditions.checkNotNull(outputStream));
    }

    public void transcodeWebpToJpeg(InputStream inputStream, OutputStream outputStream, int i) throws IOException {
        d.ensure();
        nativeTranscodeWebpToJpeg((InputStream) Preconditions.checkNotNull(inputStream), (OutputStream) Preconditions.checkNotNull(outputStream), i);
    }
}
