package com.ss.android.ugc.aweme.shortvideo.festival;

import android.text.DynamicLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.challenge.a;
import java.util.regex.Pattern;

public final class i extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f67702b;
    private static final String g = com.ss.android.ugc.aweme.challenge.ui.i.class.getSimpleName();

    /* renamed from: c  reason: collision with root package name */
    public boolean f67703c;

    /* renamed from: d  reason: collision with root package name */
    private TextPaint f67704d;

    /* renamed from: e  reason: collision with root package name */
    private int f67705e;

    /* renamed from: f  reason: collision with root package name */
    private int f67706f = 4;
    private boolean h;
    private String i;

    private int a(String str) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{str}, this, f67702b, false, 77229, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f67702b, false, 77229, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (TextUtils.isEmpty(str)) {
            return 0;
        } else {
            int i2 = 0;
            for (char c2 : str.toCharArray()) {
                if (PatchProxy.isSupport(new Object[]{Character.valueOf(c2)}, this, f67702b, false, 77230, new Class[]{Character.TYPE}, Boolean.TYPE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(new Object[]{Character.valueOf(c2)}, this, f67702b, false, 77230, new Class[]{Character.TYPE}, Boolean.TYPE)).booleanValue();
                } else {
                    z = Pattern.compile("[一-龥]").matcher(String.valueOf(c2)).matches();
                }
                if (z) {
                    i2++;
                }
            }
            return i2;
        }
    }

    public final SpannableString a(SpannableString spannableString) {
        SpannableString spannableString2 = spannableString;
        int i2 = 1;
        if (PatchProxy.isSupport(new Object[]{spannableString2}, this, f67702b, false, 77227, new Class[]{SpannableString.class}, SpannableString.class)) {
            return (SpannableString) PatchProxy.accessDispatch(new Object[]{spannableString2}, this, f67702b, false, 77227, new Class[]{SpannableString.class}, SpannableString.class);
        } else if (!this.h) {
            return spannableString2;
        } else {
            DynamicLayout dynamicLayout = new DynamicLayout(spannableString.toString(), this.f67704d, this.f67705e, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true);
            if (dynamicLayout.getLineCount() <= this.f67706f) {
                return spannableString2;
            }
            this.f67703c = true;
            TextPaint textPaint = this.f67704d;
            float measureText = textPaint.measureText("..." + this.i) + UIUtils.dip2Px(d.a(), 13.0f) + UIUtils.dip2Px(d.a(), 12.0f);
            int lineStart = dynamicLayout.getLineStart(this.f67706f - 1);
            int lineStart2 = dynamicLayout.getLineStart(this.f67706f) - 1;
            int i3 = (int) (((float) this.f67705e) - measureText);
            float measureText2 = this.f67704d.measureText(spannableString2.subSequence(lineStart, lineStart2).toString());
            float f2 = (float) i3;
            if (measureText2 > f2) {
                float f3 = measureText2 - f2;
                while (i2 < 15 && this.f67704d.measureText(spannableString2.subSequence(lineStart2 - i2, lineStart2).toString()) <= f3) {
                    i2++;
                }
            } else {
                i2 = 0;
            }
            if (!com.ss.android.g.a.a()) {
                int a2 = a(spannableString2.subSequence(lineStart2 - i2, lineStart2).toString());
                return new SpannableString(spannableString2.subSequence(0, lineStart2 - ((i2 + i2) - a2)) + "...");
            }
            return new SpannableString(spannableString2.subSequence(0, lineStart2 - i2) + "...");
        }
    }

    public i(TextPaint textPaint, int i2, boolean z, String str) {
        this.f67704d = textPaint;
        this.f67705e = i2;
        this.i = str;
        this.h = z;
    }
}
