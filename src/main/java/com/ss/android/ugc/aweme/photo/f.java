package com.ss.android.ugc.aweme.photo;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.Callable;
import kotlin.jvm.functions.Function0;

public final /* synthetic */ class f implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58537a;

    /* renamed from: b  reason: collision with root package name */
    private final ImageView f58538b;

    /* renamed from: c  reason: collision with root package name */
    private final Bitmap f58539c;

    /* renamed from: d  reason: collision with root package name */
    private final Function0 f58540d;

    f(ImageView imageView, Bitmap bitmap, Function0 function0) {
        this.f58538b = imageView;
        this.f58539c = bitmap;
        this.f58540d = function0;
    }

    public final Object call() {
        if (PatchProxy.isSupport(new Object[0], this, f58537a, false, 63557, new Class[0], Object.class)) {
            return PatchProxy.accessDispatch(new Object[0], this, f58537a, false, 63557, new Class[0], Object.class);
        }
        ImageView imageView = this.f58538b;
        Bitmap bitmap = this.f58539c;
        Function0 function0 = this.f58540d;
        imageView.setImageBitmap(bitmap);
        function0.invoke();
        return null;
    }
}
