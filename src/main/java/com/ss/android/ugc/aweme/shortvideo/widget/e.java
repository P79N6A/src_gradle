package com.ss.android.ugc.aweme.shortvideo.widget;

import android.content.Context;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextUtils;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class e implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f71430a;

    /* renamed from: b  reason: collision with root package name */
    private final int f71431b;

    public e(int i) {
        this.f71431b = i;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        CharSequence charSequence2 = charSequence;
        int i5 = i;
        if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), spanned, Integer.valueOf(i3), Integer.valueOf(i4)}, this, f71430a, false, 81306, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Spanned.class, Integer.TYPE, Integer.TYPE}, CharSequence.class)) {
            return (CharSequence) PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), spanned, Integer.valueOf(i3), Integer.valueOf(i4)}, this, f71430a, false, 81306, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Spanned.class, Integer.TYPE, Integer.TYPE}, CharSequence.class);
        }
        int length = this.f71431b - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            if (!TextUtils.isEmpty(charSequence)) {
                a.b((Context) com.ss.android.ugc.aweme.framework.e.a.a(), com.ss.android.ugc.aweme.framework.e.a.a().getResources().getString(C0906R.string.c43, new Object[]{Integer.valueOf(this.f71431b)})).a();
            }
            return "";
        } else if (length >= i2 - i5) {
            return null;
        } else {
            int i6 = length + i5;
            if (Character.isHighSurrogate(charSequence2.charAt(i6 - 1))) {
                i6--;
                if (i6 == i5) {
                    a.b((Context) com.ss.android.ugc.aweme.framework.e.a.a(), com.ss.android.ugc.aweme.framework.e.a.a().getResources().getString(C0906R.string.c43, new Object[]{Integer.valueOf(this.f71431b)})).a();
                    return "";
                }
            }
            a.b((Context) com.ss.android.ugc.aweme.framework.e.a.a(), com.ss.android.ugc.aweme.framework.e.a.a().getResources().getString(C0906R.string.c43, new Object[]{Integer.valueOf(this.f71431b)})).a();
            return charSequence2.subSequence(i5, i6);
        }
    }
}
