package com.ss.android.ugc.aweme.shortvideo.model;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.video.b;
import java.io.File;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u0012\u0010\u0007\u001a\u00020\b*\u00020\u00042\u0006\u0010\t\u001a\u00020\n\u001a\n\u0010\u000b\u001a\u00020\u0003*\u00020\u0004\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"KB", "", "copy2Draft", "", "Lcom/ss/android/ugc/aweme/shortvideo/model/VEPreviewConfigure;", "draft", "Lcom/ss/android/ugc/aweme/draft/model/AwemeDraft;", "getSegmentCopyPath", "", "segment", "Lcom/ss/android/ugc/aweme/shortvideo/model/VEVideoSegment;", "removeTempFiles", "tools.dmt-av-impl_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
@JvmName
public final class VEPreviewConfigureExtension {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final void removeTempFiles(@NotNull VEPreviewConfigure vEPreviewConfigure) {
        VEPreviewConfigure vEPreviewConfigure2 = vEPreviewConfigure;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{vEPreviewConfigure2}, null, changeQuickRedirect, true, 77692, new Class[]{VEPreviewConfigure.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{vEPreviewConfigure2}, null, changeQuickRedirect, true, 77692, new Class[]{VEPreviewConfigure.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(vEPreviewConfigure2, "$this$removeTempFiles");
        CharSequence draftDir = vEPreviewConfigure.getDraftDir();
        if (!(draftDir == null || draftDir.length() == 0)) {
            z = false;
        }
        if (!z) {
            b.b(new File(vEPreviewConfigure.getDraftDir()));
        }
    }

    public static final void copy2Draft(@NotNull VEPreviewConfigure vEPreviewConfigure, @NotNull c cVar) {
        VEPreviewConfigure vEPreviewConfigure2 = vEPreviewConfigure;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{vEPreviewConfigure2, cVar2}, null, changeQuickRedirect, true, 77691, new Class[]{VEPreviewConfigure.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{vEPreviewConfigure2, cVar2}, null, changeQuickRedirect, true, 77691, new Class[]{VEPreviewConfigure.class, c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(vEPreviewConfigure2, "$this$copy2Draft");
        Intrinsics.checkParameterIsNotNull(cVar2, "draft");
        i.a((Callable<TResult>) new VEPreviewConfigureExtension$copy2Draft$1<TResult>(vEPreviewConfigure2, cVar2));
    }

    @NotNull
    public static final String getSegmentCopyPath(@NotNull VEPreviewConfigure vEPreviewConfigure, @NotNull VEVideoSegment vEVideoSegment) {
        VEPreviewConfigure vEPreviewConfigure2 = vEPreviewConfigure;
        VEVideoSegment vEVideoSegment2 = vEVideoSegment;
        if (PatchProxy.isSupport(new Object[]{vEPreviewConfigure2, vEVideoSegment2}, null, changeQuickRedirect, true, 77690, new Class[]{VEPreviewConfigure.class, VEVideoSegment.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{vEPreviewConfigure2, vEVideoSegment2}, null, changeQuickRedirect, true, 77690, new Class[]{VEPreviewConfigure.class, VEVideoSegment.class}, String.class);
        }
        Intrinsics.checkParameterIsNotNull(vEPreviewConfigure2, "$this$getSegmentCopyPath");
        Intrinsics.checkParameterIsNotNull(vEVideoSegment2, "segment");
        return vEPreviewConfigure.getDraftDir() + FilesKt.getNameWithoutExtension(new File(vEVideoSegment2.videoPath)) + "_copy";
    }
}
