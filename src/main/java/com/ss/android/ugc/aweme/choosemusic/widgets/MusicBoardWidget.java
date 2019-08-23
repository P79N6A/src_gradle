package com.ss.android.ugc.aweme.choosemusic.widgets;

import android.arch.lifecycle.Observer;
import android.content.Intent;
import android.support.v4.view.ViewPager;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder;
import com.ss.android.ugc.aweme.arch.widgets.ListItemWidget;
import com.ss.android.ugc.aweme.arch.widgets.base.a;
import com.ss.android.ugc.aweme.choosemusic.b.b;
import com.ss.android.ugc.aweme.choosemusic.d.r;
import com.ss.android.ugc.aweme.choosemusic.f.c;
import com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBoardViewHolder;
import com.ss.android.ugc.aweme.music.adapter.f;
import com.ss.android.ugc.aweme.music.model.MusicCollectionItem;
import com.ss.android.ugc.aweme.music.ui.p;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;

public class MusicBoardWidget extends ListItemWidget<MusicBoardViewHolder> implements Observer<a> {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f36170b;
    public b k;
    public int l;
    int m = -1;
    public int n = -1;
    public int o;
    int p;
    com.ss.android.ugc.aweme.choosemusic.a q;
    List<MusicModel> r;
    public f<com.ss.android.ugc.aweme.choosemusic.a.b> s;
    public boolean[] t = new boolean[3];
    public boolean[] u = new boolean[3];
    public p.a v = new c(this);
    private ViewPager.OnPageChangeListener w = new ViewPager.OnPageChangeListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36171a;

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f2, int i2) {
        }

        public void onPageSelected(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f36171a, false, 27001, new Class[]{Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f36171a, false, 27001, new Class[]{Integer.TYPE}, Void.TYPE);
                return;
            }
            MusicBoardWidget.this.l = i;
            for (int i2 = 0; i2 < MusicBoardWidget.this.u.length; i2++) {
                MusicBoardWidget.this.u[i2] = MusicBoardWidget.this.t[i2];
            }
            MusicBoardWidget.this.f();
        }
    };

    public final void e() {
        for (int i = 0; i < this.u.length; i++) {
            this.t[i] = false;
            this.u[i] = false;
        }
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f36170b, false, 26996, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36170b, false, 26996, new Class[0], Void.TYPE);
            return;
        }
        this.k.a((MusicModel) null);
    }

    public final void f() {
        int i;
        if (PatchProxy.isSupport(new Object[0], this, f36170b, false, 26995, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36170b, false, 26995, new Class[0], Void.TYPE);
        } else if (!CollectionUtils.isEmpty(this.r)) {
            if (this.l * 3 < 0) {
                i = 0;
            } else {
                i = this.l * 3;
            }
            int min = Math.min(i + 3, this.r.size());
            for (int i2 = i; i2 < min; i2++) {
                int i3 = i2 - i;
                if (this.u[i3]) {
                    this.u[i3] = false;
                    MusicModel musicModel = this.r.get(i2);
                    if (musicModel != null) {
                        c.a(this.q, musicModel.getMusicId(), i2, true);
                    }
                }
            }
        }
    }

    public void onCreate() {
        if (PatchProxy.isSupport(new Object[0], this, f36170b, false, 26988, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36170b, false, 26988, new Class[0], Void.TYPE);
            return;
        }
        super.onCreate();
        this.g.a("list", (Observer<a>) this).a("music_index", (Observer<a>) this).a("music_collect_status", (Observer<a>) this).a("play_compeleted", (Observer<a>) this).a("music_loading", (Observer<a>) this);
        this.p = ((Integer) this.g.a("key_choose_music_type")).intValue();
    }

    private void a(List<Object> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f36170b, false, 26990, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f36170b, false, 26990, new Class[]{List.class}, Void.TYPE);
        } else if (list != null && this.n < list.size()) {
            a(((r) list.get(this.n)).f35857b, ((r) list.get(this.n)).f35856a);
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(@android.support.annotation.Nullable java.lang.Object r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            com.ss.android.ugc.aweme.arch.widgets.base.a r8 = (com.ss.android.ugc.aweme.arch.widgets.base.a) r8
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f36170b
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 26991(0x696f, float:3.7822E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0038
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f36170b
            r3 = 0
            r4 = 26991(0x696f, float:3.7822E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.arch.widgets.base.a> r1 = com.ss.android.ugc.aweme.arch.widgets.base.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0038:
            java.lang.String r0 = r8.f34376a
            int r1 = r0.hashCode()
            r2 = 2
            r3 = -1
            switch(r1) {
                case -1635157503: goto L_0x006c;
                case -1322093457: goto L_0x0062;
                case 3322014: goto L_0x0058;
                case 502104354: goto L_0x004e;
                case 1579846200: goto L_0x0044;
                default: goto L_0x0043;
            }
        L_0x0043:
            goto L_0x0076
        L_0x0044:
            java.lang.String r1 = "music_index"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0076
            r0 = 1
            goto L_0x0077
        L_0x004e:
            java.lang.String r1 = "music_loading"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0076
            r0 = 2
            goto L_0x0077
        L_0x0058:
            java.lang.String r1 = "list"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0076
            r0 = 0
            goto L_0x0077
        L_0x0062:
            java.lang.String r1 = "play_compeleted"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0076
            r0 = 4
            goto L_0x0077
        L_0x006c:
            java.lang.String r1 = "music_collect_status"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0076
            r0 = 3
            goto L_0x0077
        L_0x0076:
            r0 = -1
        L_0x0077:
            switch(r0) {
                case 0: goto L_0x01cc;
                case 1: goto L_0x01ac;
                case 2: goto L_0x0110;
                case 3: goto L_0x00be;
                case 4: goto L_0x007c;
                default: goto L_0x007a;
            }
        L_0x007a:
            goto L_0x01da
        L_0x007c:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.g
            java.lang.String r1 = "music_position"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.Object r0 = r0.b((java.lang.String) r1, r2)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r7.g
            java.lang.String r2 = "music_index"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r1.b((java.lang.String) r2, r4)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r7.a((int) r0, (int) r1)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.g
            java.lang.String r1 = "music_position"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r0.a((java.lang.String) r1, (java.lang.Object) r2)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.g
            java.lang.String r1 = "music_index"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            r0.a((java.lang.String) r1, (java.lang.Object) r2)
            r18.g()
            goto L_0x01da
        L_0x00be:
            java.lang.Object r0 = r8.a()
            r8 = r0
            com.ss.android.ugc.aweme.choosemusic.a.a r8 = (com.ss.android.ugc.aweme.choosemusic.a.a) r8
            int r0 = r8.f35737a
            if (r0 != r9) goto L_0x00cf
            int r0 = r7.n
            int r1 = r8.f35738b
            if (r0 == r1) goto L_0x00d3
        L_0x00cf:
            int r0 = r8.f35737a
            if (r0 != 0) goto L_0x01da
        L_0x00d3:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f36170b
            r3 = 0
            r4 = 26992(0x6970, float:3.7824E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.choosemusic.a.a> r1 = com.ss.android.ugc.aweme.choosemusic.a.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0104
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f36170b
            r3 = 0
            r4 = 26992(0x6970, float:3.7824E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.choosemusic.a.a> r1 = com.ss.android.ugc.aweme.choosemusic.a.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01da
        L_0x0104:
            com.ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder r0 = r7.f34346a
            if (r0 == 0) goto L_0x010f
            com.ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder r0 = r7.f34346a
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBoardViewHolder r0 = (com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBoardViewHolder) r0
            r0.a((com.ss.android.ugc.aweme.choosemusic.a.a) r8)
        L_0x010f:
            return
        L_0x0110:
            com.ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder r0 = r7.f34346a
            if (r0 == 0) goto L_0x01da
            com.ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder r0 = r7.f34346a
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBoardViewHolder r0 = (com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBoardViewHolder) r0
            int r1 = r7.m
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r3 = r7.g
            java.lang.String r4 = "music_loading"
            java.lang.Object r3 = r3.a((java.lang.String) r4)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r11[r10] = r4
            java.lang.Byte r4 = java.lang.Byte.valueOf(r3)
            r11[r9] = r4
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBoardViewHolder.f36069c
            r14 = 0
            r15 = 26883(0x6903, float:3.7671E-41)
            java.lang.Class[] r4 = new java.lang.Class[r2]
            java.lang.Class r5 = java.lang.Integer.TYPE
            r4[r10] = r5
            java.lang.Class r5 = java.lang.Boolean.TYPE
            r4[r9] = r5
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r4
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r4 == 0) goto L_0x0176
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11[r10] = r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r3)
            r11[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.choosemusic.viewholder.MusicBoardViewHolder.f36069c
            r14 = 0
            r15 = 26883(0x6903, float:3.7671E-41)
            java.lang.Class[] r1 = new java.lang.Class[r2]
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r10] = r2
            java.lang.Class r2 = java.lang.Boolean.TYPE
            r1[r9] = r2
            java.lang.Class r17 = java.lang.Void.TYPE
            r12 = r0
            r16 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            goto L_0x01da
        L_0x0176:
            if (r1 < 0) goto L_0x01ab
        L_0x0178:
            android.support.v4.view.ViewPager r2 = r0.mVpMusicContainer
            int r2 = r2.getChildCount()
            if (r10 >= r2) goto L_0x01ab
            android.support.v4.view.ViewPager r2 = r0.mVpMusicContainer
            android.view.View r2 = r2.getChildAt(r10)
            com.ss.android.ugc.aweme.choosemusic.view.g r2 = (com.ss.android.ugc.aweme.choosemusic.view.g) r2
            if (r2 == 0) goto L_0x01ab
            java.util.ArrayList r2 = r2.getMusicItemViews()
            if (r2 == 0) goto L_0x01ab
            java.util.Iterator r2 = r2.iterator()
        L_0x0194:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L_0x01a8
            java.lang.Object r4 = r2.next()
            com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder r4 = (com.ss.android.ugc.aweme.choosemusic.viewholder.MusicItemViewHolder) r4
            int r5 = r4.f36103e
            if (r5 != r1) goto L_0x0194
            r4.a((boolean) r3, (boolean) r9)
            goto L_0x01da
        L_0x01a8:
            int r10 = r10 + 1
            goto L_0x0178
        L_0x01ab:
            return
        L_0x01ac:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r7.g
            java.lang.String r1 = "music_position"
            java.lang.Object r0 = r0.a((java.lang.String) r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r7.g
            java.lang.String r2 = "music_index"
            java.lang.Object r1 = r1.a((java.lang.String) r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r7.a((int) r0, (int) r1)
            return
        L_0x01cc:
            com.ss.android.ugc.aweme.arch.widgets.ItemWidgetViewHolder r0 = r7.f34346a
            if (r0 == 0) goto L_0x01da
            java.lang.Object r0 = r8.a()
            java.util.List r0 = (java.util.List) r0
            r7.a((java.util.List<java.lang.Object>) r0)
            return
        L_0x01da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.choosemusic.widgets.MusicBoardWidget.onChanged(java.lang.Object):void");
    }

    public final void a(ItemWidgetViewHolder itemWidgetViewHolder) {
        if (PatchProxy.isSupport(new Object[]{itemWidgetViewHolder}, this, f36170b, false, 26989, new Class[]{ItemWidgetViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{itemWidgetViewHolder}, this, f36170b, false, 26989, new Class[]{ItemWidgetViewHolder.class}, Void.TYPE);
            return;
        }
        super.a(itemWidgetViewHolder);
        a((List) this.g.a("list"));
    }

    private void a(int i, int i2) {
        int i3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f36170b, false, 26993, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f36170b, false, 26993, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f34346a != null) {
            MusicBoardViewHolder musicBoardViewHolder = (MusicBoardViewHolder) this.f34346a;
            int i4 = this.m;
            if (i == this.n) {
                i3 = i2;
            } else {
                i3 = -1;
            }
            musicBoardViewHolder.a(i4, i3);
        }
        if (i != this.n) {
            this.m = -1;
        } else if (this.m == i2) {
            this.k.a((MusicModel) null);
        } else {
            this.m = i2;
        }
    }

    private void a(List<MusicModel> list, MusicCollectionItem musicCollectionItem) {
        List<MusicModel> list2 = list;
        MusicCollectionItem musicCollectionItem2 = musicCollectionItem;
        if (PatchProxy.isSupport(new Object[]{list2, musicCollectionItem2}, this, f36170b, false, 26994, new Class[]{List.class, MusicCollectionItem.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, musicCollectionItem2}, this, f36170b, false, 26994, new Class[]{List.class, MusicCollectionItem.class}, Void.TYPE);
        } else if (list2 != null && musicCollectionItem2 != null) {
            if (this.n == 0) {
                ((MusicBoardViewHolder) this.f34346a).b();
            } else {
                ((MusicBoardViewHolder) this.f34346a).a();
            }
            this.r = list2;
            this.q = new com.ss.android.ugc.aweme.choosemusic.a("change_music_page", musicCollectionItem2.mcName, "", c.a());
            this.q.f35735e = musicCollectionItem2.mcId;
            ((MusicBoardViewHolder) this.f34346a).a(this.w);
            ((MusicBoardViewHolder) this.f34346a).a(musicCollectionItem, list, this.l, this.m, this.n, this.q, musicCollectionItem2.isHot);
            ((MusicBoardViewHolder) this.f34346a).a((com.ss.android.ugc.aweme.choosemusic.view.f) new d(this, musicCollectionItem2), this.s);
        }
    }

    public final void a(int i, int i2, Intent intent) {
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f36170b, false, 26997, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), intent2}, this, f36170b, false, 26997, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        if (i2 == -1) {
            if (i == this.o) {
                c().setResult(-1, intent2);
                c().finish();
            }
        }
    }
}
