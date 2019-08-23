package com.ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditView;

public class InfoStickerHelper_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f67214a;

    /* renamed from: b  reason: collision with root package name */
    private InfoStickerHelper f67215b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f67214a, false, 76860, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f67214a, false, 76860, new Class[0], Void.TYPE);
            return;
        }
        InfoStickerHelper infoStickerHelper = this.f67215b;
        if (infoStickerHelper != null) {
            this.f67215b = null;
            infoStickerHelper.mInfoStickerEditView = null;
            infoStickerHelper.mContentLayout = null;
            infoStickerHelper.mSelectTitle = null;
            infoStickerHelper.mVideoEditView = null;
            infoStickerHelper.mCancelBtn = null;
            infoStickerHelper.mSaveBtn = null;
            infoStickerHelper.mPlayBtn = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public InfoStickerHelper_ViewBinding(InfoStickerHelper infoStickerHelper, View view) {
        this.f67215b = infoStickerHelper;
        infoStickerHelper.mInfoStickerEditView = (InfoStickerEditView) Utils.findRequiredViewAsType(view, C0906R.id.aum, "field 'mInfoStickerEditView'", InfoStickerEditView.class);
        infoStickerHelper.mContentLayout = Utils.findRequiredView(view, C0906R.id.z1, "field 'mContentLayout'");
        infoStickerHelper.mSelectTitle = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.d1p, "field 'mSelectTitle'", DmtTextView.class);
        infoStickerHelper.mVideoEditView = (VideoEditView) Utils.findRequiredViewAsType(view, C0906R.id.ds3, "field 'mVideoEditView'", VideoEditView.class);
        infoStickerHelper.mCancelBtn = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.q2, "field 'mCancelBtn'", ImageView.class);
        infoStickerHelper.mSaveBtn = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.cj7, "field 'mSaveBtn'", ImageView.class);
        infoStickerHelper.mPlayBtn = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.ot, "field 'mPlayBtn'", ImageView.class);
    }
}
