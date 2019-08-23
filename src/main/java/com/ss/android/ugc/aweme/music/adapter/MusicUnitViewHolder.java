package com.ss.android.ugc.aweme.music.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.core.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.login.e;
import com.ss.android.ugc.aweme.music.a.f;
import com.ss.android.ugc.aweme.music.adapter.MusicMixAdapter;
import com.ss.android.ugc.aweme.music.ui.CheckableImageView;
import com.ss.android.ugc.aweme.music.ui.v;
import com.ss.android.ugc.aweme.music.util.d;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.utils.ey;
import java.util.HashMap;

public class MusicUnitViewHolder extends RecyclerView.ViewHolder {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56211a;

    /* renamed from: d  reason: collision with root package name */
    private static int f56212d;

    /* renamed from: b  reason: collision with root package name */
    public MusicModel f56213b;

    /* renamed from: c  reason: collision with root package name */
    boolean f56214c;
    @BindView(2131495836)
    View divider;

    /* renamed from: e  reason: collision with root package name */
    private Context f56215e;

    /* renamed from: f  reason: collision with root package name */
    private d f56216f;
    private Context g;
    private int h;
    private String i;
    @BindView(2131493598)
    LinearLayout ivCollectFrame;
    @BindView(2131495816)
    ImageView ivDetail;
    @BindView(2131495813)
    CheckableImageView ivMusicCollect;
    @BindView(2131496066)
    ImageView ivOriginMusicMark;
    private f<f> j;
    private int k;
    @BindView(2131496925)
    RemoteImageView mCoverView;
    @BindView(2131497900)
    TextView mDurationView;
    @BindView(2131498016)
    TextView mNameView;
    @BindView(2131496789)
    LinearLayout mOkView;
    @BindView(2131495163)
    public ImageView mPlayView;
    @BindView(2131496121)
    ProgressBar mProgressBarView;
    @BindView(2131496795)
    RelativeLayout mRightView;
    @BindView(2131498147)
    TextView mSingerView;
    @BindView(2131495606)
    LinearLayout mTopView;
    @BindView(2131495817)
    LinearLayout musicDetailContainer;
    @BindView(2131495820)
    LinearLayout musicItemll;

    @NonNull
    private static String a(int i2) {
        return i2 == 0 ? "popular_song" : i2 == 3 ? "song_category" : i2 == 2 ? "search_result" : "";
    }

    private static String b(int i2) {
        if (i2 == 0) {
            return "music_library_hot";
        }
        if (i2 == 1) {
            return "music_library_mine";
        }
        if (i2 == 2) {
            return "music_library_search";
        }
        if (i2 == 3) {
            return "music_library_list";
        }
        return null;
    }

    public final void a() {
        int i2;
        if (PatchProxy.isSupport(new Object[0], this, f56211a, false, 59914, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56211a, false, 59914, new Class[0], Void.TYPE);
            return;
        }
        CheckableImageView checkableImageView = this.ivMusicCollect;
        if (this.f56214c) {
            i2 = 2130838804;
        } else {
            i2 = 2130838805;
        }
        checkableImageView.setImageResource(i2);
    }

