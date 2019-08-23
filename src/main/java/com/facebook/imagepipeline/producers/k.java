package com.facebook.imagepipeline.producers;

import android.net.Uri;
import android.util.Base64;
import com.facebook.common.executors.CallerThreadExecutor;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.memory.f;
import com.facebook.imagepipeline.image.b;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public final class k extends ab {
    /* access modifiers changed from: protected */
    public final String a() {
        return "DataFetchProducer";
    }

    public k(f fVar) {
        super(CallerThreadExecutor.getInstance(), fVar);
    }

    /* access modifiers changed from: protected */
    public final b a(ImageRequest imageRequest) throws IOException {
        boolean z;
        byte[] bArr;
        String uri = imageRequest.getSourceUri().toString();
        Preconditions.checkArgument(uri.substring(0, 5).equals("data:"));
        int indexOf = uri.indexOf(44);
        String substring = uri.substring(indexOf + 1, uri.length());
        String substring2 = uri.substring(0, indexOf);
        if (!substring2.contains(";")) {
            z = false;
        } else {
            String[] split = substring2.split(";");
            z = split[split.length - 1].equals("base64");
        }
        if (z) {
            bArr = Base64.decode(substring, 0);
        } else {
            bArr = Uri.decode(substring).getBytes();
        }
        return a(new ByteArrayInputStream(bArr), bArr.length);
    }
}
