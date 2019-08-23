package com.ss.android.ugc.lib.video.bitrate.regulator;

import java.io.Serializable;

public final class d implements Serializable {
    public double duration;
    public double preloadSize;
    public boolean shift;
    public double speed;
    public int type;
    public double videoSize;

    public d(double d2, double d3, double d4, double d5, boolean z, int i) {
        this.preloadSize = d2;
        this.videoSize = d3;
        this.duration = d4;
        this.speed = d5;
        this.shift = z;
        this.type = i;
    }
}
