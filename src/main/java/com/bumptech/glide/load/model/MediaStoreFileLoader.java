package com.bumptech.glide.load.model;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.data.DataFetcher;
import com.bumptech.glide.load.data.mediastore.MediaStoreUtil;
import com.bumptech.glide.load.model.ModelLoader;
import com.bumptech.glide.signature.ObjectKey;
import java.io.File;
import java.io.FileNotFoundException;

public final class MediaStoreFileLoader implements ModelLoader<Uri, File> {
    private final Context context;

    public static final class Factory implements ModelLoaderFactory<Uri, File> {
        private final Context context;

        public final void teardown() {
        }

        public Factory(Context context2) {
            this.context = context2;
        }

        @NonNull
        public final ModelLoader<Uri, File> build(MultiModelLoaderFactory multiModelLoaderFactory) {
            return new MediaStoreFileLoader(this.context);
        }
    }

    static class FilePathFetcher implements DataFetcher<File> {
        private static final String[] PROJECTION = {"_data"};
        private final Context context;
        private final Uri uri;

        public void cancel() {
        }

        public void cleanup() {
        }

        @NonNull
        public Class<File> getDataClass() {
            return File.class;
        }

        @NonNull
        public DataSource getDataSource() {
            return DataSource.LOCAL;
        }

        FilePathFetcher(Context context2, Uri uri2) {
            this.context = context2;
            this.uri = uri2;
        }

        public void loadData(@NonNull Priority priority, @NonNull DataFetcher.DataCallback<? super File> dataCallback) {
            Cursor query = this.context.getContentResolver().query(this.uri, PROJECTION, null, null, null);
            String str = null;
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        str = query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                } finally {
                    query.close();
                }
            }
            if (TextUtils.isEmpty(str)) {
                dataCallback.onLoadFailed(new FileNotFoundException("Failed to find file path for: " + this.uri));
                return;
            }
            dataCallback.onDataReady(new File(str));
        }
    }

    public MediaStoreFileLoader(Context context2) {
        this.context = context2;
    }

    public final boolean handles(@NonNull Uri uri) {
        return MediaStoreUtil.isMediaStoreUri(uri);
    }

    public final ModelLoader.LoadData<File> buildLoadData(@NonNull Uri uri, int i, int i2, @NonNull Options options) {
        return new ModelLoader.LoadData<>(new ObjectKey(uri), new FilePathFetcher(this.context, uri));
    }
}
