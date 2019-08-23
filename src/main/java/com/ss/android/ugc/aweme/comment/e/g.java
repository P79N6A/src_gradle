package com.ss.android.ugc.aweme.comment.e;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.comment.api.CommentApi;
import com.ss.android.ugc.aweme.comment.f.b;
import com.ss.android.ugc.aweme.comment.g.c;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.net.m;
import com.ss.android.ugc.aweme.utils.permission.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.jetbrains.annotations.Nullable;

public class g extends a<Comment, CommentItemList> {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f36411c;

    /* renamed from: d  reason: collision with root package name */
    public String f36412d;

    /* renamed from: e  reason: collision with root package name */
    protected String f36413e;

    /* renamed from: f  reason: collision with root package name */
    public c f36414f;
    private String g;

    public final int a() {
        if (this.mData == null) {
            return 0;
        }
        return ((CommentItemList) this.mData).total;
    }

    public boolean isHasMore() {
        if (this.mData == null || !((CommentItemList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public List<Comment> getItems() {
        if (this.mData == null) {
            return null;
        }
        if (((CommentItemList) this.mData).replyStyle != 2 || this.f36414f == null) {
            return ((CommentItemList) this.mData).items;
        }
        return this.f36414f.f36459c;
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 6) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    public void a(@Nullable CommentItemList commentItemList) {
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{commentItemList}, this, f36411c, false, 27337, new Class[]{CommentItemList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{commentItemList}, this, f36411c, false, 27337, new Class[]{CommentItemList.class}, Void.TYPE);
            return;
        }
        if (this.f36412d != null) {
            this.f36394b.b(this.f36412d);
        }
        this.f36394b.a(this.f36413e);
        if (commentItemList != null) {
            this.f36394b.b(commentItemList.total);
            b bVar = this.f36394b;
            if (commentItemList.items != null) {
                i = commentItemList.items.size();
            }
            bVar.a(i);
            this.f36394b.a(commentItemList.cursor);
        }
        this.f36394b.b();
    }

    public void loadMoreList(Object... objArr) {
        long j;
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f36411c, false, 27333, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f36411c, false, 27333, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        String str = objArr[1];
        if (isDataEmpty()) {
            j = 0;
        } else {
            j = ((CommentItemList) this.mData).cursor;
        }
        a(str, j, 20, objArr[2].intValue(), objArr[3], objArr[4], objArr[5]);
    }

    public void refreshList(Object... objArr) {
        if (PatchProxy.isSupport(new Object[]{objArr}, this, f36411c, false, 27332, new Class[]{Object[].class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{objArr}, this, f36411c, false, 27332, new Class[]{Object[].class}, Void.TYPE);
            return;
        }
        a(objArr[1], 0, 20, objArr[2].intValue(), objArr[3], objArr[4], objArr[5]);
    }

    public void a(List<Comment> list) {
        List<Comment> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2}, this, f36411c, false, 27336, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2}, this, f36411c, false, 27336, new Class[]{List.class}, Void.TYPE);
        } else if (!CollectionUtils.isEmpty(list)) {
            if (((CommentItemList) this.mData).replyStyle != 2 || this.f36414f == null) {
                for (Comment next : list) {
                    if (Comment.isSupportReplyComment() && !CollectionUtils.isEmpty(next.getReplyComments())) {
                        Comment comment = next.getReplyComments().get(0);
                        ArrayList arrayList = new ArrayList();
                        next.setReplyComments(null);
                        arrayList.add(next);
                        comment.setReplyComments(arrayList);
                        next = comment;
                    }
                    next.setNeedHint(TextUtils.equals(this.g, next.getCid()));
                    if (!((CommentItemList) this.mData).items.contains(next)) {
                        next.setCommentType(0);
                        ((CommentItemList) this.mData).items.add(next);
                    }
                }
                return;
            }
            c cVar = this.f36414f;
            if (PatchProxy.isSupport(new Object[0], cVar, c.f36457a, false, 27776, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cVar, c.f36457a, false, 27776, new Class[0], Void.TYPE);
            } else {
                if (cVar.f36458b == null) {
                    cVar.f36458b = new ArrayList();
                }
                if (cVar.f36459c == null) {
                    cVar.f36459c = new ArrayList();
                }
            }
            this.f36414f.a(this.g);
            if (this.mListQueryType == 1) {
                this.f36414f.a();
            }
            this.f36414f.a(list2);
        }
    }

