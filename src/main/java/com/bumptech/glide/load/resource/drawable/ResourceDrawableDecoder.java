package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.util.List;

public class ResourceDrawableDecoder implements ResourceDecoder<Uri, Drawable> {
    private final Context context;

    public ResourceDrawableDecoder(Context context2) {
        this.context = context2.getApplicationContext();
    }

    @DrawableRes
    private int loadResourceIdFromUri(Uri uri) {
        Integer num;
        List<String> pathSegments = uri.getPathSegments();
        if (pathSegments.size() == 2) {
            String authority = uri.getAuthority();
            String str = pathSegments.get(1);
            num = Integer.valueOf(this.context.getResources().getIdentifier(str, pathSegments.get(0), authority));
        } else {
            if (pathSegments.size() == 1) {
                try {
                    num = Integer.valueOf(pathSegments.get(0));
                } catch (NumberFormatException unused) {
                }
            }
            num = null;
        }
        if (num == null) {
            throw new IllegalArgumentException("Unrecognized Uri format: " + uri);
        } else if (num.intValue() != 0) {
            return num.intValue();
        } else {
            throw new IllegalArgumentException("Failed to obtain resource id for: " + uri);
        }
    }

    public boolean handles(@NonNull Uri uri, @NonNull Options options) {
        return uri.getScheme().equals("android.resource");
    }

    @NonNull
    private Context getContextForPackage(Uri uri, String str) {
        try {
            return this.context.createPackageContext(str, 0);
        } catch (PackageManager.NameNotFoundException e2) {
            throw new IllegalArgumentException("Failed to obtain context or unrecognized Uri format for: " + uri, e2);
        }
    }

    @Nullable
    public Resource<Drawable> decode(@NonNull Uri uri, int i, int i2, @NonNull Options options) {
        Context context2;
        int loadResourceIdFromUri = loadResourceIdFromUri(uri);
        String authority = uri.getAuthority();
        if (authority.equals(this.context.getPackageName())) {
            context2 = this.context;
        } else {
            context2 = getContextForPackage(uri, authority);
        }
        return NonOwnedDrawableResource.newInstance(DrawableDecoderCompat.getDrawable(this.context, context2, loadResourceIdFromUri));
    }
}
