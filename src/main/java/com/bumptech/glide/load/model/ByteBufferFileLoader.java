package com.bumptech.glide.load.model;

import android.support.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import com.bumptech.glide.util.ByteBufferUtil;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

public class ByteBufferFileLoader implements ModelLoader<File, ByteBuffer> {

    static final class ByteBufferFetcher implements DataFetcher<ByteBuffer> {
        private final File file;

        public final void cancel() {
        }

        public final void cleanup() {
        }

        @NonNull
        public final Class<ByteBuffer> getDataClass() {
            return ByteBuffer.class;
        }

        @NonNull
        public final DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        ByteBufferFetcher(File file2) {
            this.file = file2;
        }

        public final void loadData(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super ByteBuffer> dataCallback) {
            try {
                dataCallback.onDataReady(ByteBufferUtil.fromFile(this.file));
            } catch (IOException e2) {
                dataCallback.onLoadFailed(e2);
            }
        }
    }

    public static class Factory implements ModelLoaderFactory<File, ByteBuffer> {
        public void teardown() {
        }

        @NonNull
        public ModelLoader<File, ByteBuffer> build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new ByteBufferFileLoader();
        }
    }

    public boolean handles(@NonNull File file) {
        return true;
    }

    public ModelLoader.LoadData<ByteBuffer> buildLoadData(@NonNull File file, int i, int i2, @NonNull Options options) {
        return new ModelLoader.LoadData<>(new ObjectKey(file), new ByteBufferFetcher(file));
    }
}
