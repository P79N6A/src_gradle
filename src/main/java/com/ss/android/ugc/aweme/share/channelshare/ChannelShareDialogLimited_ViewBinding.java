package com.ss.android.ugc.aweme.share.channelshare;

import android.support.annotation.UiThread;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.share.basic.sharedialog.BasicShareDialog_ViewBinding;

public class ChannelShareDialogLimited_ViewBinding extends BasicShareDialog_ViewBinding {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f64953b;

    /* renamed from: c  reason: collision with root package name */
    private ChannelShareDialogLimited f64954c;

    /* renamed from: d  reason: collision with root package name */
    private View f64955d;

    /* renamed from: e  reason: collision with root package name */
    private View f64956e;

    /* renamed from: f  reason: collision with root package name */
    private View f64957f;

    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f64953b, false, 73449, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64953b, false, 73449, new Class[0], Void.TYPE);
            return;
        }
        ChannelShareDialogLimited channelShareDialogLimited = this.f64954c;
        if (channelShareDialogLimited != null) {
            this.f64954c = null;
            channelShareDialogLimited.mShareButton = null;
            channelShareDialogLimited.mShareButtonTxt = null;
            channelShareDialogLimited.mWebViewContainer = null;
            this.f64955d.setOnClickListener(null);
            this.f64955d = null;
            this.f64956e.setOnClickListener(null);
            this.f64956e = null;
            this.f64957f.setOnClickListener(null);
            this.f64957f = null;
            super.unbind();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public ChannelShareDialogLimited_ViewBinding(final ChannelShareDialogLimited channelShareDialogLimited, View view) {
        super(channelShareDialogLimited, view);
        this.f64954c = channelShareDialogLimited;
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.cp_, "field 'mShareButton' and method 'onContinueButtonClick'");
        channelShareDialogLimited.mShareButton = findRequiredView;
        this.f64955d = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64958a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f64958a, false, 73450, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f64958a, false, 73450, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                channelShareDialogLimited.onContinueButtonClick();
            }
        });
        channelShareDialogLimited.mShareButtonTxt = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.cpa, "field 'mShareButtonTxt'", TextView.class);
        channelShareDialogLimited.mWebViewContainer = (FrameLayout) Utils.findRequiredViewAsType(view, C0906R.id.dx7, "field 'mWebViewContainer'", FrameLayout.class);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.a89, "method 'onShareDuoShanClick'");
        this.f64956e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64961a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f64961a, false, 73451, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f64961a, false, 73451, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                channelShareDialogLimited.onShareDuoShanClick();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.ti, "method 'onCloseClick'");
        this.f64957f = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64964a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f64964a, false, 73452, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f64964a, false, 73452, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                channelShareDialogLimited.onCloseClick();
            }
        });
    }
}
