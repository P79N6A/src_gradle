package com.ss.android.ugc.aweme.account.view;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnCheckedChanged;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.h.a;
import com.ss.android.ugc.aweme.account.util.ab;

public class TermsPrivacyView extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33153a;

    /* renamed from: b  reason: collision with root package name */
    private a f33154b;
    @BindView(2131493254)
    CheckBox mCheckAgree;
    @BindView(2131493014)
    DmtTextView mDtTermPrivacy;

    public a getUpdateMainUiListener() {
        return this.f33154b;
    }

    public boolean getChecked() {
        if (!PatchProxy.isSupport(new Object[0], this, f33153a, false, 21492, new Class[0], Boolean.TYPE)) {
            return this.mCheckAgree.isChecked();
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33153a, false, 21492, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public void setUpdateMainUiListener(a aVar) {
        this.f33154b = aVar;
    }

    public TermsPrivacyView(Context context) {
        this(context, null);
    }

    private void setChecked(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f33153a, false, 21493, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f33153a, false, 21493, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.mCheckAgree.setChecked(z);
    }

    public TermsPrivacyView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @OnCheckedChanged({2131493254})
    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (PatchProxy.isSupport(new Object[]{compoundButton, Byte.valueOf(z ? (byte) 1 : 0)}, this, f33153a, false, 21494, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{compoundButton, Byte.valueOf(z)}, this, f33153a, false, 21494, new Class[]{CompoundButton.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        setChecked(z);
        if (getUpdateMainUiListener() != null) {
            getUpdateMainUiListener();
        }
    }

    public TermsPrivacyView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        ButterKnife.bind((Object) LayoutInflater.from(context).inflate(C0906R.layout.as3, this), (View) this);
        this.mCheckAgree.setButtonDrawable(new ColorDrawable(0));
        int dip2Px = (int) UIUtils.dip2Px(context, 8.0f);
        float f2 = (float) dip2Px;
        ab.a(this.mCheckAgree, dip2Px, dip2Px, f2, f2);
    }
}
