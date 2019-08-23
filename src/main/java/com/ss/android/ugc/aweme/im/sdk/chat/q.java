package com.ss.android.ugc.aweme.im.sdk.chat;

import android.text.InputFilter;
import android.text.Spanned;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;

public final class q implements InputFilter {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f50707a;

    /* renamed from: b  reason: collision with root package name */
    private final int f50708b;

    public q(int i) {
        this.f50708b = i;
    }

    public final CharSequence filter(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        CharSequence charSequence2 = charSequence;
        int i5 = i;
        if (PatchProxy.isSupport(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), spanned, Integer.valueOf(i3), Integer.valueOf(i4)}, this, f50707a, false, 50501, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Spanned.class, Integer.TYPE, Integer.TYPE}, CharSequence.class)) {
            return (CharSequence) PatchProxy.accessDispatch(new Object[]{charSequence2, Integer.valueOf(i), Integer.valueOf(i2), spanned, Integer.valueOf(i3), Integer.valueOf(i4)}, this, f50707a, false, 50501, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Spanned.class, Integer.TYPE, Integer.TYPE}, CharSequence.class);
        }
        int length = this.f50708b - (spanned.length() - (i4 - i3));
        if (length <= 0) {
            UIUtils.displayToast(GlobalContext.getContext(), GlobalContext.getContext().getResources().getString(C0906R.string.aur));
            return "";
        } else if (length >= i2 - i5) {
            return null;
        } else {
            int i6 = length + i5;
            if (Character.isHighSurrogate(charSequence2.charAt(i6 - 1))) {
                i6--;
                if (i6 == i5) {
                    UIUtils.displayToast(GlobalContext.getContext(), GlobalContext.getContext().getResources().getString(C0906R.string.aur));
                    return "";
                }
            }
            return charSequence2.subSequence(i5, i6);
        }
    }
}
