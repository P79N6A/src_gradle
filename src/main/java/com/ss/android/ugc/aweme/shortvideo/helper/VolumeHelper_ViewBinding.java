package com.ss.android.ugc.aweme.shortvideo.helper;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.SeekBar;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class VolumeHelper_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68112a;

    /* renamed from: b  reason: collision with root package name */
    private VolumeHelper f68113b;

    /* renamed from: c  reason: collision with root package name */
    private View f68114c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f68112a, false, 77504, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68112a, false, 77504, new Class[0], Void.TYPE);
            return;
        }
        VolumeHelper volumeHelper = this.f68113b;
        if (volumeHelper != null) {
            this.f68113b = null;
            volumeHelper.mChangeLayout = null;
            volumeHelper.mVoiceSeekBar = null;
            volumeHelper.mMusicSeekBar = null;
            volumeHelper.mPeopleVoiceTv = null;
            volumeHelper.mMusicTv = null;
            if (this.f68114c != null) {
                this.f68114c.setOnClickListener(null);
                this.f68114c = null;
            }
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public VolumeHelper_ViewBinding(final VolumeHelper volumeHelper, View view) {
        this.f68113b = volumeHelper;
        volumeHelper.mChangeLayout = Utils.findRequiredView(view, C0906R.id.bfx, "field 'mChangeLayout'");
        volumeHelper.mVoiceSeekBar = (SeekBar) Utils.findRequiredViewAsType(view, C0906R.id.cmm, "field 'mVoiceSeekBar'", SeekBar.class);
        volumeHelper.mMusicSeekBar = (SeekBar) Utils.findRequiredViewAsType(view, C0906R.id.cmn, "field 'mMusicSeekBar'", SeekBar.class);
        volumeHelper.mPeopleVoiceTv = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dg1, "field 'mPeopleVoiceTv'", TextView.class);
        volumeHelper.mMusicTv = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dg2, "field 'mMusicTv'", TextView.class);
        View findViewById = view.findViewById(C0906R.id.azq);
        if (findViewById != null) {
            this.f68114c = findViewById;
            findViewById.setOnClickListener(new DebouncingOnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f68115a;

                public final void doClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f68115a, false, 77505, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f68115a, false, 77505, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    volumeHelper.onVolumeChange();
                }
            });
        }
    }
}
