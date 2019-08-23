package com.douyin.share.c;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.douyin.share.a.a;
import com.douyin.share.profile.share.a.c;
import java.io.File;

public final class b extends a {
    public final String a() {
        return null;
    }

    public final boolean a(Context context) {
        return new c((Activity) context, new File(context.getExternalCacheDir(), "tmpimages").getPath(), com.douyin.share.a.c.b.a()).a();
    }

    public final void a(Context context, Uri uri) {
        throw new UnsupportedOperationException();
    }
}
