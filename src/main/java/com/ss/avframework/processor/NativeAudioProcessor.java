package com.ss.avframework.processor;

import android.util.AndroidRuntimeException;
import com.ss.avframework.engine.AudioProcessor;
import com.ss.avframework.utils.CalledByNative;
import com.ss.avframework.utils.JNINamespace;
import java.nio.Buffer;

@JNINamespace("jni")
public class NativeAudioProcessor extends AudioProcessor {
    @CalledByNative
    private static boolean isNativeAudioProcessor(AudioProcessor audioProcessor) {
        return audioProcessor instanceof NativeAudioProcessor;
    }

    public Buffer process(Buffer buffer, int i, int i2, int i3, long j) {
        throw new AndroidRuntimeException("Should not be here");
    }
}
