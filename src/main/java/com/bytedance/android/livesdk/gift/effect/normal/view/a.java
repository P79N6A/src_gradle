package com.bytedance.android.livesdk.gift.effect.normal.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.constraint.ConstraintLayout;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.uikit.d.c;
import com.bytedance.android.livesdk.gift.d.g;
import com.bytedance.android.livesdk.gift.effect.normal.d.b;
import com.bytedance.android.livesdkapi.host.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public final class a extends ConstraintLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14945a;

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.android.livesdk.gift.effect.a.a f14946b;

    /* renamed from: c  reason: collision with root package name */
    private View f14947c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f14948d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f14949e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f14950f;
    private ImageView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private int k;

    private int getLayoutResource() {
        if (PatchProxy.isSupport(new Object[0], this, f14945a, false, 9563, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f14945a, false, 9563, new Class[0], Integer.TYPE)).intValue();
        } else if (c.a(getContext())) {
            return C0906R.layout.alz;
        } else {
            return C0906R.layout.aly;
        }
    }

    public final void setDrawingCacheListener(com.bytedance.android.livesdk.gift.effect.a.a aVar) {
        this.f14946b = aVar;
    }

    public final void setOrientation(int i2) {
        this.k = i2;
    }

    public a(Context context) {
        super(context);
        LayoutInflater.from(context).inflate(getLayoutResource(), this);
        if (PatchProxy.isSupport(new Object[0], this, f14945a, false, 9564, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f14945a, false, 9564, new Class[0], Void.TYPE);
            return;
        }
        this.f14947c = findViewById(C0906R.id.jt);
        this.f14948d = (ImageView) findViewById(C0906R.id.dp8);
        this.f14949e = (ImageView) findViewById(C0906R.id.dp3);
        this.f14950f = (ImageView) findViewById(C0906R.id.aoh);
        this.g = (ImageView) findViewById(C0906R.id.ajt);
        this.h = (TextView) findViewById(C0906R.id.dq7);
        this.i = (TextView) findViewById(C0906R.id.ajj);
        this.j = (TextView) findViewById(C0906R.id.alm);
    }

    public final void setUI(b bVar) {
        String str;
        String str2;
        int i2;
        int i3 = 0;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f14945a, false, 9565, new Class[]{b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f14945a, false, 9565, new Class[]{b.class}, Void.TYPE);
            return;
        }
        if (com.bytedance.android.live.uikit.a.a.h()) {
            str = bVar.l.displayId;
        } else {
            str = bVar.l.getNickName();
        }
        TextView textView = this.h;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        textView.setText(str);
        TextView textView2 = this.i;
        if (TextUtils.isEmpty(bVar.k)) {
            str2 = "";
        } else {
            str2 = bVar.k;
        }
        textView2.setText(str2);
        if (bVar.f14908b > 1) {
            this.j.setText(String.valueOf(bVar.f14908b));
            this.j.setVisibility(0);
        } else {
            this.j.setVisibility(8);
        }
        if (!(bVar.l == null || bVar.l.getAvatarThumb() == null)) {
            a(this.f14948d, bVar.l.getAvatarThumb());
        }
        if (!(bVar.l == null || bVar.l.getUserHonor() == null)) {
            a(this.f14950f, bVar.l.getUserHonor().k());
        }
        if (!(bVar.l == null || bVar.l.getBorder() == null || bVar.l.getBorder().f7750b == null)) {
            a(this.f14949e, bVar.l.getBorder().f7750b);
        }
        if (bVar.f14912f != null) {
            a(this.g, bVar.f14912f, false);
        }
        if (com.bytedance.android.live.uikit.a.a.f()) {
            Display defaultDisplay = ((WindowManager) getContext().getSystemService("window")).getDefaultDisplay();
            if (defaultDisplay != null) {
                i3 = defaultDisplay.getRotation();
            }
            if ((this.k == 1 || this.k == 2) && i3 == 0) {
                i2 = 2130841592;
            } else {
                i2 = 2130841593;
            }
        } else if (c.a(getContext())) {
            i2 = g.a().b(bVar.o * bVar.f14908b);
        } else {
            i2 = g.a().a(bVar.o * bVar.f14908b);
        }
        this.f14947c.setBackgroundResource(i2);
        invalidate();
    }

    private void a(ImageView imageView, ImageModel imageModel) {
        ImageView imageView2 = imageView;
        ImageModel imageModel2 = imageModel;
        if (PatchProxy.isSupport(new Object[]{imageView2, imageModel2}, this, f14945a, false, 9566, new Class[]{ImageView.class, ImageModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView2, imageModel2}, this, f14945a, false, 9566, new Class[]{ImageView.class, ImageModel.class}, Void.TYPE);
            return;
        }
        a(imageView2, imageModel2, true);
    }

    private void a(ImageView imageView, ImageModel imageModel, boolean z) {
        final ImageView imageView2 = imageView;
        ImageModel imageModel2 = imageModel;
        if (PatchProxy.isSupport(new Object[]{imageView2, imageModel2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f14945a, false, 9567, new Class[]{ImageView.class, ImageModel.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageView2, imageModel2, Byte.valueOf(z)}, this, f14945a, false, 9567, new Class[]{ImageView.class, ImageModel.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        final boolean z2 = z;
        ((e) com.bytedance.android.live.utility.b.a(e.class)).a(imageModel2, (e.c) new e.c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14951a;

            public final void a(Bitmap bitmap) {
                Bitmap bitmap2;
                if (PatchProxy.isSupport(new Object[]{bitmap}, this, f14951a, false, 9568, new Class[]{Bitmap.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{bitmap}, this, f14951a, false, 9568, new Class[]{Bitmap.class}, Void.TYPE);
                } else if (bitmap != null) {
                    if (z2) {
                        bitmap2 = com.bytedance.android.livesdk.gift.effect.normal.e.b.a(bitmap);
                    } else {
                        bitmap2 = com.bytedance.android.livesdk.gift.effect.normal.e.b.b(bitmap);
                    }
                    if (bitmap2 != null && !bitmap2.isRecycled()) {
                        imageView2.setImageBitmap(bitmap2);
                        a.this.invalidate();
                        if (a.this.f14946b != null) {
                            a.this.f14946b.updateDrawingCache(a.this);
                        }
                    }
                }
            }
        });
    }
}
