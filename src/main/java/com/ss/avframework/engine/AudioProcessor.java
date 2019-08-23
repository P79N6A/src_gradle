package com.ss.avframework.engine;

import com.ss.avframework.utils.CalledByNative;
import com.ss.avframework.utils.JNINamespace;
import java.nio.Buffer;

@JNINamespace("jni")
public abstract class AudioProcessor extends NativeObject {
    /* access modifiers changed from: protected */
    @CalledByNative
    public abstract Buffer process(Buffer buffer, int i, int i2, int i3, long j);
}
