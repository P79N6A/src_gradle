package com.ss.android.ugc.aweme.shortvideo.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.common.collect.ak;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.shortvideo.adapter.PublishSyncItemView;
import com.ss.android.ugc.aweme.shortvideo.model.VideoPublishSyncModel;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PublishSyncAdapter extends RecyclerView.Adapter<PublishSyncItemViewHolder<PublishSyncItemView>> implements PublishSyncItemView.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f65460a;

    /* renamed from: b  reason: collision with root package name */
    public Set<Integer> f65461b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private List<VideoPublishSyncModel> f65462c;

    public int getItemCount() {
        int i = 0;
        if (PatchProxy.isSupport(new Object[0], this, f65460a, false, 74962, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f65460a, false, 74962, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f65462c != null) {
            i = this.f65462c.size();
        }
        return i;
    }

    public PublishSyncAdapter(List<VideoPublishSyncModel> list) {
        this.f65462c = list;
    }

    public final void a(int i, boolean z) {
        String str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : 0)}, this, f65460a, false, 74963, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Byte.valueOf(z)}, this, f65460a, false, 74963, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            this.f65461b.add(Integer.valueOf(i));
        } else {
            this.f65461b.remove(Integer.valueOf(i));
        }
        if (z) {
            str = "sync_toutiao_enable";
        } else {
            str = "sync_toutiao_disable";
        }
        r.a(str, (Map) ak.of("enter_from", "video_post_page"));
    }

    public /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f65460a, false, 74960, new Class[]{ViewGroup.class, Integer.TYPE}, PublishSyncItemViewHolder.class)) {
            return new PublishSyncItemViewHolder((PublishSyncItemView) LayoutInflater.from(viewGroup.getContext()).inflate(C0906R.layout.z9, viewGroup2, false));
        }
        return (PublishSyncItemViewHolder) PatchProxy.accessDispatch(new Object[]{viewGroup2, Integer.valueOf(i)}, this, f65460a, false, 74960, new Class[]{ViewGroup.class, Integer.TYPE}, PublishSyncItemViewHolder.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:53:0x01ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onBindViewHolder(android.support.v7.widget.RecyclerView.ViewHolder r20, int r21) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            com.ss.android.ugc.aweme.shortvideo.adapter.PublishSyncItemViewHolder r8 = (com.ss.android.ugc.aweme.shortvideo.adapter.PublishSyncItemViewHolder) r8
            r9 = 2
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            r11 = 1
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f65460a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.adapter.PublishSyncItemViewHolder> r1 = com.ss.android.ugc.aweme.shortvideo.adapter.PublishSyncItemViewHolder.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 74961(0x124d1, float:1.05043E-40)
            r1 = r19
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004f
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            java.lang.Integer r1 = java.lang.Integer.valueOf(r21)
            r0[r11] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f65460a
            r3 = 0
            r4 = 74961(0x124d1, float:1.05043E-40)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.adapter.PublishSyncItemViewHolder> r1 = com.ss.android.ugc.aweme.shortvideo.adapter.PublishSyncItemViewHolder.class
            r5[r10] = r1
            java.lang.Class r1 = java.lang.Integer.TYPE
            r5[r11] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r19
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x004f:
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.VideoPublishSyncModel> r0 = r7.f65462c
            if (r0 == 0) goto L_0x01dc
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.VideoPublishSyncModel> r0 = r7.f65462c
            int r0 = r0.size()
            if (r0 > 0) goto L_0x005d
            goto L_0x01dc
        L_0x005d:
            T r0 = r8.f65465a
            r0.setItemClick(r7)
            T r0 = r8.f65465a
            java.util.List<com.ss.android.ugc.aweme.shortvideo.model.VideoPublishSyncModel> r1 = r7.f65462c
            r2 = r21
            java.lang.Object r1 = r1.get(r2)
            com.ss.android.ugc.aweme.shortvideo.model.VideoPublishSyncModel r1 = (com.ss.android.ugc.aweme.shortvideo.model.VideoPublishSyncModel) r1
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.adapter.PublishSyncItemView.f3886a
            r15 = 0
            r16 = 74965(0x124d5, float:1.05048E-40)
            java.lang.Class[] r2 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.VideoPublishSyncModel> r3 = com.ss.android.ugc.aweme.shortvideo.model.VideoPublishSyncModel.class
            r2[r10] = r3
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x00a2
            java.lang.Object[] r12 = new java.lang.Object[r11]
            r12[r10] = r1
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.adapter.PublishSyncItemView.f3886a
            r15 = 0
            r16 = 74965(0x124d5, float:1.05048E-40)
            java.lang.Class[] r1 = new java.lang.Class[r11]
            java.lang.Class<com.ss.android.ugc.aweme.shortvideo.model.VideoPublishSyncModel> r2 = com.ss.android.ugc.aweme.shortvideo.model.VideoPublishSyncModel.class
            r1[r10] = r2
            java.lang.Class r18 = java.lang.Void.TYPE
            r13 = r0
            r17 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            return
        L_0x00a2:
            if (r1 == 0) goto L_0x01db
            r0.f3887b = r1
            com.ss.android.ugc.aweme.views.AutoRTLImageView r2 = r0.mIvIcon
            com.ss.android.ugc.aweme.shortvideo.model.VideoPublishSyncModel r3 = r0.f3887b
            int r3 = r3.mIconId
            r2.setImageResource(r3)
            android.widget.TextView r2 = r0.mTvName
            com.ss.android.ugc.aweme.shortvideo.model.VideoPublishSyncModel r3 = r0.f3887b
            java.lang.String r3 = r3.mSyncName
            r2.setText(r3)
            com.ss.android.ugc.aweme.shortvideo.model.VideoPublishSyncModel r2 = r0.f3887b
            int r2 = r2.mType
            if (r2 != 0) goto L_0x00d2
            com.ss.android.ugc.aweme.app.SharePrefCache r2 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r2 = r2.isPublishSyncToHuoshan()
            java.lang.Object r2 = r2.c()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r10 = r2.booleanValue()
            goto L_0x01bf
        L_0x00d2:
            com.ss.android.ugc.aweme.shortvideo.model.VideoPublishSyncModel r2 = r0.f3887b
            int r2 = r2.mType
            if (r2 != r11) goto L_0x01c1
            com.ss.android.ugc.aweme.setting.AbTestManager r2 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r2 = r2.bi()
            if (r2 == 0) goto L_0x016e
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.adapter.PublishSyncItemView.f3886a
            r15 = 0
            r16 = 74966(0x124d6, float:1.0505E-40)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r13 = r0
            r17 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r12, r13, r14, r15, r16, r17, r18)
            if (r2 == 0) goto L_0x0111
            java.lang.Object[] r12 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r14 = com.ss.android.ugc.aweme.shortvideo.adapter.PublishSyncItemView.f3886a
            r15 = 0
            r16 = 74966(0x124d6, float:1.0505E-40)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r18 = java.lang.Boolean.TYPE
            r13 = r0
            r17 = r2
            java.lang.Object r2 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r10 = r2.booleanValue()
            goto L_0x016b
        L_0x0111:
            com.ss.android.ugc.aweme.global.config.settings.pojo.a r2 = com.ss.android.ugc.aweme.global.config.settings.g.b()
            java.lang.Boolean r2 = r2.bq()
            boolean r2 = r2.booleanValue()
            boolean r3 = com.ss.android.ugc.aweme.shortvideo.util.ac.a()
            com.ss.android.ugc.aweme.app.SharePrefCache r4 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r4 = r4.getSyncTT()
            java.lang.Object r4 = r4.c()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            if (r4 != r11) goto L_0x0137
            r4 = 1
            goto L_0x0138
        L_0x0137:
            r4 = 0
        L_0x0138:
            com.ss.android.ugc.aweme.app.SharePrefCache r5 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r5 = r5.isPublishSyncToToutiaoNew()
            java.lang.Object r5 = r5.c()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            if (r5 == r11) goto L_0x0151
            if (r5 != r9) goto L_0x014f
            goto L_0x0151
        L_0x014f:
            r6 = 0
            goto L_0x0152
        L_0x0151:
            r6 = 1
        L_0x0152:
            if (r6 == 0) goto L_0x0158
            if (r5 != r11) goto L_0x016b
        L_0x0156:
            r10 = 1
            goto L_0x016b
        L_0x0158:
            if (r2 == 0) goto L_0x015f
            if (r3 == 0) goto L_0x015f
            if (r4 == 0) goto L_0x016b
            goto L_0x0156
        L_0x015f:
            if (r2 == 0) goto L_0x0164
            if (r3 != 0) goto L_0x0164
            goto L_0x016b
        L_0x0164:
            if (r2 != 0) goto L_0x016b
            if (r3 == 0) goto L_0x016b
            if (r4 == 0) goto L_0x016b
            goto L_0x0156
        L_0x016b:
            r0.f3889d = r10
            goto L_0x01c1
        L_0x016e:
            com.ss.android.ugc.aweme.app.SharePrefCache r2 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r2 = r2.isPublishSyncToToutiao()
            java.lang.Object r2 = r2.c()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r0.f3889d = r2
            com.ss.android.ugc.aweme.app.SharePrefCache r2 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r2 = r2.isFirstPublishSync()
            java.lang.Object r2 = r2.c()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            com.ss.android.ugc.aweme.app.SharePrefCache r3 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r3 = r3.getIsTargetBindingUser()
            java.lang.Object r3 = r3.c()
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r2 == 0) goto L_0x01c1
            if (r3 == 0) goto L_0x01c1
            com.ss.android.ugc.aweme.app.SharePrefCache r2 = com.ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.an r2 = r2.getSyncTT()
            java.lang.Object r2 = r2.c()
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r2 != r11) goto L_0x01bf
            r10 = 1
        L_0x01bf:
            r0.f3889d = r10
        L_0x01c1:
            boolean r2 = r0.f3889d
            r0.setSelected(r2)
            com.ss.android.ugc.aweme.shortvideo.adapter.PublishSyncItemView$a r2 = r0.f3888c
            if (r2 == 0) goto L_0x01d3
            com.ss.android.ugc.aweme.shortvideo.adapter.PublishSyncItemView$a r2 = r0.f3888c
            int r1 = r1.mType
            boolean r3 = r0.f3889d
            r2.a(r1, r3)
        L_0x01d3:
            com.ss.android.ugc.aweme.shortvideo.adapter.PublishSyncItemView$1 r1 = new com.ss.android.ugc.aweme.shortvideo.adapter.PublishSyncItemView$1
            r1.<init>()
            r0.setOnClickListener(r1)
        L_0x01db:
            return
        L_0x01dc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.shortvideo.adapter.PublishSyncAdapter.onBindViewHolder(android.support.v7.widget.RecyclerView$ViewHolder, int):void");
    }
}
