package com.ss.android.ugc.aweme.profile.ui;

import android.arch.lifecycle.ViewModelProviders;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.bytedance.ies.dmt.ui.titlebar.TextTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.profile.model.SelectedLocationViewModel;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;

public class ProfileEditLocationFragment extends ProfileDetailEditFragment {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f62201c;

    /* renamed from: d  reason: collision with root package name */
    String f62202d;

    /* renamed from: e  reason: collision with root package name */
    String f62203e;

    /* renamed from: f  reason: collision with root package name */
    LocationAdapter f62204f;
    SelectedLocationViewModel g;
    public a h;
    com.ss.android.ugc.aweme.poi.a i;
    @BindView(2131496877)
    RecyclerView mLocationList;
    @BindView(2131497604)
    TextTitleBar mTitleBar;

    public interface a {
        void a(String str);
    }

    private String a() {
        if (PatchProxy.isSupport(new Object[0], this, f62201c, false, 68784, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f62201c, false, 68784, new Class[0], String.class);
        } else if (this.i.province == null) {
            return "";
        } else {
            if (this.i.province.endsWith("市")) {
                if (this.i.district == null) {
                    return this.i.city;
                }
                return this.i.city + "·" + this.i.district;
            } else if (this.i.city == null) {
                return this.i.province;
            } else {
                return this.i.province + "·" + this.i.city;
            }
        }
    }

    public void onAttach(Context context) {
        if (PatchProxy.isSupport(new Object[]{context}, this, f62201c, false, 68787, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{context}, this, f62201c, false, 68787, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        super.onAttach(context);
        this.g = (SelectedLocationViewModel) ViewModelProviders.of(getActivity()).get(SelectedLocationViewModel.class);
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f62201c, false, 68783, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f62201c, false, 68783, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(1, C0906R.style.fu);
        if (getArguments() != null) {
            this.f62202d = getArguments().getString("selection_trace");
            this.f62203e = getArguments().getString("location_name");
        }
    }

    public static ProfileEditLocationFragment a(String str, String str2) {
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, str4}, null, f62201c, true, 68782, new Class[]{String.class, String.class}, ProfileEditLocationFragment.class)) {
            return (ProfileEditLocationFragment) PatchProxy.accessDispatch(new Object[]{str3, str4}, null, f62201c, true, 68782, new Class[]{String.class, String.class}, ProfileEditLocationFragment.class);
        }
        ProfileEditLocationFragment profileEditLocationFragment = new ProfileEditLocationFragment();
        Bundle bundle = new Bundle();
        bundle.putString("selection_trace", str3);
        bundle.putString("location_name", str4);
        profileEditLocationFragment.setArguments(bundle);
        return profileEditLocationFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f62201c, false, 68785, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f62201c, false, 68785, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.po, viewGroup2, false);
        ButterKnife.bind((Object) this, inflate);
        this.mTitleBar.setTitle((CharSequence) this.f62203e);
        this.mTitleBar.getBackBtn().setOnClickListener(new cs(this));
        if (this.f62202d.isEmpty()) {
            this.i = af.a((Context) getActivity()).f();
        }
        this.f62204f = new LocationAdapter(getActivity(), this.f62202d, new ct(this));
        if (!this.f62202d.isEmpty()) {
            this.f62204f.a(false, "");
        } else if (this.i == null) {
            this.f62204f.a(true, getString(C0906R.string.bon));
        } else if (!TextUtils.isEmpty(a())) {
            this.f62204f.a(true, a());
        } else {
            this.f62204f.a(true, getString(C0906R.string.bon));
        }
        this.mLocationList.setAdapter(this.f62204f);
        this.mLocationList.setLayoutManager(new WrapLinearLayoutManager(getContext()));
        return inflate;
    }
}
