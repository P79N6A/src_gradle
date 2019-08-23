package com.ss.android.ugc.aweme.comment.e;

import a.g;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.comment.api.CommentApi;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.net.m;
import java.util.ArrayList;
import java.util.List;

public final class k extends g {
    public static ChangeQuickRedirect g;
    public String h = "";

    public final List<Comment> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((CommentItemList) this.mData).items;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length < 3) {
            return false;
        }
        return true;
    }

    public final void a(List<Comment> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, g, false, 27353, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, g, false, 27353, new Class[]{List.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(list)) {
            ((CommentItemList) this.mData).replyStyle = 2;
            if (this.mListQueryType == 4) {
                ((CommentItemList) this.mData).items = new ArrayList();
            }
            for (Comment next : list) {
                next.setCommentType(2);
                ((CommentItemList) this.mData).items.add(next);
            }
        }
    }

    public final void loadMoreList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, g, false, 27351, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, g, false, 27351, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(String.valueOf(objArr[1]), objArr[3].longValue(), 10, String.valueOf(objArr[2]), String.valueOf(objArr[4]));
    }

    public final void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, g, false, 27350, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, g, false, 27350, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(String.valueOf(objArr[1]), 0, 3, String.valueOf(objArr[2]), String.valueOf(objArr[3]));
    }

    private void a(String str, long j, int i, String str2, String str3) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j2), Integer.valueOf(i), str2, str3}, this, g, false, 27352, new Class[]{String.class, Long.TYPE, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, new Long(j2), Integer.valueOf(i), str2, str3}, this, g, false, 27352, new Class[]{String.class, Long.TYPE, Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        this.f36413e = "reply";
        CommentApi.a(str, j, i, str2, str3).a((g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0));
    }
}
