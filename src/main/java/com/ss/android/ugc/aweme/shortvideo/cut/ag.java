package com.ss.android.ugc.aweme.shortvideo.cut;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VEVideoEditView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\bH&J\b\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/IVECutVideoCommonView;", "", "ivNext", "Landroid/view/View;", "ivPlay", "speedBarStub", "Landroid/view/ViewStub;", "surfaceView", "Landroid/view/SurfaceView;", "tvTimeSelected", "Landroid/widget/TextView;", "videoEditView", "Lcom/ss/android/ugc/aweme/shortvideo/cut/videoedit/VEVideoEditView;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface ag {
    @NotNull
    VEVideoEditView a();

    @NotNull
    View b();

    @NotNull
    View c();

    @NotNull
    TextView d();

    @NotNull
    ViewStub e();
}
