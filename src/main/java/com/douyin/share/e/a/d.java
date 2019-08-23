package com.douyin.share.e.a;

import android.content.Context;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public Context f23223a;

    /* renamed from: b  reason: collision with root package name */
    private List<a> f23224b = new ArrayList();

    class a {

        /* renamed from: a  reason: collision with root package name */
        public String f23225a;

        /* renamed from: b  reason: collision with root package name */
        public int f23226b;

        /* renamed from: c  reason: collision with root package name */
        public int f23227c;

        /* renamed from: d  reason: collision with root package name */
        public int f23228d;

        public a(String str, int i, int i2, int i3) {
            this.f23225a = str;
            this.f23226b = i;
            this.f23227c = i2;
            this.f23228d = i3;
        }
    }

    public final Spannable a() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i = 0;
        int i2 = 0;
        while (i < this.f23224b.size()) {
            a aVar = this.f23224b.get(i);
            String str = aVar.f23225a;
            int length = str.length() + i2;
            spannableStringBuilder.append(str);
            if (aVar.f23228d == 0) {
                spannableStringBuilder.setSpan(new c(this.f23223a.getResources().getDimensionPixelSize(aVar.f23226b), this.f23223a), i2, length, 33);
            } else {
                spannableStringBuilder.setSpan(new AbsoluteSizeSpan(this.f23223a.getResources().getDimensionPixelSize(aVar.f23226b)), i2, length, 33);
            }
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(this.f23223a.getResources().getColor(aVar.f23227c));
            StyleSpan styleSpan = new StyleSpan(aVar.f23228d);
            spannableStringBuilder.setSpan(foregroundColorSpan, i2, length, 33);
            spannableStringBuilder.setSpan(styleSpan, i2, length, 33);
            i++;
            i2 = length;
        }
        return spannableStringBuilder;
    }

    public static d a(Context context) {
        return new d(context);
    }

    private d(Context context) {
        this.f23223a = context;
    }

    public final d a(String str, int i, int i2, int i3) {
        List<a> list = this.f23224b;
        a aVar = new a(str, i, i2, i3);
        list.add(aVar);
        return this;
    }
}
