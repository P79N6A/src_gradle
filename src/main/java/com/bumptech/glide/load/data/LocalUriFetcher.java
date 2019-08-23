package com.bumptech.glide.load.data;

import android.content.ContentResolver;
import android.net.Uri;
import android.support.annotation.NonNull;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.data.DataFetcher;
import java.io.FileNotFoundException;
import java.io.IOException;

public abstract class LocalUriFetcher<T> implements DataFetcher<T> {
    private final ContentResolver contentResolver;
    private T data;
    private final Uri uri;

    public void cancel() {
    }

    /* access modifiers changed from: protected */
    public abstract void close(T t) throws IOException;

    /* access modifiers changed from: protected */
    public abstract T loadResource(Uri uri2, ContentResolver contentResolver2) throws FileNotFoundException;

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

    public LocalUriFetcher(ContentResolver contentResolver2, Uri uri2) {
        this.contentResolver = contentResolver2;
        this.uri = uri2;
    }

    public final void loadData(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super T> dataCallback) {
        try {
            this.data = loadResource(this.uri, this.contentResolver);
            dataCallback.onDataReady(this.data);
        } catch (FileNotFoundException e2) {
            dataCallback.onLoadFailed(e2);
        }
    }
}
