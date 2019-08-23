package com.ss.avframework.livestreamv2.interact.video;

import javax.microedition.khronos.egl.EGLContext;

public interface VideoCallback {
    boolean updateVideoFrame(EGLContext eGLContext, android.opengl.EGLContext eGLContext2, int i, int i2, int i3, long j);
}
