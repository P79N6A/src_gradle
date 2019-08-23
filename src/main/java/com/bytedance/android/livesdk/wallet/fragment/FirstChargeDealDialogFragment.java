package com.bytedance.android.livesdk.wallet.fragment;

import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.LiveDialogFragment;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.livesdk.chatroom.e.y;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.g.c;
import com.bytedance.android.livesdk.utils.am;
import com.bytedance.android.livesdk.utils.l;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.wallet.e;
import com.bytedance.android.livesdk.wallet.f;
import com.bytedance.android.livesdk.wallet.k;
import com.bytedance.android.livesdkapi.depend.model.a;
import com.bytedance.android.livesdkapi.depend.model.b;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.host.r;
import com.bytedance.android.livesdkapi.i.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.Observable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.aspectj.lang.a;

public class FirstChargeDealDialogFragment extends LiveDialogFragment implements f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18081a;

    /* renamed from: b  reason: collision with root package name */
    ProgressDialog f18082b;

    /* renamed from: c  reason: collision with root package name */
    public String f18083c;

    /* renamed from: d  reason: collision with root package name */
    public a f18084d;

    public final void a() {
    }

    public final void a(b bVar) {
    }

    public final void a(Exception exc, int i) {
    }

    public final void b() {
    }

    public final void d() {
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f18081a, false, 14188, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18081a, false, 14188, new Class[0], Void.TYPE);
            return;
        }
        if (this.f18082b != null && this.f18082b.isShowing()) {
            this.f18082b.dismiss();
        }
    }

    public final void a(Exception exc) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2}, this, f18081a, false, 14189, new Class[]{Exception.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2}, this, f18081a, false, 14189, new Class[]{Exception.class}, Void.TYPE);
            return;
        }
        c(exc2, -1);
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f18081a, false, 14183, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f18081a, false, 14183, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(1, C0906R.style.vz);
    }

    public final void a(int i) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f18081a, false, 14187, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f18081a, false, 14187, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        if (this.f18082b == null || getActivity() == null) {
            this.f18082b = am.a(getActivity());
            this.f18082b.setCancelable(false);
            this.f18082b.setCanceledOnTouchOutside(false);
        }
        if (this.f18082b != null && !this.f18082b.isShowing()) {
            this.f18082b.show();
        }
    }

    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f18081a, false, 14184, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f18081a, false, 14184, new Class[]{Bundle.class}, Dialog.class);
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -2);
        }
        return onCreateDialog;
    }

    private void c(Exception exc, int i) {
        int i2;
        Exception exc2;
        if (PatchProxy.isSupport(new Object[]{exc, Integer.valueOf(i)}, this, f18081a, false, 14192, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, Integer.valueOf(i)}, this, f18081a, false, 14192, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        if (i <= 0) {
            i2 = C0906R.string.cqc;
        } else {
            i2 = i;
        }
        if (exc == null) {
            exc2 = new Exception();
        } else {
            exc2 = exc;
        }
        l.a((Context) getActivity(), (Throwable) exc2, i2);
    }

    public final void b(Exception exc, int i) {
        Exception exc2 = exc;
        if (PatchProxy.isSupport(new Object[]{exc2, 0}, this, f18081a, false, 14191, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc2, 0}, this, f18081a, false, 14191, new Class[]{Exception.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        c(exc2, 0);
    }

    public final void a(int i, @Nullable com.bytedance.android.livesdk.wallet.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), aVar}, this, f18081a, false, 14190, new Class[]{Integer.TYPE, com.bytedance.android.livesdk.wallet.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), aVar}, this, f18081a, false, 14190, new Class[]{Integer.TYPE, com.bytedance.android.livesdk.wallet.a.a.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.u.a.a().a((Object) new c(i));
        com.bytedance.android.live.uikit.d.a.a((Context) getActivity(), ac.a((int) C0906R.string.d2v));
        j.q().n().e();
        HashMap hashMap = new HashMap();
        hashMap.put("request_page", "live_detail");
        hashMap.put("charge_reason", this.f18083c);
        hashMap.put("charge_style", "popup");
        hashMap.put("growth_deepevent", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        hashMap.put("money", String.valueOf(this.f18084d.f18682e + this.f18084d.f18683f));
        com.bytedance.android.livesdk.j.a.a().a("livesdk_recharge_success", hashMap, com.bytedance.android.livesdk.j.c.j.class, Room.class);
        dismiss();
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f18081a, false, 14185, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f18081a, false, 14185, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        if (getArguments() != null) {
            this.f18083c = getArguments().getString("key_bundle_charge_reason");
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.ag0, viewGroup2, false);
        inflate.findViewById(C0906R.id.azy).setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f18085a;

            /* renamed from: c  reason: collision with root package name */
            private static final /* synthetic */ a.C0900a f18086c;

            static {
                if (PatchProxy.isSupport(new Object[0], null, f18085a, true, 14194, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, f18085a, true, 14194, new Class[0], Void.TYPE);
                    return;
                }
                org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("FirstChargeDealDialogFragment.java", AnonymousClass1.class);
                f18086c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.wallet.fragment.FirstChargeDealDialogFragment$1", "android.view.View", NotifyType.VIBRATE, "", "void"), 106);
            }

            public void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f18085a, false, 14193, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f18085a, false, 14193, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f18086c, this, this, view));
                FirstChargeDealDialogFragment.this.dismissAllowingStateLoss();
            }
        });
        ViewGroup viewGroup3 = (ViewGroup) inflate.findViewById(C0906R.id.bhp);
        com.bytedance.android.livesdkapi.i.b bVar = (com.bytedance.android.livesdkapi.i.b) LiveSettingKeys.LIVE_FIRST_CHARGE_REWARD_PACKAGE_V2.a();
        if (bVar != null) {
            this.f18084d = bVar.f18808b;
            String str = "";
            Iterator<a.C0134a> it2 = this.f18084d.g.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                a.C0134a next = it2.next();
                if ("USD".equals(next.f18684a)) {
                    str = next.f18685b;
                    break;
                }
            }
            String a2 = ac.a((int) C0906R.string.cxb, str);
            SpannableString spannableString = new SpannableString(a2);
            if (a2 != null) {
                int indexOf = a2.indexOf(str);
                if (indexOf >= 0) {
                    a.a(spannableString, new ForegroundColorSpan(ac.b((int) C0906R.color.ahr)), indexOf, str.length() + indexOf, 33);
                }
            }
            ((TextView) inflate.findViewById(C0906R.id.dh2)).setText(spannableString);
            ((TextView) inflate.findViewById(C0906R.id.dh3)).setText(ac.a((int) C0906R.string.cqd, str));
            String str2 = "x" + String.valueOf(this.f18084d.f18682e + this.f18084d.f18683f);
            String str3 = "x" + String.valueOf(this.f18084d.f18682e);
            SpannableString spannableString2 = new SpannableString(str2 + str3);
            a.a(spannableString2, new ForegroundColorSpan(ac.b((int) C0906R.color.a9g)), str2.length(), spannableString2.length(), 33);
            a.a(spannableString2, new AbsoluteSizeSpan(8, true), str2.length(), spannableString2.length(), 33);
            a.a(spannableString2, new StrikethroughSpan(), str2.length(), spannableString2.length(), 33);
            a(layoutInflater, viewGroup3, new SpannableString(ac.a((int) C0906R.string.cv2)), spannableString2, null, 2130841112);
            for (b.a next2 : bVar.f18807a) {
                a(layoutInflater, viewGroup3, y.a(next2.f18809a, ""), y.a(next2.f18810b, ""), next2.f18811c, -1);
            }
            final e eVar = new e(getActivity(), new k() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f18088a;

                public final Observable<com.bytedance.android.livesdkapi.depend.model.b> a() {
                    if (PatchProxy.isSupport(new Object[0], this, f18088a, false, 14195, new Class[0], Observable.class)) {
                        return (Observable) PatchProxy.accessDispatch(new Object[0], this, f18088a, false, 14195, new Class[0], Observable.class);
                    }
                    com.bytedance.android.livesdkapi.depend.model.b bVar = new com.bytedance.android.livesdkapi.depend.model.b();
                    new ArrayList().add(FirstChargeDealDialogFragment.this.f18084d);
                    bVar.f18686a = new ArrayList();
                    return Observable.just(bVar);
                }
            }, "", "", 0);
            eVar.a(this);
            ((TextView) inflate.findViewById(C0906R.id.dh3)).setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f18090a;

                /* renamed from: d  reason: collision with root package name */
                private static final /* synthetic */ a.C0900a f18091d;

                static {
                    if (PatchProxy.isSupport(new Object[0], null, f18090a, true, 14197, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, f18090a, true, 14197, new Class[0], Void.TYPE);
                        return;
                    }
                    org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("FirstChargeDealDialogFragment.java", AnonymousClass3.class);
                    f18091d = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.wallet.fragment.FirstChargeDealDialogFragment$3", "android.view.View", NotifyType.VIBRATE, "", "void"), 175);
                }

                public void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f18090a, false, 14196, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f18090a, false, 14196, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f18091d, this, this, view));
                    HashMap hashMap = new HashMap();
                    hashMap.put("request_page", "live_detail");
                    hashMap.put("charge_reason", FirstChargeDealDialogFragment.this.f18083c);
                    hashMap.put("charge_style", "popup");
                    hashMap.put("pay_method", "google_pay");
                    com.bytedance.android.livesdk.j.a.a().a("livesdk_recharge_click", hashMap, com.bytedance.android.livesdk.j.c.j.class, Room.class);
                    eVar.a(FirstChargeDealDialogFragment.this.f18084d, r.GOOGLE);
                }
            });
            HashMap hashMap = new HashMap();
            hashMap.put("request_page", "live_detail");
            hashMap.put("charge_reason", this.f18083c);
            hashMap.put("charge_style", "popup");
            com.bytedance.android.livesdk.j.a.a().a("livesdk_recharge_show", hashMap, com.bytedance.android.livesdk.j.c.j.class, Room.class);
        }
        return inflate;
    }

    private void a(LayoutInflater layoutInflater, ViewGroup viewGroup, Spannable spannable, Spannable spannable2, ImageModel imageModel, int i) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        Spannable spannable3 = spannable;
        Spannable spannable4 = spannable2;
        ImageModel imageModel2 = imageModel;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, spannable3, spannable4, imageModel2, Integer.valueOf(i)}, this, f18081a, false, 14186, new Class[]{LayoutInflater.class, ViewGroup.class, Spannable.class, Spannable.class, ImageModel.class, Integer.TYPE}, Void.TYPE)) {
            Object[] objArr = {layoutInflater2, viewGroup2, spannable3, spannable4, imageModel2, Integer.valueOf(i)};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f18081a, false, 14186, new Class[]{LayoutInflater.class, ViewGroup.class, Spannable.class, Spannable.class, ImageModel.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.aj7, viewGroup2, false);
        ImageView imageView = (ImageView) inflate.findViewById(C0906R.id.b4e);
        if (imageModel2 == null) {
            imageView.setImageResource(i);
        } else {
            com.bytedance.android.livesdk.chatroom.f.b.a(imageView, imageModel2);
        }
        ((TextView) inflate.findViewById(C0906R.id.dhj)).setText(spannable3);
        ((TextView) inflate.findViewById(C0906R.id.dhl)).setText(spannable4);
        viewGroup2.addView(inflate);
    }
}
