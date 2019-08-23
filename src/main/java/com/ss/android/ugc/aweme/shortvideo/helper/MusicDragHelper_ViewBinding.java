package com.ss.android.ugc.aweme.shortvideo.helper;

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
import com.ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicLayout;
import com.ss.android.ugc.aweme.shortvideo.widget.KTVView;

public class MusicDragHelper_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68096a;

    /* renamed from: b  reason: collision with root package name */
    private MusicDragHelper f68097b;

    /* renamed from: c  reason: collision with root package name */
    private View f68098c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f68096a, false, 77484, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68096a, false, 77484, new Class[0], Void.TYPE);
            return;
        }
        MusicDragHelper musicDragHelper = this.f68097b;
        if (musicDragHelper != null) {
            this.f68097b = null;
            musicDragHelper.mKTVView = null;
            musicDragHelper.mTextViewTimeStart = null;
            musicDragHelper.mTextViewTotalTime = null;
            musicDragHelper.cutMusicLayout = null;
            musicDragHelper.slideContainer = null;
            this.f68098c.setOnClickListener(null);
            this.f68098c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public MusicDragHelper_ViewBinding(final MusicDragHelper musicDragHelper, View view) {
        this.f68097b = musicDragHelper;
        musicDragHelper.mKTVView = (KTVView) Utils.findRequiredViewAsType(view, C0906R.id.b78, "field 'mKTVView'", KTVView.class);
        musicDragHelper.mTextViewTimeStart = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.djg, "field 'mTextViewTimeStart'", TextView.class);
        musicDragHelper.mTextViewTotalTime = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dbd, "field 'mTextViewTotalTime'", TextView.class);
        musicDragHelper.cutMusicLayout = (DmtCutMusicLayout) Utils.findRequiredViewAsType(view, C0906R.id.a27, "field 'cutMusicLayout'", DmtCutMusicLayout.class);
        musicDragHelper.slideContainer = (RelativeLayout) Utils.findRequiredViewAsType(view, C0906R.id.crw, "field 'slideContainer'", RelativeLayout.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.b0e, "method 'next'");
        this.f68098c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f68099a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f68099a, false, 77485, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f68099a, false, 77485, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                musicDragHelper.next();
            }
        });
    }
}
