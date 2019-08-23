package com.ss.android.ugc.aweme.favorites.viewholder;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.AppCompatImageView;
import android.view.View;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;

public class StickerCollectViewHolder_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f44403a;

    /* renamed from: b  reason: collision with root package name */
    private StickerCollectViewHolder f44404b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f44403a, false, 39711, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f44403a, false, 39711, new Class[0], Void.TYPE);
            return;
        }
        StickerCollectViewHolder stickerCollectViewHolder = this.f44404b;
        if (stickerCollectViewHolder != null) {
            this.f44404b = null;
            stickerCollectViewHolder.ivCover = null;
            stickerCollectViewHolder.tvStickerName = null;
            stickerCollectViewHolder.tvDesigner = null;
            stickerCollectViewHolder.tvUserCount = null;
            stickerCollectViewHolder.ivRecord = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public StickerCollectViewHolder_ViewBinding(StickerCollectViewHolder stickerCollectViewHolder, View view) {
        this.f44404b = stickerCollectViewHolder;
        stickerCollectViewHolder.ivCover = (RemoteImageView) Utils.findRequiredViewAsType(view, C0906R.id.ckd, "field 'ivCover'", RemoteImageView.class);
        stickerCollectViewHolder.tvStickerName = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.djv, "field 'tvStickerName'", DmtTextView.class);
        stickerCollectViewHolder.tvDesigner = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.dax, "field 'tvDesigner'", DmtTextView.class);
        stickerCollectViewHolder.tvUserCount = (DmtTextView) Utils.findRequiredViewAsType(view, C0906R.id.dle, "field 'tvUserCount'", DmtTextView.class);
        stickerCollectViewHolder.ivRecord = (AppCompatImageView) Utils.findRequiredViewAsType(view, C0906R.id.b4a, "field 'ivRecord'", AppCompatImageView.class);
    }
}
