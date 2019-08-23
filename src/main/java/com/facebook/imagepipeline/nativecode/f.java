package com.facebook.imagepipeline.nativecode;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private static e f23999a;
    public static boolean sWebpTranscoderPresent;

    public static e getWebpTranscoder() {
        return f23999a;
    }

    static {
        try {
            f23999a = (e) Class.forName("com.facebook.imagepipeline.nativecode.WebpTranscoderImpl").newInstance();
            sWebpTranscoderPresent = true;
        } catch (Throwable unused) {
            sWebpTranscoderPresent = false;
        }
    }
}