    private void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f56211a, false, 59918, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f56211a, false, 59918, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.musicItemll.setClickable(false);
        a(0, 200, 1, 0, 0, -f56212d, 0, (int) UIUtils.dip2Px(this.f56215e, 30.0f), true);
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f56211a, false, 59905, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f56211a, false, 59905, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        b(z);
    }

    private void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f56211a, false, 59910, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f56211a, false, 59910, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            d(true);
            if (this.f56213b.getMusicType() == MusicModel.MusicType.LOCAL) {
                this.mPlayView.setImageResource(2130839170);
                this.mProgressBarView.setVisibility(8);
            } else if (this.f56213b.getMusicType() == MusicModel.MusicType.ONLINE) {
                if (z) {
                    this.mPlayView.setVisibility(0);
                    this.mPlayView.setImageResource(2130839170);
                    this.mProgressBarView.setVisibility(8);
                    return;
                }
                this.mPlayView.setVisibility(8);
                this.mProgressBarView.setVisibility(0);
            } else if (z) {
                this.mPlayView.setVisibility(0);
                this.mPlayView.setImageResource(2130839170);
                this.mProgressBarView.setVisibility(8);
            } else {
                this.mPlayView.setVisibility(8);
                this.mProgressBarView.setVisibility(0);
            }
        } else {
            if (this.mOkView.getVisibility() == 0) {
                c(true);
            }
            this.mProgressBarView.setVisibility(8);
            this.mPlayView.setVisibility(0);
            this.mPlayView.setImageResource(2130839141);
        }
    }

    private void d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{(byte) 1}, this, f56211a, false, 59919, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{(byte) 1}, this, f56211a, false, 59919, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.musicItemll.setClickable(false);
        int i2 = -f56212d;
        int dip2Px = (int) UIUtils.dip2Px(this.f56215e, 30.0f);
        this.mOkView.setVisibility(0);
        if (ey.a((Context) k.a())) {
            ((ViewGroup.MarginLayoutParams) this.ivCollectFrame.getLayoutParams()).leftMargin = -f56212d;
        } else {
            ((ViewGroup.MarginLayoutParams) this.ivCollectFrame.getLayoutParams()).rightMargin = -f56212d;
        }
        a(100, 200, 0, 1, i2, 0, dip2Px, 0, false);
    }

    @OnClick({2131496789, 2131495606, 2131493598, 2131495817})
    public void onClick(View view) {
        String str;
        String str2;
        if (PatchProxy.isSupport(new Object[]{view}, this, f56211a, false, 59911, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f56211a, false, 59911, new Class[]{View.class}, Void.TYPE);
            return;
        }
        int id = view.getId();
        if (id == C0906R.id.u8) {
            if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).userService().isLogin()) {
                e.a(a.b().a(), a(this.h), "click_favorite_music");
                return;
            }
            if (PatchProxy.isSupport(new Object[0], this, f56211a, false, 59913, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f56211a, false, 59913, new Class[0], Void.TYPE);
            } else if (this.f56213b != null && d.a(this.f56213b, this.g, true)) {
                if (this.j != null) {
                    f<f> fVar = this.j;
                    MusicModel musicModel = this.f56213b;
                    if (this.f56214c) {
                        str2 = "unfollow_type";
                    } else {
                        str2 = "follow_type";
                    }
                    fVar.a(new f(musicModel, str2));
                }
                this.f56214c = !this.f56214c;
                if (PatchProxy.isSupport(new Object[0], this, f56211a, false, 59916, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f56211a, false, 59916, new Class[0], Void.TYPE);
                } else {
                    MobClick obtain = MobClick.obtain();
                    if (this.f56214c) {
                        str = "collection_music";
                    } else {
                        str = "collection_music_cancel";
                    }
                    MobClick extValueLong = obtain.setEventName(str).setLabelName(b(this.h)).setValue(String.valueOf(this.f56213b.getMusicId())).setExtValueLong(0);
                    if (!TextUtils.isEmpty(this.i)) {
                        extValueLong.setJsonObject(c.a().a("search_keyword", this.i).b());
                    }
                    r.onEvent(extValueLong);
                }
                this.ivMusicCollect.b();
            }
        } else if (id == C0906R.id.boe) {
            if (this.f56213b != null && this.f56213b.getMusicStatus() == 0 && this.f56213b.getMusic() != null) {
                String offlineDesc = this.f56213b.getMusic().getOfflineDesc();
                if (TextUtils.isEmpty(offlineDesc)) {
                    offlineDesc = this.g.getString(C0906R.string.bel);
                }
                com.bytedance.ies.dmt.ui.d.a.c(view.getContext(), offlineDesc).a();
                return;
            } else if (this.f56213b != null) {
                if (d.a(this.f56213b, this.itemView.getContext(), true)) {
                    h a2 = h.a();
                    a2.a("aweme://music/detail/" + this.f56213b.getMusicId());
                    if (PatchProxy.isSupport(new Object[0], this, f56211a, false, 59912, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f56211a, false, 59912, new Class[0], Void.TYPE);
                    } else {
                        MobClick value = MobClick.obtain().setEventName("music_detail").setLabelName(b(this.h)).setValue(this.f56213b.getMusicId());
                        if (!TextUtils.isEmpty(this.i)) {
                            value.setJsonObject(c.a().a("search_keyword", this.i).b());
                        }
                        r.onEvent(value);
                        if (com.ss.android.g.a.b()) {
                            HashMap hashMap = new HashMap();
                            hashMap.put("enter_from", b(this.h));
                            hashMap.put("music_id", this.f56213b.getMusicId());
                            hashMap.put("enter_method", "click_cover");
                            hashMap.put("play_mode", "normal");
                            AppLogNewUtils.onEventV3("enter_music_detail", v.a(hashMap));
                        }
                    }
                } else {
                    return;
                }
            }
        }
        if (this.f56216f != null) {
            this.f56216f.a(this, view, this.f56213b);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0252  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0288  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0294  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x02c6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x02e9  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x036a  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0381  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x038e  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0394  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.shortvideo.model.MusicModel r24, java.lang.String r25, boolean r26, int r27) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            r9 = r25
            r10 = 4
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            r12 = 1
            r0[r12] = r9
            java.lang.Byte r1 = java.lang.Byte.valueOf(r26)
            r13 = 2
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
            r14 = 3
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f56211a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r1 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 59906(0xea02, float:8.3946E-41)
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0071
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            java.lang.Byte r1 = java.lang.Byte.valueOf(r26)
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f56211a
            r3 = 0
            r4 = 59906(0xea02, float:8.3946E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r1 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0071:
            if (r8 != 0) goto L_0x0074
            return
        L_0x0074:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            java.lang.Byte r1 = java.lang.Byte.valueOf(r26)
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f56211a
            r3 = 0
            r4 = 59907(0xea03, float:8.3948E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r1 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00dd
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            java.lang.Byte r1 = java.lang.Byte.valueOf(r26)
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
            r0[r14] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f56211a
            r3 = 0
            r4 = 59907(0xea03, float:8.3948E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r1 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            r15 = r27
            goto L_0x03b7
        L_0x00dd:
            r7.f56213b = r8
            r15 = r27
            r7.h = r15
            r7.i = r9
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f56211a
            r3 = 0
            r4 = 59908(0xea04, float:8.3949E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r1 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0117
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r11] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f56211a
            r3 = 0
            r4 = 59908(0xea04, float:8.3949E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r1 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.class
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x012c
        L_0x0117:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$CollectionType r0 = r24.getCollectionType()
            if (r0 == 0) goto L_0x0129
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$CollectionType r0 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.CollectionType.COLLECTED
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$CollectionType r1 = r24.getCollectionType()
            boolean r0 = r0.equals(r1)
            r7.f56214c = r0
        L_0x0129:
            r23.a()
        L_0x012c:
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r9
            java.lang.Byte r1 = java.lang.Byte.valueOf(r11)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f56211a
            r3 = 0
            r4 = 59909(0xea05, float:8.395E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r6 = 8
            if (r0 == 0) goto L_0x017c
            java.lang.Object[] r0 = new java.lang.Object[r13]
            r0[r11] = r9
            java.lang.Byte r1 = java.lang.Byte.valueOf(r11)
            r0[r12] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f56211a
            r3 = 0
            r4 = 59909(0xea05, float:8.395E-41)
            java.lang.Class[] r5 = new java.lang.Class[r13]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r11] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r12] = r1
            java.lang.Class r9 = java.lang.Void.TYPE
            r1 = r23
            r10 = 8
            r6 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
        L_0x0176:
            r0 = r26
            r1 = 8
            goto L_0x0378
        L_0x017c:
            r0 = 8
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r7.f56213b
            java.lang.String r1 = r1.getName()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x024f
            boolean r1 = android.text.TextUtils.isEmpty(r25)
            if (r1 != 0) goto L_0x024f
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r7.f56213b
            java.lang.String r1 = r1.getName()
            int r1 = r1.indexOf(r9)
            if (r1 <= 0) goto L_0x024f
            android.text.SpannableString r2 = new android.text.SpannableString
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r3 = r7.f56213b
            java.lang.String r3 = r3.getName()
            r2.<init>(r3)
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            android.view.View r4 = r7.itemView
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131624986(0x7f0e041a, float:1.8877167E38)
            int r4 = r4.getColor(r5)
            r3.<init>(r4)
            int r4 = r25.length()
            int r4 = r4 + r1
            r5 = 5
            java.lang.Object[] r6 = new java.lang.Object[r5]
            r6[r11] = r2
            r6[r12] = r3
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
            r6[r13] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r6[r14] = r9
            r9 = 17
            java.lang.Integer r16 = java.lang.Integer.valueOf(r9)
            r6[r10] = r16
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.music.adapter.e.f56290a
            r19 = 1
            r20 = 59925(0xea15, float:8.3973E-41)
            java.lang.Class[] r0 = new java.lang.Class[r5]
            java.lang.Class<android.text.SpannableString> r16 = android.text.SpannableString.class
            r0[r11] = r16
            java.lang.Class<java.lang.Object> r16 = java.lang.Object.class
            r0[r12] = r16
            java.lang.Class r16 = java.lang.Integer.TYPE
            r0[r13] = r16
            java.lang.Class r16 = java.lang.Integer.TYPE
            r0[r14] = r16
            java.lang.Class r16 = java.lang.Integer.TYPE
            r0[r10] = r16
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r6
            r21 = r0
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r0 == 0) goto L_0x0245
            java.lang.Object[] r0 = new java.lang.Object[r5]
            r0[r11] = r2
            r0[r12] = r3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0[r13] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0[r14] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0[r10] = r1
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.music.adapter.e.f56290a
            r19 = 1
            r20 = 59925(0xea15, float:8.3973E-41)
            java.lang.Class[] r1 = new java.lang.Class[r5]
            java.lang.Class<android.text.SpannableString> r3 = android.text.SpannableString.class
            r1[r11] = r3
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r1[r12] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r1[r13] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r1[r14] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r1[r10] = r3
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r0
            r21 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0248
        L_0x0245:
            r2.setSpan(r3, r1, r4, r9)
        L_0x0248:
            android.widget.TextView r0 = r7.mNameView
            r0.setText(r2)
            r0 = 1
            goto L_0x0250
        L_0x024f:
            r0 = 0
        L_0x0250:
            if (r0 != 0) goto L_0x027e
            android.widget.TextView r0 = r7.mNameView
            android.view.View r1 = r7.itemView
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131624973(0x7f0e040d, float:1.887714E38)
            int r1 = r1.getColor(r2)
            r0.setTextColor(r1)
            android.widget.TextView r0 = r7.mNameView
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r7.f56213b
            java.lang.String r1 = r1.getName()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0279
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r7.f56213b
            java.lang.String r1 = r1.getName()
            goto L_0x027b
        L_0x0279:
            java.lang.String r1 = ""
        L_0x027b:
            r0.setText(r1)
        L_0x027e:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r7.f56213b
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r0 = r0.getMusicType()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r1 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType.LOCAL
            if (r0 != r1) goto L_0x0294
            android.widget.TextView r0 = r7.mDurationView
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r7.f56213b
            java.lang.String r1 = r1.getLocalMusicDuration()
            r0.setText(r1)
            goto L_0x02b8
        L_0x0294:
            android.widget.TextView r0 = r7.mDurationView
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r7.f56213b
            int r1 = r1.getDuration()
            java.lang.String r1 = com.ss.android.ugc.aweme.music.util.d.a((int) r1)
            r0.setText(r1)
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r7.f56213b
            int r0 = r0.getDuration()
            if (r0 <= 0) goto L_0x02b1
            android.widget.TextView r0 = r7.mDurationView
            r0.setVisibility(r11)
            goto L_0x02b8
        L_0x02b1:
            android.widget.TextView r0 = r7.mDurationView
            r1 = 8
            r0.setVisibility(r1)
        L_0x02b8:
            android.widget.TextView r0 = r7.mSingerView
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r7.f56213b
            java.lang.String r1 = r1.getSinger()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x02d4
            android.view.View r1 = r7.itemView
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131564450(0x7f0d17a2, float:1.8754386E38)
            java.lang.String r1 = r1.getString(r2)
            goto L_0x02da
        L_0x02d4:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r7.f56213b
            java.lang.String r1 = r1.getSinger()
        L_0x02da:
            r0.setText(r1)
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r7.f56213b
            java.lang.String r0 = r0.getPicPremium()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x02f5
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r7.mCoverView
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r7.f56213b
            java.lang.String r1 = r1.getPicPremium()
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (java.lang.String) r1)
            goto L_0x0315
        L_0x02f5:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r7.f56213b
            java.lang.String r0 = r0.getPicBig()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x030d
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r7.mCoverView
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = r7.f56213b
            java.lang.String r1 = r1.getPicBig()
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (java.lang.String) r1)
            goto L_0x0315
        L_0x030d:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r7.mCoverView
            r1 = 2130838872(0x7f020558, float:1.7282739E38)
            com.ss.android.ugc.aweme.base.c.a((com.ss.android.ugc.aweme.base.ui.RemoteImageView) r0, (int) r1)
        L_0x0315:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r0 = r7.f56213b
            boolean r0 = r0.isOriginal()
            r1 = 0
            if (r0 == 0) goto L_0x036a
            android.widget.ImageView r0 = r7.ivOriginMusicMark
            r2 = 8
            r0.setVisibility(r2)
            android.view.View r0 = r7.itemView
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            r2 = 2130839153(0x7f020671, float:1.7283309E38)
            android.graphics.drawable.Drawable r0 = com.ss.android.ugc.bytex.a.a.a.a((android.content.res.Resources) r0, (int) r2)
            android.view.View r2 = r7.itemView
            android.content.Context r2 = r2.getContext()
            r3 = 1098907648(0x41800000, float:16.0)
            float r2 = com.bytedance.common.utility.UIUtils.dip2Px(r2, r3)
            int r2 = (int) r2
            android.view.View r4 = r7.itemView
            android.content.Context r4 = r4.getContext()
            float r3 = com.bytedance.common.utility.UIUtils.dip2Px(r4, r3)
            int r3 = (int) r3
            r0.setBounds(r11, r11, r2, r3)
            android.widget.TextView r2 = r7.mNameView
            r2.setCompoundDrawables(r0, r1, r1, r1)
            android.widget.TextView r0 = r7.mNameView
            android.view.View r1 = r7.itemView
            android.content.Context r1 = r1.getContext()
            r2 = 1073741824(0x40000000, float:2.0)
            float r1 = com.bytedance.common.utility.UIUtils.dip2Px(r1, r2)
            int r1 = (int) r1
            r0.setCompoundDrawablePadding(r1)
            goto L_0x0176
        L_0x036a:
            android.widget.TextView r0 = r7.mNameView
            r0.setCompoundDrawables(r1, r1, r1, r1)
            android.widget.ImageView r0 = r7.ivOriginMusicMark
            r1 = 8
            r0.setVisibility(r1)
            r0 = r26
        L_0x0378:
            r7.b((boolean) r0)
            boolean r0 = r24.isChallengeMusic()
            if (r0 == 0) goto L_0x0386
            android.widget.LinearLayout r0 = r7.musicDetailContainer
            r0.setVisibility(r1)
        L_0x0386:
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r0 = r24.getMusicType()
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel$MusicType r2 = com.ss.android.ugc.aweme.shortvideo.model.MusicModel.MusicType.LOCAL
            if (r0 != r2) goto L_0x0394
            com.ss.android.ugc.aweme.music.ui.CheckableImageView r0 = r7.ivMusicCollect
            r0.setVisibility(r1)
            goto L_0x03ad
        L_0x0394:
            android.widget.LinearLayout r0 = r7.ivCollectFrame
            r0.setVisibility(r11)
            android.widget.LinearLayout r0 = r7.musicDetailContainer
            int r2 = r7.k
            if (r2 != r12) goto L_0x03a0
            r1 = 0
        L_0x03a0:
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r7.musicDetailContainer
            int r1 = r7.k
            if (r1 != r12) goto L_0x03aa
            r11 = 1
        L_0x03aa:
            r0.setEnabled(r11)
        L_0x03ad:
            com.ss.android.ugc.aweme.music.ui.CheckableImageView r0 = r7.ivMusicCollect
            com.ss.android.ugc.aweme.music.adapter.MusicUnitViewHolder$1 r1 = new com.ss.android.ugc.aweme.music.adapter.MusicUnitViewHolder$1
            r1.<init>()
            r0.setOnStateChangeListener(r1)
        L_0x03b7:
            java.lang.String r10 = a((int) r27)
            android.widget.LinearLayout r0 = r7.mTopView
            android.content.Context r0 = r0.getContext()
            java.lang.String r9 = "show_music"
            java.lang.String r11 = r24.getMusicId()
            r12 = 0
            r8 = r0
            com.ss.android.ugc.aweme.common.r.a((android.content.Context) r8, (java.lang.String) r9, (java.lang.String) r10, (java.lang.String) r11, (long) r12)
            java.lang.String r0 = "client_show"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "enter_from"
            java.lang.String r3 = "popular_song"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "music_id"
            java.lang.String r3 = "123321"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "content"
            java.lang.String r3 = "music"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.q.a(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.music.adapter.MusicUnitViewHolder.a(com.ss.android.ugc.aweme.shortvideo.model.MusicModel, java.lang.String, boolean, int):void");
    }

    public MusicUnitViewHolder(View view, d dVar, int i2, MusicMixAdapter.a aVar, f<f> fVar) {
        super(view);
        this.f56215e = view.getContext();
        this.f56216f = dVar;
        this.j = fVar;
        ButterKnife.bind((Object) this, view);
        this.g = view.getContext();
        this.k = i2;
        aVar.ordinal();
        if (f56212d <= 0) {
            this.mOkView.measure(View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(536870911, Integer.MIN_VALUE));
            f56212d = (int) (((float) this.mOkView.getMeasuredWidth()) + UIUtils.dip2Px(this.f56215e, 8.0f));
        }
    }

    private void a(long j2, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        long j3 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), 200, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Byte.valueOf(z ? (byte) 1 : 0)}, this, f56211a, false, 59920, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), 200, Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Byte.valueOf(z)}, this, f56211a, false, 59920, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{i5, i6}).setDuration(200);
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56219a;

            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                if (PatchProxy.isSupport(new Object[]{valueAnimator}, this, f56219a, false, 59923, new Class[]{ValueAnimator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{valueAnimator}, this, f56219a, false, 59923, new Class[]{ValueAnimator.class}, Void.TYPE);
                    return;
                }
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                if (ey.a((Context) k.a())) {
                    ((ViewGroup.MarginLayoutParams) MusicUnitViewHolder.this.ivCollectFrame.getLayoutParams()).leftMargin = intValue;
                } else {
                    ((ViewGroup.MarginLayoutParams) MusicUnitViewHolder.this.ivCollectFrame.getLayoutParams()).rightMargin = intValue;
                }
                MusicUnitViewHolder.this.ivCollectFrame.requestLayout();
            }
        });
        final boolean z2 = z;
        duration.addListener(new AnimatorListenerAdapter() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f56221a;

            public final void onAnimationEnd(Animator animator) {
                if (PatchProxy.isSupport(new Object[]{animator}, this, f56221a, false, 59924, new Class[]{Animator.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{animator}, this, f56221a, false, 59924, new Class[]{Animator.class}, Void.TYPE);
                    return;
                }
                MusicUnitViewHolder.this.musicItemll.setClickable(true);
                if (z2) {
                    MusicUnitViewHolder.this.mOkView.setVisibility(8);
                    if (ey.a((Context) k.a())) {
                        ((ViewGroup.MarginLayoutParams) MusicUnitViewHolder.this.ivCollectFrame.getLayoutParams()).leftMargin = 0;
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) MusicUnitViewHolder.this.ivCollectFrame.getLayoutParams()).rightMargin = 0;
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
        this.mOkView.startAnimation(animationSet);
        duration.start();
    }
}
