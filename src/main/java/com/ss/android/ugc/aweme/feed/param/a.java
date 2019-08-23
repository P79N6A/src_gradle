package com.ss.android.ugc.aweme.feed.param;

import com.meituan.robust.ChangeQuickRedirect;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45764a;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0193  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x01a7  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0247  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0249  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0257  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0259  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0261  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0263  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x02e9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.ss.android.ugc.aweme.feed.param.b a(android.app.Activity r46) {
        /*
            r0 = r46
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f45764a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.app.Activity> r3 = android.app.Activity.class
            r7[r9] = r3
            java.lang.Class<com.ss.android.ugc.aweme.feed.param.b> r8 = com.ss.android.ugc.aweme.feed.param.b.class
            r3 = 0
            r5 = 1
            r6 = 41954(0xa3e2, float:5.879E-41)
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0037
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            r11 = 0
            com.meituan.robust.ChangeQuickRedirect r12 = f45764a
            r13 = 1
            r14 = 41954(0xa3e2, float:5.879E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            r15[r9] = r0
            java.lang.Class<com.ss.android.ugc.aweme.feed.param.b> r16 = com.ss.android.ugc.aweme.feed.param.b.class
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            com.ss.android.ugc.aweme.feed.param.b r0 = (com.ss.android.ugc.aweme.feed.param.b) r0
            return r0
        L_0x0037:
            android.content.Intent r2 = r46.getIntent()
            java.lang.String r3 = "refer"
            java.lang.String r3 = r2.getStringExtra(r3)
            java.lang.String r4 = "id"
            java.lang.String r4 = r2.getStringExtra(r4)
            java.lang.String r5 = "cid"
            java.lang.String r5 = r2.getStringExtra(r5)
            java.lang.String r6 = "ids"
            java.lang.String r6 = r2.getStringExtra(r6)
            java.lang.String r7 = "userid"
            java.lang.String r7 = r2.getStringExtra(r7)
            java.lang.String r8 = "video_from"
            java.lang.String r8 = r2.getStringExtra(r8)
            java.lang.String r10 = "video_challenge_profile_from"
            java.lang.String r10 = r2.getStringExtra(r10)
            java.lang.String r11 = "music_id"
            java.lang.String r11 = r2.getStringExtra(r11)
            java.lang.String r12 = "sticker_id"
            java.lang.String r12 = r2.getStringExtra(r12)
            java.lang.String r13 = "challenge_id"
            java.lang.String r13 = r2.getStringExtra(r13)
            java.lang.String r14 = "enter_method"
            java.lang.String r14 = r2.getStringExtra(r14)
            java.lang.String r15 = "poi_id"
            java.lang.String r15 = r2.getStringExtra(r15)
            java.lang.String r1 = "promotion_id"
            java.lang.String r1 = r2.getStringExtra(r1)
            java.lang.String r9 = "product_id"
            java.lang.String r9 = r2.getStringExtra(r9)
            java.lang.String r0 = "video_type"
            r17 = r1
            r1 = -1
            int r0 = r2.getIntExtra(r0, r1)
            java.lang.String r1 = "from_uid"
            java.lang.String r1 = r2.getStringExtra(r1)
            r18 = r1
            java.lang.String r1 = "from_token"
            r2.getStringExtra(r1)
            java.lang.String r1 = "query_aweme_mode"
            java.lang.String r1 = r2.getStringExtra(r1)
            r19 = r1
            java.lang.String r1 = "account_type"
            java.lang.String r1 = r2.getStringExtra(r1)
            r20 = r1
            java.lang.String r1 = "tab_name"
            java.lang.String r1 = r2.getStringExtra(r1)
            r21 = r1
            java.lang.String r1 = "push_params"
            java.lang.String r1 = r2.getStringExtra(r1)
            r22 = r1
            java.lang.String r1 = "like_enter_method"
            java.lang.String r1 = r2.getStringExtra(r1)
            r23 = r1
            java.lang.String r1 = "content_source"
            java.lang.String r1 = r2.getStringExtra(r1)
            r24 = r1
            java.lang.String r1 = "enter_from_request_id"
            java.lang.String r1 = r2.getStringExtra(r1)
            r25 = r1
            java.lang.String r1 = "previous_page"
            java.lang.String r1 = r2.getStringExtra(r1)
            r26 = r1
            java.lang.String r1 = "search_keyword"
            java.lang.String r1 = r2.getStringExtra(r1)
            r27 = r1
            java.lang.String r1 = "extra_previous_page_position"
            java.lang.String r1 = r2.getStringExtra(r1)
            r28 = r1
            java.lang.String r1 = "from_adsapp_activity"
            r29 = r0
            r0 = 0
            boolean r1 = r2.getBooleanExtra(r1, r0)
            r30 = r1
            java.lang.String r1 = "from_post_list"
            int r1 = r2.getIntExtra(r1, r0)
            java.lang.String r0 = "related_gid"
            java.lang.String r0 = r2.getStringExtra(r0)
            r31 = r0
            java.lang.String r0 = "type"
            r32 = r1
            r1 = 0
            int r0 = r2.getIntExtra(r0, r1)
            r33 = r0
            java.lang.String r0 = "is_recommend"
            boolean r0 = r2.getBooleanExtra(r0, r1)
            java.lang.String r1 = "cell_id"
            java.lang.String r1 = r2.getStringExtra(r1)
            r34 = r1
            java.lang.String r1 = "task_type"
            r35 = r0
            r0 = 0
            int r1 = r2.getIntExtra(r1, r0)
            java.lang.String r0 = "micro_game_station_id"
            java.lang.String r0 = r2.getStringExtra(r0)
            r36 = r0
            java.lang.String r0 = "micro_game_station_hashtag"
            java.lang.String r0 = r2.getStringExtra(r0)
            r37 = r0
            java.lang.String r0 = "feeds_aweme_id"
            java.lang.String r0 = r2.getStringExtra(r0)
            r38 = r0
            java.lang.String r0 = "hot_search_key"
            java.lang.String r0 = r2.getStringExtra(r0)
            r39 = r0
            java.lang.String r0 = "hot_is_ad"
            r40 = r1
            r1 = 0
            boolean r0 = r2.getBooleanExtra(r0, r1)
            java.lang.String r1 = "micro_game_station_count"
            r41 = r0
            r0 = 10
            int r0 = r2.getIntExtra(r1, r0)
            java.lang.String r1 = "micro_game_station_cursor"
            r42 = r0
            r0 = 0
            int r1 = r2.getIntExtra(r1, r0)
            java.lang.String r0 = "show_vote"
            java.lang.String r0 = r2.getStringExtra(r0)     // Catch:{ Exception -> 0x017d }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Exception -> 0x017d }
            r43 = r1
            r1 = 1
            if (r0 != r1) goto L_0x017f
            r0 = 1
            goto L_0x0180
        L_0x017d:
            r43 = r1
        L_0x017f:
            r0 = 0
        L_0x0180:
            java.lang.String r1 = "video_current_position"
            r44 = r14
            r45 = r15
            r14 = 0
            long r14 = r2.getLongExtra(r1, r14)
            com.ss.android.ugc.aweme.feed.param.b r1 = new com.ss.android.ugc.aweme.feed.param.b
            r1.<init>()
            if (r3 != 0) goto L_0x0195
            java.lang.String r3 = ""
        L_0x0195:
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setEventType(r3)
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setAid(r4)
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setCid(r5)
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setIds(r6)
            if (r7 != 0) goto L_0x01a9
            java.lang.String r7 = ""
        L_0x01a9:
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setUid(r7)
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setFrom(r8)
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setChallengeProfileFrom(r10)
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setMusicId(r11)
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setStickerId(r12)
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setChallengeId(r13)
            r3 = r44
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setEnterMethodValue(r3)
            r3 = r45
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setPoiId(r3)
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setProductId(r9)
            r3 = r17
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setPromotionId(r3)
            r3 = r29
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setVideoType(r3)
            r3 = r18
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setShareUserId(r3)
            r3 = r19
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setQueryAwemeMode(r3)
            r3 = r20
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setAccountType(r3)
            r3 = r21
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setTabName(r3)
            r3 = r22
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setPushParams(r3)
            r3 = r23
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setLikeEnterMethod(r3)
            r3 = r24
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setContentSource(r3)
            r3 = r25
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setEnterFromRequestId(r3)
            r3 = r26
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setPreviousPage(r3)
            r3 = r27
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setSearchKeyword(r3)
            r3 = r28
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setPreviousPagePosition(r3)
            r3 = r30
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setFromAdsActivity(r3)
            r3 = r35
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setRecommend(r3)
            r3 = r33
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setType(r3)
            r3 = r34
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setCellId(r3)
            java.lang.String r3 = "index"
            r4 = -1
            int r2 = r2.getIntExtra(r3, r4)
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setIndex(r2)
            r2 = r32
            r3 = 1
            if (r2 != r3) goto L_0x0249
            r2 = 1
            goto L_0x024a
        L_0x0249:
            r2 = 0
        L_0x024a:
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setFromPostList(r2)
            r2 = r40
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setTaskType(r2)
            r3 = 2
            if (r2 != r3) goto L_0x0259
            r4 = 1
            goto L_0x025a
        L_0x0259:
            r4 = 0
        L_0x025a:
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setShowCommentAfterOpen(r4)
            r4 = 3
            if (r2 != r4) goto L_0x0263
            r2 = 1
            goto L_0x0264
        L_0x0263:
            r2 = 0
        L_0x0264:
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setShowShareAfterOpen(r2)
            r2 = r31
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setRelatedId(r2)
            r2 = r36
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setMicroAppId(r2)
            r2 = r37
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setHashTagName(r2)
            r2 = r42
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setCount(r2)
            r2 = r38
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setFeedsAwemeId(r2)
            r2 = r39
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setHotSearch(r2)
            r2 = r43
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.setCursor(r2)
            com.ss.android.ugc.aweme.feed.param.b r0 = r1.setShowVote(r0)
            r1 = r41
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setAdSpot(r1)
            com.ss.android.ugc.aweme.feed.param.b r0 = r0.setVideoCurrentPosition(r14)
            com.ss.android.ugc.aweme.feed.param.FeedParamProvider$a r1 = com.ss.android.ugc.aweme.feed.param.FeedParamProvider.f45761c
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r2 = r46
            r5 = 0
            r4[r5] = r2
            r6 = 1
            r4[r6] = r0
            com.meituan.robust.ChangeQuickRedirect r7 = com.ss.android.ugc.aweme.feed.param.FeedParamProvider.a.f45763a
            r8 = 0
            r9 = 41961(0xa3e9, float:5.88E-41)
            java.lang.Class[] r10 = new java.lang.Class[r3]
            java.lang.Class<android.content.Context> r11 = android.content.Context.class
            r10[r5] = r11
            java.lang.Class<com.ss.android.ugc.aweme.feed.param.b> r5 = com.ss.android.ugc.aweme.feed.param.b.class
            r10[r6] = r5
            java.lang.Class r11 = java.lang.Void.TYPE
            r5 = r1
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)
            if (r4 == 0) goto L_0x02e9
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r2
            r2 = 1
            r4[r2] = r0
            com.meituan.robust.ChangeQuickRedirect r6 = com.ss.android.ugc.aweme.feed.param.FeedParamProvider.a.f45763a
            r7 = 0
            r8 = 41961(0xa3e9, float:5.88E-41)
            java.lang.Class[] r9 = new java.lang.Class[r3]
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            r9[r5] = r3
            java.lang.Class<com.ss.android.ugc.aweme.feed.param.b> r3 = com.ss.android.ugc.aweme.feed.param.b.class
            r9[r2] = r3
            java.lang.Class r10 = java.lang.Void.TYPE
            r5 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r4, r5, r6, r7, r8, r9, r10)
            goto L_0x030e
        L_0x02e9:
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r2, r1)
            java.lang.String r1 = "param"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r1)
            android.app.Activity r1 = com.ss.android.ugc.aweme.base.utils.v.a((android.content.Context) r46)
            if (r1 == 0) goto L_0x030f
            android.support.v4.app.FragmentActivity r1 = (android.support.v4.app.FragmentActivity) r1
            android.arch.lifecycle.ViewModelProvider r1 = android.arch.lifecycle.ViewModelProviders.of((android.support.v4.app.FragmentActivity) r1)
            java.lang.Class<com.ss.android.ugc.aweme.feed.param.FeedParamProvider> r2 = com.ss.android.ugc.aweme.feed.param.FeedParamProvider.class
            android.arch.lifecycle.ViewModel r1 = r1.get(r2)
            java.lang.String r2 = "ViewModelProviders.of(ac…aramProvider::class.java)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            com.ss.android.ugc.aweme.feed.param.FeedParamProvider r1 = (com.ss.android.ugc.aweme.feed.param.FeedParamProvider) r1
            r1.f45762b = r0
        L_0x030e:
            return r0
        L_0x030f:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.support.v4.app.FragmentActivity"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.feed.param.a.a(android.app.Activity):com.ss.android.ugc.aweme.feed.param.b");
    }
}
