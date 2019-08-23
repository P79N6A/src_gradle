package com.ss.android.ugc.aweme.account.login.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class CountryListActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32441a;

    /* renamed from: b  reason: collision with root package name */
    private CountryListActivity f32442b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f32441a, false, 20562, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32441a, false, 20562, new Class[0], Void.TYPE);
            return;
        }
        CountryListActivity countryListActivity = this.f32442b;
        if (countryListActivity != null) {
            this.f32442b = null;
            countryListActivity.etSearch = null;
            countryListActivity.txtSearch = null;
            countryListActivity.back = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public CountryListActivity_ViewBinding(CountryListActivity countryListActivity, View view) {
        this.f32442b = countryListActivity;
        countryListActivity.etSearch = (EditText) Utils.findRequiredViewAsType(view, C0906R.id.cl9, "field 'etSearch'", EditText.class);
        countryListActivity.txtSearch = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.clx, "field 'txtSearch'", TextView.class);
        countryListActivity.back = (ImageView) Utils.findRequiredViewAsType(view, C0906R.id.ix, "field 'back'", ImageView.class);
    }
}
