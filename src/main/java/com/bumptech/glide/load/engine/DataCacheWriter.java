package com.bumptech.glide.load.engine;

import android.support.annotation.NonNull;
import com.bumptech.glide.load.Encoder;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.engine.cache.DiskCache;
import java.io.File;

public class DataCacheWriter<DataType> implements DiskCache.Writer {
    private final DataType data;
    private final Encoder<DataType> encoder;
    private final Options options;

    public boolean write(@NonNull File file) {
        return this.encoder.encode(this.data, file, this.options);
    }

    DataCacheWriter(Encoder<DataType> encoder2, DataType datatype, Options options2) {
        this.encoder = encoder2;
        this.data = datatype;
        this.options = options2;
    }
}
