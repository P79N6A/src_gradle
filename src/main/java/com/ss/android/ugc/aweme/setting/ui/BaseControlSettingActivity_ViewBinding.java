package com.ss.android.ugc.aweme.setting.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class BaseControlSettingActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64107a;

    /* renamed from: b  reason: collision with root package name */
    private BaseControlSettingActivity f64108b;

    /* renamed from: c  reason: collision with root package name */
    private View f64109c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f64107a, false, 72402, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f64107a, false, 72402, new Class[0], Void.TYPE);
            return;
        }
        BaseControlSettingActivity baseControlSettingActivity = this.f64108b;
        if (baseControlSettingActivity != null) {
            this.f64108b = null;
            baseControlSettingActivity.mTitle = null;
            baseControlSettingActivity.mEveryoneItem = null;
            baseControlSettingActivity.mFriendsItem = null;
            baseControlSettingActivity.mOffItem = null;
            this.f64109c.setOnClickListener(null);
            this.f64109c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public BaseControlSettingActivity_ViewBinding(final BaseControlSettingActivity baseControlSettingActivity, View view) {
        this.f64108b = baseControlSettingActivity;
        baseControlSettingActivity.mTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.title, "field 'mTitle'", TextView.class);
        baseControlSettingActivity.mEveryoneItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.aap, "field 'mEveryoneItem'", CommonItemView.class);
        baseControlSettingActivity.mFriendsItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.ais, "field 'mFriendsItem'", CommonItemView.class);
        baseControlSettingActivity.mOffItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.bu_, "field 'mOffItem'", CommonItemView.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ix, "method 'back'");
        this.f64109c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f64110a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f64110a, false, 72403, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f64110a, false, 72403, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                baseControlSettingActivity.back();
            }
        });
    }
}
