package com.ss.android.ugc.aweme.promote;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class PromoteProgramDialog_ViewBinding implements Unbinder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63230a;

    /* renamed from: b  reason: collision with root package name */
    private PromoteProgramDialog f63231b;

    @CallSuper
    public void unbind() {
        if (PatchProxy.isSupport(new Object[0], this, f63230a, false, 70167, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f63230a, false, 70167, new Class[0], Void.TYPE);
            return;
        }
        PromoteProgramDialog promoteProgramDialog = this.f63231b;
        if (promoteProgramDialog != null) {
            this.f63231b = null;
            promoteProgramDialog.mTvTitle = null;
            promoteProgramDialog.mTvMsg = null;
            promoteProgramDialog.mTvProtocol = null;
            promoteProgramDialog.mBtnJoin = null;
            promoteProgramDialog.mBtnNext = null;
            promoteProgramDialog.mRootView = null;
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }

    @UiThread
    public PromoteProgramDialog_ViewBinding(PromoteProgramDialog promoteProgramDialog, View view) {
        this.f63231b = promoteProgramDialog;
        promoteProgramDialog.mTvTitle = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dkk, "field 'mTvTitle'", TextView.class);
        promoteProgramDialog.mTvMsg = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.deu, "field 'mTvMsg'", TextView.class);
        promoteProgramDialog.mTvProtocol = (TextView) Utils.findRequiredViewAsType(view, C0906R.id.dgw, "field 'mTvProtocol'", TextView.class);
        promoteProgramDialog.mBtnJoin = Utils.findRequiredView(view, C0906R.id.oa, "field 'mBtnJoin'");
        promoteProgramDialog.mBtnNext = Utils.findRequiredView(view, C0906R.id.oo, "field 'mBtnNext'");
        promoteProgramDialog.mRootView = Utils.findRequiredView(view, C0906R.id.chu, "field 'mRootView'");
        promoteProgramDialog.mStrRegular = view.getContext().getResources().getString(C0906R.string.bsn);
    }
}
