package com.ss.android.ugc.aweme.account.ui;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.bytedance.ies.dmt.ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.ui.widget.setting.Divider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class AccountManagerActivity_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32837a;

    /* renamed from: b  reason: collision with root package name */
    private AccountManagerActivity f32838b;

    /* renamed from: c  reason: collision with root package name */
    private View f32839c;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f32837a, false, 21034, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32837a, false, 21034, new Class[0], Void.TYPE);
            return;
        }
        AccountManagerActivity accountManagerActivity = this.f32838b;
        if (accountManagerActivity != null) {
            this.f32838b = null;
            accountManagerActivity.mTitle = null;
            accountManagerActivity.bindWeixinItem = null;
            accountManagerActivity.bindQQItem = null;
            accountManagerActivity.bindSinaItem = null;
            accountManagerActivity.bindJinritoutiaoItem = null;
            accountManagerActivity.bindFlipchatItem = null;
            accountManagerActivity.bindToutiaoXiGuaItem = null;
            accountManagerActivity.bindHotsoonItem = null;
            accountManagerActivity.syncDivider = null;
            this.f32839c.setOnClickListener(null);
            this.f32839c = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public AccountManagerActivity_ViewBinding(final AccountManagerActivity accountManagerActivity, View view) {
        this.f32838b = accountManagerActivity;
        accountManagerActivity.mTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.title, "field 'mTitle'", TextView.class);
        accountManagerActivity.bindWeixinItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.ay6, "field 'bindWeixinItem'", CommonItemView.class);
        accountManagerActivity.bindQQItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.axo, "field 'bindQQItem'", CommonItemView.class);
        accountManagerActivity.bindSinaItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.axw, "field 'bindSinaItem'", CommonItemView.class);
        accountManagerActivity.bindJinritoutiaoItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.awb, "field 'bindJinritoutiaoItem'", CommonItemView.class);
        accountManagerActivity.bindFlipchatItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.aw3, "field 'bindFlipchatItem'", CommonItemView.class);
        accountManagerActivity.bindToutiaoXiGuaItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.awc, "field 'bindToutiaoXiGuaItem'", CommonItemView.class);
        accountManagerActivity.bindHotsoonItem = (CommonItemView) Utils.findRequiredViewAsType(view, C0906R.id.aw6, "field 'bindHotsoonItem'", CommonItemView.class);
        accountManagerActivity.syncDivider = (Divider) Utils.findRequiredViewAsType(view, C0906R.id.a5u, "field 'syncDivider'", Divider.class);
        View findRequiredView = Utils.findRequiredView(view, C0906R.id.ix, "method 'back'");
        this.f32839c = findRequiredView;
        findRequiredView.setOnClickListener(new DebouncingOnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32840a;

            public final void doClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f32840a, false, 21035, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f32840a, false, 21035, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                accountManagerActivity.back();
            }
        });
    }
}
