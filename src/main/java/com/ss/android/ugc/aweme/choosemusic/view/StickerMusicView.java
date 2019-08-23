package com.ss.android.ugc.aweme.choosemusic.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder;
import com.ss.android.ugc.aweme.choosemusic.a;
import com.ss.android.ugc.aweme.choosemusic.f.c;
import com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder;
import java.util.ArrayList;
import java.util.List;

public class StickerMusicView extends ItemWidgetViewHolder {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f36039c;

    /* renamed from: d  reason: collision with root package name */
    public List<MusicItemViewHolder> f36040d = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public boolean f36041e;

    /* renamed from: f  reason: collision with root package name */
    private Context f36042f;
    private int g;
    private a h;
    @BindView(2131495517)
    LinearLayout mLlMusicContainer;
    @BindView(2131498232)
    TextView mTvwContent;
    @BindView(2131495516)
    LinearLayout mVgContainer;
    @BindView(2131498571)
    View mVwDivider;

    public StickerMusicView(View view, int i) {
        super(view);
        this.f36042f = view.getContext();
        ButterKnife.bind((Object) this, view);
        this.g = i;
        this.mTvwContent.getPaint().setFakeBoldText(true);
        if (com.ss.android.g.a.a()) {
            float dip2Px = UIUtils.dip2Px(this.f36042f, 16.0f);
            this.mVgContainer.setPadding(0, 0, 0, 0);
            this.mVgContainer.setBackgroundColor(0);
            ((ViewGroup.MarginLayoutParams) this.mVgContainer.getLayoutParams()).rightMargin = 0;
            this.mVgContainer.requestLayout();
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mTvwContent.getLayoutParams();
            marginLayoutParams.rightMargin = (int) (((float) marginLayoutParams.rightMargin) + dip2Px);
            ((ViewGroup.MarginLayoutParams) this.mVwDivider.getLayoutParams()).rightMargin = (int) dip2Px;
            this.mVwDivider.setVisibility(0);
        }
        this.h = new a("change_music_page", "attached_song", "", c.a());
        this.h.f35732b = "prop";
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0165  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.List<com.ss.android.ugc.aweme.shortvideo.model.MusicModel> r26, int r27, int r28, boolean r29, java.lang.String r30, com.ss.android.ugc.aweme.choosemusic.view.f r31, com.ss.android.ugc.aweme.music.adapter.f<com.ss.android.ugc.aweme.choosemusic.a.b> r32) {
        /*
            r25 = this;
            r7 = r25
            r8 = r26
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = 7
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r13 = 0
            r0[r13] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
            r14 = 1
            r0[r14] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)
            r15 = 2
            r0[r15] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r29)
            r16 = 3
            r0[r16] = r1
            r17 = 4
            r0[r17] = r9
            r18 = 5
            r0[r18] = r10
            r19 = 6
            r0[r19] = r11
            com.meituan.robust.ChangeQuickRedirect r2 = f36039c
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r13] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r14] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r15] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r16] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r17] = r1
            java.lang.Class<com.ss.android.ugc.aweme.choosemusic.view.f> r1 = com.ss.android.ugc.aweme.choosemusic.view.f.class
            r5[r18] = r1
            java.lang.Class<com.ss.android.ugc.aweme.music.adapter.f> r1 = com.ss.android.ugc.aweme.music.adapter.f.class
            r5[r19] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 26866(0x68f2, float:3.7647E-41)
            r1 = r25
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00b2
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r27)
            r0[r14] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r28)
            r0[r15] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r29)
            r0[r16] = r1
            r0[r17] = r9
            r0[r18] = r10
            r0[r19] = r11
            com.meituan.robust.ChangeQuickRedirect r1 = f36039c
            r2 = 0
            r3 = 26866(0x68f2, float:3.7647E-41)
            java.lang.Class[] r4 = new java.lang.Class[r12]
            java.lang.Class<java.util.List> r5 = java.util.List.class
            r4[r13] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r14] = r5
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r15] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
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
        L_0x00b2:
            boolean r0 = r7.f36041e
            if (r0 == 0) goto L_0x00bf
            android.widget.TextView r0 = r7.mTvwContent
            r1 = 2131562019(0x7f0d0e23, float:1.8749455E38)
            r0.setText(r1)
            goto L_0x00d2
        L_0x00bf:
            if (r29 == 0) goto L_0x00ca
            android.widget.TextView r0 = r7.mTvwContent
            r1 = 2131561586(0x7f0d0c72, float:1.8748577E38)
            r0.setText(r1)
            goto L_0x00d2
        L_0x00ca:
            android.widget.TextView r0 = r7.mTvwContent
            r1 = 2131562020(0x7f0d0e24, float:1.8749457E38)
            r0.setText(r1)
        L_0x00d2:
            int r0 = r26.size()
            android.widget.LinearLayout r1 = r7.mLlMusicContainer
            int r1 = r1.getChildCount()
            int r0 = r0 - r1
            com.ss.android.ugc.aweme.choosemusic.a r1 = r7.h
            r1.f35736f = r9
            android.content.Context r1 = r7.f36042f
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r2 = 0
        L_0x00e8:
            if (r2 >= r0) goto L_0x0116
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder r3 = new com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder
            r4 = 2131690385(0x7f0f0391, float:1.9009812E38)
            android.widget.LinearLayout r5 = r7.mLlMusicContainer
            android.view.View r4 = r1.inflate(r4, r5, r13)
            int r5 = r7.g
            r3.<init>(r4, r5)
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r4 = r7.f36040d
            r4.add(r3)
            boolean r4 = com.ss.android.g.a.a()
            if (r4 != 0) goto L_0x0109
            r3.a()
            goto L_0x010c
        L_0x0109:
            r3.b()
        L_0x010c:
            android.widget.LinearLayout r4 = r7.mLlMusicContainer
            android.view.View r3 = r3.itemView
            r4.addView(r3)
            int r2 = r2 + 1
            goto L_0x00e8
        L_0x0116:
            r0 = 0
        L_0x0117:
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r1 = r7.f36040d
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x016d
            java.util.List<com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder> r1 = r7.f36040d
            java.lang.Object r1 = r1.get(r0)
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder r1 = (com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder) r1
            java.lang.Object r2 = r8.get(r0)
            r16 = r2
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r16 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r16
            java.lang.String r17 = ""
            r18 = 0
            r2 = -2
            r3 = r27
            if (r2 != r3) goto L_0x013f
            r2 = r28
            if (r0 != r2) goto L_0x0141
            r19 = 1
            goto L_0x0143
        L_0x013f:
            r2 = r28
        L_0x0141:
            r19 = 0
        L_0x0143:
            r20 = 0
            r21 = 0
            r22 = 0
            com.ss.android.ugc.aweme.choosemusic.a r4 = r7.h
            r15 = r1
            r23 = r0
            r24 = r4
            r15.a((com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r16, (java.lang.String) r17, (boolean) r18, (boolean) r19, (boolean) r20, (int) r21, (int) r22, (int) r23, (com.ss.android.ugc.aweme.choosemusic.a) r24)
            r1.a((com.ss.android.ugc.aweme.choosemusic.view.f) r10, (com.ss.android.ugc.aweme.music.adapter.f<com.ss.android.ugc.aweme.choosemusic.a.b>) r11)
            java.lang.Object r1 = r8.get(r0)
            com.ss.android.ugc.aweme.shortvideo.model.MusicModel r1 = (com.ss.android.ugc.aweme.shortvideo.model.MusicModel) r1
            com.ss.android.ugc.aweme.choosemusic.a r4 = r7.h
            if (r1 == 0) goto L_0x0165
            java.lang.String r1 = r1.getMusicId()
            goto L_0x0167
        L_0x0165:
            java.lang.String r1 = ""
        L_0x0167:
            com.ss.android.ugc.aweme.choosemusic.f.c.a((com.ss.android.ugc.aweme.choosemusic.a) r4, (java.lang.String) r1, (int) r0, (boolean) r14)
            int r0 = r0 + 1
            goto L_0x0117
        L_0x016d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.view.StickerMusicView.a(java.util.List, int, int, boolean, java.lang.String, com.ss.android.ugc.aweme.choosemusic.view.f, com.ss.android.ugc.aweme.music.adapter.f):void");
    }
}
