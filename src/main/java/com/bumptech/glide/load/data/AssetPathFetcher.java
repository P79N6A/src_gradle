package com.bumptech.glide.load.data;

import android.content.res.AssetManager;
import android.support.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import java.io.IOException;

public abstract class AssetPathFetcher<T> implements DataFetcher<T> {
    private final AssetManager assetManager;
    private final String assetPath;
    private T data;

    public void cancel() {
    }

    /* access modifiers changed from: protected */
    public abstract void close(T t) throws IOException;

    /* access modifiers changed from: protected */
    public abstract T loadResource(AssetManager assetManager2, String str) throws IOException;

    @NonNull
    public DataSource getDataSource() {
        return DataSource.LOCAL;
    }

    public void cleanup() {
        if (this.data != null) {
            try {
                close(this.data);
            } catch (IOException unused) {
            }
        }
    }

    public AssetPathFetcher(AssetManager assetManager2, String str) {
        this.assetManager = assetManager2;
        this.assetPath = str;
    }

    public void loadData(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super T> dataCallback) {
        try {
            this.data = loadResource(this.assetManager, this.assetPath);
            dataCallback.onDataReady(this.data);
        } catch (IOException e2) {
            dataCallback.onLoadFailed(e2);
        }
    }
}
