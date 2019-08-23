package com.ss.android.ugc.aweme.profile.ui;

import a.g;
import a.i;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.profile.model.CommitRemarkNameResponse;
import java.util.Map;

public final /* synthetic */ class ai implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62461a;

    /* renamed from: b  reason: collision with root package name */
    private final MultilineInputFragment f62462b;

    ai(MultilineInputFragment multilineInputFragment) {
        this.f62462b = multilineInputFragment;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f62461a, false, 68146, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f62461a, false, 68146, new Class[]{i.class}, Object.class);
        }
        MultilineInputFragment multilineInputFragment = this.f62462b;
        if (iVar.d() || iVar.c()) {
            return null;
        }
        CommitRemarkNameResponse commitRemarkNameResponse = (CommitRemarkNameResponse) iVar.e();
        if (commitRemarkNameResponse.isOK()) {
            multilineInputFragment.f61910c = commitRemarkNameResponse.remarkName;
            if (!TextUtils.isEmpty(multilineInputFragment.f61910c)) {
                r.a("edit_name_notice", (Map) new d().a("action_type", "show").f34114b);
                multilineInputFragment.mLengthHint.animate().alpha(0.0f).setDuration(150);
                multilineInputFragment.mPopRemarkname.animate().alpha(1.0f).setDuration(50).setStartDelay(150);
                multilineInputFragment.mTvSetting.setClickable(true);
                if (multilineInputFragment.f61910c.length() > 13) {
                    String substring = multilineInputFragment.f61910c.substring(0, 13);
                    multilineInputFragment.mTvContactname.setText(String.format(multilineInputFragment.getString(C0906R.string.c4e), new Object[]{substring, "...\""}));
                } else {
                    multilineInputFragment.mTvContactname.setText(String.format(multilineInputFragment.getString(C0906R.string.c4e), new Object[]{multilineInputFragment.f61910c, "\""}));
                }
            }
        }
        return null;
    }
}
