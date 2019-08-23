package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import butterknife.BindView;
import com.bytedance.ies.dmt.ui.d.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.antiaddic.lock.b;
import com.ss.android.ugc.aweme.antiaddic.lock.c;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.TeenageModeSetting;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.widget.TimeLockDesc;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.utils.v;
import com.ss.android.ugc.aweme.common.r;
import java.util.Map;

public class TeenagerLockOptionsFragmentV2 extends AbsOptionsFragmentV2 {

    /* renamed from: f  reason: collision with root package name */
    public static ChangeQuickRedirect f33573f;
    @BindView(2131497472)
    TimeLockDesc desc1;
    @BindView(2131497473)
    TimeLockDesc desc2;
    @BindView(2131497474)
    TimeLockDesc desc3;
    @BindView(2131493368)
    Button mAppealCloseTeenagerMode;
    @BindView(2131493254)
    View mBetaDes;
    @BindView(2131493317)
    View mBottom;

    public final int a() {
        return C0906R.layout.qr;
    }

    public final boolean d() {
        if (PatchProxy.isSupport(new Object[0], this, f33573f, false, 22049, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33573f, false, 22049, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!c.f33443d.e()) {
            return false;
        } else {
            c cVar = c.f33443d;
            if (PatchProxy.isSupport(new Object[0], cVar, c.f33440a, false, 21779, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], cVar, c.f33440a, false, 21779, new Class[0], Void.TYPE);
            } else {
                TeenageModeSetting teenageModeSetting = c.f33441b;
                if (teenageModeSetting != null) {
                    teenageModeSetting.setTeenageModeSelf(false);
                }
                r.a("close_teen_mode_finish", (Map) d.a().f34114b);
                com.ss.android.ugc.aweme.antiaddic.lock.d.a();
                a.a(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.bzz).a();
                cVar.a(c.f33441b);
            }
            return true;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f33573f, false, 22046, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f33573f, false, 22046, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (!TimeLockRuler.isTeenagerAbEnable()) {
            this.desc2.setVisibility(8);
        }
        if (com.ss.android.g.a.a()) {
            this.mBetaDes.setVisibility(4);
            this.desc1.setText(getString(C0906R.string.bzx));
            this.desc2.setText(getString(C0906R.string.ble));
            this.desc2.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130839844));
        } else if (b.f33436b.b() == b.a.PARENT && com.ss.android.ugc.aweme.account.d.a().isLogin()) {
            this.desc1.setText(getString(C0906R.string.cip));
            v.a(true, this.mBottom);
            v.a(false, this.mAppealCloseTeenagerMode);
        } else if (((Boolean) x.a().l().c()).booleanValue()) {
            this.desc1.setText(getString(C0906R.string.ci6));
            this.desc1.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130839843));
            this.desc2.setText(getString(C0906R.string.ciq));
            this.desc2.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130839841));
            v.a(false, this.mBottom);
            v.a(true, this.mAppealCloseTeenagerMode);
        } else {
            this.desc1.setText(getString(C0906R.string.ciq));
            v.a(true, this.mBottom);
            v.a(false, this.mAppealCloseTeenagerMode);
        }
        this.f33554c.setOnClickListener(new d(this));
        if (c()) {
            if (PatchProxy.isSupport(new Object[0], this, f33573f, false, 22047, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f33573f, false, 22047, new Class[0], Void.TYPE);
            } else {
                this.f33553b.setVisibility(8);
                this.f33554c.setBackgroundResource(2130841604);
                this.f33554c.setTextColor(getResources().getColor(C0906R.color.a30));
                this.f33554c.setText(getString(C0906R.string.bl4));
                if (!com.ss.android.g.a.a()) {
                    this.desc3.setVisibility(0);
                    this.desc3.setText(getString(C0906R.string.bl6));
                    this.desc3.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130839844));
                } else {
                    this.desc1.setText(getString(C0906R.string.bl5));
                    this.desc1.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130839841));
                    this.desc3.setVisibility(8);
                    this.desc2.setText(getString(C0906R.string.bl6));
                    this.desc2.setImageDrawable(com.ss.android.ugc.bytex.a.a.a.a(getResources(), 2130839844));
                }
            }
        }
        this.mAppealCloseTeenagerMode.setOnClickListener(new e(this));
    }
}
