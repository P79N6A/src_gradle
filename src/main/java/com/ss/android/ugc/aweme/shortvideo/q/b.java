package com.ss.android.ugc.aweme.shortvideo.q;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.services.videoprocess.IVideoProcessorsService;
import com.ss.android.ugc.aweme.shortvideo.q.a.a;
import com.ss.android.ugc.aweme.shortvideo.q.b.g;
import com.ss.android.ugc.aweme.shortvideo.q.b.h;
import java.util.concurrent.Callable;

public final class b implements IVideoProcessorsService {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68952a;

    public final void convertVideo2Gif(String str, String str2, boolean z, a aVar) {
        String str3 = str;
        String str4 = str2;
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{str3, str4, Byte.valueOf(z ? (byte) 1 : 0), aVar2}, this, f68952a, false, 81105, new Class[]{String.class, String.class, Boolean.TYPE, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, Byte.valueOf(z), aVar2}, this, f68952a, false, 81105, new Class[]{String.class, String.class, Boolean.TYPE, a.class}, Void.TYPE);
            return;
        }
        new a(str3, str4, z, aVar2).start();
    }

    public final void addStoryWaterMark(String str, String str2, int i, int i2, a aVar) {
        if (PatchProxy.isSupport(new Object[]{str, str2, Integer.valueOf(i), Integer.valueOf(i2), aVar}, this, f68952a, false, 81106, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, a.class}, Void.TYPE)) {
            Object[] objArr = {str, str2, Integer.valueOf(i), Integer.valueOf(i2), aVar};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f68952a, false, 81106, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, a.class}, Void.TYPE);
            return;
        }
        Object[] objArr3 = {str, str2, Integer.valueOf(i), Integer.valueOf(i2), aVar};
        if (PatchProxy.isSupport(objArr3, null, g.f68970a, true, 81132, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, a.class}, Void.TYPE)) {
            Object[] objArr4 = {str, str2, Integer.valueOf(i), Integer.valueOf(i2), aVar};
            Object[] objArr5 = objArr4;
            PatchProxy.accessDispatch(objArr5, null, g.f68970a, true, 81132, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, a.class}, Void.TYPE);
            return;
        }
        h hVar = new h(str, i, i2, str2, aVar);
        i.a((Callable<TResult>) hVar);
    }
}
