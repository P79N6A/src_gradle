package com.bumptech.glide.load.data;

import android.support.annotation.NonNull;
import com.bumptech.glide.load.data.DataRewinder;
import com.bumptech.glide.util.Preconditions;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DataRewinderRegistry {
    private static final DataRewinder.Factory<?> DEFAULT_FACTORY = new DataRewinder.Factory<Object>() {
        @NonNull
        public Class<Object> getDataClass() {
            throw new UnsupportedOperationException("Not implemented");
        }

        @NonNull
        public DataRewinder<Object> build(@NonNull Object obj) {
            return new DefaultRewinder(obj);
        }
    };
    private final Map<Class<?>, DataRewinder.Factory<?>> rewinders = new HashMap();

    static final class DefaultRewinder implements DataRewinder<Object> {
        private final Object data;

        public final void cleanup() {
        }

        @NonNull
        public final Object rewindAndGet() {
            return this.data;
        }

        DefaultRewinder(@NonNull Object obj) {
            this.data = obj;
        }
    }

    public synchronized void register(@NonNull DataRewinder.Factory<?> factory) {
        this.rewinders.put(factory.getDataClass(), factory);
    }

    @NonNull
    public synchronized <T> DataRewinder<T> build(@NonNull T t) {
        DataRewinder.Factory<?> factory;
        Preconditions.checkNotNull(t);
        factory = this.rewinders.get(t.getClass());
        if (factory == null) {
            Iterator<DataRewinder.Factory<?>> it2 = this.rewinders.values().iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                DataRewinder.Factory<?> next = it2.next();
                if (next.getDataClass().isAssignableFrom(t.getClass())) {
                    factory = next;
                    break;
                }
            }
        }
        if (factory == null) {
            factory = DEFAULT_FACTORY;
        }
        return factory.build(t);
    }
}
