package com.ss.android.ugc.aweme.shortvideo.imageframe;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.support.annotation.Nullable;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.imageframe.c;

public class ImageFrameView extends AppCompatImageView implements c.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68213a;

    /* renamed from: b  reason: collision with root package name */
    public c f68214b;

    /* renamed from: c  reason: collision with root package name */
    private a f68215c;

    public interface a {
        void a();
    }

    @Nullable
    public c getImageLoader() {
        return this.f68214b;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f68213a, false, 77516, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68213a, false, 77516, new Class[0], Void.TYPE);
            return;
        }
        if (this.f68214b != null) {
            this.f68214b.a();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f68213a, false, 77518, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68213a, false, 77518, new Class[0], Void.TYPE);
            return;
        }
        if (this.f68215c != null) {
            this.f68215c.a();
        }
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f68213a, false, 77514, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68213a, false, 77514, new Class[0], Void.TYPE);
            return;
        }
        if (this.f68214b != null) {
            this.f68214b.a();
        }
        super.onDetachedFromWindow();
    }

    public ImageFrameView(Context context) {
        super(context);
    }

    public void setOnLoadFinishListener(a aVar) {
        this.f68215c = aVar;
    }

    public ImageFrameView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public final void a(BitmapDrawable bitmapDrawable, b bVar) {
        if (PatchProxy.isSupport(new Object[]{bitmapDrawable, bVar}, this, f68213a, false, 77517, new Class[]{BitmapDrawable.class, b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bitmapDrawable, bVar}, this, f68213a, false, 77517, new Class[]{BitmapDrawable.class, b.class}, Void.TYPE);
            return;
        }
        setImageDrawable(bitmapDrawable);
    }

    public ImageFrameView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
