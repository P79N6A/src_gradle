package com.ss.android.ugc.aweme.story.feed.c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.jedi.model.c.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.a.a.c;
import com.ss.android.ugc.aweme.story.api.model.IdWithScoreStruct;
import com.ss.android.ugc.aweme.story.api.model.LifeStory;
import com.ss.android.ugc.aweme.story.api.model.LogPbBean;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.api.model.b;
import com.ss.android.ugc.aweme.story.api.model.e;
import com.ss.android.ugc.aweme.story.api.model.f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ae;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/utils/StoryUtils;", "", "()V", "Companion", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72502a;

    /* renamed from: b  reason: collision with root package name */
    public static final a f72503b = new a((byte) 0);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001e\u0010\u0003\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\u000b\u001a\u00020\u0006J\u0010\u0010\f\u001a\u00020\b2\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ&\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0007J\u0010\u0010\u0015\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006J\u0018\u0010\u0017\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0018\u001a\u00020\bJ \u0010\u0017\u001a\u00020\u00102\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a2\b\u0010\t\u001a\u0004\u0018\u00010\u0006H\u0002J\u0012\u0010\u001b\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006H\u0002J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012J\u0012\u0010 \u001a\u00020!2\b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010\bJ\b\u0010%\u001a\u00020&H\u0007J\u0016\u0010'\u001a\u00020!2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0007J\u001c\u0010)\u001a\u0004\u0018\u00010\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010*\u001a\u00020!H\u0007J\u0012\u0010+\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J \u0010,\u001a\u0004\u0018\u00010\b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\n2\u0006\u0010*\u001a\u00020!H\u0007J*\u0010.\u001a\u00020&2\u0010\u0010/\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\n2\u0006\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020!H\u0002J\u0014\u00102\u001a\u0004\u0018\u0001032\b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0007J\"\u00104\u001a\u0004\u0018\u00010\u00122\b\u00105\u001a\u0004\u0018\u0001062\u0006\u00107\u001a\u00020\u00102\u0006\u00108\u001a\u000209J\u0012\u0010:\u001a\u0004\u0018\u00010\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012J\u0012\u0010;\u001a\u0004\u0018\u00010\u00122\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012J\u001a\u0010<\u001a\u00020&2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010=\u001a\u00020!H\u0007J\u001a\u0010>\u001a\u00020&2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010=\u001a\u00020!H\u0007J\u0014\u0010?\u001a\u0004\u0018\u00010&2\b\u0010$\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010@\u001a\u0004\u0018\u00010#2\b\u0010\u0018\u001a\u0004\u0018\u00010\bJ\u0012\u0010A\u001a\u00020&2\b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010A\u001a\u00020&2\b\u0010\u0011\u001a\u0004\u0018\u00010BH\u0007J\u001a\u0010C\u001a\u00020!2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010D\u001a\u00020&H\u0007J \u0010C\u001a\u00020!2\u000e\u0010/\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\n2\u0006\u0010D\u001a\u00020&H\u0007J\u0012\u0010E\u001a\u00020&2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0012\u0010E\u001a\u00020&2\b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0007J\u0012\u0010E\u001a\u00020&2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010F\u001a\u00020G2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0010\u0010F\u001a\u00020G2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u001c\u0010H\u001a\u00020!2\b\u0010I\u001a\u0004\u0018\u00010&2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J \u0010J\u001a\u00020!2\b\u0010I\u001a\u0004\u0018\u00010&2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0007J\u0014\u0010K\u001a\u0004\u0018\u00010L2\b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010M\u001a\u00020!2\b\u0010N\u001a\u0004\u0018\u00010\u0012J\"\u0010O\u001a\u00020!2\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010B\u0018\u00010\n2\b\u0010D\u001a\u0004\u0018\u00010&J\u0016\u0010P\u001a\u00020!2\u0006\u0010N\u001a\u00020\u00122\u0006\u0010I\u001a\u00020&J\u001c\u0010P\u001a\u00020!2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00020R0\n2\u0006\u0010I\u001a\u00020&J\u0010\u0010S\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u000eJ\u000e\u0010T\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006J\u0012\u0010U\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010V\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006J\u001c\u0010W\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010X\u001a\u0004\u0018\u00010\bH\u0007J\u001c\u0010Y\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u00062\b\u0010Z\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010[\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\bH\u0007J\u0010\u0010\\\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010]\u001a\u00020\u00102\b\u0010\u001e\u001a\u0004\u0018\u00010\u0012H\u0007J\u0012\u0010^\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u0012\u0010_\u001a\u00020\u00102\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007J\u001e\u0010`\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u0006\u0010N\u001a\u00020\u0012J&\u0010a\u001a\u00020\u00042\u000e\u0010b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001a2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\nJ \u0010c\u001a\u00020d2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010=\u001a\u00020!H\u0007J&\u0010c\u001a\u00020\u00042\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a2\u000e\u0010e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u001aH\u0007J \u0010f\u001a\u00020d2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010=\u001a\u00020!H\u0007J\u001c\u0010g\u001a\u0004\u0018\u00010\u00122\b\u0010b\u001a\u0004\u0018\u00010\u00122\b\u0010\t\u001a\u0004\u0018\u00010\u0012J\u001a\u0010h\u001a\u00020\u00042\b\u0010N\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010i\u001a\u00020!J\u001c\u0010j\u001a\u00020\u00042\b\u0010k\u001a\u0004\u0018\u00010l2\b\u0010m\u001a\u0004\u0018\u00010nH\u0007J\u001c\u0010j\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010m\u001a\u0004\u0018\u00010nH\u0007J\u0012\u0010j\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u001a\u0010o\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010D\u001a\u00020&J \u0010o\u001a\u00020\u00042\u000e\u0010p\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001a2\u0006\u0010q\u001a\u00020!H\u0007J\u001a\u0010r\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010V\u001a\u00020\u0010H\u0007J\u0012\u0010r\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u0016\u0010s\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001e\u0010s\u001a\u00020\u00042\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\bJ&\u0010t\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00100\u001a\u00020!2\u0006\u00101\u001a\u00020!J \u0010u\u001a\u00020\u00042\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\n2\b\u0010N\u001a\u0004\u0018\u00010\u0012J\u001c\u0010v\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010w\u001a\u0004\u0018\u00010BH\u0007J\u0012\u0010x\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0007J\u0012\u0010y\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0007¨\u0006z"}, d2 = {"Lcom/ss/android/ugc/aweme/story/feed/utils/StoryUtils$Companion;", "", "()V", "addUploadStory", "", "userStory", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "uploadStory", "Lcom/ss/android/ugc/aweme/story/api/model/AwemeWithComment;", "data", "", "buildCurUserEmptyStory", "buildUploadStory", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "compareIndex", "", "lifeFeed", "Lcom/ss/android/ugc/aweme/story/feed/model/LifeFeed;", "lastUserStory", "curUserStory", "containsPublishingItem", "mUserStory", "containsStory", "awemeWithComment", "userStoryList", "", "containsUploadStory", "filterData", "filterUnreadUserStory", "model", "filterUnreadUserStoryV2", "getAwemeType", "", "getCover", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "aweme", "getCurUid", "", "getFirstUnreadStory", "awemeWithComments", "getFirstUnreadStoryByUserPos", "pos", "getFirstUnreadStoryCoverInUserStory", "getFirstUnreadStoryInListByUserPos", "storyList", "getIds", "awemeList", "startPos", "endPos", "getImage", "Lcom/ss/android/ugc/aweme/feed/model/ImageInfo;", "getLifeFeedData", "context", "Landroid/content/Context;", "allStoryRead", "params", "Lcom/ss/android/ugc/aweme/story/api/model/DetailParams;", "getLifeFeedWithoutCurUser", "getLifeFeedWithoutCurUserV2", "getLoadMoreIds", "loadDataCount", "getPreLoadMoreIds", "getRequestId", "getStoryCoverInAwemeWithComment", "getStoryId", "Lcom/ss/android/ugc/aweme/story/api/model/LifeStory;", "getStoryPos", "storyId", "getUid", "getUserName", "", "getUserPosInLifeFeed", "uid", "getUserPosInList", "getVideo", "Lcom/ss/android/ugc/aweme/feed/model/Video;", "indexOfCurUserStory", "mLifeFeed", "indexOfLifeStory", "indexOfUserStory", "stories", "Lcom/ss/android/ugc/aweme/story/api/model/BaseStory;", "isCurUser", "isEmptyUserStory", "isPhoto", "isRead", "isSameStory", "awemeWithComment1", "isSameUserStory", "item", "isSelfAweme", "isSelfUser", "isSingleUser", "isUserStoryAllRead", "isUserStoryAllReadForCurUser", "mergeCurUserData", "mergeData", "originData", "mergeDataAfterLoadMore", "", "userStoryList1", "mergeDataAfterPreLoad", "mergeUserStory", "moveCurUserStoryToFirst", "curUserPos", "setLogPb", "dailyStory", "Lcom/ss/android/ugc/aweme/story/api/model/DailyStory;", "logPb", "Lcom/ss/android/ugc/aweme/story/api/model/LogPbBean;", "setReadState", "items", "curPos", "setReadStatus", "updateAfterPublish", "updateAweme", "updateReadState", "updateUploadDataToPublishData", "successResult", "wrapLifeFeed", "wrapUserStory", "awemestory_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f72504a;

        private a() {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0069, code lost:
            if (r1 != null) goto L_0x006e;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0056, code lost:
            if (r0 != null) goto L_0x005b;
         */
        @kotlin.jvm.JvmStatic
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.story.api.model.UserStory r20, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.story.api.model.UserStory r21) {
            /*
                r19 = this;
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r10 = 0
                r3[r10] = r20
                r11 = 1
                r3[r11] = r21
                com.meituan.robust.ChangeQuickRedirect r5 = f72504a
                java.lang.Class[] r8 = new java.lang.Class[r2]
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r4 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
                r8[r10] = r4
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r4 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
                r8[r11] = r4
                java.lang.Class r9 = java.lang.Boolean.TYPE
                r6 = 0
                r7 = 83742(0x1471e, float:1.17348E-40)
                r4 = r19
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r3 == 0) goto L_0x004a
                java.lang.Object[] r12 = new java.lang.Object[r2]
                r12[r10] = r20
                r12[r11] = r21
                com.meituan.robust.ChangeQuickRedirect r14 = f72504a
                r15 = 0
                r16 = 83742(0x1471e, float:1.17348E-40)
                java.lang.Class[] r0 = new java.lang.Class[r2]
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r1 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
                r0[r10] = r1
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r1 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
                r0[r11] = r1
                java.lang.Class r18 = java.lang.Boolean.TYPE
                r13 = r19
                r17 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
            L_0x004a:
                if (r20 == 0) goto L_0x0059
                com.ss.android.ugc.aweme.profile.model.User r0 = r20.getUser()
                if (r0 == 0) goto L_0x0059
                java.lang.String r0 = r0.getUid()
                if (r0 == 0) goto L_0x0059
                goto L_0x005b
            L_0x0059:
                java.lang.String r0 = ""
            L_0x005b:
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                if (r21 == 0) goto L_0x006c
                com.ss.android.ugc.aweme.profile.model.User r1 = r21.getUser()
                if (r1 == 0) goto L_0x006c
                java.lang.String r1 = r1.getUid()
                if (r1 == 0) goto L_0x006c
                goto L_0x006e
            L_0x006c:
                java.lang.String r1 = ""
            L_0x006e:
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r0 = android.text.TextUtils.equals(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.c.g.a.a(com.ss.android.ugc.aweme.story.api.model.UserStory, com.ss.android.ugc.aweme.story.api.model.UserStory):boolean");
        }

        @JvmStatic
        public final boolean a(@Nullable b bVar, @Nullable b bVar2) {
            if (PatchProxy.isSupport(new Object[]{bVar, bVar2}, this, f72504a, false, 83747, new Class[]{b.class, b.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar, bVar2}, this, f72504a, false, 83747, new Class[]{b.class, b.class}, Boolean.TYPE)).booleanValue();
            }
            String str = null;
            CharSequence storyId = bVar != null ? bVar.getStoryId() : null;
            if (bVar2 != null) {
                str = bVar2.getStoryId();
            }
            return TextUtils.equals(storyId, str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0041, code lost:
            if (r0 != null) goto L_0x0046;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.profile.model.User r18) {
            /*
                r17 = this;
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r18
                com.meituan.robust.ChangeQuickRedirect r4 = f72504a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.ss.android.ugc.aweme.profile.model.User.class
                r7[r9] = r3
                java.lang.Class r8 = java.lang.Boolean.TYPE
                r5 = 0
                r6 = 83748(0x14724, float:1.17356E-40)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x003b
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r18
                com.meituan.robust.ChangeQuickRedirect r12 = f72504a
                r13 = 0
                r14 = 83748(0x14724, float:1.17356E-40)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r0 = com.ss.android.ugc.aweme.profile.model.User.class
                r15[r9] = r0
                java.lang.Class r16 = java.lang.Boolean.TYPE
                r11 = r17
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
            L_0x003b:
                if (r18 == 0) goto L_0x0044
                java.lang.String r0 = r18.getUid()
                if (r0 == 0) goto L_0x0044
                goto L_0x0046
            L_0x0044:
                java.lang.String r0 = ""
            L_0x0046:
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
                java.lang.Class<com.ss.android.ugc.aweme.framework.services.IUserService> r2 = com.ss.android.ugc.aweme.framework.services.IUserService.class
                java.lang.Object r1 = r1.getService(r2)
                com.ss.android.ugc.aweme.framework.services.IUserService r1 = (com.ss.android.ugc.aweme.framework.services.IUserService) r1
                if (r1 == 0) goto L_0x005b
                java.lang.String r1 = r1.getCurrentUserID()
                goto L_0x005c
            L_0x005b:
                r1 = 0
            L_0x005c:
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                boolean r0 = android.text.TextUtils.equals(r0, r1)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.c.g.a.a(com.ss.android.ugc.aweme.profile.model.User):boolean");
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x004a A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00a2 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x00a3  */
        @org.jetbrains.annotations.Nullable
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final com.ss.android.ugc.aweme.story.api.model.b a(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.story.api.model.UserStory r18) {
            /*
                r17 = this;
                r0 = r18
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r4 = f72504a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r3 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
                r7[r9] = r3
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r8 = com.ss.android.ugc.aweme.story.api.model.b.class
                r5 = 0
                r6 = 83749(0x14725, float:1.17357E-40)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0039
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r0
                com.meituan.robust.ChangeQuickRedirect r12 = f72504a
                r13 = 0
                r14 = 83749(0x14725, float:1.17357E-40)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r0 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
                r15[r9] = r0
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r16 = com.ss.android.ugc.aweme.story.api.model.b.class
                r11 = r17
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                com.ss.android.ugc.aweme.story.api.model.b r0 = (com.ss.android.ugc.aweme.story.api.model.b) r0
                return r0
            L_0x0039:
                if (r0 == 0) goto L_0x0046
                java.util.List r1 = r18.getAwemeList()
                if (r1 == 0) goto L_0x0046
                int r1 = r1.size()
                goto L_0x0047
            L_0x0046:
                r1 = 0
            L_0x0047:
                r2 = 0
                if (r1 != 0) goto L_0x004b
                return r2
            L_0x004b:
                com.ss.android.ugc.aweme.story.feed.c.g$a r3 = com.ss.android.ugc.aweme.story.feed.c.g.f72503b
                boolean r3 = r3.d((com.ss.android.ugc.aweme.story.api.model.UserStory) r0)
                if (r3 != 0) goto L_0x009f
                if (r0 == 0) goto L_0x009f
                java.util.List r3 = r18.getAwemeList()
                if (r3 == 0) goto L_0x009f
                java.util.Iterator r3 = r3.iterator()
            L_0x005f:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L_0x009c
                java.lang.Object r4 = r3.next()
                com.ss.android.ugc.aweme.story.api.model.b r4 = (com.ss.android.ugc.aweme.story.api.model.b) r4
                if (r4 == 0) goto L_0x005f
                boolean r5 = r4.isRead()
                if (r5 != 0) goto L_0x005f
                int r3 = r4.getAwemeType()
                r5 = 15
                if (r3 == r5) goto L_0x009d
                int r3 = r4.getAwemeType()
                r5 = 14
                if (r3 != r5) goto L_0x0084
                goto L_0x009d
            L_0x0084:
                long r3 = r18.getCurPos()
                int r3 = (int) r3
                int r3 = java.lang.Math.max(r9, r3)
                int r1 = java.lang.Math.min(r1, r3)
                java.util.List r3 = r18.getAwemeList()
                java.lang.Object r1 = r3.get(r1)
                com.ss.android.ugc.aweme.story.api.model.b r1 = (com.ss.android.ugc.aweme.story.api.model.b) r1
                goto L_0x00a0
            L_0x009c:
                r4 = r2
            L_0x009d:
                r1 = r4
                goto L_0x00a0
            L_0x009f:
                r1 = r2
            L_0x00a0:
                if (r1 == 0) goto L_0x00a3
                return r1
            L_0x00a3:
                if (r0 == 0) goto L_0x00b2
                java.util.List r0 = r18.getAwemeList()
                if (r0 == 0) goto L_0x00b2
                java.lang.Object r0 = r0.get(r9)
                com.ss.android.ugc.aweme.story.api.model.b r0 = (com.ss.android.ugc.aweme.story.api.model.b) r0
                return r0
            L_0x00b2:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.c.g.a.a(com.ss.android.ugc.aweme.story.api.model.UserStory):com.ss.android.ugc.aweme.story.api.model.b");
        }

        @Nullable
        public final UrlModel a(@Nullable b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f72504a, false, 83750, new Class[]{b.class}, UrlModel.class)) {
                return (UrlModel) PatchProxy.accessDispatch(new Object[]{bVar}, this, f72504a, false, 83750, new Class[]{b.class}, UrlModel.class);
            }
            UrlModel urlModel = null;
            if (bVar != null) {
                if (bVar.getAwemeType() == 15) {
                    LifeStory lifeStory = bVar.getLifeStory();
                    if (lifeStory != null) {
                        ImageInfo imageInfo = lifeStory.getImageInfo();
                        if (imageInfo != null) {
                            return imageInfo.getLabelLarge();
                        }
                    }
                    return null;
                } else if (bVar.getAwemeType() == 14) {
                    LifeStory lifeStory2 = bVar.getLifeStory();
                    if (lifeStory2 != null) {
                        Video video = lifeStory2.getVideo();
                        if (video != null) {
                            UrlModel originCover = video.getOriginCover();
                            if (originCover != null) {
                                urlModel = originCover;
                                return urlModel;
                            }
                        }
                    }
                    LifeStory lifeStory3 = bVar.getLifeStory();
                    if (lifeStory3 != null) {
                        Video video2 = lifeStory3.getVideo();
                        if (video2 != null) {
                            return video2.getCover();
                        }
                    }
                    return urlModel;
                }
            }
            return null;
        }

        @JvmStatic
        @NotNull
        public final String b(@Nullable b bVar) {
            Object obj;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f72504a, false, 83757, new Class[]{b.class}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{bVar}, this, f72504a, false, 83757, new Class[]{b.class}, String.class);
            }
            if (bVar != null) {
                LifeStory lifeStory = bVar.getLifeStory();
                if (lifeStory != null) {
                    obj = Long.valueOf(lifeStory.getAuthorUserId());
                    return obj.toString();
                }
            }
            obj = "";
            return obj.toString();
        }

        @Nullable
        public final com.ss.android.ugc.aweme.story.feed.model.a a(@Nullable Context context, boolean z, @NotNull f fVar) {
            List list;
            f fVar2 = fVar;
            if (PatchProxy.isSupport(new Object[]{context, Byte.valueOf(z ? (byte) 1 : 0), fVar2}, this, f72504a, false, 83776, new Class[]{Context.class, Boolean.TYPE, f.class}, com.ss.android.ugc.aweme.story.feed.model.a.class)) {
                return (com.ss.android.ugc.aweme.story.feed.model.a) PatchProxy.accessDispatch(new Object[]{context, Byte.valueOf(z), fVar2}, this, f72504a, false, 83776, new Class[]{Context.class, Boolean.TYPE, f.class}, com.ss.android.ugc.aweme.story.feed.model.a.class);
            }
            Intrinsics.checkParameterIsNotNull(fVar2, "params");
            if (context == null) {
                return null;
            }
            c a2 = com.ss.android.ugc.aweme.story.a.a.a(fVar2.tabType);
            if (PatchProxy.isSupport(new Object[0], a2, c.f71778a, false, 85023, new Class[0], List.class)) {
                list = (List) PatchProxy.accessDispatch(new Object[0], a2, c.f71778a, false, 85023, new Class[0], List.class);
            } else {
                list = (List) ((com.bytedance.jedi.model.c.f) a2.f71780c.a().b(Unit.INSTANCE).blockingLast(f.a.a())).a();
            }
            if (list == null) {
                return null;
            }
            com.ss.android.ugc.aweme.story.feed.model.a aVar = new com.ss.android.ugc.aweme.story.feed.model.a();
            aVar.setUserStoryList(list);
            if (z) {
                return g.f72503b.d(aVar);
            }
            return g.f72503b.e(aVar);
        }

        @JvmStatic
        public final void a(@Nullable com.ss.android.ugc.aweme.story.feed.model.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f72504a, false, 83778, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f72504a, false, 83778, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class}, Void.TYPE);
                return;
            }
            if (aVar != null) {
                List<UserStory> userStoryList = aVar.getUserStoryList();
                if (userStoryList != null) {
                    for (UserStory a2 : userStoryList) {
                        g.f72503b.a(a2, aVar != null ? aVar.getLogPb() : null);
                    }
                }
            }
        }

        @JvmStatic
        public final void a(@Nullable UserStory userStory, @Nullable LogPbBean logPbBean) {
            LogPbBean logPbBean2 = logPbBean;
            if (PatchProxy.isSupport(new Object[]{userStory, logPbBean2}, this, f72504a, false, 83779, new Class[]{UserStory.class, LogPbBean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{userStory, logPbBean2}, this, f72504a, false, 83779, new Class[]{UserStory.class, LogPbBean.class}, Void.TYPE);
                return;
            }
            if (userStory != null) {
                userStory.setLogPb(logPbBean);
            }
            if (userStory != null) {
                for (b next : userStory.getAwemeList()) {
                    if (next != null) {
                        next.setLogPb(logPbBean2);
                    }
                }
            }
        }

        @JvmStatic
        public final void a(@Nullable e eVar, @Nullable LogPbBean logPbBean) {
            LogPbBean logPbBean2 = logPbBean;
            if (PatchProxy.isSupport(new Object[]{eVar, logPbBean2}, this, f72504a, false, 83780, new Class[]{e.class, LogPbBean.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{eVar, logPbBean2}, this, f72504a, false, 83780, new Class[]{e.class, LogPbBean.class}, Void.TYPE);
                return;
            }
            if (eVar != null) {
                for (b bVar : eVar.getStoryList()) {
                    if (bVar != null) {
                        bVar.setLogPb(logPbBean2);
                    }
                }
            }
        }

        @JvmStatic
        public final boolean b(@Nullable com.ss.android.ugc.aweme.story.feed.model.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f72504a, false, 83788, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar}, this, f72504a, false, 83788, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class}, Boolean.TYPE)).booleanValue();
            }
            if (aVar != null) {
                List userStoryList = aVar.getUserStoryList();
                return userStoryList == null || userStoryList.size() <= 1;
            }
            return true;
        }

        @JvmStatic
        public final long a(@NotNull UserStory userStory, @NotNull UserStory userStory2, int i) {
            UserStory userStory3 = userStory;
            UserStory userStory4 = userStory2;
            if (PatchProxy.isSupport(new Object[]{userStory3, userStory4, Integer.valueOf(i)}, this, f72504a, false, 83800, new Class[]{UserStory.class, UserStory.class, Integer.TYPE}, Long.TYPE)) {
                return ((Long) PatchProxy.accessDispatch(new Object[]{userStory3, userStory4, Integer.valueOf(i)}, this, f72504a, false, 83800, new Class[]{UserStory.class, UserStory.class, Integer.TYPE}, Long.TYPE)).longValue();
            }
            Intrinsics.checkParameterIsNotNull(userStory3, "data");
            Intrinsics.checkParameterIsNotNull(userStory4, "userStory");
            if (userStory2.getAwemeList() == null || userStory2.getAwemeList().isEmpty()) {
                return userStory.getCurPos();
            }
            int curPos = (int) userStory.getCurPos();
            List<b> awemeList = userStory.getAwemeList();
            int size = awemeList != null ? awemeList.size() : 0;
            if (curPos <= size) {
                size = curPos;
            }
            int max = Math.max(0, size - i);
            a(userStory3, userStory4, max, size);
            return (long) max;
        }

        public final void a(@NotNull UserStory userStory, @NotNull UserStory userStory2, int i, int i2) {
            UserStory userStory3 = userStory;
            UserStory userStory4 = userStory2;
            if (PatchProxy.isSupport(new Object[]{userStory3, userStory4, Integer.valueOf(i), Integer.valueOf(i2)}, this, f72504a, false, 83801, new Class[]{UserStory.class, UserStory.class, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{userStory3, userStory4, Integer.valueOf(i), Integer.valueOf(i2)}, this, f72504a, false, 83801, new Class[]{UserStory.class, UserStory.class, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(userStory3, "data");
            Intrinsics.checkParameterIsNotNull(userStory4, "userStory");
            int i3 = i2 - 1;
            int i4 = i;
            if (i4 <= i3) {
                while (true) {
                    for (b next : userStory2.getAwemeList()) {
                        if (a(userStory.getAwemeList().get(i4), next)) {
                            Intrinsics.checkExpressionValueIsNotNull(next, "aweme");
                            b bVar = userStory.getAwemeList().get(i4);
                            Intrinsics.checkExpressionValueIsNotNull(bVar, "data.awemeList[index]");
                            next.setRead(bVar.isRead());
                            userStory.getAwemeList().set(i4, next);
                        }
                    }
                    if (i4 == i3) {
                        break;
                    }
                    i4++;
                }
            }
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(userStory.getAwemeList());
            userStory3.setAwemeList(arrayList);
        }

        @JvmStatic
        @NotNull
        public final String a(@Nullable UserStory userStory, int i) {
            if (PatchProxy.isSupport(new Object[]{userStory, Integer.valueOf(i)}, this, f72504a, false, 83803, new Class[]{UserStory.class, Integer.TYPE}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{userStory, Integer.valueOf(i)}, this, f72504a, false, 83803, new Class[]{UserStory.class, Integer.TYPE}, String.class);
            } else if (userStory == null) {
                return "";
            } else {
                int lastPos = ((int) userStory.getLastPos()) + 1;
                return g.f72503b.a(userStory.getAwemeList(), lastPos, Math.min(lastPos + i, (int) userStory.getTotalCount()));
            }
        }

        @JvmStatic
        @NotNull
        public final String b(@Nullable UserStory userStory, int i) {
            if (PatchProxy.isSupport(new Object[]{userStory, Integer.valueOf(i)}, this, f72504a, false, 83805, new Class[]{UserStory.class, Integer.TYPE}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{userStory, Integer.valueOf(i)}, this, f72504a, false, 83805, new Class[]{UserStory.class, Integer.TYPE}, String.class);
            } else if (userStory == null) {
                return "";
            } else {
                int curPos = (int) userStory.getCurPos();
                return g.f72503b.a(userStory.getAwemeList(), Math.max(0, curPos - i), curPos);
            }
        }

        @JvmStatic
        public final void a(@Nullable List<b> list, int i) {
            List<b> list2 = list;
            int i2 = i;
            int i3 = 0;
            if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i)}, this, f72504a, false, 83810, new Class[]{List.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i)}, this, f72504a, false, 83810, new Class[]{List.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            if (list2 != null) {
                i3 = list.size();
            }
            if (i3 > 0 && i2 >= 0 && i2 < i3) {
                while (i2 <= 0) {
                    if (list2 == null) {
                        Intrinsics.throwNpe();
                    }
                    if (list2.get(i2).isRead()) {
                        break;
                    }
                    list2.get(i2).setRead(true);
                    i2++;
                }
            }
        }

        @JvmStatic
        @NotNull
        public final String a() {
            if (!PatchProxy.isSupport(new Object[0], this, f72504a, false, 83758, new Class[0], String.class)) {
                return c(com.ss.android.ugc.aweme.story.base.utils.g.f71954c.a());
            }
            return (String) PatchProxy.accessDispatch(new Object[0], this, f72504a, false, 83758, new Class[0], String.class);
        }

        @NotNull
        public final UserStory b() {
            User user;
            if (PatchProxy.isSupport(new Object[0], this, f72504a, false, 83765, new Class[0], UserStory.class)) {
                return (UserStory) PatchProxy.accessDispatch(new Object[0], this, f72504a, false, 83765, new Class[0], UserStory.class);
            }
            UserStory userStory = new UserStory();
            IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
            if (iUserService != null) {
                user = iUserService.getCurrentUser();
            } else {
                user = null;
            }
            userStory.setUser(user);
            userStory.setAwemeList(new ArrayList());
            return userStory;
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        private boolean h(@NotNull UserStory userStory) {
            UserStory userStory2 = userStory;
            if (PatchProxy.isSupport(new Object[]{userStory2}, this, f72504a, false, 83766, new Class[]{UserStory.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{userStory2}, this, f72504a, false, 83766, new Class[]{UserStory.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(userStory2, "userStory");
            if (!f(userStory2)) {
                return false;
            }
            if (userStory.getAwemeList() == null || CollectionUtils.isEmpty(userStory.getAwemeList())) {
                return true;
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
            if (r0 == null) goto L_0x003f;
         */
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String c(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.profile.model.User r18) {
            /*
                r17 = this;
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r18
                com.meituan.robust.ChangeQuickRedirect r4 = f72504a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.ss.android.ugc.aweme.profile.model.User.class
                r7[r9] = r3
                java.lang.Class<java.lang.String> r8 = java.lang.String.class
                r5 = 0
                r6 = 83771(0x1473b, float:1.17388E-40)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0037
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r18
                com.meituan.robust.ChangeQuickRedirect r12 = f72504a
                r13 = 0
                r14 = 83771(0x1473b, float:1.17388E-40)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r0 = com.ss.android.ugc.aweme.profile.model.User.class
                r15[r9] = r0
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r11 = r17
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                java.lang.String r0 = (java.lang.String) r0
                return r0
            L_0x0037:
                if (r18 == 0) goto L_0x003f
                java.lang.String r0 = r18.getUid()
                if (r0 != 0) goto L_0x0041
            L_0x003f:
                java.lang.String r0 = ""
            L_0x0041:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.c.g.a.c(com.ss.android.ugc.aweme.profile.model.User):java.lang.String");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0050, code lost:
            if (r0 == null) goto L_0x0055;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
            if (r1 == null) goto L_0x003f;
         */
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.CharSequence d(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.profile.model.User r18) {
            /*
                r17 = this;
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r18
                com.meituan.robust.ChangeQuickRedirect r4 = f72504a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r3 = com.ss.android.ugc.aweme.profile.model.User.class
                r7[r9] = r3
                java.lang.Class<java.lang.CharSequence> r8 = java.lang.CharSequence.class
                r5 = 0
                r6 = 83791(0x1474f, float:1.17416E-40)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0037
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r18
                com.meituan.robust.ChangeQuickRedirect r12 = f72504a
                r13 = 0
                r14 = 83791(0x1474f, float:1.17416E-40)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.profile.model.User> r0 = com.ss.android.ugc.aweme.profile.model.User.class
                r15[r9] = r0
                java.lang.Class<java.lang.CharSequence> r16 = java.lang.CharSequence.class
                r11 = r17
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                return r0
            L_0x0037:
                if (r18 == 0) goto L_0x003f
                java.lang.String r1 = r18.getRemarkName()
                if (r1 != 0) goto L_0x0041
            L_0x003f:
                java.lang.String r1 = ""
            L_0x0041:
                r2 = r1
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r2 = android.text.TextUtils.isEmpty(r2)
                if (r2 == 0) goto L_0x0058
                if (r18 == 0) goto L_0x0055
                java.lang.String r0 = r18.getNickname()
                if (r0 != 0) goto L_0x0053
                goto L_0x0055
            L_0x0053:
                r1 = r0
                goto L_0x0058
            L_0x0055:
                java.lang.String r0 = ""
                goto L_0x0053
            L_0x0058:
                java.lang.CharSequence r1 = (java.lang.CharSequence) r1
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.c.g.a.d(com.ss.android.ugc.aweme.profile.model.User):java.lang.CharSequence");
        }

        @JvmStatic
        @Nullable
        public final Video e(@Nullable b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f72504a, false, 83786, new Class[]{b.class}, Video.class)) {
                return (Video) PatchProxy.accessDispatch(new Object[]{bVar}, this, f72504a, false, 83786, new Class[]{b.class}, Video.class);
            }
            if (bVar != null) {
                LifeStory lifeStory = bVar.getLifeStory();
                if (lifeStory != null) {
                    return lifeStory.getVideo();
                }
            }
            return null;
        }

        @JvmStatic
        public final boolean f(@NotNull UserStory userStory) {
            UserStory userStory2 = userStory;
            if (PatchProxy.isSupport(new Object[]{userStory2}, this, f72504a, false, 83793, new Class[]{UserStory.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{userStory2}, this, f72504a, false, 83793, new Class[]{UserStory.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(userStory2, "userStory");
            a aVar = this;
            return TextUtils.equals(aVar.b(userStory2), aVar.a());
        }

        @Nullable
        private com.ss.android.ugc.aweme.story.feed.model.a d(@Nullable com.ss.android.ugc.aweme.story.feed.model.a aVar) {
            int i = 1;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f72504a, false, 83774, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class}, com.ss.android.ugc.aweme.story.feed.model.a.class)) {
                return (com.ss.android.ugc.aweme.story.feed.model.a) PatchProxy.accessDispatch(new Object[]{aVar}, this, f72504a, false, 83774, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class}, com.ss.android.ugc.aweme.story.feed.model.a.class);
            } else if (aVar.getUserStoryList() == null || aVar.getUserStoryList().isEmpty()) {
                return aVar;
            } else {
                com.ss.android.ugc.aweme.story.feed.model.a aVar2 = new com.ss.android.ugc.aweme.story.feed.model.a();
                aVar2.setCursor(aVar.getCursor());
                if (!aVar.isHasMore()) {
                    i = 0;
                }
                aVar2.setHasMore(i);
                aVar2.setUserStoryList(new ArrayList());
                for (UserStory userStory : aVar.getUserStoryList()) {
                    a aVar3 = this;
                    if (!TextUtils.equals(aVar3.c(com.ss.android.ugc.aweme.story.base.utils.g.f71954c.a()), aVar3.b(userStory))) {
                        aVar2.getUserStoryList().add(userStory);
                    } else {
                        Intrinsics.checkExpressionValueIsNotNull(userStory, "userStory");
                        if (!aVar3.h(userStory)) {
                            aVar2.getUserStoryList().add(userStory);
                        }
                    }
                }
                return aVar2;
            }
        }

        @Nullable
        private com.ss.android.ugc.aweme.story.feed.model.a e(@Nullable com.ss.android.ugc.aweme.story.feed.model.a aVar) {
            int i = 1;
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f72504a, false, 83775, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class}, com.ss.android.ugc.aweme.story.feed.model.a.class)) {
                return (com.ss.android.ugc.aweme.story.feed.model.a) PatchProxy.accessDispatch(new Object[]{aVar}, this, f72504a, false, 83775, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class}, com.ss.android.ugc.aweme.story.feed.model.a.class);
            } else if (aVar.getUserStoryList() == null || aVar.getUserStoryList().isEmpty()) {
                return aVar;
            } else {
                com.ss.android.ugc.aweme.story.feed.model.a aVar2 = new com.ss.android.ugc.aweme.story.feed.model.a();
                aVar2.setCursor(aVar.getCursor());
                if (!aVar.isHasMore()) {
                    i = 0;
                }
                aVar2.setHasMore(i);
                aVar2.setUserStoryList(new ArrayList());
                for (UserStory userStory : aVar.getUserStoryList()) {
                    a aVar3 = this;
                    if (!aVar3.d(userStory)) {
                        if (!TextUtils.equals(aVar3.c(com.ss.android.ugc.aweme.story.base.utils.g.f71954c.a()), aVar3.b(userStory))) {
                            aVar2.getUserStoryList().add(userStory);
                        } else {
                            Intrinsics.checkExpressionValueIsNotNull(userStory, "userStory");
                            if (!aVar3.h(userStory)) {
                                aVar2.getUserStoryList().add(userStory);
                            }
                        }
                    }
                }
                return aVar2;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x004d, code lost:
            if (r0 != null) goto L_0x0052;
         */
        @kotlin.jvm.JvmStatic
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean f(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.story.api.model.b r18) {
            /*
                r17 = this;
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r18
                com.meituan.robust.ChangeQuickRedirect r4 = f72504a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r3 = com.ss.android.ugc.aweme.story.api.model.b.class
                r7[r9] = r3
                java.lang.Class r8 = java.lang.Boolean.TYPE
                r5 = 0
                r6 = 83794(0x14752, float:1.1742E-40)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x003b
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r18
                com.meituan.robust.ChangeQuickRedirect r12 = f72504a
                r13 = 0
                r14 = 83794(0x14752, float:1.1742E-40)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r0 = com.ss.android.ugc.aweme.story.api.model.b.class
                r15[r9] = r0
                java.lang.Class r16 = java.lang.Boolean.TYPE
                r11 = r17
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                return r0
            L_0x003b:
                if (r18 == 0) goto L_0x0050
                com.ss.android.ugc.aweme.story.api.model.LifeStory r0 = r18.getLifeStory()
                if (r0 == 0) goto L_0x0050
                com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
                if (r0 == 0) goto L_0x0050
                java.lang.String r0 = r0.getUid()
                if (r0 == 0) goto L_0x0050
                goto L_0x0052
            L_0x0050:
                java.lang.String r0 = ""
            L_0x0052:
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                r1 = r0
                r2 = r17
                com.ss.android.ugc.aweme.story.feed.c.g$a r2 = (com.ss.android.ugc.aweme.story.feed.c.g.a) r2
                java.lang.String r2 = r2.a()
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                boolean r1 = android.text.TextUtils.equals(r1, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.c.g.a.f(com.ss.android.ugc.aweme.story.api.model.b):boolean");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x003d, code lost:
            if (r0 == null) goto L_0x003f;
         */
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String c(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.story.api.model.b r18) {
            /*
                r17 = this;
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r18
                com.meituan.robust.ChangeQuickRedirect r4 = f72504a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r3 = com.ss.android.ugc.aweme.story.api.model.b.class
                r7[r9] = r3
                java.lang.Class<java.lang.String> r8 = java.lang.String.class
                r5 = 0
                r6 = 83760(0x14730, float:1.17373E-40)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0037
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r18
                com.meituan.robust.ChangeQuickRedirect r12 = f72504a
                r13 = 0
                r14 = 83760(0x14730, float:1.17373E-40)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.b> r0 = com.ss.android.ugc.aweme.story.api.model.b.class
                r15[r9] = r0
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r11 = r17
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                java.lang.String r0 = (java.lang.String) r0
                return r0
            L_0x0037:
                if (r18 == 0) goto L_0x003f
                java.lang.String r0 = r18.getStoryId()
                if (r0 != 0) goto L_0x0041
            L_0x003f:
                java.lang.String r0 = ""
            L_0x0041:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.c.g.a.c(com.ss.android.ugc.aweme.story.api.model.b):java.lang.String");
        }

        public final boolean d(@Nullable UserStory userStory) {
            if (PatchProxy.isSupport(new Object[]{userStory}, this, f72504a, false, 83777, new Class[]{UserStory.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{userStory}, this, f72504a, false, 83777, new Class[]{UserStory.class}, Boolean.TYPE)).booleanValue();
            } else if (userStory == null || userStory.getReadFlag() != 1) {
                return false;
            } else {
                return true;
            }
        }

        public final boolean e(@Nullable UserStory userStory) {
            if (PatchProxy.isSupport(new Object[]{userStory}, this, f72504a, false, 83792, new Class[]{UserStory.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{userStory}, this, f72504a, false, 83792, new Class[]{UserStory.class}, Boolean.TYPE)).booleanValue();
            } else if (userStory == null || userStory.getAwemeList() == null || userStory.getAwemeList().isEmpty()) {
                return false;
            } else {
                b bVar = userStory.getAwemeList().get(userStory.getAwemeList().size() - 1);
                Intrinsics.checkExpressionValueIsNotNull(bVar, "mUserStory.awemeList.get(size - 1)");
                if (bVar.getAwemeType() == 10000) {
                    return true;
                }
                return false;
            }
        }

        @JvmStatic
        public final void g(@Nullable UserStory userStory) {
            int i;
            boolean z;
            String str;
            long j;
            UserStory userStory2 = userStory;
            if (PatchProxy.isSupport(new Object[]{userStory2}, this, f72504a, false, 83799, new Class[]{UserStory.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{userStory2}, this, f72504a, false, 83799, new Class[]{UserStory.class}, Void.TYPE);
            } else if (userStory2 != null) {
                List arrayList = new ArrayList();
                List<b> awemeList = userStory.getAwemeList();
                if (awemeList != null) {
                    i = awemeList.size();
                } else {
                    i = 0;
                }
                List<IdWithScoreStruct> allStoryList = userStory.getAllStoryList();
                if (allStoryList != null) {
                    Iterator withIndex = CollectionsKt.withIndex(allStoryList.iterator());
                    while (withIndex.hasNext()) {
                        ae aeVar = (ae) withIndex.next();
                        int i2 = aeVar.f83421a;
                        IdWithScoreStruct idWithScoreStruct = (IdWithScoreStruct) aeVar.f83422b;
                        if (userStory.getReadFlag() != 0 || ((long) i2) < userStory.getCurPos()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        long j2 = (long) i2;
                        if (j2 < userStory.getCurPos() || j2 >= userStory.getCurPos() + ((long) i)) {
                            b bVar = new b();
                            bVar.setLifeStory(new LifeStory());
                            LifeStory lifeStory = bVar.getLifeStory();
                            Intrinsics.checkExpressionValueIsNotNull(lifeStory, "aweme.lifeStory");
                            lifeStory.setAwemeType(10001);
                            LifeStory lifeStory2 = bVar.getLifeStory();
                            Intrinsics.checkExpressionValueIsNotNull(lifeStory2, "aweme.lifeStory");
                            if (idWithScoreStruct != null) {
                                str = idWithScoreStruct.getStroyId();
                            } else {
                                str = null;
                            }
                            lifeStory2.setStoryId(str);
                            LifeStory lifeStory3 = bVar.getLifeStory();
                            Intrinsics.checkExpressionValueIsNotNull(lifeStory3, "aweme.lifeStory");
                            if (idWithScoreStruct != null) {
                                j = idWithScoreStruct.getCreateTime();
                            } else {
                                j = 0;
                            }
                            lifeStory3.setCreateTime(j);
                            bVar.setRead(z);
                            arrayList.add(bVar);
                        } else {
                            b bVar2 = userStory.getAwemeList().get(i2 - ((int) userStory.getCurPos()));
                            Intrinsics.checkExpressionValueIsNotNull(bVar2, "aweme");
                            bVar2.setRead(z);
                            arrayList.add(bVar2);
                            userStory2.setLastPos(j2);
                        }
                    }
                }
                userStory2.setAwemeList(arrayList);
                userStory2.setTotalCount((long) arrayList.size());
            }
        }

        @JvmStatic
        public final int a(@NotNull List<? extends b> list) {
            List<? extends b> list2 = list;
            int i = 0;
            if (PatchProxy.isSupport(new Object[]{list2}, this, f72504a, false, 83739, new Class[]{List.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{list2}, this, f72504a, false, 83739, new Class[]{List.class}, Integer.TYPE)).intValue();
            }
            Intrinsics.checkParameterIsNotNull(list2, "awemeWithComments");
            for (b isRead : list2) {
                if (!isRead.isRead()) {
                    return i;
                }
                i++;
            }
            return -1;
        }

        @NotNull
        public final b b(@Nullable User user) {
            User user2 = user;
            if (PatchProxy.isSupport(new Object[]{user2}, this, f72504a, false, 83764, new Class[]{User.class}, b.class)) {
                return (b) PatchProxy.accessDispatch(new Object[]{user2}, this, f72504a, false, 83764, new Class[]{User.class}, b.class);
            }
            b bVar = new b();
            LifeStory lifeStory = new LifeStory();
            lifeStory.setAuthor(user2);
            lifeStory.setAwemeType(10000);
            bVar.setLifeStory(lifeStory);
            return bVar;
        }

        @JvmStatic
        public final void c(@Nullable com.ss.android.ugc.aweme.story.feed.model.a aVar) {
            if (PatchProxy.isSupport(new Object[]{aVar}, this, f72504a, false, 83798, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar}, this, f72504a, false, 83798, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class}, Void.TYPE);
                return;
            }
            if (aVar != null) {
                List<UserStory> userStoryList = aVar.getUserStoryList();
                if (userStoryList != null) {
                    for (UserStory g : userStoryList) {
                        g.f72503b.g(g);
                    }
                }
            }
        }

        @JvmStatic
        public final boolean d(@Nullable b bVar) {
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f72504a, false, 83782, new Class[]{b.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar}, this, f72504a, false, 83782, new Class[]{b.class}, Boolean.TYPE)).booleanValue();
            } else if (bVar == null || bVar.getAwemeType() != 15) {
                return false;
            } else {
                return true;
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0043, code lost:
            if (r0 == null) goto L_0x0045;
         */
        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String b(@org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.story.api.model.UserStory r18) {
            /*
                r17 = this;
                r1 = 1
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r9 = 0
                r2[r9] = r18
                com.meituan.robust.ChangeQuickRedirect r4 = f72504a
                java.lang.Class[] r7 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r3 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
                r7[r9] = r3
                java.lang.Class<java.lang.String> r8 = java.lang.String.class
                r5 = 0
                r6 = 83759(0x1472f, float:1.17371E-40)
                r3 = r17
                boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
                if (r2 == 0) goto L_0x0037
                java.lang.Object[] r10 = new java.lang.Object[r1]
                r10[r9] = r18
                com.meituan.robust.ChangeQuickRedirect r12 = f72504a
                r13 = 0
                r14 = 83759(0x1472f, float:1.17371E-40)
                java.lang.Class[] r15 = new java.lang.Class[r1]
                java.lang.Class<com.ss.android.ugc.aweme.story.api.model.UserStory> r0 = com.ss.android.ugc.aweme.story.api.model.UserStory.class
                r15[r9] = r0
                java.lang.Class<java.lang.String> r16 = java.lang.String.class
                r11 = r17
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
                java.lang.String r0 = (java.lang.String) r0
                return r0
            L_0x0037:
                if (r18 == 0) goto L_0x0045
                com.ss.android.ugc.aweme.profile.model.User r0 = r18.getUser()
                if (r0 == 0) goto L_0x0045
                java.lang.String r0 = r0.getUid()
                if (r0 != 0) goto L_0x0047
            L_0x0045:
                java.lang.String r0 = ""
            L_0x0047:
                java.lang.String r0 = r0.toString()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.c.g.a.b(com.ss.android.ugc.aweme.story.api.model.UserStory):java.lang.String");
        }

        @JvmStatic
        public final boolean c(@Nullable UserStory userStory) {
            if (PatchProxy.isSupport(new Object[]{userStory}, this, f72504a, false, 83762, new Class[]{UserStory.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{userStory}, this, f72504a, false, 83762, new Class[]{UserStory.class}, Boolean.TYPE)).booleanValue();
            } else if (userStory != null && userStory.getReadFlag() == 1) {
                return true;
            } else {
                if (userStory != null) {
                    List<b> awemeList = userStory.getAwemeList();
                    if (awemeList != null) {
                        int i = 0;
                        for (b next : awemeList) {
                            Intrinsics.checkExpressionValueIsNotNull(next, "aweme");
                            if (next.isRead()) {
                                i++;
                            }
                        }
                        if (((long) i) >= userStory.getTotalCount()) {
                            return true;
                        }
                    }
                }
                return false;
            }
        }

        @JvmStatic
        public final int a(@Nullable UserStory userStory, @NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{userStory, str2}, this, f72504a, false, 83784, new Class[]{UserStory.class, String.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{userStory, str2}, this, f72504a, false, 83784, new Class[]{UserStory.class, String.class}, Integer.TYPE)).intValue();
            }
            Intrinsics.checkParameterIsNotNull(str2, "storyId");
            if (userStory != null) {
                return g.f72503b.c(userStory.getAwemeList(), str2);
            }
            return -1;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0064, code lost:
            if (r2 != null) goto L_0x0069;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int b(@org.jetbrains.annotations.Nullable java.util.List<? extends com.ss.android.ugc.aweme.story.api.model.LifeStory> r20, @org.jetbrains.annotations.Nullable java.lang.String r21) {
            /*
                r19 = this;
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r10 = 0
                r3[r10] = r20
                r11 = 1
                r3[r11] = r21
                com.meituan.robust.ChangeQuickRedirect r5 = f72504a
                java.lang.Class[] r8 = new java.lang.Class[r2]
                java.lang.Class<java.util.List> r4 = java.util.List.class
                r8[r10] = r4
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                r8[r11] = r4
                java.lang.Class r9 = java.lang.Integer.TYPE
                r6 = 0
                r7 = 83755(0x1472b, float:1.17366E-40)
                r4 = r19
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r3 == 0) goto L_0x004a
                java.lang.Object[] r12 = new java.lang.Object[r2]
                r12[r10] = r20
                r12[r11] = r21
                com.meituan.robust.ChangeQuickRedirect r14 = f72504a
                r15 = 0
                r16 = 83755(0x1472b, float:1.17366E-40)
                java.lang.Class[] r0 = new java.lang.Class[r2]
                java.lang.Class<java.util.List> r1 = java.util.List.class
                r0[r10] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r11] = r1
                java.lang.Class r18 = java.lang.Integer.TYPE
                r13 = r19
                r17 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                return r0
            L_0x004a:
                r0 = r20
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x0052:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x0079
                java.lang.Object r2 = r0.next()
                com.ss.android.ugc.aweme.story.api.model.LifeStory r2 = (com.ss.android.ugc.aweme.story.api.model.LifeStory) r2
                if (r2 == 0) goto L_0x0067
                java.lang.String r2 = r2.getStoryId()
                if (r2 == 0) goto L_0x0067
                goto L_0x0069
            L_0x0067:
                java.lang.String r2 = ""
            L_0x0069:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r3 = r21
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                boolean r2 = android.text.TextUtils.equals(r2, r3)
                if (r2 == 0) goto L_0x0076
                return r10
            L_0x0076:
                int r10 = r10 + 1
                goto L_0x0052
            L_0x0079:
                r0 = -1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.c.g.a.b(java.util.List, java.lang.String):int");
        }

        @JvmStatic
        public final int c(@Nullable List<? extends b> list, @NotNull String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{list, str2}, this, f72504a, false, 83785, new Class[]{List.class, String.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{list, str2}, this, f72504a, false, 83785, new Class[]{List.class, String.class}, Integer.TYPE)).intValue();
            }
            Intrinsics.checkParameterIsNotNull(str2, "storyId");
            if (list != null) {
                Iterator withIndex = CollectionsKt.withIndex(list.iterator());
                while (withIndex.hasNext()) {
                    ae aeVar = (ae) withIndex.next();
                    int i = aeVar.f83421a;
                    if (TextUtils.equals(str2, g.f72503b.c((b) aeVar.f83422b))) {
                        return i;
                    }
                }
            }
            return -1;
        }

        @JvmStatic
        public final int a(@Nullable String str, @NotNull List<? extends UserStory> list) {
            String str2;
            List<? extends UserStory> list2 = list;
            if (PatchProxy.isSupport(new Object[]{str, list2}, this, f72504a, false, 83744, new Class[]{String.class, List.class}, Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[]{str, list2}, this, f72504a, false, 83744, new Class[]{String.class, List.class}, Integer.TYPE)).intValue();
            }
            Intrinsics.checkParameterIsNotNull(list2, "storyList");
            if (list.isEmpty()) {
                return 0;
            }
            int i = 0;
            for (UserStory user : list2) {
                CharSequence charSequence = str;
                User user2 = user.getUser();
                if (user2 != null) {
                    str2 = user2.getUid();
                } else {
                    str2 = null;
                }
                if (TextUtils.equals(charSequence, str2)) {
                    return i;
                }
                i++;
            }
            return 0;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0089, code lost:
            if (r2 != null) goto L_0x008e;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final int a(@org.jetbrains.annotations.NotNull java.util.List<? extends com.ss.android.ugc.aweme.story.api.model.c> r20, @org.jetbrains.annotations.NotNull java.lang.String r21) {
            /*
                r19 = this;
                r0 = r20
                r1 = r21
                r2 = 2
                java.lang.Object[] r3 = new java.lang.Object[r2]
                r10 = 0
                r3[r10] = r0
                r11 = 1
                r3[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r5 = f72504a
                java.lang.Class[] r8 = new java.lang.Class[r2]
                java.lang.Class<java.util.List> r4 = java.util.List.class
                r8[r10] = r4
                java.lang.Class<java.lang.String> r4 = java.lang.String.class
                r8[r11] = r4
                java.lang.Class r9 = java.lang.Integer.TYPE
                r6 = 0
                r7 = 83754(0x1472a, float:1.17364E-40)
                r4 = r19
                boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
                if (r3 == 0) goto L_0x004e
                java.lang.Object[] r12 = new java.lang.Object[r2]
                r12[r10] = r0
                r12[r11] = r1
                com.meituan.robust.ChangeQuickRedirect r14 = f72504a
                r15 = 0
                r16 = 83754(0x1472a, float:1.17364E-40)
                java.lang.Class[] r0 = new java.lang.Class[r2]
                java.lang.Class<java.util.List> r1 = java.util.List.class
                r0[r10] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r0[r11] = r1
                java.lang.Class r18 = java.lang.Integer.TYPE
                r13 = r19
                r17 = r0
                java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
                java.lang.Integer r0 = (java.lang.Integer) r0
                int r0 = r0.intValue()
                return r0
            L_0x004e:
                java.lang.String r2 = "stories"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r0, r2)
                java.lang.String r2 = "uid"
                kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r1, r2)
                r2 = r0
                java.util.Collection r2 = (java.util.Collection) r2
                boolean r2 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r2)
                r3 = -1
                if (r2 == 0) goto L_0x0063
                return r3
            L_0x0063:
                java.lang.Iterable r0 = (java.lang.Iterable) r0
                java.util.Iterator r0 = r0.iterator()
            L_0x0069:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L_0x00a5
                java.lang.Object r2 = r0.next()
                com.ss.android.ugc.aweme.story.api.model.c r2 = (com.ss.android.ugc.aweme.story.api.model.c) r2
                int r4 = r2.getType()
                if (r4 == r11) goto L_0x00a2
                if (r2 == 0) goto L_0x009a
                com.ss.android.ugc.aweme.story.api.model.UserStory r2 = (com.ss.android.ugc.aweme.story.api.model.UserStory) r2
                com.ss.android.ugc.aweme.profile.model.User r2 = r2.getUser()
                if (r2 == 0) goto L_0x008c
                java.lang.String r2 = r2.getUid()
                if (r2 == 0) goto L_0x008c
                goto L_0x008e
            L_0x008c:
                java.lang.String r2 = ""
            L_0x008e:
                java.lang.CharSequence r2 = (java.lang.CharSequence) r2
                r4 = r1
                java.lang.CharSequence r4 = (java.lang.CharSequence) r4
                boolean r2 = android.text.TextUtils.equals(r2, r4)
                if (r2 == 0) goto L_0x00a2
                return r10
            L_0x009a:
                kotlin.TypeCastException r0 = new kotlin.TypeCastException
                java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.story.api.model.UserStory"
                r0.<init>(r1)
                throw r0
            L_0x00a2:
                int r10 = r10 + 1
                goto L_0x0069
            L_0x00a5:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.c.g.a.a(java.util.List, java.lang.String):int");
        }

        private final String a(List<? extends b> list, int i, int i2) {
            List<? extends b> list2 = list;
            int i3 = i;
            int i4 = i2;
            int i5 = 0;
            if (PatchProxy.isSupport(new Object[]{list2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f72504a, false, 83804, new Class[]{List.class, Integer.TYPE, Integer.TYPE}, String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[]{list2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f72504a, false, 83804, new Class[]{List.class, Integer.TYPE, Integer.TYPE}, String.class);
            }
            String str = "";
            if (list2 != null) {
                i5 = list.size();
            }
            if (i5 == 0 || i3 < 0 || i3 > i5 || i4 < 0 || i4 > i5) {
                return str;
            }
            if (list2 != null) {
                int i6 = i4 - 1;
                if (i3 <= i6) {
                    while (true) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(str);
                        String str2 = null;
                        if (i3 == i6) {
                            b bVar = (b) list2.get(i3);
                            if (bVar != null) {
                                str2 = bVar.getStoryId();
                            }
                        } else {
                            b bVar2 = (b) list2.get(i3);
                            if (bVar2 != null) {
                                str2 = bVar2.getStoryId();
                            }
                            str2 = Intrinsics.stringPlus(str2, ",");
                        }
                        sb.append(str2);
                        str = sb.toString();
                        if (i3 == i6) {
                            break;
                        }
                        i3++;
                    }
                }
            }
            return str;
        }

        @JvmStatic
        public final long b(@NotNull UserStory userStory, @NotNull UserStory userStory2, int i) {
            UserStory userStory3 = userStory;
            UserStory userStory4 = userStory2;
            int i2 = 0;
            if (PatchProxy.isSupport(new Object[]{userStory3, userStory4, Integer.valueOf(i)}, this, f72504a, false, 83802, new Class[]{UserStory.class, UserStory.class, Integer.TYPE}, Long.TYPE)) {
                return ((Long) PatchProxy.accessDispatch(new Object[]{userStory3, userStory4, Integer.valueOf(i)}, this, f72504a, false, 83802, new Class[]{UserStory.class, UserStory.class, Integer.TYPE}, Long.TYPE)).longValue();
            }
            Intrinsics.checkParameterIsNotNull(userStory3, "data");
            Intrinsics.checkParameterIsNotNull(userStory4, "userStory");
            if (userStory2.getAwemeList() == null || userStory2.getAwemeList().isEmpty()) {
                return userStory.getLastPos();
            }
            int min = Math.min(((int) userStory.getLastPos()) + 1, (int) userStory.getTotalCount());
            int min2 = Math.min(min + i, (int) userStory.getTotalCount());
            List<b> awemeList = userStory.getAwemeList();
            if (awemeList != null) {
                i2 = awemeList.size();
            }
            int min3 = Math.min(min, i2);
            int min4 = Math.min(min2, i2);
            a(userStory3, userStory4, min3, min4);
            return (long) (min4 - 1);
        }
    }

    @JvmStatic
    public static final int a(@Nullable List<? extends b> list, @NotNull String str) {
        List<? extends b> list2 = list;
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{list2, str2}, null, f72502a, true, 83723, new Class[]{List.class, String.class}, Integer.TYPE)) {
            return f72503b.c(list2, str2);
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[]{list2, str2}, null, f72502a, true, 83723, new Class[]{List.class, String.class}, Integer.TYPE)).intValue();
    }

    @JvmStatic
    @NotNull
    public static final String a(@Nullable UserStory userStory) {
        UserStory userStory2 = userStory;
        if (!PatchProxy.isSupport(new Object[]{userStory2}, null, f72502a, true, 83708, new Class[]{UserStory.class}, String.class)) {
            return f72503b.b(userStory2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{userStory2}, null, f72502a, true, 83708, new Class[]{UserStory.class}, String.class);
    }

    @JvmStatic
    @NotNull
    public static final String a(@Nullable b bVar) {
        b bVar2 = bVar;
        if (!PatchProxy.isSupport(new Object[]{bVar2}, null, f72502a, true, 83706, new Class[]{b.class}, String.class)) {
            return f72503b.b(bVar2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{bVar2}, null, f72502a, true, 83706, new Class[]{b.class}, String.class);
    }

    @JvmStatic
    public static final void a(@Nullable com.ss.android.ugc.aweme.story.feed.model.a aVar) {
        com.ss.android.ugc.aweme.story.feed.model.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f72502a, true, 83716, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, null, f72502a, true, 83716, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class}, Void.TYPE);
            return;
        }
        f72503b.a(aVar2);
    }

    @JvmStatic
    public static final boolean a(@Nullable UserStory userStory, @Nullable UserStory userStory2) {
        UserStory userStory3 = userStory;
        UserStory userStory4 = userStory2;
        if (!PatchProxy.isSupport(new Object[]{userStory3, userStory4}, null, f72502a, true, 83700, new Class[]{UserStory.class, UserStory.class}, Boolean.TYPE)) {
            return f72503b.a(userStory3, userStory4);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{userStory3, userStory4}, null, f72502a, true, 83700, new Class[]{UserStory.class, UserStory.class}, Boolean.TYPE)).booleanValue();
    }

    @JvmStatic
    public static final boolean a(@Nullable b bVar, @Nullable b bVar2) {
        b bVar3 = bVar;
        b bVar4 = bVar2;
        if (!PatchProxy.isSupport(new Object[]{bVar3, bVar4}, null, f72502a, true, 83705, new Class[]{b.class, b.class}, Boolean.TYPE)) {
            return f72503b.a(bVar3, bVar4);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar3, bVar4}, null, f72502a, true, 83705, new Class[]{b.class, b.class}, Boolean.TYPE)).booleanValue();
    }

    @JvmStatic
    @NotNull
    public static final String b(@Nullable b bVar) {
        b bVar2 = bVar;
        if (!PatchProxy.isSupport(new Object[]{bVar2}, null, f72502a, true, 83709, new Class[]{b.class}, String.class)) {
            return f72503b.c(bVar2);
        }
        return (String) PatchProxy.accessDispatch(new Object[]{bVar2}, null, f72502a, true, 83709, new Class[]{b.class}, String.class);
    }

    @JvmStatic
    public static final void b(@Nullable com.ss.android.ugc.aweme.story.feed.model.a aVar) {
        com.ss.android.ugc.aweme.story.feed.model.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, null, f72502a, true, 83731, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, null, f72502a, true, 83731, new Class[]{com.ss.android.ugc.aweme.story.feed.model.a.class}, Void.TYPE);
            return;
        }
        f72503b.c(aVar2);
    }

    @JvmStatic
    public static final boolean b(@Nullable UserStory userStory) {
        UserStory userStory2 = userStory;
        if (!PatchProxy.isSupport(new Object[]{userStory2}, null, f72502a, true, 83711, new Class[]{UserStory.class}, Boolean.TYPE)) {
            return f72503b.c(userStory2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{userStory2}, null, f72502a, true, 83711, new Class[]{UserStory.class}, Boolean.TYPE)).booleanValue();
    }

    @JvmStatic
    public static final boolean c(@NotNull UserStory userStory) {
        UserStory userStory2 = userStory;
        if (!PatchProxy.isSupport(new Object[]{userStory2}, null, f72502a, true, 83728, new Class[]{UserStory.class}, Boolean.TYPE)) {
            return f72503b.f(userStory2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{userStory2}, null, f72502a, true, 83728, new Class[]{UserStory.class}, Boolean.TYPE)).booleanValue();
    }

    @JvmStatic
    public static final boolean c(@Nullable b bVar) {
        b bVar2 = bVar;
        if (!PatchProxy.isSupport(new Object[]{bVar2}, null, f72502a, true, 83720, new Class[]{b.class}, Boolean.TYPE)) {
            return f72503b.d(bVar2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{bVar2}, null, f72502a, true, 83720, new Class[]{b.class}, Boolean.TYPE)).booleanValue();
    }

    @JvmStatic
    @Nullable
    public static final Video d(@Nullable b bVar) {
        b bVar2 = bVar;
        if (!PatchProxy.isSupport(new Object[]{bVar2}, null, f72502a, true, 83724, new Class[]{b.class}, Video.class)) {
            return f72503b.e(bVar2);
        }
        return (Video) PatchProxy.accessDispatch(new Object[]{bVar2}, null, f72502a, true, 83724, new Class[]{b.class}, Video.class);
    }

    @JvmStatic
    public static final void d(@Nullable UserStory userStory) {
        UserStory userStory2 = userStory;
        if (PatchProxy.isSupport(new Object[]{userStory2}, null, f72502a, true, 83732, new Class[]{UserStory.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{userStory2}, null, f72502a, true, 83732, new Class[]{UserStory.class}, Void.TYPE);
            return;
        }
        f72503b.g(userStory2);
    }

    @JvmStatic
    @Nullable
    public static final ImageInfo e(@Nullable b bVar) {
        Object accessDispatch;
        if (PatchProxy.isSupport(new Object[]{bVar}, null, f72502a, true, 83725, new Class[]{b.class}, ImageInfo.class)) {
            accessDispatch = PatchProxy.accessDispatch(new Object[]{bVar}, null, f72502a, true, 83725, new Class[]{b.class}, ImageInfo.class);
        } else {
            a aVar = f72503b;
            if (PatchProxy.isSupport(new Object[]{bVar}, aVar, a.f72504a, false, 83787, new Class[]{b.class}, ImageInfo.class)) {
                Object[] objArr = {bVar};
                a aVar2 = aVar;
                accessDispatch = PatchProxy.accessDispatch(objArr, aVar2, a.f72504a, false, 83787, new Class[]{b.class}, ImageInfo.class);
            } else {
                if (bVar != null) {
                    LifeStory lifeStory = bVar.getLifeStory();
                    if (lifeStory != null) {
                        return lifeStory.getImageInfo();
                    }
                }
                return null;
            }
        }
        return (ImageInfo) accessDispatch;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c9 A[LOOP:0: B:12:0x00a2->B:23:0x00c9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c8 A[SYNTHETIC] */
    @kotlin.jvm.JvmStatic
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int a(@org.jetbrains.annotations.Nullable java.lang.String r19, @org.jetbrains.annotations.Nullable com.ss.android.ugc.aweme.story.feed.model.a r20) {
        /*
            r2 = 2
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r10 = 0
            r3[r10] = r19
            r11 = 1
            r3[r11] = r20
            com.meituan.robust.ChangeQuickRedirect r5 = f72502a
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.story.feed.model.a> r4 = com.ss.android.ugc.aweme.story.feed.model.a.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Integer.TYPE
            r4 = 0
            r6 = 1
            r7 = 83701(0x146f5, float:1.1729E-40)
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0048
            java.lang.Object[] r12 = new java.lang.Object[r2]
            r12[r10] = r19
            r12[r11] = r20
            r13 = 0
            com.meituan.robust.ChangeQuickRedirect r14 = f72502a
            r15 = 1
            r16 = 83701(0x146f5, float:1.1729E-40)
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.story.feed.model.a> r1 = com.ss.android.ugc.aweme.story.feed.model.a.class
            r0[r11] = r1
            java.lang.Class r18 = java.lang.Integer.TYPE
            r17 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r12, r13, r14, r15, r16, r17, r18)
        L_0x0041:
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L_0x0048:
            com.ss.android.ugc.aweme.story.feed.c.g$a r12 = f72503b
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r10] = r19
            r3[r11] = r20
            com.meituan.robust.ChangeQuickRedirect r5 = com.ss.android.ugc.aweme.story.feed.c.g.a.f72504a
            r6 = 0
            r7 = 83743(0x1471f, float:1.17349E-40)
            java.lang.Class[] r8 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r8[r10] = r4
            java.lang.Class<com.ss.android.ugc.aweme.story.feed.model.a> r4 = com.ss.android.ugc.aweme.story.feed.model.a.class
            r8[r11] = r4
            java.lang.Class r9 = java.lang.Integer.TYPE
            r4 = r12
            boolean r3 = com.meituan.robust.PatchProxy.isSupport(r3, r4, r5, r6, r7, r8, r9)
            if (r3 == 0) goto L_0x0089
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r3[r10] = r19
            r3[r11] = r20
            com.meituan.robust.ChangeQuickRedirect r0 = com.ss.android.ugc.aweme.story.feed.c.g.a.f72504a
            r4 = 0
            r5 = 83743(0x1471f, float:1.17349E-40)
            java.lang.Class[] r6 = new java.lang.Class[r2]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r6[r10] = r1
            java.lang.Class<com.ss.android.ugc.aweme.story.feed.model.a> r1 = com.ss.android.ugc.aweme.story.feed.model.a.class
            r6[r11] = r1
            java.lang.Class r7 = java.lang.Integer.TYPE
            r1 = r3
            r2 = r12
            r3 = r0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0041
        L_0x0089:
            if (r20 == 0) goto L_0x00cd
            java.util.List r2 = r20.getUserStoryList()
            if (r2 != 0) goto L_0x0092
            goto L_0x00cd
        L_0x0092:
            java.util.List r1 = r20.getUserStoryList()
            java.lang.String r2 = "lifeFeed.userStoryList"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
        L_0x00a2:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x00cc
            java.lang.Object r3 = r1.next()
            com.ss.android.ugc.aweme.story.api.model.UserStory r3 = (com.ss.android.ugc.aweme.story.api.model.UserStory) r3
            r4 = r19
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            if (r3 == 0) goto L_0x00bf
            com.ss.android.ugc.aweme.profile.model.User r3 = r3.getUser()
            if (r3 == 0) goto L_0x00bf
            java.lang.String r3 = r3.getUid()
            goto L_0x00c0
        L_0x00bf:
            r3 = 0
        L_0x00c0:
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.equals(r4, r3)
            if (r3 == 0) goto L_0x00c9
            return r2
        L_0x00c9:
            int r2 = r2 + 1
            goto L_0x00a2
        L_0x00cc:
            return r10
        L_0x00cd:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.c.g.a(java.lang.String, com.ss.android.ugc.aweme.story.feed.model.a):int");
    }
}
