package com.ss.android.ugc.aweme.festival.christmas.view;

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

public class FeedStickerTagView_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47282a;

    /* renamed from: b  reason: collision with root package name */
    private FeedStickerTagView f47283b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f47282a, false, 43947, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f47282a, false, 43947, new Class[0], Void.TYPE);
            return;
        }
        FeedStickerTagView feedStickerTagView = this.f47283b;
        if (feedStickerTagView != null) {
            this.f47283b = null;
            feedStickerTagView.mStickerName = null;
            feedStickerTagView.mFestivalName = null;
            feedStickerTagView.mIvRightArrow = null;
            feedStickerTagView.mPlaceHolderView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public FeedStickerTagView_ViewBinding(FeedStickerTagView feedStickerTagView, View view) {
        this.f47283b = feedStickerTagView;
        feedStickerTagView.mStickerName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.djv, "field 'mStickerName'", TextView.class);
        feedStickerTagView.mFestivalName = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dbq, "field 'mFestivalName'", TextView.class);
        feedStickerTagView.mIvRightArrow = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.b4i, "field 'mIvRightArrow'", ImageView.class);
        feedStickerTagView.mPlaceHolderView = Utils.findRequiredView(view, C0906R.id.byf, "field 'mPlaceHolderView'");
    }
}
