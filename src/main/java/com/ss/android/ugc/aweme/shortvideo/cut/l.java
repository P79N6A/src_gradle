package com.ss.android.ugc.aweme.shortvideo.cut;

import a.g;
import a.i;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.support.design.widget.CheckableImageButton;
import android.view.Surface;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final /* synthetic */ class l implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66468a;

    /* renamed from: b  reason: collision with root package name */
    private final CutMultiVideoActivity f66469b;

    /* renamed from: c  reason: collision with root package name */
    private final SurfaceTexture f66470c;

    l(CutMultiVideoActivity cutMultiVideoActivity, SurfaceTexture surfaceTexture) {
        this.f66469b = cutMultiVideoActivity;
        this.f66470c = surfaceTexture;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f66468a, false, 75451, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f66468a, false, 75451, new Class[]{i.class}, Object.class);
        }
        CutMultiVideoActivity cutMultiVideoActivity = this.f66469b;
        SurfaceTexture surfaceTexture = this.f66470c;
        if (((Integer) iVar.e()).intValue() < 0) {
            UIUtils.displayToast((Context) cutMultiVideoActivity, (int) C0906R.string.bn3);
            cutMultiVideoActivity.finish();
        }
        cutMultiVideoActivity.G = true;
        cutMultiVideoActivity.H = false;
        if (cutMultiVideoActivity.z == 0) {
            cutMultiVideoActivity.w.select(0);
            cutMultiVideoActivity.w.setSegBoundary(0, 0, cutMultiVideoActivity.videoEditView.getMaxCutDuration());
        } else {
            cutMultiVideoActivity.w.setBoundary(0, cutMultiVideoActivity.videoEditView.getMaxCutDuration());
        }
        Surface surface = new Surface(surfaceTexture);
        cutMultiVideoActivity.w.start(surface);
        surface.release();
        cutMultiVideoActivity.d();
        int i = 8;
        cutMultiVideoActivity.playIcon.setVisibility(8);
        CheckableImageButton checkableImageButton = cutMultiVideoActivity.speedBtn;
        if (cutMultiVideoActivity.J && cutMultiVideoActivity.z == 0 && cutMultiVideoActivity.w.isSegMultiSpeedSupported(0)) {
            i = 0;
        }
        checkableImageButton.setVisibility(i);
        return null;
    }
}
