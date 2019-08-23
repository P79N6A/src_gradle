package com.ss.android.ugc.aweme.follow.presenter;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.login.ui.BaseLoginOrRegisterActivity;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.common.f.e;
import com.ss.android.ugc.aweme.common.p;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.StreamUrlModel;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.video.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

public class b extends a<FollowFeed, FollowFeedList> implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47764a;
    private static HashMap<Long, Aweme> j = new HashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public String f47765b = "homepage_follow";

    /* renamed from: c  reason: collision with root package name */
    public String f47766c = "extra_follow_type_follow";

    /* renamed from: d  reason: collision with root package name */
    public boolean f47767d;

    /* renamed from: e  reason: collision with root package name */
    public long f47768e;

    /* renamed from: f  reason: collision with root package name */
    public int f47769f;
    public List<FollowFeed> g = new ArrayList();
    public boolean i;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v42, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v3, resolved type: com.ss.android.ugc.aweme.follow.presenter.FollowFeedList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v96, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: com.ss.android.ugc.aweme.follow.presenter.FollowFeedList} */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03b8, code lost:
        if (r0.getVideo().getHeight() != 0) goto L_0x03e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x03de, code lost:
        if (r0.getHeight() != 0) goto L_0x03e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0443, code lost:
        if (com.ss.android.ugc.aweme.newfollow.adapter.FollowFeedAdapter.c(r0) == false) goto L_0x0445;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0459, code lost:
        if (com.ss.android.ugc.aweme.newfollow.adapter.FollowFeedAdapter.c(r0) == false) goto L_0x0445;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x095c, code lost:
        if (r1 == null) goto L_0x095e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x04cb  */
    /* JADX WARNING: Removed duplicated region for block: B:186:0x04e9  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x0549  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x05d4  */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x0692  */
    /* JADX WARNING: Removed duplicated region for block: B:218:0x06b7  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x06f3  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0220  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0283  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void handleData(java.lang.Object r24) {
        /*
            r23 = this;
            r7 = r23
            r8 = r24
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r8 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r8
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f47764a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r1 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 44654(0xae6e, float:6.2574E-41)
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003a
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f47764a
            r3 = 0
            r4 = 44654(0xae6e, float:6.2574E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r1 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x003a:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f47764a
            r3 = 0
            r4 = 44664(0xae78, float:6.2588E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r1 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r11 = 65280(0xff00, float:9.1477E-41)
            if (r0 == 0) goto L_0x0070
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f47764a
            r3 = 0
            r4 = 44664(0xae78, float:6.2588E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r1 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0108
        L_0x0070:
            r7.i = r10
            if (r8 == 0) goto L_0x0108
            java.util.List r0 = r8.getItems()
            boolean r0 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0108
            int r0 = r8.getIsRecommend()
            if (r0 != r9) goto L_0x0086
            goto L_0x0108
        L_0x0086:
            java.lang.Object r0 = r7.mData
            if (r0 == 0) goto L_0x0106
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r0 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r0
            java.util.List r0 = r0.getItems()
            boolean r0 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0099
            goto L_0x0106
        L_0x0099:
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r0 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r0
            java.util.List r0 = r0.getItems()
            int r0 = r0.size()
            java.util.List r1 = r8.getItems()
            int r1 = r1.size()
            if (r0 == r1) goto L_0x00b2
            r7.i = r9
            goto L_0x0108
        L_0x00b2:
            r0 = 0
        L_0x00b3:
            java.lang.Object r1 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r1 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r1
            java.util.List r1 = r1.getItems()
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x0108
            java.lang.Object r1 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r1 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r1
            java.util.List r1 = r1.getItems()
            java.lang.Object r1 = r1.get(r0)
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r1 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeed) r1
            java.util.List r2 = r8.getItems()
            java.lang.Object r2 = r2.get(r0)
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r2 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeed) r2
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r1.getAweme()
            if (r3 == 0) goto L_0x0103
            int r3 = r1.getFeedType()
            if (r3 != r11) goto L_0x0103
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r2.getAweme()
            if (r3 == 0) goto L_0x0103
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.getAweme()
            java.lang.String r1 = r1.getAid()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.getAweme()
            java.lang.String r2 = r2.getAid()
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x0103
            r7.i = r9
        L_0x0103:
            int r0 = r0 + 1
            goto L_0x00b3
        L_0x0106:
            r7.i = r9
        L_0x0108:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f47764a
            r3 = 0
            r4 = 44657(0xae71, float:6.2578E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r1 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            r12 = 0
            if (r0 == 0) goto L_0x013b
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f47764a
            r3 = 0
            r4 = 44657(0xae71, float:6.2578E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r1 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0179
        L_0x013b:
            if (r8 == 0) goto L_0x0179
            boolean r0 = r8.needDeleteCache()
            if (r0 == 0) goto L_0x0179
            com.ss.android.ugc.aweme.follow.a.a r0 = com.ss.android.ugc.aweme.follow.a.a.f47738d
            java.lang.Object[] r13 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.follow.a.a.f47735a
            r16 = 0
            r17 = 44627(0xae53, float:6.2536E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r13, r14, r15, r16, r17, r18, r19)
            if (r1 == 0) goto L_0x016f
            java.lang.Object[] r13 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r15 = com.ss.android.ugc.aweme.follow.a.a.f47735a
            r16 = 0
            r17 = 44627(0xae53, float:6.2536E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class r19 = java.lang.Void.TYPE
            r14 = r0
            r18 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0174
        L_0x016f:
            java.lang.String r0 = com.ss.android.ugc.aweme.follow.a.a.f47736b
            com.ss.android.ugc.aweme.utils.bm.c(r0)
        L_0x0174:
            java.lang.String r0 = "followfeed_snapshot_delete"
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r12)
        L_0x0179:
            if (r8 == 0) goto L_0x0188
            java.util.List r0 = r8.getItems()
            boolean r0 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0186
            goto L_0x0188
        L_0x0186:
            r0 = 0
            goto L_0x0189
        L_0x0188:
            r0 = 1
        L_0x0189:
            r7.mIsNewDataEmpty = r0
            boolean r0 = r7.mIsNewDataEmpty
            r15 = 2
            if (r0 != 0) goto L_0x071f
            boolean r0 = r7.f47767d
            if (r0 == 0) goto L_0x01a9
            int r0 = r7.mListQueryType
            if (r0 != r15) goto L_0x01a9
            boolean r0 = r23.isDataEmpty()
            if (r0 != 0) goto L_0x01a9
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r0 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r0
            java.util.List r0 = r0.getItems()
            r0.clear()
        L_0x01a9:
            java.util.List<com.ss.android.ugc.aweme.follow.presenter.FollowFeed> r0 = r7.g
            r0.clear()
            boolean r0 = com.ss.android.ugc.aweme.main.MainPageExperimentHelper.d()
            if (r0 == 0) goto L_0x01fd
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r19 = 0
            r20 = 71990(0x11936, float:1.0088E-40)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r22 = java.lang.Boolean.TYPE
            r16 = r1
            r17 = r0
            r21 = r2
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r1 == 0) goto L_0x01ef
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
            r19 = 0
            r20 = 71990(0x11936, float:1.0088E-40)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class r22 = java.lang.Boolean.TYPE
            r16 = r1
            r17 = r0
            r21 = r2
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x01f9
        L_0x01ef:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r0.d()
            if (r0 != 0) goto L_0x01f7
            r0 = 0
            goto L_0x01f9
        L_0x01f7:
            boolean r0 = r0.enableFullFeedFollowShowLive
        L_0x01f9:
            if (r0 == 0) goto L_0x01fd
            r0 = 1
            goto L_0x01fe
        L_0x01fd:
            r0 = 0
        L_0x01fe:
            com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r1 = r1.aD()
            if (r1 == 0) goto L_0x0214
            com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            boolean r1 = r1.bL()
            if (r1 == 0) goto L_0x0214
            r1 = 1
            goto L_0x0215
        L_0x0214:
            r1 = 0
        L_0x0215:
            r2 = 0
        L_0x0216:
            java.util.List r3 = r8.getItems()
            int r3 = r3.size()
            if (r2 >= r3) goto L_0x0276
            java.util.List r3 = r8.getItems()
            java.lang.Object r3 = r3.get(r2)
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r3 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeed) r3
            java.lang.String r4 = r8.getRequestId()
            r3.setRequestId(r4)
            int r4 = r3.getFeedType()
            if (r4 != r11) goto L_0x023d
            java.util.List<com.ss.android.ugc.aweme.follow.presenter.FollowFeed> r4 = r7.g
            r4.add(r3)
            goto L_0x0273
        L_0x023d:
            int r4 = r3.getFeedType()
            r5 = 65298(0xff12, float:9.1502E-41)
            if (r4 != r5) goto L_0x0273
            if (r0 == 0) goto L_0x0268
            java.lang.String r4 = r8.requestId
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = a(r3, r4)
            if (r3 == 0) goto L_0x0273
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r4 = new com.ss.android.ugc.aweme.follow.presenter.FollowFeed
            r4.<init>()
            r4.setFeedType(r11)
            r4.setAweme(r3)
            java.util.List r3 = r8.getItems()
            r3.set(r2, r4)
            java.util.List<com.ss.android.ugc.aweme.follow.presenter.FollowFeed> r3 = r7.g
            r3.add(r4)
            goto L_0x0273
        L_0x0268:
            if (r1 == 0) goto L_0x0273
            java.lang.String r4 = r8.requestId
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = a(r3, r4)
            r3.setAweme(r4)
        L_0x0273:
            int r2 = r2 + 1
            goto L_0x0216
        L_0x0276:
            java.util.List r0 = r8.getItems()
            int r0 = r0.size()
            r1 = 0
        L_0x027f:
            r12 = 13
            if (r1 >= r0) goto L_0x031a
            java.util.List r2 = r8.getItems()
            java.lang.Object r2 = r2.get(r1)
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r2 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeed) r2
            if (r2 == 0) goto L_0x0316
            int r3 = r2.getFeedType()
            if (r3 != r11) goto L_0x0316
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r2.getAweme()
            boolean r4 = com.ss.android.ugc.aweme.newfollow.a.b.i(r3)
            if (r4 == 0) goto L_0x0316
            com.ss.android.ugc.aweme.feed.a r4 = com.ss.android.ugc.aweme.feed.a.a()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r4.a((com.ss.android.ugc.aweme.feed.model.Aweme) r3)
            java.lang.String r4 = r8.getRequestId()
            r3.setRequestId(r4)
            com.ss.android.ugc.aweme.feed.a r4 = com.ss.android.ugc.aweme.feed.a.a()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r3.getAid()
            r5.append(r6)
            r5.append(r9)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = r8.getRequestId()
            r4.a(r5, r6, r1)
            r2.setAweme(r3)
            java.util.List r4 = r8.getItems()
            r4.set(r1, r2)
            int r2 = r3.getAwemeType()
            if (r2 != r12) goto L_0x0316
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.getForwardItem()
            if (r2 == 0) goto L_0x0316
            java.lang.String r4 = r3.getAid()
            r2.setRepostFromGroupId(r4)
            java.lang.String r3 = r3.getAuthorUid()
            r2.setRepostFromUserId(r3)
            com.ss.android.ugc.aweme.feed.a r3 = com.ss.android.ugc.aweme.feed.a.a()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r3.a((com.ss.android.ugc.aweme.feed.model.Aweme) r2)
            com.ss.android.ugc.aweme.feed.a r3 = com.ss.android.ugc.aweme.feed.a.a()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r2 = r2.getAid()
            r4.append(r2)
            r4.append(r9)
            java.lang.String r2 = r4.toString()
            java.lang.String r4 = r8.getRequestId()
            r3.a(r2, r4, r1)
        L_0x0316:
            int r1 = r1 + 1
            goto L_0x027f
        L_0x031a:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.List r0 = r8.getItems()
            java.util.Iterator r16 = r0.iterator()
        L_0x0327:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x04a8
            java.lang.Object r0 = r16.next()
            r5 = r0
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r5 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeed) r5
            if (r5 != 0) goto L_0x033a
            r16.remove()
            goto L_0x0327
        L_0x033a:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r5
            com.meituan.robust.ChangeQuickRedirect r2 = f47764a
            r3 = 0
            r4 = 44661(0xae75, float:6.2583E-41)
            java.lang.Class[] r1 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeed> r17 = com.ss.android.ugc.aweme.follow.presenter.FollowFeed.class
            r1[r10] = r17
            java.lang.Class r17 = java.lang.Boolean.TYPE
            r18 = r1
            r1 = r23
            r13 = r5
            r5 = r18
            r14 = r6
            r6 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x037b
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f47764a
            r3 = 0
            r4 = 44661(0xae75, float:6.2583E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeed> r1 = com.ss.android.ugc.aweme.follow.presenter.FollowFeed.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r23
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x03e2
        L_0x037b:
            int r0 = r13.getFeedType()
            if (r0 != r11) goto L_0x03e1
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.getAweme()
            boolean r0 = r0.isForwardAweme()
            if (r0 == 0) goto L_0x0394
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.getAweme()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getForwardItem()
            goto L_0x0398
        L_0x0394:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.getAweme()
        L_0x0398:
            if (r0 == 0) goto L_0x03e1
            boolean r1 = com.ss.android.ugc.aweme.newfollow.adapter.FeedAdapter.c((com.ss.android.ugc.aweme.feed.model.Aweme) r0)
            if (r1 == 0) goto L_0x03bc
            com.ss.android.ugc.aweme.feed.model.Video r1 = r0.getVideo()
            if (r1 == 0) goto L_0x03ba
            com.ss.android.ugc.aweme.feed.model.Video r1 = r0.getVideo()
            int r1 = r1.getWidth()
            if (r1 == 0) goto L_0x03ba
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            int r0 = r0.getHeight()
            if (r0 != 0) goto L_0x03e1
        L_0x03ba:
            r0 = 1
            goto L_0x03e2
        L_0x03bc:
            int r1 = r0.getAwemeType()
            if (r1 != r15) goto L_0x03e1
            java.util.List r0 = r0.getImageInfos()
            boolean r1 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x03e1
            java.lang.Object r0 = r0.get(r10)
            com.ss.android.ugc.aweme.feed.model.ImageInfo r0 = (com.ss.android.ugc.aweme.feed.model.ImageInfo) r0
            if (r0 == 0) goto L_0x03ba
            int r1 = r0.getWidth()
            if (r1 == 0) goto L_0x03ba
            int r0 = r0.getHeight()
            if (r0 != 0) goto L_0x03e1
            goto L_0x03ba
        L_0x03e1:
            r0 = 0
        L_0x03e2:
            if (r0 == 0) goto L_0x03ea
            r16.remove()
        L_0x03e7:
            r6 = r14
            goto L_0x0327
        L_0x03ea:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f47764a
            r3 = 0
            r4 = 44659(0xae73, float:6.258E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeed> r1 = com.ss.android.ugc.aweme.follow.presenter.FollowFeed.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0423
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r13
            com.meituan.robust.ChangeQuickRedirect r2 = f47764a
            r3 = 0
            r4 = 44659(0xae73, float:6.258E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeed> r1 = com.ss.android.ugc.aweme.follow.presenter.FollowFeed.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r23
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x045d
        L_0x0423:
            int r0 = r13.getFeedType()
            if (r0 != r11) goto L_0x045c
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.getAweme()
            int r1 = r0.getAwemeType()
            if (r1 != r12) goto L_0x0447
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.getForwardItem()
            if (r0 == 0) goto L_0x045c
            int r1 = r0.getAwemeType()
            if (r1 == r15) goto L_0x045c
            boolean r0 = com.ss.android.ugc.aweme.newfollow.adapter.FollowFeedAdapter.c((com.ss.android.ugc.aweme.feed.model.Aweme) r0)
            if (r0 != 0) goto L_0x045c
        L_0x0445:
            r0 = 1
            goto L_0x045d
        L_0x0447:
            int r1 = r0.getAwemeType()
            if (r1 == r15) goto L_0x045c
            int r1 = r0.getAwemeType()
            r2 = 101(0x65, float:1.42E-43)
            if (r1 == r2) goto L_0x045c
            boolean r0 = com.ss.android.ugc.aweme.newfollow.adapter.FollowFeedAdapter.c((com.ss.android.ugc.aweme.feed.model.Aweme) r0)
            if (r0 != 0) goto L_0x045c
            goto L_0x0445
        L_0x045c:
            r0 = 0
        L_0x045d:
            if (r0 == 0) goto L_0x0463
            r16.remove()
            goto L_0x03e7
        L_0x0463:
            int r0 = r7.mListQueryType
            if (r0 == r9) goto L_0x03e7
            boolean r0 = r23.isDataEmpty()
            if (r0 != 0) goto L_0x03e7
            boolean r0 = r7.b(r13)
            if (r0 == 0) goto L_0x03e7
            r16.remove()
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.getAweme()
            if (r0 == 0) goto L_0x0489
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.getAweme()
            java.lang.String r0 = r0.getAid()
            r14.add(r0)
            goto L_0x03e7
        L_0x0489:
            com.ss.android.ugc.aweme.follow.presenter.h r0 = r13.getRoomStruct()
            if (r0 == 0) goto L_0x03e7
            com.ss.android.ugc.aweme.follow.presenter.h r0 = r13.getRoomStruct()
            com.ss.android.ugc.aweme.follow.presenter.RoomStruct r0 = r0.f47797a
            if (r0 == 0) goto L_0x03e7
            com.ss.android.ugc.aweme.follow.presenter.h r0 = r13.getRoomStruct()
            com.ss.android.ugc.aweme.follow.presenter.RoomStruct r0 = r0.f47797a
            long r0 = r0.id
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r14.add(r0)
            goto L_0x03e7
        L_0x04a8:
            r14 = r6
            java.lang.String r12 = r8.requestId
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r10] = r14
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f47764a
            r3 = 0
            r4 = 44668(0xae7c, float:6.2593E-41)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x04e9
            java.lang.Object[] r0 = new java.lang.Object[r15]
            r0[r10] = r14
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f47764a
            r3 = 0
            r4 = 44668(0xae7c, float:6.2593E-41)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r5[r10] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0532
        L_0x04e9:
            boolean r0 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x0532
            java.lang.String r0 = "service_monitor"
            java.lang.String r1 = "aweme_delete_duplicated_items"
            com.ss.android.ugc.aweme.app.d.c r2 = com.ss.android.ugc.aweme.app.d.c.a()
            java.lang.String r3 = "request_id"
            com.ss.android.ugc.aweme.app.d.c r2 = r2.a((java.lang.String) r3, (java.lang.String) r12)
            java.lang.String r3 = "user_id"
            com.ss.android.ugc.aweme.user.c r4 = com.ss.android.ugc.aweme.user.c.a()
            java.lang.String r4 = r4.e()
            com.ss.android.ugc.aweme.app.d.c r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "list_count"
            int r4 = r14.size()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            com.ss.android.ugc.aweme.app.d.c r2 = r2.a((java.lang.String) r3, (java.lang.Integer) r4)
            java.lang.String r3 = "item_ids_str"
            java.lang.String r4 = com.ss.android.ugc.aweme.utils.r.a((java.util.List<java.lang.String>) r14)
            com.ss.android.ugc.aweme.app.d.c r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            java.lang.String r3 = "page_type"
            java.lang.String r4 = "homepage_follow"
            com.ss.android.ugc.aweme.app.d.c r2 = r2.a((java.lang.String) r3, (java.lang.String) r4)
            org.json.JSONObject r2 = r2.b()
            com.ss.android.ugc.aweme.app.n.a(r0, r1, r2)
        L_0x0532:
            r7.a((com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r8)
            com.ss.android.ugc.aweme.feed.ai r0 = com.ss.android.ugc.aweme.feed.ai.a()
            java.lang.String r1 = r8.getRequestId()
            com.ss.android.ugc.aweme.feed.model.LogPbBean r2 = r8.getLogPb()
            r0.a(r1, r2)
            int r0 = r7.mListQueryType
            r1 = 4
            if (r0 == r1) goto L_0x05d4
            switch(r0) {
                case 1: goto L_0x0566;
                case 2: goto L_0x054e;
                default: goto L_0x054c;
            }
        L_0x054c:
            goto L_0x066e
        L_0x054e:
            java.util.List r0 = r8.getItems()
            java.util.List r1 = r23.getItems()
            r0.addAll(r1)
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r0 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r0
            java.util.List r1 = r8.getItems()
            r0.setItems(r1)
            goto L_0x066e
        L_0x0566:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f47764a
            r3 = 0
            r4 = 44662(0xae76, float:6.2585E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r1 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r5[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r6 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x059b
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f47764a
            r3 = 0
            r4 = 44662(0xae76, float:6.2585E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r1 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r5[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r6 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r1 = r23
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r0 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r0
            goto L_0x05d0
        L_0x059b:
            if (r8 == 0) goto L_0x05cf
            java.util.List r0 = r8.getItems()
            boolean r0 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x05cf
            com.ss.android.ugc.aweme.follow.c r0 = r8.getLastViewData()
            java.util.List r1 = r8.getItems()
            int r1 = r1.size()
            boolean r0 = com.ss.android.ugc.aweme.follow.d.a(r0, r1)
            if (r0 != 0) goto L_0x05ba
            goto L_0x05cf
        L_0x05ba:
            java.util.List r0 = r8.getItems()
            com.ss.android.ugc.aweme.follow.c r1 = r8.getLastViewData()
            int r1 = r1.f47754b
            com.ss.android.ugc.aweme.follow.c r2 = r8.getLastViewData()
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r2 = com.ss.android.ugc.aweme.follow.presenter.FollowFeed.createLastWatchHistoryItem(r2)
            r0.add(r1, r2)
        L_0x05cf:
            r0 = r8
        L_0x05d0:
            r7.mData = r0
            goto L_0x066e
        L_0x05d4:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f47764a
            r3 = 0
            r4 = 44660(0xae74, float:6.2582E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r1 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r5[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r6 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x060a
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f47764a
            r3 = 0
            r4 = 44660(0xae74, float:6.2582E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r1 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r5[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r6 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r1 = r23
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            r8 = r0
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r8 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r8
            goto L_0x064b
        L_0x060a:
            com.ss.android.ugc.aweme.follow.c r0 = r8.getLastViewData()
            java.util.List r1 = r8.getItems()
            int r1 = r1.size()
            boolean r0 = com.ss.android.ugc.aweme.follow.d.a(r0, r1)
            if (r0 == 0) goto L_0x064b
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r0 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r0
            com.ss.android.ugc.aweme.follow.c r0 = r0.getLastViewData()
            java.lang.Object r1 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r1 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r1
            java.util.List r1 = r1.getItems()
            int r1 = r1.size()
            boolean r0 = com.ss.android.ugc.aweme.follow.d.a(r0, r1)
            if (r0 != 0) goto L_0x064b
            java.util.List r0 = r8.getItems()
            com.ss.android.ugc.aweme.follow.c r1 = r8.getLastViewData()
            int r1 = r1.f47754b
            com.ss.android.ugc.aweme.follow.c r2 = r8.getLastViewData()
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r2 = com.ss.android.ugc.aweme.follow.presenter.FollowFeed.createLastWatchHistoryItem(r2)
            r0.add(r1, r2)
        L_0x064b:
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r0 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r0
            java.util.List r0 = r0.getItems()
            java.util.List r1 = r8.getItems()
            r0.addAll(r1)
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r0 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r0
            java.lang.Object r1 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r1 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r1
            int r1 = r1.getHasMore()
            int r2 = r8.getHasMore()
            r1 = r1 & r2
            r0.setHasMore(r1)
        L_0x066e:
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r0 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r0
            long r1 = r8.getCursor()
            r0.setCursor(r1)
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r0 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r0
            int r1 = r8.getLevel()
            r0.setLevel(r1)
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r0 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r0
            long r0 = r0.getMaxCursor()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x06a9
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r0 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r0
            java.lang.Object r1 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r1 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r1
            long r1 = r1.getMaxCursor()
            long r3 = r8.getMaxCursor()
            long r1 = java.lang.Math.min(r1, r3)
            r0.setMaxCursor(r1)
        L_0x06a9:
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r0 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r0
            long r0 = r0.getMinCursor()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x06ce
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r0 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r0
            java.lang.Object r1 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r1 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r1
            long r1 = r1.getMinCursor()
            long r3 = r8.getMinCursor()
            long r1 = java.lang.Math.max(r1, r3)
            r0.setMinCursor(r1)
        L_0x06ce:
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r0 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r0
            int r1 = r8.getIsRecommend()
            r0.setIsRecommend(r1)
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r0 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r0
            int r1 = r8.getUpPhoneNotice()
            r0.setUpPhoneNotice(r1)
            r0 = 0
        L_0x06e5:
            java.lang.Object r1 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r1 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r1
            java.util.List r1 = r1.getItems()
            int r1 = r1.size()
            if (r0 >= r1) goto L_0x07fd
            java.lang.Object r1 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r1 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r1
            java.util.List r1 = r1.getItems()
            java.lang.Object r1 = r1.get(r0)
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r1 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeed) r1
            int r1 = r1.getFeedType()
            if (r1 != r11) goto L_0x071c
            java.lang.Object r1 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r1 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r1
            java.util.List r1 = r1.getItems()
            java.lang.Object r1 = r1.get(r0)
            com.ss.android.ugc.aweme.follow.presenter.FollowFeed r1 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeed) r1
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.getAweme()
            r1.setAwemePosition(r0)
        L_0x071c:
            int r0 = r0 + 1
            goto L_0x06e5
        L_0x071f:
            int r0 = r7.mListQueryType
            if (r0 != r9) goto L_0x07e4
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f47764a
            r3 = 0
            r4 = 44656(0xae70, float:6.2576E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r1 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0756
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f47764a
            r3 = 0
            r4 = 44656(0xae70, float:6.2576E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r1 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x07e4
        L_0x0756:
            if (r8 == 0) goto L_0x07e2
            boolean r0 = r8.needUseCache()
            if (r0 == 0) goto L_0x07e2
            java.lang.Object r0 = r7.mData
            if (r0 == 0) goto L_0x0770
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r0 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r0
            java.util.List r0 = r0.getItems()
            boolean r0 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x07e4
        L_0x0770:
            com.ss.android.ugc.aweme.follow.a.a r0 = com.ss.android.ugc.aweme.follow.a.a.f47738d
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.follow.a.a.f47735a
            r19 = 0
            r20 = 44626(0xae52, float:6.2534E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r22 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r16 = r1
            r17 = r0
            r21 = r2
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r1 == 0) goto L_0x07a6
            java.lang.Object[] r1 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.follow.a.a.f47735a
            r19 = 0
            r20 = 44626(0xae52, float:6.2534E-41)
            java.lang.Class[] r2 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r22 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r16 = r1
            r17 = r0
            r21 = r2
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            r12 = r0
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r12 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r12
            goto L_0x07bc
        L_0x07a6:
            boolean r1 = r0.a()
            if (r1 != 0) goto L_0x07ad
            goto L_0x07bc
        L_0x07ad:
            java.lang.String r1 = com.ss.android.ugc.aweme.follow.a.a.f47737c
            java.lang.String r1 = com.ss.android.ugc.aweme.video.b.f(r1)
            java.lang.String r2 = "FileHelper.readFile(cacheFilePath)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r12 = r0.a((java.lang.String) r1)
        L_0x07bc:
            if (r12 == 0) goto L_0x07e4
            r7.mData = r12
            java.util.List r0 = r12.getItems()
            if (r0 == 0) goto L_0x07cf
            java.util.List r0 = r12.getItems()
            int r0 = r0.size()
            goto L_0x07d0
        L_0x07cf:
            r0 = 0
        L_0x07d0:
            java.lang.String r1 = "followfeed_snapshot"
            com.ss.android.ugc.aweme.app.d.d r2 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r3 = "item_cnt"
            com.ss.android.ugc.aweme.app.d.d r0 = r2.a((java.lang.String) r3, (int) r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r1, (java.util.Map) r0)
            goto L_0x07e4
        L_0x07e2:
            r7.mData = r12
        L_0x07e4:
            java.lang.Object r0 = r7.mData
            if (r0 == 0) goto L_0x07fd
            int r0 = r7.mListQueryType
            if (r0 == r15) goto L_0x07fd
            java.lang.String r0 = r7.f47766c
            java.lang.String r1 = "extra_follow_type_friend"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x07fd
            java.lang.Object r0 = r7.mData
            com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r0 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r0
            r0.setHasMore(r10)
        L_0x07fd:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f47764a
            r3 = 0
            r4 = 44655(0xae6f, float:6.2575E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r1 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0830
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f47764a
            r3 = 0
            r4 = 44655(0xae6f, float:6.2575E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r1 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r23
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x08eb
        L_0x0830:
            java.lang.String r0 = r7.f47766c
            java.lang.String r1 = "extra_follow_type_follow"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x08eb
            int r0 = r7.mListQueryType
            if (r0 != r9) goto L_0x08eb
            if (r8 == 0) goto L_0x08eb
            boolean r0 = r8.needCache()
            if (r0 == 0) goto L_0x08eb
            com.ss.android.ugc.aweme.follow.a.a r0 = com.ss.android.ugc.aweme.follow.a.a.f47738d
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.follow.a.a.f47735a
            r19 = 0
            r20 = 44625(0xae51, float:6.2533E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r3 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r2[r10] = r3
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r1
            r17 = r0
            r21 = r2
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r1 == 0) goto L_0x0884
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.follow.a.a.f47735a
            r19 = 0
            r20 = 44625(0xae51, float:6.2533E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r3 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r2[r10] = r3
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r1
            r17 = r0
            r21 = r2
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x08eb
        L_0x0884:
            java.lang.String r1 = "data"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r1)
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.follow.a.a.f47735a
            r19 = 0
            r20 = 44624(0xae50, float:6.2532E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r3 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r2[r10] = r3
            java.lang.Class r22 = java.lang.Boolean.TYPE
            r16 = r1
            r17 = r0
            r21 = r2
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r1 == 0) goto L_0x08cc
            java.lang.Object[] r1 = new java.lang.Object[r9]
            r1[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.follow.a.a.f47735a
            r19 = 0
            r20 = 44624(0xae50, float:6.2532E-41)
            java.lang.Class[] r2 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r3 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r2[r10] = r3
            java.lang.Class r22 = java.lang.Boolean.TYPE
            r16 = r1
            r17 = r0
            r21 = r2
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L_0x08dd
        L_0x08cc:
            if (r8 == 0) goto L_0x08dc
            java.util.List r1 = r8.getItems()
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x08dc
            r1 = 1
            goto L_0x08dd
        L_0x08dc:
            r1 = 0
        L_0x08dd:
            if (r1 == 0) goto L_0x08eb
            r0.a()
            java.lang.String r1 = com.ss.android.ugc.aweme.follow.a.a.f47737c
            java.lang.String r0 = r0.a((com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r8)
            com.ss.android.ugc.aweme.video.b.a((java.lang.String) r1, (java.lang.String) r0)
        L_0x08eb:
            int r0 = r7.mListQueryType
            java.lang.Object[] r1 = new java.lang.Object[r15]
            r1[r10] = r8
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1[r9] = r2
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.follow.c.a.f47756a
            r19 = 1
            r20 = 44755(0xaed3, float:6.2715E-41)
            java.lang.Class[] r2 = new java.lang.Class[r15]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r3 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r2[r10] = r3
            java.lang.Class r3 = java.lang.Integer.TYPE
            r2[r9] = r3
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r1
            r21 = r2
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r1 == 0) goto L_0x093d
            java.lang.Object[] r1 = new java.lang.Object[r15]
            r1[r10] = r8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1[r9] = r0
            r17 = 0
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.follow.c.a.f47756a
            r19 = 1
            r20 = 44755(0xaed3, float:6.2715E-41)
            java.lang.Class[] r0 = new java.lang.Class[r15]
            java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r2 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
            r0[r10] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r0[r9] = r2
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r1
            r21 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            return
        L_0x093d:
            boolean r1 = com.ss.android.g.a.a()
            if (r1 != 0) goto L_0x0ab8
            if (r0 != r9) goto L_0x0ab8
            if (r8 == 0) goto L_0x094c
            int r0 = r8.getFeedType()
            goto L_0x094d
        L_0x094c:
            r0 = 0
        L_0x094d:
            if (r0 != r15) goto L_0x0952
            boolean r1 = com.ss.android.ugc.aweme.follow.c.a.g
            goto L_0x0954
        L_0x0952:
            boolean r1 = com.ss.android.ugc.aweme.follow.c.a.h
        L_0x0954:
            if (r1 == 0) goto L_0x0ab8
            if (r8 == 0) goto L_0x095e
            java.lang.String r1 = r8.getRequestId()
            if (r1 != 0) goto L_0x0960
        L_0x095e:
            java.lang.String r1 = ""
        L_0x0960:
            if (r8 == 0) goto L_0x0972
            int r2 = r8.getFeedType()
            switch(r2) {
                case 0: goto L_0x096f;
                case 1: goto L_0x096f;
                case 2: goto L_0x096c;
                default: goto L_0x0969;
            }
        L_0x0969:
            java.lang.String r2 = ""
            goto L_0x0974
        L_0x096c:
            java.lang.String r2 = "homepage_friends"
            goto L_0x0974
        L_0x096f:
            java.lang.String r2 = "homepage_follow"
            goto L_0x0974
        L_0x0972:
            java.lang.String r2 = ""
        L_0x0974:
            if (r8 == 0) goto L_0x097b
            int r3 = r8.getNewItemCount()
            goto L_0x097c
        L_0x097b:
            r3 = 0
        L_0x097c:
            if (r8 == 0) goto L_0x0983
            int r4 = r8.getNewLiveCount()
            goto L_0x0984
        L_0x0983:
            r4 = 0
        L_0x0984:
            com.ss.android.ugc.aweme.follow.c.a r5 = com.ss.android.ugc.aweme.follow.c.a.i
            int r5 = r5.b(r9)
            if (r8 == 0) goto L_0x09a1
            int r6 = r8.getFeedType()
            if (r6 != r15) goto L_0x099a
            com.ss.android.ugc.aweme.follow.c.a r6 = com.ss.android.ugc.aweme.follow.c.a.i
            r11 = 3
            int r6 = r6.b(r11)
            goto L_0x09a2
        L_0x099a:
            com.ss.android.ugc.aweme.follow.c.a r6 = com.ss.android.ugc.aweme.follow.c.a.i
            int r6 = r6.b(r15)
            goto L_0x09a2
        L_0x09a1:
            r6 = 0
        L_0x09a2:
            if (r6 <= 0) goto L_0x09b9
            com.ss.android.ugc.aweme.follow.c.a r16 = com.ss.android.ugc.aweme.follow.c.a.i
            java.lang.String r19 = "video"
            if (r3 > 0) goto L_0x09ad
            r20 = 1
            goto L_0x09af
        L_0x09ad:
            r20 = 0
        L_0x09af:
            r21 = 0
            r17 = r1
            r18 = r2
            r16.a(r17, r18, r19, r20, r21)
            goto L_0x09cd
        L_0x09b9:
            com.ss.android.ugc.aweme.follow.c.a r16 = com.ss.android.ugc.aweme.follow.c.a.i
            java.lang.String r19 = "video"
            if (r3 <= 0) goto L_0x09c2
            r20 = 1
            goto L_0x09c4
        L_0x09c2:
            r20 = 0
        L_0x09c4:
            r21 = 0
            r17 = r1
            r18 = r2
            r16.b(r17, r18, r19, r20, r21)
        L_0x09cd:
            if (r5 <= 0) goto L_0x09e4
            com.ss.android.ugc.aweme.follow.c.a r16 = com.ss.android.ugc.aweme.follow.c.a.i
            java.lang.String r19 = "live"
            if (r4 > 0) goto L_0x09d8
            r20 = 1
            goto L_0x09da
        L_0x09d8:
            r20 = 0
        L_0x09da:
            r21 = 1
            r17 = r1
            r18 = r2
            r16.a(r17, r18, r19, r20, r21)
            goto L_0x09f8
        L_0x09e4:
            com.ss.android.ugc.aweme.follow.c.a r16 = com.ss.android.ugc.aweme.follow.c.a.i
            java.lang.String r19 = "live"
            if (r4 <= 0) goto L_0x09ed
            r20 = 1
            goto L_0x09ef
        L_0x09ed:
            r20 = 0
        L_0x09ef:
            r21 = 1
            r17 = r1
            r18 = r2
            r16.b(r17, r18, r19, r20, r21)
        L_0x09f8:
            if (r8 == 0) goto L_0x0ab1
            int r2 = r8.getFeedType()
            if (r2 != r9) goto L_0x0ab1
            if (r6 <= 0) goto L_0x0ab1
            int r6 = r6 - r3
            int r2 = java.lang.Math.max(r6, r10)
            com.ss.android.ugc.aweme.follow.c.a r3 = com.ss.android.ugc.aweme.follow.c.a.i
            java.lang.Object[] r4 = new java.lang.Object[r15]
            r4[r10] = r1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)
            r4[r9] = r5
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.follow.c.a.f47756a
            r19 = 0
            r20 = 44758(0xaed6, float:6.272E-41)
            java.lang.Class[] r5 = new java.lang.Class[r15]
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r10] = r6
            java.lang.Class r6 = java.lang.Integer.TYPE
            r5[r9] = r6
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r4
            r17 = r3
            r21 = r5
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r16, r17, r18, r19, r20, r21, r22)
            if (r4 == 0) goto L_0x0a59
            java.lang.Object[] r4 = new java.lang.Object[r15]
            r4[r10] = r1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            r4[r9] = r1
            com.meituan.robust.ChangeQuickRedirect r18 = com.ss.android.ugc.aweme.follow.c.a.f47756a
            r19 = 0
            r20 = 44758(0xaed6, float:6.272E-41)
            java.lang.Class[] r1 = new java.lang.Class[r15]
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r1[r10] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r9] = r2
            java.lang.Class r22 = java.lang.Void.TYPE
            r16 = r4
            r17 = r3
            r21 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r16, r17, r18, r19, r20, r21, r22)
            goto L_0x0ab1
        L_0x0a59:
            com.ss.android.ugc.aweme.app.d.d r3 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r4 = "error_type"
            java.lang.String r5 = "num_bias"
            r3.a((java.lang.String) r4, (java.lang.String) r5)
            java.lang.String r4 = "enter_from"
            java.lang.String r5 = "homepage_follow"
            r3.a((java.lang.String) r4, (java.lang.String) r5)
            java.lang.String r4 = "yellow_dot_logid"
            java.lang.String r5 = com.ss.android.ugc.aweme.follow.c.a.f47758c
            r3.a((java.lang.String) r4, (java.lang.String) r5)
            java.lang.String r4 = "feed_logid"
            r3.a((java.lang.String) r4, (java.lang.String) r1)
            java.lang.String r1 = "yellow_dot_type"
            java.lang.String r4 = "video"
            r3.a((java.lang.String) r1, (java.lang.String) r4)
            java.lang.String r1 = "launch_type"
            int r4 = com.ss.android.ugc.aweme.follow.c.a.f47757b
            java.lang.String r4 = com.ss.android.ugc.aweme.follow.c.a.a(r4)
            r3.a((java.lang.String) r1, (java.lang.String) r4)
            java.lang.String r1 = "bias"
            r3.a((java.lang.String) r1, (int) r2)
            long r1 = com.ss.android.ugc.aweme.follow.c.a.f47760e
            r4 = 0
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0a9d
            java.lang.String r1 = "author_id"
            long r8 = com.ss.android.ugc.aweme.follow.c.a.f47760e
            r3.a((java.lang.String) r1, (long) r8)
        L_0x0a9d:
            long r1 = com.ss.android.ugc.aweme.follow.c.a.f47759d
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x0aaa
            java.lang.String r1 = "group_id"
            long r4 = com.ss.android.ugc.aweme.follow.c.a.f47759d
            r3.a((java.lang.String) r1, (long) r4)
        L_0x0aaa:
            java.lang.String r1 = "homepage_follow_monitor"
            java.util.Map<java.lang.String, java.lang.String> r2 = r3.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r1, (java.util.Map) r2)
        L_0x0ab1:
            if (r0 != r15) goto L_0x0ab6
            com.ss.android.ugc.aweme.follow.c.a.g = r10
            return
        L_0x0ab6:
            com.ss.android.ugc.aweme.follow.c.a.h = r10
        L_0x0ab8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.follow.presenter.b.handleData(java.lang.Object):void");
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f47764a, false, 44643, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f47764a, false, 44643, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.mData == null || CollectionUtils.isEmpty(((FollowFeedList) this.mData).getItems())) {
            return true;
        } else {
            for (FollowFeed followFeed : ((FollowFeedList) this.mData).getItems()) {
                if (followFeed.getFeedType() != 65280) {
                    if (followFeed.getFeedType() == 65298) {
                    }
                }
                return false;
            }
            return true;
        }
    }

    public final boolean a(Aweme aweme) {
        FollowFeed followFeed;
        List<FollowFeed> items = getItems();
        boolean z = false;
        if (CollectionUtils.isEmpty(items)) {
            return false;
        }
        Iterator<FollowFeed> it2 = items.iterator();
        while (true) {
            if (!it2.hasNext()) {
                followFeed = null;
                break;
            }
            followFeed = it2.next();
            if (followFeed != null) {
                Aweme aweme2 = followFeed.getAweme();
                if (aweme2 != null && TextUtils.equals(aweme.getAid(), aweme2.getAid())) {
                    break;
                }
            }
        }
        List<Aweme> b2 = b();
        if (CollectionUtils.isEmpty(b2)) {
            return false;
        }
        int indexOf = b2.indexOf(aweme);
        if (indexOf >= 0) {
            for (p pVar : this.mNotifyListeners) {
                if (pVar != null && (pVar instanceof e)) {
                    ((e) pVar).a(indexOf);
                }
            }
        }
        if (followFeed != null) {
            z = items.remove(followFeed);
            ((FollowFeedList) this.mData).setItems(items);
        }
        return z;
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public b clone() {
        if (PatchProxy.isSupport(new Object[0], this, f47764a, false, 44666, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, f47764a, false, 44666, new Class[0], b.class);
        }
        try {
            b bVar = (b) super.clone();
            bVar.mData = ((FollowFeedList) this.mData).clone();
            return bVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public List<FollowFeed> getItems() {
        if (PatchProxy.isSupport(new Object[0], this, f47764a, false, 44650, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f47764a, false, 44650, new Class[0], List.class);
        } else if (this.mData == null) {
            return null;
        } else {
            return ((FollowFeedList) this.mData).getItems();
        }
    }

    public boolean isHasMore() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f47764a, false, 44648, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f47764a, false, 44648, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.mData != null && ((FollowFeedList) this.mData).isHasMore()) {
            z = true;
        }
        return z;
    }

    public final List<Aweme> b() {
        if (PatchProxy.isSupport(new Object[0], this, f47764a, false, 44652, new Class[0], List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[0], this, f47764a, false, 44652, new Class[0], List.class);
        } else if (this.mData == null) {
            return null;
        } else {
            ArrayList arrayList = new ArrayList();
            for (FollowFeed followFeed : ((FollowFeedList) this.mData).getItems()) {
                if (followFeed.getFeedType() == 65280) {
                    arrayList.add(followFeed.getAweme());
                }
            }
            return arrayList;
        }
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }

    private static c a(Object... objArr) {
        if (objArr.length < 2 || !(objArr[1] instanceof c)) {
            return null;
        }
        return objArr[1];
    }

    private void a(FollowFeedList followFeedList) {
        FollowFeedList followFeedList2 = followFeedList;
        if (PatchProxy.isSupport(new Object[]{followFeedList2}, this, f47764a, false, 44653, new Class[]{FollowFeedList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followFeedList2}, this, f47764a, false, 44653, new Class[]{FollowFeedList.class}, Void.TYPE);
        } else if (followFeedList2 == null || CollectionUtils.isEmpty(followFeedList.getItems())) {
        } else {
            for (FollowFeed followFeed : followFeedList.getItems()) {
                if (!TextUtils.isEmpty(followFeed.getRecommendReason()) && followFeedList2.isRecommend == 1) {
                    if (this.mListQueryType == 1) {
                        followFeed.setFirstEmptyRecFollowFeed(true);
                        return;
                    }
                }
            }
        }
    }

    public void refreshList(Object... objArr) {
        String str;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f47764a, false, 44644, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f47764a, false, 44644, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        c a2 = a(objArr);
        if (a2 != null) {
            String str2 = a2.f47781f;
            if (TextUtils.isEmpty(str2)) {
                str = a2.j;
            } else {
                str = str2;
            }
            int i2 = this.f47769f + 1;
            this.f47769f = i2;
            int i3 = a2.f47778c;
            int i4 = a2.f47779d;
            String str3 = a2.f47780e;
            String str4 = a2.h;
            int intValue = a2.g.intValue();
            a(i2, 0, 1, 0, 0, i3, i4, str3, "", str4, str2, str, 0, intValue);
        }
    }

    public void setItems(List<FollowFeed> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f47764a, false, 44651, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f47764a, false, 44651, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.mData == null) {
            this.mData = new FollowFeedList();
        }
        ((FollowFeedList) this.mData).setItems(list);
    }

    private boolean b(FollowFeed followFeed) {
        if (PatchProxy.isSupport(new Object[]{followFeed}, this, f47764a, false, 44663, new Class[]{FollowFeed.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{followFeed}, this, f47764a, false, 44663, new Class[]{FollowFeed.class}, Boolean.TYPE)).booleanValue();
        } else if (followFeed == null) {
            return false;
        } else {
            if ((followFeed.getFeedType() != 65280 && followFeed.getFeedType() != 65298) || this.mData == null || ((FollowFeedList) this.mData).getItems().size() == 0) {
                return false;
            }
            for (FollowFeed followFeed2 : ((FollowFeedList) this.mData).getItems()) {
                if (followFeed.getFeedType() == 65280 && followFeed2.getFeedType() == 65280) {
                    Aweme aweme = followFeed.getAweme();
                    Aweme aweme2 = followFeed2.getAweme();
                    if (!(aweme == null || aweme2 == null || !TextUtils.equals(aweme.getAid(), aweme2.getAid()))) {
                        return true;
                    }
                } else if (followFeed.getFeedType() == 65298 && followFeed2.getFeedType() == 65298) {
                    h roomStruct = followFeed.getRoomStruct();
                    h roomStruct2 = followFeed2.getRoomStruct();
                    if (!(roomStruct == null || roomStruct2 == null || roomStruct.f47797a.id != roomStruct2.f47797a.id)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    public void loadMoreList(Object... objArr) {
        long j2;
        int i2;
        long j3;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f47764a, false, 44646, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f47764a, false, 44646, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        c a2 = a(objArr);
        if (a2 != null) {
            int i3 = this.f47769f;
            if (this.mData != null) {
                j2 = ((FollowFeedList) this.mData).getCursor();
            } else {
                j2 = 0;
            }
            if (this.mData != null) {
                i2 = ((FollowFeedList) this.mData).getLevel();
            } else {
                i2 = 1;
            }
            if (CollectionUtils.isEmpty(getItems())) {
                j3 = 0;
            } else {
                j3 = ((FollowFeedList) this.mData).getMaxCursor();
            }
            a(i3, j2, i2, j3, -1, a2.f47778c, a2.f47779d, a2.f47780e, a2.f47781f, null, null, null, ((FollowFeedList) this.mData).getIsRecommend(), a2.g.intValue());
        }
    }

    public static List<Aweme> a(List<FollowFeed> list) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{list}, null, f47764a, true, 44667, new Class[]{List.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{list}, null, f47764a, true, 44667, new Class[]{List.class}, List.class);
        } else if (list == null) {
            return null;
        } else {
            if (!AbTestManager.a().aD() || !AbTestManager.a().bL()) {
                z = false;
            }
            ArrayList arrayList = new ArrayList();
            for (FollowFeed next : list) {
                if (next.getFeedType() == 65280) {
                    Aweme aweme = next.getAweme();
                    if (aweme != null && (!aweme.isForwardAweme() || aweme.getForwardItem() != null)) {
                        arrayList.add(aweme);
                    }
                } else if (next.getFeedType() == 65298 && z) {
                    Aweme a2 = a(next, next.getRequestId());
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
            }
            return arrayList;
        }
    }

    public final void a(FollowFeed followFeed) {
        if (PatchProxy.isSupport(new Object[]{followFeed}, this, f47764a, false, 44642, new Class[]{FollowFeed.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{followFeed}, this, f47764a, false, 44642, new Class[]{FollowFeed.class}, Void.TYPE);
            return;
        }
        if (this.mData == null) {
            this.mData = new FollowFeedList();
        }
        if (CollectionUtils.isEmpty(((FollowFeedList) this.mData).getItems())) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(followFeed);
            ((FollowFeedList) this.mData).setItems(arrayList);
        }
    }

    private static Aweme a(FollowFeed followFeed, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{followFeed, str2}, null, f47764a, true, 44658, new Class[]{FollowFeed.class, String.class}, Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[]{followFeed, str2}, null, f47764a, true, 44658, new Class[]{FollowFeed.class, String.class}, Aweme.class);
        } else if (followFeed == null || followFeed.getRoomStruct() == null || followFeed.getRoomStruct().f47797a == null || followFeed.getRoomStruct().f47797a.stream_url == null) {
            return null;
        } else {
            long j2 = followFeed.getRoomStruct().f47797a.id;
            Aweme aweme = j.get(Long.valueOf(j2));
            if (aweme == null) {
                aweme = new Aweme();
                aweme.setAid(String.valueOf(j2));
                aweme.setAwemeType(BaseLoginOrRegisterActivity.o);
                aweme.setAuthor(followFeed.getRoomStruct().f47797a.owner);
            }
            aweme.setRequestId(str2);
            StreamUrlModel streamUrlModel = new StreamUrlModel();
            streamUrlModel.setId(String.valueOf(j2));
            streamUrlModel.setRtmpPullUrl(followFeed.getRoomStruct().f47797a.stream_url.rtmp_pull_url);
            aweme.setStreamUrlModel(streamUrlModel);
            j.put(Long.valueOf(followFeed.getRoomStruct().f47797a.id), aweme);
            d.b().f76039c.put(streamUrlModel.id, followFeed.getRoomStruct().f47797a);
            return aweme;
        }
    }

    @SuppressLint({"TooManyMethodParam"})
    private void a(int i2, long j2, int i3, long j3, long j4, int i4, int i5, String str, String str2, String str3, String str4, String str5, int i6, int i7) {
        long j5 = j2;
        long j6 = j3;
        long j7 = j4;
        Object[] objArr = {Integer.valueOf(i2), new Long(j5), Integer.valueOf(i3), new Long(j6), new Long(j7), Integer.valueOf(i4), Integer.valueOf(i5), str, str2, str3, str4, str5, Integer.valueOf(i6), Integer.valueOf(i7)};
        if (PatchProxy.isSupport(objArr, this, f47764a, false, 44647, new Class[]{Integer.TYPE, Long.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), new Long(j5), Integer.valueOf(i3), new Long(j6), new Long(j7), Integer.valueOf(i4), Integer.valueOf(i5), str, str2, str3, str4, str5, Integer.valueOf(i6), Integer.valueOf(i7)}, this, f47764a, false, 44647, new Class[]{Integer.TYPE, Long.TYPE, Integer.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        boolean booleanValue = ((Boolean) SharePrefCache.inst().getIsContactsUploaded().c()).booleanValue();
        final int bD = AbTestManager.a().bD();
        m a2 = m.a();
        AnonymousClass1 r34 = r0;
        final long j8 = j3;
        final long j9 = j4;
        WeakHandler weakHandler = this.mHandler;
        final int i8 = i4;
        final int i9 = i5;
        final String str6 = str;
        final String str7 = str5;
        m mVar = a2;
        final int i10 = i6;
        final String str8 = str2;
        final int i11 = i2;
        final long j10 = j2;
        final int i12 = i3;
        final String str9 = str3;
        final String str10 = str4;
        final int i13 = i7;
        final int i14 = booleanValue ? 1 : 0;
        AnonymousClass1 r0 = new Callable(this) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f47770a;
            final /* synthetic */ b r;

            /* JADX WARNING: Code restructure failed: missing block: B:35:0x059b, code lost:
                if (r1.j.intValue() == 1) goto L_0x05b9;
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object call() throws java.lang.Exception {
                /*
                    r46 = this;
                    r7 = r46
                    r8 = 0
                    java.lang.Object[] r0 = new java.lang.Object[r8]
                    com.meituan.robust.ChangeQuickRedirect r2 = f47770a
                    java.lang.Class[] r5 = new java.lang.Class[r8]
                    java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
                    r3 = 0
                    r4 = 44669(0xae7d, float:6.2595E-41)
                    r1 = r46
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                    if (r0 == 0) goto L_0x002c
                    java.lang.Object[] r0 = new java.lang.Object[r8]
                    com.meituan.robust.ChangeQuickRedirect r2 = f47770a
                    r3 = 0
                    r4 = 44669(0xae7d, float:6.2595E-41)
                    java.lang.Class[] r5 = new java.lang.Class[r8]
                    java.lang.Class<java.lang.Object> r6 = java.lang.Object.class
                    r1 = r46
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                    java.lang.Object r0 = (java.lang.Object) r0
                    return r0
                L_0x002c:
                    com.ss.android.ugc.aweme.follow.presenter.b r0 = r7.r
                    java.lang.String r0 = r0.f47766c
                    java.lang.String r1 = "extra_follow_type_friend"
                    boolean r0 = android.text.TextUtils.equals(r0, r1)
                    r10 = 13
                    if (r0 == 0) goto L_0x03c8
                    long r3 = r2
                    long r5 = r4
                    int r0 = r6
                    int r9 = r7
                    com.ss.android.ugc.aweme.follow.presenter.b r13 = r7.r
                    long r11 = r13.f47768e
                    com.ss.android.ugc.aweme.follow.presenter.b r13 = r7.r
                    java.lang.Object r13 = r13.mData
                    if (r13 == 0) goto L_0x0059
                    com.ss.android.ugc.aweme.follow.presenter.b r13 = r7.r
                    java.lang.Object r13 = r13.mData
                    com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r13 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r13
                    int r13 = r13.getFetchRecommend()
                    r27 = r13
                    goto L_0x005b
                L_0x0059:
                    r27 = 1
                L_0x005b:
                    java.lang.String r13 = r8
                    java.lang.String r14 = r9
                    int r15 = r10
                    int r1 = r11
                    int r32 = com.ss.android.ugc.aweme.utils.permission.e.a()
                    int r33 = com.ss.android.ugc.aweme.utils.permission.e.b()
                    java.lang.Object[] r2 = new java.lang.Object[r10]
                    java.lang.Long r10 = new java.lang.Long
                    r10.<init>(r3)
                    r2[r8] = r10
                    java.lang.Long r10 = new java.lang.Long
                    r10.<init>(r5)
                    r17 = 1
                    r2[r17] = r10
                    r10 = 20
                    java.lang.Integer r17 = java.lang.Integer.valueOf(r10)
                    r10 = 2
                    r2[r10] = r17
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
                    r17 = 3
                    r2[r17] = r10
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r9)
                    r17 = 4
                    r2[r17] = r10
                    java.lang.Long r10 = new java.lang.Long
                    r10.<init>(r11)
                    r17 = 5
                    r2[r17] = r10
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r27)
                    r17 = 6
                    r2[r17] = r10
                    r10 = 7
                    r2[r10] = r13
                    r10 = 8
                    r2[r10] = r14
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r15)
                    r17 = 9
                    r2[r17] = r10
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r1)
                    r17 = 10
                    r2[r17] = r10
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r32)
                    r17 = 11
                    r2[r17] = r10
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r33)
                    r16 = 12
                    r2[r16] = r10
                    r18 = 0
                    com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.ugc.aweme.follow.api.a.f47741a
                    r20 = 1
                    r21 = 44618(0xae4a, float:6.2523E-41)
                    r10 = 13
                    java.lang.Class[] r7 = new java.lang.Class[r10]
                    java.lang.Class r10 = java.lang.Long.TYPE
                    r7[r8] = r10
                    java.lang.Class r10 = java.lang.Long.TYPE
                    r17 = 1
                    r7[r17] = r10
                    java.lang.Class r10 = java.lang.Integer.TYPE
                    r17 = 2
                    r7[r17] = r10
                    java.lang.Class r10 = java.lang.Integer.TYPE
                    r17 = 3
                    r7[r17] = r10
                    java.lang.Class r10 = java.lang.Integer.TYPE
                    r17 = 4
                    r7[r17] = r10
                    java.lang.Class r10 = java.lang.Long.TYPE
                    r17 = 5
                    r7[r17] = r10
                    java.lang.Class r10 = java.lang.Integer.TYPE
                    r17 = 6
                    r7[r17] = r10
                    java.lang.Class<java.lang.String> r10 = java.lang.String.class
                    r17 = 7
                    r7[r17] = r10
                    java.lang.Class<java.lang.String> r10 = java.lang.String.class
                    r17 = 8
                    r7[r17] = r10
                    java.lang.Class r10 = java.lang.Integer.TYPE
                    r17 = 9
                    r7[r17] = r10
                    java.lang.Class r10 = java.lang.Integer.TYPE
                    r17 = 10
                    r7[r17] = r10
                    java.lang.Class r10 = java.lang.Integer.TYPE
                    r17 = 11
                    r7[r17] = r10
                    java.lang.Class r10 = java.lang.Integer.TYPE
                    r16 = 12
                    r7[r16] = r10
                    java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r23 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
                    r17 = r2
                    r22 = r7
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r17, r18, r19, r20, r21, r22, r23)
                    if (r2 == 0) goto L_0x01f3
                    r2 = 13
                    java.lang.Object[] r7 = new java.lang.Object[r2]
                    java.lang.Long r2 = new java.lang.Long
                    r2.<init>(r3)
                    r7[r8] = r2
                    java.lang.Long r2 = new java.lang.Long
                    r2.<init>(r5)
                    r3 = 1
                    r7[r3] = r2
                    r2 = 20
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    r3 = 2
                    r7[r3] = r2
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r2 = 3
                    r7[r2] = r0
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
                    r2 = 4
                    r7[r2] = r0
                    java.lang.Long r0 = new java.lang.Long
                    r0.<init>(r11)
                    r2 = 5
                    r7[r2] = r0
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r27)
                    r2 = 6
                    r7[r2] = r0
                    r0 = 7
                    r7[r0] = r13
                    r0 = 8
                    r7[r0] = r14
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
                    r2 = 9
                    r7[r2] = r0
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                    r1 = 10
                    r7[r1] = r0
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r32)
                    r1 = 11
                    r7[r1] = r0
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r33)
                    r1 = 12
                    r7[r1] = r0
                    r18 = 0
                    com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.ugc.aweme.follow.api.a.f47741a
                    r20 = 1
                    r21 = 44618(0xae4a, float:6.2523E-41)
                    r0 = 13
                    java.lang.Class[] r0 = new java.lang.Class[r0]
                    java.lang.Class r1 = java.lang.Long.TYPE
                    r0[r8] = r1
                    java.lang.Class r1 = java.lang.Long.TYPE
                    r2 = 1
                    r0[r2] = r1
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r2 = 2
                    r0[r2] = r1
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r2 = 3
                    r0[r2] = r1
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r2 = 4
                    r0[r2] = r1
                    java.lang.Class r1 = java.lang.Long.TYPE
                    r2 = 5
                    r0[r2] = r1
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r2 = 6
                    r0[r2] = r1
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r2 = 7
                    r0[r2] = r1
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r2 = 8
                    r0[r2] = r1
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r2 = 9
                    r0[r2] = r1
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r2 = 10
                    r0[r2] = r1
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r2 = 11
                    r0[r2] = r1
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r2 = 12
                    r0[r2] = r1
                    java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r23 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
                    r17 = r7
                    r22 = r0
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r17, r18, r19, r20, r21, r22, r23)
                L_0x01ef:
                    com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r0 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r0
                    goto L_0x0ae2
                L_0x01f3:
                    com.ss.android.ugc.aweme.follow.api.a$a r2 = com.ss.android.ugc.aweme.follow.api.a.f47743c
                    r7 = 13
                    java.lang.Object[] r10 = new java.lang.Object[r7]
                    java.lang.Long r7 = new java.lang.Long
                    r7.<init>(r3)
                    r10[r8] = r7
                    java.lang.Long r7 = new java.lang.Long
                    r7.<init>(r5)
                    r17 = 1
                    r10[r17] = r7
                    r7 = 20
                    java.lang.Integer r17 = java.lang.Integer.valueOf(r7)
                    r7 = 2
                    r10[r7] = r17
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r0)
                    r17 = 3
                    r10[r17] = r7
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r9)
                    r17 = 4
                    r10[r17] = r7
                    java.lang.Long r7 = new java.lang.Long
                    r7.<init>(r11)
                    r17 = 5
                    r10[r17] = r7
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r27)
                    r17 = 6
                    r10[r17] = r7
                    r7 = 7
                    r10[r7] = r13
                    r7 = 8
                    r10[r7] = r14
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r15)
                    r17 = 9
                    r10[r17] = r7
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
                    r17 = 10
                    r10[r17] = r7
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r32)
                    r17 = 11
                    r10[r17] = r7
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r33)
                    r16 = 12
                    r10[r16] = r7
                    com.meituan.robust.ChangeQuickRedirect r19 = com.ss.android.ugc.aweme.follow.api.a.C0571a.f47745a
                    r20 = 0
                    r21 = 44621(0xae4d, float:6.2527E-41)
                    r39 = r1
                    r7 = 13
                    java.lang.Class[] r1 = new java.lang.Class[r7]
                    java.lang.Class r7 = java.lang.Long.TYPE
                    r1[r8] = r7
                    java.lang.Class r7 = java.lang.Long.TYPE
                    r17 = 1
                    r1[r17] = r7
                    java.lang.Class r7 = java.lang.Integer.TYPE
                    r17 = 2
                    r1[r17] = r7
                    java.lang.Class r7 = java.lang.Integer.TYPE
                    r17 = 3
                    r1[r17] = r7
                    java.lang.Class r7 = java.lang.Integer.TYPE
                    r17 = 4
                    r1[r17] = r7
                    java.lang.Class r7 = java.lang.Long.TYPE
                    r17 = 5
                    r1[r17] = r7
                    java.lang.Class r7 = java.lang.Integer.TYPE
                    r17 = 6
                    r1[r17] = r7
                    java.lang.Class<java.lang.String> r7 = java.lang.String.class
                    r17 = 7
                    r1[r17] = r7
                    java.lang.Class<java.lang.String> r7 = java.lang.String.class
                    r17 = 8
                    r1[r17] = r7
                    java.lang.Class r7 = java.lang.Integer.TYPE
                    r17 = 9
                    r1[r17] = r7
                    java.lang.Class r7 = java.lang.Integer.TYPE
                    r17 = 10
                    r1[r17] = r7
                    java.lang.Class r7 = java.lang.Integer.TYPE
                    r17 = 11
                    r1[r17] = r7
                    java.lang.Class r7 = java.lang.Integer.TYPE
                    r16 = 12
                    r1[r16] = r7
                    java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r23 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
                    r17 = r10
                    r18 = r2
                    r22 = r1
                    boolean r1 = com.meituan.robust.PatchProxy.isSupport(r17, r18, r19, r20, r21, r22, r23)
                    if (r1 == 0) goto L_0x037a
                    r1 = 13
                    java.lang.Object[] r7 = new java.lang.Object[r1]
                    java.lang.Long r1 = new java.lang.Long
                    r1.<init>(r3)
                    r7[r8] = r1
                    java.lang.Long r1 = new java.lang.Long
                    r1.<init>(r5)
                    r3 = 1
                    r7[r3] = r1
                    r1 = 20
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    r3 = 2
                    r7[r3] = r1
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                    r1 = 3
                    r7[r1] = r0
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
                    r1 = 4
                    r7[r1] = r0
                    java.lang.Long r0 = new java.lang.Long
                    r0.<init>(r11)
                    r1 = 5
                    r7[r1] = r0
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r27)
                    r1 = 6
                    r7[r1] = r0
                    r0 = 7
                    r7[r0] = r13
                    r0 = 8
                    r7[r0] = r14
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
                    r1 = 9
                    r7[r1] = r0
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r39)
                    r1 = 10
                    r7[r1] = r0
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r32)
                    r1 = 11
                    r7[r1] = r0
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r33)
                    r1 = 12
                    r7[r1] = r0
                    com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.follow.api.a.C0571a.f47745a
                    r4 = 0
                    r5 = 44621(0xae4d, float:6.2527E-41)
                    r0 = 13
                    java.lang.Class[] r6 = new java.lang.Class[r0]
                    java.lang.Class r0 = java.lang.Long.TYPE
                    r6[r8] = r0
                    java.lang.Class r0 = java.lang.Long.TYPE
                    r1 = 1
                    r6[r1] = r0
                    java.lang.Class r0 = java.lang.Integer.TYPE
                    r1 = 2
                    r6[r1] = r0
                    java.lang.Class r0 = java.lang.Integer.TYPE
                    r1 = 3
                    r6[r1] = r0
                    java.lang.Class r0 = java.lang.Integer.TYPE
                    r1 = 4
                    r6[r1] = r0
                    java.lang.Class r0 = java.lang.Long.TYPE
                    r1 = 5
                    r6[r1] = r0
                    java.lang.Class r0 = java.lang.Integer.TYPE
                    r1 = 6
                    r6[r1] = r0
                    java.lang.Class<java.lang.String> r0 = java.lang.String.class
                    r1 = 7
                    r6[r1] = r0
                    java.lang.Class<java.lang.String> r0 = java.lang.String.class
                    r1 = 8
                    r6[r1] = r0
                    java.lang.Class r0 = java.lang.Integer.TYPE
                    r1 = 9
                    r6[r1] = r0
                    java.lang.Class r0 = java.lang.Integer.TYPE
                    r1 = 10
                    r6[r1] = r0
                    java.lang.Class r0 = java.lang.Integer.TYPE
                    r1 = 11
                    r6[r1] = r0
                    java.lang.Class r0 = java.lang.Integer.TYPE
                    r1 = 12
                    r6[r1] = r0
                    java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r0 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
                    r1 = r7
                    r7 = r0
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                    goto L_0x01ef
                L_0x037a:
                    com.ss.android.ugc.aweme.follow.api.IFollowFeedApiV1 r17 = com.ss.android.ugc.aweme.follow.api.a.f47742b
                    java.lang.String r34 = com.ss.android.ugc.aweme.follow.c.a.b()
                    com.ss.android.ugc.aweme.follow.c.a r1 = com.ss.android.ugc.aweme.follow.c.a.i
                    r2 = 3
                    int r1 = r1.b(r2)
                    java.lang.Integer r35 = java.lang.Integer.valueOf(r1)
                    int r1 = com.ss.android.ugc.aweme.follow.c.a.a()
                    java.lang.Integer r36 = java.lang.Integer.valueOf(r1)
                    long r1 = com.ss.android.ugc.aweme.follow.c.a.d()
                    java.lang.Long r37 = java.lang.Long.valueOf(r1)
                    long r1 = com.ss.android.ugc.aweme.follow.c.a.c()
                    java.lang.Long r38 = java.lang.Long.valueOf(r1)
                    r22 = 20
                    r18 = r3
                    r20 = r5
                    r23 = r0
                    r24 = r9
                    r25 = r11
                    r28 = r13
                    r29 = r15
                    r30 = r39
                    r31 = r14
                    com.google.common.util.concurrent.q r0 = r17.getFriendList(r18, r20, r22, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
                    java.lang.Object r0 = r0.get()
                    java.lang.String r1 = "api.getFriendList(maxCur…lastLongLinkItemId).get()"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                    com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r0 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r0
                    goto L_0x0ae2
                L_0x03c8:
                    r0 = r7
                    com.ss.android.ugc.aweme.follow.presenter.b r1 = r0.r
                    java.lang.String r1 = r1.f47765b
                    java.lang.String r2 = "rec_follow"
                    boolean r1 = android.text.TextUtils.equals(r1, r2)
                    if (r1 == 0) goto L_0x0560
                    int r1 = r6
                    int r2 = r7
                    com.ss.android.ugc.aweme.follow.presenter.b r3 = r0.r
                    long r3 = r3.f47768e
                    java.lang.String r5 = r8
                    java.lang.String r6 = r12
                    r7 = 6
                    java.lang.Object[] r9 = new java.lang.Object[r7]
                    r7 = 20
                    java.lang.Integer r10 = java.lang.Integer.valueOf(r7)
                    r9[r8] = r10
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
                    r10 = 1
                    r9[r10] = r7
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r2)
                    r10 = 2
                    r9[r10] = r7
                    java.lang.Long r7 = new java.lang.Long
                    r7.<init>(r3)
                    r10 = 3
                    r9[r10] = r7
                    r7 = 4
                    r9[r7] = r5
                    r7 = 5
                    r9[r7] = r6
                    r10 = 0
                    com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.follow.api.a.f47741a
                    r12 = 1
                    r13 = 44619(0xae4b, float:6.2525E-41)
                    r7 = 6
                    java.lang.Class[] r14 = new java.lang.Class[r7]
                    java.lang.Class r7 = java.lang.Integer.TYPE
                    r14[r8] = r7
                    java.lang.Class r7 = java.lang.Integer.TYPE
                    r15 = 1
                    r14[r15] = r7
                    java.lang.Class r7 = java.lang.Integer.TYPE
                    r15 = 2
                    r14[r15] = r7
                    java.lang.Class r7 = java.lang.Long.TYPE
                    r15 = 3
                    r14[r15] = r7
                    java.lang.Class<java.lang.String> r7 = java.lang.String.class
                    r15 = 4
                    r14[r15] = r7
                    java.lang.Class<java.lang.String> r7 = java.lang.String.class
                    r15 = 5
                    r14[r15] = r7
                    java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r15 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
                    boolean r7 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
                    if (r7 == 0) goto L_0x048f
                    r7 = 6
                    java.lang.Object[] r9 = new java.lang.Object[r7]
                    r7 = 20
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
                    r9[r8] = r7
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    r7 = 1
                    r9[r7] = r1
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                    r2 = 2
                    r9[r2] = r1
                    java.lang.Long r1 = new java.lang.Long
                    r1.<init>(r3)
                    r2 = 3
                    r9[r2] = r1
                    r1 = 4
                    r9[r1] = r5
                    r1 = 5
                    r9[r1] = r6
                    r10 = 0
                    com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.follow.api.a.f47741a
                    r12 = 1
                    r13 = 44619(0xae4b, float:6.2525E-41)
                    r1 = 6
                    java.lang.Class[] r14 = new java.lang.Class[r1]
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r14[r8] = r1
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r2 = 1
                    r14[r2] = r1
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r2 = 2
                    r14[r2] = r1
                    java.lang.Class r1 = java.lang.Long.TYPE
                    r2 = 3
                    r14[r2] = r1
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r2 = 4
                    r14[r2] = r1
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r2 = 5
                    r14[r2] = r1
                    java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r15 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
                    java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
                L_0x048b:
                    com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r1 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r1
                    goto L_0x055d
                L_0x048f:
                    com.ss.android.ugc.aweme.follow.api.a$a r7 = com.ss.android.ugc.aweme.follow.api.a.f47743c
                    r9 = 6
                    java.lang.Object[] r10 = new java.lang.Object[r9]
                    r9 = 20
                    java.lang.Integer r11 = java.lang.Integer.valueOf(r9)
                    r10[r8] = r11
                    java.lang.Integer r9 = java.lang.Integer.valueOf(r1)
                    r11 = 1
                    r10[r11] = r9
                    java.lang.Integer r9 = java.lang.Integer.valueOf(r2)
                    r11 = 2
                    r10[r11] = r9
                    java.lang.Long r9 = new java.lang.Long
                    r9.<init>(r3)
                    r11 = 3
                    r10[r11] = r9
                    r9 = 4
                    r10[r9] = r5
                    r9 = 5
                    r10[r9] = r6
                    com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.follow.api.a.C0571a.f47745a
                    r12 = 0
                    r13 = 44622(0xae4e, float:6.2529E-41)
                    r9 = 6
                    java.lang.Class[] r14 = new java.lang.Class[r9]
                    java.lang.Class r9 = java.lang.Integer.TYPE
                    r14[r8] = r9
                    java.lang.Class r9 = java.lang.Integer.TYPE
                    r15 = 1
                    r14[r15] = r9
                    java.lang.Class r9 = java.lang.Integer.TYPE
                    r15 = 2
                    r14[r15] = r9
                    java.lang.Class r9 = java.lang.Long.TYPE
                    r15 = 3
                    r14[r15] = r9
                    java.lang.Class<java.lang.String> r9 = java.lang.String.class
                    r15 = 4
                    r14[r15] = r9
                    java.lang.Class<java.lang.String> r9 = java.lang.String.class
                    r15 = 5
                    r14[r15] = r9
                    java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r15 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
                    r9 = r10
                    r10 = r7
                    boolean r9 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
                    if (r9 == 0) goto L_0x0540
                    r9 = 6
                    java.lang.Object[] r10 = new java.lang.Object[r9]
                    r9 = 20
                    java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
                    r10[r8] = r9
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    r9 = 1
                    r10[r9] = r1
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
                    r2 = 2
                    r10[r2] = r1
                    java.lang.Long r1 = new java.lang.Long
                    r1.<init>(r3)
                    r2 = 3
                    r10[r2] = r1
                    r1 = 4
                    r10[r1] = r5
                    r1 = 5
                    r10[r1] = r6
                    com.meituan.robust.ChangeQuickRedirect r4 = com.ss.android.ugc.aweme.follow.api.a.C0571a.f47745a
                    r5 = 0
                    r6 = 44622(0xae4e, float:6.2529E-41)
                    r1 = 6
                    java.lang.Class[] r1 = new java.lang.Class[r1]
                    java.lang.Class r2 = java.lang.Integer.TYPE
                    r1[r8] = r2
                    java.lang.Class r2 = java.lang.Integer.TYPE
                    r3 = 1
                    r1[r3] = r2
                    java.lang.Class r2 = java.lang.Integer.TYPE
                    r3 = 2
                    r1[r3] = r2
                    java.lang.Class r2 = java.lang.Long.TYPE
                    r3 = 3
                    r1[r3] = r2
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    r3 = 4
                    r1[r3] = r2
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    r3 = 5
                    r1[r3] = r2
                    java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r8 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
                    r2 = r10
                    r3 = r7
                    r7 = r1
                    java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
                    goto L_0x048b
                L_0x0540:
                    com.ss.android.ugc.aweme.follow.api.IFollowFeedApiV1 r17 = com.ss.android.ugc.aweme.follow.api.a.f47742b
                    r18 = 20
                    r19 = r1
                    r20 = r2
                    r21 = r3
                    r23 = r5
                    r24 = r6
                    com.google.common.util.concurrent.q r1 = r17.getRecommendList(r18, r19, r20, r21, r23, r24)
                    java.lang.Object r1 = r1.get()
                    java.lang.String r2 = "api.getRecommendList(cou…onIds, lastFeedIds).get()"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                    com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r1 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r1
                L_0x055d:
                    r0 = r1
                    goto L_0x0ae2
                L_0x0560:
                    com.ss.android.ugc.aweme.setting.AbTestManager r1 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
                    java.lang.Object[] r9 = new java.lang.Object[r8]
                    com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
                    r12 = 0
                    r13 = 71677(0x117fd, float:1.00441E-40)
                    java.lang.Class[] r14 = new java.lang.Class[r8]
                    java.lang.Class r15 = java.lang.Boolean.TYPE
                    r10 = r1
                    boolean r2 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)
                    if (r2 == 0) goto L_0x0590
                    java.lang.Object[] r9 = new java.lang.Object[r8]
                    com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.setting.AbTestManager.f63777a
                    r12 = 0
                    r13 = 71677(0x117fd, float:1.00441E-40)
                    java.lang.Class[] r14 = new java.lang.Class[r8]
                    java.lang.Class r15 = java.lang.Boolean.TYPE
                    r10 = r1
                    java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)
                    java.lang.Boolean r1 = (java.lang.Boolean) r1
                    boolean r1 = r1.booleanValue()
                    r2 = r1
                    goto L_0x05b9
                L_0x0590:
                    java.lang.Integer r2 = r1.j
                    if (r2 == 0) goto L_0x05a0
                    java.lang.Integer r1 = r1.j
                    int r1 = r1.intValue()
                    r2 = 1
                    if (r1 != r2) goto L_0x059e
                    goto L_0x05b9
                L_0x059e:
                    r2 = 0
                    goto L_0x05b9
                L_0x05a0:
                    r2 = 1
                    com.ss.android.ugc.aweme.setting.model.AbTestModel r3 = r1.d()
                    if (r3 != 0) goto L_0x05a8
                    goto L_0x05b9
                L_0x05a8:
                    int r3 = r3.isSmartFeed
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r1.j = r3
                    java.lang.Integer r1 = r1.j
                    int r1 = r1.intValue()
                    if (r1 != r2) goto L_0x059e
                    r2 = 1
                L_0x05b9:
                    if (r2 == 0) goto L_0x0620
                    com.ss.android.ugc.aweme.follow.api.b$a r17 = com.ss.android.ugc.aweme.follow.api.b.f47748c
                    int r1 = r13
                    long r2 = r14
                    int r4 = r16
                    r22 = 20
                    int r5 = r6
                    int r6 = r7
                    com.ss.android.ugc.aweme.follow.presenter.b r7 = r0.r
                    long r7 = r7.f47768e
                    com.ss.android.ugc.aweme.follow.presenter.b r9 = r0.r
                    java.lang.Object r9 = r9.mData
                    if (r9 == 0) goto L_0x05e0
                    com.ss.android.ugc.aweme.follow.presenter.b r9 = r0.r
                    java.lang.Object r9 = r9.mData
                    com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r9 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r9
                    int r9 = r9.getFetchRecommend()
                    r27 = r9
                    goto L_0x05e2
                L_0x05e0:
                    r27 = 1
                L_0x05e2:
                    java.lang.String r9 = r8
                    r28 = r9
                    java.lang.String r9 = r12
                    r29 = r9
                    java.lang.String r9 = r17
                    r30 = r9
                    java.lang.String r9 = r18
                    r31 = r9
                    java.lang.String r9 = r9
                    r32 = r9
                    int r9 = r10
                    r33 = r9
                    int r9 = r11
                    r34 = r9
                    int r35 = com.ss.android.ugc.aweme.utils.permission.e.a()
                    int r36 = com.ss.android.ugc.aweme.utils.permission.e.b()
                    int r9 = r19
                    r37 = r9
                    int r9 = r20
                    r38 = r9
                    r18 = r1
                    r19 = r2
                    r21 = r4
                    r23 = r5
                    r24 = r6
                    r25 = r7
                    com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r1 = r17.a(r18, r19, r21, r22, r23, r24, r25, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
                    goto L_0x055d
                L_0x0620:
                    long r3 = r2
                    long r5 = r4
                    int r1 = r6
                    int r9 = r7
                    com.ss.android.ugc.aweme.follow.presenter.b r2 = r0.r
                    long r10 = r2.f47768e
                    com.ss.android.ugc.aweme.follow.presenter.b r2 = r0.r
                    java.lang.Object r2 = r2.mData
                    if (r2 == 0) goto L_0x063e
                    com.ss.android.ugc.aweme.follow.presenter.b r2 = r0.r
                    java.lang.Object r2 = r2.mData
                    com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r2 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r2
                    int r2 = r2.getFetchRecommend()
                    r12 = r2
                    goto L_0x063f
                L_0x063e:
                    r12 = 1
                L_0x063f:
                    java.lang.String r13 = r8
                    java.lang.String r14 = r12
                    java.lang.String r15 = r17
                    java.lang.String r2 = r18
                    java.lang.String r7 = r9
                    int r8 = r10
                    r40 = r8
                    int r8 = r11
                    int r21 = com.ss.android.ugc.aweme.utils.permission.e.a()
                    int r22 = com.ss.android.ugc.aweme.utils.permission.e.b()
                    r41 = r8
                    int r8 = r19
                    r42 = r8
                    int r8 = r20
                    r0 = 18
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    r43 = r8
                    java.lang.Long r8 = new java.lang.Long
                    r8.<init>(r3)
                    r17 = 0
                    r0[r17] = r8
                    java.lang.Long r8 = new java.lang.Long
                    r8.<init>(r5)
                    r17 = 1
                    r0[r17] = r8
                    r8 = 20
                    java.lang.Integer r17 = java.lang.Integer.valueOf(r8)
                    r8 = 2
                    r0[r8] = r17
                    java.lang.Integer r8 = java.lang.Integer.valueOf(r1)
                    r17 = 3
                    r0[r17] = r8
                    java.lang.Integer r8 = java.lang.Integer.valueOf(r9)
                    r17 = 4
                    r0[r17] = r8
                    java.lang.Long r8 = new java.lang.Long
                    r8.<init>(r10)
                    r17 = 5
                    r0[r17] = r8
                    java.lang.Integer r8 = java.lang.Integer.valueOf(r12)
                    r17 = 6
                    r0[r17] = r8
                    r8 = 7
                    r0[r8] = r13
                    r8 = 8
                    r0[r8] = r14
                    r8 = 9
                    r0[r8] = r15
                    r8 = 10
                    r0[r8] = r2
                    r8 = 11
                    r0[r8] = r7
                    java.lang.Integer r8 = java.lang.Integer.valueOf(r40)
                    r16 = 12
                    r0[r16] = r8
                    java.lang.Integer r8 = java.lang.Integer.valueOf(r41)
                    r17 = 13
                    r0[r17] = r8
                    r8 = 14
                    java.lang.Integer r17 = java.lang.Integer.valueOf(r21)
                    r0[r8] = r17
                    r8 = 15
                    java.lang.Integer r17 = java.lang.Integer.valueOf(r22)
                    r0[r8] = r17
                    r8 = 16
                    java.lang.Integer r17 = java.lang.Integer.valueOf(r42)
                    r0[r8] = r17
                    r8 = 17
                    java.lang.Integer r17 = java.lang.Integer.valueOf(r43)
                    r0[r8] = r17
                    r24 = 0
                    com.meituan.robust.ChangeQuickRedirect r25 = com.ss.android.ugc.aweme.follow.api.a.f47741a
                    r26 = 1
                    r27 = 44617(0xae49, float:6.2522E-41)
                    r8 = 18
                    java.lang.Class[] r8 = new java.lang.Class[r8]
                    java.lang.Class r17 = java.lang.Long.TYPE
                    r18 = 0
                    r8[r18] = r17
                    java.lang.Class r17 = java.lang.Long.TYPE
                    r18 = 1
                    r8[r18] = r17
                    java.lang.Class r17 = java.lang.Integer.TYPE
                    r18 = 2
                    r8[r18] = r17
                    java.lang.Class r17 = java.lang.Integer.TYPE
                    r18 = 3
                    r8[r18] = r17
                    java.lang.Class r17 = java.lang.Integer.TYPE
                    r18 = 4
                    r8[r18] = r17
                    java.lang.Class r17 = java.lang.Long.TYPE
                    r18 = 5
                    r8[r18] = r17
                    java.lang.Class r17 = java.lang.Integer.TYPE
                    r18 = 6
                    r8[r18] = r17
                    java.lang.Class<java.lang.String> r17 = java.lang.String.class
                    r18 = 7
                    r8[r18] = r17
                    java.lang.Class<java.lang.String> r17 = java.lang.String.class
                    r18 = 8
                    r8[r18] = r17
                    java.lang.Class<java.lang.String> r17 = java.lang.String.class
                    r18 = 9
                    r8[r18] = r17
                    java.lang.Class<java.lang.String> r17 = java.lang.String.class
                    r18 = 10
                    r8[r18] = r17
                    java.lang.Class<java.lang.String> r17 = java.lang.String.class
                    r18 = 11
                    r8[r18] = r17
                    java.lang.Class r17 = java.lang.Integer.TYPE
                    r16 = 12
                    r8[r16] = r17
                    java.lang.Class r17 = java.lang.Integer.TYPE
                    r18 = 13
                    r8[r18] = r17
                    r17 = 14
                    java.lang.Class r18 = java.lang.Integer.TYPE
                    r8[r17] = r18
                    r17 = 15
                    java.lang.Class r18 = java.lang.Integer.TYPE
                    r8[r17] = r18
                    r17 = 16
                    java.lang.Class r18 = java.lang.Integer.TYPE
                    r8[r17] = r18
                    r17 = 17
                    java.lang.Class r18 = java.lang.Integer.TYPE
                    r8[r17] = r18
                    java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r29 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
                    r23 = r0
                    r28 = r8
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r23, r24, r25, r26, r27, r28, r29)
                    if (r0 == 0) goto L_0x0865
                    r0 = 18
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    java.lang.Long r8 = new java.lang.Long
                    r8.<init>(r3)
                    r3 = 0
                    r0[r3] = r8
                    java.lang.Long r3 = new java.lang.Long
                    r3.<init>(r5)
                    r4 = 1
                    r0[r4] = r3
                    r3 = 20
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r4 = 2
                    r0[r4] = r3
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    r3 = 3
                    r0[r3] = r1
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                    r3 = 4
                    r0[r3] = r1
                    java.lang.Long r1 = new java.lang.Long
                    r1.<init>(r10)
                    r3 = 5
                    r0[r3] = r1
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
                    r3 = 6
                    r0[r3] = r1
                    r1 = 7
                    r0[r1] = r13
                    r1 = 8
                    r0[r1] = r14
                    r1 = 9
                    r0[r1] = r15
                    r1 = 10
                    r0[r1] = r2
                    r1 = 11
                    r0[r1] = r7
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r40)
                    r2 = 12
                    r0[r2] = r1
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r41)
                    r2 = 13
                    r0[r2] = r1
                    r1 = 14
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r21)
                    r0[r1] = r2
                    r1 = 15
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r22)
                    r0[r1] = r2
                    r1 = 16
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r42)
                    r0[r1] = r2
                    r1 = 17
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r43)
                    r0[r1] = r2
                    r24 = 0
                    com.meituan.robust.ChangeQuickRedirect r25 = com.ss.android.ugc.aweme.follow.api.a.f47741a
                    r26 = 1
                    r27 = 44617(0xae49, float:6.2522E-41)
                    r1 = 18
                    java.lang.Class[] r1 = new java.lang.Class[r1]
                    java.lang.Class r2 = java.lang.Long.TYPE
                    r3 = 0
                    r1[r3] = r2
                    java.lang.Class r2 = java.lang.Long.TYPE
                    r3 = 1
                    r1[r3] = r2
                    java.lang.Class r2 = java.lang.Integer.TYPE
                    r3 = 2
                    r1[r3] = r2
                    java.lang.Class r2 = java.lang.Integer.TYPE
                    r3 = 3
                    r1[r3] = r2
                    java.lang.Class r2 = java.lang.Integer.TYPE
                    r3 = 4
                    r1[r3] = r2
                    java.lang.Class r2 = java.lang.Long.TYPE
                    r3 = 5
                    r1[r3] = r2
                    java.lang.Class r2 = java.lang.Integer.TYPE
                    r3 = 6
                    r1[r3] = r2
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    r3 = 7
                    r1[r3] = r2
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    r3 = 8
                    r1[r3] = r2
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    r3 = 9
                    r1[r3] = r2
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    r3 = 10
                    r1[r3] = r2
                    java.lang.Class<java.lang.String> r2 = java.lang.String.class
                    r3 = 11
                    r1[r3] = r2
                    java.lang.Class r2 = java.lang.Integer.TYPE
                    r3 = 12
                    r1[r3] = r2
                    java.lang.Class r2 = java.lang.Integer.TYPE
                    r3 = 13
                    r1[r3] = r2
                    r2 = 14
                    java.lang.Class r3 = java.lang.Integer.TYPE
                    r1[r2] = r3
                    r2 = 15
                    java.lang.Class r3 = java.lang.Integer.TYPE
                    r1[r2] = r3
                    r2 = 16
                    java.lang.Class r3 = java.lang.Integer.TYPE
                    r1[r2] = r3
                    r2 = 17
                    java.lang.Class r3 = java.lang.Integer.TYPE
                    r1[r2] = r3
                    java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r29 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
                    r23 = r0
                    r28 = r1
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r23, r24, r25, r26, r27, r28, r29)
                L_0x0861:
                    com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r0 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r0
                    goto L_0x0ae2
                L_0x0865:
                    com.ss.android.ugc.aweme.follow.api.a$a r0 = com.ss.android.ugc.aweme.follow.api.a.f47743c
                    r8 = 18
                    java.lang.Object[] r8 = new java.lang.Object[r8]
                    r44 = r0
                    java.lang.Long r0 = new java.lang.Long
                    r0.<init>(r3)
                    r17 = 0
                    r8[r17] = r0
                    java.lang.Long r0 = new java.lang.Long
                    r0.<init>(r5)
                    r17 = 1
                    r8[r17] = r0
                    r0 = 20
                    java.lang.Integer r17 = java.lang.Integer.valueOf(r0)
                    r0 = 2
                    r8[r0] = r17
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                    r17 = 3
                    r8[r17] = r0
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
                    r17 = 4
                    r8[r17] = r0
                    java.lang.Long r0 = new java.lang.Long
                    r0.<init>(r10)
                    r17 = 5
                    r8[r17] = r0
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
                    r17 = 6
                    r8[r17] = r0
                    r0 = 7
                    r8[r0] = r13
                    r0 = 8
                    r8[r0] = r14
                    r0 = 9
                    r8[r0] = r15
                    r0 = 10
                    r8[r0] = r2
                    r0 = 11
                    r8[r0] = r7
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r40)
                    r16 = 12
                    r8[r16] = r0
                    java.lang.Integer r0 = java.lang.Integer.valueOf(r41)
                    r17 = 13
                    r8[r17] = r0
                    r0 = 14
                    java.lang.Integer r17 = java.lang.Integer.valueOf(r21)
                    r8[r0] = r17
                    r0 = 15
                    java.lang.Integer r17 = java.lang.Integer.valueOf(r22)
                    r8[r0] = r17
                    r0 = 16
                    java.lang.Integer r17 = java.lang.Integer.valueOf(r42)
                    r8[r0] = r17
                    r0 = 17
                    java.lang.Integer r17 = java.lang.Integer.valueOf(r43)
                    r8[r0] = r17
                    com.meituan.robust.ChangeQuickRedirect r25 = com.ss.android.ugc.aweme.follow.api.a.C0571a.f47745a
                    r26 = 0
                    r27 = 44620(0xae4c, float:6.2526E-41)
                    r0 = 18
                    java.lang.Class[] r0 = new java.lang.Class[r0]
                    java.lang.Class r17 = java.lang.Long.TYPE
                    r18 = 0
                    r0[r18] = r17
                    java.lang.Class r17 = java.lang.Long.TYPE
                    r18 = 1
                    r0[r18] = r17
                    java.lang.Class r17 = java.lang.Integer.TYPE
                    r18 = 2
                    r0[r18] = r17
                    java.lang.Class r17 = java.lang.Integer.TYPE
                    r18 = 3
                    r0[r18] = r17
                    java.lang.Class r17 = java.lang.Integer.TYPE
                    r18 = 4
                    r0[r18] = r17
                    java.lang.Class r17 = java.lang.Long.TYPE
                    r18 = 5
                    r0[r18] = r17
                    java.lang.Class r17 = java.lang.Integer.TYPE
                    r18 = 6
                    r0[r18] = r17
                    java.lang.Class<java.lang.String> r17 = java.lang.String.class
                    r18 = 7
                    r0[r18] = r17
                    java.lang.Class<java.lang.String> r17 = java.lang.String.class
                    r18 = 8
                    r0[r18] = r17
                    java.lang.Class<java.lang.String> r17 = java.lang.String.class
                    r18 = 9
                    r0[r18] = r17
                    java.lang.Class<java.lang.String> r17 = java.lang.String.class
                    r18 = 10
                    r0[r18] = r17
                    java.lang.Class<java.lang.String> r17 = java.lang.String.class
                    r18 = 11
                    r0[r18] = r17
                    java.lang.Class r17 = java.lang.Integer.TYPE
                    r16 = 12
                    r0[r16] = r17
                    java.lang.Class r17 = java.lang.Integer.TYPE
                    r18 = 13
                    r0[r18] = r17
                    r17 = 14
                    java.lang.Class r18 = java.lang.Integer.TYPE
                    r0[r17] = r18
                    r17 = 15
                    java.lang.Class r18 = java.lang.Integer.TYPE
                    r0[r17] = r18
                    r17 = 16
                    java.lang.Class r18 = java.lang.Integer.TYPE
                    r0[r17] = r18
                    r17 = 17
                    java.lang.Class r18 = java.lang.Integer.TYPE
                    r0[r17] = r18
                    java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r29 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
                    r23 = r8
                    r24 = r44
                    r28 = r0
                    boolean r0 = com.meituan.robust.PatchProxy.isSupport(r23, r24, r25, r26, r27, r28, r29)
                    if (r0 == 0) goto L_0x0a67
                    r0 = 18
                    java.lang.Object[] r0 = new java.lang.Object[r0]
                    java.lang.Long r8 = new java.lang.Long
                    r8.<init>(r3)
                    r3 = 0
                    r0[r3] = r8
                    java.lang.Long r3 = new java.lang.Long
                    r3.<init>(r5)
                    r4 = 1
                    r0[r4] = r3
                    r3 = 20
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    r4 = 2
                    r0[r4] = r3
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    r3 = 3
                    r0[r3] = r1
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
                    r3 = 4
                    r0[r3] = r1
                    java.lang.Long r1 = new java.lang.Long
                    r1.<init>(r10)
                    r3 = 5
                    r0[r3] = r1
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r12)
                    r3 = 6
                    r0[r3] = r1
                    r1 = 7
                    r0[r1] = r13
                    r1 = 8
                    r0[r1] = r14
                    r1 = 9
                    r0[r1] = r15
                    r1 = 10
                    r0[r1] = r2
                    r1 = 11
                    r0[r1] = r7
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r40)
                    r2 = 12
                    r0[r2] = r1
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r41)
                    r2 = 13
                    r0[r2] = r1
                    r1 = 14
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r21)
                    r0[r1] = r2
                    r1 = 15
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r22)
                    r0[r1] = r2
                    r1 = 16
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r42)
                    r0[r1] = r2
                    r1 = 17
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r43)
                    r0[r1] = r2
                    com.meituan.robust.ChangeQuickRedirect r3 = com.ss.android.ugc.aweme.follow.api.a.C0571a.f47745a
                    r4 = 0
                    r5 = 44620(0xae4c, float:6.2526E-41)
                    r1 = 18
                    java.lang.Class[] r6 = new java.lang.Class[r1]
                    java.lang.Class r1 = java.lang.Long.TYPE
                    r2 = 0
                    r6[r2] = r1
                    java.lang.Class r1 = java.lang.Long.TYPE
                    r2 = 1
                    r6[r2] = r1
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r2 = 2
                    r6[r2] = r1
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r2 = 3
                    r6[r2] = r1
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r2 = 4
                    r6[r2] = r1
                    java.lang.Class r1 = java.lang.Long.TYPE
                    r2 = 5
                    r6[r2] = r1
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r2 = 6
                    r6[r2] = r1
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r2 = 7
                    r6[r2] = r1
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r2 = 8
                    r6[r2] = r1
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r2 = 9
                    r6[r2] = r1
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r2 = 10
                    r6[r2] = r1
                    java.lang.Class<java.lang.String> r1 = java.lang.String.class
                    r2 = 11
                    r6[r2] = r1
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r2 = 12
                    r6[r2] = r1
                    java.lang.Class r1 = java.lang.Integer.TYPE
                    r2 = 13
                    r6[r2] = r1
                    r1 = 14
                    java.lang.Class r2 = java.lang.Integer.TYPE
                    r6[r1] = r2
                    r1 = 15
                    java.lang.Class r2 = java.lang.Integer.TYPE
                    r6[r1] = r2
                    r1 = 16
                    java.lang.Class r2 = java.lang.Integer.TYPE
                    r6[r1] = r2
                    r1 = 17
                    java.lang.Class r2 = java.lang.Integer.TYPE
                    r6[r1] = r2
                    java.lang.Class<com.ss.android.ugc.aweme.follow.presenter.FollowFeedList> r7 = com.ss.android.ugc.aweme.follow.presenter.FollowFeedList.class
                    r1 = r0
                    r2 = r44
                    java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
                    goto L_0x0861
                L_0x0a67:
                    com.ss.android.ugc.aweme.follow.api.IFollowFeedApiV1 r0 = com.ss.android.ugc.aweme.follow.api.a.f47742b
                    com.ss.android.ugc.aweme.newfollow.util.k r8 = com.ss.android.ugc.aweme.newfollow.util.k.a()
                    r45 = r2
                    java.lang.String r2 = "RecUserImpressionReporter.getInstance()"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r8, r2)
                    java.lang.String r16 = r8.b()
                    com.ss.android.ugc.aweme.main.guide.b$a r2 = com.ss.android.ugc.aweme.main.guide.b.f54809f
                    com.ss.android.ugc.aweme.main.guide.b r2 = r2.a()
                    java.lang.String r23 = r2.a()
                    if (r23 != 0) goto L_0x0a87
                    kotlin.jvm.internal.Intrinsics.throwNpe()
                L_0x0a87:
                    java.lang.Integer r25 = java.lang.Integer.valueOf(r43)
                    java.lang.String r26 = com.ss.android.ugc.aweme.follow.c.a.b()
                    com.ss.android.ugc.aweme.follow.c.a r2 = com.ss.android.ugc.aweme.follow.c.a.i
                    r8 = 2
                    int r2 = r2.b(r8)
                    java.lang.Integer r27 = java.lang.Integer.valueOf(r2)
                    com.ss.android.ugc.aweme.follow.c.a r2 = com.ss.android.ugc.aweme.follow.c.a.i
                    r8 = 1
                    int r2 = r2.b(r8)
                    java.lang.Integer r28 = java.lang.Integer.valueOf(r2)
                    int r2 = com.ss.android.ugc.aweme.follow.c.a.a()
                    java.lang.Integer r29 = java.lang.Integer.valueOf(r2)
                    long r17 = com.ss.android.ugc.aweme.follow.c.a.d()
                    java.lang.Long r30 = java.lang.Long.valueOf(r17)
                    long r17 = com.ss.android.ugc.aweme.follow.c.a.c()
                    java.lang.Long r31 = java.lang.Long.valueOf(r17)
                    r2 = 20
                    r20 = r7
                    r7 = r2
                    r19 = r45
                    r2 = r0
                    r0 = r40
                    r17 = r41
                    r24 = r42
                    r8 = r1
                    r1 = r15
                    r15 = r16
                    r16 = r0
                    r18 = r1
                    com.google.common.util.concurrent.q r0 = r2.getFollowFeedList(r3, r5, r7, r8, r9, r10, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
                    java.lang.Object r0 = r0.get()
                    java.lang.String r1 = "api.getFollowFeedList(ma…lastLongLinkItemId).get()"
                    kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
                    com.ss.android.ugc.aweme.follow.presenter.FollowFeedList r0 = (com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r0
                L_0x0ae2:
                    com.ss.android.ugc.aweme.live.feedpage.c r1 = com.ss.android.ugc.aweme.live.feedpage.c.a()
                    r1.a((com.ss.android.ugc.aweme.follow.presenter.FollowFeedList) r0)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.follow.presenter.b.AnonymousClass1.call():java.lang.Object");
            }

            {
                this.r = r4;
            }
        };
        m mVar2 = mVar;
        mVar2.a(weakHandler, r34, 0);
    }
}
