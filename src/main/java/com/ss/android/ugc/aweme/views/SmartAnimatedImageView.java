package com.ss.android.ugc.aweme.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.lighten.core.b.g;
import com.bytedance.lighten.core.e;
import com.bytedance.lighten.core.i;
import com.bytedance.lighten.core.k;
import com.bytedance.lighten.core.l;
import com.bytedance.lighten.loader.SmartImageView;
import com.facebook.common.references.CloseableReference;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.base.model.UrlModel;

public class SmartAnimatedImageView extends SmartImageView {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f76415c;

    /* renamed from: d  reason: collision with root package name */
    public a f76416d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f76417e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f76418f;
    protected g g = new g() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f76419a;

        public final void a(Uri uri, @Nullable View view) {
        }

        public final void a(Uri uri, @Nullable View view, @Nullable Throwable th) {
        }

        public final void a(Uri uri, @Nullable View view, @Nullable i iVar, @Nullable Animatable animatable) {
            if (PatchProxy.isSupport(new Object[]{uri, view, iVar, animatable}, this, f76419a, false, 89651, new Class[]{Uri.class, View.class, i.class, Animatable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{uri, view, iVar, animatable}, this, f76419a, false, 89651, new Class[]{Uri.class, View.class, i.class, Animatable.class}, Void.TYPE);
                return;
            }
            String url = SmartAnimatedImageView.this.getUrl();
            if (!TextUtils.isEmpty(url) && com.ss.android.ugc.aweme.framework.fresco.a.b().a(url) == null) {
                SmartAnimatedImageView smartAnimatedImageView = SmartAnimatedImageView.this;
                if (smartAnimatedImageView.f21799b != null) {
                    com.bytedance.lighten.loader.a aVar = smartAnimatedImageView.f21799b;
                    if (aVar.f21800a != null) {
                        com.ss.android.ugc.aweme.framework.fresco.a.b().a(url, aVar.f21800a);
                    }
                }
            }
            if (animatable != null) {
                SmartAnimatedImageView.this.f76418f = true;
                if (SmartAnimatedImageView.this.f76417e) {
                    SmartAnimatedImageView.this.a();
                }
            } else {
                SmartAnimatedImageView.this.f76418f = false;
            }
        }
    };
    private UrlModel h;
    private boolean i;
    private CloseableReference<Bitmap> j;

    public interface a {
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f76415c, false, 89650, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f76415c, false, 89650, new Class[0], Void.TYPE);
            return;
        }
        if (this.f76417e && this.f76418f && this.i) {
            super.a();
        }
    }

    public String getUrl() {
        if (PatchProxy.isSupport(new Object[0], this, f76415c, false, 89649, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f76415c, false, 89649, new Class[0], String.class);
        } else if (this.h == null || this.h.getUrlList() == null || this.h.getUrlList().size() == 0) {
            return "";
        } else {
            return this.h.getUrlList().get(0);
        }
    }

    public void setAttached(boolean z) {
        this.f76417e = z;
    }

    public void setImageLoadFinishListener(a aVar) {
        this.f76416d = aVar;
    }

    public void setUserVisibleHint(boolean z) {
        this.i = z;
    }

    public SmartAnimatedImageView(Context context) {
        super(context);
    }

    public final void a(UrlModel urlModel) {
        UrlModel urlModel2 = urlModel;
        if (PatchProxy.isSupport(new Object[]{urlModel2}, this, f76415c, false, 89647, new Class[]{UrlModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel2}, this, f76415c, false, 89647, new Class[]{UrlModel.class}, Void.TYPE);
            return;
        }
        a(urlModel2, "");
    }

    public SmartAnimatedImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void a(UrlModel urlModel, String str) {
        if (PatchProxy.isSupport(new Object[]{urlModel, str}, this, f76415c, false, 89648, new Class[]{UrlModel.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{urlModel, str}, this, f76415c, false, 89648, new Class[]{UrlModel.class, String.class}, Void.TYPE);
        } else if (urlModel != null && urlModel.getUrlList() != null && urlModel.getUrlList().size() != 0) {
            this.h = urlModel;
            e a2 = l.a(getUrl()).a((Drawable) null);
            this.j = com.ss.android.ugc.aweme.framework.fresco.a.b().a(getUrl());
            if (this.j != null && this.j.isValid()) {
                Bitmap bitmap = (Bitmap) this.j.get();
                if (!bitmap.isRecycled()) {
                    a2.a((Drawable) new BitmapDrawable(bitmap));
                } else {
                    a2.a((Drawable) null);
                }
            }
            a2.a(Bitmap.Config.RGB_565).a(false).a(1).a(k.MEDIUM).a(m.a(this.g, Uri.parse(urlModel.getUrlList().get(0)), GlobalContext.getContext(), urlModel, str));
            l.a(this, a2.a());
        }
    }

    public SmartAnimatedImageView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}
