package com.ss.android.ugc.aweme.account.login.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.util.q;
import com.ss.android.ugc.aweme.g.a;

public class MusCountDownView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32479a;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f32480b = a.a();

    /* renamed from: c  reason: collision with root package name */
    public TextView f32481c;

    /* renamed from: d  reason: collision with root package name */
    public TextView f32482d;

    /* renamed from: e  reason: collision with root package name */
    public View f32483e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f32484f;
    private q g;
    private com.ss.android.ugc.aweme.account.login.b.a h;
    private q.a i = new q.a() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32485a;

        /* renamed from: c  reason: collision with root package name */
        private boolean f32487c;

        public final void a(long j) {
            if (PatchProxy.isSupport(new Object[]{new Long(j)}, this, f32485a, false, 20632, new Class[]{Long.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{new Long(j)}, this, f32485a, false, 20632, new Class[]{Long.TYPE}, Void.TYPE);
                return;
            }
            if (j > 0) {
                MusCountDownView.this.f32481c.setVisibility(0);
                MusCountDownView.this.f32482d.setVisibility(8);
                MusCountDownView.this.f32481c.setText(MusCountDownView.this.getContext().getResources().getString(C0906R.string.bzq, new Object[]{Long.valueOf(j)}));
            } else {
                MusCountDownView.this.f32481c.setVisibility(8);
                MusCountDownView.this.f32482d.setVisibility(0);
                MusCountDownView.this.f32482d.setText(MusCountDownView.this.getContext().getString(C0906R.string.bdx));
            }
            if (MusCountDownView.f32480b && j < 50 && !this.f32487c) {
                this.f32487c = true;
            }
            if (j < 50 && MusCountDownView.this.f32484f && MusCountDownView.this.f32483e != null && MusCountDownView.this.f32483e.getVisibility() != 0 && com.ss.android.g.a.c()) {
                MusCountDownView.this.f32483e.setVisibility(0);
            }
        }
    };

    public TextView getResendCodeButton() {
        return this.f32482d;
    }

    public TextView getTimerText() {
        return this.f32481c;
    }

    public long getRemainTick() {
        if (this.g == null) {
            return 0;
        }
        return this.g.f33110b;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f32479a, false, 20625, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f32479a, false, 20625, new Class[0], Void.TYPE);
            return;
        }
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.aai, this, true);
        this.f32481c = (TextView) inflate.findViewById(C0906R.id.a0c);
        this.f32482d = (TextView) inflate.findViewById(C0906R.id.cdu);
        this.f32482d.setOnTouchListener(new com.ss.android.ugc.aweme.h.a(0.5f, 150, null));
    }

    public void setTargetView(View view) {
        this.f32483e = view;
    }

    public void setTickListener(com.ss.android.ugc.aweme.account.login.b.a aVar) {
        this.h = aVar;
    }

    public void setVoiceCodeEnabled(boolean z) {
        this.f32484f = z;
    }

    public MusCountDownView(@NonNull Context context) {
        super(context);
        a();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        View.OnClickListener onClickListener2 = onClickListener;
        if (PatchProxy.isSupport(new Object[]{onClickListener2}, this, f32479a, false, 20626, new Class[]{View.OnClickListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{onClickListener2}, this, f32479a, false, 20626, new Class[]{View.OnClickListener.class}, Void.TYPE);
            return;
        }
        this.f32482d.setOnClickListener(onClickListener2);
    }

    public MusCountDownView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public MusCountDownView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        a();
    }
}
