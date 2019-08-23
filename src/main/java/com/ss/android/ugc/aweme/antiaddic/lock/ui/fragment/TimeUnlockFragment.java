package com.ss.android.ugc.aweme.antiaddic.lock.ui.fragment;

import a.i;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.antiaddic.lock.api.ParentalPlatformApi;
import com.ss.android.ugc.aweme.antiaddic.lock.b;
import com.ss.android.ugc.aweme.antiaddic.lock.c;
import com.ss.android.ugc.aweme.antiaddic.lock.d;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.ui.session.a;
import java.util.concurrent.Callable;

public class TimeUnlockFragment extends TimeLockCheckFragment {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f33508e;
    @Nullable
    @BindView(2131498265)
    TextView desc;

    /* renamed from: f  reason: collision with root package name */
    private String f33509f;
    @Nullable
    @BindView(2131498293)
    TextView title;

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f33508e, false, 21997, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33508e, false, 21997, new Class[0], Void.TYPE);
            return;
        }
        super.e();
        b();
    }

    private boolean f() {
        if (PatchProxy.isSupport(new Object[0], this, f33508e, false, 21998, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f33508e, false, 21998, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (TextUtils.equals(this.f33509f, "logout") || TextUtils.equals(this.f33509f, "add_account") || TextUtils.equals(this.f33509f, "switch_account")) {
            return false;
        } else {
            return true;
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f33508e, false, 21993, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33508e, false, 21993, new Class[0], Void.TYPE);
            return;
        }
        if (getActivity() != null) {
            getActivity().finish();
        }
        a((View) this.f2607b);
        a<Boolean> b2 = d.b();
        if (b2 != null) {
            b2.a(Boolean.TRUE);
            return;
        }
        if (f()) {
            com.bytedance.ies.dmt.ui.d.a.a(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.cl3).a();
            SharePrefCache.inst().getLastUnlockTime().a(Long.valueOf(System.currentTimeMillis()));
        }
    }

    public final void b(String str) {
        q<BaseResponse> qVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f33508e, false, 21992, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f33508e, false, 21992, new Class[]{String.class}, Void.TYPE);
            return;
        }
        if (b.f33436b.b() == b.a.CHILD) {
            if (PatchProxy.isSupport(new Object[]{str2}, this, f33508e, false, 21994, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2}, this, f33508e, false, 21994, new Class[]{String.class}, Void.TYPE);
            } else {
                if (PatchProxy.isSupport(new Object[]{str2}, null, ParentalPlatformApi.f33425a, true, 21839, new Class[]{String.class}, q.class)) {
                    qVar = (q) PatchProxy.accessDispatch(new Object[]{str2}, null, ParentalPlatformApi.f33425a, true, 21839, new Class[]{String.class}, q.class);
                } else {
                    qVar = ParentalPlatformApi.f33426b.verifyPassword(str2);
                }
                l.a(qVar, new k<BaseResponse>() {

                    /* renamed from: a  reason: collision with root package name */
                    public static ChangeQuickRedirect f33512a;

                    static final /* synthetic */ Object a() throws Exception {
                        a<Boolean> b2 = d.b();
                        if (b2 != null) {
                            b2.a(Boolean.TRUE);
                        } else {
                            com.bytedance.ies.dmt.ui.d.a.a(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.cl3).a();
                            SharePrefCache.inst().getLastUnlockTime().a(Long.valueOf(System.currentTimeMillis()));
                        }
                        return null;
                    }

                    public final void onFailure(Throwable th) {
                        Throwable th2 = th;
                        if (PatchProxy.isSupport(new Object[]{th2}, this, f33512a, false, 22001, new Class[]{Throwable.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{th2}, this, f33512a, false, 22001, new Class[]{Throwable.class}, Void.TYPE);
                            return;
                        }
                        i.a((Callable<TResult>) new i<TResult>(this, th2), i.f1052b);
                    }

                    public final /* synthetic */ void onSuccess(Object obj) {
                        BaseResponse baseResponse = (BaseResponse) obj;
                        if (PatchProxy.isSupport(new Object[]{baseResponse}, this, f33512a, false, 22000, new Class[]{BaseResponse.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{baseResponse}, this, f33512a, false, 22000, new Class[]{BaseResponse.class}, Void.TYPE);
                            return;
                        }
                        TimeUnlockFragment.this.getActivity().finish();
                        TimeUnlockFragment.this.a((View) TimeUnlockFragment.this.f2607b);
                        i.a(h.f33531b, i.f1052b);
                    }
                });
            }
        } else {
            if (c.f33443d.e()) {
                c(str);
            } else if (str2 == null || TimeLockRuler.getUserSetting() == null || !str2.equals(TimeLockRuler.getUserSetting().getPassword())) {
                com.bytedance.ies.dmt.ui.d.a.b(com.ss.android.ugc.aweme.base.utils.d.a(), (int) C0906R.string.cla).a();
            } else {
                b();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        int i;
        int i2;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f33508e, false, 21990, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f33508e, false, 21990, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        a<Boolean> b2 = d.b();
        if (PatchProxy.isSupport(new Object[]{b2}, this, f33508e, false, 21995, new Class[]{a.class}, String.class)) {
            str = (String) PatchProxy.accessDispatch(new Object[]{b2}, this, f33508e, false, 21995, new Class[]{a.class}, String.class);
        } else if (b2 == null) {
            str = "time_lock";
        } else if (TimeLockRuler.isContentFilterOn()) {
            str = "teen_mode";
        } else {
            str = "time_lock";
        }
        d.a(view, str, false);
        if (PatchProxy.isSupport(new Object[0], this, f33508e, false, 21991, new Class[0], String.class)) {
            str2 = (String) PatchProxy.accessDispatch(new Object[0], this, f33508e, false, 21991, new Class[0], String.class);
        } else {
            Bundle arguments = getArguments();
            if (arguments != null) {
                str2 = arguments.getString("from");
            } else {
                str2 = "";
            }
        }
        this.f33509f = str2;
        if (b2 != null) {
            boolean isContentFilterOn = TimeLockRuler.isContentFilterOn();
            TextView textView = this.desc;
            if (PatchProxy.isSupport(new Object[]{Byte.valueOf(isContentFilterOn ? (byte) 1 : 0)}, this, f33508e, false, 21996, new Class[]{Boolean.TYPE}, Integer.TYPE)) {
                i = ((Integer) PatchProxy.accessDispatch(new Object[]{Byte.valueOf(isContentFilterOn)}, this, f33508e, false, 21996, new Class[]{Boolean.TYPE}, Integer.TYPE)).intValue();
            } else if (!isContentFilterOn) {
                i = C0906R.string.cl6;
            } else if (TextUtils.equals(this.f33509f, "add_account")) {
                i = C0906R.string.cp;
            } else if (TextUtils.equals(this.f33509f, "switch_account")) {
                i = C0906R.string.cgy;
            } else {
                i = C0906R.string.cl5;
            }
            textView.setText(getString(i));
            TextView textView2 = this.title;
            if (isContentFilterOn) {
                i2 = C0906R.string.cl9;
            } else {
                i2 = C0906R.string.cl_;
            }
            textView2.setText(getString(i2));
            ImageView imageView = (ImageView) view.findViewById(C0906R.id.d34);
            if (com.ss.android.g.a.b()) {
                imageView.setImageResource(2130839156);
            }
            imageView.setVisibility(0);
            imageView.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f33510a;

                public final void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f33510a, false, 21999, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f33510a, false, 21999, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    ClickInstrumentation.onClick(view);
                    if (TimeUnlockFragment.this.f2607b != null) {
                        TimeUnlockFragment.this.a((View) TimeUnlockFragment.this.f2607b);
                    }
                    if (TimeUnlockFragment.this.getActivity() != null) {
                        TimeUnlockFragment.this.getActivity().finish();
                    }
                }
            });
            return;
        }
        int lockTimeInMin = TimeLockRuler.getLockTimeInMin();
        String string = getString(C0906R.string.cl7, lockTimeInMin + getString(C0906R.string.bbt));
        if (com.ss.android.g.a.a()) {
            this.desc.setText(string);
            return;
        }
        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(string);
        String str3 = lockTimeInMin + getString(C0906R.string.bbt);
        if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(str3)) {
            int indexOf = string.indexOf(str3);
            ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(getResources().getColor(C0906R.color.a1t));
            if (str3.length() + indexOf < string.length()) {
                newSpannable.setSpan(foregroundColorSpan, indexOf, str3.length() + indexOf, 17);
                if (this.desc != null) {
                    this.desc.setText(newSpannable);
                }
            }
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f33508e, false, 21989, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.oa, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f33508e, false, 21989, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
