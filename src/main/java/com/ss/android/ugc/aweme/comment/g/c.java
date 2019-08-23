package com.ss.android.ugc.aweme.comment.g;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.ss.android.ugc.aweme.comment.model.CommentReplyListItem;
import java.util.ArrayList;
import java.util.List;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36457a;

    /* renamed from: b  reason: collision with root package name */
    public List<CommentReplyListItem> f36458b;

    /* renamed from: c  reason: collision with root package name */
    public List<Comment> f36459c;

    /* renamed from: d  reason: collision with root package name */
    private String f36460d = "";

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f36457a, false, 27777, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36457a, false, 27777, new Class[0], Void.TYPE);
            return;
        }
        if (this.f36458b != null) {
            this.f36458b.clear();
        }
        if (this.f36459c != null) {
            this.f36459c.clear();
        }
    }

    public final void a(String str) {
        if (str == null) {
            str = "";
        }
        this.f36460d = str;
    }

    public final void b(List<Comment> list) {
        if (PatchProxy.isSupport(new Object[]{list}, this, f36457a, false, 27787, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f36457a, false, 27787, new Class[]{List.class}, Void.TYPE);
        } else if (this.f36459c != null) {
            this.f36459c.removeAll(list);
        }
    }

    private CommentReplyListItem f(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f36457a, false, 27782, new Class[]{String.class}, CommentReplyListItem.class)) {
            return (CommentReplyListItem) PatchProxy.accessDispatch(new Object[]{str2}, this, f36457a, false, 27782, new Class[]{String.class}, CommentReplyListItem.class);
        }
        for (CommentReplyListItem next : this.f36458b) {
            if (next.mComment != null && TextUtils.equals(next.mComment.getCid(), str2)) {
                return next;
            }
        }
        return null;
    }

    public final List<Comment> b(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f36457a, false, 27775, new Class[]{String.class}, List.class)) {
            return (List) PatchProxy.accessDispatch(new Object[]{str}, this, f36457a, false, 27775, new Class[]{String.class}, List.class);
        }
        try {
            if (CollectionUtils.isEmpty(this.f36458b)) {
                return null;
            }
            return this.f36458b.get(Integer.parseInt(str)).mReplyComments;
        } catch (Exception unused) {
            return null;
        }
    }

    public final int e(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f36457a, false, 27789, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f36457a, false, 27789, new Class[]{String.class}, Integer.TYPE)).intValue();
        } else if (this.f36458b == null) {
            return -1;
        } else {
            for (int i = 0; i < this.f36458b.size(); i++) {
                CommentReplyListItem commentReplyListItem = this.f36458b.get(i);
                if (commentReplyListItem != null && commentReplyListItem.mComment != null && TextUtils.equals(commentReplyListItem.mComment.getCid(), str)) {
                    return i;
                }
            }
            return -1;
        }
    }

    public final int c(String str) {
        int size;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{str}, this, f36457a, false, 27780, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f36457a, false, 27780, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        if (!CollectionUtils.isEmpty(this.f36459c)) {
            for (int i2 = 0; i2 < this.f36459c.size(); i2++) {
                Comment comment = this.f36459c.get(i2);
                if (TextUtils.equals(comment.getFakeId(), str)) {
                    if (comment.getCommentType() == 2) {
                        CommentReplyListItem f2 = f(comment.getReplyId());
                        if (f2 != null) {
                            int indexOf = f2.mReplyComments.indexOf(comment);
                            if (f2.mButtonStruct != null) {
                                if (indexOf < f2.mButtonStruct.getTopSize()) {
                                    f2.mButtonStruct.setTopSize(f2.mButtonStruct.getTopSize() - 1);
                                }
                                f2.mButtonStruct.setExpandSize(f2.mButtonStruct.getExpandSize() - 1);
                                f2.mButtonStruct.setReplyCommentTotal(f2.mComment.getReplyCommentTotal() - 1);
                                if (comment.getReplyCommentTotal() <= f2.mButtonStruct.getTopSize()) {
                                    f2.mButtonStruct.setStatus(4);
                                }
                            }
                            f2.mComment.setReplyCommentTotal(f2.mComment.getReplyCommentTotal() - 1);
                            f2.mReplyComments.remove(comment);
                            return 1;
                        }
                    } else if (comment.getCommentType() == 1) {
                        CommentReplyListItem f3 = f(comment.getCid());
                        if (f3 != null) {
                            if (f3.mButtonStruct != null) {
                                size = f3.mButtonStruct.getExpandSize() + 2;
                            } else {
                                size = f3.mReplyComments.size() + 1;
                            }
                            i = size;
                            this.f36458b.remove(f3);
                        }
                        return i;
                    }
                }
            }
        }
        return 0;
    }

    public final int d(String str) {
        int size;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{str}, this, f36457a, false, 27781, new Class[]{String.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{str}, this, f36457a, false, 27781, new Class[]{String.class}, Integer.TYPE)).intValue();
        }
        if (!CollectionUtils.isEmpty(this.f36459c)) {
            for (int i2 = 0; i2 < this.f36459c.size(); i2++) {
                Comment comment = this.f36459c.get(i2);
                if (TextUtils.equals(comment.getCid(), str)) {
                    if (comment.getCommentType() == 2) {
                        CommentReplyListItem f2 = f(comment.getReplyId());
                        if (f2 != null) {
                            int indexOf = f2.mReplyComments.indexOf(comment);
                            if (f2.mButtonStruct != null) {
                                if (indexOf < f2.mButtonStruct.getTopSize()) {
                                    f2.mButtonStruct.setTopSize(f2.mButtonStruct.getTopSize() - 1);
                                }
                                f2.mButtonStruct.setExpandSize(f2.mButtonStruct.getExpandSize() - 1);
                                f2.mButtonStruct.setReplyCommentTotal(f2.mComment.getReplyCommentTotal() - 1);
                                if (comment.getReplyCommentTotal() <= f2.mButtonStruct.getTopSize()) {
                                    f2.mButtonStruct.setStatus(4);
                                }
                            }
                            f2.mComment.setReplyCommentTotal(f2.mComment.getReplyCommentTotal() - 1);
                            f2.mReplyComments.remove(comment);
                            return 1;
                        }
                    } else if (comment.getCommentType() == 1) {
                        CommentReplyListItem f3 = f(comment.getCid());
                        if (f3 != null) {
                            if (f3.mButtonStruct != null) {
                                size = f3.mButtonStruct.getExpandSize() + 2;
                            } else {
                                size = f3.mReplyComments.size() + 1;
                            }
                            i = size;
                            this.f36458b.remove(f3);
                        }
                        return i;
                    }
                }
            }
        }
        return 0;
    }

    public final void a(List<Comment> list) {
        int i;
        if (PatchProxy.isSupport(new Object[]{list}, this, f36457a, false, 27773, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f36457a, false, 27773, new Class[]{List.class}, Void.TYPE);
        } else if (list != null && this.f36458b != null && this.f36459c != null) {
            for (Comment next : list) {
                CommentReplyListItem commentReplyListItem = new CommentReplyListItem();
                next.setCommentType(1);
                next.setNeedHint(TextUtils.equals(this.f36460d, next.getCid()));
                commentReplyListItem.mComment = next;
                if (!this.f36458b.contains(commentReplyListItem)) {
                    this.f36458b.add(commentReplyListItem);
                    this.f36459c.add(next);
                    List<Comment> replyComments = next.getReplyComments();
                    if (replyComments == null) {
                        i = 0;
                    } else {
                        i = replyComments.size();
                    }
                    if (i > 0) {
                        for (Comment next2 : next.getReplyComments()) {
                            next2.setCommentType(2);
                            next2.setNeedHint(TextUtils.equals(this.f36460d, next2.getCid()));
                            if (!commentReplyListItem.mReplyComments.contains(next2)) {
                                commentReplyListItem.mReplyComments.add(next2);
                                this.f36459c.add(next2);
                            }
                        }
                    }
                    if (next.getReplyCommentTotal() - i > 0) {
                        CommentReplyButtonStruct commentReplyButtonStruct = new CommentReplyButtonStruct(next, this.f36458b.size() - 1);
                        commentReplyListItem.mButtonStruct = commentReplyButtonStruct;
                        this.f36459c.add(commentReplyButtonStruct);
                    }
                }
            }
        }
    }

    public final void a(int i, int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f36457a, false, 27786, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}, this, f36457a, false, 27786, new Class[]{Integer.TYPE, Integer.TYPE}, Void.TYPE);
        } else if (this.f36459c != null) {
            this.f36459c.subList(Math.max(0, i), Math.min(this.f36459c.size(), i2)).clear();
        }
    }

    public final void a(int i, Comment comment) {
        if (PatchProxy.isSupport(new Object[]{0, comment}, this, f36457a, false, 27784, new Class[]{Integer.TYPE, Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{0, comment}, this, f36457a, false, 27784, new Class[]{Integer.TYPE, Comment.class}, Void.TYPE);
        } else if (this.f36458b != null && comment != null) {
            CommentReplyListItem commentReplyListItem = new CommentReplyListItem();
            commentReplyListItem.mComment = comment;
            commentReplyListItem.mReplyComments = comment.getReplyComments();
            this.f36458b.add(Math.min(0, this.f36458b.size()), commentReplyListItem);
        }
    }

    public final void b(int i, Comment comment) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), comment}, this, f36457a, false, 27785, new Class[]{Integer.TYPE, Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), comment}, this, f36457a, false, 27785, new Class[]{Integer.TYPE, Comment.class}, Void.TYPE);
        } else if (this.f36459c != null && comment != null && i >= 0) {
            List<Comment> list = this.f36459c;
            list.add(Math.min(i, list.size()), comment);
        }
    }

    public final void a(int i, List<Comment> list) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), list}, this, f36457a, false, 27774, new Class[]{Integer.TYPE, List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), list}, this, f36457a, false, 27774, new Class[]{Integer.TYPE, List.class}, Void.TYPE);
        } else if (i >= 0 && list != null && !CollectionUtils.isEmpty(this.f36459c)) {
            Comment comment = this.f36459c.get(i);
            if (comment instanceof CommentReplyButtonStruct) {
                this.f36459c.addAll(i, list);
                try {
                    CommentReplyListItem commentReplyListItem = this.f36458b.get(Integer.valueOf(comment.getCid()).intValue());
                    if (!commentReplyListItem.mReplyComments.containsAll(list)) {
                        commentReplyListItem.mReplyComments.addAll(list);
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    public final boolean a(String str, int i, Comment comment) {
        int i2 = i;
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), comment2}, this, f36457a, false, 27783, new Class[]{String.class, Integer.TYPE, Comment.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), comment2}, this, f36457a, false, 27783, new Class[]{String.class, Integer.TYPE, Comment.class}, Boolean.TYPE)).booleanValue();
        }
        CommentReplyListItem f2 = f(str);
        if (f2 == null || i2 < 0) {
            return false;
        }
        if (f2.mButtonStruct != null) {
            f2.mButtonStruct.addExpandSize(1);
            f2.mButtonStruct.setReplyCommentTotal(f2.mButtonStruct.getReplyCommentTotal() + 1);
        }
        if (f2.mReplyComments == null) {
            f2.mReplyComments = new ArrayList();
        }
        List<Comment> list = f2.mReplyComments;
        list.add(Math.min(i2, list.size()), comment2);
        f2.mComment.setReplyCommentTotal(f2.mComment.getReplyCommentTotal() + 1);
        if (f2.mButtonStruct != null) {
            return true;
        }
        return false;
    }
}
