package com.bytedance.android.livesdk.wallet.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.LiveDialogFragment;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.live.core.rxutils.autodispose.e;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.core.utils.ai;
import com.bytedance.android.live.core.utils.z;
import com.bytedance.android.live.f.c;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.chatroom.ui.eo;
import com.bytedance.android.livesdk.utils.am;
import com.bytedance.android.livesdk.utils.s;
import com.bytedance.android.livesdk.v.j;
import com.bytedance.android.livesdk.wallet.api.WalletApi;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import io.reactivex.functions.Consumer;
import java.util.HashMap;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class BalanceChangeDialogFragment extends LiveDialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18046a;

    /* renamed from: b  reason: collision with root package name */
    ProgressDialog f18047b;

    /* renamed from: c  reason: collision with root package name */
    public Activity f18048c;

    /* renamed from: d  reason: collision with root package name */
    String f18049d;

    /* renamed from: e  reason: collision with root package name */
    String f18050e;

    /* renamed from: f  reason: collision with root package name */
    EditText f18051f;
    public c g;
    public a h;

    public interface a {
        void a(long j);
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f18046a, false, 14166, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18046a, false, 14166, new Class[0], Void.TYPE);
            return;
        }
        if (this.f18047b != null && this.f18047b.isShowing()) {
            this.f18047b.dismiss();
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f18046a, false, 14160, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f18046a, false, 14160, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(1, C0906R.style.vx);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f18046a, false, 14167, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f18046a, false, 14167, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        super.onDismiss(dialogInterface);
        if (this.g != null) {
            this.g.a(dialogInterface);
        }
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f18046a, false, 14161, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f18046a, false, 14161, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f18049d = arguments.getString("KEY_BUNDLE_REQUEST_PAGE", "");
            this.f18050e = arguments.getString("KEY_BUNDLE_CHARGE_REASON", "");
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                window.setLayout(-1, -2);
            }
        }
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f18046a, false, 14162, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f18046a, false, 14162, new Class[]{Bundle.class}, Dialog.class);
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        onCreateDialog.setCanceledOnTouchOutside(false);
        return onCreateDialog;
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f18046a, false, 14163, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f18046a, false, 14163, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater2.inflate(C0906R.layout.aff, viewGroup2, false);
        if (PatchProxy.isSupport(new Object[]{inflate}, this, f18046a, false, 14164, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{inflate}, this, f18046a, false, 14164, new Class[]{View.class}, Void.TYPE);
        } else {
            this.f18051f = (EditText) inflate.findViewById(C0906R.id.aa3);
            this.f18051f.post(new Runnable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f18052a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f18052a, false, 14168, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f18052a, false, 14168, new Class[0], Void.TYPE);
                        return;
                    }
                    BalanceChangeDialogFragment.this.f18051f.requestFocus();
                    if (BalanceChangeDialogFragment.this.getContext() != null) {
                        s.a(BalanceChangeDialogFragment.this.getContext(), BalanceChangeDialogFragment.this.f18051f);
                    }
                }
            });
            final TextView textView = (TextView) inflate.findViewById(C0906R.id.d9t);
            final View findViewById = inflate.findViewById(C0906R.id.bfi);
            final View findViewById2 = inflate.findViewById(C0906R.id.bfq);
            final TextView textView2 = (TextView) inflate.findViewById(C0906R.id.d91);
            ((TextView) inflate.findViewById(C0906R.id.d9u)).setText(ac.a((int) C0906R.string.cpg, Long.valueOf(j.q().n().d() / 100)));
            textView2.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f18054a;

                /* renamed from: c  reason: collision with root package name */
                private static final /* synthetic */ a.C0900a f18055c;

                static {
                    if (PatchProxy.isSupport(new Object[0], null, f18054a, true, 14170, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, f18054a, true, 14170, new Class[0], Void.TYPE);
                        return;
                    }
                    b bVar = new b("BalanceChangeDialogFragment.java", AnonymousClass2.class);
                    f18055c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.wallet.fragment.BalanceChangeDialogFragment$2", "android.view.View", NotifyType.VIBRATE, "", "void"), 166);
                }

                public void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f18054a, false, 14169, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f18054a, false, 14169, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    com.bytedance.android.livesdk.a.b.a().a(b.a(f18055c, this, this, view));
                    String valueOf = String.valueOf(j.q().n().d() / 100);
                    BalanceChangeDialogFragment.this.f18051f.setText(valueOf);
                    BalanceChangeDialogFragment.this.f18051f.setSelection(valueOf.length());
                }
            });
            ((TextView) inflate.findViewById(C0906R.id.d_4)).setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f18057a;

                /* renamed from: c  reason: collision with root package name */
                private static final /* synthetic */ a.C0900a f18058c;

                static {
                    if (PatchProxy.isSupport(new Object[0], null, f18057a, true, 14172, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, f18057a, true, 14172, new Class[0], Void.TYPE);
                        return;
                    }
                    b bVar = new b("BalanceChangeDialogFragment.java", AnonymousClass3.class);
                    f18058c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.wallet.fragment.BalanceChangeDialogFragment$3", "android.view.View", NotifyType.VIBRATE, "", "void"), 177);
                }

                public void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f18057a, false, 14171, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f18057a, false, 14171, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    com.bytedance.android.livesdk.a.b.a().a(b.a(f18058c, this, this, view));
                    String valueOf = String.valueOf(j.q().n().d() / 100);
                    BalanceChangeDialogFragment.this.f18051f.setText(valueOf);
                    BalanceChangeDialogFragment.this.f18051f.setSelection(valueOf.length());
                }
            });
            this.f18051f.setKeyListener(DigitsKeyListener.getInstance());
            EditText editText = this.f18051f;
            AnonymousClass4 r0 = new ai() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f18060a;

                public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                    int i4;
                    int i5;
                    int i6 = 4;
                    if (PatchProxy.isSupport(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f18060a, false, 14173, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{charSequence, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)}, this, f18060a, false, 14173, new Class[]{CharSequence.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    long d2 = j.q().n().d() / 100;
                    TextView textView = textView2;
                    if (TextUtils.isEmpty(charSequence)) {
                        i6 = 0;
                    }
                    textView.setVisibility(i6);
                    long j = 0;
                    try {
                        j = Long.parseLong(charSequence.toString());
                    } catch (Exception e2) {
                        com.bytedance.android.live.core.c.a.a("BalanceChangeDialogFrag", (Throwable) e2);
                    }
                    EditText editText = BalanceChangeDialogFragment.this.f18051f;
                    if (d2 >= j) {
                        i4 = C0906R.color.aaf;
                    } else {
                        i4 = C0906R.color.adp;
                    }
                    editText.setTextColor(ac.b(i4));
                    View view = findViewById;
                    int i7 = 8;
                    if (d2 >= j) {
                        i5 = 8;
                    } else {
                        i5 = 0;
                    }
                    view.setVisibility(i5);
                    View view2 = findViewById2;
                    if (d2 >= j) {
                        i7 = 0;
                    }
                    view2.setVisibility(i7);
                    textView.setText(String.valueOf(j));
                }
            };
            editText.addTextChangedListener(r0);
            this.f18051f.setHint(ac.a((int) C0906R.string.cpd, Long.valueOf(j.q().n().d() / 100)));
            inflate.findViewById(C0906R.id.ti).setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f18066a;

                /* renamed from: c  reason: collision with root package name */
                private static final /* synthetic */ a.C0900a f18067c;

                static {
                    if (PatchProxy.isSupport(new Object[0], null, f18066a, true, 14175, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, f18066a, true, 14175, new Class[0], Void.TYPE);
                        return;
                    }
                    b bVar = new b("BalanceChangeDialogFragment.java", AnonymousClass5.class);
                    f18067c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.wallet.fragment.BalanceChangeDialogFragment$5", "android.view.View", NotifyType.VIBRATE, "", "void"), 207);
                }

                public void onClick(View view) {
                    if (PatchProxy.isSupport(new Object[]{view}, this, f18066a, false, 14174, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f18066a, false, 14174, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    com.bytedance.android.livesdk.a.b.a().a(b.a(f18067c, this, this, view));
                    BalanceChangeDialogFragment.this.dismissAllowingStateLoss();
                }
            });
            View findViewById3 = inflate.findViewById(C0906R.id.d_v);
            findViewById3.setOnTouchListener(new z());
            findViewById3.setOnClickListener(new View.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f18069a;

                /* renamed from: c  reason: collision with root package name */
                private static final /* synthetic */ a.C0900a f18070c;

                static {
                    if (PatchProxy.isSupport(new Object[0], null, f18069a, true, 14177, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], null, f18069a, true, 14177, new Class[0], Void.TYPE);
                        return;
                    }
                    b bVar = new b("BalanceChangeDialogFragment.java", AnonymousClass6.class);
                    f18070c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.wallet.fragment.BalanceChangeDialogFragment$6", "android.view.View", NotifyType.VIBRATE, "", "void"), 217);
                }

                public void onClick(View view) {
                    long j;
                    if (PatchProxy.isSupport(new Object[]{view}, this, f18069a, false, 14176, new Class[]{View.class}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{view}, this, f18069a, false, 14176, new Class[]{View.class}, Void.TYPE);
                        return;
                    }
                    com.bytedance.android.livesdk.a.b.a().a(b.a(f18070c, this, this, view));
                    long d2 = j.q().n().d();
                    try {
                        j = Long.parseLong(BalanceChangeDialogFragment.this.f18051f.getText().toString());
                    } catch (Exception e2) {
                        com.bytedance.android.live.core.c.a.a("BalanceChangeDialogFrag", (Throwable) e2);
                        j = 0;
                    }
                    if (j == 0 || j > d2 / 100) {
                        com.bytedance.android.live.uikit.d.a.a((Context) BalanceChangeDialogFragment.this.getActivity(), ac.a((int) C0906R.string.dfx));
                        return;
                    }
                    SpannableString spannableString = new SpannableString(ac.a((int) C0906R.string.d2q));
                    spannableString.setSpan(new ForegroundColorSpan(ac.b((int) C0906R.color.a_t)), 0, spannableString.length(), 33);
                    new eo.a(BalanceChangeDialogFragment.this.getContext(), 2).a(true).a((int) C0906R.string.cvs).b((CharSequence) ac.a((int) C0906R.string.cvt, String.valueOf(j))).a(ac.a((int) C0906R.string.d2g), new DialogInterface.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f18074a;

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f18074a, false, 14179, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f18074a, false, 14179, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            dialogInterface.dismiss();
                        }
                    }).b(spannableString, new DialogInterface.OnClickListener() {

                        /* renamed from: a  reason: collision with root package name */
                        public static ChangeQuickRedirect f18072a;

                        public final void onClick(DialogInterface dialogInterface, int i) {
                            if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f18072a, false, 14178, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                                PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f18072a, false, 14178, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                                return;
                            }
                            dialogInterface.dismiss();
                            long j = 0;
                            try {
                                j = Long.parseLong(BalanceChangeDialogFragment.this.f18051f.getText().toString());
                            } catch (Exception e2) {
                                com.bytedance.android.live.core.c.a.a("BalanceChangeDialogFrag", (Throwable) e2);
                            }
                            BalanceChangeDialogFragment balanceChangeDialogFragment = BalanceChangeDialogFragment.this;
                            if (PatchProxy.isSupport(new Object[]{new Long(j)}, balanceChangeDialogFragment, BalanceChangeDialogFragment.f18046a, false, 14165, new Class[]{Long.TYPE}, Void.TYPE)) {
                                BalanceChangeDialogFragment balanceChangeDialogFragment2 = balanceChangeDialogFragment;
                                PatchProxy.accessDispatch(new Object[]{new Long(j)}, balanceChangeDialogFragment2, BalanceChangeDialogFragment.f18046a, false, 14165, new Class[]{Long.TYPE}, Void.TYPE);
                                return;
                            }
                            if (balanceChangeDialogFragment.f18047b == null) {
                                balanceChangeDialogFragment.f18047b = am.a(balanceChangeDialogFragment.f18048c);
                                balanceChangeDialogFragment.f18047b.setCancelable(false);
                                balanceChangeDialogFragment.f18047b.setCanceledOnTouchOutside(false);
                            }
                            if (!balanceChangeDialogFragment.f18047b.isShowing()) {
                                balanceChangeDialogFragment.f18047b.show();
                            }
                            ((ab) ((WalletApi) j.q().d().a(WalletApi.class)).diamondExchange(j).compose(i.a()).as(e.a((Fragment) balanceChangeDialogFragment))).a(new Consumer<d<Object>>(j) {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f18076a;

                                /* renamed from: b  reason: collision with root package name */
                                final /* synthetic */ long f18077b;

                                public final /* synthetic */ void accept(Object obj) throws Exception {
                                    int i;
                                    d dVar = (d) obj;
                                    if (PatchProxy.isSupport(new Object[]{dVar}, this, f18076a, false, 14180, new Class[]{d.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{dVar}, this, f18076a, false, 14180, new Class[]{d.class}, Void.TYPE);
                                        return;
                                    }
                                    BalanceChangeDialogFragment.this.a();
                                    if (BalanceChangeDialogFragment.this.h != null) {
                                        BalanceChangeDialogFragment.this.h.a(this.f18077b);
                                    }
                                    HashMap hashMap = new HashMap();
                                    hashMap.put("money", String.valueOf(this.f18077b));
                                    hashMap.put("charge_reason", BalanceChangeDialogFragment.this.f18050e);
                                    hashMap.put("request_page", BalanceChangeDialogFragment.this.f18049d);
                                    hashMap.put("pay_method", "fire");
                                    if (TTLiveSDKContext.getHostService().k().a().getPayScores() > 0) {
                                        i = 0;
                                    } else {
                                        i = 1;
                                    }
                                    hashMap.put("is_first_recharge", String.valueOf(i));
                                    hashMap.put("growth_deepevent", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
                                    com.bytedance.android.livesdk.j.a.a().a("livesdk_recharge_success", hashMap, com.bytedance.android.livesdk.j.c.j.class, Room.class);
                                    j.q().n().e();
                                    com.bytedance.android.live.uikit.d.a.a((Context) BalanceChangeDialogFragment.this.getActivity(), ac.a((int) C0906R.string.cv4));
                                    BalanceChangeDialogFragment.this.dismissAllowingStateLoss();
                                }

                                {
                                    this.f18077b = r2;
                                }
                            }, new Consumer<Throwable>() {

                                /* renamed from: a  reason: collision with root package name */
                                public static ChangeQuickRedirect f18079a;

                                public final /* synthetic */ void accept(Object obj) throws Exception {
                                    Throwable th = (Throwable) obj;
                                    if (PatchProxy.isSupport(new Object[]{th}, this, f18079a, false, 14181, new Class[]{Throwable.class}, Void.TYPE)) {
                                        PatchProxy.accessDispatch(new Object[]{th}, this, f18079a, false, 14181, new Class[]{Throwable.class}, Void.TYPE);
                                        return;
                                    }
                                    BalanceChangeDialogFragment.this.a();
                                    if (th instanceof com.bytedance.android.live.a.a.b.a) {
                                        com.bytedance.android.live.uikit.d.a.a((Context) BalanceChangeDialogFragment.this.getActivity(), ((com.bytedance.android.live.a.a.b.a) th).getPrompt());
                                    } else {
                                        com.bytedance.android.live.uikit.d.a.a((Context) BalanceChangeDialogFragment.this.getActivity(), ac.a((int) C0906R.string.cv3));
                                    }
                                }
                            });
                        }
                    }).b();
                }
            });
        }
        return inflate;
    }
}
