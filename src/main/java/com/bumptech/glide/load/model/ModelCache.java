package com.bumptech.glide.load.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.bumptech.glide.util.LruCache;
import com.bumptech.glide.util.Util;
import java.util.Queue;

public class ModelCache<A, B> {
    private final LruCache<ModelKey<A>, B> cache;

    @VisibleForTesting
    static final class ModelKey<A> {
        private static final Queue<ModelKey<?>> KEY_QUEUE = Util.createQueue(0);
        private int height;
        private A model;
        private int width;

        private ModelKey() {
        }

        public final void release() {
            synchronized (KEY_QUEUE) {
                KEY_QUEUE.offer(this);
            }
        }

        public final int hashCode() {
            return (((this.height * 31) + this.width) * 31) + this.model.hashCode();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof ModelKey)) {
                return false;
            }
            ModelKey modelKey = (ModelKey) obj;
            if (this.width == modelKey.width && this.height == modelKey.height && this.model.equals(modelKey.model)) {
                return true;
            }
            return false;
        }

        private void init(A a2, int i, int i2) {
            this.model = a2;
            this.width = i;
            this.height = i2;
        }

        static <A> ModelKey<A> get(A a2, int i, int i2) {
            ModelKey<A> poll;
            synchronized (KEY_QUEUE) {
                poll = KEY_QUEUE.poll();
            }
            if (poll == null) {
                poll = new ModelKey<>();
            }
            poll.init(a2, i, i2);
            return poll;
        }
    }

    public ModelCache() {
        this(250);
    }

    public void clear() {
        this.cache.clearMemory();
    }

    public ModelCache(long j) {
        this.cache = new LruCache<ModelKey<A>, B>(j) {
            /* access modifiers changed from: protected */
            public void onItemEvicted(@NonNull ModelKey<A> modelKey, @Nullable B b2) {
                modelKey.release();
            }
        };
    }

    @Nullable
    public B get(A a2, int i, int i2) {
        ModelKey modelKey = ModelKey.get(a2, i, i2);
        B b2 = this.cache.get(modelKey);
        modelKey.release();
        return b2;
    }

    public void put(A a2, int i, int i2, B b2) {
        this.cache.put(ModelKey.get(a2, i, i2), b2);
    }
}
