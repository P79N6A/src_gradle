package com.ss.android.ugc.aweme.profile.ui;

import a.g;
import a.i;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.bytedance.ies.dmt.ui.b.a;
import com.bytedance.ies.dmt.ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.ui.widget.DmtTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.d.d;
import com.ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.ss.android.ugc.aweme.base.ui.c;
import com.ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.api.RemarkApi;
import com.ss.android.ugc.aweme.profile.ui.ProfileMoreActivity;
import com.ss.android.ugc.aweme.utils.dr;
import java.util.Map;

public class MultilineInputFragment extends AmeBaseFragment implements ProfileMoreActivity.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61908a;

    /* renamed from: b  reason: collision with root package name */
    public int f61909b;

    /* renamed from: c  reason: collision with root package name */
    String f61910c;

    /* renamed from: d  reason: collision with root package name */
    private Dialog f61911d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f61912e;

    /* renamed from: f  reason: collision with root package name */
    private String f61913f;
    private RemarkApi g;
    private String h;
    @BindView(2131494987)
    ImageView mClearAllBtn;
    @BindView(2131494813)
    EditText mInput;
    @BindView(2131497974)
    TextView mLengthHint;
    @BindView(2131496380)
    RelativeLayout mPopRemarkname;
    @BindView(2131497604)
    ButtonTitleBar mTitleBar;
    @BindView(2131497857)
    DmtTextView mTvContactname;
    @BindView(2131498135)
    DmtTextView mTvSetting;

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f61908a, false, 68141, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61908a, false, 68141, new Class[0], Void.TYPE);
            return;
        }
        this.mTitleBar.getEndBtn().setAlpha(0.34f);
        this.mTitleBar.getEndBtn().setClickable(false);
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, f61908a, false, 68143, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61908a, false, 68143, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        KeyboardUtils.c(this.mInput);
    }

    public void onStart() {
        if (PatchProxy.isSupport(new Object[0], this, f61908a, false, 68136, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f61908a, false, 68136, new Class[0], Void.TYPE);
            return;
        }
        super.onStart();
        this.mInput.requestFocus();
        KeyboardUtils.a(this.mInput);
    }

    public final boolean c() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f61908a, false, 68144, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f61908a, false, 68144, new Class[0], Boolean.TYPE)).booleanValue();
        }
        String obj = this.mInput.getText().toString();
        if (!TextUtils.equals(obj, this.f61913f) && (obj.length() == 0 || obj.trim().length() > 0)) {
            z = true;
        }
        return z;
    }

    public final boolean a() {
        if (PatchProxy.isSupport(new Object[0], this, f61908a, false, 68139, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f61908a, false, 68139, new Class[0], Boolean.TYPE)).booleanValue();
        } else if (!c() || this.f61912e || this.f61911d != null) {
            return true;
        } else {
            this.f61911d = new a.C0185a(getContext()).a((int) C0906R.string.c12, (DialogInterface.OnClickListener) new aj(this)).b((int) C0906R.string.aja, (DialogInterface.OnClickListener) new ak(this)).b((int) C0906R.string.c1b).a().a();
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f61908a, false, 68142, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f61908a, false, 68142, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        if (z) {
            com.ss.android.ugc.aweme.base.livedata.a.a().a("aweme.main.profile.multi_line_input.remark_name").postValue(this.mInput.getText().toString());
        }
        b();
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    @OnClick({2131493213, 2131496740, 2131494987, 2131498135})
    public void onClick(View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f61908a, false, 68138, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f61908a, false, 68138, new Class[]{View.class}, Void.TYPE);
            return;
        }
        if (view.getId() == C0906R.id.ix) {
            if (getActivity() != null) {
                getActivity().onBackPressed();
            }
        } else if (view.getId() == C0906R.id.ceh) {
            this.f61912e = true;
            a(true);
        } else if (view.getId() == C0906R.id.azv) {
            this.mInput.setText("");
        } else if (view.getId() == C0906R.id.dir && !TextUtils.isEmpty(this.f61910c)) {
            if (Character.codePointCount(this.f61910c, 0, this.f61910c.length()) > this.f61909b) {
                this.f61910c = this.f61910c.substring(this.f61910c.offsetByCodePoints(0, 0), this.f61910c.offsetByCodePoints(0, this.f61909b));
            }
            this.mInput.setText(this.f61910c);
            r.a("edit_name_notice", (Map) new d().a("action_type", "click").f34114b);
            this.mPopRemarkname.animate().alpha(0.0f).setDuration(50);
            this.mTvSetting.setClickable(false);
            this.mLengthHint.animate().alpha(1.0f).setDuration(50).setStartDelay(50);
        }
    }

    public void onViewCreated(@NonNull View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f61908a, false, 68137, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f61908a, false, 68137, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.mTitleBar.setTitle(getArguments().getInt("titleId"));
        ((TextView) view.findViewById(C0906R.id.auv)).setText(getArguments().getInt("inputTypeNameId"));
        this.mInput.setHint(getArguments().getInt("inputHintId"));
        this.mInput.setOnEditorActionListener(ah.f62460b);
        this.mPopRemarkname.setAlpha(0.0f);
        this.mTvSetting.setClickable(false);
        this.mInput.addTextChangedListener(new c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f61914a;

            public final void afterTextChanged(Editable editable) {
                String str;
                String str2;
                Editable editable2 = editable;
                if (PatchProxy.isSupport(new Object[]{editable2}, this, f61914a, false, 68149, new Class[]{Editable.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{editable2}, this, f61914a, false, 68149, new Class[]{Editable.class}, Void.TYPE);
                } else if (MultilineInputFragment.this.isViewValid() && MultilineInputFragment.this.getActivity() != null) {
                    int codePointCount = Character.codePointCount(editable2, 0, editable.length());
                    if (codePointCount > MultilineInputFragment.this.f61909b) {
                        com.bytedance.ies.dmt.ui.d.a.b((Context) MultilineInputFragment.this.getActivity(), MultilineInputFragment.this.getString(C0906R.string.bau, String.valueOf(MultilineInputFragment.this.f61909b))).a();
                        int selectionEnd = Selection.getSelectionEnd(editable);
                        String obj = editable.toString();
                        if (selectionEnd == 0) {
                            str = "";
                        } else {
                            str = obj.substring(0, selectionEnd);
                        }
                        if (selectionEnd == obj.length()) {
                            str2 = "";
                        } else {
                            str2 = obj.substring(selectionEnd);
                        }
                        int codePointCount2 = Character.codePointCount(str2, 0, str2.length());
                        StringBuilder sb = new StringBuilder();
                        int i = MultilineInputFragment.this.f61909b - codePointCount2;
                        for (int i2 = 0; i2 < i; i2++) {
                            sb.append(Character.toChars(Character.codePointAt(str, sb.length())));
                        }
                        sb.append(str2);
                        MultilineInputFragment.this.mInput.setText(sb.toString());
                        Selection.setSelection(MultilineInputFragment.this.mInput.getText(), Math.min(MultilineInputFragment.this.mInput.length() - str2.length(), MultilineInputFragment.this.mInput.length()));
                        MultilineInputFragment.this.mLengthHint.setText(MultilineInputFragment.this.getString(C0906R.string.s2, Integer.valueOf(Character.codePointCount(MultilineInputFragment.this.mInput.getText(), 0, MultilineInputFragment.this.mInput.length())), Integer.valueOf(MultilineInputFragment.this.f61909b)));
                    } else {
                        MultilineInputFragment.this.mLengthHint.setText(MultilineInputFragment.this.getString(C0906R.string.s2, Integer.valueOf(codePointCount), Integer.valueOf(MultilineInputFragment.this.f61909b)));
                    }
                    if (!MultilineInputFragment.this.c()) {
                        MultilineInputFragment.this.b();
                    } else {
                        MultilineInputFragment multilineInputFragment = MultilineInputFragment.this;
                        if (PatchProxy.isSupport(new Object[0], multilineInputFragment, MultilineInputFragment.f61908a, false, 68140, new Class[0], Void.TYPE)) {
                            PatchProxy.accessDispatch(new Object[0], multilineInputFragment, MultilineInputFragment.f61908a, false, 68140, new Class[0], Void.TYPE);
                        } else {
                            multilineInputFragment.mTitleBar.getEndBtn().setAlpha(1.0f);
                            multilineInputFragment.mTitleBar.getEndBtn().setClickable(true);
                        }
                    }
                    if (editable.length() > 0) {
                        MultilineInputFragment.this.mClearAllBtn.setVisibility(0);
                    } else {
                        MultilineInputFragment.this.mClearAllBtn.setVisibility(8);
                    }
                }
            }
        });
        if (Character.codePointCount(this.f61913f, 0, this.f61913f.length()) > this.f61909b) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < this.f61909b; i++) {
                sb.append(Character.toChars(Character.codePointAt(this.f61913f, sb.length())));
            }
            this.mInput.setText(sb.toString());
        } else {
            this.mInput.setText(this.f61913f);
        }
        if (TextUtils.isEmpty(this.mInput.getText()) && com.ss.android.ugc.aweme.utils.permission.a.a((Activity) getActivity(), "android.permission.READ_CONTACTS")) {
            if (this.g == null) {
                this.g = (RemarkApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RemarkApi.class);
            }
            this.g.getContackBookRemarkName(this.h, dr.a().a(this.h)).a((g<TResult, TContinuationResult>) new ai<TResult,TContinuationResult>(this), i.f1052b);
        }
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        String str;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f61908a, false, 68135, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f61908a, false, 68135, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.oq, viewGroup2, false);
        this.f61909b = getArguments().getInt("inputMaxLength", 0);
        this.f61913f = getArguments().getString("defaultInputText", "");
        if (this.f61913f == null) {
            str = "";
        } else {
            str = this.f61913f;
        }
        this.f61913f = str;
        this.h = getArguments().getString("userId");
        return inflate;
    }
}
