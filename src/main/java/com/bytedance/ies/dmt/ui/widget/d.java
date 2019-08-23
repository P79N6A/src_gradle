package com.bytedance.ies.dmt.ui.widget;

import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.ies.dmt.ui.common.b;
import com.bytedance.ies.dmt.ui.common.e;
import com.bytedance.ies.dmt.ui.titlebar.b.a;
import com.ss.android.ugc.aweme.C0906R;

public final class d extends FrameLayout implements e {

    /* renamed from: a  reason: collision with root package name */
    private int f20495a;

    /* renamed from: b  reason: collision with root package name */
    private ImageView f20496b;

    /* renamed from: c  reason: collision with root package name */
    private TextView f20497c;

    /* renamed from: d  reason: collision with root package name */
    private a f20498d;

    /* renamed from: e  reason: collision with root package name */
    private int f20499e;

    private void a() {
        if (this.f20498d == a.SOLID) {
            b();
        } else {
            c();
        }
    }

    private void b() {
        if (this.f20495a == 0) {
            setBackgroundResource(2130841605);
        } else {
            setBackgroundResource(2130841604);
        }
        this.f20497c.setTextColor(getContext().getResources().getColor(C0906R.color.ak6));
        if (this.f20499e != -1) {
            a.a(getContext(), this.f20496b, this.f20499e, C0906R.color.ak6);
        }
    }

    private void c() {
        if (this.f20495a == 0) {
            setBackgroundResource(2130841603);
            this.f20497c.setTextColor(getContext().getResources().getColor(C0906R.color.amr));
            if (this.f20499e != -1) {
                a.a(getContext(), this.f20496b, this.f20499e, C0906R.color.amr);
            }
        } else {
            setBackgroundResource(2130841602);
            this.f20497c.setTextColor(getContext().getResources().getColor(C0906R.color.amq));
            if (this.f20499e != -1) {
                a.a(getContext(), this.f20496b, this.f20499e, C0906R.color.amq);
            }
        }
    }

    public d(@NonNull Context context) {
        this(context, null);
    }

    public final void onColorModeChange(int i) {
        if (this.f20495a != i) {
            this.f20495a = i;
            a();
        }
    }

    private d(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, null, 0);
    }

    public final void a(a aVar, @DrawableRes int i, String str) {
        this.f20499e = i;
        if (aVar == a.BORDER) {
            c();
        } else {
            b();
        }
        this.f20497c.setText(str);
    }

    private d(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.f20495a = b.a().f20312a;
        this.f20498d = a.SOLID;
        this.f20499e = -1;
        View inflate = LayoutInflater.from(context).inflate(C0906R.layout.a4w, this, true);
        this.f20496b = (ImageView) inflate.findViewById(C0906R.id.b2_);
        this.f20497c = (TextView) inflate.findViewById(C0906R.id.dkf);
        a();
    }
}
