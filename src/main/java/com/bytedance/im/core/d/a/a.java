package com.bytedance.im.core.d.a;

import android.text.TextUtils;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public String f21251a;

    /* renamed from: b  reason: collision with root package name */
    public int f21252b;

    /* renamed from: c  reason: collision with root package name */
    public String f21253c;

    /* renamed from: d  reason: collision with root package name */
    public String f21254d;

    /* renamed from: e  reason: collision with root package name */
    public String f21255e;

    /* renamed from: f  reason: collision with root package name */
    public String f21256f;
    public String g;
    public String h;

    public final String a() {
        if (TextUtils.isEmpty(this.f21251a)) {
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f21253c)) {
                sb.append(this.f21253c);
                sb.append("|");
            }
            if (!TextUtils.isEmpty(this.f21254d)) {
                sb.append(this.f21254d);
                sb.append("|");
            }
            if (!TextUtils.isEmpty(this.f21255e)) {
                sb.append(this.f21255e);
                sb.append("|");
            }
            if (!TextUtils.isEmpty(this.f21256f)) {
                sb.append(this.f21256f);
                sb.append("|");
            }
            sb.append(this.f21252b);
            this.f21251a = sb.toString();
        }
        return this.f21251a;
    }

    public final String toString() {
        return "FTSEntity {combinedKey is " + this.f21251a + " , type is " + this.f21252b + " , conversationId is " + this.f21253c + " , messageUuid is " + this.f21254d + " , userId is " + this.f21255e + " , entityId is " + this.f21256f + " , searchContent is " + this.g + " , extra is " + this.h + "}";
    }
}
