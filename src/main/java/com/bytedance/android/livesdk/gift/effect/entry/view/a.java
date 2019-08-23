package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.k;
import com.bytedance.android.live.core.utils.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class a extends LinearLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14878a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f14879b;

    /* renamed from: c  reason: collision with root package name */
    public com.bytedance.android.livesdk.gift.effect.a.a f14880c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f14881d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f14882e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f14883f;
    private View g;

    private int getLayoutResource() {
        return C0906R.layout.alx;
    }

    public final void setDrawingCacheListener(com.bytedance.android.livesdk.gift.effect.a.a aVar) {
        this.f14880c = aVar;
    }

    public a(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(getLayoutResource(), this);
        if (PatchProxy.isSupport(new Object[0], this, f14878a, false, 9473, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14878a, false, 9473, new Class[0], Void.TYPE);
            return;
        }
        this.g = findViewById(C0906R.id.js);
        this.f14879b = (ImageView) findViewById(C0906R.id.aoi);
        this.f14881d = (TextView) findViewById(C0906R.id.dq7);
        this.f14882e = (TextView) findViewById(C0906R.id.a3x);
        this.f14883f = (ImageView) findViewById(C0906R.id.cue);
    }

    public final void setUI(com.bytedance.android.livesdk.gift.effect.entry.e.a aVar) {
        int i;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f14878a, false, 9474, new Class[]{com.bytedance.android.livesdk.gift.effect.entry.e.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f14878a, false, 9474, new Class[]{com.bytedance.android.livesdk.gift.effect.entry.e.a.class}, Void.TYPE);
            return;
        }
        int i2 = aVar.j;
        String str = aVar.f14848c;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), str}, this, f14878a, false, 9475, new Class[]{Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), str}, this, f14878a, false, 9475, new Class[]{Integer.TYPE, String.class}, Void.TYPE);
        } else {
            this.f14881d.setText(str);
            if (i2 == 2) {
                this.f14882e.setText(C0906R.string.cvw);
                this.f14881d.setTextColor(getResources().getColor(C0906R.color.ai5));
                this.f14882e.setTextColor(getResources().getColor(C0906R.color.ai5));
            } else {
                this.f14882e.setText(C0906R.string.cvx);
                this.f14881d.setTextColor(getResources().getColor(C0906R.color.ai6));
                this.f14882e.setTextColor(getResources().getColor(C0906R.color.ai6));
            }
        }
        if (i2 == 0) {
            this.g.setBackgroundResource(2130840985);
            this.f14883f.setBackgroundResource(2130841348);
        } else if (i2 == 2) {
            this.g.setBackgroundResource(2130840983);
            this.f14883f.setBackgroundResource(2130841347);
        } else {
            this.g.setBackgroundResource(2130840984);
            this.f14883f.setBackgroundResource(2130841348);
        }
        if (i2 == 0) {
            ImageView imageView = this.f14879b;
            if (com.bytedance.android.livesdkapi.a.a.f18616d) {
                i = 2130841420;
            } else {
                i = 2130841421;
            }
            imageView.setBackgroundResource(i);
            return;
        }
        k.a(aVar.h, 0, 0, (q.b) new q.b() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14884a;

            public final void a(Bitmap bitmap) {
                if (PatchProxy.isSupport(new Object[]{bitmap}, this, f14884a, false, 9476, new Class[]{Bitmap.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bitmap}, this, f14884a, false, 9476, new Class[]{Bitmap.class}, Void.TYPE);
                    return;
                }
                if (bitmap != null) {
                    a.this.f14879b.setImageBitmap(bitmap);
                    a.this.invalidate();
                    if (a.this.f14880c != null) {
                        a.this.f14880c.updateDrawingCache(a.this);
                    }
                }
            }
        });
    }
}
