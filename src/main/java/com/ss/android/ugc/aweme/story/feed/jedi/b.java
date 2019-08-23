package com.ss.android.ugc.aweme.story.feed.jedi;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.story.api.model.LogPbBean;
import com.ss.android.ugc.aweme.story.api.model.UserStory;
import com.ss.android.ugc.aweme.story.viewpager2.widget.ViewPager2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a®\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u001a\u0014\u0010\u0018\u001a\u0004\u0018\u00010\u0019*\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u000b¨\u0006\u001c"}, d2 = {"copy", "Lcom/ss/android/ugc/aweme/story/api/model/UserStory;", "awemeList", "", "Lcom/ss/android/ugc/aweme/story/api/model/AwemeWithComment;", "minCursor", "", "maxCursor", "curPos", "totalCount", "hasMore", "", "user", "Lcom/ss/android/ugc/aweme/profile/model/User;", "readFlag", "friendType", "labelThumb", "Lcom/ss/android/ugc/aweme/base/model/UrlModel;", "labelLarge", "logPb", "Lcom/ss/android/ugc/aweme/story/api/model/LogPbBean;", "allStoryList", "Lcom/ss/android/ugc/aweme/story/api/model/IdWithScoreStruct;", "lastPos", "getViewHolderAt", "Landroid/support/v7/widget/RecyclerView$ViewHolder;", "Lcom/ss/android/ugc/aweme/story/viewpager2/widget/ViewPager2;", "position", "awemestory_douyinCnRelease"}, k = 2, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72657a;

    @Nullable
    public static final RecyclerView.ViewHolder a(@NotNull ViewPager2 viewPager2, int i) {
        ViewPager2 viewPager22 = viewPager2;
        if (PatchProxy.isSupport(new Object[]{viewPager22, Integer.valueOf(i)}, null, f72657a, true, 83221, new Class[]{ViewPager2.class, Integer.TYPE}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{viewPager22, Integer.valueOf(i)}, null, f72657a, true, 83221, new Class[]{ViewPager2.class, Integer.TYPE}, RecyclerView.ViewHolder.class);
        }
        Intrinsics.checkParameterIsNotNull(viewPager22, "$this$getViewHolderAt");
        RecyclerView recyclerView = viewPager2.getRecyclerView();
        Intrinsics.checkExpressionValueIsNotNull(recyclerView, "recyclerView");
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            View childAt = layoutManager.getChildAt(i);
            if (childAt != null) {
                return recyclerView.getChildViewHolder(childAt);
            }
        }
        return null;
    }

    public static /* synthetic */ UserStory a(UserStory userStory, List list, long j, long j2, long j3, long j4, int i, User user, int i2, int i3, UrlModel urlModel, UrlModel urlModel2, LogPbBean logPbBean, List list2, long j5, int i4) {
        List list3;
        long j6;
        long j7;
        long j8;
        long j9;
        int i5;
        User user2;
        int i6;
        int i7;
        UrlModel urlModel3;
        UrlModel urlModel4;
        LogPbBean logPbBean2;
        List list4;
        long j10;
        UserStory userStory2 = userStory;
        int i8 = i4;
        if ((i8 & 1) != 0) {
            list3 = userStory.getAwemeList();
        } else {
            list3 = list;
        }
        if ((i8 & 2) != 0) {
            j6 = userStory.getMinCursor();
        } else {
            j6 = j;
        }
        if ((i8 & 4) != 0) {
            j7 = userStory.getMaxCursor();
        } else {
            j7 = j2;
        }
        if ((i8 & 8) != 0) {
            j8 = userStory.getCurPos();
        } else {
            j8 = j3;
        }
        if ((i8 & 16) != 0) {
            j9 = userStory.getTotalCount();
        } else {
            j9 = j4;
        }
        if ((i8 & 32) != 0) {
            i5 = userStory.getHasMore();
        } else {
            i5 = i;
        }
        if ((i8 & 64) != 0) {
            user2 = userStory.getUser();
        } else {
            user2 = user;
        }
        if ((i8 & SearchJediMixFeedAdapter.f42517f) != 0) {
            i6 = userStory.getReadFlag();
        } else {
            i6 = i2;
        }
        if ((i8 & 256) != 0) {
            i7 = userStory.getFriendType();
        } else {
            i7 = i3;
        }
        if ((i8 & 512) != 0) {
            urlModel3 = userStory2.labelThumb;
        } else {
            urlModel3 = urlModel;
        }
        UrlModel urlModel5 = urlModel3;
        if ((i8 & 1024) != 0) {
            urlModel4 = userStory.getLabelLarge();
        } else {
            urlModel4 = urlModel2;
        }
        UrlModel urlModel6 = urlModel4;
        if ((i8 & 2048) != 0) {
            logPbBean2 = userStory.getLogPb();
        } else {
            logPbBean2 = logPbBean;
        }
        LogPbBean logPbBean3 = logPbBean2;
        if ((i8 & 4096) != 0) {
            list4 = userStory.getAllStoryList();
        } else {
            list4 = list2;
        }
        if ((i8 & 8192) != 0) {
            j10 = userStory.getLastPos();
        } else {
            j10 = j5;
        }
        List list5 = list4;
        int i9 = i6;
        int i10 = i7;
        long j11 = j10;
        long j12 = j11;
        if (PatchProxy.isSupport(new Object[]{userStory2, list3, new Long(j6), new Long(j7), new Long(j8), new Long(j9), Integer.valueOf(i5), user2, Integer.valueOf(i6), Integer.valueOf(i7), urlModel5, urlModel6, logPbBean3, list5, new Long(j11)}, null, f72657a, true, 83220, new Class[]{UserStory.class, List.class, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE, User.class, Integer.TYPE, Integer.TYPE, UrlModel.class, UrlModel.class, LogPbBean.class, List.class, Long.TYPE}, UserStory.class)) {
            return (UserStory) PatchProxy.accessDispatch(new Object[]{userStory2, list3, new Long(j6), new Long(j7), new Long(j8), new Long(j9), Integer.valueOf(i5), user2, Integer.valueOf(i9), Integer.valueOf(i10), urlModel5, urlModel6, logPbBean3, list5, new Long(j12)}, null, f72657a, true, 83220, new Class[]{UserStory.class, List.class, Long.TYPE, Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE, User.class, Integer.TYPE, Integer.TYPE, UrlModel.class, UrlModel.class, LogPbBean.class, List.class, Long.TYPE}, UserStory.class);
        }
        Intrinsics.checkParameterIsNotNull(userStory2, "$this$copy");
        UserStory userStory3 = new UserStory();
        userStory3.setAwemeList(list3);
        userStory3.setMinCursor(j6);
        userStory3.setMaxCursor(j7);
        userStory3.setCurPos(j8);
        userStory3.setTotalCount(j9);
        userStory3.setHasMore(i5);
        userStory3.setUser(user2);
        userStory3.setReadFlag(i9);
        userStory3.setFriendType(i10);
        userStory3.labelThumb = urlModel5;
        userStory3.setLabelLarge(urlModel6);
        userStory3.setLogPb(logPbBean3);
        userStory3.setAllStoryList(list5);
        userStory3.setLastPos(j12);
        return userStory3;
    }
}
