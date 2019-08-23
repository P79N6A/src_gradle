package com.facebook.react.modules.blob;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.support.annotation.Nullable;
import com.facebook.react.ReactApplication;
import java.io.FileNotFoundException;
import java.io.IOException;

public final class BlobProvider extends ContentProvider {
    public final int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Nullable
    public final String getType(Uri uri) {
        return null;
    }

    @Nullable
    public final Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    public final boolean onCreate() {
        return true;
    }

    @Nullable
    public final Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    public final int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public final ParcelFileDescriptor openFile(Uri uri, String str) throws FileNotFoundException {
        BlobModule blobModule;
        if (str.equals("r")) {
            Context applicationContext = getContext().getApplicationContext();
            if (applicationContext instanceof ReactApplication) {
                blobModule = (BlobModule) ((ReactApplication) applicationContext).getReactNativeHost().getReactInstanceManager().getCurrentReactContext().getNativeModule(BlobModule.class);
            } else {
                blobModule = null;
            }
            if (blobModule != null) {
                byte[] resolve = blobModule.resolve(uri);
                if (resolve != null) {
                    try {
                        ParcelFileDescriptor[] createPipe = ParcelFileDescriptor.createPipe();
                        ParcelFileDescriptor parcelFileDescriptor = createPipe[0];
                        ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new ParcelFileDescriptor.AutoCloseOutputStream(createPipe[1]);
                        try {
                            autoCloseOutputStream.write(resolve);
                            autoCloseOutputStream.close();
                            return parcelFileDescriptor;
                        } catch (IOException unused) {
                            return null;
                        }
                    } catch (IOException unused2) {
                        return null;
                    }
                } else {
                    throw new FileNotFoundException("Cannot open " + uri.toString() + ", blob not found.");
                }
            } else {
                throw new RuntimeException("No blob module associated with BlobProvider");
            }
        } else {
            throw new FileNotFoundException("Cannot open " + uri.toString() + " in mode '" + str + "'");
        }
    }
}
