package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.shortvideo.widget.KTVView;

public class MusicDragView_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66648a;

    /* renamed from: b  reason: collision with root package name */
    private MusicDragView f66649b;

    /* renamed from: c  reason: collision with root package name */
    private View f66650c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f66648a, false, 76106, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66648a, false, 76106, new Class[0], Void.TYPE);
            return;
        }
        MusicDragView musicDragView = this.f66649b;
        if (musicDragView != null) {
            this.f66649b = null;
            musicDragView.mKTVView = null;
            musicDragView.mTextViewTimeStart = null;
            musicDragView.mTextViewTotalTime = null;
            musicDragView.cutMusicLayout = null;
            musicDragView.slideContainer = null;
            this.f66650c.setOnClickListener(null);
            this.f66650c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MusicDragView_ViewBinding(final MusicDragView musicDragView, View view) {
        this.f66649b = musicDragView;
        musicDragView.mKTVView = (KTVView) Utils.findRequiredViewAsType(view, C0906R.id.b78, "field 'mKTVView'", KTVView.class);
        musicDragView.mTextViewTimeStart = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.djg, "field 'mTextViewTimeStart'", TextView.class);
        musicDragView.mTextViewTotalTime = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dbd, "field 'mTextViewTotalTime'", TextView.class);
        musicDragView.cutMusicLayout = (DmtCutMusicLayout) Utils.findRequiredViewAsType(view, C0906R.id.a27, "field 'cutMusicLayout'", DmtCutMusicLayout.class);
        musicDragView.slideContainer = (RelativeLayout) Utils.findRequiredViewAsType(view, C0906R.id.crw, "field 'slideContainer'", RelativeLayout.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.b0e, "method 'next'");
        this.f66650c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f66651a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f66651a, false, 76107, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f66651a, false, 76107, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicDragView.next();
            }
        });
        musicDragView.mTimeString = view.getContext().getResources().getString(C0906R.string.cnl);
    }
}
