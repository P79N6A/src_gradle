package com.bumptech.glide.request.transition;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.DataSource;
import com.ss.android.ugc.aweme.shortvideo.sticker.ar.pixaloop.d.c;

public class DrawableCrossFadeFactory implements TransitionFactory<Drawable> {
    private final int duration;
    private final boolean isCrossFadeEnabled;
    private DrawableCrossFadeTransition resourceTransition;

    public static class Builder {
        private final int durationMillis;
        private boolean isCrossFadeEnabled;

        public Builder() {
            this(c.f69428f);
        }

        public DrawableCrossFadeFactory build() {
            return new DrawableCrossFadeFactory(this.durationMillis, this.isCrossFadeEnabled);
        }

        public Builder setCrossFadeEnabled(boolean z) {
            this.isCrossFadeEnabled = z;
            return this;
        }

        public Builder(int i) {
            this.durationMillis = i;
        }
    }

    private Transition<Drawable> getResourceTransition() {
        if (this.resourceTransition == null) {
            this.resourceTransition = new DrawableCrossFadeTransition(this.duration, this.isCrossFadeEnabled);
        }
        return this.resourceTransition;
    }

    protected DrawableCrossFadeFactory(int i, boolean z) {
        this.duration = i;
        this.isCrossFadeEnabled = z;
    }

    public Transition<Drawable> build(DataSource dataSource, boolean z) {
        if (dataSource == DataSource.MEMORY_CACHE) {
            return NoTransition.get();
        }
        return getResourceTransition();
    }
}