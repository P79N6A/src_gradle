package com.ss.android.ugc.aweme.commercialize;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class PoiCouponInputActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38434a;

    /* renamed from: b  reason: collision with root package name */
    private PoiCouponInputActivity f38435b;

    /* renamed from: c  reason: collision with root package name */
    private View f38436c;

    /* renamed from: d  reason: collision with root package name */
    private TextWatcher f38437d;

    /* renamed from: e  reason: collision with root package name */
    private View f38438e;

    /* renamed from: f  reason: collision with root package name */
    private View f38439f;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f38434a, false, 30351, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38434a, false, 30351, new Class[0], Void.TYPE);
            return;
        }
        PoiCouponInputActivity poiCouponInputActivity = this.f38435b;
        if (poiCouponInputActivity != null) {
            this.f38435b = null;
            poiCouponInputActivity.titleBar = null;
            poiCouponInputActivity.input = null;
            poiCouponInputActivity.clear = null;
            poiCouponInputActivity.confirm = null;
            ((TextView) this.f38436c).removeTextChangedListener(this.f38437d);
            this.f38437d = null;
            this.f38436c = null;
            this.f38438e.setOnClickListener(null);
            this.f38438e = null;
            this.f38439f.setOnClickListener(null);
            this.f38439f = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PoiCouponInputActivity_ViewBinding(final PoiCouponInputActivity poiCouponInputActivity, View view) {
        this.f38435b = poiCouponInputActivity;
        poiCouponInputActivity.titleBar = (TextTitleBar) Utils.findRequiredViewAsType(view, C0906R.id.d3m, "field 'titleBar'", TextTitleBar.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.aup, "field 'input' and method 'onInputChanged'");
        poiCouponInputActivity.input = (EditText) Utils.castView(findRequiredView, C0906R.id.aup, "field 'input'", EditText.class);
        this.f38436c = findRequiredView;
        this.f38437d = new TextWatcher() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38440a;

            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                if (PatchProxy.isSupport(new Object[]{editable}, this, f38440a, false, 30352, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f38440a, false, 30352, new Class[]{Editable.class}, Void.TYPE);
                    return;
                }
                poiCouponInputActivity.onInputChanged();
            }
        };
        ((TextView) findRequiredView).addTextChangedListener(this.f38437d);
        View findRequiredView2 = Utils.findRequiredView(view, C0906R.id.t3, "field 'clear' and method 'onClearClicked'");
        poiCouponInputActivity.clear = findRequiredView2;
        this.f38438e = findRequiredView2;
        findRequiredView2.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38443a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f38443a, false, 30353, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f38443a, false, 30353, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                poiCouponInputActivity.onClearClicked();
            }
        });
        View findRequiredView3 = Utils.findRequiredView(view, C0906R.id.y0, "field 'confirm' and method 'onConfirmClicked'");
        poiCouponInputActivity.confirm = (ImageView) Utils.castView(findRequiredView3, C0906R.id.y0, "field 'confirm'", ImageView.class);
        this.f38439f = findRequiredView3;
        findRequiredView3.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f38446a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f38446a, false, 30354, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f38446a, false, 30354, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                poiCouponInputActivity.onConfirmClicked();
            }
        });
    }
}
