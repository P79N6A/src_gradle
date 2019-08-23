package com.ss.android.ugc.aweme.shortvideo.cut;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.design.widget.CheckableImageButton;
import android.support.v7.widget.RecyclerView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;
import com.ss.android.ugc.aweme.views.AutoRTLImageView;

public class CutMultiVideoActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66177a;

    /* renamed from: b  reason: collision with root package name */
    private CutMultiVideoActivity f66178b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f66177a, false, 75486, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66177a, false, 75486, new Class[0], Void.TYPE);
            return;
        }
        CutMultiVideoActivity cutMultiVideoActivity = this.f66178b;
        if (cutMultiVideoActivity != null) {
            this.f66178b = null;
            cutMultiVideoActivity.textureView = null;
            cutMultiVideoActivity.playIcon = null;
            cutMultiVideoActivity.back = null;
            cutMultiVideoActivity.next = null;
            cutMultiVideoActivity.speedBarStub = null;
            cutMultiVideoActivity.speedBtn = null;
            cutMultiVideoActivity.rotateBtn = null;
            cutMultiVideoActivity.deleteBtn = null;
            cutMultiVideoActivity.tvTimeSelected = null;
            cutMultiVideoActivity.tvVideoSegDes = null;
            cutMultiVideoActivity.videoRecyclerView = null;
            cutMultiVideoActivity.singleEditLayout = null;
            cutMultiVideoActivity.cancelIcon = null;
            cutMultiVideoActivity.saveIcon = null;
            cutMultiVideoActivity.editVideoCover = null;
            cutMultiVideoActivity.flVideoCover = null;
            cutMultiVideoActivity.animDot = null;
            cutMultiVideoActivity.layoutTop = null;
            cutMultiVideoActivity.layoutBottom = null;
            cutMultiVideoActivity.videoEditView = null;
            cutMultiVideoActivity.videoEditViewWrapper = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public CutMultiVideoActivity_ViewBinding(CutMultiVideoActivity cutMultiVideoActivity, View view) {
        this.f66178b = cutMultiVideoActivity;
        cutMultiVideoActivity.textureView = (TextureView) Utils.findRequiredViewAsType(view, C0906R.id.cxe, "field 'textureView'", TextureView.class);
        cutMultiVideoActivity.playIcon = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.byk, "field 'playIcon'", ImageView.class);
        cutMultiVideoActivity.back = (AutoRTLImageView) Utils.findRequiredViewAsType(view, C0906R.id.ay9, "field 'back'", AutoRTLImageView.class);
        cutMultiVideoActivity.next = Utils.findRequiredView(view, C0906R.id.d8h, "field 'next'");
        cutMultiVideoActivity.speedBarStub = (ViewStub) Utils.findRequiredViewAsType(view, C0906R.id.ct2, "field 'speedBarStub'", ViewStub.class);
        cutMultiVideoActivity.speedBtn = (CheckableImageButton) Utils.findRequiredViewAsType(view, C0906R.id.ayf, "field 'speedBtn'", CheckableImageButton.class);
        cutMultiVideoActivity.rotateBtn = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.ayd, "field 'rotateBtn'", ImageView.class);
        cutMultiVideoActivity.deleteBtn = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.aya, "field 'deleteBtn'", ImageView.class);
        cutMultiVideoActivity.tvTimeSelected = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.d8n, "field 'tvTimeSelected'", TextView.class);
        cutMultiVideoActivity.tvVideoSegDes = (TextView) Utils.findOptionalViewAsType(view, C0906R.id.d8q, "field 'tvVideoSegDes'", TextView.class);
        cutMultiVideoActivity.videoRecyclerView = (RecyclerView) Utils.findOptionalViewAsType(view, C0906R.id.dro, "field 'videoRecyclerView'", RecyclerView.class);
        cutMultiVideoActivity.singleEditLayout = view.findViewById(C0906R.id.crn);
        cutMultiVideoActivity.cancelIcon = (ImageView) Utils.findOptionalViewAsType(view, C0906R.id.ay_, "field 'cancelIcon'", ImageView.class);
        cutMultiVideoActivity.saveIcon = (ImageView) Utils.findOptionalViewAsType(view, C0906R.id.aye, "field 'saveIcon'", ImageView.class);
        cutMultiVideoActivity.editVideoCover = (RemoteImageView) Utils.findOptionalViewAsType(view, C0906R.id.ayb, "field 'editVideoCover'", RemoteImageView.class);
        cutMultiVideoActivity.flVideoCover = view.findViewById(C0906R.id.af0);
        cutMultiVideoActivity.animDot = view.findViewById(C0906R.id.f8);
        cutMultiVideoActivity.layoutTop = (RelativeLayout) Utils.findOptionalViewAsType(view, C0906R.id.cfm, "field 'layoutTop'", RelativeLayout.class);
        cutMultiVideoActivity.layoutBottom = (RelativeLayout) Utils.findOptionalViewAsType(view, C0906R.id.m0, "field 'layoutBottom'", RelativeLayout.class);
        cutMultiVideoActivity.videoEditView = (VideoEditView) Utils.findRequiredViewAsType(view, C0906R.id.drl, "field 'videoEditView'", VideoEditView.class);
        cutMultiVideoActivity.videoEditViewWrapper = (RelativeLayout) Utils.findOptionalViewAsType(view, C0906R.id.ds4, "field 'videoEditViewWrapper'", RelativeLayout.class);
    }
}
