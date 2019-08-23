package dmt.av.video.a;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.cut.ap;
import com.ss.android.ugc.aweme.shortvideo.model.VEPreviewConfigure;
import com.ss.android.ugc.aweme.shortvideo.model.VEVideoSegment;
import com.ss.android.ugc.aweme.shortvideo.util.ai;
import com.ss.android.vesdk.al;
import com.ss.android.vesdk.c;
import com.ss.android.vesdk.p;
import dmt.av.video.u;

public final class h extends a {
    public static ChangeQuickRedirect j;

    public final int a(Context context, p pVar, u uVar) {
        int i;
        p pVar2 = pVar;
        u uVar2 = uVar;
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{context, pVar2, uVar2}, this, j, false, 92165, new Class[]{Context.class, p.class, u.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{context, pVar2, uVar2}, this, j, false, 92165, new Class[]{Context.class, p.class, u.class}, Integer.TYPE)).intValue();
        }
        super.a(context, pVar, uVar);
        if (uVar2.editorHandler > 0 && uVar2.editorModel != null) {
            al alVar = new al(uVar2.mVideoPaths);
            if (uVar2 instanceof VEPreviewConfigure) {
                VEPreviewConfigure vEPreviewConfigure = (VEPreviewConfigure) uVar2;
                if (vEPreviewConfigure.getVideoSegments().size() == 1) {
                    VEVideoSegment vEVideoSegment = vEPreviewConfigure.getVideoSegments().get(0);
                    if (vEVideoSegment.getEnd() - vEVideoSegment.start == vEVideoSegment.duration) {
                        ai.a("single video import without cut");
                        alVar = null;
                    }
                }
            }
            if (alVar != null) {
                alVar.f77896e = uVar2.mVTrimIn;
                alVar.f77897f = uVar2.mVTrimOut;
                if (uVar2.speedArray != null && uVar2.speedArray.length > 0) {
                    double[] dArr = new double[uVar2.speedArray.length];
                    for (int i3 = 0; i3 < uVar2.speedArray.length; i3++) {
                        dArr[i3] = (double) uVar2.speedArray[i3];
                    }
                    alVar.i = dArr;
                }
                if (uVar2.rotateArray != null) {
                    c[] cVarArr = new c[uVar2.rotateArray.length];
                    while (i2 < cVarArr.length) {
                        cVarArr[i2] = ap.a.a(uVar2.rotateArray[i2]);
                        i2++;
                    }
                    alVar.k = cVarArr;
                }
            }
            i = pVar2.a(uVar2.editorModel, alVar);
            ai.a("initVEEditor with editorModel");
        } else if (uVar2.mVTrimIn == null || uVar2.mVTrimOut == null) {
            i = this.g.a(uVar2.mVideoPaths, (String[]) null, uVar2.mAudioPaths, p.i.VIDEO_OUT_RATIO_ORIGINAL);
        } else if (uVar2.rotateArray != null) {
            c[] cVarArr2 = new c[uVar2.rotateArray.length];
            while (i2 < cVarArr2.length) {
                cVarArr2[i2] = ap.a.a(uVar2.rotateArray[i2]);
                i2++;
            }
            i = this.g.a(uVar2.mVideoPaths, uVar2.mVTrimIn, uVar2.mVTrimOut, null, uVar2.mAudioPaths, null, null, uVar2.speedArray, cVarArr2, p.i.VIDEO_OUT_RATIO_ORIGINAL);
        } else {
            i = this.g.a(uVar2.mVideoPaths, uVar2.mVTrimIn, uVar2.mVTrimOut, null, uVar2.mAudioPaths, null, null, uVar2.speedArray, null, p.i.VIDEO_OUT_RATIO_ORIGINAL);
        }
        return i;
    }
}
