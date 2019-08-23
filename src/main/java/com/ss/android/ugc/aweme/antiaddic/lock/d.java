package com.ss.android.ugc.aweme.antiaddic.lock;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.ag.h;
import com.ss.android.ugc.aweme.antiaddic.lock.b;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.TeenageModeSetting;
import com.ss.android.ugc.aweme.antiaddic.lock.entity.TimeLockUserSetting;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.AntiAddictionTipActivity;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.SetTimeLockActivity;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.TeenagerModeAppealActivity;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.TimeLockFragmentFactory;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.TimeUnlockActivity;
import com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment.v2.TimeLockAboutFragmentV2;
import com.ss.android.ugc.aweme.antiaddic.lock.viewmodel.TimeLockOptionViewModel;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.app.x;
import com.ss.android.ugc.aweme.base.AmeActivity;
import com.ss.android.ugc.aweme.base.ui.session.a;
import com.ss.android.ugc.aweme.base.ui.session.b;
import com.ss.android.ugc.aweme.base.utils.o;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.main.MainActivity;
import java.util.Map;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33446a;

    /* renamed from: b  reason: collision with root package name */
    public static boolean f33447b;

    public static boolean c() {
        return f33447b;
    }

    public static boolean a(a.C0450a<Boolean> aVar, String str) {
        a.C0450a<Boolean> aVar2 = aVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aVar2, str2}, null, f33446a, true, 21795, new Class[]{a.C0450a.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{aVar2, str2}, null, f33446a, true, 21795, new Class[]{a.C0450a.class, String.class}, Boolean.TYPE)).booleanValue();
        }
        FragmentActivity fragmentActivity = (FragmentActivity) com.ss.android.ugc.aweme.framework.core.a.b().a();
        if (fragmentActivity == null || !(fragmentActivity instanceof AmeActivity) || (fragmentActivity instanceof AntiAddictionTipActivity)) {
            return false;
        }
        Intent intent = new Intent(fragmentActivity, TimeUnlockActivity.class);
        if (aVar2 != null) {
            d().a(fragmentActivity, aVar2);
            if (((Boolean) x.a().l().c()).booleanValue()) {
                intent = new Intent(fragmentActivity, TeenagerModeAppealActivity.class);
                intent.putExtra("type", 2);
            }
            intent.putExtra("from", str2);
        } else {
            r.a("time_lock_block_show", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("enter_from", "time_lock_block").f34114b);
        }
        fragmentActivity.startActivity(intent);
        return true;
    }

    public static void a(String str, String str2) {
        String str3;
        Integer num;
        String str4 = str;
        String str5 = str2;
        if (PatchProxy.isSupport(new Object[]{str4, str5}, null, f33446a, true, 21805, new Class[]{String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str4, str5}, null, f33446a, true, 21805, new Class[]{String.class, String.class}, Void.TYPE);
            return;
        }
        if (!com.ss.android.g.a.a() || !TextUtils.equals(str5, "reset")) {
            str3 = ((String) SharePrefCache.inst().getTeenagerProtectionScheme().c()) + "%26enter_from=" + str4 + "%26type=" + str5;
        } else {
            str3 = "https://aweme.snssdk.com/falcon/teenager_pw_reset";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str3);
        sb.append("%26minor_control_type=");
        c cVar = c.f33443d;
        if (PatchProxy.isSupport(new Object[0], cVar, c.f33440a, false, 21792, new Class[0], Integer.class)) {
            num = (Integer) PatchProxy.accessDispatch(new Object[0], cVar, c.f33440a, false, 21792, new Class[0], Integer.class);
        } else {
            TeenageModeSetting teenageModeSetting = c.f33441b;
            num = teenageModeSetting != null ? Integer.valueOf(teenageModeSetting.getMinorControlType()) : null;
        }
        sb.append(num);
        h.a().a(sb.toString());
    }

    public static a<Boolean> b() {
        if (PatchProxy.isSupport(new Object[0], null, f33446a, true, 21798, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f33446a, true, 21798, new Class[0], a.class);
        }
        return b.a().b(TimeUnlockActivity.f33471d, Boolean.class);
    }

    private static a<Boolean> d() {
        if (PatchProxy.isSupport(new Object[0], null, f33446a, true, 21797, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], null, f33446a, true, 21797, new Class[0], a.class);
        }
        return b.a().a(TimeUnlockActivity.f33471d, Boolean.class);
    }

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f33446a, true, 21793, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f33446a, true, 21793, new Class[0], Void.TYPE);
            return;
        }
        Context a2 = com.ss.android.ugc.aweme.framework.core.a.b().a();
        if (a2 == null) {
            a2 = GlobalContext.getContext();
        }
        if (a2 instanceof MainActivity) {
            ((MainActivity) a2).finish();
        }
        a2.startActivity(new Intent(a2, MainActivity.class).setFlags(268468224));
    }

    public static void a(boolean z) {
        f33447b = false;
    }

    private static void a(FragmentActivity fragmentActivity) {
        if (PatchProxy.isSupport(new Object[]{fragmentActivity}, null, f33446a, true, 21803, new Class[]{FragmentActivity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity}, null, f33446a, true, 21803, new Class[]{FragmentActivity.class}, Void.TYPE);
            return;
        }
        int backStackEntryCount = fragmentActivity.getSupportFragmentManager().getBackStackEntryCount();
        for (int i = 0; i < backStackEntryCount; i++) {
            fragmentActivity.getSupportFragmentManager().popBackStack();
        }
    }

    public static void b(FragmentActivity fragmentActivity, int i) {
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, Integer.valueOf(i)}, null, f33446a, true, 21804, new Class[]{FragmentActivity.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity, Integer.valueOf(i)}, null, f33446a, true, 21804, new Class[]{FragmentActivity.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(fragmentActivity);
        ((SetTimeLockActivity) fragmentActivity).a(TimeLockFragmentFactory.a(i));
    }

    public static void a(FragmentActivity fragmentActivity, int i) {
        if (PatchProxy.isSupport(new Object[]{fragmentActivity, Integer.valueOf(i)}, null, f33446a, true, 21802, new Class[]{FragmentActivity.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity, Integer.valueOf(i)}, null, f33446a, true, 21802, new Class[]{FragmentActivity.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        a(fragmentActivity);
        ((SetTimeLockActivity) fragmentActivity).a(TimeLockFragmentFactory.c(i));
    }

    public static void a(FragmentActivity fragmentActivity, int i, TimeLockUserSetting timeLockUserSetting) {
        FragmentActivity fragmentActivity2 = fragmentActivity;
        TimeLockUserSetting timeLockUserSetting2 = timeLockUserSetting;
        if (PatchProxy.isSupport(new Object[]{fragmentActivity2, Integer.valueOf(i), timeLockUserSetting2}, null, f33446a, true, 21800, new Class[]{FragmentActivity.class, Integer.TYPE, TimeLockUserSetting.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fragmentActivity2, Integer.valueOf(i), timeLockUserSetting2}, null, f33446a, true, 21800, new Class[]{FragmentActivity.class, Integer.TYPE, TimeLockUserSetting.class}, Void.TYPE);
            return;
        }
        if (i == 0) {
            com.bytedance.ies.dmt.ui.d.a.a((Context) fragmentActivity2, (int) C0906R.string.ckf).a();
            timeLockUserSetting2.setTimeLockOn(true);
            TimeLockAboutFragmentV2.a aVar = (TimeLockAboutFragmentV2.a) ((TimeLockOptionViewModel) ViewModelProviders.of(fragmentActivity).get(TimeLockOptionViewModel.class)).f33618a.getValue();
            if (aVar == null || aVar.f33584b == 0) {
                throw new RuntimeException("@dongzesong");
            }
            timeLockUserSetting2.setLockTimeInMin(aVar.f33584b);
            r.a("open_time_lock_finish", (Map) com.ss.android.ugc.aweme.app.d.d.a().a("set_time", aVar.f33584b).f34114b);
        } else {
            timeLockUserSetting2.setContentFilterOn(true);
            x.a().C().a(Boolean.TRUE);
            r.a("open_teen_mode_finish", (Map) com.ss.android.ugc.aweme.app.d.d.a().f34114b);
            new Handler(Looper.myLooper()).post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f33451a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f33451a, false, 21808, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f33451a, false, 21808, new Class[0], Void.TYPE);
                        return;
                    }
                    d.a();
                    com.bytedance.ies.dmt.ui.d.a.a(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.c00).a();
                }
            });
            if (!com.ss.android.g.a.a() && !TimeLockRuler.isTimeLockOn() && !((Boolean) x.a().l().c()).booleanValue()) {
                timeLockUserSetting2.setTimeLockOn(true);
                timeLockUserSetting2.setLockTimeInMin(40);
            }
        }
        TimeLockRuler.applyUserSetting(timeLockUserSetting);
        a(fragmentActivity, i);
    }

    public static void a(View view, String str, boolean z) {
        int i;
        View view2 = view;
        final String str2 = str;
        if (PatchProxy.isSupport(new Object[]{view2, str2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f33446a, true, 21799, new Class[]{View.class, String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2, str2, Byte.valueOf(z)}, null, f33446a, true, 21799, new Class[]{View.class, String.class, Boolean.TYPE}, Void.TYPE);
        } else if (!com.ss.android.g.a.a()) {
            TextView textView = (TextView) view2.findViewById(C0906R.id.o4);
            if (b.f33436b.b() == b.a.CHILD) {
                textView.setVisibility(4);
                return;
            }
            com.bytedance.ies.dmt.ui.e.b.a(textView);
            String string = view.getContext().getString(C0906R.string.ckm);
            if (com.ss.android.g.a.a()) {
                i = C0906R.string.ckl;
            } else {
                i = C0906R.string.fl;
            }
            SpannableString spannableString = new SpannableString(o.b(i));
            com.ss.android.ugc.aweme.base.utils.a.a(spannableString, 0, spannableString.length(), o.a(C0906R.color.zl));
            textView.setText(new SpannableStringBuilder().append(string).append(" ").append(spannableString));
            textView.setVisibility(0);
            final boolean z2 = z;
            textView.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f33448a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f33448a, false, 21807, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f33448a, false, 21807, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    d.a(str2, "reset");
                    if (z2) {
                        d.f33447b = true;
                    }
                }
            });
        }
    }
}
