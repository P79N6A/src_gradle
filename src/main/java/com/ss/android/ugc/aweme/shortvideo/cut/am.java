package com.ss.android.ugc.aweme.shortvideo.cut;

import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.support.v4.util.Pair;
import android.view.SurfaceView;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&J\b\u0010\n\u001a\u00020\u000bH&J\b\u0010\f\u001a\u00020\u000bH&J\u0014\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u000eH&J\b\u0010\u000f\u001a\u00020\u0010H&J\b\u0010\u0011\u001a\u00020\u000bH&¨\u0006\u0012"}, d2 = {"Lcom/ss/android/ugc/aweme/shortvideo/cut/VECutVideoViewProvider;", "", "activityContext", "Landroid/content/Context;", "editState", "", "lifeCycleOwner", "Landroid/arch/lifecycle/LifecycleOwner;", "maxDuration", "", "onFirstFrameRender", "", "onInitVEEditorFailed", "playBoundary", "Landroid/support/v4/util/Pair;", "surfaceView", "Landroid/view/SurfaceView;", "updateVideoEditViewArgument", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface am {
    @NotNull
    SurfaceView C();

    @NotNull
    Context n();

    @NotNull
    LifecycleOwner o();

    void p();

    void q();

    int r();

    long s();

    @NotNull
    Pair<Long, Long> t();

    void u();
}
