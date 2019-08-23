package com.ss.android.ugc.aweme.shortvideo.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.draft.a.j;
import com.ss.android.ugc.aweme.draft.l;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.ugc.aweme.video.b;
import com.ss.android.vesdk.VEUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "call"}, k = 3, mv = {1, 1, 15})
final class VEPreviewConfigureExtension$copy2Draft$1<V> implements Callable<TResult> {
    public static ChangeQuickRedirect changeQuickRedirect;
    final /* synthetic */ c $draft;
    final /* synthetic */ VEPreviewConfigure $this_copy2Draft;

    VEPreviewConfigureExtension$copy2Draft$1(VEPreviewConfigure vEPreviewConfigure, c cVar) {
        this.$this_copy2Draft = vEPreviewConfigure;
        this.$draft = cVar;
    }

    public final int call() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 77693, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 77693, new Class[0], Integer.TYPE)).intValue();
        }
        List arrayList = new ArrayList();
        int i = 0;
        for (Object next : this.$this_copy2Draft.getVideoSegments()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            VEVideoSegment vEVideoSegment = (VEVideoSegment) next;
            arrayList.add(vEVideoSegment.transform2Draft());
            String segmentCopyPath = VEPreviewConfigureExtension.getSegmentCopyPath(this.$this_copy2Draft, vEVideoSegment);
            int[] iArr = {vEVideoSegment.start, vEVideoSegment.getEnd()};
            if (vEVideoSegment.duration - (vEVideoSegment.getEnd() - vEVideoSegment.start) <= 5000) {
                b.c(vEVideoSegment.videoPath, segmentCopyPath);
                ai.a("draftOpt==>copy full video data");
            } else {
                File file = new File(segmentCopyPath);
                if (!file.exists()) {
                    b.a(segmentCopyPath, true);
                } else {
                    file.delete();
                }
                VEUtils.trimToDraft(vEVideoSegment.videoPath, new int[]{vEVideoSegment.start, vEVideoSegment.getEnd()}, segmentCopyPath, iArr);
                ai.a("draftOpt==>copy apart video data");
            }
            j jVar = (j) arrayList.get(i);
            if (PatchProxy.isSupport(new Object[]{segmentCopyPath}, jVar, j.f43456a, false, 38501, new Class[]{String.class}, Void.TYPE)) {
                j jVar2 = jVar;
                PatchProxy.accessDispatch(new Object[]{segmentCopyPath}, jVar2, j.f43456a, false, 38501, new Class[]{String.class}, Void.TYPE);
            } else {
                Intrinsics.checkParameterIsNotNull(segmentCopyPath, "<set-?>");
                jVar.i = segmentCopyPath;
            }
            jVar.f43459d = iArr[0];
            jVar.f43460e = iArr[1];
            i = i2;
        }
        this.$draft.b(arrayList);
        return l.a().b(this.$draft);
    }
}
