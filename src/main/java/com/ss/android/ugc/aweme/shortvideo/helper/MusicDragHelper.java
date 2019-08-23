package com.ss.android.ugc.aweme.shortvideo.helper;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.activity.e;
import com.ss.android.ugc.aweme.shortvideo.cutmusic.DmtCutMusicLayout;
import com.ss.android.ugc.aweme.shortvideo.f;
import com.ss.android.ugc.aweme.shortvideo.widget.KTVView;
import com.ss.android.ugc.aweme.utils.ey;
import com.ss.android.vesdk.p;

public class MusicDragHelper implements View.OnTouchListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68082a;

    /* renamed from: b  reason: collision with root package name */
    public ImageView f68083b;

    /* renamed from: c  reason: collision with root package name */
    public View f68084c;
    @BindView(2131493045)
    public DmtCutMusicLayout cutMusicLayout;

    /* renamed from: d  reason: collision with root package name */
    public boolean f68085d = false;

    /* renamed from: e  reason: collision with root package name */
    public int f68086e;

    /* renamed from: f  reason: collision with root package name */
    public int f68087f;
    public int g;
    public p h;
    public Handler i = new Handler(Looper.getMainLooper());
    public Runnable j = new Runnable() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f68088a;

        public final void run() {
            if (PatchProxy.isSupport(new Object[0], this, f68088a, false, 77479, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f68088a, false, 77479, new Class[0], Void.TYPE);
                return;
            }
            if (MusicDragHelper.this.h != null) {
                int u = MusicDragHelper.this.h.u();
                if (u < MusicDragHelper.this.g) {
                    MusicDragHelper.this.cutMusicLayout.a((((float) u) * 1.0f) / ((float) MusicDragHelper.this.g), true);
                }
                MusicDragHelper.this.i.post(this);
            }
        }
    };
    public final e k;
    public com.ss.android.ugc.aweme.base.activity.a l = new e(this);
    public a m;
    @BindView(2131493348)
    public KTVView mKTVView;
    @BindView(2131493876)
    public TextView mTextViewTimeStart;
    @BindView(2131493839)
    public TextView mTextViewTotalTime;
    public b n;
    private int o;
    private float p;
    private float q;
    @BindView(2131493677)
    RelativeLayout slideContainer;

    public interface a {
        void a();
    }

    public interface b {
        void a();
    }

    @OnClick({2131493312})
    public void next() {
        if (PatchProxy.isSupport(new Object[0], this, f68082a, false, 77476, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f68082a, false, 77476, new Class[0], Void.TYPE);
            return;
        }
        if (this.m != null) {
            this.m.a();
        }
        this.k.b(this.l);
    }

    private int b() {
        if (PatchProxy.isSupport(new Object[0], this, f68082a, false, 77467, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f68082a, false, 77467, new Class[0], Integer.TYPE)).intValue();
        } else if (this.o >= this.f68087f) {
            return (int) (((((float) this.mKTVView.getWidth()) * 1.0f) * 15000.0f) / ((float) this.f68087f));
        } else {
            double width = (double) this.mKTVView.getWidth();
            Double.isNaN(width);
            double d2 = (double) this.o;
            Double.isNaN(d2);
            double d3 = width * 1.0d * d2;
            double d4 = (double) this.f68087f;
            Double.isNaN(d4);
            return (int) (d3 / d4);
        }
    }

    public final int a() {
        if (PatchProxy.isSupport(new Object[0], this, f68082a, false, 77463, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f68082a, false, 77463, new Class[0], Integer.TYPE)).intValue();
        } else if (this.o >= this.f68087f) {
            return this.mKTVView.getWidth();
        } else {
            double width = (double) this.mKTVView.getWidth();
            Double.isNaN(width);
            double d2 = (double) this.o;
            Double.isNaN(d2);
            double d3 = width * 1.0d * d2;
            double d4 = (double) this.f68087f;
            Double.isNaN(d4);
            return (int) (d3 / d4);
        }
    }

    public final MusicDragHelper a(int i2) {
        this.o = i2;
        return this;
    }

    public MusicDragHelper(e eVar) {
        this.k = eVar;
    }

    private void b(boolean z) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f68082a, false, 77475, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f68082a, false, 77475, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        KTVView kTVView = this.mKTVView;
        int i6 = 8;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        kTVView.setVisibility(i2);
        TextView textView = this.mTextViewTimeStart;
        if (z) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        textView.setVisibility(i3);
        TextView textView2 = this.mTextViewTotalTime;
        if (z) {
            i4 = 0;
        } else {
            i4 = 8;
        }
        textView2.setVisibility(i4);
        DmtCutMusicLayout dmtCutMusicLayout = this.cutMusicLayout;
        if (z) {
            i5 = 8;
        } else {
            i5 = 0;
        }
        dmtCutMusicLayout.setVisibility(i5);
        ImageView imageView = this.f68083b;
        if (z) {
            i6 = 0;
        }
        imageView.setVisibility(i6);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f68082a, false, 77471, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f68082a, false, 77471, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (this.f68085d) {
            if (z) {
                if (this.f68084c.getVisibility() != 0) {
                    this.f68084c.setVisibility(0);
                    this.f68084c.setAlpha(0.0f);
                    this.f68084c.animate().alpha(1.0f).setDuration(200).start();
                    this.i.post(this.j);
                }
            } else if (this.f68084c.getVisibility() != 4) {
                this.f68084c.setVisibility(4);
                this.i.removeCallbacksAndMessages(null);
            }
        }
    }

    public final void a(f fVar, int i2) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2, Integer.valueOf(i2)}, this, f68082a, false, 77474, new Class[]{f.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2, Integer.valueOf(i2)}, this, f68082a, false, 77474, new Class[]{f.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(fVar2, i2, 0);
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{view, motionEvent}, this, f68082a, false, 77468, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{view, motionEvent}, this, f68082a, false, 77468, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE)).booleanValue();
        }
        switch (motionEvent.getAction()) {
            case 0:
                this.p = motionEvent.getRawX();
                this.q = this.f68083b.getX();
                break;
            case 1:
                int x = (int) ((this.f68083b.getX() - this.mKTVView.getX()) + ((float) (this.f68083b.getWidth() / 2)));
                if (x < 0) {
                    x = 0;
                }
                double d2 = (double) x;
                Double.isNaN(d2);
                double width = (double) this.mKTVView.getWidth();
                Double.isNaN(width);
                double d3 = (d2 * 1.0d) / width;
                double d4 = (double) this.f68087f;
                Double.isNaN(d4);
                this.f68086e = (int) (d3 * d4);
                if (this.n != null) {
                    this.n.a();
                    break;
                }
                break;
            case 2:
                float rawX = this.q + (motionEvent.getRawX() - this.p);
                if (rawX < this.mKTVView.getX() - ((float) (this.f68083b.getWidth() / 2))) {
                    rawX = this.mKTVView.getX() - ((float) (this.f68083b.getWidth() / 2));
                }
                if ((rawX - this.mKTVView.getX()) + ((float) (this.f68083b.getWidth() / 2)) >= ((float) (this.mKTVView.getWidth() - b()))) {
                    rawX = ((this.mKTVView.getX() - ((float) (this.f68083b.getWidth() / 2))) + ((float) this.mKTVView.getWidth())) - ((float) b());
                }
                float f2 = 0.0f;
                if (rawX >= 0.0f) {
                    f2 = rawX;
                }
                this.f68083b.animate().x(f2).setDuration(0).start();
                if (!PatchProxy.isSupport(new Object[0], this, f68082a, false, 77462, new Class[0], Void.TYPE)) {
                    this.mKTVView.setStart((int) ((this.f68083b.getX() + ((float) (this.f68083b.getWidth() / 2))) - this.mKTVView.getX()));
                    this.mKTVView.setLength(a());
                    TextView textView = this.mTextViewTimeStart;
                    if (PatchProxy.isSupport(new Object[0], this, f68082a, false, 77464, new Class[0], Integer.TYPE)) {
                        i2 = ((Integer) PatchProxy.accessDispatch(new Object[0], this, f68082a, false, 77464, new Class[0], Integer.TYPE)).intValue();
                    } else {
                        double x2 = (double) this.f68083b.getX();
                        Double.isNaN(x2);
                        double x3 = (double) this.mKTVView.getX();
                        Double.isNaN(x3);
                        double d5 = (x2 * 1.0d) - x3;
                        double width2 = (double) (this.f68083b.getWidth() / 2);
                        Double.isNaN(width2);
                        double d6 = d5 + width2;
                        double width3 = (double) this.mKTVView.getWidth();
                        Double.isNaN(width3);
                        double d7 = d6 / width3;
                        double d8 = (double) this.f68087f;
                        Double.isNaN(d8);
                        i2 = (int) (d7 * d8);
                        if (i2 < 0) {
                            i2 = 0;
                        }
                        if (i2 > this.f68087f) {
                            i2 = 0;
                        }
                    }
                    textView.setText(ey.a(i2));
                    break;
                } else {
                    PatchProxy.accessDispatch(new Object[0], this, f68082a, false, 77462, new Class[0], Void.TYPE);
                    break;
                }
        }
        return true;
    }

    public final void a(f fVar, int i2, int i3) {
        f fVar2 = fVar;
        int i4 = i2;
        int i5 = i3;
        if (PatchProxy.isSupport(new Object[]{fVar2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f68082a, false, 77473, new Class[]{f.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2, Integer.valueOf(i2), Integer.valueOf(i3)}, this, f68082a, false, 77473, new Class[]{f.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.g = i4;
        b(true);
        if (fVar2 == null || !com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a(fVar.getMusicWavePointArray())) {
            b(true);
            return;
        }
        com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a().b(fVar2);
        com.ss.android.ugc.aweme.shortvideo.cutmusic.f.a().a(fVar, (long) this.o, (long) i4);
        b(false);
        if (i5 == 0) {
            this.cutMusicLayout.a();
        } else {
            this.cutMusicLayout.a((((float) i5) * 1.0f) / ((float) i4));
            this.cutMusicLayout.setTimeBubble(i5);
        }
        this.cutMusicLayout.setAudioWaveViewData(fVar2);
    }
}
