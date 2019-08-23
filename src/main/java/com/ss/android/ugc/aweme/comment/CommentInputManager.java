package com.ss.android.ugc.aweme.comment;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.common.utility.collection.CollectionUtils;
import com.bytedance.ies.dmt.ui.input.emoji.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.NetworkUtils;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.comment.e.j;
import com.ss.android.ugc.aweme.comment.e.o;
import com.ss.android.ugc.aweme.comment.f;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.ui.KeyboardDialogFragment;
import com.ss.android.ugc.aweme.discover.hitrank.f;
import com.ss.android.ugc.aweme.feed.am;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ImageInfo;
import com.ss.android.ugc.aweme.forward.d.i;
import com.ss.android.ugc.aweme.forward.d.l;
import com.ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.ss.android.ugc.aweme.friends.ui.SummonFriendActivity;
import com.ss.android.ugc.aweme.im.service.model.c;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.d.ae;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.story.profile.view.AllStoryActivity;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class CommentInputManager implements AmeSSActivity.a, o, KeyboardDialogFragment.a, KeyboardDialogFragment.b, l {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f36248a;

    /* renamed from: b  reason: collision with root package name */
    public Fragment f36249b;

    /* renamed from: c  reason: collision with root package name */
    b f36250c;

    /* renamed from: d  reason: collision with root package name */
    public HashSet<User> f36251d = new HashSet<>();

    /* renamed from: e  reason: collision with root package name */
    public j f36252e;

    /* renamed from: f  reason: collision with root package name */
    public i f36253f;
    public int g;
    boolean h;
    public int i = 1;
    @FakeEditTextState
    public int j = 0;
    private MentionEditText k;
    private String l;
    private boolean m;
    private int n;
    private View.OnClickListener o;

    public @interface FakeEditTextState {
    }

    public interface b {
        void a(int i, int i2, String str);

        void a(Comment comment);

        void a(Exception exc, int i, Comment comment);

        void a(String str);

        void a(String str, int i);

        void b(Comment comment);

        void b(boolean z);

        void c(boolean z);

        void d(boolean z);

        void e(boolean z);

        boolean f();

        boolean g();

        Aweme getCommentInputAweme();

        Comment getCommentInputReplyComment();

        int getCommentInputViewType();

        String getEventType();

        boolean h();

        void onEvent(com.ss.android.ugc.aweme.forward.c.a aVar);
    }

    public interface a {
        void a();

        void b();

        void c();

        void d();

        void e();

        void f();

        void g();

        void h();

        void i();
    }

    public final void a(MentionEditText mentionEditText, View view, View view2, String str, String str2) {
        MentionEditText mentionEditText2 = mentionEditText;
        View view3 = view;
        View view4 = view2;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{mentionEditText2, view3, view4, str3, str4}, this, f36248a, false, 27083, new Class[]{MentionEditText.class, View.class, View.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{mentionEditText2, view3, view4, str3, str4}, this, f36248a, false, 27083, new Class[]{MentionEditText.class, View.class, View.class, String.class, String.class}, Void.TYPE);
            return;
        }
        this.k = mentionEditText2;
        if (this.f36249b != null && this.k != null) {
            if (this.f36249b.getContext() != null) {
                this.k.setMentionTextColor(ContextCompat.getColor(this.f36249b.getContext(), C0906R.color.zm));
            }
            this.o = new b(this, str4, str3);
            this.k.setOnClickListener(this.o);
            this.k.setFocusable(false);
            this.k.setFocusableInTouchMode(false);
            this.k.setInputType(0);
            if (TimeLockRuler.isTeenModeON()) {
                view3.setVisibility(8);
            }
            view3.setOnClickListener(new c(this, str4, str3));
            if (TimeLockRuler.isTeenModeON()) {
                view4.setVisibility(8);
            }
            view4.setOnClickListener(new d(this, str4, str3, mentionEditText2));
            a();
        }
    }

    public final void a(boolean z, boolean z2, boolean z3, a aVar) {
        final a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Byte.valueOf(z3 ? (byte) 1 : 0), aVar2}, this, f36248a, false, 27084, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z), Byte.valueOf(z2), Byte.valueOf(z3), aVar2}, this, f36248a, false, 27084, new Class[]{Boolean.TYPE, Boolean.TYPE, Boolean.TYPE, a.class}, Void.TYPE);
        } else if (k() && this.f36250c.getCommentInputAweme() != null) {
            boolean Z = AbTestManager.a().Z();
            boolean isShowForwardEntrance = this.f36250c.getCommentInputAweme().isShowForwardEntrance();
            final ArrayList arrayList = new ArrayList();
            if (!Z) {
                arrayList.add(this.f36249b.getString(C0906R.string.bz7));
            }
            if (!z) {
                if (isShowForwardEntrance && (com.ss.android.g.a.a() || m())) {
                    arrayList.add(this.f36249b.getString(C0906R.string.ahe));
                }
                if (SharePrefCache.inst().getImCommentForwardEnabled()) {
                    arrayList.add(this.f36249b.getString(C0906R.string.a5n));
                }
                arrayList.add(this.f36249b.getString(C0906R.string.a25));
                if (AbTestManager.a().aN() && com.ss.android.g.a.a()) {
                    if (z3) {
                        arrayList.add(this.f36249b.getString(C0906R.string.we));
                    } else {
                        arrayList.add(this.f36249b.getString(C0906R.string.w5));
                    }
                }
                arrayList.add(this.f36249b.getString(C0906R.string.bzd));
            } else {
                arrayList.add(this.f36249b.getString(C0906R.string.a25));
            }
            if (z2 || z) {
                arrayList.add(this.f36249b.getString(C0906R.string.a4f));
            }
            com.ss.android.ugc.aweme.common.ui.a aVar3 = new com.ss.android.ugc.aweme.common.ui.a(this.f36249b.getActivity());
            aVar3.a((CharSequence[]) arrayList.toArray(new String[arrayList.size()]), (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f36254a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f36254a, false, 27127, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f36254a, false, 27127, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    } else if (CommentInputManager.this.f36249b != null) {
                        dialogInterface.dismiss();
                        String str = (String) arrayList.get(i);
                        if (TextUtils.equals(str, CommentInputManager.this.f36249b.getString(C0906R.string.bz7))) {
                            if (TimeLockRuler.isTeenModeON()) {
                                com.bytedance.ies.dmt.ui.d.a.c(d.a(), (int) C0906R.string.ci0).a();
                            } else {
                                aVar2.b();
                            }
                        } else if (TextUtils.equals(str, CommentInputManager.this.f36249b.getString(C0906R.string.bzd))) {
                            aVar2.d();
                        } else if (TextUtils.equals(str, CommentInputManager.this.f36249b.getString(C0906R.string.a4f))) {
                            aVar2.a();
                        } else if (TextUtils.equals(str, CommentInputManager.this.f36249b.getString(C0906R.string.ahe))) {
                            if (TimeLockRuler.isTeenModeON()) {
                                com.bytedance.ies.dmt.ui.d.a.c(d.a(), (int) C0906R.string.ci1).a();
                            } else {
                                aVar2.c();
                            }
                        } else if (TextUtils.equals(str, CommentInputManager.this.f36249b.getString(C0906R.string.a5n))) {
                            if (TimeLockRuler.isTeenModeON()) {
                                com.bytedance.ies.dmt.ui.d.a.c(d.a(), (int) C0906R.string.chx).a();
                            } else {
                                aVar2.f();
                            }
                        } else if (TextUtils.equals(str, CommentInputManager.this.f36249b.getString(C0906R.string.a25))) {
                            aVar2.e();
                        } else if (TextUtils.equals(str, CommentInputManager.this.f36249b.getString(C0906R.string.we))) {
                            aVar2.h();
                        } else {
                            if (TextUtils.equals(str, CommentInputManager.this.f36249b.getString(C0906R.string.w5))) {
                                aVar2.i();
                            }
                        }
                    }
                }
            });
            aVar3.a((DialogInterface.OnCancelListener) new DialogInterface.OnCancelListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f36258a;

                public final void onCancel(DialogInterface dialogInterface) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f36258a, false, 27128, new Class[]{DialogInterface.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f36258a, false, 27128, new Class[]{DialogInterface.class}, Void.TYPE);
                        return;
                    }
                    aVar2.g();
                }
            });
            aVar3.b();
        }
    }

    public final void a(Comment comment, String str) {
        UrlModel urlModel;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{comment, str2}, this, f36248a, false, 27085, new Class[]{Comment.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment, str2}, this, f36248a, false, 27085, new Class[]{Comment.class, String.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[0], this, f36248a, false, 27086, new Class[0], UrlModel.class)) {
            urlModel = (UrlModel) PatchProxy.accessDispatch(new Object[0], this, f36248a, false, 27086, new Class[0], UrlModel.class);
        } else if (this.f36250c.getCommentInputAweme().getAwemeType() == 2) {
            List<ImageInfo> imageInfos = this.f36250c.getCommentInputAweme().getImageInfos();
            urlModel = !CollectionUtils.isEmpty(imageInfos) ? imageInfos.get(0).getLabelThumb() : null;
        } else {
            urlModel = this.f36250c.getCommentInputAweme().getVideo().getCover();
        }
        if (urlModel != null) {
            Context context = this.f36249b.getContext();
            String aid = this.f36250c.getCommentInputAweme().getAid();
            int awemeType = this.f36250c.getCommentInputAweme().getAwemeType();
            String authorUid = this.f36250c.getCommentInputAweme().getAuthorUid();
            if (PatchProxy.isSupport(new Object[]{context, comment, urlModel, aid, Integer.valueOf(awemeType), authorUid, str2}, null, com.ss.android.ugc.aweme.im.b.f50051a, true, 50038, new Class[]{Context.class, Comment.class, UrlModel.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{context, comment, urlModel, aid, Integer.valueOf(awemeType), authorUid, str2}, null, com.ss.android.ugc.aweme.im.b.f50051a, true, 50038, new Class[]{Context.class, Comment.class, UrlModel.class, String.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
                return;
            }
            c cVar = new c();
            cVar.f52872a = urlModel;
            cVar.h = com.ss.android.ugc.aweme.im.b.a(comment.getUser());
            cVar.f52874c = aid;
            cVar.g = comment.getText();
            cVar.f52873b = comment.getCid();
            cVar.f52877f = awemeType;
            cVar.f52875d = authorUid;
            cVar.f52876e = str2;
            com.ss.android.ugc.aweme.im.b.a().commentReply(context, cVar);
        }
    }

    public final void a(User user) {
        KeyboardDialogFragment keyboardDialogFragment;
        User user2 = user;
        if (PatchProxy.isSupport(new Object[]{user2}, this, f36248a, false, 27091, new Class[]{User.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{user2}, this, f36248a, false, 27091, new Class[]{User.class}, Void.TYPE);
        } else if (k()) {
            int l2 = l();
            int commentInputViewType = this.f36250c.getCommentInputViewType();
            boolean f2 = f();
            if (PatchProxy.isSupport(new Object[]{user2, Integer.valueOf(l2), (byte) 1, Integer.valueOf(commentInputViewType), Byte.valueOf(f2 ? (byte) 1 : 0)}, null, KeyboardDialogFragment.f36508b, true, 27540, new Class[]{User.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Boolean.TYPE}, KeyboardDialogFragment.class)) {
                keyboardDialogFragment = (KeyboardDialogFragment) PatchProxy.accessDispatch(new Object[]{user2, Integer.valueOf(l2), (byte) 1, Integer.valueOf(commentInputViewType), Byte.valueOf(f2)}, null, KeyboardDialogFragment.f36508b, true, 27540, new Class[]{User.class, Integer.TYPE, Boolean.TYPE, Integer.TYPE, Boolean.TYPE}, KeyboardDialogFragment.class);
            } else {
                KeyboardDialogFragment a2 = KeyboardDialogFragment.a(commentInputViewType, f2);
                Bundle arguments = a2.getArguments();
                if (arguments != null) {
                    arguments.putSerializable(AllStoryActivity.f73306b, user2);
                    arguments.putInt("maxLength", l2);
                    arguments.putBoolean("showAt", true);
                }
                keyboardDialogFragment = a2;
            }
            keyboardDialogFragment.f36510c = this;
            keyboardDialogFragment.f36511d = this;
            keyboardDialogFragment.a(m());
            keyboardDialogFragment.b(n());
            try {
                keyboardDialogFragment.show(this.f36249b.getChildFragmentManager(), "input");
            } catch (IllegalStateException unused) {
            }
        }
    }

    public final void a(CharSequence charSequence) {
        if (PatchProxy.isSupport(new Object[]{charSequence}, this, f36248a, false, 27096, new Class[]{CharSequence.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence}, this, f36248a, false, 27096, new Class[]{CharSequence.class}, Void.TYPE);
            return;
        }
        if (this.k != null) {
            this.k.setHint(charSequence);
        }
    }

    public final void a(CharSequence charSequence, List<TextExtraStruct> list, boolean z) {
        String str;
        int i2;
        String str2;
        String str3;
        String str4;
        i iVar;
        String str5;
        int i3;
        boolean z2 = z;
        if (PatchProxy.isSupport(new Object[]{charSequence, list, Byte.valueOf(z ? (byte) 1 : 0)}, this, f36248a, false, 27098, new Class[]{CharSequence.class, List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{charSequence, list, Byte.valueOf(z)}, this, f36248a, false, 27098, new Class[]{CharSequence.class, List.class, Boolean.TYPE}, Void.TYPE);
        } else if (k()) {
            if (!NetworkUtils.isNetworkAvailable(this.f36249b.getContext())) {
                UIUtils.displayToast(this.f36249b.getContext(), (int) C0906R.string.bgf);
            } else if (com.ss.android.ugc.aweme.setting.d.b(this.f36250c.getCommentInputAweme())) {
                com.ss.android.ugc.aweme.setting.d.a(this.f36249b.getContext(), C0906R.string.v2, this.f36249b.getString(C0906R.string.v1));
            } else if (!com.ss.android.ugc.aweme.setting.d.a(this.f36250c.getCommentInputAweme())) {
                com.ss.android.ugc.aweme.setting.d.a(this.f36249b.getContext(), C0906R.string.vg, this.f36249b.getString(C0906R.string.vf));
            } else if (charSequence.length() > b(z2)) {
                com.bytedance.ies.dmt.ui.d.a.c(this.f36249b.getContext(), (int) C0906R.string.lw).a();
            } else {
                if (z2) {
                    this.g = 3;
                } else if (this.f36250c.getCommentInputReplyComment() != null) {
                    this.g = 2;
                } else {
                    this.g = 1;
                }
                this.f36250c.a(this.g, g.a(charSequence.toString()), charSequence.toString());
                if (z2) {
                    Aweme commentInputAweme = this.f36250c.getCommentInputAweme();
                    String o2 = o();
                    if (commentInputAweme == null || commentInputAweme.getAwemeType() != 13) {
                        str2 = o2;
                        i2 = 1;
                        str = null;
                    } else {
                        String aid = commentInputAweme.getAid();
                        str2 = commentInputAweme.getForwardItem() != null ? commentInputAweme.getForwardItem().getAid() : commentInputAweme.getForwardItemId();
                        str = aid;
                        i2 = 2;
                    }
                    Comment commentInputReplyComment = this.f36250c.getCommentInputReplyComment();
                    if (commentInputReplyComment == null) {
                        this.f36253f.f48288c = this.i == 2 ? 1 : 0;
                        str4 = null;
                        str3 = null;
                    } else {
                        if (commentInputReplyComment.getCommentType() == 2) {
                            String replyId = commentInputReplyComment.getReplyId();
                            String cid = commentInputReplyComment.getCid();
                            iVar = this.f36253f;
                            str3 = cid;
                            str5 = replyId;
                            i3 = 2;
                        } else {
                            str5 = commentInputReplyComment.getCid();
                            iVar = this.f36253f;
                            i3 = this.i == 2 ? 2 : 0;
                            str3 = null;
                        }
                        iVar.f48288c = i3;
                        str4 = str5;
                    }
                    this.f36253f.b(charSequence.toString(), str2, Integer.valueOf(i2), str, str4, list, str3);
                    return;
                }
                if (this.f36250c.getCommentInputReplyComment() != null) {
                    Comment commentInputReplyComment2 = this.f36250c.getCommentInputReplyComment();
                    if (commentInputReplyComment2.getCommentType() == 2) {
                        this.f36252e.f36428c = 2;
                        j jVar = this.f36252e;
                        Object[] objArr = new Object[6];
                        objArr[0] = o();
                        objArr[1] = charSequence.toString();
                        objArr[2] = commentInputReplyComment2.getReplyId();
                        objArr[3] = list;
                        objArr[4] = commentInputReplyComment2.getCid();
                        objArr[5] = this.f36250c != null ? this.f36250c.getEventType() : "";
                        jVar.b(objArr);
                    } else {
                        this.f36252e.f36428c = this.i == 2 ? 2 : 0;
                        j jVar2 = this.f36252e;
                        Object[] objArr2 = new Object[5];
                        objArr2[0] = o();
                        objArr2[1] = charSequence.toString();
                        objArr2[2] = commentInputReplyComment2.getCid();
                        objArr2[3] = list;
                        objArr2[4] = this.f36250c != null ? this.f36250c.getEventType() : "";
                        jVar2.b(objArr2);
                    }
                } else {
                    this.f36252e.f36428c = this.i == 2 ? 1 : 0;
                    j jVar3 = this.f36252e;
                    Object[] objArr3 = new Object[4];
                    objArr3[0] = o();
                    objArr3[1] = charSequence.toString();
                    objArr3[2] = list;
                    objArr3[3] = this.f36250c != null ? this.f36250c.getEventType() : "";
                    jVar3.b(objArr3);
                }
            }
        }
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f36248a, false, 27101, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f36248a, false, 27101, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.f36250c.e(z);
    }

    public final void a(String str, int i2) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i2)}, this, f36248a, false, 27102, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i2)}, this, f36248a, false, 27102, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f36250c != null) {
            this.f36250c.a(str, i2);
        }
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f36248a, false, 27103, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f36248a, false, 27103, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (this.f36250c != null) {
            this.f36250c.a(str);
        }
    }

    public final void a(final Exception exc, Comment comment) {
        if (PatchProxy.isSupport(new Object[]{exc, comment}, this, f36248a, false, 27110, new Class[]{Exception.class, Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, comment}, this, f36248a, false, 27110, new Class[]{Exception.class, Comment.class}, Void.TYPE);
            return;
        }
        if (k() && com.ss.android.ugc.aweme.captcha.c.b.a(exc)) {
            com.ss.android.ugc.aweme.captcha.c.b.a(this.f36249b.getChildFragmentManager(), (com.ss.android.ugc.aweme.base.api.a.b.a) exc, new com.ss.android.ugc.aweme.captcha.b() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f36261a;

                public final void a() {
                    if (PatchProxy.isSupport(new Object[0], this, f36261a, false, 27129, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f36261a, false, 27129, new Class[0], Void.TYPE);
                    } else if (CommentInputManager.this.g == 3) {
                        CommentInputManager.this.f36253f.a();
                    } else {
                        CommentInputManager.this.f36252e.a();
                    }
                }

                public final void b() {
                    int i;
                    if (PatchProxy.isSupport(new Object[0], this, f36261a, false, 27130, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f36261a, false, 27130, new Class[0], Void.TYPE);
                        return;
                    }
                    Context context = CommentInputManager.this.f36249b.getContext();
                    Exception exc = exc;
                    if (CommentInputManager.this.g == 3) {
                        i = C0906R.string.ahn;
                    } else {
                        i = C0906R.string.v7;
                    }
                    com.ss.android.ugc.aweme.comment.api.a.a(context, exc, i);
                }
            });
        }
        if (this.f36250c != null) {
            this.f36250c.a(exc, this.g, comment);
        }
    }

    public final void a(ForwardDetail forwardDetail) {
        ForwardDetail forwardDetail2 = forwardDetail;
        if (PatchProxy.isSupport(new Object[]{forwardDetail2}, this, f36248a, false, 27115, new Class[]{ForwardDetail.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{forwardDetail2}, this, f36248a, false, 27115, new Class[]{ForwardDetail.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.forward.c.a aVar = new com.ss.android.ugc.aweme.forward.c.a(1);
        aVar.f48268b = forwardDetail2;
        aVar.f48272f = this.n;
        if (this.f36250c != null) {
            Aweme commentInputAweme = this.f36250c.getCommentInputAweme();
            if (PatchProxy.isSupport(new Object[]{commentInputAweme}, aVar, com.ss.android.ugc.aweme.forward.c.a.f48267a, false, 45365, new Class[]{Aweme.class}, Void.TYPE)) {
                Object[] objArr = {commentInputAweme};
                com.ss.android.ugc.aweme.forward.c.a aVar2 = aVar;
                PatchProxy.accessDispatch(objArr, aVar2, com.ss.android.ugc.aweme.forward.c.a.f48267a, false, 45365, new Class[]{Aweme.class}, Void.TYPE);
            } else {
                aVar.f48270d = commentInputAweme;
                if (commentInputAweme != null) {
                    aVar.f48269c = commentInputAweme.getAid();
                }
            }
            f.f42393c.a(this.f36250c.getCommentInputAweme(), 3);
        }
        if (this.f36250c == null || this.f36250c.h()) {
            bg.a(aVar);
        } else {
            this.f36250c.onEvent(aVar);
        }
        if (forwardDetail.getComment() != null) {
            bg.a(new com.ss.android.ugc.aweme.comment.b.c(forwardDetail.getLabelInfo(), forwardDetail.getComment().getAwemeId()));
        }
    }

    private String o() {
        if (PatchProxy.isSupport(new Object[0], this, f36248a, false, 27118, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f36248a, false, 27118, new Class[0], String.class);
        } else if (this.f36250c == null || this.f36250c.getCommentInputAweme() == null) {
            return "";
        } else {
            return this.f36250c.getCommentInputAweme().getAid();
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f36248a, false, 27081, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36248a, false, 27081, new Class[0], Void.TYPE);
            return;
        }
        c(0);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f36248a, false, 27082, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36248a, false, 27082, new Class[0], Void.TYPE);
            return;
        }
        c(1);
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f36248a, false, 27089, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36248a, false, 27089, new Class[0], Void.TYPE);
        } else if (k()) {
            a();
            a((Parcelable) null, (CharSequence) this.l, false);
        }
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f36248a, false, 27094, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f36248a, false, 27094, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f36250c.getCommentInputAweme() != null && this.f36250c.getCommentInputAweme().isShowForwardEntrance()) {
            z = true;
        }
        return z;
    }

    public final void g() {
        if (PatchProxy.isSupport(new Object[0], this, f36248a, false, 27095, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36248a, false, 27095, new Class[0], Void.TYPE);
        } else if (k()) {
            KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) this.f36249b.getChildFragmentManager().findFragmentByTag("input");
            if (keyboardDialogFragment != null) {
                try {
                    keyboardDialogFragment.d();
                } catch (IllegalStateException unused) {
                }
            }
        }
    }

    public final void h() {
        if (PatchProxy.isSupport(new Object[0], this, f36248a, false, 27105, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36248a, false, 27105, new Class[0], Void.TYPE);
            return;
        }
        this.f36250c.b(this.h);
        this.h = false;
    }

    public final void i() {
        if (PatchProxy.isSupport(new Object[0], this, f36248a, false, 27107, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36248a, false, 27107, new Class[0], Void.TYPE);
            return;
        }
        if (this.k != null) {
            this.k.setText("");
            this.k.setHint(this.l);
        }
        this.f36251d.clear();
    }

    public final void j() {
        if (PatchProxy.isSupport(new Object[0], this, f36248a, false, 27116, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36248a, false, 27116, new Class[0], Void.TYPE);
            return;
        }
        this.f36249b = null;
        this.f36252e.j();
        this.f36252e.k();
    }

    /* access modifiers changed from: package-private */
    public boolean k() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f36248a, false, 27117, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f36248a, false, 27117, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (this.f36249b != null && this.f36249b.isAdded()) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public int l() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f36248a, false, 27120, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f36248a, false, 27120, new Class[0], Integer.TYPE)).intValue();
        }
        if (this.f36250c.getCommentInputViewType() == 4) {
            z = true;
        }
        return b(z);
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f36248a, false, 27122, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f36248a, false, 27122, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Aweme commentInputAweme = this.f36250c.getCommentInputAweme();
        if (commentInputAweme != null && commentInputAweme.getAwemeControl().canForward()) {
            z = true;
        }
        return z;
    }

    /* access modifiers changed from: package-private */
    public boolean n() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f36248a, false, 27123, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f36248a, false, 27123, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Aweme commentInputAweme = this.f36250c.getCommentInputAweme();
        if (commentInputAweme != null && commentInputAweme.getAwemeControl().canComment()) {
            z = true;
        }
        return z;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f36248a, false, 27080, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f36248a, false, 27080, new Class[0], Void.TYPE);
        } else if (k()) {
            if (this.f36250c == null) {
                this.l = this.f36249b.getResources().getString(C0906R.string.vd);
            } else if (!com.ss.android.g.a.a() && TimeLockRuler.isTeenModeON()) {
                this.l = this.f36249b.getResources().getString(C0906R.string.chv);
            } else if (com.ss.android.ugc.aweme.setting.d.b(this.f36250c.getCommentInputAweme())) {
                this.l = this.f36249b.getResources().getString(C0906R.string.v1);
            } else if (!com.ss.android.ugc.aweme.setting.d.a(this.f36250c.getCommentInputAweme())) {
                this.l = this.f36249b.getResources().getString(C0906R.string.vf);
            } else {
                int commentInputViewType = this.f36250c.getCommentInputViewType();
                if (commentInputViewType == 2) {
                    this.l = this.f36249b.getResources().getString(C0906R.string.vd);
                } else if (commentInputViewType != 4) {
                    this.l = this.f36249b.getResources().getString(C0906R.string.vd);
                } else {
                    this.l = this.f36249b.getResources().getString(C0906R.string.ahf);
                }
            }
            if (this.k != null) {
                this.k.setHint(this.l);
            }
        }
    }

    public final boolean d() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f36248a, false, 27088, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f36248a, false, 27088, new Class[0], Boolean.TYPE)).booleanValue();
        }
        Aweme commentInputAweme = this.f36250c.getCommentInputAweme();
        if (PatchProxy.isSupport(new Object[]{commentInputAweme}, null, com.ss.android.ugc.aweme.commercialize.utils.c.f39774a, true, 32315, new Class[]{Aweme.class}, Boolean.TYPE)) {
            z = ((Boolean) PatchProxy.accessDispatch(new Object[]{commentInputAweme}, null, com.ss.android.ugc.aweme.commercialize.utils.c.f39774a, true, 32315, new Class[]{Aweme.class}, Boolean.TYPE)).booleanValue();
        } else if (commentInputAweme == null || !commentInputAweme.isCmtSwt()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            com.bytedance.ies.dmt.ui.d.a.c(d.a(), (int) C0906R.string.c1).a();
            return true;
        } else if (!this.f36250c.f() || com.ss.android.ugc.aweme.setting.d.b(this.f36250c.getCommentInputAweme()) || !com.ss.android.ugc.aweme.setting.d.a(this.f36250c.getCommentInputAweme()) || am.b(this.f36250c.getCommentInputAweme()) || TimeLockRuler.isTeenModeON()) {
            return true;
        } else {
            return false;
        }
    }

    private void c(@FakeEditTextState int i2) {
        this.j = i2;
        if (this.k != null) {
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f36248a, false, 27099, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f36248a, false, 27099, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        d(i2);
    }

    private int b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f36248a, false, 27121, new Class[]{Boolean.TYPE}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f36248a, false, 27121, new Class[]{Boolean.TYPE}, Integer.TYPE)).intValue();
        } else if (z) {
            return 60;
        } else {
            if (com.ss.android.g.a.a()) {
                return 150;
            }
            return 100;
        }
    }

    public final void a(Comment comment) {
        if (PatchProxy.isSupport(new Object[]{comment}, this, f36248a, false, 27087, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment}, this, f36248a, false, 27087, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        String str = d.a().getResources().getString(C0906R.string.a26, new Object[]{ae.a(comment.getUser())}) + comment.getText();
        ClipboardManager clipboardManager = (ClipboardManager) d.a().getSystemService("clipboard");
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText("copy_label", str));
        }
    }

    public final void c(Comment comment) {
        if (PatchProxy.isSupport(new Object[]{comment}, this, f36248a, false, 27109, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment}, this, f36248a, false, 27109, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        g();
        if (this.f36250c != null) {
            this.f36250c.b(comment);
        }
    }

    public final void e(Comment comment) {
        if (PatchProxy.isSupport(new Object[]{comment}, this, f36248a, false, 27113, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment}, this, f36248a, false, 27113, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        c(comment);
    }

    private void d(int i2) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f36248a, false, 27104, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f36248a, false, 27104, new Class[]{Integer.TYPE}, Void.TYPE);
        } else if (k() && this.f36250c.g()) {
            if (i2 < 5) {
                z = true;
            }
            this.m = z;
            if (this.m) {
                if (this.f36249b.getActivity() != null && (this.f36249b.getActivity() instanceof AmeSSActivity)) {
                    ((AmeSSActivity) this.f36249b.getActivity()).setOnActivityResultListener(this);
                }
                Intent intent = new Intent(this.f36249b.getContext(), SummonFriendActivity.class);
                intent.putExtra("video_id", o());
                intent.putExtra("source", 1);
                if (this.f36249b.getActivity() != null) {
                    this.f36249b.getActivity().startActivityForResult(intent, 111);
                }
            } else if (this.f36249b.getContext() != null) {
                UIUtils.displayToast(this.f36249b.getContext(), (int) C0906R.string.bar);
            }
            this.f36250c.d(this.m);
        }
    }

    public final void b(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f36248a, false, 27100, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f36248a, false, 27100, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        d(i2);
    }

    public final void b(Comment comment) {
        Comment comment2 = comment;
        if (PatchProxy.isSupport(new Object[]{comment2}, this, f36248a, false, 27097, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment2}, this, f36248a, false, 27097, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        f fVar = f.f36433c;
        if (PatchProxy.isSupport(new Object[]{comment2}, fVar, f.f36431a, false, 27138, new Class[]{Comment.class}, Void.TYPE)) {
            Object[] objArr = {comment2};
            f fVar2 = fVar;
            PatchProxy.accessDispatch(objArr, fVar2, f.f36431a, false, 27138, new Class[]{Comment.class}, Void.TYPE);
        } else {
            Intrinsics.checkParameterIsNotNull(comment2, "comment");
            f.a aVar = f.f36432b.get(comment.getFakeId());
            if (aVar != null) {
                aVar.f36435b = 3;
            } else {
                Map<String, f.a> map = f.f36432b;
                String fakeId = comment.getFakeId();
                Intrinsics.checkExpressionValueIsNotNull(fakeId, "comment.fakeId");
                f.a aVar2 = new f.a(3, null, 0, null, 0, null, 62);
                map.put(fakeId, aVar2);
            }
        }
        if (f.f36433c.j(comment2) == 3) {
            this.f36253f.a(f.f36433c.i(comment2));
        } else {
            this.f36252e.a(f.f36433c.i(comment2));
        }
    }

    public final void d(Comment comment) {
        if (PatchProxy.isSupport(new Object[]{comment}, this, f36248a, false, 27111, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment}, this, f36248a, false, 27111, new Class[]{Comment.class}, Void.TYPE);
            return;
        }
        if (this.f36250c != null) {
            if (PatchProxy.isSupport(new Object[]{comment}, this, f36248a, false, 27112, new Class[]{Comment.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{comment}, this, f36248a, false, 27112, new Class[]{Comment.class}, Void.TYPE);
            } else if (comment != null) {
                h a2 = h.a();
                Comment b2 = a2.b(comment.getCid());
                if (b2 != null) {
                    comment.setText(b2.getForwardText());
                    comment.setTextExtra(b2.getTextExtra());
                }
                List<Comment> replyComments = comment.getReplyComments();
                if (!CollectionUtils.isEmpty(replyComments)) {
                    for (Comment comment2 : replyComments) {
                        Comment b3 = a2.b(comment2.getCid());
                        if (b3 != null) {
                            comment2.setText(b3.getForwardText());
                            comment2.setTextExtra(b3.getTextExtra());
                        }
                    }
                }
            }
            this.f36250c.a(comment);
            com.ss.android.ugc.aweme.discover.hitrank.f.f42393c.a(this.f36250c.getCommentInputAweme(), 2);
        }
        if (comment != null) {
            bg.a(new com.ss.android.ugc.aweme.comment.b.c(comment.getLabelInfo(), comment.getAwemeId()));
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0113  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.os.Parcelable r19) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f36248a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Parcelable> r1 = android.os.Parcelable.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 27106(0x69e2, float:3.7984E-41)
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f36248a
            r3 = 0
            r4 = 27106(0x69e2, float:3.7984E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.os.Parcelable> r1 = android.os.Parcelable.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0036:
            com.ss.android.ugc.aweme.views.mention.MentionEditText r0 = r7.k
            if (r0 == 0) goto L_0x0044
            com.ss.android.ugc.aweme.views.mention.MentionEditText r0 = r7.k
            r0.onRestoreInstanceState(r8)
            com.ss.android.ugc.aweme.views.mention.MentionEditText r0 = r7.k
            com.bytedance.ies.dmt.ui.input.emoji.g.a((android.widget.TextView) r0)
        L_0x0044:
            boolean r0 = r7.m
            if (r0 != 0) goto L_0x0061
            com.ss.android.ugc.aweme.views.mention.MentionEditText r0 = r7.k
            if (r0 == 0) goto L_0x0057
            com.ss.android.ugc.aweme.views.mention.MentionEditText r0 = r7.k
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            goto L_0x0059
        L_0x0057:
            java.lang.String r0 = ""
        L_0x0059:
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0061
            r8 = 1
            goto L_0x0062
        L_0x0061:
            r8 = 0
        L_0x0062:
            com.ss.android.ugc.aweme.comment.CommentInputManager$b r0 = r7.f36250c
            r0.c(r8)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f36248a
            r3 = 0
            r4 = 27108(0x69e4, float:3.7986E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x008c
            java.lang.Object[] r0 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r2 = f36248a
            r3 = 0
            r4 = 27108(0x69e4, float:3.7986E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r18
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0111
        L_0x008c:
            boolean r0 = r18.k()
            if (r0 == 0) goto L_0x0111
            android.support.v4.app.Fragment r0 = r7.f36249b
            android.support.v4.app.FragmentManager r0 = r0.getChildFragmentManager()
            java.lang.String r1 = "input"
            android.support.v4.app.Fragment r0 = r0.findFragmentByTag(r1)
            com.ss.android.ugc.aweme.comment.ui.KeyboardDialogFragment r0 = (com.ss.android.ugc.aweme.comment.ui.KeyboardDialogFragment) r0
            if (r0 == 0) goto L_0x0111
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.comment.ui.KeyboardDialogFragment.f36508b
            r14 = 0
            r15 = 27554(0x6ba2, float:3.8611E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.views.mention.MentionEditText$c[]> r17 = com.ss.android.ugc.aweme.views.mention.MentionEditText.c[].class
            r12 = r0
            r16 = r1
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16, r17)
            if (r1 == 0) goto L_0x00cb
            java.lang.Object[] r11 = new java.lang.Object[r10]
            com.meituan.robust.ChangeQuickRedirect r13 = com.ss.android.ugc.aweme.comment.ui.KeyboardDialogFragment.f36508b
            r14 = 0
            r15 = 27554(0x6ba2, float:3.8611E-41)
            java.lang.Class[] r1 = new java.lang.Class[r10]
            java.lang.Class<com.ss.android.ugc.aweme.views.mention.MentionEditText$c[]> r17 = com.ss.android.ugc.aweme.views.mention.MentionEditText.c[].class
            r12 = r0
            r16 = r1
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r11, r12, r13, r14, r15, r16, r17)
            com.ss.android.ugc.aweme.views.mention.MentionEditText$c[] r0 = (com.ss.android.ugc.aweme.views.mention.MentionEditText.c[]) r0
            goto L_0x00d7
        L_0x00cb:
            com.ss.android.ugc.aweme.views.mention.MentionEditText r1 = r0.mEditText
            if (r1 == 0) goto L_0x00d6
            com.ss.android.ugc.aweme.views.mention.MentionEditText r0 = r0.mEditText
            com.ss.android.ugc.aweme.views.mention.MentionEditText$c[] r0 = r0.getMentionText()
            goto L_0x00d7
        L_0x00d6:
            r0 = 0
        L_0x00d7:
            if (r0 == 0) goto L_0x010c
            int r1 = r0.length
            if (r1 != 0) goto L_0x00dd
            goto L_0x010c
        L_0x00dd:
            java.util.HashSet<com.ss.android.ugc.aweme.profile.model.User> r1 = r7.f36251d
            java.util.Iterator r1 = r1.iterator()
        L_0x00e3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0111
            java.lang.Object r2 = r1.next()
            com.ss.android.ugc.aweme.profile.model.User r2 = (com.ss.android.ugc.aweme.profile.model.User) r2
            int r3 = r0.length
            r4 = 0
            r5 = 0
        L_0x00f2:
            if (r4 >= r3) goto L_0x0106
            r6 = r0[r4]
            java.lang.String r11 = r2.getUid()
            java.lang.String r6 = r6.f76502b
            boolean r6 = android.text.TextUtils.equals(r11, r6)
            if (r6 == 0) goto L_0x0103
            r5 = 1
        L_0x0103:
            int r4 = r4 + 1
            goto L_0x00f2
        L_0x0106:
            if (r5 != 0) goto L_0x00e3
            r1.remove()
            goto L_0x00e3
        L_0x010c:
            java.util.HashSet<com.ss.android.ugc.aweme.profile.model.User> r0 = r7.f36251d
            r0.clear()
        L_0x0111:
            if (r8 == 0) goto L_0x0116
            r18.i()
        L_0x0116:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.comment.CommentInputManager.a(android.os.Parcelable):void");
    }

    public final void b(Exception exc, Comment comment) {
        if (PatchProxy.isSupport(new Object[]{exc, comment}, this, f36248a, false, 27114, new Class[]{Exception.class, Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, comment}, this, f36248a, false, 27114, new Class[]{Exception.class, Comment.class}, Void.TYPE);
            return;
        }
        a(exc, comment);
    }

    public CommentInputManager(Fragment fragment, int i2, b bVar) {
        if (fragment != null) {
            this.f36249b = fragment;
            this.f36250c = bVar;
            this.f36252e = new j();
            this.f36252e.a(this);
            this.f36253f = new i();
            this.f36253f.a(this);
            this.n = i2;
            this.l = this.f36249b.getResources().getString(C0906R.string.vd);
            return;
        }
        throw new RuntimeException("CommentInputManager 传一个空fragment/service，脑子有问题！");
    }

    public final void a(int i2, int i3, Intent intent) {
        final User user;
        Intent intent2 = intent;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f36248a, false, 27119, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), intent2}, this, f36248a, false, 27119, new Class[]{Integer.TYPE, Integer.TYPE, Intent.class}, Void.TYPE);
            return;
        }
        if (k() && i2 == 111) {
            this.m = false;
            KeyboardDialogFragment keyboardDialogFragment = (KeyboardDialogFragment) this.f36249b.getChildFragmentManager().findFragmentByTag("input");
            if (keyboardDialogFragment != null) {
                keyboardDialogFragment.i = true;
            }
            if (intent2 != null) {
                user = (User) intent2.getSerializableExtra("extra_data");
            } else {
                user = null;
            }
            if (user != null) {
                this.f36251d.add(user);
                if (keyboardDialogFragment == null) {
                    new Handler().post(new Runnable() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f36264a;

                        public final void run() {
                            KeyboardDialogFragment keyboardDialogFragment;
                            KeyboardDialogFragment keyboardDialogFragment2;
                            if (PatchProxy.isSupport(new Object[0], this, f36264a, false, 27131, new Class[0], Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[0], this, f36264a, false, 27131, new Class[0], Void.TYPE);
                                return;
                            }
                            if (CommentInputManager.this.f36251d.isEmpty()) {
                                CommentInputManager commentInputManager = CommentInputManager.this;
                                User user = user;
                                if (PatchProxy.isSupport(new Object[]{user}, commentInputManager, CommentInputManager.f36248a, false, 27092, new Class[]{User.class}, Void.TYPE)) {
                                    CommentInputManager commentInputManager2 = commentInputManager;
                                    PatchProxy.accessDispatch(new Object[]{user}, commentInputManager2, CommentInputManager.f36248a, false, 27092, new Class[]{User.class}, Void.TYPE);
                                } else {
                                    if (commentInputManager.k()) {
                                        int l = commentInputManager.l();
                                        int commentInputViewType = commentInputManager.f36250c.getCommentInputViewType();
                                        boolean f2 = commentInputManager.f();
                                        if (PatchProxy.isSupport(new Object[]{user, Integer.valueOf(l), Integer.valueOf(commentInputViewType), Byte.valueOf(f2 ? (byte) 1 : 0)}, null, KeyboardDialogFragment.f36508b, true, 27541, new Class[]{User.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, KeyboardDialogFragment.class)) {
                                            keyboardDialogFragment2 = (KeyboardDialogFragment) PatchProxy.accessDispatch(new Object[]{user, Integer.valueOf(l), Integer.valueOf(commentInputViewType), Byte.valueOf(f2)}, null, KeyboardDialogFragment.f36508b, true, 27541, new Class[]{User.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, KeyboardDialogFragment.class);
                                        } else {
                                            keyboardDialogFragment2 = KeyboardDialogFragment.a(commentInputViewType, f2);
                                            Bundle arguments = keyboardDialogFragment2.getArguments();
                                            if (arguments != null) {
                                                arguments.putSerializable("atUser", user);
                                                arguments.putInt("maxLength", l);
                                                arguments.putBoolean("showAt", true);
                                            }
                                        }
                                        keyboardDialogFragment2.f36510c = commentInputManager;
                                        keyboardDialogFragment2.f36511d = commentInputManager;
                                        keyboardDialogFragment2.a(commentInputManager.m());
                                        keyboardDialogFragment2.b(commentInputManager.n());
                                        try {
                                            keyboardDialogFragment2.show(commentInputManager.f36249b.getChildFragmentManager(), "input");
                                        } catch (IllegalStateException unused) {
                                        }
                                    }
                                }
                            } else {
                                CommentInputManager commentInputManager3 = CommentInputManager.this;
                                HashSet<User> hashSet = CommentInputManager.this.f36251d;
                                if (PatchProxy.isSupport(new Object[]{hashSet}, commentInputManager3, CommentInputManager.f36248a, false, 27093, new Class[]{HashSet.class}, Void.TYPE)) {
                                    Object[] objArr = {hashSet};
                                    CommentInputManager commentInputManager4 = commentInputManager3;
                                    PatchProxy.accessDispatch(objArr, commentInputManager4, CommentInputManager.f36248a, false, 27093, new Class[]{HashSet.class}, Void.TYPE);
                                } else if (commentInputManager3.k()) {
                                    int l2 = commentInputManager3.l();
                                    int commentInputViewType2 = commentInputManager3.f36250c.getCommentInputViewType();
                                    boolean f3 = commentInputManager3.f();
                                    if (PatchProxy.isSupport(new Object[]{hashSet, Integer.valueOf(l2), Integer.valueOf(commentInputViewType2), Byte.valueOf(f3 ? (byte) 1 : 0)}, null, KeyboardDialogFragment.f36508b, true, 27542, new Class[]{HashSet.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, KeyboardDialogFragment.class)) {
                                        keyboardDialogFragment = (KeyboardDialogFragment) PatchProxy.accessDispatch(new Object[]{hashSet, Integer.valueOf(l2), Integer.valueOf(commentInputViewType2), Byte.valueOf(f3)}, null, KeyboardDialogFragment.f36508b, true, 27542, new Class[]{HashSet.class, Integer.TYPE, Integer.TYPE, Boolean.TYPE}, KeyboardDialogFragment.class);
                                    } else {
                                        keyboardDialogFragment = KeyboardDialogFragment.a(commentInputViewType2, f3);
                                        Bundle arguments2 = keyboardDialogFragment.getArguments();
                                        if (arguments2 != null) {
                                            arguments2.putSerializable("atUserSet", hashSet);
                                            arguments2.putInt("maxLength", l2);
                                            arguments2.putBoolean("showAt", true);
                                        }
                                    }
                                    keyboardDialogFragment.f36510c = commentInputManager3;
                                    keyboardDialogFragment.f36511d = commentInputManager3;
                                    keyboardDialogFragment.a(commentInputManager3.m());
                                    keyboardDialogFragment.b(commentInputManager3.n());
                                    try {
                                        keyboardDialogFragment.show(commentInputManager3.f36249b.getChildFragmentManager(), "input");
                                    } catch (IllegalStateException unused2) {
                                    }
                                }
                            }
                        }
                    });
                } else if (!keyboardDialogFragment.a(ae.b(user), user.getUid()) && this.f36249b.getContext() != null) {
                    UIUtils.displayToast(this.f36249b.getContext(), (int) C0906R.string.em);
                }
            }
        }
    }

    public final void a(Parcelable parcelable, CharSequence charSequence, boolean z) {
        if (PatchProxy.isSupport(new Object[]{parcelable, charSequence, Byte.valueOf(z ? (byte) 1 : 0)}, this, f36248a, false, 27090, new Class[]{Parcelable.class, CharSequence.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{parcelable, charSequence, Byte.valueOf(z)}, this, f36248a, false, 27090, new Class[]{Parcelable.class, CharSequence.class, Boolean.TYPE}, Void.TYPE);
        } else if (k()) {
            KeyboardDialogFragment a2 = KeyboardDialogFragment.a(parcelable, charSequence, l(), true, this.f36250c.getCommentInputViewType(), f(), z);
            a2.f36510c = this;
            a2.f36511d = this;
            a2.a(m());
            a2.b(n());
            try {
                a2.show(this.f36249b.getChildFragmentManager(), "input");
            } catch (IllegalStateException unused) {
            }
        }
    }
}
