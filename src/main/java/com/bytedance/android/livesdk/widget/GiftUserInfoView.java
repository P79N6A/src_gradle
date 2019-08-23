package com.bytedance.android.livesdk.widget;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.Spannable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.livesdk.chatroom.f.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class GiftUserInfoView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18225a;

    /* renamed from: b  reason: collision with root package name */
    TextView f18226b;

    /* renamed from: c  reason: collision with root package name */
    ObjectAnimator f18227c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f18228d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f18229e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f18230f;
    private HSImageView g;
    private long h;

    private int getLayoutResource() {
        return C0906R.layout.amh;
    }

    public long getUserId() {
        return this.h;
    }

    public void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f18225a, false, 14378, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18225a, false, 14378, new Class[0], Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f18225a, false, 14388, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18225a, false, 14388, new Class[0], Void.TYPE);
        } else {
            this.f18228d.setImageDrawable(null);
            this.f18229e.setImageDrawable(null);
            this.f18230f.setText(null);
            this.f18226b.setText(null);
            this.g.setImageDrawable(null);
            if (this.f18227c != null) {
                this.f18227c.cancel();
            }
        }
        super.onDetachedFromWindow();
    }

    public void setUserId(long j) {
        this.h = j;
    }

    public GiftUserInfoView(Context context) {
        super(context);
        a(context);
    }

    public void setDescriptionText(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f18225a, false, 14384, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f18225a, false, 14384, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f18226b.setText(str2);
    }

    public void setHonorImage(ImageModel imageModel) {
        ImageModel imageModel2 = imageModel;
        if (PatchProxy.isSupport(new Object[]{imageModel2}, this, f18225a, false, 14380, new Class[]{ImageModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageModel2}, this, f18225a, false, 14380, new Class[]{ImageModel.class}, Void.TYPE);
        } else if (imageModel2 != null) {
            b.b(this.f18229e, imageModel2);
        }
    }

    public void setSpannable(Spannable spannable) {
        Spannable spannable2 = spannable;
        if (PatchProxy.isSupport(new Object[]{spannable2}, this, f18225a, false, 14385, new Class[]{Spannable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{spannable2}, this, f18225a, false, 14385, new Class[]{Spannable.class}, Void.TYPE);
            return;
        }
        this.f18226b.setText(spannable2);
    }

    public void setUserNameText(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f18225a, false, 14382, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f18225a, false, 14382, new Class[]{String.class}, Void.TYPE);
            return;
        }
        this.f18230f.setText(str2);
    }

    private void a(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f18225a, false, 14377, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f18225a, false, 14377, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        LayoutInflater.from(context).inflate(getLayoutResource(), this);
        this.f18228d = (ImageView) findViewById(C0906R.id.i4);
        this.f18229e = (ImageView) findViewById(C0906R.id.aoi);
        this.f18230f = (TextView) findViewById(C0906R.id.dq7);
        this.f18226b = (TextView) findViewById(C0906R.id.a3x);
        this.g = (HSImageView) findViewById(C0906R.id.ays);
    }

    public void setAvatarBorder(ImageModel imageModel) {
        if (PatchProxy.isSupport(new Object[]{imageModel}, this, f18225a, false, 14381, new Class[]{ImageModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageModel}, this, f18225a, false, 14381, new Class[]{ImageModel.class}, Void.TYPE);
        } else if (imageModel == null) {
            this.g.setVisibility(4);
        } else {
            this.g.setVisibility(0);
            b.a((ImageView) this.g, imageModel);
        }
    }

    public void setAvatarImage(ImageModel imageModel) {
        ImageModel imageModel2 = imageModel;
        if (PatchProxy.isSupport(new Object[]{imageModel2}, this, f18225a, false, 14379, new Class[]{ImageModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{imageModel2}, this, f18225a, false, 14379, new Class[]{ImageModel.class}, Void.TYPE);
        } else if (imageModel2 != null) {
            b.a(this.f18228d, imageModel2, 2130841429);
        }
    }

    public void setDescriptionTextColor(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f18225a, false, 14386, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f18225a, false, 14386, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f18226b.setTextColor(i);
    }

    public void setUserNameTextColor(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f18225a, false, 14383, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f18225a, false, 14383, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f18230f.setTextColor(i);
    }

    public final void a(long j) {
        int i;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f18225a, false, 14387, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f18225a, false, 14387, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        if (this.f18226b.getLayout() != null) {
            i = ((int) this.f18226b.getLayout().getLineWidth(0)) - ((this.f18226b.getWidth() - this.f18226b.getCompoundPaddingRight()) - this.f18226b.getCompoundPaddingLeft());
            if (i > 0) {
                z = true;
            }
        } else {
            i = 0;
        }
        if (z) {
            this.f18226b.postDelayed(new f(this, i), j);
        }
    }

    public GiftUserInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context);
    }

    public GiftUserInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        a(context);
    }
}
