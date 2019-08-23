package com.ss.android.ugc.aweme.shortvideo.cut.gif;

import android.support.v4.app.Fragment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.IVideo2GifService;
import com.ss.android.ugc.aweme.share.b.a;
import com.ss.android.ugc.aweme.shortvideo.cut.gif.a.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016¨\u0006\f"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/gif/Video2GifServiceImpl;", "Lcom/ss/android/ugc/aweme/services/IVideo2GifService;", "()V", "convert2Gif", "", "editContext", "Lcom/ss/android/ugc/aweme/share/gif/VideoShare2GifEditContext;", "listener", "Lcom/ss/android/ugc/aweme/services/IVideo2GifService$ConvertListener;", "getGifCutVideoFragment", "Landroid/support/v4/app/Fragment;", "context", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class h implements IVideo2GifService {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66459a;

    @NotNull
    public final Fragment getGifCutVideoFragment(@NotNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f66459a, false, 75832, new Class[]{a.class}, Fragment.class)) {
            return (Fragment) PatchProxy.accessDispatch(new Object[]{aVar2}, this, f66459a, false, 75832, new Class[]{a.class}, Fragment.class);
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "context");
        Video2GifCutFragment a2 = Video2GifCutFragment.a(aVar);
        Intrinsics.checkExpressionValueIsNotNull(a2, "Video2GifCutFragment.newInstance(context)");
        return a2;
    }

    public final void convert2Gif(@NotNull a aVar, @NotNull IVideo2GifService.ConvertListener convertListener) {
        a aVar2 = aVar;
        IVideo2GifService.ConvertListener convertListener2 = convertListener;
        if (PatchProxy.isSupport(new Object[]{aVar2, convertListener2}, this, f66459a, false, 75833, new Class[]{a.class, IVideo2GifService.ConvertListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, convertListener2}, this, f66459a, false, 75833, new Class[]{a.class, IVideo2GifService.ConvertListener.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "editContext");
        Intrinsics.checkParameterIsNotNull(convertListener2, "listener");
        new b().a(aVar2, convertListener2);
    }
}
