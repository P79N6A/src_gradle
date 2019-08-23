package com.ss.android.ugc.aweme.comment.ui;

import android.app.Dialog;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.AppCompatCheckBox;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.d;
import com.ss.android.ugc.aweme.base.livedata.SlideData;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.comment.CommentInputManager;
import com.ss.android.ugc.aweme.comment.e;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.common.ui.BaseDialogFragment;
import com.ss.android.ugc.aweme.detail.ui.FadeImageView;
import com.ss.android.ugc.aweme.feed.am;
import com.ss.android.ugc.aweme.feed.f.aa;
import com.ss.android.ugc.aweme.feed.f.ar;
import com.ss.android.ugc.aweme.feed.f.i;
import com.ss.android.ugc.aweme.feed.h.o;
import com.ss.android.ugc.aweme.feed.h.p;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.model.TextExtraStruct;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.shortvideo.util.an;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.views.mention.MentionEditText;
import java.util.Iterator;
import java.util.List;
import org.greenrobot.eventbus.Subscribe;

public class CommentInputFragment extends BaseDialogFragment implements CommentInputManager.b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2849a;

    /* renamed from: b  reason: collision with root package name */
    public p f2850b;

    /* renamed from: c  reason: collision with root package name */
    public a f2851c;

    /* renamed from: d  reason: collision with root package name */
    public b f2852d;

    /* renamed from: e  reason: collision with root package name */
    public String f2853e;

    /* renamed from: f  reason: collision with root package name */
    private CommentInputManager f2854f;
    private boolean g;
    private boolean h;
    private DialogInterface.OnKeyListener i = new DialogInterface.OnKeyListener() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f36480a;

        /* renamed from: c  reason: collision with root package name */
        private boolean f36482c;

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            int i2 = i;
            KeyEvent keyEvent2 = keyEvent;
            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent2}, this, f36480a, false, 27473, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i), keyEvent2}, this, f36480a, false, 27473, new Class[]{DialogInterface.class, Integer.TYPE, KeyEvent.class}, Boolean.TYPE)).booleanValue();
            } else if (!CommentInputFragment.this.isAdded()) {
                return false;
            } else {
                if (i2 == 25 || i2 == 24) {
                    if (keyEvent.getAction() == 0) {
                        return CommentInputFragment.this.getActivity().onKeyDown(i2, keyEvent2);
                    }
                    return false;
                } else if (keyEvent.getAction() == 0) {
                    this.f36482c = true;
                    return false;
                } else if (4 != i2 || !this.f36482c) {
                    return false;
                } else {
                    CommentInputFragment.this.a(10);
                    this.f36482c = false;
                    return true;
                }
            }
        }
    };
    @BindView(2131493133)
    FadeImageView ivAt;
    @BindView(2131495019)
    FadeImageView ivEmoji;
    @BindView(2131493502)
    AppCompatCheckBox mCbForward;
    @BindView(2131493631)
    MentionEditText mEditCommentView;
    @BindView(2131494081)
    View mEditContainerView;
    @BindView(2131493733)
    View mLayout;
    @BindView(2131493646)
    ImageView mSendCommentView;
    @BindView(2131497436)
    View tabDivider;

    public interface a extends aa<ar> {
        void a(int i);

        Aweme b();

        String f();
    }

    public interface b {
        void a(boolean z);
    }

    public final void b(Comment comment) {
    }

    public Comment getCommentInputReplyComment() {
        return null;
    }

    public int getCommentInputViewType() {
        return 1;
    }

    public final boolean h() {
        if (!PatchProxy.isSupport(new Object[0], this, f2849a, false, 27469, new Class[0], Boolean.TYPE)) {
            return e.a(this);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2849a, false, 27469, new Class[0], Boolean.TYPE)).booleanValue();
    }

    public final void a(boolean z) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2849a, false, 27441, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2849a, false, 27441, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (this.mLayout == null) {
            this.h = z;
        } else {
            this.mLayout.setAlpha(z ? 0.0f : 1.0f);
            View view = this.mLayout;
            if (z) {
                i2 = 4;
            }
            view.setVisibility(i2);
            this.mLayout.post(new c(this, z));
        }
    }

    public final void a(String str, int i2) {
        String authorUid;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i2)}, this, f2849a, false, 27463, new Class[]{String.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i2)}, this, f2849a, false, 27463, new Class[]{String.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        Aweme j = j();
        String str3 = this.f2853e;
        String aid = j == null ? "" : j.getAid();
        if (j == null) {
            authorUid = "";
        } else {
            authorUid = j.getAuthorUid();
        }
        com.ss.android.ugc.aweme.comment.f.a.a(str2, i2, str3, aid, authorUid);
    }

    public final void a(String str) {
        String str2;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{str3}, this, f2849a, false, 27464, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3}, this, f2849a, false, 27464, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Aweme j = j();
        String str4 = this.f2853e;
        String aid = j == null ? "" : j.getAid();
        if (j == null) {
            str2 = "";
        } else {
            str2 = j.getAuthorUid();
        }
        com.ss.android.ugc.aweme.comment.f.a.a(str3, str4, aid, str2);
    }

    private Aweme j() {
        if (PatchProxy.isSupport(new Object[0], this, f2849a, false, 27465, new Class[0], Aweme.class)) {
            return (Aweme) PatchProxy.accessDispatch(new Object[0], this, f2849a, false, 27465, new Class[0], Aweme.class);
        } else if (this.f2851c != null) {
            return this.f2851c.b();
        } else {
            return null;
        }
    }

    private String l() {
        if (PatchProxy.isSupport(new Object[0], this, f2849a, false, 27468, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f2849a, false, 27468, new Class[0], String.class);
        } else if (this.f2851c == null || this.f2851c.b() == null) {
            return "";
        } else {
            return this.f2851c.b().getAid();
        }
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f2849a, false, 27436, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2849a, false, 27436, new Class[0], Void.TYPE);
        } else if (this.mEditCommentView != null) {
            c();
            if (this.f2854f != null) {
                this.f2854f.a();
                this.f2854f.i();
            }
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f2849a, false, 27438, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2849a, false, 27438, new Class[0], Void.TYPE);
            return;
        }
        if (i() && this.f2854f != null) {
            this.f2854f.g();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f2849a, false, 27439, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2849a, false, 27439, new Class[0], Void.TYPE);
            return;
        }
        this.g = true;
        if (this.mLayout != null) {
            this.mLayout.setVisibility(4);
            this.mLayout.setEnabled(false);
        }
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f2849a, false, 27440, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2849a, false, 27440, new Class[0], Void.TYPE);
            return;
        }
        this.g = false;
        if (this.mLayout != null) {
            this.mLayout.setVisibility(0);
            this.mLayout.setEnabled(true);
        }
    }

    public Aweme getCommentInputAweme() {
        if (!PatchProxy.isSupport(new Object[0], this, f2849a, false, 27451, new Class[0], Aweme.class)) {
            return j();
        }
        return (Aweme) PatchProxy.accessDispatch(new Object[0], this, f2849a, false, 27451, new Class[0], Aweme.class);
    }

    public String getEventType() {
        if (!PatchProxy.isSupport(new Object[0], this, f2849a, false, 27452, new Class[0], String.class)) {
            return this.f2851c.f();
        }
        return (String) PatchProxy.accessDispatch(new Object[0], this, f2849a, false, 27452, new Class[0], String.class);
    }

    public final boolean i() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f2849a, false, 27450, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2849a, false, 27450, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (super.i() && getContext() != null) {
            z = true;
        }
        return z;
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f2849a, false, 27434, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2849a, false, 27434, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        bg.d(this);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f2849a, false, 27433, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2849a, false, 27433, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        this.n = false;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f2849a, false, 27432, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2849a, false, 27432, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        b();
        a(9);
    }

    private boolean k() {
        if (PatchProxy.isSupport(new Object[0], this, f2849a, false, 27467, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2849a, false, 27467, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (this.f2851c == null || this.f2851c.b() == null) {
            return false;
        } else {
            Aweme b2 = this.f2851c.b();
            if (b2 == null || b2.getStatus() == null || b2.getStatus().getPrivateStatus() != 1 || b2.getAuthor() == null || !TextUtils.equals(b2.getAuthor().getUid(), d.a().getCurUser().getUid())) {
                return false;
            }
            return true;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2849a, false, 27437, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2849a, false, 27437, new Class[0], Void.TYPE);
        } else if (i()) {
            if (!d.a().isLogin()) {
                this.mEditCommentView.setFocusable(false);
            } else {
                this.mEditCommentView.setFocusable(true);
                this.mEditCommentView.setFocusableInTouchMode(true);
                this.mEditCommentView.requestFocus();
            }
            if (this.f2854f != null) {
                this.f2854f.a();
            }
        }
    }

    public final boolean g() {
        if (PatchProxy.isSupport(new Object[0], this, f2849a, false, 27454, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2849a, false, 27454, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!d.a().isLogin()) {
            return false;
        } else {
            Aweme j = j();
            if (j != null && !j.isCanPlay()) {
                if (j.isImage()) {
                    UIUtils.displayToast(getContext(), (int) C0906R.string.b0y);
                } else {
                    UIUtils.displayToast(getContext(), (int) C0906R.string.drx);
                }
                return false;
            } else if (!k()) {
                return true;
            } else {
                a(j);
                return false;
            }
        }
    }

    public final boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f2849a, false, 27453, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2849a, false, 27453, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!i()) {
            return false;
        } else {
            FragmentActivity activity = getActivity();
            if (activity == null || !d.a().isLogin()) {
                return false;
            }
            Aweme j = j();
            if (com.ss.android.ugc.aweme.login.utils.a.a(j)) {
                com.bytedance.ies.dmt.ui.d.a.b(getContext(), com.ss.android.ugc.aweme.login.utils.a.a(j, C0906R.string.drx)).a();
                return false;
            } else if (j != null && !j.isCanPlay()) {
                if (j.isImage()) {
                    UIUtils.displayToast(getContext(), (int) C0906R.string.b0y);
                } else {
                    UIUtils.displayToast(getContext(), (int) C0906R.string.drx);
                }
                return false;
            } else if (j != null && j.getStatus() != null && j.getStatus().isDelete()) {
                UIUtils.displayToast((Context) activity, (int) C0906R.string.dr2);
                return false;
            } else if (j != null && j.getStatus() != null && !j.getStatus().isAllowComment()) {
                UIUtils.displayToast((Context) activity, (int) C0906R.string.pg);
                return false;
            } else if (am.a(j) && !am.c(j) && (j.getAuthor() == null || !TextUtils.equals(j.getAuthor().getUid(), d.a().getCurUser().getUid()))) {
                UIUtils.displayToast((Context) activity, (int) C0906R.string.aib);
                return false;
            } else if (!k()) {
                return true;
            } else {
                a(j);
                return false;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g(boolean z) {
        f(!z);
    }

    private void a(final Aweme aweme) {
        if (PatchProxy.isSupport(new Object[]{aweme}, this, f2849a, false, 27446, new Class[]{Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aweme}, this, f2849a, false, 27446, new Class[]{Aweme.class}, Void.TYPE);
        } else if (aweme != null) {
            this.f2850b.a(aweme, 0);
            new a.C0185a(getContext()).b((int) C0906R.string.br7).b((int) C0906R.string.pm, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f36486a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f36486a, false, 27475, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f36486a, false, 27475, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    r.onEvent(new MobClick().setEventName("private_permission").setLabelName("cancel").setValue(aweme.getAid()));
                }
            }).a((int) C0906R.string.b4_, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f36483a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f36483a, false, 27474, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f36483a, false, 27474, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    CommentInputFragment.this.f2850b.a(aweme.getAid(), 1);
                    r.onEvent(new MobClick().setEventName("private_permission").setLabelName("confirm").setValue(aweme.getAid()));
                }
            }).a().a();
        }
    }

    public final void c(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2849a, false, 27456, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2849a, false, 27456, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.mLayout.setVisibility(0);
        a(9);
    }

    public final void d(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2849a, false, 27457, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2849a, false, 27457, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        r.a(getContext(), "comment_at", "click", l(), 0);
    }

    public final void e(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2849a, false, 27462, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2849a, false, 27462, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            com.ss.android.ugc.aweme.forward.e.a.b(this.f2851c.f(), j(), "detail", "click_original");
        }
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f2849a, false, 27431, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f2849a, false, 27431, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        try {
            super.onActivityCreated(bundle);
            Dialog dialog = getDialog();
            if (dialog != null) {
                Window window = dialog.getWindow();
                if (window != null) {
                    window.setLayout(-1, -2);
                }
                try {
                    dialog.setOnKeyListener(this.i);
                    dialog.setCanceledOnTouchOutside(false);
                    dialog.setCancelable(false);
                } catch (Exception e2) {
                    e = e2;
                }
            }
        } catch (Exception e3) {
            e = e3;
            com.ss.android.ugc.aweme.framework.a.a.a(e);
        }
    }

    @Subscribe
    public void onCommentEvent(com.ss.android.ugc.aweme.comment.b.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f2849a, false, 27443, new Class[]{com.ss.android.ugc.aweme.comment.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f2849a, false, 27443, new Class[]{com.ss.android.ugc.aweme.comment.b.a.class}, Void.TYPE);
            return;
        }
        if (aVar.f36370a == 8) {
            String str = (String) aVar.f36371b;
            Aweme j = j();
            if (!(j == null || j.getAid() == null || !j.getAid().equals(str) || this.f2854f == null)) {
                this.f2854f.a();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f2849a, false, 27427, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f2849a, false, 27427, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(1, C0906R.style.sn);
        this.f2854f = new CommentInputManager(this, hashCode(), this);
    }

    @Subscribe
    public void onDislikeAwemeEvent(i iVar) {
        float f2;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f2849a, false, 27444, new Class[]{i.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{iVar}, this, f2849a, false, 27444, new Class[]{i.class}, Void.TYPE);
        } else if (getActivity() != null && iVar.f45311e == getActivity().hashCode() && iVar.f45308b == 2) {
            if (iVar.f45307a) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            an.a(this.mEditContainerView, this.mEditContainerView.getAlpha(), f2);
            an.a(this.tabDivider, this.tabDivider.getAlpha(), f2);
        }
    }

    public final void a(float f2) {
        int i2;
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{Float.valueOf(f2)}, this, f2849a, false, 27442, new Class[]{Float.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Float.valueOf(f2)}, this, f2849a, false, 27442, new Class[]{Float.TYPE}, Void.TYPE);
        } else if (this.mLayout != null) {
            this.mLayout.setAlpha(f2);
            View view = this.mLayout;
            if (f2 > 0.0f) {
                i2 = 0;
            } else {
                i2 = 4;
            }
            view.setVisibility(i2);
            if (f2 <= 0.0f) {
                z = false;
            }
            f(z);
        }
    }

    public final void b(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2849a, false, 27455, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2849a, false, 27455, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        this.mLayout.setVisibility(4);
        a(8);
        if (this.f2852d != null) {
            this.f2852d.a(z);
        }
    }

    public final void f(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2849a, false, 27445, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2849a, false, 27445, new Class[]{Boolean.TYPE}, Void.TYPE);
        } else if (i()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mLayout.getLayoutParams();
            int i2 = 8;
            if (!z || this.mEditContainerView.getVisibility() != 8) {
                if (!z && this.mEditContainerView.getVisibility() == 0) {
                    this.mEditContainerView.setVisibility(8);
                    this.tabDivider.setVisibility(8);
                    marginLayoutParams.height = 1;
                    this.mLayout.setLayoutParams(marginLayoutParams);
                    c();
                }
                return;
            }
            this.mEditContainerView.setVisibility(0);
            View view = this.tabDivider;
            if (!com.ss.android.ugc.aweme.profile.a.d()) {
                i2 = 0;
            }
            v.a(view, i2);
            marginLayoutParams.height = getContext().getResources().getDimensionPixelOffset(C0906R.dimen.ev);
            if (com.ss.android.ugc.aweme.profile.a.d()) {
                marginLayoutParams.height += com.ss.android.ugc.aweme.profile.a.f61216b;
            }
            this.mLayout.setLayoutParams(marginLayoutParams);
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.forward.c.a aVar) {
        com.ss.android.ugc.aweme.forward.c.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f2849a, false, 27460, new Class[]{com.ss.android.ugc.aweme.forward.c.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f2849a, false, 27460, new Class[]{com.ss.android.ugc.aweme.forward.c.a.class}, Void.TYPE);
        } else if (!i() || getActivity() == null || aVar2 == null) {
        } else {
            if (aVar2.f48271e == 1 && aVar2.f48268b != null) {
                if (aVar2.f48272f == hashCode()) {
                    com.ss.android.ugc.aweme.forward.e.a.a(this.f2851c.f(), aVar2.f48270d, "detail", "click_comment", true);
                }
                if (i() && getActivity() != null) {
                    a();
                    com.ss.android.ugc.aweme.feed.a.a().c(l());
                }
            }
        }
    }

    public final void a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2849a, false, 27435, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2849a, false, 27435, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f2851c != null) {
            this.f2851c.a(new ar(i2));
        }
    }

    public final void a(Comment comment) {
        if (PatchProxy.isSupport(new Object[]{comment}, this, f2849a, false, 27459, new Class[]{Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{comment}, this, f2849a, false, 27459, new Class[]{Comment.class}, Void.TYPE);
        } else if (i() && getActivity() != null) {
            UIUtils.displayToast((Context) getActivity(), (int) C0906R.string.wb);
            a();
            com.ss.android.ugc.aweme.feed.a.a().c(l());
            if (PatchProxy.isSupport(new Object[]{comment}, this, f2849a, false, 27449, new Class[]{Comment.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{comment}, this, f2849a, false, 27449, new Class[]{Comment.class}, Void.TYPE);
            } else {
                List<TextExtraStruct> textExtra = comment.getTextExtra();
                if (!(textExtra == null || this.f2854f == null)) {
                    for (TextExtraStruct textExtraStruct : textExtra) {
                        Iterator<User> it2 = this.f2854f.f36251d.iterator();
                        while (it2.hasNext()) {
                            User next = it2.next();
                            if (TextUtils.equals(next.getUid(), textExtraStruct.getUserId())) {
                                int atType = next.getAtType();
                                if (atType == 3) {
                                    r.a(getContext(), "comment_at", "follow", l(), next.getUid());
                                } else if (atType == 1) {
                                    r.a(getContext(), "comment_at", "search", l(), next.getUid());
                                } else if (atType == 4) {
                                    r.a(getContext(), "comment_at", "recent", l(), next.getUid());
                                }
                            }
                        }
                    }
                }
            }
            bg.a(new com.ss.android.ugc.aweme.comment.b.a(3, new Object[]{l(), comment.clone()}));
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f2849a, false, 27429, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f2849a, false, 27429, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (this.f2854f != null) {
            CommentInputManager commentInputManager = this.f2854f;
            MentionEditText mentionEditText = this.mEditCommentView;
            FadeImageView fadeImageView = this.ivAt;
            FadeImageView fadeImageView2 = this.ivEmoji;
            if (PatchProxy.isSupport(new Object[0], this, f2849a, false, 27466, new Class[0], String.class)) {
                str = (String) PatchProxy.accessDispatch(new Object[0], this, f2849a, false, 27466, new Class[0], String.class);
            } else {
                Aweme j = j();
                if (j != null) {
                    str = j.getAid();
                } else {
                    str = "";
                }
            }
            commentInputManager.a(mentionEditText, fadeImageView, fadeImageView2, str, this.f2853e);
        }
        this.mEditCommentView.setCursorVisible(false);
        this.mSendCommentView.setVisibility(8);
        this.mCbForward.setVisibility(8);
        com.ss.android.ugc.aweme.profile.a a2 = com.ss.android.ugc.aweme.profile.a.a();
        View view2 = this.mEditContainerView;
        View view3 = this.tabDivider;
        if (PatchProxy.isSupport(new Object[]{view2, view3}, a2, com.ss.android.ugc.aweme.profile.a.f61215a, false, 67225, new Class[]{View.class, View.class}, Void.TYPE)) {
            com.ss.android.ugc.aweme.profile.a aVar = a2;
            PatchProxy.accessDispatch(new Object[]{view2, view3}, aVar, com.ss.android.ugc.aweme.profile.a.f61215a, false, 67225, new Class[]{View.class, View.class}, Void.TYPE);
        } else if (!(!com.ss.android.ugc.aweme.profile.a.d() || view2 == null || view3 == null)) {
            com.ss.android.b.a.a.a.b(new com.ss.android.ugc.aweme.profile.d(view3, view2));
        }
        if (PatchProxy.isSupport(new Object[0], this, f2849a, false, 27430, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2849a, false, 27430, new Class[0], Void.TYPE);
        } else {
            this.ivAt.setVisibility(8);
            this.ivEmoji.setVisibility(8);
        }
        if (this.g) {
            d();
        }
        a(this.h);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            SlideData slideData = (SlideData) ViewModelProviders.of(activity).get(SlideData.class);
            slideData.a().observe(this, new a(this));
            slideData.b().observe(this, new b(this));
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup2, bundle}, this, f2849a, false, 27428, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup2, bundle}, this, f2849a, false, 27428, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = LayoutInflater.from(getActivity()).inflate(C0906R.layout.o9, viewGroup, false);
        inflate.setLayoutParams(new ViewGroup.LayoutParams(UIUtils.getScreenWidth(getActivity()), -2));
        bg.c(this);
        ButterKnife.bind((Object) this, inflate);
        Window window = getDialog().getWindow();
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setSoftInputMode(34);
        window.addFlags(32);
        window.setAttributes(window.getAttributes());
        window.setGravity(80);
        window.setDimAmount(0.0f);
        this.f2850b = new p(getContext());
        this.f2850b.a(new o());
        return inflate;
    }

    public final void a(int i2, int i3, String str) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str}, this, f2849a, false, 27458, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str}, this, f2849a, false, 27458, new Class[]{Integer.TYPE, Integer.TYPE, String.class}, Void.TYPE);
            return;
        }
        if (this.f2851c != null) {
            int i4 = i3;
            this.f2851c.a(i3);
        }
        a(11);
    }

    public final void a(Exception exc, int i2, Comment comment) {
        int i3;
        Exception exc2 = exc;
        int i4 = i2;
        if (PatchProxy.isSupport(new Object[]{exc2, Integer.valueOf(i2), comment}, this, f2849a, false, 27461, new Class[]{Exception.class, Integer.TYPE, Comment.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2, Integer.valueOf(i2), comment}, this, f2849a, false, 27461, new Class[]{Exception.class, Integer.TYPE, Comment.class}, Void.TYPE);
            return;
        }
        Context context = this.mEditCommentView.getContext();
        if (i4 == 3) {
            i3 = C0906R.string.ahn;
        } else {
            i3 = C0906R.string.v7;
        }
        com.ss.android.ugc.aweme.comment.api.a.a(context, exc, i3);
        if (i4 == 3) {
            com.ss.android.ugc.aweme.forward.e.a.a(this.f2851c.f(), j(), "detail", "click_comment", false);
        }
    }
}
