package com.squareup.picasso;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.s;
import com.squareup.picasso.x;
import java.io.IOException;

public final class b extends x {

    /* renamed from: a  reason: collision with root package name */
    private static final int f27399a = 22;

    /* renamed from: b  reason: collision with root package name */
    private final AssetManager f27400b;

    public b(Context context) {
        this.f27400b = context.getAssets();
    }

    public final x.a b(v vVar) throws IOException {
        return new x.a(this.f27400b.open(vVar.f27464d.toString().substring(f27399a)), s.d.DISK);
    }

    public final boolean a(v vVar) {
        Uri uri = vVar.f27464d;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }
}
