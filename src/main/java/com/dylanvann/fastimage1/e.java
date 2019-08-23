package com.dylanvann.fastimage1;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.model.GlideUrl;
import com.bumptech.glide.load.model.Headers;
import com.facebook.react.views.imagehelper.ImageSource;
import javax.annotation.Nullable;

public final class e extends ImageSource {

    /* renamed from: a  reason: collision with root package name */
    public Headers f23275a;

    /* renamed from: b  reason: collision with root package name */
    Uri f23276b;

    public final Uri getUri() {
        return this.f23276b;
    }

    public final GlideUrl b() {
        return new GlideUrl(getUri().toString(), this.f23275a);
    }

    public final boolean a() {
        if (this.f23276b == null || !"data".equals(this.f23276b.getScheme())) {
            return false;
        }
        return true;
    }

    public final boolean isResource() {
        if (this.f23276b == null || !"android.resource".equals(this.f23276b.getScheme())) {
            return false;
        }
        return true;
    }

    public e(Context context, String str, @Nullable Headers headers) {
        this(context, str, 0.0d, 0.0d, headers);
    }

    private e(Context context, String str, double d2, double d3, @Nullable Headers headers) {
        super(context, str, 0.0d, 0.0d);
        this.f23275a = headers == null ? Headers.DEFAULT : headers;
        this.f23276b = super.getUri();
        if (isResource() && TextUtils.isEmpty(this.f23276b.toString())) {
            throw new Resources.NotFoundException("Local Resource Not Found. Resource: '" + getSource() + "'.");
        } else if ("res".equals(this.f23276b.getScheme())) {
            String uri = this.f23276b.toString();
            this.f23276b = Uri.parse(uri.replace("res:/", "android.resource://" + context.getPackageName() + "/"));
        }
    }
}
