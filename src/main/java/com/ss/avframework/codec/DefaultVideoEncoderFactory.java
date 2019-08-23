package com.ss.avframework.codec;

import com.ss.avframework.engine.VideoEncoder;
import com.ss.avframework.engine.VideoEncoderFactory;
import com.ss.avframework.utils.JNINamespace;

@JNINamespace("jni")
public class DefaultVideoEncoderFactory extends VideoEncoderFactory {
    private VideoEncoderFactory mHWFacotry = new HardwareVideoEncoderFactory();

    private native VideoEncoder nativeDefaultCreateVideoEncoder(long j, String str, boolean z);

    private native String nativeDefaultGetSupportedFormats(long j);

    public String GetSupportedFormats() {
        String GetSupportedFormats = this.mHWFacotry.GetSupportedFormats();
        String nativeDefaultGetSupportedFormats = nativeDefaultGetSupportedFormats(this.mNativeObj);
        return GetSupportedFormats + ":" + nativeDefaultGetSupportedFormats;
    }

    public VideoEncoder CreateVideoEncoder(String str, boolean z) {
        VideoEncoder CreateVideoEncoder = this.mHWFacotry.CreateVideoEncoder(str, z);
        if (CreateVideoEncoder == null) {
            return nativeDefaultCreateVideoEncoder(this.mNativeObj, str, z);
        }
        return CreateVideoEncoder;
    }
}
