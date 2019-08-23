package com.ss.android.ugc.aweme.music.ui;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class MusicTabView_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56648a;

    /* renamed from: b  reason: collision with root package name */
    private MusicTabView f56649b;

    public final void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f56648a, false, 60525, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56648a, false, 60525, new Class[0], Void.TYPE);
            return;
        }
        MusicTabView musicTabView = this.f56649b;
        if (musicTabView != null) {
            this.f56649b = null;
            musicTabView.tvCollection = null;
            musicTabView.tvHot = null;
            musicTabView.tvLocalMusic = null;
            musicTabView.tvIndicatorRecommended = null;
            musicTabView.tvIndicatorFavorites = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MusicTabView_ViewBinding(MusicTabView musicTabView, View view) {
        this.f56649b = musicTabView;
        musicTabView.tvCollection = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.d_p, "field 'tvCollection'", TextView.class);
        musicTabView.tvHot = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dcx, "field 'tvHot'", TextView.class);
        musicTabView.tvLocalMusic = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.de7, "field 'tvLocalMusic'", TextView.class);
        musicTabView.tvIndicatorRecommended = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dda, "field 'tvIndicatorRecommended'", TextView.class);
        musicTabView.tvIndicatorFavorites = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dd_, "field 'tvIndicatorFavorites'", TextView.class);
    }
}
