package com.ss.android.ugc.aweme.account.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.google.common.util.concurrent.k;
import com.google.common.util.concurrent.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.mobilelib.b.a;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.api.AccountApiInModule;
import com.ss.android.ugc.aweme.account.login.ui.BaseFragment;
import com.ss.android.ugc.aweme.account.login.ui.CheckButton;
import com.ss.android.ugc.aweme.base.ui.c;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.w;
import org.json.JSONObject;

public class VerifyIDCardFragment extends BaseFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33011a;

    /* renamed from: b  reason: collision with root package name */
    public String f33012b;

    /* renamed from: c  reason: collision with root package name */
    private String f33013c;
    @BindView(2131492927)
    protected CheckButton mDoneBtn;
    @BindView(2131493016)
    protected EditText mIdCardEditText;
    @BindView(2131493387)
    protected DmtStatusView mStatusView;
    @BindView(2131493389)
    protected TextView mSubTitle;

    public final a c() {
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void d() {
        if (PatchProxy.isSupport(new Object[0], this, f33011a, false, 21283, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f33011a, false, 21283, new Class[0], Void.TYPE);
            return;
        }
        this.mStatusView.d();
        AccountApiInModule.a(w.e(), this.f33013c, new k<com.ss.android.ugc.aweme.account.api.a.a>() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f33018a;

            public final void onFailure(Throwable th) {
                if (PatchProxy.isSupport(new Object[]{th}, this, f33018a, false, 21290, new Class[]{Throwable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{th}, this, f33018a, false, 21290, new Class[]{Throwable.class}, Void.TYPE);
                } else if (VerifyIDCardFragment.this.isViewValid() && VerifyIDCardFragment.this.getActivity() != null) {
                    com.bytedance.ies.dmt.ui.d.a.b((Context) VerifyIDCardFragment.this.getActivity(), (int) C0906R.string.bgf).a();
                    if (VerifyIDCardFragment.this.getActivity() != null) {
                        VerifyIDCardFragment.this.mStatusView.f();
                    }
                }
            }

            public final /* synthetic */ void onSuccess(Object obj) {
                com.ss.android.ugc.aweme.account.api.a.a aVar = (com.ss.android.ugc.aweme.account.api.a.a) obj;
                if (PatchProxy.isSupport(new Object[]{aVar}, this, f33018a, false, 21289, new Class[]{com.ss.android.ugc.aweme.account.api.a.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{aVar}, this, f33018a, false, 21289, new Class[]{com.ss.android.ugc.aweme.account.api.a.a.class}, Void.TYPE);
                } else if (VerifyIDCardFragment.this.isViewValid() && VerifyIDCardFragment.this.getActivity() != null) {
                    if (TextUtils.equals(aVar.f31678a, "success")) {
                        VerifyIDCardFragment.this.f33012b = aVar.f31679b.f31682c;
                        String format = String.format(VerifyIDCardFragment.this.getString(C0906R.string.dqq), new Object[]{VerifyIDCardFragment.this.f33012b});
                        int indexOf = format.indexOf(VerifyIDCardFragment.this.f33012b);
                        Spannable newSpannable = Spannable.Factory.getInstance().newSpannable(format);
                        newSpannable.setSpan(new ForegroundColorSpan(VerifyIDCardFragment.this.getResources().getColor(C0906R.color.zn)), indexOf, VerifyIDCardFragment.this.f33012b.length() + indexOf, 17);
                        VerifyIDCardFragment.this.mSubTitle.setText(newSpannable);
                        VerifyIDCardFragment.this.mStatusView.setVisibility(8);
                        return;
                    }
                    if (10003 == aVar.f31679b.f31680a) {
                        Intent intent = new Intent();
                        intent.putExtra("error_code", aVar.f31679b.f31680a);
                        VerifyIDCardFragment.this.getActivity().setResult(0, intent);
                        VerifyIDCardFragment.this.getActivity().finish();
                    } else if (!TextUtils.isEmpty(aVar.f31679b.f31681b)) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) VerifyIDCardFragment.this.getActivity(), aVar.f31679b.f31681b).a();
                    }
                    if (VerifyIDCardFragment.this.getActivity() != null) {
                        VerifyIDCardFragment.this.mStatusView.f();
                    }
                }
            }
        });
    }

    public static VerifyIDCardFragment a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f33011a, true, 21278, new Class[]{String.class}, VerifyIDCardFragment.class)) {
            return (VerifyIDCardFragment) PatchProxy.accessDispatch(new Object[]{str2}, null, f33011a, true, 21278, new Class[]{String.class}, VerifyIDCardFragment.class);
        }
        Bundle bundle = new Bundle();
        bundle.putString("shark_ticket", str2);
        VerifyIDCardFragment verifyIDCardFragment = new VerifyIDCardFragment();
        verifyIDCardFragment.setArguments(bundle);
        return verifyIDCardFragment;
    }

    @OnClick({2131492914, 2131492927})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f33011a, false, 21281, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f33011a, false, 21281, new Class[]{View.class}, Void.TYPE);
        } else if (isViewValid()) {
            if (view.getId() == C0906R.id.ix) {
                KeyboardUtils.c(this.mIdCardEditText);
                getActivity().finish();
                return;
            }
            if (view.getId() == C0906R.id.nw) {
                String e2 = w.e();
                String obj = this.mIdCardEditText.getText().toString();
                String str = this.f33013c;
                AnonymousClass2 r3 = new com.ss.android.ugc.aweme.account.api.b.a() {

                    /* renamed from: b  reason: collision with root package name */
                    public static ChangeQuickRedirect f33016b;

                    public final void a(JSONObject jSONObject) {
                        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f33016b, false, 21286, new Class[]{JSONObject.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f33016b, false, 21286, new Class[]{JSONObject.class}, Void.TYPE);
                        } else if (VerifyIDCardFragment.this.isViewValid() && VerifyIDCardFragment.this.getActivity() != null) {
                            VerifyIDCardFragment.this.getActivity().setResult(-1);
                            VerifyIDCardFragment.this.getActivity().finish();
                        }
                    }

                    public final void b(JSONObject jSONObject) {
                        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f33016b, false, 21287, new Class[]{JSONObject.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f33016b, false, 21287, new Class[]{JSONObject.class}, Void.TYPE);
                        } else if (VerifyIDCardFragment.this.isViewValid() && VerifyIDCardFragment.this.getActivity() != null) {
                            JSONObject optJSONObject = jSONObject.optJSONObject("data");
                            int optInt = optJSONObject.optInt("error_code");
                            String optString = optJSONObject.optString("description");
                            if (10003 == optInt) {
                                Intent intent = new Intent();
                                intent.putExtra("error_code", optInt);
                                VerifyIDCardFragment.this.getActivity().setResult(0, intent);
                                return;
                            }
                            if (!TextUtils.isEmpty(optString)) {
                                com.bytedance.ies.dmt.ui.d.a.b((Context) VerifyIDCardFragment.this.getActivity(), optString).a();
                            }
                        }
                    }

                    public final void onFailure(Throwable th) {
                        if (PatchProxy.isSupport(new Object[]{th}, this, f33016b, false, 21288, new Class[]{Throwable.class}, Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[]{th}, this, f33016b, false, 21288, new Class[]{Throwable.class}, Void.TYPE);
                        } else if (VerifyIDCardFragment.this.isViewValid() && VerifyIDCardFragment.this.getActivity() != null) {
                            com.bytedance.ies.dmt.ui.d.a.b((Context) VerifyIDCardFragment.this.getActivity(), (int) C0906R.string.bgf).a();
                            if (VerifyIDCardFragment.this.getActivity() != null) {
                                VerifyIDCardFragment.this.mStatusView.f();
                            }
                        }
                    }
                };
                if (PatchProxy.isSupport(new Object[]{e2, obj, str, r3}, null, AccountApiInModule.f31674a, true, 19599, new Class[]{String.class, String.class, String.class, com.ss.android.ugc.aweme.account.api.b.a.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{e2, obj, str, r3}, null, AccountApiInModule.f31674a, true, 19599, new Class[]{String.class, String.class, String.class, com.ss.android.ugc.aweme.account.api.b.a.class}, Void.TYPE);
                    return;
                }
                l.a(AccountApiInModule.f31675b.verifyVerifyInfo(e2, "id_number", obj, str), r3, com.ss.android.ugc.aweme.account.base.a.f31688b);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        DmtTextView dmtTextView;
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f33011a, false, 21280, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f33011a, false, 21280, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        if (getArguments() != null) {
            this.f33013c = getArguments().getString("shark_ticket");
        }
        DmtStatusView dmtStatusView = this.mStatusView;
        DmtStatusView.a a2 = DmtStatusView.a.a(getContext());
        if (PatchProxy.isSupport(new Object[0], this, f33011a, false, 21282, new Class[0], View.class)) {
            dmtTextView = (View) PatchProxy.accessDispatch(new Object[0], this, f33011a, false, 21282, new Class[0], View.class);
        } else {
            DmtTextView dmtTextView2 = new DmtTextView(new ContextThemeWrapper(getContext(), C0906R.style.r5));
            dmtTextView2.setTextColor(getResources().getColor(C0906R.color.zv));
            dmtTextView2.setText(C0906R.string.b6z);
            dmtTextView2.setOnClickListener(new u(this));
            dmtTextView = dmtTextView2;
        }
        dmtStatusView.setBuilder(a2.c(dmtTextView));
        this.mIdCardEditText.addTextChangedListener(new c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f33014a;

            public final void afterTextChanged(Editable editable) {
                if (PatchProxy.isSupport(new Object[]{editable}, this, f33014a, false, 21285, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable}, this, f33014a, false, 21285, new Class[]{Editable.class}, Void.TYPE);
                } else if (editable.length() == 6) {
                    VerifyIDCardFragment.this.mDoneBtn.setEnabled(true);
                } else {
                    VerifyIDCardFragment.this.mDoneBtn.setEnabled(false);
                }
            }
        });
        d();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (!PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f33011a, false, 21279, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return layoutInflater2.inflate(C0906R.layout.aps, viewGroup2, false);
        }
        return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f33011a, false, 21279, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
    }
}
