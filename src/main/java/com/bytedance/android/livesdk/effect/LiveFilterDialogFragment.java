package com.bytedance.android.livesdk.effect;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LiveDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.android.live.a;
import com.bytedance.android.live.core.utils.g;
import com.bytedance.android.livesdk.effect.adpater.LiveFilterAdapter;
import com.bytedance.android.livesdk.effect.model.FilterModel;
import com.bytedance.common.utility.UIUtils;
import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;

public class LiveFilterDialogFragment extends LiveDialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13693a;

    /* renamed from: b  reason: collision with root package name */
    public LiveFilterAdapter.a f13694b;

    /* renamed from: c  reason: collision with root package name */
    public DialogInterface.OnDismissListener f13695c;

    /* renamed from: d  reason: collision with root package name */
    public List<FilterModel> f13696d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13697e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13698f;

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f13693a, false, 8147, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f13693a, false, 8147, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(1, C0906R.style.vm);
        setCancelable(true);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f13693a, false, 8152, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f13693a, false, 8152, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        if (this.f13695c != null) {
            this.f13695c.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f13693a, false, 8148, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f13693a, false, 8148, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                if (this.f13698f) {
                    window.setLayout((int) UIUtils.dip2Px(getContext(), 391.0f), (int) UIUtils.dip2Px(getContext(), 148.0f));
                } else if (this.f13697e) {
                    window.setLayout(-1, -2);
                } else {
                    window.setLayout(-1, (int) getContext().getResources().getDimension(C0906R.dimen.qe));
                }
            }
        }
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f13693a, false, 8149, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f13693a, false, 8149, new Class[]{Bundle.class}, Dialog.class);
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(true);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        this.f13698f = false;
        if (getArguments() != null) {
            this.f13698f = getArguments().getBoolean("bundle_landscape", false);
        }
        if (window != null) {
            if (this.f13698f) {
                window.setGravity(85);
                window.setLayout((int) UIUtils.dip2Px(getContext(), 391.0f), (int) UIUtils.dip2Px(getContext(), 148.0f));
            } else if (this.f13697e) {
                window.setGravity(80);
                window.setLayout(-1, -2);
            } else {
                window.setGravity(80);
                window.setLayout(-1, (int) getContext().getResources().getDimension(C0906R.dimen.qe));
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setSoftInputMode(3);
            if (getArguments() != null) {
                z = getArguments().getBoolean("bundle_full_screen", false);
            }
            if (z && !g.a(getActivity())) {
                window.addFlags(1024);
            }
            window.clearFlags(2);
        }
        return onCreateDialog;
    }

    @Deprecated
    private static LiveFilterDialogFragment a(LiveFilterAdapter.a aVar, String str, boolean z) {
        LiveFilterDialogFragment liveFilterDialogFragment = new LiveFilterDialogFragment();
        liveFilterDialogFragment.f13694b = aVar;
        Bundle bundle = new Bundle();
        bundle.putString("filterModelJson", str);
        bundle.putBoolean("bundle_full_screen", z);
        liveFilterDialogFragment.setArguments(bundle);
        return liveFilterDialogFragment;
    }

    @Deprecated
    public static LiveFilterDialogFragment a(LiveFilterAdapter.a aVar, List<FilterModel> list, boolean z) {
        LiveFilterDialogFragment liveFilterDialogFragment = new LiveFilterDialogFragment();
        liveFilterDialogFragment.f13694b = aVar;
        liveFilterDialogFragment.f13696d = list;
        Bundle bundle = new Bundle();
        bundle.putBoolean("bundle_full_screen", z);
        liveFilterDialogFragment.setArguments(bundle);
        return liveFilterDialogFragment;
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i;
        LiveFilterFragment liveFilterFragment;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f13693a, false, 8150, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f13693a, false, 8150, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        if (this.f13697e) {
            i = C0906R.layout.afj;
        } else {
            i = C0906R.layout.afi;
        }
        View inflate = layoutInflater2.inflate(i, viewGroup2, false);
        if (PatchProxy.isSupport(new Object[0], this, f13693a, false, 8151, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f13693a, false, 8151, new Class[0], Void.TYPE);
        } else {
            List<FilterModel> list = this.f13696d;
            if (list == null && getArguments() != null) {
                list = (List) a.a().fromJson(getArguments().getString("filterModelJson"), new TypeToken<List<FilterModel>>() {
                }.getType());
            }
            FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
            LiveFilterAdapter.a aVar = this.f13694b;
            if (list == null) {
                list = new ArrayList<>();
            }
            boolean z = this.f13697e;
            if (PatchProxy.isSupport(new Object[]{aVar, list, Byte.valueOf(z ? (byte) 1 : 0)}, null, LiveFilterFragment.f13700a, true, 8153, new Class[]{LiveFilterAdapter.a.class, List.class, Boolean.TYPE}, LiveFilterFragment.class)) {
                liveFilterFragment = (LiveFilterFragment) PatchProxy.accessDispatch(new Object[]{aVar, list, Byte.valueOf(z)}, null, LiveFilterFragment.f13700a, true, 8153, new Class[]{LiveFilterAdapter.a.class, List.class, Boolean.TYPE}, LiveFilterFragment.class);
            } else {
                LiveFilterFragment liveFilterFragment2 = new LiveFilterFragment();
                liveFilterFragment2.f13701b = aVar;
                Bundle bundle2 = new Bundle();
                if (list == null) {
                    list = new ArrayList<>();
                }
                liveFilterFragment2.h = z;
                liveFilterFragment2.f13702c = list;
                liveFilterFragment2.setArguments(bundle2);
                liveFilterFragment = liveFilterFragment2;
            }
            beginTransaction.add((int) C0906R.id.ai7, (Fragment) liveFilterFragment).commitAllowingStateLoss();
        }
        return inflate;
    }

    public static LiveFilterDialogFragment a(LiveFilterAdapter.a aVar, String str, boolean z, boolean z2) {
        LiveFilterAdapter.a aVar2 = aVar;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{aVar2, str2, (byte) 1, (byte) 1}, null, f13693a, true, 8144, new Class[]{LiveFilterAdapter.a.class, String.class, Boolean.TYPE, Boolean.TYPE}, LiveFilterDialogFragment.class)) {
            return (LiveFilterDialogFragment) PatchProxy.accessDispatch(new Object[]{aVar2, str2, (byte) 1, (byte) 1}, null, f13693a, true, 8144, new Class[]{LiveFilterAdapter.a.class, String.class, Boolean.TYPE, Boolean.TYPE}, LiveFilterDialogFragment.class);
        }
        LiveFilterDialogFragment a2 = a(aVar2, str2, true);
        a2.f13697e = true;
        return a2;
    }
}
