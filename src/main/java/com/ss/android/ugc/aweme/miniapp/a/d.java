package com.ss.android.ugc.aweme.miniapp.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.excitingvideo.IImageLoadFactory;
import com.ss.android.excitingvideo.IImageLoadListener;

public final class d implements IImageLoadFactory {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55430a;

    public final IImageLoadListener createImageLoad() {
        if (!PatchProxy.isSupport(new Object[0], this, f55430a, false, 59136, new Class[0], IImageLoadListener.class)) {
            return new f();
        }
        return (IImageLoadListener) PatchProxy.accessDispatch(new Object[0], this, f55430a, false, 59136, new Class[0], IImageLoadListener.class);
    }
}
