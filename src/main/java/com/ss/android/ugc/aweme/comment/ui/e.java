package com.ss.android.ugc.aweme.comment.ui;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.util.Pair;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.api.a.a;
import com.ss.android.ugc.aweme.comment.a.b;
import com.ss.android.ugc.aweme.comment.adapter.CommentAdapter;
import com.ss.android.ugc.aweme.comment.e.m;
import com.ss.android.ugc.aweme.comment.e.n;
import com.ss.android.ugc.aweme.comment.f;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.ss.android.ugc.aweme.comment.model.CommentReplyListItem;
import com.ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter;
import com.ss.android.ugc.aweme.common.f.c;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.di;
import java.util.Iterator;
import java.util.List;

public final class e implements m, n, LoadMoreRecyclerViewAdapter.a, c<Comment> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36576a;

    /* renamed from: b  reason: collision with root package name */
    public String f36577b;

    /* renamed from: c  reason: collision with root package name */
    RecyclerView f36578c;

    /* renamed from: d  reason: collision with root package name */
    com.ss.android.ugc.aweme.comment.g.c f36579d;

    /* renamed from: e  reason: collision with root package name */
    private DmtStatusView f36580e;

    /* renamed from: f  reason: collision with root package name */
    private Context f36581f;
    private int g;

    public final void c(List<Comment> list, boolean z) {
    }

    public final void d(Exception exc) {
    }

    public final void e(Exception exc) {
    }

    public final void loadMore() {
    }

    public final void z_() {
    }

    /* access modifiers changed from: package-private */
    public boolean a(Comment comment, int i, int i2) {
        Comment comment2 = comment;
        int i3 = i;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{comment2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f36576a, false, 27511, new Class[]{Comment.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{comment2, Integer.valueOf(i), Integer.valueOf(i2)}, this, f36576a, false, 27511, new Class[]{Comment.class, Integer.TYPE, Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        int h = f.f36433c.h(comment2);
        return h == -1 || i3 < 0 || i4 < 0 || h < i3 || h > i4;
    }

    public final void a(boolean z, Comment comment) {
        int i;
        Rect rect;
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), comment2}, this, f36576a, false, 27516, new Class[]{Boolean.TYPE, Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), comment2}, this, f36576a, false, 27516, new Class[]{Boolean.TYPE, Comment.class}, Void.TYPE);
        } else if (!z || comment2 != null) {
            if (z) {
                if (PatchProxy.isSupport(new Object[]{comment2}, this, f36576a, false, 27517, new Class[]{Comment.class}, Rect.class)) {
                    rect = (Rect) PatchProxy.accessDispatch(new Object[]{comment2}, this, f36576a, false, 27517, new Class[]{Comment.class}, Rect.class);
                } else {
                    if (comment2 != null) {
                        RecyclerView.ViewHolder c2 = c(comment2);
                        if (c2 != null) {
                            rect = di.a(c2);
                        }
                    }
                    rect = null;
                }
                if (rect != null) {
                    int[] iArr = new int[2];
                    this.f36578c.getLocationOnScreen(iArr);
                    i = rect.top - iArr[1];
                    int max = Math.max(0, (this.f36578c.computeVerticalScrollRange() - this.f36578c.computeVerticalScrollOffset()) - this.f36578c.getHeight());
                    if (i > max) {
                        this.f36578c.animate().translationY((float) (max - i)).setDuration(300).start();
                        i = max;
                    }
                } else {
                    i = 0;
                }
                this.g = i;
            } else {
                this.f36578c.animate().translationY(0.0f).setDuration(300).start();
                i = -this.g;
                this.g = 0;
            }
            if (this.f36578c != null) {
                this.f36578c.smoothScrollBy(0, i);
            }
        }
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f36576a, false, 27494, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36576a, false, 27494, new Class[0], Void.TYPE);
            return;
        }
        this.f36578c.setVisibility(0);
        this.f36580e.d();
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f36576a, false, 27498, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36576a, false, 27498, new Class[0], Void.TYPE);
            return;
        }
        ((CommentAdapter) this.f36578c.getAdapter()).showLoadMoreLoading();
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f36576a, false, 27496, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36576a, false, 27496, new Class[0], Void.TYPE);
            return;
        }
        CommentAdapter commentAdapter = (CommentAdapter) this.f36578c.getAdapter();
        if (commentAdapter.mShowFooter) {
            commentAdapter.setShowFooter(false);
            commentAdapter.notifyDataSetChanged();
        }
        this.f36580e.e();
        this.f36578c.setVisibility(8);
    }

    public final void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f36576a, false, 27499, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f36576a, false, 27499, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        ((CommentAdapter) this.f36578c.getAdapter()).showLoadMoreError();
    }

    public final void f(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f36576a, false, 27501, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f36576a, false, 27501, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        a.a(this.f36581f, exc2, C0906R.string.a4p);
    }

    /* access modifiers changed from: package-private */
    public void a(Comment comment) {
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{comment2}, this, f36576a, false, 27510, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment2}, this, f36576a, false, 27510, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        int h = f.f36433c.h(comment2);
        RecyclerView.Adapter adapter = this.f36578c.getAdapter();
        if (h >= 0 && adapter != null) {
            adapter.notifyItemChanged(h, 1);
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f36576a, false, 27495, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f36576a, false, 27495, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        CommentAdapter commentAdapter = (CommentAdapter) this.f36578c.getAdapter();
        if (commentAdapter.mShowFooter) {
            commentAdapter.setShowFooter(false);
            commentAdapter.notifyDataSetChanged();
        }
        if (exc instanceof com.ss.android.ugc.aweme.base.api.a.b.a) {
            this.f36580e.e();
            this.f36578c.setVisibility(8);
            if (((com.ss.android.ugc.aweme.base.api.a.b.a) exc).getErrorCode() == 14) {
                a.a(this.f36581f, (Throwable) exc);
            }
        } else {
            this.f36580e.f();
            this.f36578c.setVisibility(8);
        }
    }

    private RecyclerView.ViewHolder c(Comment comment) {
        List<Comment> list;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{comment}, this, f36576a, false, 27518, new Class[]{Comment.class}, RecyclerView.ViewHolder.class)) {
            return (RecyclerView.ViewHolder) PatchProxy.accessDispatch(new Object[]{comment}, this, f36576a, false, 27518, new Class[]{Comment.class}, RecyclerView.ViewHolder.class);
        }
        Pair a2 = di.a(this.f36578c);
        if (a2.first == null || a2.second == null) {
            return null;
        }
        if (comment.getCommentType() == 0) {
            RecyclerView.Adapter adapter = this.f36578c.getAdapter();
            if (adapter instanceof CommentAdapter) {
                list = ((CommentAdapter) adapter).getData();
            } else {
                list = null;
            }
        } else {
            list = this.f36579d.f36459c;
        }
        if (list != null) {
            i = list.size();
        }
        int intValue = ((Integer) a2.first).intValue();
        while (intValue <= ((Integer) a2.second).intValue() && intValue < i && intValue >= 0) {
            Comment comment2 = list.get(intValue);
            if (comment2 != null && comment2.getCid() != null && TextUtils.equals(comment2.getCid(), comment.getCid())) {
                return this.f36578c.findViewHolderForAdapterPosition(intValue);
            }
            intValue++;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.ss.android.ugc.aweme.comment.model.Comment r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f36576a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.comment.model.Comment> r1 = com.ss.android.ugc.aweme.comment.model.Comment.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 27512(0x6b78, float:3.8553E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f36576a
            r3 = 0
            r4 = 27512(0x6b78, float:3.8553E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<com.ss.android.ugc.aweme.comment.model.Comment> r1 = com.ss.android.ugc.aweme.comment.model.Comment.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            android.support.v7.widget.RecyclerView r0 = r9.f36578c
            android.support.v7.widget.RecyclerView$Adapter r0 = r0.getAdapter()
            com.ss.android.ugc.aweme.comment.adapter.CommentAdapter r0 = (com.ss.android.ugc.aweme.comment.adapter.CommentAdapter) r0
            java.util.List r1 = r0.getData()
            boolean r2 = com.bytedance.common.utility.collection.CollectionUtils.isEmpty(r1)
            r3 = -1
            r4 = 2
            if (r2 == 0) goto L_0x0054
            r0.insertData(r10, r8)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = r9.f36580e
            r1.b()
            android.support.v7.widget.RecyclerView r1 = r9.f36578c
            r1.setVisibility(r8)
        L_0x0051:
            r1 = 0
            goto L_0x00d6
        L_0x0054:
            int r2 = r10.getCommentType()
            if (r2 != r4) goto L_0x00c3
            java.lang.String r1 = r10.getReplyToReplyCommentId()
            java.lang.String r2 = r10.getReplyId()
            java.lang.String r5 = r10.getReplyToReplyCommentId()
            boolean r2 = android.text.TextUtils.equals(r2, r5)
            if (r2 == 0) goto L_0x006e
            r2 = 1
            goto L_0x006f
        L_0x006e:
            r2 = 2
        L_0x006f:
            int r1 = r0.a((java.lang.String) r1, (int) r2)
            if (r1 < 0) goto L_0x0051
            int r1 = r1 + r7
        L_0x0076:
            java.util.List r2 = r0.getData()
            int r2 = r2.size()
            if (r1 >= r2) goto L_0x008a
            int r2 = r0.getItemViewType(r1)
            if (r2 == r4) goto L_0x0087
            goto L_0x008b
        L_0x0087:
            int r1 = r1 + 1
            goto L_0x0076
        L_0x008a:
            r1 = -1
        L_0x008b:
            if (r1 >= 0) goto L_0x0095
            java.util.List r1 = r0.getData()
            int r1 = r1.size()
        L_0x0095:
            java.lang.String r2 = r10.getReplyId()
            int r2 = r0.a((java.lang.String) r2, (int) r7)
            int r2 = r1 - r2
            int r2 = r2 - r7
            com.ss.android.ugc.aweme.comment.g.c r5 = r9.f36579d
            java.lang.String r6 = r10.getReplyId()
            boolean r2 = r5.a(r6, r2, r10)
            r0.insertData(r10, r1)
            if (r1 <= 0) goto L_0x00b4
            int r5 = r1 + -1
            r0.notifyItemChanged(r5)
        L_0x00b4:
            if (r2 == 0) goto L_0x00bb
            int r2 = r1 + 1
            r0.notifyItemChanged(r2)
        L_0x00bb:
            android.support.v7.widget.RecyclerView r2 = r9.f36578c
            int r5 = r1 + 1
            r2.scrollToPosition(r5)
            goto L_0x00d6
        L_0x00c3:
            com.ss.android.ugc.aweme.comment.g.c r2 = r9.f36579d
            r2.a((int) r8, (com.ss.android.ugc.aweme.comment.model.Comment) r10)
            java.lang.Object r1 = r1.get(r8)
            boolean r1 = r1 instanceof com.ss.android.ugc.aweme.commercialize.model.c
            if (r1 == 0) goto L_0x00d2
            r1 = 1
            goto L_0x00d3
        L_0x00d2:
            r1 = 0
        L_0x00d3:
            r0.insertData(r10, r1)
        L_0x00d6:
            boolean r2 = com.ss.android.g.a.a()
            if (r2 != 0) goto L_0x00e2
            r0.setShowFooter(r7)
            r0.showLoadMoreEmpty()
        L_0x00e2:
            int r2 = r10.getCommentType()
            if (r2 == r4) goto L_0x0117
            android.support.v7.widget.RecyclerView r2 = r9.f36578c
            android.support.v7.widget.RecyclerView$LayoutManager r2 = r2.getLayoutManager()
            android.support.v7.widget.LinearLayoutManager r2 = (android.support.v7.widget.LinearLayoutManager) r2
            int r4 = r2.findFirstVisibleItemPosition()
            r5 = 0
            if (r4 == r3) goto L_0x0105
            android.view.View r6 = r2.findViewByPosition(r4)
            if (r6 == 0) goto L_0x0105
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r6.getHitRect(r5)
        L_0x0105:
            r0.notifyDataSetChanged()
            if (r4 == r3) goto L_0x0112
            if (r5 == 0) goto L_0x0112
            int r4 = r4 + r7
            int r0 = r5.top
            r2.scrollToPositionWithOffset(r4, r0)
        L_0x0112:
            android.support.v7.widget.RecyclerView r0 = r9.f36578c
            r0.scrollToPosition(r8)
        L_0x0117:
            com.ss.android.ugc.aweme.comment.f r0 = com.ss.android.ugc.aweme.comment.f.f36433c
            r0.a((com.ss.android.ugc.aweme.comment.model.Comment) r10, (int) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.ui.e.b(com.ss.android.ugc.aweme.comment.model.Comment):void");
    }

    public final void c(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f36576a, false, 27502, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f36576a, false, 27502, new Class[]{String.class}, Void.TYPE);
            return;
        }
        CommentAdapter commentAdapter = (CommentAdapter) this.f36578c.getAdapter();
        if (commentAdapter != null) {
            if (PatchProxy.isSupport(new Object[]{str2}, commentAdapter, CommentAdapter.f36281a, false, 27200, new Class[]{String.class}, Void.TYPE)) {
                CommentAdapter commentAdapter2 = commentAdapter;
                PatchProxy.accessDispatch(new Object[]{str2}, commentAdapter2, CommentAdapter.f36281a, false, 27200, new Class[]{String.class}, Void.TYPE);
            } else if (commentAdapter.getBasicItemCount() != 0) {
                int i = 0;
                while (i < commentAdapter.mItems.size()) {
                    Comment comment = (Comment) commentAdapter.mItems.get(i);
                    if (comment == null || !StringUtils.equal(comment.getCid(), str2)) {
                        i++;
                    } else {
                        b.a(comment, commentAdapter.f36284d.getAuthorUid());
                        commentAdapter.notifyItemChanged(i, 0);
                        bg.a(new com.ss.android.ugc.aweme.comment.b.a(2, new Object[]{commentAdapter.f36284d.getAid(), comment}));
                        return;
                    }
                }
            }
        }
    }

    public final void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f36576a, false, 27504, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f36576a, false, 27504, new Class[]{String.class}, Void.TYPE);
            return;
        }
        CommentAdapter commentAdapter = (CommentAdapter) this.f36578c.getAdapter();
        int c2 = this.f36579d.c(str2);
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(c2)}, commentAdapter, CommentAdapter.f36281a, false, 27202, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            CommentAdapter commentAdapter2 = commentAdapter;
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(c2)}, commentAdapter2, CommentAdapter.f36281a, false, 27202, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
        } else {
            int basicItemCount = commentAdapter.getBasicItemCount();
            if (basicItemCount != 0 && !TextUtils.isEmpty(str)) {
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= basicItemCount) {
                        break;
                    }
                    Comment comment = (Comment) commentAdapter.mItems.get(i2);
                    if (comment != null && StringUtils.equal(comment.getFakeId(), str2)) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
                if (i >= 0 && i < commentAdapter.mItems.size()) {
                    if (c2 > 1) {
                        List list = commentAdapter.mItems;
                        list.subList(i, Math.min(list.size(), i + c2)).clear();
                        commentAdapter.notifyItemRangeRemoved(i, c2);
                    } else {
                        if (i > 0) {
                            commentAdapter.notifyItemChanged(i - 1);
                        }
                        commentAdapter.mItems.remove(i);
                        commentAdapter.notifyItemRemoved(i);
                    }
                    commentAdapter.notifyItemRangeChanged(i, commentAdapter.getData().size() - i);
                }
            }
        }
        if (commentAdapter.getBasicItemCount() == 0) {
            commentAdapter.setShowFooter(false);
            commentAdapter.notifyItemRemoved(0);
            this.f36580e.e();
        }
        bg.a(new com.ss.android.ugc.aweme.comment.b.a(4, this.f36577b));
    }

    public final void b(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f36576a, false, 27503, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f36576a, false, 27503, new Class[]{String.class}, Void.TYPE);
            return;
        }
        CommentAdapter commentAdapter = (CommentAdapter) this.f36578c.getAdapter();
        int d2 = this.f36579d.d(str2);
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(d2)}, commentAdapter, CommentAdapter.f36281a, false, 27201, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            CommentAdapter commentAdapter2 = commentAdapter;
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(d2)}, commentAdapter2, CommentAdapter.f36281a, false, 27201, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
        } else {
            int basicItemCount = commentAdapter.getBasicItemCount();
            if (basicItemCount != 0 && !TextUtils.isEmpty(str)) {
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= basicItemCount) {
                        break;
                    }
                    Comment comment = (Comment) commentAdapter.mItems.get(i2);
                    if (comment != null && StringUtils.equal(comment.getCid(), str2)) {
                        i = i2;
                        break;
                    }
                    i2++;
                }
                if (i >= 0 && i < commentAdapter.mItems.size()) {
                    if (d2 > 1) {
                        List list = commentAdapter.mItems;
                        list.subList(i, Math.min(list.size(), i + d2)).clear();
                        commentAdapter.notifyItemRangeRemoved(i, d2);
                    } else {
                        if (i > 0) {
                            commentAdapter.notifyItemChanged(i - 1);
                        }
                        commentAdapter.mItems.remove(i);
                        commentAdapter.notifyItemRemoved(i);
                    }
                    commentAdapter.notifyItemRangeChanged(i, commentAdapter.getData().size() - i);
                }
            }
        }
        if (commentAdapter.getBasicItemCount() == 0) {
            commentAdapter.setShowFooter(false);
            commentAdapter.notifyItemRemoved(0);
            this.f36580e.e();
        }
        bg.a(new com.ss.android.ugc.aweme.comment.b.a(4, this.f36577b));
    }

    public final String a(String str, List<Comment> list) {
        if (PatchProxy.isSupport(new Object[]{str, list}, this, f36576a, false, 27513, new Class[]{String.class, List.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str, list}, this, f36576a, false, 27513, new Class[]{String.class, List.class}, String.class);
        } else if (TextUtils.isEmpty(str) || CollectionUtils.isEmpty(list)) {
            return "";
        } else {
            CommentAdapter commentAdapter = (CommentAdapter) this.f36578c.getAdapter();
            int a2 = commentAdapter.a(str, 11);
            String str2 = "";
            if (a2 >= 0 && this.f36579d != null) {
                Comment comment = commentAdapter.getData().get(a2);
                if (comment instanceof CommentReplyButtonStruct) {
                    str2 = ((CommentReplyButtonStruct) comment).getCommentId();
                }
                this.f36579d.a(a2, list);
                commentAdapter.notifyItemRangeInserted(a2, list.size());
                commentAdapter.notifyItemRangeChanged(a2, commentAdapter.getItemCount() - a2);
            }
            return str2;
        }
    }

    public final void b(List<Comment> list, boolean z) {
        boolean z2;
        List<Comment> list2 = list;
        if (PatchProxy.isSupport(new Object[]{list2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f36576a, false, 27500, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list2, Byte.valueOf(z)}, this, f36576a, false, 27500, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        CommentAdapter commentAdapter = (CommentAdapter) this.f36578c.getAdapter();
        if (com.ss.android.g.a.a()) {
            commentAdapter.setShowFooter(true);
        }
        if (list2 == null || list.isEmpty()) {
            z2 = false;
        } else {
            z2 = z;
        }
        if (z2) {
            commentAdapter.resetLoadMoreState();
        } else if (!com.ss.android.g.a.a() || commentAdapter.g) {
            commentAdapter.showLoadMoreEmpty();
        } else {
            commentAdapter.setShowFooter(false);
        }
        commentAdapter.setDataAfterLoadMore(list2);
    }

    public final void a(List<Comment> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f36576a, false, 27497, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f36576a, false, 27497, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        CommentAdapter commentAdapter = (CommentAdapter) this.f36578c.getAdapter();
        if (com.ss.android.g.a.a()) {
            commentAdapter.setShowFooter(true);
        }
        if (z) {
            commentAdapter.resetLoadMoreState();
        } else if (!com.ss.android.g.a.a() || commentAdapter.g) {
            commentAdapter.showLoadMoreEmpty();
        } else {
            commentAdapter.setShowFooter(false);
        }
        commentAdapter.setData(list);
        this.f36578c.setVisibility(0);
        this.f36580e.b();
    }

    public e(Context context, DmtStatusView dmtStatusView, RecyclerView recyclerView, com.ss.android.ugc.aweme.comment.g.c cVar) {
        this.f36581f = context;
        this.f36580e = dmtStatusView;
        this.f36578c = recyclerView;
        this.f36579d = cVar;
    }

    public final void a(Comment comment, int i, int i2, boolean z) {
        int i3;
        int i4;
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{comment2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z ? (byte) 1 : 0)}, this, f36576a, false, 27509, new Class[]{Comment.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment2, Integer.valueOf(i), Integer.valueOf(i2), Byte.valueOf(z)}, this, f36576a, false, 27509, new Class[]{Comment.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, Void.TYPE);
        } else if (comment2 != null) {
            if (!f.f36433c.a(comment)) {
                b(comment);
            }
            f.f36433c.k(comment);
            f.f36433c.f(comment);
            int h = f.f36433c.h(comment);
            RecyclerView.Adapter adapter = this.f36578c.getAdapter();
            if (adapter instanceof CommentAdapter) {
                CommentAdapter commentAdapter = (CommentAdapter) adapter;
                List<Comment> data = commentAdapter.getData();
                if (data != null && h >= 0 && h <= data.size() - 1) {
                    data.set(h, comment);
                    commentAdapter.notifyItemChanged(h);
                }
            }
            List<CommentReplyListItem> list = this.f36579d.f36458b;
            if (list != null) {
                Iterator<CommentReplyListItem> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    CommentReplyListItem next = it2.next();
                    if (TextUtils.equals(next.mComment.getFakeId(), comment.getFakeId())) {
                        next.mComment = comment2;
                    } else if (TextUtils.equals(next.mComment.getCid(), comment.getReplyId())) {
                        List<Comment> list2 = next.mReplyComments;
                        if (list2 == null) {
                            i4 = 0;
                        } else {
                            i4 = list2.size();
                        }
                        int i5 = 0;
                        while (true) {
                            if (i5 >= i4) {
                                break;
                            } else if (TextUtils.equals(list2.get(i5).getFakeId(), comment.getFakeId())) {
                                list2.set(i5, comment);
                                break;
                            } else {
                                i5++;
                            }
                        }
                    }
                }
            }
            if (a(comment, i, i2)) {
                Context context = this.f36578c.getContext();
                if (z) {
                    i3 = C0906R.string.aho;
                } else {
                    i3 = C0906R.string.wa;
                }
                com.bytedance.ies.dmt.ui.d.a.a(context, i3).a();
            }
            f.f36433c.g(comment);
            this.f36578c.setVisibility(0);
            com.ss.android.ugc.aweme.feed.a.a().c(this.f36577b);
            this.f36580e.b();
        }
    }
}
