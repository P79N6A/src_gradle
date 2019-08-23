package com.facebook.imagepipeline.transcoder;

import com.facebook.b.c;
import com.facebook.imagepipeline.common.ResizeOptions;
import com.facebook.imagepipeline.common.RotationOptions;
import java.io.IOException;
import java.io.OutputStream;
import javax.annotation.Nullable;

public interface b {
    boolean canResize(com.facebook.imagepipeline.image.b bVar, @Nullable RotationOptions rotationOptions, @Nullable ResizeOptions resizeOptions);

    boolean canTranscode(c cVar);

    String getIdentifier();

    a transcode(com.facebook.imagepipeline.image.b bVar, OutputStream outputStream, @Nullable RotationOptions rotationOptions, @Nullable ResizeOptions resizeOptions, @Nullable c cVar, @Nullable Integer num) throws IOException;
}
