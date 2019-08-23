package com.ss.android.ugc.aweme.im.sdk.comment;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialog;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.UIUtils;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.ui.AvatarImageView;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.im.sdk.chat.q;
import com.ss.android.ugc.aweme.im.sdk.utils.ad;
import com.ss.android.ugc.aweme.im.sdk.utils.au;
import com.ss.android.ugc.aweme.im.sdk.utils.ax;
import com.ss.android.ugc.aweme.im.sdk.utils.z;
import com.ss.android.ugc.aweme.im.service.model.IMUser;
import com.ss.android.ugc.aweme.im.service.model.c;
import java.util.HashMap;
import java.util.Map;

public class ImCommentReplyDialog extends AppCompatDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51180a;

    /* renamed from: b  reason: collision with root package name */
    public final c f51181b;

    /* renamed from: c  reason: collision with root package name */
    public final a f51182c;

    /* renamed from: d  reason: collision with root package name */
    public final a f51183d;

    /* renamed from: e  reason: collision with root package name */
    public EditText f51184e;

    /* renamed from: f  reason: collision with root package name */
    private View f51185f;
    private DmtTextView g;
    private AvatarImageView h;
    private ImageView i;
    private DmtTextView j;
    private Button k;
    private Button l;

    public interface a {
        void a(String str);
    }

    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f51191a;

        /* renamed from: b  reason: collision with root package name */
        public Context f51192b;

        /* renamed from: c  reason: collision with root package name */
        public c f51193c;

        /* renamed from: d  reason: collision with root package name */
        public a f51194d;

        /* renamed from: e  reason: collision with root package name */
        public a f51195e;

        public b(Context context) {
            this.f51192b = context;
        }
    }

    private void a() {
        if (PatchProxy.isSupport(new Object[0], this, f51180a, false, 51673, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51180a, false, 51673, new Class[0], Void.TYPE);
            return;
        }
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(this.f51184e.getWindowToken(), 0);
        }
    }

    public void cancel() {
        if (PatchProxy.isSupport(new Object[0], this, f51180a, false, 51674, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51180a, false, 51674, new Class[0], Void.TYPE);
            return;
        }
        a();
        super.cancel();
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f51180a, false, 51672, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51180a, false, 51672, new Class[0], Void.TYPE);
            return;
        }
        a();
        super.dismiss();
    }

    public void show() {
        if (PatchProxy.isSupport(new Object[0], this, f51180a, false, 51675, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f51180a, false, 51675, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        com.ss.android.ugc.aweme.common.ui.b.a((View) this.f51184e, 0);
    }

    private ImCommentReplyDialog(b bVar) {
        super(bVar.f51192b);
        this.f51181b = bVar.f51193c;
        this.f51182c = bVar.f51194d;
        this.f51183d = bVar.f51195e;
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f51180a, false, 51671, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f51180a, false, 51671, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        requestWindowFeature(1);
        getWindow().setLayout(-1, -2);
        this.f51185f = LayoutInflater.from(getContext()).inflate(C0906R.layout.j_, null);
        setContentView(this.f51185f);
        setCancelable(false);
        this.g = (DmtTextView) findViewById(C0906R.id.us);
        this.h = (AvatarImageView) findViewById(C0906R.id.i2);
        this.i = (ImageView) findViewById(C0906R.id.dr5);
        this.j = (DmtTextView) findViewById(C0906R.id.dq2);
        this.f51184e = (EditText) findViewById(C0906R.id.a8o);
        this.k = (Button) findViewById(C0906R.id.cpb);
        this.l = (Button) findViewById(C0906R.id.cpe);
        IMUser iMUser = this.f51181b.h;
        this.g.setText(getContext().getResources().getString(C0906R.string.aqq, new Object[]{this.f51181b.g}));
        com.ss.android.ugc.aweme.base.c.b(this.h, iMUser.getAvatarThumb());
        this.j.setText(iMUser.getNickName());
        ax.a(this.i, iMUser);
        au.a(this.k);
        au.a(this.l);
        this.k.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f51186a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f51186a, false, 51676, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f51186a, false, 51676, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (ImCommentReplyDialog.this.f51182c != null) {
                    ImCommentReplyDialog.this.f51182c.a(ImCommentReplyDialog.this.f51184e.getText().toString());
                }
                ImCommentReplyDialog.this.dismiss();
            }
        });
        this.l.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f51188a;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f51188a, false, 51677, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f51188a, false, 51677, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                ClickInstrumentation.onClick(view);
                if (TextUtils.isEmpty(ImCommentReplyDialog.this.f51184e.getText().toString())) {
                    com.bytedance.ies.dmt.ui.d.a.c(ImCommentReplyDialog.this.getContext(), (int) C0906R.string.aq3, 1).a();
                    z.a().e(ImCommentReplyDialog.this.f51181b.f52876e);
                } else if (ImCommentReplyDialog.this.f51184e.getText().length() >= ad.a()) {
                    UIUtils.displayToast(GlobalContext.getContext(), GlobalContext.getContext().getResources().getString(C0906R.string.aur));
                    z.a().e(ImCommentReplyDialog.this.f51181b.f52876e);
                } else {
                    z a2 = z.a();
                    c cVar = ImCommentReplyDialog.this.f51181b;
                    if (PatchProxy.isSupport(new Object[]{cVar}, a2, z.f52670a, false, 53620, new Class[]{c.class}, Void.TYPE)) {
                        Object[] objArr = {cVar};
                        z zVar = a2;
                        ChangeQuickRedirect changeQuickRedirect = z.f52670a;
                        PatchProxy.accessDispatch(objArr, zVar, changeQuickRedirect, false, 53620, new Class[]{c.class}, Void.TYPE);
                    } else {
                        HashMap hashMap = new HashMap();
                        hashMap.put("enter_from", cVar.f52876e);
                        hashMap.put("group_id", cVar.f52874c);
                        hashMap.put("comment_id", cVar.f52873b);
                        hashMap.put("to_user_id", cVar.h.getUid());
                        hashMap.put("author_id", cVar.f52875d);
                        r.a("share_comment", (Map) hashMap);
                    }
                    if (ImCommentReplyDialog.this.f51183d != null) {
                        ImCommentReplyDialog.this.f51183d.a(ImCommentReplyDialog.this.f51184e.getText().toString());
                    }
                    ImCommentReplyDialog.this.dismiss();
                }
            }
        });
        this.f51184e.setFilters(new InputFilter[]{new q(ad.a())});
        this.f51184e.setOnKeyListener(new View.OnKeyListener() {
            public final boolean onKey(View view, int i, KeyEvent keyEvent) {
                return i == 66;
            }
        });
    }

    public /* synthetic */ ImCommentReplyDialog(b bVar, byte b2) {
        this(bVar);
    }
}
