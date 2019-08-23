package com.bumptech.glide.load.engine.bitmap_recycle;

import android.graphics.Bitmap;
import android.support.annotation.VisibleForTesting;
import com.bumptech.glide.util.Util;

public class AttributeStrategy implements LruPoolStrategy {
    private final GroupedLinkedMap<Key, Bitmap> groupedMap = new GroupedLinkedMap<>();
    private final KeyPool keyPool = new KeyPool();

    @VisibleForTesting
    static class Key implements Poolable {
        private Bitmap.Config config;
        private int height;
        private final KeyPool pool;
        private int width;

        public void offer() {
            this.pool.offer(this);
        }

        public String toString() {
            return AttributeStrategy.getBitmapString(this.width, this.height, this.config);
        }

        public int hashCode() {
            int i;
            int i2 = ((this.width * 31) + this.height) * 31;
            if (this.config != null) {
                i = this.config.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public Key(KeyPool keyPool) {
            this.pool = keyPool;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            if (this.width == key.width && this.height == key.height && this.config == key.config) {
                return true;
            }
            return false;
        }

        public void init(int i, int i2, Bitmap.Config config2) {
            this.width = i;
            this.height = i2;
            this.config = config2;
        }
    }

    @VisibleForTesting
    static class KeyPool extends BaseKeyPool<Key> {
        KeyPool() {
        }

        /* access modifiers changed from: protected */
        public Key create() {
            return new Key(this);
        }

        /* access modifiers changed from: package-private */
        public Key get(int i, int i2, Bitmap.Config config) {
            Key key = (Key) get();
            key.init(i, i2, config);
            return key;
        }
    }

    public Bitmap removeLast() {
        return (Bitmap) this.groupedMap.removeLast();
    }

    AttributeStrategy() {
    }

    public String toString() {
        return "AttributeStrategy:\n  " + this.groupedMap;
    }

    public int getSize(Bitmap bitmap) {
        return Util.getBitmapByteSize(bitmap);
    }

    public String logBitmap(Bitmap bitmap) {
        return getBitmapString(bitmap);
    }

    public void put(Bitmap bitmap) {
        this.groupedMap.put(this.keyPool.get(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig()), bitmap);
    }

    private static String getBitmapString(Bitmap bitmap) {
        return getBitmapString(bitmap.getWidth(), bitmap.getHeight(), bitmap.getConfig());
    }

    public String logBitmap(int i, int i2, Bitmap.Config config) {
        return getBitmapString(i, i2, config);
    }

    public Bitmap get(int i, int i2, Bitmap.Config config) {
        return (Bitmap) this.groupedMap.get(this.keyPool.get(i, i2, config));
    }

    static String getBitmapString(int i, int i2, Bitmap.Config config) {
        return "[" + i + "x" + i2 + "], " + config;
    }
}
