package com.bumptech.glide.load.engine.bitmap_recycle;

import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import com.bumptech.glide.util.Preconditions;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public final class LruArrayPool implements ArrayPool {
    private final Map<Class<?>, ArrayAdapterInterface<?>> adapters;
    private int currentSize;
    private final GroupedLinkedMap<Key, Object> groupedMap;
    private final KeyPool keyPool;
    private final int maxSize;
    private final Map<Class<?>, NavigableMap<Integer, Integer>> sortedSizes;

    static final class Key implements Poolable {
        private Class<?> arrayClass;
        private final KeyPool pool;
        int size;

        public final void offer() {
            this.pool.offer(this);
        }

        public final int hashCode() {
            int i;
            int i2 = this.size * 31;
            if (this.arrayClass != null) {
                i = this.arrayClass.hashCode();
            } else {
                i = 0;
            }
            return i2 + i;
        }

        public final String toString() {
            return "Key{size=" + this.size + "array=" + this.arrayClass + '}';
        }

        Key(KeyPool keyPool) {
            this.pool = keyPool;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Key)) {
                return false;
            }
            Key key = (Key) obj;
            if (this.size == key.size && this.arrayClass == key.arrayClass) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: package-private */
        public final void init(int i, Class<?> cls) {
            this.size = i;
            this.arrayClass = cls;
        }
    }

    static final class KeyPool extends BaseKeyPool<Key> {
        KeyPool() {
        }

        /* access modifiers changed from: protected */
        public final Key create() {
            return new Key(this);
        }

        /* access modifiers changed from: package-private */
        public final Key get(int i, Class<?> cls) {
            Key key = (Key) get();
            key.init(i, cls);
            return key;
        }
    }

    private void evict() {
        evictToSize(this.maxSize);
    }

    public final synchronized void clearMemory() {
        evictToSize(0);
    }

    private boolean isNoMoreThanHalfFull() {
        if (this.currentSize == 0 || this.maxSize / this.currentSize >= 2) {
            return true;
        }
        return false;
    }

    @VisibleForTesting
    public LruArrayPool() {
        this.groupedMap = new GroupedLinkedMap<>();
        this.keyPool = new KeyPool();
        this.sortedSizes = new HashMap();
        this.adapters = new HashMap();
        this.maxSize = 4194304;
    }

    /* access modifiers changed from: package-private */
    public final int getCurrentSize() {
        int i = 0;
        for (Class next : this.sortedSizes.keySet()) {
            for (Integer num : this.sortedSizes.get(next).keySet()) {
                i += num.intValue() * ((Integer) this.sortedSizes.get(next).get(num)).intValue() * getAdapterFromType(next).getElementSizeInBytes();
            }
        }
        return i;
    }

    @Nullable
    private <T> T getArrayForKey(Key key) {
        return this.groupedMap.get(key);
    }

    private <T> ArrayAdapterInterface<T> getAdapterFromObject(T t) {
        return getAdapterFromType(t.getClass());
    }

    private boolean isSmallEnoughForReuse(int i) {
        if (i <= this.maxSize / 2) {
            return true;
        }
        return false;
    }

    private NavigableMap<Integer, Integer> getSizesForAdapter(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.sortedSizes.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.sortedSizes.put(cls, treeMap);
        return treeMap;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void trimMemory(int r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            r0 = 40
            if (r2 < r0) goto L_0x000c
            r1.clearMemory()     // Catch:{ all -> 0x000a }
            monitor-exit(r1)
            return
        L_0x000a:
            r2 = move-exception
            goto L_0x001d
        L_0x000c:
            r0 = 20
            if (r2 >= r0) goto L_0x0014
            r0 = 15
            if (r2 != r0) goto L_0x001b
        L_0x0014:
            int r2 = r1.maxSize     // Catch:{ all -> 0x000a }
            int r2 = r2 / 2
            r1.evictToSize(r2)     // Catch:{ all -> 0x000a }
        L_0x001b:
            monitor-exit(r1)
            return
        L_0x001d:
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.engine.bitmap_recycle.LruArrayPool.trimMemory(int):void");
    }

    private void evictToSize(int i) {
        while (this.currentSize > i) {
            Object removeLast = this.groupedMap.removeLast();
            Preconditions.checkNotNull(removeLast);
            ArrayAdapterInterface adapterFromObject = getAdapterFromObject(removeLast);
            this.currentSize -= adapterFromObject.getArrayLength(removeLast) * adapterFromObject.getElementSizeInBytes();
            decrementArrayOfSize(adapterFromObject.getArrayLength(removeLast), removeLast.getClass());
            adapterFromObject.getTag();
        }
    }

    public LruArrayPool(int i) {
        this.groupedMap = new GroupedLinkedMap<>();
        this.keyPool = new KeyPool();
        this.sortedSizes = new HashMap();
        this.adapters = new HashMap();
        this.maxSize = i;
    }

    private <T> ArrayAdapterInterface<T> getAdapterFromType(Class<T> cls) {
        ArrayAdapterInterface<T> arrayAdapterInterface = this.adapters.get(cls);
        if (arrayAdapterInterface == null) {
            if (cls.equals(int[].class)) {
                arrayAdapterInterface = new IntegerArrayAdapter<>();
            } else if (cls.equals(byte[].class)) {
                arrayAdapterInterface = new ByteArrayAdapter<>();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.adapters.put(cls, arrayAdapterInterface);
        }
        return arrayAdapterInterface;
    }

    public final synchronized <T> void put(T t) {
        Class<?> cls = t.getClass();
        ArrayAdapterInterface<?> adapterFromType = getAdapterFromType(cls);
        int arrayLength = adapterFromType.getArrayLength(t);
        int elementSizeInBytes = adapterFromType.getElementSizeInBytes() * arrayLength;
        if (isSmallEnoughForReuse(elementSizeInBytes)) {
            Key key = this.keyPool.get(arrayLength, cls);
            this.groupedMap.put(key, t);
            NavigableMap<Integer, Integer> sizesForAdapter = getSizesForAdapter(cls);
            Integer num = (Integer) sizesForAdapter.get(Integer.valueOf(key.size));
            Integer valueOf = Integer.valueOf(key.size);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            sizesForAdapter.put(valueOf, Integer.valueOf(i));
            this.currentSize += elementSizeInBytes;
            evict();
        }
    }

    @Deprecated
    public final <T> void put(T t, Class<T> cls) {
        put(t);
    }

    public final synchronized <T> T getExact(int i, Class<T> cls) {
        return getForKey(this.keyPool.get(i, cls), cls);
    }

    private boolean mayFillRequest(int i, Integer num) {
        if (num == null || (!isNoMoreThanHalfFull() && num.intValue() > i * 8)) {
            return false;
        }
        return true;
    }

    private <T> T getForKey(Key key, Class<T> cls) {
        ArrayAdapterInterface<T> adapterFromType = getAdapterFromType(cls);
        T arrayForKey = getArrayForKey(key);
        if (arrayForKey != null) {
            this.currentSize -= adapterFromType.getArrayLength(arrayForKey) * adapterFromType.getElementSizeInBytes();
            decrementArrayOfSize(adapterFromType.getArrayLength(arrayForKey), cls);
        }
        if (arrayForKey != null) {
            return arrayForKey;
        }
        adapterFromType.getTag();
        return adapterFromType.newArray(key.size);
    }

    public final synchronized <T> T get(int i, Class<T> cls) {
        Key key;
        Integer ceilingKey = getSizesForAdapter(cls).ceilingKey(Integer.valueOf(i));
        if (mayFillRequest(i, ceilingKey)) {
            key = this.keyPool.get(ceilingKey.intValue(), cls);
        } else {
            key = this.keyPool.get(i, cls);
        }
        return getForKey(key, cls);
    }

    private void decrementArrayOfSize(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> sizesForAdapter = getSizesForAdapter(cls);
        Integer num = (Integer) sizesForAdapter.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        } else if (num.intValue() == 1) {
            sizesForAdapter.remove(Integer.valueOf(i));
        } else {
            sizesForAdapter.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }
}
