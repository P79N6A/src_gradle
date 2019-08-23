package com.ss.android.ugc.aweme.choosemusic.viewholder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.DrawableRes;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.choosemusic.a;
import com.ss.android.ugc.aweme.choosemusic.a.b;
import com.ss.android.ugc.aweme.choosemusic.view.f;
import com.ss.android.ugc.aweme.commercialize.loft.model.e;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.music.util.d;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.ey;

public class MusicItemViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36098a;

    /* renamed from: f  reason: collision with root package name */
    private static int f36099f;

    /* renamed from: b  reason: collision with root package name */
    public boolean f36100b;

    /* renamed from: c  reason: collision with root package name */
    public Context f36101c;

    /* renamed from: d  reason: collision with root package name */
    public MusicModel f36102d;

    /* renamed from: e  reason: collision with root package name */
    public int f36103e;
    private int g;
    private int h;
    private boolean i;
    private f j;
    private a k;
    private com.ss.android.ugc.aweme.music.adapter.f<b> l;
    private int m;
    @BindView(2131495098)
    CheckableImageView mIvMusicCollect;
    @BindView(2131494996)
    RemoteImageView mIvMusicCover;
    @BindView(2131495100)
    ImageView mIvMusicDetail;
    @BindView(2131495101)
    ImageView mIvMusicMark;
    @BindView(2131495163)
    ImageView mIvPlayView;
    @BindView(2131495185)
    ImageView mIvUseToShoot;
    @BindView(2131495567)
    public ViewGroup mLlItemContainer;
    @BindView(2131495604)
    ViewGroup mLlTitltContainer;
    @BindView(2131495608)
    ViewGroup mLlUseToShoot;
    @BindView(2131495110)
    ImageView mOriginalTag;
    @BindView(2131496778)
    ViewGroup mRLCoverContainer;
    @BindView(2131496811)
    ViewGroup mRlUseContainer;
    @BindView(2131498576)
    View mSpaceView;
    @BindView(2131498011)
    TextView mTvMusicDuration;
    @BindView(2131498016)
    TextView mTvMusicName;
    @BindView(2131498147)
    TextView mTvMusicSinger;
    @BindView(2131498218)
    TextView mTvUseToShoot;

    @DrawableRes
    private static int a(int i2) {
        switch (i2) {
            case 0:
                return 2130840160;
            case 1:
                return 2130840164;
            case 2:
                return 2130840165;
            case 3:
                return 2130840166;
            case 4:
                return 2130840167;
            case 5:
                return 2130840168;
            case 6:
                return 2130840169;
            case e.l /*?: ONE_ARG  (7 int)*/:
                return 2130840170;
            case 8:
                return 2130840171;
            case 9:
                return 2130840161;
            case 10:
                return 2130840162;
            case 11:
                return 2130840163;
            default:
                return 0;
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f36098a, false, 26902, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36098a, false, 26902, new Class[0], Void.TYPE);
            return;
        }
        this.itemView.setPadding(0, 0, 0, 0);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mRLCoverContainer.getLayoutParams();
        marginLayoutParams.bottomMargin = (int) UIUtils.dip2Px(this.f36101c, 2.0f);
        marginLayoutParams.topMargin = (int) UIUtils.dip2Px(this.f36101c, 2.0f);
        this.mRLCoverContainer.requestLayout();
        this.mSpaceView.setVisibility(8);
        ((ViewGroup.MarginLayoutParams) this.mLlUseToShoot.getLayoutParams()).rightMargin = (int) UIUtils.dip2Px(this.f36101c, 8.0f);
        this.mLlUseToShoot.requestLayout();
    }

    public final void a(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), (byte) 1}, this, f36098a, false, 26904, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), (byte) 1}, this, f36098a, false, 26904, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        b(z, true);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f36098a, false, 26905, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f36098a, false, 26905, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        b(z);
        e(z);
    }

    public final void a(MusicModel musicModel, String str, boolean z, boolean z2, boolean z3, int i2, int i3, int i4, a aVar) {
        a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{musicModel, str, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), (byte) 0, 0, Integer.valueOf(i3), Integer.valueOf(i4), aVar2}, this, f36098a, false, 26906, new Class[]{MusicModel.class, String.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel, str, Byte.valueOf(z), Byte.valueOf(z2), (byte) 0, 0, Integer.valueOf(i3), Integer.valueOf(i4), aVar2}, this, f36098a, false, 26906, new Class[]{MusicModel.class, String.class, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, a.class}, Void.TYPE);
        } else if (musicModel != null) {
            this.i = z;
            this.f36103e = i4;
            this.h = i3;
            this.k = aVar2;
            a(musicModel, str, z2, false, 0);
        }
    }

    private void f() {
        this.f36100b = !this.f36100b;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f36098a, false, 26903, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36098a, false, 26903, new Class[0], Void.TYPE);
            return;
        }
        this.itemView.setPadding(0, 0, 0, 0);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f36098a, false, 26908, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36098a, false, 26908, new Class[0], Void.TYPE);
            return;
        }
        if (this.f36102d.getCollectionType() != null) {
            this.f36100b = MusicModel.CollectionType.COLLECTED.equals(this.f36102d.getCollectionType());
        }
        e();
    }

    public final void e() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f36098a, false, 26919, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36098a, false, 26919, new Class[0], Void.TYPE);
            return;
        }
        CheckableImageView checkableImageView = this.mIvMusicCollect;
        if (this.f36100b) {
            i2 = 2130838804;
        } else {
            i2 = 2130838805;
        }
        checkableImageView.setImageResource(i2);
    }

    public final void d() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f36098a, false, 26918, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36098a, false, 26918, new Class[0], Void.TYPE);
        } else if (this.f36102d != null) {
            if (this.f36100b || d.a(this.f36102d, this.f36101c, true)) {
                if (this.l != null) {
                    com.ss.android.ugc.aweme.music.adapter.f<b> fVar = this.l;
                    MusicModel musicModel = this.f36102d;
                    if (this.f36100b) {
                        str = "unfollow_type";
                    } else {
                        str = "follow_type";
                    }
                    fVar.a(new b(musicModel, str, this.h, this.f36103e));
                }
                f();
                this.mIvMusicCollect.b();
            }
        }
    }

    @OnClick({2131495100, 2131495098, 2131495608, 2131495567})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f36098a, false, 26913, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f36098a, false, 26913, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (this.j != null) {
            this.j.a(this, view, this.f36102d, this.g);
        }
    }

    private void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f36098a, false, 26911, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f36098a, false, 26911, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.mIvPlayView.clearAnimation();
        if (!z) {
            this.mIvPlayView.setVisibility(0);
            this.mIvPlayView.setImageResource(2130839141);
        } else if (this.f36102d != null) {
            if (this.f36102d.getMusicType() == MusicModel.MusicType.LOCAL) {
                this.mIvPlayView.setImageResource(2130839170);
            } else if (this.f36102d.getMusicType() == MusicModel.MusicType.ONLINE) {
                this.mIvPlayView.setVisibility(0);
                this.mIvPlayView.setImageResource(2130839170);
            }
        }
    }

    private void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f36098a, false, 26914, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f36098a, false, 26914, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            this.mLlItemContainer.setClickable(false);
            int i2 = -f36099f;
            int dip2Px = (int) UIUtils.dip2Px(this.f36101c, 30.0f);
            if (ey.a(this.f36101c)) {
                dip2Px = -dip2Px;
            }
            a(0, 200, 1, 0, 0, i2, 0, dip2Px, true);
        } else {
            this.mLlUseToShoot.setVisibility(8);
        }
    }

    private void e(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f36098a, false, 26916, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f36098a, false, 26916, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (!z) {
            c(true);
        } else {
            d(true);
        }
    }

    private void d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f36098a, false, 26915, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f36098a, false, 26915, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            this.mLlItemContainer.setClickable(false);
            int i2 = -f36099f;
            int dip2Px = (int) UIUtils.dip2Px(this.f36101c, 30.0f);
            if (ey.a(this.f36101c)) {
                dip2Px = -dip2Px;
            }
            int i3 = dip2Px;
            this.mLlUseToShoot.setVisibility(0);
            if (ey.a(this.f36101c)) {
                ((ViewGroup.MarginLayoutParams) this.mRlUseContainer.getLayoutParams()).leftMargin = -f36099f;
            } else {
                ((ViewGroup.MarginLayoutParams) this.mRlUseContainer.getLayoutParams()).rightMargin = -f36099f;
            }
            a(100, 200, 0, 1, i2, 0, i3, 0, false);
        } else {
            this.mLlUseToShoot.setVisibility(0);
        }
    }

    public final void a(f fVar, com.ss.android.ugc.aweme.music.adapter.f<b> fVar2) {
        this.j = fVar;
        this.l = fVar2;
    }

    public MusicItemViewHolder(View view, int i2) {
        super(view);
        this.f36101c = view.getContext();
        this.m = i2;
        ButterKnife.bind((Object) this, view);
        if (com.ss.android.g.a.a()) {
            this.mIvUseToShoot.setVisibility(0);
        } else {
            this.mTvUseToShoot.setVisibility(0);
        }
        if (f36099f <= 0) {
            this.mLlUseToShoot.measure(View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
            f36099f = (int) (((float) this.mLlUseToShoot.getMeasuredWidth()) + UIUtils.dip2Px(this.f36101c, 8.0f));
        }
        this.mIvMusicCollect.setOnStateChangeListener(new CheckableImageView.a() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36104a;

            public final void a() {
                if (PatchProxy.isSupport(new Object[0], this, f36104a, false, 26923, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f36104a, false, 26923, new Class[0], Void.TYPE);
                    return;
                }
                MusicItemViewHolder musicItemViewHolder = MusicItemViewHolder.this;
                if (PatchProxy.isSupport(new Object[0], musicItemViewHolder, MusicItemViewHolder.f36098a, false, 26920, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], musicItemViewHolder, MusicItemViewHolder.f36098a, false, 26920, new Class[0], Void.TYPE);
                    return;
                }
                boolean z = musicItemViewHolder.f36100b;
                bg.a(new com.ss.android.ugc.aweme.music.a.e(z ? 1 : 0, musicItemViewHolder.f36102d));
            }

            public final void a(int i) {
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f36104a, false, 26922, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f36104a, false, 26922, new Class[]{Integer.TYPE}, Void.TYPE);
                    return;
                }
                if (i == 1) {
                    MusicItemViewHolder.this.e();
                }
            }
        });
    }

    private static void a(RemoteImageView remoteImageView, String str) {
        RemoteImageView remoteImageView2 = remoteImageView;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{remoteImageView2, str2}, null, f36098a, true, 26910, new Class[]{RemoteImageView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{remoteImageView2, str2}, null, f36098a, true, 26910, new Class[]{RemoteImageView.class, String.class}, Void.TYPE);
            return;
        }
        remoteImageView2.post(new b(remoteImageView2, str2));
    }

    private void b(boolean z, boolean z2) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0)}, this, f36098a, false, 26912, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2)}, this, f36098a, false, 26912, new Class[]{Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            Animation loadAnimation = AnimationUtils.loadAnimation(this.itemView.getContext(), C0906R.anim.cp);
            loadAnimation.setInterpolator(new LinearInterpolator());
            this.mIvPlayView.setImageResource(2130839665);
            this.mIvPlayView.startAnimation(loadAnimation);
        } else {
            this.mIvPlayView.clearAnimation();
            b(z2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x012a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x016c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r11, boolean r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r11
            java.lang.Byte r1 = java.lang.Byte.valueOf(r8)
            r9 = 1
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f36098a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 26909(0x691d, float:3.7708E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0045
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r11
            java.lang.Byte r1 = java.lang.Byte.valueOf(r8)
            r0[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f36098a
            r3 = 0
            r4 = 26909(0x691d, float:3.7708E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r8] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0045:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r10.f36102d
            java.lang.String r0 = r0.getName()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0091
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L_0x0091
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r10.f36102d
            java.lang.String r0 = r0.getName()
            int r0 = r0.indexOf(r11)
            if (r0 <= 0) goto L_0x0091
            android.text.SpannableString r1 = new android.text.SpannableString
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r2 = r10.f36102d
            java.lang.String r2 = r2.getName()
            r1.<init>(r2)
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            android.content.Context r3 = r10.f36101c
            android.content.res.Resources r3 = r3.getResources()
            r4 = 2131624986(0x7f0e041a, float:1.8877167E38)
            int r3 = r3.getColor(r4)
            r2.<init>(r3)
            int r3 = r11.length()
            int r3 = r3 + r0
            r4 = 17
            com.ss.android.ugc.aweme.choosemusic.viewholder.c.a(r1, r2, r0, r3, r4)
            android.widget.TextView r0 = r10.mTvMusicName
            r0.setText(r1)
            r0 = 1
            goto L_0x0092
        L_0x0091:
            r0 = r12
        L_0x0092:
            if (r0 != 0) goto L_0x00c0
            android.widget.TextView r0 = r10.mTvMusicName
            android.content.Context r1 = r10.f36101c
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131624973(0x7f0e040d, float:1.887714E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r10.mTvMusicName
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r10.f36102d
            java.lang.String r1 = r1.getName()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00bb
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r10.f36102d
            java.lang.String r1 = r1.getName()
            goto L_0x00bd
        L_0x00bb:
            java.lang.String r1 = ""
        L_0x00bd:
            r0.setText(r1)
        L_0x00c0:
            boolean r0 = com.ss.android.g.a.a()
            if (r0 != 0) goto L_0x00cf
            android.widget.TextView r0 = r10.mTvMusicName
            android.text.TextPaint r0 = r0.getPaint()
            r0.setFakeBoldText(r9)
        L_0x00cf:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r10.f36102d
            java.lang.String r0 = r0.getName()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00e9
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r10.f36102d
            boolean r0 = r0.isOriginal()
            if (r0 == 0) goto L_0x00e9
            android.widget.ImageView r0 = r10.mOriginalTag
            r0.setVisibility(r8)
            goto L_0x00f0
        L_0x00e9:
            android.widget.ImageView r0 = r10.mOriginalTag
            r1 = 8
            r0.setVisibility(r1)
        L_0x00f0:
            com.ss.android.ugc.aweme.music.ui.a.b r0 = com.ss.android.ugc.aweme.music.ui.a.b.f56658c
            android.widget.TextView r1 = r10.mTvMusicName
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r2 = r10.f36102d
            com.ss.android.ugc.aweme.music.model.Music r2 = r2.getMusic()
            r0.a(r1, r2, r9)
            android.widget.TextView r0 = r10.mTvMusicSinger
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r10.f36102d
            java.lang.String r1 = r1.getSinger()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0115
            android.content.Context r1 = r10.f36101c
            r2 = 2131564450(0x7f0d17a2, float:1.8754386E38)
            java.lang.String r1 = r1.getString(r2)
            goto L_0x011b
        L_0x0115:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r10.f36102d
            java.lang.String r1 = r1.getSinger()
        L_0x011b:
            r0.setText(r1)
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r10.f36102d
            java.lang.String r0 = r0.getPicPremium()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0136
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r10.mIvMusicCover
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r10.f36102d
            java.lang.String r1 = r1.getPicPremium()
            a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (java.lang.String) r1)
            goto L_0x0156
        L_0x0136:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r10.f36102d
            java.lang.String r0 = r0.getPicBig()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x014e
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r10.mIvMusicCover
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r10.f36102d
            java.lang.String r1 = r1.getPicBig()
            a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (java.lang.String) r1)
            goto L_0x0156
        L_0x014e:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r10.mIvMusicCover
            r1 = 2130838872(0x7f020558, float:1.7282739E38)
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (int) r1)
        L_0x0156:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r10.f36102d
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r0 = r0.getMusicType()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r1 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType.LOCAL
            if (r0 != r1) goto L_0x016c
            android.widget.TextView r0 = r10.mTvMusicDuration
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r10.f36102d
            java.lang.String r1 = r1.getLocalMusicDuration()
            r0.setText(r1)
            return
        L_0x016c:
            android.widget.TextView r0 = r10.mTvMusicDuration
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r10.f36102d
            int r1 = r1.getDuration()
            java.lang.String r1 = com.ss.android.ugc.aweme.utils.ey.a((int) r1)
            r0.setText(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder.a(java.lang.String, boolean):void");
    }

    private void a(MusicModel musicModel, String str, boolean z, boolean z2, int i2) {
        int i3;
        ImageView imageView;
        MusicModel musicModel2 = musicModel;
        String str2 = str;
        boolean z3 = z;
        boolean z4 = true;
        if (PatchProxy.isSupport(new Object[]{musicModel2, str2, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i2)}, this, f36098a, false, 26907, new Class[]{MusicModel.class, String.class, Boolean.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{musicModel2, str2, Byte.valueOf(z), Byte.valueOf(z2), Integer.valueOf(i2)}, this, f36098a, false, 26907, new Class[]{MusicModel.class, String.class, Boolean.TYPE, Boolean.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        this.f36102d = musicModel2;
        this.g = i2;
        c();
        a(str2, false);
        b(z3);
        b(z2, z3);
        if (z3) {
            d(false);
        } else {
            c(false);
        }
        if (musicModel.getMusicType() == MusicModel.MusicType.LOCAL) {
            this.mIvMusicCollect.setVisibility(8);
            imageView = this.mIvMusicDetail;
        } else {
            this.mIvMusicCollect.setVisibility(0);
            if (!com.ss.android.ugc.aweme.choosemusic.f.d.a() || !(this.m == 1 || this.m == 2)) {
                z4 = false;
            }
            imageView = this.mIvMusicDetail;
            if (z4) {
                i3 = 0;
                imageView.setVisibility(i3);
                if (this.i || this.f36103e >= 12) {
                    this.mIvMusicMark.setVisibility(8);
                }
                this.mIvMusicMark.setVisibility(0);
                int a2 = a(this.f36103e);
                if (a2 > 0) {
                    if (this.f36103e < 3) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mIvMusicMark.getLayoutParams();
                        marginLayoutParams.topMargin = (int) UIUtils.dip2Px(this.mIvMusicMark.getContext(), 0.0f);
                        marginLayoutParams.leftMargin = marginLayoutParams.topMargin;
                    } else {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) this.mIvMusicMark.getLayoutParams();
                        marginLayoutParams2.topMargin = (int) UIUtils.dip2Px(this.mIvMusicMark.getContext(), 2.0f);
                        marginLayoutParams2.leftMargin = marginLayoutParams2.topMargin;
                    }
                    this.mIvMusicMark.setImageResource(a2);
                }
                return;
            }
        }
        i3 = 8;
        imageView.setVisibility(i3);
        if (this.i) {
        }
        this.mIvMusicMark.setVisibility(8);
    }

    private void a(long j2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), 200, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Byte.valueOf(z ? (byte) 1 : 0)}, this, f36098a, false, 26917, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), 200, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Byte.valueOf(z)}, this, f36098a, false, 26917, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{i5, i6}).setDuration(200);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36106a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f36106a, false, 26924, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f36106a, false, 26924, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (ey.a(MusicItemViewHolder.this.f36101c)) {
                    ((ViewGroup.MarginLayoutParams) MusicItemViewHolder.this.mRlUseContainer.getLayoutParams()).leftMargin = intValue;
                } else {
                    ((ViewGroup.MarginLayoutParams) MusicItemViewHolder.this.mRlUseContainer.getLayoutParams()).rightMargin = intValue;
                }
                MusicItemViewHolder.this.mRlUseContainer.requestLayout();
            }
        });
        final boolean z2 = z;
        duration.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36108a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f36108a, false, 26925, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f36108a, false, 26925, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                MusicItemViewHolder.this.mLlItemContainer.setClickable(true);
                if (z2) {
                    MusicItemViewHolder.this.mLlUseToShoot.setVisibility(8);
                    if (ey.a(MusicItemViewHolder.this.f36101c)) {
                        ((ViewGroup.MarginLayoutParams) MusicItemViewHolder.this.mRlUseContainer.getLayoutParams()).leftMargin = 0;
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) MusicItemViewHolder.this.mRlUseContainer.getLayoutParams()).rightMargin = 0;
                }
            }
        });
        AlphaAnimation alphaAnimation = new AlphaAnimation((float) i3, (float) i4);
        TranslateAnimation translateAnimation = new TranslateAnimation((float) i7, (float) i8, 0.0f, 0.0f);
        AnimationSet animationSet = new AnimationSet(true);
        animationSet.addAnimation(alphaAnimation);
        animationSet.addAnimation(translateAnimation);
        animationSet.setFillAfter(true);
        animationSet.setDuration(100);
        animationSet.setStartOffset(j3);
        this.mLlUseToShoot.startAnimation(animationSet);
        duration.start();
    }
}
