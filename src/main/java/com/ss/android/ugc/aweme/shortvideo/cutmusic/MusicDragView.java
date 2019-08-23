package com.ss.android.ugc.aweme.shortvideo.cutmusic;

import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindString;
import butterknife.BindView;
import butterknife.OnClick;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.shortvideo.widget.KTVView;
import com.ss.android.ugc.aweme.utils.ey;

public class MusicDragView implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f66638a;

    /* renamed from: b  reason: collision with root package name */
    ImageView f66639b;

    /* renamed from: c  reason: collision with root package name */
    View f66640c;
    @BindView(2131493045)
    DmtCutMusicLayout cutMusicLayout;

    /* renamed from: d  reason: collision with root package name */
    int f66641d;

    /* renamed from: e  reason: collision with root package name */
    public int f66642e;

    /* renamed from: f  reason: collision with root package name */
    public int f66643f;
    boolean g;
    a h;
    public b i;
    private float j;
    private float k;
    @BindView(2131493348)
    KTVView mKTVView;
    @BindView(2131493876)
    TextView mTextViewTimeStart;
    @BindView(2131493839)
    TextView mTextViewTotalTime;
    @BindString(2132083398)
    String mTimeString;
    @BindView(2131493677)
    RelativeLayout slideContainer;

    public interface a {
        void c();
    }

    public interface b {
        void b();
    }

    public final int b() {
        if (this.f66641d >= this.f66643f) {
            return this.f66643f - this.f66642e;
        }
        return this.f66641d;
    }

    @OnClick({2131493312})
    public void next() {
        if (PatchProxy.isSupport(new Object[0], this, f66638a, false, 76102, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f66638a, false, 76102, new Class[0], Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.c();
        }
    }

    private int c() {
        if (PatchProxy.isSupport(new Object[0], this, f66638a, false, 76098, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f66638a, false, 76098, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f66641d >= this.f66643f) {
            return (int) (((((float) this.mKTVView.getWidth()) * 1.0f) * 15000.0f) / ((float) this.f66643f));
        } else {
            double width = (double) this.mKTVView.getWidth();
            Double.isNaN(width);
            double d2 = (double) this.f66641d;
            Double.isNaN(d2);
            double d3 = width * 1.0d * d2;
            double d4 = (double) this.f66643f;
            Double.isNaN(d4);
            return (int) (d3 / d4);
        }
    }

    /* access modifiers changed from: package-private */
    public int a() {
        if (PatchProxy.isSupport(new Object[0], this, f66638a, false, 76091, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f66638a, false, 76091, new Class[0], Integer.TYPE)).intValue();
        } else if (this.f66641d >= this.f66643f || this.g) {
            return this.mKTVView.getWidth();
        } else {
            double width = (double) this.mKTVView.getWidth();
            Double.isNaN(width);
            double d2 = (double) this.f66641d;
            Double.isNaN(d2);
            double d3 = width * 1.0d * d2;
            double d4 = (double) this.f66643f;
            Double.isNaN(d4);
            return (int) (d3 / d4);
        }
    }

    public final void a(boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f66638a, false, 76097, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f66638a, false, 76097, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ImageView imageView = this.f66639b;
        int i6 = 8;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        KTVView kTVView = this.mKTVView;
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        kTVView.setVisibility(i3);
        TextView textView = this.mTextViewTimeStart;
        if (z) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        textView.setVisibility(i4);
        TextView textView2 = this.mTextViewTotalTime;
        if (z) {
            i5 = 0;
        } else {
            i5 = 8;
        }
        textView2.setVisibility(i5);
        DmtCutMusicLayout dmtCutMusicLayout = this.cutMusicLayout;
        if (!z) {
            i6 = 0;
        }
        dmtCutMusicLayout.setVisibility(i6);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f66638a, false, 76099, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f66638a, false, 76099, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.j = motionEvent.getRawX();
                this.k = this.f66639b.getX();
                break;
            case 1:
                int x = (int) ((this.f66639b.getX() - this.mKTVView.getX()) + ((float) (this.f66639b.getWidth() / 2)));
                if (x < 0) {
                    x = 0;
                }
                double d2 = (double) x;
                Double.isNaN(d2);
                double width = (double) this.mKTVView.getWidth();
                Double.isNaN(width);
                double d3 = (d2 * 1.0d) / width;
                double d4 = (double) this.f66643f;
                Double.isNaN(d4);
                this.f66642e = (int) (d3 * d4);
                if (this.i != null) {
                    this.i.b();
                    break;
                }
                break;
            case 2:
                if (!this.g) {
                    float rawX = this.k + (motionEvent.getRawX() - this.j);
                    if (rawX < this.mKTVView.getX() - ((float) (this.f66639b.getWidth() / 2))) {
                        rawX = this.mKTVView.getX() - ((float) (this.f66639b.getWidth() / 2));
                    }
                    if ((rawX - this.mKTVView.getX()) + ((float) (this.f66639b.getWidth() / 2)) >= ((float) (this.mKTVView.getWidth() - c()))) {
                        rawX = ((this.mKTVView.getX() - ((float) (this.f66639b.getWidth() / 2))) + ((float) this.mKTVView.getWidth())) - ((float) c());
                    }
                    float f2 = 0.0f;
                    if (rawX >= 0.0f) {
                        f2 = rawX;
                    }
                    this.f66639b.animate().x(f2).setDuration(0).start();
                    if (!PatchProxy.isSupport(new Object[0], this, f66638a, false, 76090, new Class[0], Void.TYPE)) {
                        int x2 = (int) ((this.f66639b.getX() + ((float) (this.f66639b.getWidth() / 2))) - this.mKTVView.getX());
                        if (x2 < 0 || this.g) {
                            x2 = 0;
                        }
                        this.mKTVView.setStart(x2);
                        this.mKTVView.setLength(a());
                        TextView textView = this.mTextViewTimeStart;
                        if (PatchProxy.isSupport(new Object[0], this, f66638a, false, 76092, new Class[0], Integer.TYPE)) {
                            i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f66638a, false, 76092, new Class[0], Integer.TYPE)).intValue();
                        } else {
                            double x3 = (double) this.f66639b.getX();
                            Double.isNaN(x3);
                            double x4 = (double) this.mKTVView.getX();
                            Double.isNaN(x4);
                            double d5 = (x3 * 1.0d) - x4;
                            double width2 = (double) (this.f66639b.getWidth() / 2);
                            Double.isNaN(width2);
                            double d6 = d5 + width2;
                            double width3 = (double) this.mKTVView.getWidth();
                            Double.isNaN(width3);
                            double d7 = d6 / width3;
                            double d8 = (double) this.f66643f;
                            Double.isNaN(d8);
                            i2 = (int) (d7 * d8);
                            if (i2 < 0) {
                                i2 = 0;
                            }
                            if (i2 > this.f66643f) {
                                i2 = 0;
                            }
                        }
                        textView.setText(ey.a(i2));
                        break;
                    } else {
                        PatchProxy.accessDispatch(new Object[0], this, f66638a, false, 76090, new Class[0], Void.TYPE);
                        break;
                    }
                }
                break;
        }
        return true;
    }
}
