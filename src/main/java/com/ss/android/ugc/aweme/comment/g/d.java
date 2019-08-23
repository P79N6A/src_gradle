package com.ss.android.ugc.aweme.comment.g;

import android.annotation.SuppressLint;
import android.os.Build;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.utils.ey;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0007¨\u0006\u0003"}, d2 = {"adjustRtlInList", "", "Landroid/widget/TextView;", "main_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36461a;

    @SuppressLint({"RtlHardcoded"})
    public static final void a(@Nullable TextView textView) {
        int i;
        TextView textView2 = textView;
        if (PatchProxy.isSupport(new Object[]{textView2}, null, f36461a, true, 27790, new Class[]{TextView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{textView2}, null, f36461a, true, 27790, new Class[]{TextView.class}, Void.TYPE);
            return;
        }
        if (textView2 != null && Build.VERSION.SDK_INT >= 17) {
            boolean a2 = ey.a(textView.getContext());
            textView2.setTextDirection(2);
            if (a2) {
                i = 5;
            } else {
                i = 3;
            }
            textView2.setGravity(i);
        }
    }
}
