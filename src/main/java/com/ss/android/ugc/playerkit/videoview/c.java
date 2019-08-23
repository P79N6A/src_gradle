package com.ss.android.ugc.playerkit.videoview;

import android.annotation.SuppressLint;
import com.ss.android.ugc.playerkit.videoview.d.a;
import com.ss.android.ugc.playerkit.videoview.d.b;
import com.ss.android.ugc.playerkit.videoview.d.f;

@SuppressLint({"SerializableImplementsRule"})
public enum c {
    INSTANCE;
    
    private a bitrateManager;
    private b httpsHelper;
    private b mCacheChecker;
    private com.ss.android.ugc.aweme.player.sdk.api.b mPlayInfoCallback;
    private f playUrlBuilder;

    public final b cacheChecker() {
        return this.mCacheChecker;
    }

    public final a getBitrateManager() {
        return this.bitrateManager;
    }

    public final b getHttpsHelper() {
        return this.httpsHelper;
    }

    public final f getPlayUrlBuilder() {
        return this.playUrlBuilder;
    }

    public final com.ss.android.ugc.aweme.player.sdk.api.b playInfoCallback() {
        return this.mPlayInfoCallback;
    }

    public final c setBitrateManager(a aVar) {
        this.bitrateManager = aVar;
        return this;
    }

    public final c setCacheChecker(b bVar) {
        this.mCacheChecker = bVar;
        return this;
    }

    public final c setHttpsHelper(b bVar) {
        this.httpsHelper = bVar;
        return this;
    }

    public final c setPlayInfoCallback(com.ss.android.ugc.aweme.player.sdk.api.b bVar) {
        this.mPlayInfoCallback = bVar;
        return this;
    }

    public final c setPlayUrlBuilder(f fVar) {
        this.playUrlBuilder = fVar;
        return this;
    }
}
