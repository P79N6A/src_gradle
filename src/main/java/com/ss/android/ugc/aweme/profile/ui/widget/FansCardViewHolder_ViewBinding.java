package com.ss.android.ugc.aweme.profile.ui.widget;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.CircleImageView;

public class FansCardViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63009a;

    /* renamed from: b  reason: collision with root package name */
    private FansCardViewHolder f63010b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f63009a, false, 69675, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63009a, false, 69675, new Class[0], Void.TYPE);
            return;
        }
        FansCardViewHolder fansCardViewHolder = this.f63010b;
        if (fansCardViewHolder != null) {
            this.f63010b = null;
            fansCardViewHolder.txtFansCount = null;
            fansCardViewHolder.ivFansPlatform = null;
            fansCardViewHolder.txtPlatform = null;
            fansCardViewHolder.ivDetailFans = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FansCardViewHolder_ViewBinding(FansCardViewHolder fansCardViewHolder, View view) {
        this.f63010b = fansCardViewHolder;
        fansCardViewHolder.txtFansCount = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.ac7, "field 'txtFansCount'", TextView.class);
        fansCardViewHolder.ivFansPlatform = (CircleImageView) Utils.findRequiredViewAsType(view, C0906R.id.acf, "field 'ivFansPlatform'", CircleImageView.class);
        fansCardViewHolder.txtPlatform = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.byj, "field 'txtPlatform'", TextView.class);
        fansCardViewHolder.ivDetailFans = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.a44, "field 'ivDetailFans'", ImageView.class);
    }
}
