package io.agora.rtc.video;

import javax.microedition.khronos.egl.EGLContext;

public class AgoraVideoFrame {
    public byte[] buf;
    public int cropBottom;
    public int cropLeft;
    public int cropRight;
    public int cropTop;
    public EGLContext eglContext11;
    public android.opengl.EGLContext eglContext14;
    public int format = 10;
    public int height;
    public int rotation;
    public int stride;
    public boolean syncMode = true;
    public int textureID;
    public long timeStamp;
    public float[] transform;
}
