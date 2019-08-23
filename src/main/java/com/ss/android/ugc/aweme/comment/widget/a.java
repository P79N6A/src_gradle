package com.ss.android.ugc.aweme.comment.widget;

import android.app.Activity;
import android.arch.lifecycle.LifecycleOwner;
import android.arch.lifecycle.Observer;
import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.comment.b.e;
import com.ss.android.ugc.aweme.comment.g.b;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.ui.CommentTranslationStatusView;
import com.ss.android.ugc.aweme.comment.ui.h;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.language.I18nManagerService;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import java.util.List;

public class a implements Observer<e> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36653a;

    /* renamed from: b  reason: collision with root package name */
    private Context f36654b;

    /* renamed from: c  reason: collision with root package name */
    private h f36655c;

    /* renamed from: d  reason: collision with root package name */
    private h f36656d;

    /* renamed from: e  reason: collision with root package name */
    private Comment f36657e;

    /* renamed from: f  reason: collision with root package name */
    private CommentTranslationStatusView f36658f;
    private com.ss.android.ugc.aweme.comment.h g = com.ss.android.ugc.aweme.comment.h.a();

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f36653a, false, 27851, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36653a, false, 27851, new Class[0], Void.TYPE);
        } else if (this.f36657e != null) {
            this.g.a(this.f36657e);
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f36653a, false, 27850, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36653a, false, 27850, new Class[0], Void.TYPE);
        } else if (this.f36657e != null) {
            com.ss.android.ugc.aweme.translation.model.a a2 = a(this.f36657e, ((I18nManagerService) ServiceManager.get().getService(I18nManagerService.class)).getAppLanguage());
            if (a2 != null) {
                this.g.a(this.f36657e, a2, this.f36658f);
            }
        }
    }

    public a(Context context) {
        this.f36654b = context;
    }

    public /* synthetic */ void onChanged(@Nullable Object obj) {
        e eVar = (e) obj;
        if (PatchProxy.isSupport(new Object[]{eVar}, this, f36653a, false, 27856, new Class[]{e.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{eVar}, this, f36653a, false, 27856, new Class[]{e.class}, Void.TYPE);
        } else if (eVar != null && eVar.f36379a != null) {
            Activity a2 = v.a(this.f36654b);
            if (a2 != null && !a2.isFinishing()) {
                Comment comment = eVar.f36379a;
                if (eVar.f36380b) {
                    if (PatchProxy.isSupport(new Object[]{comment}, this, f36653a, false, 27854, new Class[]{Comment.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{comment}, this, f36653a, false, 27854, new Class[]{Comment.class}, Void.TYPE);
                    } else {
                        this.f36658f.setLoading(false);
                        this.f36655c.a(comment.getDisplayText(), comment.getDisplayTextExtra());
                        List<Comment> replyComments = comment.getReplyComments();
                        if (comment.getCommentType() == 0 && this.f36656d != null && !CollectionUtils.isEmpty(replyComments)) {
                            Comment comment2 = replyComments.get(0);
                            this.f36656d.a(comment2.getDisplayText(), comment2.getDisplayTextExtra());
                        }
                    }
                } else {
                    Exception exc = eVar.f36381c;
                    if (PatchProxy.isSupport(new Object[]{exc}, this, f36653a, false, 27855, new Class[]{Exception.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{exc}, this, f36653a, false, 27855, new Class[]{Exception.class}, Void.TYPE);
                        return;
                    }
                    this.f36658f.setLoading(false);
                    if (exc != null) {
                        com.ss.android.ugc.aweme.app.api.a.a.a(this.f36654b, (Throwable) exc);
                    }
                }
            }
        }
    }

    private String a(Comment comment) {
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{comment2}, this, f36653a, false, 27853, new Class[]{Comment.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{comment2}, this, f36653a, false, 27853, new Class[]{Comment.class}, String.class);
        }
        String displayText = comment2.getDisplayText(false);
        if (TextUtils.isEmpty(displayText)) {
            return "";
        }
        boolean[] zArr = new boolean[displayText.length()];
        for (TextExtraStruct next : comment.getTextExtra()) {
            for (int max = Math.max(0, next.getStart()); max < Math.min(displayText.length(), next.getEnd()); max++) {
                zArr[max] = true;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < displayText.length(); i++) {
            if (!zArr[i]) {
                sb.append(displayText.charAt(i));
            }
        }
        return b.a(sb.toString().trim());
    }

    private com.ss.android.ugc.aweme.translation.model.a a(Comment comment, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{comment, str2}, this, f36653a, false, 27852, new Class[]{Comment.class, String.class}, com.ss.android.ugc.aweme.translation.model.a.class)) {
            return (com.ss.android.ugc.aweme.translation.model.a) PatchProxy.accessDispatch(new Object[]{comment, str2}, this, f36653a, false, 27852, new Class[]{Comment.class, String.class}, com.ss.android.ugc.aweme.translation.model.a.class);
        }
        com.ss.android.ugc.aweme.translation.model.a aVar = new com.ss.android.ugc.aweme.translation.model.a();
        String a2 = a(comment);
        if (TextUtils.isEmpty(a2)) {
            return null;
        }
        aVar.a(a2);
        if (comment.getCommentType() == 0 && !CollectionUtils.isEmpty(comment.getReplyComments())) {
            aVar.a(a(comment.getReplyComments().get(0)));
        }
        aVar.f74971c = str2;
        return aVar;
    }

    public final void a(Context context, Comment comment, h hVar, h hVar2, CommentTranslationStatusView commentTranslationStatusView) {
        Context context2 = context;
        Comment comment2 = comment;
        h hVar3 = hVar;
        h hVar4 = hVar2;
        CommentTranslationStatusView commentTranslationStatusView2 = commentTranslationStatusView;
        if (PatchProxy.isSupport(new Object[]{context2, comment2, hVar3, hVar4, commentTranslationStatusView2}, this, f36653a, false, 27849, new Class[]{Context.class, Comment.class, h.class, h.class, CommentTranslationStatusView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context2, comment2, hVar3, hVar4, commentTranslationStatusView2}, this, f36653a, false, 27849, new Class[]{Context.class, Comment.class, h.class, h.class, CommentTranslationStatusView.class}, Void.TYPE);
        } else if (comment2 == null || comment.isTranslated() || !com.ss.android.g.a.a() || commentTranslationStatusView2 == null) {
            if (commentTranslationStatusView2 != null) {
                commentTranslationStatusView2.setVisibility(8);
            }
        } else {
            if (this.f36657e != null) {
                this.g.a(this.f36657e.getCid()).removeObserver(this);
            }
            this.f36654b = context2;
            this.f36657e = comment2;
            this.f36655c = hVar3;
            this.f36656d = hVar4;
            this.f36658f = commentTranslationStatusView2;
            LifecycleOwner a2 = this.f36655c.a();
            if (a2 == null) {
                this.g.a(this.f36657e.getCid()).a(this, false);
            } else {
                this.g.a(this.f36657e.getCid()).a(a2, this, false);
            }
            this.f36658f.setLoading(this.g.b(this.f36657e));
            this.g.b(this.f36657e);
        }
    }
}
