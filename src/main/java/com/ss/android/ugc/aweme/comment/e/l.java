package com.ss.android.ugc.aweme.comment.e;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.a.a;
import com.ss.android.ugc.aweme.comment.adapter.CommentReplyButtonViewHolder;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.comment.model.CommentReplyButtonStruct;
import com.ss.android.ugc.aweme.common.f.b;
import com.ss.android.ugc.aweme.common.f.c;
import java.util.Iterator;
import java.util.List;

public final class l extends b<k> implements c<Comment> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36429a;

    /* renamed from: b  reason: collision with root package name */
    public p f36430b;
    private CommentReplyButtonViewHolder g;
    private CommentReplyButtonStruct h;
    private com.ss.android.ugc.aweme.comment.g.c i;
    private String j;

    public final void c(List list, boolean z) {
    }

    public final void d(Exception exc) {
    }

    public final void z_() {
    }

    public l() {
        a(new k());
        a(this);
    }

    private String f() {
        if (PatchProxy.isSupport(new Object[0], this, f36429a, false, 27365, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f36429a, false, 27365, new Class[0], String.class);
        } else if (this.h != null) {
            return this.h.getCid();
        } else {
            return "";
        }
    }

    public final void n_() {
        if (PatchProxy.isSupport(new Object[0], this, f36429a, false, 27359, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36429a, false, 27359, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.a(3);
        }
    }

    public final void s_() {
        if (PatchProxy.isSupport(new Object[0], this, f36429a, false, 27362, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36429a, false, 27362, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.a(3);
        }
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, f36429a, false, 27360, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36429a, false, 27360, new Class[0], Void.TYPE);
            return;
        }
        if (!(this.h == null || ((k) this.f2978e).getData() == null)) {
            this.h.setCursor(((CommentItemList) ((k) this.f2978e).getData()).cursor);
            this.h.setHasMore(((k) this.f2978e).isHasMore());
        }
        if (this.g != null) {
            if (((k) this.f2978e).isHasMore()) {
                this.g.a(1);
                return;
            }
            this.g.a(2);
        }
    }

    public final void a(String str) {
        this.j = str;
        ((k) this.f2978e).h = str;
    }

    private void a(List<Comment> list) {
        List list2;
        if (PatchProxy.isSupport(new Object[]{list}, this, f36429a, false, 27358, new Class[]{List.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list}, this, f36429a, false, 27358, new Class[]{List.class}, Void.TYPE);
            return;
        }
        if (this.i != null) {
            list2 = this.i.b(this.h.getCid());
        } else {
            list2 = null;
        }
        if (list2 != null) {
            Iterator<Comment> it2 = list.iterator();
            while (it2.hasNext()) {
                Comment next = it2.next();
                if (next != null && list2.contains(next)) {
                    it2.remove();
                }
            }
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f36429a, false, 27361, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f36429a, false, 27361, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        a.a((Context) com.ss.android.ugc.aweme.framework.core.a.b().a(), (Throwable) exc);
        if (this.g != null) {
            this.g.a(0);
        }
    }

    public final void c(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, f36429a, false, 27363, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, f36429a, false, 27363, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        a.a((Context) com.ss.android.ugc.aweme.framework.core.a.b().a(), (Throwable) exc);
        if (this.g != null) {
            this.g.a(1);
        }
    }

    private boolean b(int i2) {
        List list;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f36429a, false, 27366, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f36429a, false, 27366, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        }
        if (this.i != null) {
            list = this.i.b(this.h.getCid());
        } else {
            list = null;
        }
        if (list == null || this.h.isHasMore() || this.h.getExpandSize() >= list.size()) {
            return true;
        }
        int min = Math.min(this.h.getExpandSize() + i2, list.size());
        if (this.f36430b != null) {
            this.f36430b.a(f(), list.subList(this.h.getExpandSize(), min));
        }
        this.h.setExpandSize(min);
        if (this.g != null) {
            if (this.h.getExpandSize() >= list.size()) {
                this.g.a(2);
            } else {
                this.g.a(1);
            }
        }
        return false;
    }

    public final void a(com.ss.android.ugc.aweme.comment.g.c cVar) {
        com.ss.android.ugc.aweme.comment.g.c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, f36429a, false, 27354, new Class[]{com.ss.android.ugc.aweme.comment.g.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, f36429a, false, 27354, new Class[]{com.ss.android.ugc.aweme.comment.g.c.class}, Void.TYPE);
            return;
        }
        this.i = cVar2;
        ((k) i()).f36414f = cVar2;
    }

    public final void a(CommentReplyButtonStruct commentReplyButtonStruct, CommentReplyButtonViewHolder commentReplyButtonViewHolder) {
        if (PatchProxy.isSupport(new Object[]{commentReplyButtonStruct, commentReplyButtonViewHolder}, this, f36429a, false, 27355, new Class[]{CommentReplyButtonStruct.class, CommentReplyButtonViewHolder.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{commentReplyButtonStruct, commentReplyButtonViewHolder}, this, f36429a, false, 27355, new Class[]{CommentReplyButtonStruct.class, CommentReplyButtonViewHolder.class}, Void.TYPE);
        } else if (commentReplyButtonStruct != null && commentReplyButtonViewHolder != null) {
            this.h = commentReplyButtonStruct;
            this.g = commentReplyButtonViewHolder;
            if (commentReplyButtonStruct.getButtonStatus() == 0) {
                if (b(3)) {
                    a(1, commentReplyButtonStruct.getCommentId(), commentReplyButtonStruct.getTopIds(), this.j);
                }
            } else if (commentReplyButtonStruct.getButtonStatus() == 1) {
                if (b(10)) {
                    a(4, commentReplyButtonStruct.getCommentId(), commentReplyButtonStruct.getTopIds(), Long.valueOf(commentReplyButtonStruct.getCursor()), this.j);
                }
            } else if (commentReplyButtonStruct.getButtonStatus() == 2) {
                if (!(this.f36430b == null || this.h == null || this.i == null)) {
                    List b2 = this.i.b(this.h.getCid());
                    if (b2 != null && this.h.getTopSize() >= 0 && this.h.getTopSize() <= b2.size()) {
                        this.f36430b.b(f(), b2.subList(this.h.getTopSize(), b2.size()));
                        this.h.setExpandSize(this.h.getTopSize());
                    }
                }
                if (this.g != null) {
                    this.g.a(0);
                }
            }
        }
    }

    public final void b(List<Comment> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f36429a, false, 27357, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f36429a, false, 27357, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        boolean isHasMore = ((k) this.f2978e).isHasMore();
        if (this.h != null) {
            a(list);
            this.h.setReplyCommentTotal(((k) this.f2978e).a());
            this.h.setCursor(((CommentItemList) ((k) i()).getData()).cursor);
            this.h.addExpandSize(list.size());
            if (!isHasMore || ((k) this.f2978e).a() <= this.h.getExpandSize()) {
                isHasMore = false;
            } else {
                isHasMore = true;
            }
            this.h.setHasMore(isHasMore);
        }
        if (this.f36430b != null) {
            this.f36430b.a(f(), list);
        }
        if (this.g != null) {
            if (isHasMore) {
                this.g.a(1);
                return;
            }
            this.g.a(2);
        }
    }

    public final void a(List<Comment> list, boolean z) {
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f36429a, false, 27356, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, f36429a, false, 27356, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        boolean isHasMore = ((k) this.f2978e).isHasMore();
        if (this.h != null) {
            a(list);
            this.h.setReplyCommentTotal(((k) this.f2978e).a());
            this.h.setCursor(((CommentItemList) ((k) i()).getData()).cursor);
            this.h.addExpandSize(list.size());
            if (!isHasMore || ((k) this.f2978e).a() <= this.h.getExpandSize()) {
                isHasMore = false;
            } else {
                isHasMore = true;
            }
            this.h.setHasMore(isHasMore);
        }
        if (this.f36430b != null) {
            this.f36430b.a(f(), list);
        }
        if (this.g != null) {
            if (isHasMore) {
                this.g.a(1);
                return;
            }
            this.g.a(2);
        }
    }
}
