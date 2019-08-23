package com.ss.android.ugc.aweme.shortvideo.ar.text;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.vesdk.model.BefTextLayout;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65714a;

    /* renamed from: b  reason: collision with root package name */
    TextPaint f65715b = new TextPaint();

    /* renamed from: c  reason: collision with root package name */
    public int f65716c;

    /* renamed from: d  reason: collision with root package name */
    public int f65717d;

    /* renamed from: e  reason: collision with root package name */
    int f65718e;

    /* renamed from: f  reason: collision with root package name */
    int f65719f;
    long g;
    int h;
    float i;
    public int j;
    private long k;
    private String l;

    k(BefTextLayout befTextLayout) {
        this.f65716c = befTextLayout.getLineWidth();
        this.f65718e = befTextLayout.getLineCount();
        this.i = befTextLayout.getLineHeight();
        this.f65719f = befTextLayout.getSplit();
        this.h = befTextLayout.getCharSize();
        this.g = befTextLayout.getBackColor();
        this.k = befTextLayout.getTextColor();
        this.l = befTextLayout.getFamilyName();
        this.f65715b.setAntiAlias(true);
        this.f65715b.setTextSize((float) befTextLayout.getCharSize());
        this.f65715b.setTypeface(Typeface.create(this.l, 0));
        this.f65715b.setColor(((((int) this.k) >> 8) & 16777215) | ((((int) this.k) << 24) & -16777216));
        if (Build.VERSION.SDK_INT >= 21) {
            this.f65715b.setLetterSpacing((float) befTextLayout.getLetterSpacing());
        }
        this.f65715b.setTextAlign(Paint.Align.LEFT);
    }
}
