package com.ss.ttuploader;

public interface TTVideoUploaderListener {
    void onLog(int i, int i2, String str);

    void onNotify(int i, long j, TTVideoInfo tTVideoInfo);
}
