package com.ss.android.ugc.aweme.translation;

import com.bytedance.common.utility.collection.CollectionUtils;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.q;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.comment.b.e;
import com.ss.android.ugc.aweme.comment.h;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.translation.api.TranslationApi;
import com.ss.android.ugc.aweme.translation.model.a;
import com.ss.android.ugc.aweme.translation.model.d;
import java.util.ArrayList;
import java.util.List;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74961a;

    /* renamed from: b  reason: collision with root package name */
    public Comment f74962b;

    /* renamed from: c  reason: collision with root package name */
    private a f74963c;

    public final void run() {
        q qVar;
        if (PatchProxy.isSupport(new Object[0], this, f74961a, false, 87283, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f74961a, false, 87283, new Class[0], Void.TYPE);
            return;
        }
        Gson gson = new Gson();
        try {
            String str = this.f74963c.f74971c;
            String json = gson.toJson((Object) this.f74963c.f74970b);
            if (PatchProxy.isSupport(new Object[]{str, json}, null, TranslationApi.f74959a, true, 87291, new Class[]{String.class, String.class}, q.class)) {
                qVar = (q) PatchProxy.accessDispatch(new Object[]{str, json}, null, TranslationApi.f74959a, true, 87291, new Class[]{String.class, String.class}, q.class);
            } else {
                qVar = TranslationApi.a().getMultiTranslation(str, json);
            }
            l.a(qVar, new k<com.ss.android.ugc.aweme.translation.model.b>() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f74964a;

                public final void onFailure(Throwable th) {
                    Throwable th2 = th;
                    if (PatchProxy.isSupport(new Object[]{th2}, this, f74964a, false, 87288, new Class[]{Throwable.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{th2}, this, f74964a, false, 87288, new Class[]{Throwable.class}, Void.TYPE);
                        return;
                    }
                    b.this.a(th2);
                }

                public final /* synthetic */ void onSuccess(Object obj) {
                    com.ss.android.ugc.aweme.translation.model.b bVar = (com.ss.android.ugc.aweme.translation.model.b) obj;
                    if (PatchProxy.isSupport(new Object[]{bVar}, this, f74964a, false, 87287, new Class[]{com.ss.android.ugc.aweme.translation.model.b.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{bVar}, this, f74964a, false, 87287, new Class[]{com.ss.android.ugc.aweme.translation.model.b.class}, Void.TYPE);
                        return;
                    }
                    List<d> list = bVar.f74974a;
                    if (!CollectionUtils.isEmpty(list)) {
                        b.this.a(list.get(0), false);
                        if (list.size() > 1) {
                            b.this.a(list.get(1), true);
                        }
                        b.this.f74962b.setTranslated(true);
                        h.a().a(b.this.f74962b, false);
                        h a2 = h.a();
                        Comment comment = b.this.f74962b;
                        if (PatchProxy.isSupport(new Object[]{comment}, a2, h.f36462a, false, 27166, new Class[]{Comment.class}, Void.TYPE)) {
                            h hVar = a2;
                            PatchProxy.accessDispatch(new Object[]{comment}, hVar, h.f36462a, false, 27166, new Class[]{Comment.class}, Void.TYPE);
                        } else if (comment != null) {
                            Comment clone = comment.clone();
                            a2.f36464b.put(comment.getCid(), clone);
                            if (comment.getCommentType() == 0 && !CollectionUtils.isEmpty(clone.getReplyComments())) {
                                Comment comment2 = clone.getReplyComments().get(0);
                                a2.f36464b.put(comment2.getCid(), comment2);
                            }
                        }
                        h.a().a(b.this.f74962b.getCid()).setValue(new e(b.this.f74962b, true, null));
                    }
                }
            }, com.ss.android.ugc.aweme.base.k.f34752b);
        } catch (Exception unused) {
            a(new Exception());
        }
    }

    public final void a(Throwable th) {
        if (PatchProxy.isSupport(new Object[]{th}, this, f74961a, false, 87284, new Class[]{Throwable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{th}, this, f74961a, false, 87284, new Class[]{Throwable.class}, Void.TYPE);
            return;
        }
        h.a().a(this.f74962b, false);
        e eVar = new e(this.f74962b, false, null);
        if (th instanceof Exception) {
            eVar.f36381c = (Exception) th;
        }
        h.a().a(this.f74962b.getCid()).setValue(eVar);
    }

    public b(Comment comment, a aVar) {
        this.f74962b = comment;
        this.f74963c = aVar;
    }

    public final void a(d dVar, boolean z) {
        String b2;
        d dVar2 = dVar;
        if (PatchProxy.isSupport(new Object[]{dVar2, Byte.valueOf(z ? (byte) 1 : 0)}, this, f74961a, false, 87285, new Class[]{d.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dVar2, Byte.valueOf(z)}, this, f74961a, false, 87285, new Class[]{d.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        sb.append(b2 + " ");
        Comment comment = this.f74962b;
        if (z) {
            List<Comment> replyComments = this.f74962b.getReplyComments();
            if (CollectionUtils.isEmpty(replyComments)) {
                a(new Exception());
            } else {
                comment = replyComments.get(0);
            }
        }
        for (int i = 0; i < comment.getTextExtra().size(); i++) {
            TextExtraStruct textExtraStruct = comment.getTextExtra().get(i);
            int min = Math.min(Math.max(textExtraStruct.getStart(), 0), comment.getForwardText().length());
            int min2 = Math.min(textExtraStruct.getEnd(), comment.getForwardText().length());
            String str = comment.getForwardText().substring(min, min2) + " ";
            sb.append(str);
            TextExtraStruct clone = textExtraStruct.clone();
            int length = str.length();
            if (i == 0) {
                clone.setStart(b2.length());
            } else {
                clone.setStart(((TextExtraStruct) arrayList.get(i - 1)).getEnd() + 1);
            }
            clone.setEnd(clone.getStart() + length);
            arrayList.add(clone);
        }
        String sb2 = sb.toString();
        if (PatchProxy.isSupport(new Object[]{sb2, arrayList, Byte.valueOf(z)}, this, f74961a, false, 87286, new Class[]{String.class, List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{sb2, arrayList, Byte.valueOf(z)}, this, f74961a, false, 87286, new Class[]{String.class, List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Comment comment2 = this.f74962b;
        if (z && !CollectionUtils.isEmpty(this.f74962b.getReplyComments())) {
            comment2 = this.f74962b.getReplyComments().get(0);
        }
        comment2.setText(sb2);
        comment2.setTextExtra(arrayList);
    }
}
