package com.bumptech.glide.load.model;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.model.ModelLoader;
import java.io.File;
import java.io.InputStream;

public class StringLoader<Data> implements ModelLoader<String, Data> {
    private final ModelLoader<Uri, Data> uriLoader;

    public static final class AssetFileDescriptorFactory implements ModelLoaderFactory<String, AssetFileDescriptor> {
        public final void teardown() {
        }

        public final ModelLoader<String, AssetFileDescriptor> build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new StringLoader(multiModelLoaderFactory.build(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class FileDescriptorFactory implements ModelLoaderFactory<String, ParcelFileDescriptor> {
        public void teardown() {
        }

        @NonNull
        public ModelLoader<String, ParcelFileDescriptor> build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new StringLoader(multiModelLoaderFactory.build(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class StreamFactory implements ModelLoaderFactory<String, InputStream> {
        public void teardown() {
        }

        @NonNull
        public ModelLoader<String, InputStream> build(@NonNull MultiModelLoaderFactory multiModelLoaderFactory) {
            return new StringLoader(multiModelLoaderFactory.build(Uri.class, InputStream.class));
        }
    }

    public boolean handles(@NonNull String str) {
        return true;
    }

    public StringLoader(ModelLoader<Uri, Data> modelLoader) {
        this.uriLoader = modelLoader;
    }

    private static Uri toFileUri(String str) {
        return Uri.fromFile(new File(str));
    }

    @Nullable
    private static Uri parseUri(String str) {
        Uri uri;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.charAt(0) == '/') {
            uri = toFileUri(str);
        } else {
            Uri parse = Uri.parse(str);
            if (parse.getScheme() == null) {
                uri = toFileUri(str);
            } else {
                uri = parse;
            }
        }
        return uri;
    }

    public ModelLoader.LoadData<Data> buildLoadData(@NonNull String str, int i, int i2, @NonNull Options options) {
        Uri parseUri = parseUri(str);
        if (parseUri == null || !this.uriLoader.handles(parseUri)) {
            return null;
        }
        return this.uriLoader.buildLoadData(parseUri, i, i2, options);
    }
}
