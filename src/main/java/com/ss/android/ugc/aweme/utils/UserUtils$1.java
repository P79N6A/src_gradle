package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.support.v4.view.AccessibilityDelegateCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.profile.model.User;

public class UserUtils$1 extends AccessibilityDelegateCompat {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75462a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ User f75463b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ Context f75464c;

    public UserUtils$1(User user, Context context) {
        this.f75463b = user;
        this.f75464c = context;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        if (PatchProxy.isSupport(new Object[]{view, accessibilityNodeInfoCompat}, this, f75462a, false, 88682, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, accessibilityNodeInfoCompat}, this, f75462a, false, 88682, new Class[]{View.class, AccessibilityNodeInfoCompat.class}, Void.TYPE);
            return;
        }
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
        if (!TextUtils.isEmpty(this.f75463b.getRemarkName())) {
            view.setContentDescription(this.f75464c.getResources().getString(C0906R.string.bc, new Object[]{this.f75463b.getRemarkName()}));
        } else if (!TextUtils.isEmpty(this.f75463b.getNickname())) {
            view.setContentDescription(this.f75464c.getResources().getString(C0906R.string.bc, new Object[]{this.f75463b.getNickname()}));
        }
        accessibilityNodeInfoCompat.setClassName(DmtTextView.class.getName());
    }
}
