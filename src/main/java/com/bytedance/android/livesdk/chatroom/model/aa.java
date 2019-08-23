package com.bytedance.android.livesdk.chatroom.model;

import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;

public final class aa {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11076a;
    @SerializedName("high_light_color")

    /* renamed from: b  reason: collision with root package name */
    public String f11077b;
    @SerializedName("contents")

    /* renamed from: c  reason: collision with root package name */
    public List<z> f11078c;

    public final CharSequence a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f11076a, false, 5119, new Class[0], CharSequence.class)) {
            return (CharSequence) PatchProxy.accessDispatch(new Object[0], this, f11076a, false, 5119, new Class[0], CharSequence.class);
        } else if (this.f11078c == null || this.f11078c.size() <= 0) {
            return "";
        } else {
            int i = -1;
            if (this.f11077b != null) {
                try {
                    z = true;
                    i = Color.parseColor(this.f11077b);
                } catch (IllegalArgumentException unused) {
                }
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(i);
            for (z next : this.f11078c) {
                if (next != null && !TextUtils.isEmpty(next.f11189a)) {
                    spannableStringBuilder.append(next.f11189a);
                    if (z && next.f11190b) {
                        spannableStringBuilder.setSpan(foregroundColorSpan, spannableStringBuilder.length() - next.f11189a.length(), spannableStringBuilder.length(), 33);
                    }
                }
            }
            return spannableStringBuilder;
        }
    }
}
