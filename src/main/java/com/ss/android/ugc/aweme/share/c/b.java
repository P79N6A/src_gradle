package com.ss.android.ugc.aweme.share.c;

import a.g;
import a.i;
import android.graphics.Bitmap;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64878a;

    public interface a {
        void a(File file);

        void a(Exception exc);
    }

    public static String a() {
        if (PatchProxy.isSupport(new Object[0], null, f64878a, true, 73744, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], null, f64878a, true, 73744, new Class[0], String.class);
        }
        return com.ss.android.ugc.aweme.video.b.d().getPath() + "/share/orange";
    }

    static final /* synthetic */ Bitmap a(View view) throws Exception {
        try {
            return Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        } catch (Exception unused) {
            return null;
        }
    }

    public static void a(View view, a aVar) {
        View view2 = view;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{view2, aVar2}, null, f64878a, true, 73742, new Class[]{View.class, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, aVar2}, null, f64878a, true, 73742, new Class[]{View.class, a.class}, Void.TYPE);
            return;
        }
        i.a((Callable<TResult>) new c<TResult>(view2)).a((g<TResult, TContinuationResult>) new d<TResult,TContinuationResult>(view2), i.f1052b).a((g<TResult, TContinuationResult>) new e<TResult,TContinuationResult>(view2), (Executor) i.f1051a).a((g<TResult, TContinuationResult>) new f<TResult,TContinuationResult>(new WeakReference(aVar2)), i.f1052b);
    }
}
