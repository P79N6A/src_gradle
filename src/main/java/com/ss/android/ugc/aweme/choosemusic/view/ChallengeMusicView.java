package com.ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder;
import com.ss.android.ugc.aweme.choosemusic.a;
import com.ss.android.ugc.aweme.choosemusic.f.c;
import com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;
import java.util.ArrayList;
import java.util.List;

public class ChallengeMusicView extends ItemWidgetViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f36012c;

    /* renamed from: d  reason: collision with root package name */
    public List<MusicItemViewHolder> f36013d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    int f36014e;

    /* renamed from: f  reason: collision with root package name */
    a f36015f;
    private Context g;
    @BindView(2131495517)
    LinearLayout mLlMusicContainer;
    @BindView(2131498232)
    TextView mTvwContent;
    @BindView(2131495516)
    LinearLayout mVgContainer;
    @BindView(2131498571)
    View mVwDivider;

    public final void a(final String str) {
        SpannableString spannableString;
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f36012c, false, 26825, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f36012c, false, 26825, new Class[]{String.class}, Void.TYPE);
            return;
        }
        int measuredWidth = this.mTvwContent.getMeasuredWidth();
        if (measuredWidth == 0) {
            this.mTvwContent.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f36016a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f36016a, false, 26826, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f36016a, false, 26826, new Class[0], Void.TYPE);
                        return;
                    }
                    ChallengeMusicView.this.a(str);
                }
            });
            return;
        }
        String str3 = "#" + str;
        TextPaint paint = this.mTvwContent.getPaint();
        String string = this.g.getString(C0906R.string.bwb);
        float measureText = ((float) measuredWidth) - paint.measureText(string.replace("%s", ""));
        if (paint.measureText(str3) > measureText) {
            str2 = String.format(string, new Object[]{TextUtils.ellipsize(str3, paint, measureText, TextUtils.TruncateAt.END)});
            spannableString = new SpannableString(str2);
        } else {
            str2 = String.format(string, new Object[]{str3});
            spannableString = new SpannableString(str2);
        }
        b.a(spannableString, new StyleSpan(1), string.indexOf("%s"), ((string.indexOf("%s") + 2) + str2.length()) - string.length(), 17);
        this.mTvwContent.setText(spannableString);
    }

    public ChallengeMusicView(View view, int i) {
        super(view);
        this.g = view.getContext();
        ButterKnife.bind((Object) this, view);
        this.f36014e = i;
        if (com.ss.android.g.a.a()) {
            float dip2Px = UIUtils.dip2Px(this.g, 16.0f);
            this.mVgContainer.setPadding(0, 0, 0, 0);
            this.mVgContainer.setBackgroundColor(0);
            ((ViewGroup.MarginLayoutParams) this.mVgContainer.getLayoutParams()).rightMargin = 0;
            this.mVgContainer.requestLayout();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mTvwContent.getLayoutParams();
            marginLayoutParams.rightMargin = (int) (((float) marginLayoutParams.rightMargin) + dip2Px);
            ((ViewGroup.MarginLayoutParams) this.mVwDivider.getLayoutParams()).rightMargin = (int) dip2Px;
            this.mVwDivider.setVisibility(0);
        }
        this.f36015f = new a("change_music_page", "attached_song", "", c.a());
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0142  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0147  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(com.ss.android.ugc.aweme.discover.model.Challenge r26, java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r27, int r28, int r29, java.lang.String r30, com.ss.android.ugc.aweme.choosemusic.view.f r31, com.ss.android.ugc.aweme.music.adapter.f<com.ss.android.ugc.aweme.choosemusic.a.b> r32) {
        /*
            r25 = this;
            r7 = r25
            r8 = r27
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = 7
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r13 = 0
            r0[r13] = r26
            r14 = 1
            r0[r14] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)
            r15 = 2
            r0[r15] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r29)
            r16 = 3
            r0[r16] = r1
            r17 = 4
            r0[r17] = r9
            r18 = 5
            r0[r18] = r10
            r19 = 6
            r0[r19] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f36012c
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.Challenge> r1 = com.ss.android.ugc.aweme.discover.model.Challenge.class
            r5[r13] = r1
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r14] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r15] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r16] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r17] = r1
            java.lang.Class<com.ss.android.ugc.aweme.choosemusic.view.f> r1 = com.ss.android.ugc.aweme.choosemusic.view.f.class
            r5[r18] = r1
            java.lang.Class<com.ss.android.ugc.aweme.music.adapter.f> r1 = com.ss.android.ugc.aweme.music.adapter.f.class
            r5[r19] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 26824(0x68c8, float:3.7588E-41)
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00aa
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r26
            r0[r14] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)
            r0[r15] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r29)
            r0[r16] = r1
            r0[r17] = r9
            r0[r18] = r10
            r0[r19] = r11
            com.meituan.robust.ChangeQuickRedirect r1 = f36012c
            r2 = 0
            r3 = 26824(0x68c8, float:3.7588E-41)
            java.lang.Class[] r4 = new java.lang.Class[r12]
            java.lang.Class<com.ss.android.ugc.aweme.discover.model.Challenge> r5 = com.ss.android.ugc.aweme.discover.model.Challenge.class
            r4[r13] = r5
            java.lang.Class<java.util.List> r5 = java.util.List.class
            r4[r14] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r15] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r16] = r5
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r17] = r5
            java.lang.Class<com.ss.android.ugc.aweme.choosemusic.view.f> r5 = com.ss.android.ugc.aweme.choosemusic.view.f.class
            r4[r18] = r5
            java.lang.Class<com.ss.android.ugc.aweme.music.adapter.f> r5 = com.ss.android.ugc.aweme.music.adapter.f.class
            r4[r19] = r5
            java.lang.Class r5 = java.lang.Void.TYPE
            r26 = r0
            r27 = r25
            r28 = r1
            r29 = r2
            r30 = r3
            r31 = r4
            r32 = r5
            com.meituan.robust.PatchProxy.accessDispatch(r26, r27, r28, r29, r30, r31, r32)
            return
        L_0x00aa:
            if (r26 != 0) goto L_0x00ad
            return
        L_0x00ad:
            android.content.Context r0 = r7.g
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            java.lang.String r1 = r26.getChallengeName()
            r7.a(r1)
            com.ss.android.ugc.aweme.choosemusic.a r1 = r7.f36015f
            r1.g = r9
            int r1 = r27.size()
            android.widget.LinearLayout r2 = r7.mLlMusicContainer
            int r2 = r2.getChildCount()
            int r1 = r1 - r2
            r2 = 0
        L_0x00ca:
            if (r2 >= r1) goto L_0x00f8
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder r3 = new com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder
            r4 = 2131690385(0x7f0f0391, float:1.9009812E38)
            android.widget.LinearLayout r5 = r7.mLlMusicContainer
            android.view.View r4 = r0.inflate(r4, r5, r13)
            int r5 = r7.f36014e
            r3.<init>(r4, r5)
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r4 = r7.f36013d
            r4.add(r3)
            boolean r4 = com.ss.android.g.a.a()
            if (r4 != 0) goto L_0x00eb
            r3.a()
            goto L_0x00ee
        L_0x00eb:
            r3.b()
        L_0x00ee:
            android.widget.LinearLayout r4 = r7.mLlMusicContainer
            android.view.View r3 = r3.itemView
            r4.addView(r3)
            int r2 = r2 + 1
            goto L_0x00ca
        L_0x00f8:
            r0 = 0
        L_0x00f9:
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r1 = r7.f36013d
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x014f
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r1 = r7.f36013d
            java.lang.Object r1 = r1.get(r0)
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder r1 = (com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder) r1
            java.lang.Object r2 = r8.get(r0)
            r16 = r2
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r16 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r16
            java.lang.String r17 = ""
            r18 = 0
            r2 = -2
            r3 = r28
            if (r3 != r2) goto L_0x0121
            r2 = r29
            if (r0 != r2) goto L_0x0123
            r19 = 1
            goto L_0x0125
        L_0x0121:
            r2 = r29
        L_0x0123:
            r19 = 0
        L_0x0125:
            r20 = 0
            r21 = 0
            r22 = 0
            com.ss.android.ugc.aweme.choosemusic.a r4 = r7.f36015f
            r15 = r1
            r23 = r0
            r24 = r4
            r15.a((com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r16, (java.lang.String) r17, (boolean) r18, (boolean) r19, (boolean) r20, (int) r21, (int) r22, (int) r23, (com.ss.android.ugc.aweme.choosemusic.a) r24)
            r1.a((com.ss.android.ugc.aweme.choosemusic.view.f) r10, (com.ss.android.ugc.aweme.music.adapter.f<com.ss.android.ugc.aweme.choosemusic.a.b>) r11)
            java.lang.Object r1 = r8.get(r0)
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r1
            com.ss.android.ugc.aweme.choosemusic.a r4 = r7.f36015f
            if (r1 == 0) goto L_0x0147
            java.lang.String r1 = r1.getMusicId()
            goto L_0x0149
        L_0x0147:
            java.lang.String r1 = ""
        L_0x0149:
            com.ss.android.ugc.aweme.choosemusic.f.c.a((com.ss.android.ugc.aweme.choosemusic.a) r4, (java.lang.String) r1, (int) r0, (boolean) r14)
            int r0 = r0 + 1
            goto L_0x00f9
        L_0x014f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.view.ChallengeMusicView.a(com.ss.android.ugc.aweme.discover.model.Challenge, java.util.List, int, int, java.lang.String, com.ss.android.ugc.aweme.choosemusic.view.f, com.ss.android.ugc.aweme.music.adapter.f):void");
    }
}
