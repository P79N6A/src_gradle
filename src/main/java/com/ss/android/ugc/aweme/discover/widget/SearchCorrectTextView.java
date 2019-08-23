package com.ss.android.ugc.aweme.discover.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.Nullable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class SearchCorrectTextView extends DmtTextView {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43316a;

    /* renamed from: b  reason: collision with root package name */
    private String f43317b;

    /* renamed from: c  reason: collision with root package name */
    private String f43318c;

    /* renamed from: d  reason: collision with root package name */
    private int f43319d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f43320e;

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f43316a, false, 38281, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f43316a, false, 38281, new Class[0], Void.TYPE);
            return;
        }
        if (getLayout().getEllipsisCount(getLineCount() - 1) > 0) {
            CharSequence ellipsize = TextUtils.ellipsize(this.f43318c, getPaint(), (float) ((int) (((float) getMeasuredWidth()) - getPaint().measureText(this.f43317b))), TextUtils.TruncateAt.END);
            String str = this.f43317b;
            setSpanableString(String.format(str, new Object[]{"“" + ellipsize + "”"}));
        }
    }

    public SearchCorrectTextView(Context context) {
        this(context, null);
    }

    private void setSpanableString(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f43316a, false, 38282, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f43316a, false, 38282, new Class[]{String.class}, Void.TYPE);
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        if (this.f43319d != -1) {
            int indexOf = str.indexOf("“");
            int lastIndexOf = str.lastIndexOf("”") + 1;
            spannableStringBuilder.setSpan(new ForegroundColorSpan(this.f43319d), indexOf, lastIndexOf, 33);
            spannableStringBuilder.setSpan(new StyleSpan(1), indexOf, lastIndexOf, 33);
        }
        setText(spannableStringBuilder);
    }

    public SearchCorrectTextView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43319d = -1;
        setMaxLines(1);
        setEllipsize(TextUtils.TruncateAt.END);
    }

    public void onMeasure(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f43316a, false, 38279, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f43316a, false, 38279, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onMeasure(i, i2);
        this.f43320e = true;
        a();
    }

    public final void a(int i, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(C0906R.string.c28), str2}, this, f43316a, false, 38280, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(C0906R.string.c28), str2}, this, f43316a, false, 38280, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        a(C0906R.string.c28, str2, -1);
    }

    public final void a(int i, String str, int i2) {
        int i3 = i;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2)}, this, f43316a, false, 38278, new Class[]{Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), str2, Integer.valueOf(i2)}, this, f43316a, false, 38278, new Class[]{Integer.TYPE, String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f43317b = getResources().getString(i);
        this.f43318c = str2;
        this.f43319d = i2;
        Resources resources = getResources();
        setSpanableString(resources.getString(i, new Object[]{"“" + str2 + "”"}));
        if (this.f43320e) {
            a();
        }
    }
}