    public /* synthetic */ void handleData(Object obj) {
        boolean z;
        CommentItemList commentItemList = (CommentItemList) obj;
        boolean z2 = true;
        if (PatchProxy.isSupport(new Object[]{commentItemList}, this, f36411c, false, 27335, new Class[]{CommentItemList.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{commentItemList}, this, f36411c, false, 27335, new Class[]{CommentItemList.class}, Void.TYPE);
            return;
        }
        this.f36394b.a((BaseResponse) commentItemList);
        a(commentItemList);
        if (commentItemList == null || (CollectionUtils.isEmpty(commentItemList.items) && this.mListQueryType == 4)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                List<Comment> list = commentItemList.items;
                this.mData = commentItemList;
                ((CommentItemList) this.mData).items = new ArrayList();
                a(list);
            } else if (i == 4) {
                a(commentItemList.items);
                ((CommentItemList) this.mData).total = commentItemList.total;
                ((CommentItemList) this.mData).cursor = commentItemList.cursor;
                CommentItemList commentItemList2 = (CommentItemList) this.mData;
                if (!commentItemList.hasMore || !((CommentItemList) this.mData).hasMore) {
                    z2 = false;
                }
                commentItemList2.hasMore = z2;
            }
        } else {
            if (this.mData != null) {
                if (this.mListQueryType == 1) {
                    List<Comment> list2 = commentItemList.items;
                    this.mData = commentItemList;
                    ((CommentItemList) this.mData).items = new ArrayList();
                    a(list2);
                }
                ((CommentItemList) this.mData).hasMore = false;
            }
        }
    }

    private void a(String str, long j, int i, int i2, String str2, String str3, Long l) {
        String str4 = str;
        long j2 = j;
        String str5 = str3;
        if (PatchProxy.isSupport(new Object[]{str4, new Long(j2), 20, Integer.valueOf(i2), str2, str5, l}, this, f36411c, false, 27334, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class, Long.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, new Long(j2), 20, Integer.valueOf(i2), str2, str5, l}, this, f36411c, false, 27334, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class, Long.class}, Void.TYPE);
            return;
        }
        this.f36412d = str4;
        this.g = str5;
        if (Comment.isSupportReplyComment()) {
            this.f36413e = "v2";
            CommentApi.a(this.f36412d, j, 20, str3, e.a(), e.b(), l).a((a.g<TResult, TContinuationResult>) new m<TResult,TContinuationResult>(this.mHandler, 0));
            return;
        }
        com.ss.android.ugc.aweme.base.m a2 = com.ss.android.ugc.aweme.base.m.a();
        WeakHandler weakHandler = this.mHandler;
        final String str6 = str3;
        final long j3 = j;
        final int i3 = i2;
        AnonymousClass1 r9 = r0;
        final String str7 = str2;
        AnonymousClass1 r0 = new Callable(20) {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f36415a;

            public final Object call() throws Exception {
                boolean z;
                if (PatchProxy.isSupport(new Object[0], this, f36415a, false, 27338, new Class[0], Object.class)) {
                    return PatchProxy.accessDispatch(new Object[0], this, f36415a, false, 27338, new Class[0], Object.class);
                }
                b bVar = g.this.f36394b;
                int i = 20;
                if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, bVar, b.f36441a, false, 27403, new Class[]{Integer.TYPE}, Void.TYPE)) {
                    b bVar2 = bVar;
                    PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, bVar2, b.f36441a, false, 27403, new Class[]{Integer.TYPE}, Void.TYPE);
                } else {
                    bVar.f36442b.put("RequireCount", String.valueOf(i));
                }
                g.this.f36413e = "v1";
                List list = null;
                if (!TextUtils.isEmpty(str6)) {
                    list = Arrays.asList(str6.split(","));
                }
                String str = g.this.f36412d;
                long j = j3;
                int i2 = 20;
                int i3 = i3;
                String str2 = str7;
                String json = new Gson().toJson((Object) list);
                int a2 = e.a();
                int b2 = e.b();
                if (j3 <= 0) {
                    z = true;
                } else {
                    z = false;
                }
                return CommentApi.a(str, j, i2, i3, str2, json, a2, b2, z, null);
            }
        };
        a2.a(weakHandler, r9, 0);
    }
}
