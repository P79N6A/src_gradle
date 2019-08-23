package com.bytedance.ies.dmt.ui.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.StringRes;
import android.text.TextUtils;
import android.view.View;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public Drawable f20487a;

    /* renamed from: b  reason: collision with root package name */
    public CharSequence f20488b;

    /* renamed from: c  reason: collision with root package name */
    public CharSequence f20489c;

    /* renamed from: d  reason: collision with root package name */
    public a f20490d;

    /* renamed from: e  reason: collision with root package name */
    public int f20491e;

    /* renamed from: f  reason: collision with root package name */
    public String f20492f;
    public View.OnClickListener g;
    public String h;
    public View.OnClickListener i;
    public boolean j;
    public boolean k;
    public boolean l;
    boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public int r;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public c f20493a = new c();

        /* renamed from: b  reason: collision with root package name */
        private Context f20494b;

        public final a a(boolean z) {
            this.f20493a.m = true;
            return this;
        }

        public final a b(boolean z) {
            this.f20493a.n = true;
            return this;
        }

        public final a d(int i) {
            this.f20493a.r = i;
            return this;
        }

        public final a a(CharSequence charSequence) {
            this.f20493a.f20489c = charSequence;
            this.f20493a.l = true;
            return this;
        }

        public final a b(String str) {
            this.f20493a.f20489c = str;
            this.f20493a.l = true;
            return this;
        }

        public final a c(@StringRes int i) {
            this.f20493a.f20489c = this.f20494b.getString(i);
            this.f20493a.l = true;
            return this;
        }

        public a(Context context) {
            this.f20494b = context.getApplicationContext();
        }

        public final a a(@DrawableRes int i) {
            this.f20493a.f20487a = com.ss.android.ugc.bytex.a.a.a.a(this.f20494b.getResources(), i);
            this.f20493a.j = true;
            return this;
        }

        public final a b(@StringRes int i) {
            this.f20493a.f20488b = this.f20494b.getString(i);
            if (!TextUtils.isEmpty(this.f20493a.f20488b)) {
                this.f20493a.k = true;
                return this;
            }
            throw new IllegalArgumentException("title should not be empty string!");
        }

        public final a a(String str) {
            this.f20493a.f20488b = str;
            this.f20493a.k = true;
            return this;
        }

        public final a a(a aVar, @StringRes int i, @NonNull View.OnClickListener onClickListener) {
            this.f20493a.f20490d = aVar;
            this.f20493a.f20492f = this.f20494b.getString(i);
            this.f20493a.g = onClickListener;
            this.f20493a.o = true;
            return this;
        }
    }
}
