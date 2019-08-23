package com.ss.android.ugc.aweme.services;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.FFMpegManager;
import com.ss.android.ugc.aweme.shortvideo.q.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0016J`\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/services/SDKServiceImpl;", "Lcom/ss/android/ugc/aweme/services/ISDKService;", "()V", "checkAudioFile", "", "path", "", "initVideoToGraph", "", "videoPath", "rencodeAndSplitFile", "inVideo", "outVideo", "outWAV", "width", "height", "screenWidth", "inPoint", "", "outPoint", "rotateAngle", "minDurationMs", "isCpuEncode", "", "uninitVideoToGraph", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SDKServiceImpl implements ISDKService {
    public static ChangeQuickRedirect changeQuickRedirect;

    public final int uninitVideoToGraph() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71487, new Class[0], Integer.TYPE)) {
            return FFMpegManager.a().b();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71487, new Class[0], Integer.TYPE)).intValue();
    }

    public final int checkAudioFile(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 71485, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 71485, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(str2, "path");
        return c.b(str);
    }

    @NotNull
    public final int[] initVideoToGraph(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 71486, new Class[]{String.class}, int[].class)) {
            return (int[]) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 71486, new Class[]{String.class}, int[].class);
        }
        Intrinsics.checkParameterIsNotNull(str2, "videoPath");
        int[] a2 = FFMpegManager.a().a(str2);
        Intrinsics.checkExpressionValueIsNotNull(a2, "FFMpegManager.getInstanc…itVideoToGraph(videoPath)");
        return a2;
    }

    public final int rencodeAndSplitFile(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2, int i3, long j, long j2, int i4, int i5, boolean z) {
        String str4 = str;
        String str5 = str2;
        String str6 = str3;
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{str4, str5, str6, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), new Long(j3), new Long(j4), Integer.valueOf(i4), Integer.valueOf(i5), Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 71488, new Class[]{String.class, String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str4, str5, str6, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), new Long(j3), new Long(j4), Integer.valueOf(i4), Integer.valueOf(i5), Byte.valueOf(z)}, this, changeQuickRedirect, false, 71488, new Class[]{String.class, String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Integer.TYPE)).intValue();
        }
        Intrinsics.checkParameterIsNotNull(str4, "inVideo");
        Intrinsics.checkParameterIsNotNull(str5, "outVideo");
        Intrinsics.checkParameterIsNotNull(str6, "outWAV");
        FFMpegManager.a aVar = new FFMpegManager.a();
        aVar.f29315a = str4;
        aVar.f29316b = str5;
        aVar.f29317c = str6;
        aVar.o = i;
        aVar.p = i2;
        aVar.f29320f = i3;
        aVar.f29318d = j3;
        aVar.f29319e = j4;
        aVar.j = i4;
        aVar.n = i5;
        aVar.u = z;
        return FFMpegManager.a().a(aVar);
    }
}
