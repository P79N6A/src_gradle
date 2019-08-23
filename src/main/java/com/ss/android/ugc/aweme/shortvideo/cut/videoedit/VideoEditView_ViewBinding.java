package com.ss.android.ugc.aweme.shortvideo.cut.videoedit;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.rtlview.RTLLinearLayout;

public class VideoEditView_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66566a;

    /* renamed from: b  reason: collision with root package name */
    private VideoEditView f66567b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f66566a, false, 76007, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66566a, false, 76007, new Class[0], Void.TYPE);
            return;
        }
        VideoEditView videoEditView = this.f66567b;
        if (videoEditView != null) {
            this.f66567b = null;
            videoEditView.mCurPointerContainer = null;
            videoEditView.mCurPointer = null;
            videoEditView.frameContainer = null;
            videoEditView.frameRecyclerView = null;
            videoEditView.singleFrameRecyclerView = null;
            videoEditView.recyleBorderView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public VideoEditView_ViewBinding(VideoEditView videoEditView, View view) {
        this.f66567b = videoEditView;
        videoEditView.mCurPointerContainer = (RTLLinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.a1x, "field 'mCurPointerContainer'", RTLLinearLayout.class);
        videoEditView.mCurPointer = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.a1w, "field 'mCurPointer'", ImageView.class);
        videoEditView.frameContainer = (FrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.ail, "field 'frameContainer'", FrameLayout.class);
        videoEditView.frameRecyclerView = (MVRecycleView) Utils.findRequiredViewAsType(view, C0906R.id.aim, "field 'frameRecyclerView'", MVRecycleView.class);
        videoEditView.singleFrameRecyclerView = (MVRecycleView) Utils.findRequiredViewAsType(view, C0906R.id.cro, "field 'singleFrameRecyclerView'", MVRecycleView.class);
        videoEditView.recyleBorderView = Utils.findRequiredView(view, C0906R.id.z1, "field 'recyleBorderView'");
    }
}
