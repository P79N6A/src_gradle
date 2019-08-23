package com.ss.android.ugc.aweme.comment;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.arch.widgets.base.b;
import com.ss.android.ugc.aweme.base.livedata.a;
import com.ss.android.ugc.aweme.comment.b.e;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.ui.CommentTranslationStatusView;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36462a;

    /* renamed from: c  reason: collision with root package name */
    private static h f36463c;

    /* renamed from: b  reason: collision with root package name */
    public HashMap<String, Comment> f36464b = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private Set<String> f36465d = new HashSet();

    /* renamed from: e  reason: collision with root package name */
    private HashMap<String, Comment> f36466e = new HashMap<>();

    private h() {
    }

    public static h a() {
        if (PatchProxy.isSupport(new Object[0], null, f36462a, true, 27159, new Class[0], h.class)) {
            return (h) PatchProxy.accessDispatch(new Object[0], null, f36462a, true, 27159, new Class[0], h.class);
        }
        if (f36463c == null) {
            synchronized (h.class) {
                if (f36463c == null) {
                    f36463c = new h();
                }
            }
        }
        return f36463c;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f36462a, false, 27168, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36462a, false, 27168, new Class[0], Void.TYPE);
            return;
        }
        this.f36464b.clear();
        this.f36466e.clear();
    }

    public final b<e> a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f36462a, false, 27163, new Class[]{String.class}, b.class)) {
            return a.a().a(str2, e.class);
        }
        return (b) PatchProxy.accessDispatch(new Object[]{str2}, this, f36462a, false, 27163, new Class[]{String.class}, b.class);
    }

    public final Comment b(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f36462a, false, 27167, new Class[]{String.class}, Comment.class)) {
            return this.f36464b.get(str2);
        }
        return (Comment) PatchProxy.accessDispatch(new Object[]{str2}, this, f36462a, false, 27167, new Class[]{String.class}, Comment.class);
    }

    public final boolean b(Comment comment) {
        if (!PatchProxy.isSupport(new Object[]{comment}, this, f36462a, false, 27164, new Class[]{Comment.class}, Boolean.TYPE)) {
            return this.f36465d.contains(comment.getCid());
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{comment}, this, f36462a, false, 27164, new Class[]{Comment.class}, Boolean.TYPE)).booleanValue();
    }

    public final void a(Comment comment) {
        if (PatchProxy.isSupport(new Object[]{comment}, this, f36462a, false, 27161, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment}, this, f36462a, false, 27161, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        a(comment, this.f36466e.get(comment.getCid()), false);
        a().a(comment.getCid()).setValue(new e(comment, true, null));
    }

    public final void a(Comment comment, boolean z) {
        if (PatchProxy.isSupport(new Object[]{comment, Byte.valueOf(z ? (byte) 1 : 0)}, this, f36462a, false, 27165, new Class[]{Comment.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment, Byte.valueOf(z)}, this, f36462a, false, 27165, new Class[]{Comment.class, Boolean.TYPE}, Void.TYPE);
        } else if (z) {
            this.f36465d.add(comment.getCid());
        } else {
            this.f36465d.remove(comment.getCid());
        }
    }

    private void a(Comment comment, Comment comment2, boolean z) {
        Comment comment3 = comment;
        Comment comment4 = comment2;
        while (true) {
            if (!PatchProxy.isSupport(new Object[]{comment3, comment4, Byte.valueOf(z ? (byte) 1 : 0)}, this, f36462a, false, 27162, new Class[]{Comment.class, Comment.class, Boolean.TYPE}, Void.TYPE)) {
                if (comment3 != null && comment4 != null) {
                    comment3.setTranslated(z);
                    comment3.setText(comment4.getText());
                    comment3.setTextExtra(comment4.getTextExtra());
                    if (comment3.getCommentType() != 0 || CollectionUtils.isEmpty(comment3.getReplyComments()) || CollectionUtils.isEmpty(comment4.getReplyComments())) {
                        break;
                    }
                    comment3 = comment3.getReplyComments().get(0);
                    comment4 = comment4.getReplyComments().get(0);
                } else {
                    break;
                }
            } else {
                PatchProxy.accessDispatch(new Object[]{comment3, comment4, Byte.valueOf(z)}, this, f36462a, false, 27162, new Class[]{Comment.class, Comment.class, Boolean.TYPE}, Void.TYPE);
                return;
            }
        }
    }

    public final void a(Comment comment, com.ss.android.ugc.aweme.translation.model.a aVar, CommentTranslationStatusView commentTranslationStatusView) {
        Comment comment2 = comment;
        com.ss.android.ugc.aweme.translation.model.a aVar2 = aVar;
        CommentTranslationStatusView commentTranslationStatusView2 = commentTranslationStatusView;
        if (PatchProxy.isSupport(new Object[]{comment2, aVar2, commentTranslationStatusView2}, this, f36462a, false, 27160, new Class[]{Comment.class, com.ss.android.ugc.aweme.translation.model.a.class, CommentTranslationStatusView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment2, aVar2, commentTranslationStatusView2}, this, f36462a, false, 27160, new Class[]{Comment.class, com.ss.android.ugc.aweme.translation.model.a.class, CommentTranslationStatusView.class}, Void.TYPE);
            return;
        }
        Comment b2 = b(comment.getCid());
        if (b2 != null) {
            a(comment2, b2, true);
            a().a(comment.getCid()).setValue(new e(comment2, true, null));
            return;
        }
        a(comment2, true);
        this.f36466e.put(comment.getCid(), comment.clone());
        commentTranslationStatusView2.setLoading(true);
        com.ss.android.b.a.a.a.a(new com.ss.android.ugc.aweme.translation.b(comment2, aVar2));
    }
}
