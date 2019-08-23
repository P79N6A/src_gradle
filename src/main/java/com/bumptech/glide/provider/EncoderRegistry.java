package com.bumptech.glide.provider;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.Encoder;
import java.util.ArrayList;
import java.util.List;

public class EncoderRegistry {
    private final List<Entry<?>> encoders = new ArrayList();

    static final class Entry<T> {
        private final Class<T> dataClass;
        final Encoder<T> encoder;

        /* access modifiers changed from: package-private */
        public final boolean handles(@NonNull Class<?> cls) {
            return this.dataClass.isAssignableFrom(cls);
        }

        Entry(@NonNull Class<T> cls, @NonNull Encoder<T> encoder2) {
            this.dataClass = cls;
            this.encoder = encoder2;
        }
    }

    @Nullable
    public synchronized <T> Encoder<T> getEncoder(@NonNull Class<T> cls) {
        for (Entry next : this.encoders) {
            if (next.handles(cls)) {
                return next.encoder;
            }
        }
        return null;
    }

    public synchronized <T> void append(@NonNull Class<T> cls, @NonNull Encoder<T> encoder) {
        this.encoders.add(new Entry(cls, encoder));
    }

    public synchronized <T> void prepend(@NonNull Class<T> cls, @NonNull Encoder<T> encoder) {
        this.encoders.add(0, new Entry(cls, encoder));
    }
}
