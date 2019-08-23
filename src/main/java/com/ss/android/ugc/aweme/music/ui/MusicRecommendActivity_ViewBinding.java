package com.ss.android.ugc.aweme.music.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class MusicRecommendActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56612a;

    /* renamed from: b  reason: collision with root package name */
    private MusicRecommendActivity f56613b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f56612a, false, 60450, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56612a, false, 60450, new Class[0], Void.TYPE);
            return;
        }
        MusicRecommendActivity musicRecommendActivity = this.f56613b;
        if (musicRecommendActivity != null) {
            this.f56613b = null;
            musicRecommendActivity.txtClickUploadTv = null;
            musicRecommendActivity.llClickForUpload = null;
            musicRecommendActivity.tvContentAgreement = null;
            musicRecommendActivity.editSongLink = null;
            musicRecommendActivity.editSongName = null;
            musicRecommendActivity.ivClickUpload = null;
            musicRecommendActivity.mTitleBar = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MusicRecommendActivity_ViewBinding(MusicRecommendActivity musicRecommendActivity, View view) {
        this.f56613b = musicRecommendActivity;
        musicRecommendActivity.txtClickUploadTv = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.td, "field 'txtClickUploadTv'", TextView.class);
        musicRecommendActivity.llClickForUpload = (LinearLayout) Utils.findRequiredViewAsType(view, C0906R.id.tc, "field 'llClickForUpload'", LinearLayout.class);
        musicRecommendActivity.tvContentAgreement = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.z4, "field 'tvContentAgreement'", TextView.class);
        musicRecommendActivity.editSongLink = (EditText) Utils.findRequiredViewAsType(view, C0906R.id.csp, "field 'editSongLink'", EditText.class);
        musicRecommendActivity.editSongName = (EditText) Utils.findRequiredViewAsType(view, C0906R.id.csq, "field 'editSongName'", EditText.class);
        musicRecommendActivity.ivClickUpload = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.tb, "field 'ivClickUpload'", ImageView.class);
        musicRecommendActivity.mTitleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3m, "field 'mTitleBar'", TextTitleBar.class);
    }
}
