package com.bumptech.glide.load.resource.transcode;

import android.support.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

public class TranscoderRegistry {
    private final List<Entry<?, ?>> transcoders = new ArrayList();

    static final class Entry<Z, R> {
        private final Class<Z> fromClass;
        private final Class<R> toClass;
        final ResourceTranscoder<Z, R> transcoder;

        public final boolean handles(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            if (!this.fromClass.isAssignableFrom(cls) || !cls2.isAssignableFrom(this.toClass)) {
                return false;
            }
            return true;
        }

        Entry(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull ResourceTranscoder<Z, R> resourceTranscoder) {
            this.fromClass = cls;
            this.toClass = cls2;
            this.transcoder = resourceTranscoder;
        }
    }

    @NonNull
    public synchronized <Z, R> List<Class<R>> getTranscodeClasses(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (Entry<?, ?> handles : this.transcoders) {
            if (handles.handles(cls, cls2)) {
                arrayList.add(cls2);
            }
        }
        return arrayList;
    }

    @NonNull
    public synchronized <Z, R> ResourceTranscoder<Z, R> get(@NonNull Class<Z> cls, @NonNull Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return UnitTranscoder.get();
        }
        for (Entry next : this.transcoders) {
            if (next.handles(cls, cls2)) {
                return next.transcoder;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized <Z, R> void register(@NonNull Class<Z> cls, @NonNull Class<R> cls2, @NonNull ResourceTranscoder<Z, R> resourceTranscoder) {
        this.transcoders.add(new Entry(cls, cls2, resourceTranscoder));
    }
}
