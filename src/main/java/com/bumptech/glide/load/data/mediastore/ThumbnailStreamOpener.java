package com.bumptech.glide.load.data.mediastore;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.List;

public class ThumbnailStreamOpener {
    private static final FileService DEFAULT_SERVICE = new FileService();
    private final ArrayPool byteArrayPool;
    private final ContentResolver contentResolver;
    private final List<ImageHeaderParser> parsers;
    private final ThumbnailQuery query;
    private final FileService service;

    private boolean isValid(File file) {
        if (!this.service.exists(file) || 0 >= this.service.length(file)) {
            return false;
        }
        return true;
    }

    @Nullable
    private String getPath(@NonNull Uri uri) {
        Cursor query2 = this.query.query(uri);
        if (query2 != null) {
            try {
                if (query2.moveToFirst()) {
                    return query2.getString(0);
                }
            } finally {
                if (query2 != null) {
                    query2.close();
                }
            }
        }
        if (query2 != null) {
            query2.close();
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001d A[SYNTHETIC, Splitter:B:14:0x001d] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0024 A[SYNTHETIC, Splitter:B:22:0x0024] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int getOrientation(android.net.Uri r4) {
        /*
            r3 = this;
            r0 = 0
            android.content.ContentResolver r1 = r3.contentResolver     // Catch:{ IOException | NullPointerException -> 0x0021, all -> 0x0017 }
            java.io.InputStream r4 = r1.openInputStream(r4)     // Catch:{ IOException | NullPointerException -> 0x0021, all -> 0x0017 }
            java.util.List<com.bumptech.glide.load.ImageHeaderParser> r0 = r3.parsers     // Catch:{ IOException | NullPointerException -> 0x0022, all -> 0x0015 }
            com.bumptech.glide.load.engine.bitmap_recycle.ArrayPool r1 = r3.byteArrayPool     // Catch:{ IOException | NullPointerException -> 0x0022, all -> 0x0015 }
            int r0 = com.bumptech.glide.load.ImageHeaderParserUtils.getOrientation(r0, r4, r1)     // Catch:{ IOException | NullPointerException -> 0x0022, all -> 0x0015 }
            if (r4 == 0) goto L_0x0014
            r4.close()     // Catch:{ IOException -> 0x0014 }
        L_0x0014:
            return r0
        L_0x0015:
            r0 = move-exception
            goto L_0x001b
        L_0x0017:
            r4 = move-exception
            r2 = r0
            r0 = r4
            r4 = r2
        L_0x001b:
            if (r4 == 0) goto L_0x0020
            r4.close()     // Catch:{ IOException -> 0x0020 }
        L_0x0020:
            throw r0
        L_0x0021:
            r4 = r0
        L_0x0022:
            if (r4 == 0) goto L_0x0027
            r4.close()     // Catch:{ IOException -> 0x0027 }
        L_0x0027:
            r4 = -1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.data.mediastore.ThumbnailStreamOpener.getOrientation(android.net.Uri):int");
    }

    public InputStream open(Uri uri) throws FileNotFoundException {
        String path = getPath(uri);
        if (TextUtils.isEmpty(path)) {
            return null;
        }
        File file = this.service.get(path);
        if (!isValid(file)) {
            return null;
        }
        Uri fromFile = Uri.fromFile(file);
        try {
            return this.contentResolver.openInputStream(fromFile);
        } catch (NullPointerException e2) {
            throw ((FileNotFoundException) new FileNotFoundException("NPE opening uri: " + uri + " -> " + fromFile).initCause(e2));
        }
    }

    ThumbnailStreamOpener(List<ImageHeaderParser> list, ThumbnailQuery thumbnailQuery, ArrayPool arrayPool, ContentResolver contentResolver2) {
        this(list, DEFAULT_SERVICE, thumbnailQuery, arrayPool, contentResolver2);
    }

    ThumbnailStreamOpener(List<ImageHeaderParser> list, FileService fileService, ThumbnailQuery thumbnailQuery, ArrayPool arrayPool, ContentResolver contentResolver2) {
        this.service = fileService;
        this.query = thumbnailQuery;
        this.byteArrayPool = arrayPool;
        this.contentResolver = contentResolver2;
        this.parsers = list;
    }
}
