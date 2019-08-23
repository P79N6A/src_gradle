package com.ss.android.ugc.aweme.shortvideo.q.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.aq.a;
import com.ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J=\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\rH\u0016¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0011H\u0016¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/videoprocess/watercompose/WaterMarkServiceImpl;", "Lcom/ss/android/ugc/aweme/services/watermark/IWaterMarkService;", "()V", "cancelWaterMark", "", "createWaterMarkImages", "", "", "text", "dir", "commonName", "waterPicDir", "leftAlign", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)[Ljava/lang/String;", "waterMark", "waterMarkBuilder", "Lcom/ss/android/ugc/aweme/watermark/WaterMarkBuilder;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class o implements IWaterMarkService {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68998a;

    public final void cancelWaterMark() {
        if (PatchProxy.isSupport(new Object[0], this, f68998a, false, 81189, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68998a, false, 81189, new Class[0], Void.TYPE);
            return;
        }
        j.a();
    }

    public final void waterMark(@NotNull a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f68998a, false, 81190, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f68998a, false, 81190, new Class[]{a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "waterMarkBuilder");
        new j().a(aVar2);
    }

    @NotNull
    public final String[] createWaterMarkImages(@NotNull String str, @NotNull String str2, @NotNull String str3, @Nullable String str4, boolean z) {
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        if (PatchProxy.isSupport(new Object[]{str5, str6, str7, str4, Byte.valueOf(z ? (byte) 1 : 0)}, this, f68998a, false, 81188, new Class[]{String.class, String.class, String.class, String.class, Boolean.TYPE}, String[].class)) {
            Object[] objArr = {str5, str6, str7, str4, Byte.valueOf(z)};
            return (String[]) PatchProxy.accessDispatch(objArr, this, f68998a, false, 81188, new Class[]{String.class, String.class, String.class, String.class, Boolean.TYPE}, String[].class);
        }
        Intrinsics.checkParameterIsNotNull(str5, "text");
        Intrinsics.checkParameterIsNotNull(str6, "dir");
        Intrinsics.checkParameterIsNotNull(str7, "commonName");
        String[] a2 = m.a(str, str2, str3, str4, z);
        Intrinsics.checkExpressionValueIsNotNull(a2, "WaterMarkImageHelper.cre…, waterPicDir, leftAlign)");
        return a2;
    }
}
