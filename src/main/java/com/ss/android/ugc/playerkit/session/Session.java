package com.ss.android.ugc.playerkit.session;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import com.ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.ss.android.ugc.playerkit.c.c;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

@Keep
public class Session {
    public static final Session DEFAULT = new Session(true);
    private static final Queue<Session> pool = new LinkedBlockingQueue(10);
    public int bitrate = -1;
    public int blockCnt = -1;
    public int blockTime = -1;
    public int cacheSize = -1;
    public double calcBitrate;
    public float duration;
    public boolean h265;
    public boolean isCurrentPlayer;
    private boolean isStub;
    public String key;
    public float playBitrate = -1.0f;
    public int playTime = -1;
    public c.a playerType;
    public String sourceId;
    public float speed = -1.0f;
    public b state;
    public String uri;
    public String url;
    public VideoUrlModel urlModel;

    public boolean isStub() {
        return this.isStub;
    }

    @NonNull
    static Session instance() {
        Session poll = pool.poll();
        if (poll == null) {
            return new Session();
        }
        return poll;
    }

    public void recycle() {
        clear();
        pool.offer(this);
    }

    private Session() {
    }

    private void clear() {
        this.sourceId = null;
        this.uri = null;
        this.url = null;
        this.h265 = false;
        this.duration = 0.0f;
        this.speed = -1.0f;
        this.blockCnt = -1;
        this.blockTime = -1;
        this.bitrate = -1;
        this.playBitrate = -1.0f;
        this.playTime = -1;
        this.cacheSize = -1;
        this.playerType = null;
        this.isCurrentPlayer = false;
        this.urlModel = null;
        this.state = null;
        this.calcBitrate = 0.0d;
    }

    public String toString() {
        return "Session{sourceId='" + this.sourceId + '\'' + ", uri='" + this.uri + '\'' + ", url='" + this.url + '\'' + ", h265=" + this.h265 + ", duration=" + this.duration + ", speed=" + this.speed + ", blockCnt=" + this.blockCnt + ", blockTime=" + this.blockTime + ", bitrate=" + this.bitrate + ", calcBitrate=" + this.calcBitrate + ", playBitrate=" + this.playBitrate + ", playTime=" + this.playTime + ", cacheSize=" + this.cacheSize + '}';
    }

    public Session(boolean z) {
        this.isStub = z;
    }
}
