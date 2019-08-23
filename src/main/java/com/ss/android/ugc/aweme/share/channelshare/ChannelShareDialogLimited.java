package com.ss.android.ugc.aweme.share.channelshare;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.share.basic.sharedialog.BasicShareDialog;
import com.ss.android.ugc.aweme.share.cl;

public class ChannelShareDialogLimited extends BasicShareDialog<Activity> {

    /* renamed from: d  reason: collision with root package name */
    public static ChangeQuickRedirect f64948d;

    /* renamed from: e  reason: collision with root package name */
    public View f64949e;

    /* renamed from: f  reason: collision with root package name */
    public a f64950f;
    private cl g;
    private String h;
    @BindView(2131497082)
    View mShareButton;
    @BindView(2131497083)
    TextView mShareButtonTxt;
    @BindView(2131498613)
    FrameLayout mWebViewContainer;

    public interface a {
        void a();

        void b();
    }

    public final int a() {
        return C0906R.style.rb;
    }

    public void onTouchOutside() {
    }

    @OnClick({2131493574})
    public void onCloseClick() {
        if (PatchProxy.isSupport(new Object[0], this, f64948d, false, 73447, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64948d, false, 73447, new Class[0], Void.TYPE);
            return;
        }
        dismiss();
    }

    @OnClick({2131497082})
    public void onContinueButtonClick() {
        if (PatchProxy.isSupport(new Object[0], this, f64948d, false, 73445, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64948d, false, 73445, new Class[0], Void.TYPE);
            return;
        }
        if (this.f64950f != null) {
            this.f64950f.a();
        }
        dismiss();
    }

    @OnClick({2131494069})
    public void onShareDuoShanClick() {
        if (PatchProxy.isSupport(new Object[0], this, f64948d, false, 73446, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64948d, false, 73446, new Class[0], Void.TYPE);
            return;
        }
        if (this.f64950f != null) {
            this.f64950f.b();
        }
        dismiss();
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f64948d, false, 73444, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64948d, false, 73444, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        this.mWebViewContainer.addView(this.f64949e);
        this.mShareButtonTxt.setText(this.f64713b.getResources().getString(C0906R.string.c6_, new Object[]{this.g.f64987b}));
        if (TextUtils.equals(this.h, "weixin") || TextUtils.equals(this.h, "weixin_moments")) {
            this.mShareButton.setBackground(com.ss.android.ugc.bytex.a.a.a.a(this.f64713b.getResources(), 2130838330));
            this.mShareButtonTxt.setCompoundDrawablesWithIntrinsicBounds(com.ss.android.ugc.bytex.a.a.a.a(this.f64713b.getResources(), 2130839316), null, null, null);
        } else if (TextUtils.equals(this.h, "qq") || TextUtils.equals(this.h, "qzone")) {
            this.mShareButton.setBackground(com.ss.android.ugc.bytex.a.a.a.a(this.f64713b.getResources(), 2130838329));
            this.mShareButtonTxt.setCompoundDrawablesWithIntrinsicBounds(com.ss.android.ugc.bytex.a.a.a.a(this.f64713b.getResources(), 2130839307), null, null, null);
        } else if (TextUtils.equals(this.h, "weibo")) {
            this.mShareButton.setBackground(com.ss.android.ugc.bytex.a.a.a.a(this.f64713b.getResources(), 2130838331));
            this.mShareButtonTxt.setCompoundDrawablesWithIntrinsicBounds(com.ss.android.ugc.bytex.a.a.a.a(this.f64713b.getResources(), 2130839317), null, null, null);
        } else {
            this.mShareButtonTxt.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f64951a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f64951a, false, 73448, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f64951a, false, 73448, new Class[0], Void.TYPE);
                        return;
                    }
                    ChannelShareDialogLimited.this.dismiss();
                }
            });
        }
    }

    public ChannelShareDialogLimited(@NonNull Activity activity, @NonNull String str, @NonNull cl clVar) {
        super(activity);
        this.h = str;
        this.g = clVar;
        setCanceledOnTouchOutside(false);
    }
}
