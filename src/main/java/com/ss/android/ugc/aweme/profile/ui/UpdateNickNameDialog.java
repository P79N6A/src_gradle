package com.ss.android.ugc.aweme.profile.ui;

import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.views.c;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.challenge.ui.r;
import com.ss.android.ugc.aweme.profile.d.ac;
import java.util.Map;

public class UpdateNickNameDialog extends UpdateUserInfoDialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62370a;
    @BindView(2131496378)
    TextView mPolicyDes;

    public final int d() {
        return C0906R.layout.kn;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f62370a, false, 69072, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62370a, false, 69072, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        if (PatchProxy.isSupport(new Object[0], this, f62370a, false, 69073, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62370a, false, 69073, new Class[0], Void.TYPE);
            return;
        }
        String string = d.a().getString(C0906R.string.c3b);
        String f2 = f();
        int indexOf = f2.indexOf(string);
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(f2);
        newSpannable.setSpan(new c(o.a(C0906R.color.a1z), o.a(C0906R.color.ht)) {

            /* renamed from: c  reason: collision with root package name */
            public static ChangeQuickRedirect f62371c;

            public final void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f62371c, false, 69074, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f62371c, false, 69074, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                h.a().a((String) SharePrefCache.inst().getJudgementClauseScheme().c());
            }
        }, indexOf, string.length() + indexOf, 17);
        this.mPolicyDes.setMovementMethod(r.a());
        this.mPolicyDes.setText(newSpannable);
    }

    public final void c() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f62370a, false, 69071, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f62370a, false, 69071, new Class[0], Void.TYPE);
            return;
        }
        if (this.mNickNameEditText == null || this.mNickNameEditText.getText() == null) {
            str = "";
        } else {
            str = this.mNickNameEditText.getText().toString();
        }
        if (!(b(str) || this.f62377f == null || this.f62376e == null)) {
            if (!TextUtils.equals(str, com.ss.android.ugc.aweme.account.d.a().getCurUser().getNickname())) {
                this.f62376e.f61672b = str;
            }
            Map<String, String> a2 = this.f62376e.a();
            a2.put("target_user", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            this.f62377f.a(a2);
            com.ss.android.ugc.aweme.common.r.a("profile_update_alert_finish", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("type", ac.a(2)).f34114b);
        }
    }

    public UpdateNickNameDialog(Context context, boolean z) {
        super(context, z);
    }
}
