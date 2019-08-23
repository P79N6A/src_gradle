package com.bytedance.android.livesdk.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.livesdk.chatroom.e.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18370a = null;

    /* renamed from: c  reason: collision with root package name */
    private static final String f18371c = "com.bytedance.android.livesdk.widget.a";

    /* renamed from: b  reason: collision with root package name */
    public boolean f18372b;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f18373d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f18374e;

    /* renamed from: f  reason: collision with root package name */
    private View f18375f;

    private int getLayoutResource() {
        return C0906R.layout.alk;
    }

    public a(Context context) {
        super(context);
        if (PatchProxy.isSupport(new Object[]{context}, this, f18370a, false, 14263, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f18370a, false, 14263, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        LayoutInflater.from(context).inflate(getLayoutResource(), this);
        this.f18373d = (ImageView) findViewById(C0906R.id.aq8);
        this.f18374e = (TextView) findViewById(C0906R.id.yp);
        this.f18375f = findViewById(C0906R.id.bu4);
    }

    @SuppressLint({"ResourceType"})
    public void setAbsActionMessage(b<?> bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f18370a, false, 14265, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f18370a, false, 14265, new Class[]{b.class}, Void.TYPE);
        } else if (bVar instanceof com.bytedance.android.livesdk.chatroom.e.a) {
            com.bytedance.android.livesdk.chatroom.e.a aVar = (com.bytedance.android.livesdk.chatroom.e.a) bVar;
            if (aVar.a() != null) {
                com.bytedance.android.livesdk.chatroom.f.b.a(this.f18373d, aVar.a(), this.f18373d.getWidth(), this.f18373d.getHeight());
            } else if (aVar.b() > 0) {
                this.f18373d.setImageResource(aVar.b());
            } else {
                this.f18373d.setBackgroundResource(2130841309);
            }
            if (!TextUtils.isEmpty(aVar.n())) {
                this.f18374e.setText(aVar.n());
            } else {
                this.f18374e.setText("");
            }
            if (!TextUtils.isEmpty(aVar.g())) {
                try {
                    ((GradientDrawable) this.f18375f.getBackground()).setColor(Color.parseColor(aVar.g()));
                } catch (Exception unused) {
                }
            }
            this.f18372b = true;
        }
    }
}
