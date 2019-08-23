package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.facebook.common.f.f;
import com.facebook.imagepipeline.image.b;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;

public final class y extends ab {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f24213a = {"_id", "_data"};

    /* renamed from: b  reason: collision with root package name */
    private final ContentResolver f24214b;

    /* access modifiers changed from: protected */
    public final String a() {
        return "LocalContentUriFetchProducer";
    }

    @Nullable
    private b a(Uri uri) throws IOException {
        int i;
        Cursor query = this.f24214b.query(uri, f24213a, null, null, null);
        if (query == null) {
            return null;
        }
        try {
            if (query.getCount() == 0) {
                return null;
            }
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_data"));
            if (string != null) {
                FileInputStream fileInputStream = new FileInputStream(string);
                if (string == null) {
                    i = -1;
                } else {
                    i = (int) new File(string).length();
                }
                b b2 = b(fileInputStream, i);
                query.close();
                return b2;
            }
            query.close();
            return null;
        } finally {
            query.close();
        }
    }

    /* access modifiers changed from: protected */
    public final b a(ImageRequest imageRequest) throws IOException {
        boolean z;
        InputStream inputStream;
        Uri sourceUri = imageRequest.getSourceUri();
        if (!f.d(sourceUri) || !"com.android.contacts".equals(sourceUri.getAuthority()) || sourceUri.getPath().startsWith(f.f23525a.getPath())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (sourceUri.toString().endsWith("/photo")) {
                inputStream = this.f24214b.openInputStream(sourceUri);
            } else if (sourceUri.toString().endsWith("/display_photo")) {
                try {
                    inputStream = this.f24214b.openAssetFileDescriptor(sourceUri, "r").createInputStream();
                } catch (IOException unused) {
                    throw new IOException("Contact photo does not exist: " + sourceUri);
                }
            } else {
                inputStream = ContactsContract.Contacts.openContactPhotoInputStream(this.f24214b, sourceUri);
                if (inputStream == null) {
                    throw new IOException("Contact photo does not exist: " + sourceUri);
                }
            }
            return b(inputStream, -1);
        }
        if (f.e(sourceUri)) {
            b a2 = a(sourceUri);
            if (a2 != null) {
                return a2;
            }
        }
        return b(this.f24214b.openInputStream(sourceUri), -1);
    }

    public y(Executor executor, com.facebook.common.memory.f fVar, ContentResolver contentResolver) {
        super(executor, fVar);
        this.f24214b = contentResolver;
    }
}
