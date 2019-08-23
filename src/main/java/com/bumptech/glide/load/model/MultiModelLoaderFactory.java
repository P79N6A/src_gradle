package com.bumptech.glide.load.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.VisibleForTesting;
import android.support.v4.util.Pools;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.util.Preconditions;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class MultiModelLoaderFactory {
    private static final Factory DEFAULT_FACTORY = new Factory();
    private static final ModelLoader<Object, Object> EMPTY_MODEL_LOADER = new EmptyModelLoader();
    private final Set<Entry<?, ?>> alreadyUsedEntries;
    private final List<Entry<?, ?>> entries;
    private final Factory factory;
    private final Pools.Pool<List<Throwable>> throwableListPool;

    static class EmptyModelLoader implements ModelLoader<Object, Object> {
        @Nullable
        public ModelLoader.LoadData<Object> buildLoadData(@NonNull Object obj, int i, int i2, @NonNull Options options) {
            return null;
        }

        public boolean handles(@NonNull Object obj) {
            return false;
        }

        EmptyModelLoader() {
        }
    }

    static class Entry<Model, Data> {
        final Class<Data> dataClass;
        final ModelLoaderFactory<? extends Model, ? extends Data> factory;
        private final Class<Model> modelClass;

        public boolean handles(@NonNull Class<?> cls) {
            return this.modelClass.isAssignableFrom(cls);
        }

        public boolean handles(@NonNull Class<?> cls, @NonNull Class<?> cls2) {
            if (!handles(cls) || !this.dataClass.isAssignableFrom(cls2)) {
                return false;
            }
            return true;
        }

        public Entry(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
            this.modelClass = cls;
            this.dataClass = cls2;
            this.factory = modelLoaderFactory;
        }
    }

    static class Factory {
        Factory() {
        }

        @NonNull
        public <Model, Data> MultiModelLoader<Model, Data> build(@NonNull List<ModelLoader<Model, Data>> list, @NonNull Pools.Pool<List<Throwable>> pool) {
            return new MultiModelLoader<>(list, pool);
        }
    }

    @NonNull
    private static <Model, Data> ModelLoader<Model, Data> emptyModelLoader() {
        return EMPTY_MODEL_LOADER;
    }

    @NonNull
    private <Model, Data> ModelLoaderFactory<Model, Data> getFactory(@NonNull Entry<?, ?> entry) {
        return entry.factory;
    }

    public MultiModelLoaderFactory(@NonNull Pools.Pool<List<Throwable>> pool) {
        this(pool, DEFAULT_FACTORY);
    }

    @NonNull
    private <Model, Data> ModelLoader<Model, Data> build(@NonNull Entry<?, ?> entry) {
        return (ModelLoader) Preconditions.checkNotNull(entry.factory.build(this));
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public synchronized List<Class<?>> getDataClasses(@NonNull Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (Entry next : this.entries) {
            if (!arrayList.contains(next.dataClass) && next.handles(cls)) {
                arrayList.add(next.dataClass);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public synchronized <Model> List<ModelLoader<Model, ?>> build(@NonNull Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (Entry next : this.entries) {
                if (!this.alreadyUsedEntries.contains(next) && next.handles(cls)) {
                    this.alreadyUsedEntries.add(next);
                    arrayList.add(build(next));
                    this.alreadyUsedEntries.remove(next);
                }
            }
        } catch (Throwable th) {
            this.alreadyUsedEntries.clear();
            throw th;
        }
        return arrayList;
    }

    @VisibleForTesting
    MultiModelLoaderFactory(@NonNull Pools.Pool<List<Throwable>> pool, @NonNull Factory factory2) {
        this.entries = new ArrayList();
        this.alreadyUsedEntries = new HashSet();
        this.throwableListPool = pool;
        this.factory = factory2;
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public synchronized <Model, Data> List<ModelLoaderFactory<? extends Model, ? extends Data>> remove(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<Entry<?, ?>> it2 = this.entries.iterator();
        while (it2.hasNext()) {
            Entry next = it2.next();
            if (next.handles(cls, cls2)) {
                it2.remove();
                arrayList.add(getFactory(next));
            }
        }
        return arrayList;
    }

    @NonNull
    public synchronized <Model, Data> ModelLoader<Model, Data> build(@NonNull Class<Model> cls, @NonNull Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (Entry next : this.entries) {
                if (this.alreadyUsedEntries.contains(next)) {
                    z = true;
                } else if (next.handles(cls, cls2)) {
                    this.alreadyUsedEntries.add(next);
                    arrayList.add(build(next));
                    this.alreadyUsedEntries.remove(next);
                }
            }
            if (arrayList.size() > 1) {
                return this.factory.build(arrayList, this.throwableListPool);
            } else if (arrayList.size() == 1) {
                return (ModelLoader) arrayList.get(0);
            } else if (z) {
                return emptyModelLoader();
            } else {
                throw new Registry.NoModelLoaderAvailableException(cls, cls2);
            }
        } catch (Throwable th) {
            this.alreadyUsedEntries.clear();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized <Model, Data> void append(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        add(cls, cls2, modelLoaderFactory, true);
    }

    /* access modifiers changed from: package-private */
    public synchronized <Model, Data> void prepend(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        add(cls, cls2, modelLoaderFactory, false);
    }

    /* access modifiers changed from: package-private */
    @NonNull
    public synchronized <Model, Data> List<ModelLoaderFactory<? extends Model, ? extends Data>> replace(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory) {
        List<ModelLoaderFactory<? extends Model, ? extends Data>> remove;
        remove = remove(cls, cls2);
        append(cls, cls2, modelLoaderFactory);
        return remove;
    }

    private <Model, Data> void add(@NonNull Class<Model> cls, @NonNull Class<Data> cls2, @NonNull ModelLoaderFactory<? extends Model, ? extends Data> modelLoaderFactory, boolean z) {
        int i;
        Entry entry = new Entry(cls, cls2, modelLoaderFactory);
        List<Entry<?, ?>> list = this.entries;
        if (z) {
            i = this.entries.size();
        } else {
            i = 0;
        }
        list.add(i, entry);
    }
}
