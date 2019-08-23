package com.ss.android.ugc.aweme.forward.view;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.comment.h;
import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.forward.b.d;
import com.ss.android.ugc.aweme.forward.d.e;
import com.ss.android.ugc.aweme.forward.e.a;
import com.ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.ss.android.ugc.aweme.profile.d.ae;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ForwardAwemeDetailFragment extends BaseAwemeDetailFragment implements d {
    public static ChangeQuickRedirect o;
    private e p;

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 45789, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 45789, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.p != null) {
            this.p.k();
            this.p.j();
        }
        h.a().b();
    }

    public final void y_() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 45787, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 45787, new Class[0], Void.TYPE);
            return;
        }
        super.y_();
        this.mEditText.performClick();
    }

    public final void o() {
        if (PatchProxy.isSupport(new Object[0], this, o, false, 45784, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, o, false, 45784, new Class[0], Void.TYPE);
        } else if (getArguments() != null) {
            String string = getArguments().getString("forward_id");
            if (!TextUtils.isEmpty(string)) {
                this.p = new e();
                this.p.a(new com.ss.android.ugc.aweme.forward.model.d());
                this.p.a(this);
                this.p.a(string);
            }
        }
    }

    public final void b(Exception exc) {
        if (PatchProxy.isSupport(new Object[]{exc}, this, o, false, 45786, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc}, this, o, false, 45786, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        super.b(exc);
        this.mEditText.performClick();
    }

    public final void a(ForwardDetail forwardDetail) {
        if (PatchProxy.isSupport(new Object[]{forwardDetail}, this, o, false, 45785, new Class[]{ForwardDetail.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{forwardDetail}, this, o, false, 45785, new Class[]{ForwardDetail.class}, Void.TYPE);
            return;
        }
        this.h = forwardDetail.getAweme();
        if (this.h == null || this.h.getAwemeType() != 13) {
            if (getActivity() != null) {
                getActivity().finish();
            }
            return;
        }
        this.f3288c.m = this.h;
        this.f3288c.setData(this.f3288c.a(forwardDetail.getAweme(), (List<Comment>) new ArrayList<Comment>()));
        String str = this.f3290e;
        Aweme aweme = this.h;
        if (PatchProxy.isSupport(new Object[]{str, aweme}, null, a.f48291a, true, 45510, new Class[]{String.class, Aweme.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, aweme}, null, a.f48291a, true, 45510, new Class[]{String.class, Aweme.class}, Void.TYPE);
        } else if (aweme != null) {
            com.ss.android.ugc.aweme.app.d.d a2 = com.ss.android.ugc.aweme.app.d.d.a();
            a2.a(a.a(str, aweme)).a("from_group_id", aweme.getFromGroupId()).a("repost_comment_id", aweme.getForwardCommentId());
            if (!TextUtils.isEmpty(aweme.getForwardGroupId())) {
                a2.a("forward_group_id", aweme.getForwardGroupId());
            }
            if (!TextUtils.isEmpty(aweme.getForwardUserId())) {
                a2.a("forward_user_id", aweme.getForwardUserId());
            }
            r.a("enter_repost_detail", (Map) a2.f34114b);
        }
        p();
        q();
    }

    public final void a(List<Comment> list, boolean z) {
        boolean z2;
        if (PatchProxy.isSupport(new Object[]{list, Byte.valueOf(z ? (byte) 1 : 0)}, this, o, false, 45788, new Class[]{List.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{list, Byte.valueOf(z)}, this, o, false, 45788, new Class[]{List.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        super.a(list, z);
        if (getArguments() != null) {
            if (!com.ss.android.g.a.c() || (list != null && list.size() >= 3)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (getArguments().containsKey("cid")) {
                String string = getArguments().getString("cid", "");
                if (list != null) {
                    for (Comment next : list) {
                        if (TextUtils.equals(next.getCid(), string)) {
                            if (next.getUser() != null) {
                                next.getUser().getUid();
                            }
                            if (z2) {
                                d(next);
                            } else {
                                this.i = next;
                                this.mEditText.setHint(getString(C0906R.string.bz8, ae.a(next.getUser())));
                            }
                        }
                    }
                } else if (z2) {
                    this.mEditText.performClick();
                }
            } else if (z2) {
                this.mEditText.performClick();
            }
        }
    }
}
