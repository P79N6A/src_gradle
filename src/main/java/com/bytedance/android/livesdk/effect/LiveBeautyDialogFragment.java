package com.bytedance.android.livesdk.effect;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LiveDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.bytedance.android.live.core.utils.g;
import com.bytedance.android.live.uikit.a.a;
import com.bytedance.android.livesdk.effect.LiveBeautyFragment;
import com.bytedance.android.livesdk.effect.adpater.LiveFilterAdapter;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;

public class LiveBeautyDialogFragment extends LiveDialogFragment implements LiveFilterAdapter.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f13684a;

    /* renamed from: b  reason: collision with root package name */
    public DialogInterface.OnDismissListener f13685b;

    /* renamed from: c  reason: collision with root package name */
    private LiveBeautyFragment.a f13686c;

    /* renamed from: d  reason: collision with root package name */
    private LiveFilterAdapter.a f13687d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13688e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13689f;

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f13684a, false, 8116, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f13684a, false, 8116, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(1, C0906R.style.vm);
        setCancelable(true);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f13684a, false, 8120, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f13684a, false, 8120, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        if (this.f13685b != null) {
            this.f13685b.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    public void onActivityCreated(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f13684a, false, 8117, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f13684a, false, 8117, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (window != null) {
                if (this.f13689f) {
                    window.setLayout((int) UIUtils.dip2Px(getContext(), 391.0f), (int) UIUtils.dip2Px(getContext(), 152.0f));
                    window.setGravity(85);
                } else if (this.f13688e) {
                    window.setLayout(-1, -2);
                    window.setGravity(80);
                } else {
                    window.setLayout(-1, (int) getContext().getResources().getDimension(C0906R.dimen.qd));
                    window.setGravity(80);
                }
                window.setBackgroundDrawableResource(C0906R.color.a7l);
            }
        }
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f13684a, false, 8118, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f13684a, false, 8118, new Class[]{Bundle.class}, Dialog.class);
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(true);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        this.f13689f = false;
        if (getArguments() != null) {
            this.f13689f = getArguments().getBoolean("bundle_broadcast_landscape", false);
        }
        if (window != null) {
            if (this.f13689f) {
                window.setLayout((int) UIUtils.dip2Px(getContext(), 391.0f), (int) UIUtils.dip2Px(getContext(), 152.0f));
                window.setGravity(85);
            } else if (this.f13688e) {
                window.setLayout(-1, -2);
                window.setGravity(80);
            } else {
                window.setLayout(-1, (int) getContext().getResources().getDimension(C0906R.dimen.qd));
                window.setGravity(80);
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

    public final void a(int i) {
        float f2;
        int i2 = i;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f13684a, false, 8121, new Class[]{Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f13684a, false, 8121, new Class[]{Integer.TYPE}, Void.TYPE);
            return;
        }
        LiveBeautyFragment liveBeautyFragment = (LiveBeautyFragment) getChildFragmentManager().findFragmentByTag("beautyFragmentTag");
        if (liveBeautyFragment != null) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, liveBeautyFragment, LiveBeautyFragment.f13690a, false, 8126, new Class[]{Integer.TYPE}, Void.TYPE)) {
                LiveBeautyFragment liveBeautyFragment2 = liveBeautyFragment;
                PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, liveBeautyFragment2, LiveBeautyFragment.f13690a, false, 8126, new Class[]{Integer.TYPE}, Void.TYPE);
            } else if (!a.a()) {
                float a2 = f.a(j.a().f13785b, i2);
                if (a2 > ((float) liveBeautyFragment.f13692c.getProgress())) {
                    liveBeautyFragment.f13692c.setProgress((int) a2);
                }
            } else if (liveBeautyFragment.f13691b != null) {
                LiveBeautyFragment.a aVar = liveBeautyFragment.f13691b;
                if (i2 == 0) {
                    f2 = 0.35f;
                } else {
                    f2 = 0.0f;
                }
                aVar.a(f2);
            }
        }
        this.f13687d.a(i2);
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        View view;
        FragmentTransaction fragmentTransaction;
        LiveBeautyFragment liveBeautyFragment;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f13684a, false, 8119, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f13684a, false, 8119, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        if (this.f13689f) {
            view = layoutInflater2.inflate(C0906R.layout.afz, viewGroup2, false);
        } else if (this.f13688e) {
            view = layoutInflater2.inflate(C0906R.layout.afy, viewGroup2, false);
        } else {
            view = layoutInflater2.inflate(C0906R.layout.afx, viewGroup2, false);
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Fragment findFragmentByTag = childFragmentManager.findFragmentByTag("beautyFragmentTag");
        if (findFragmentByTag != null) {
            fragmentTransaction = childFragmentManager.beginTransaction().show(findFragmentByTag);
        } else {
            LiveBeautyFragment.a aVar = this.f13686c;
            boolean z = this.f13688e;
            if (PatchProxy.isSupport(new Object[]{aVar, Byte.valueOf(z ? (byte) 1 : 0)}, null, LiveBeautyFragment.f13690a, true, 8122, new Class[]{LiveBeautyFragment.a.class, Boolean.TYPE}, LiveBeautyFragment.class)) {
                liveBeautyFragment = (LiveBeautyFragment) PatchProxy.accessDispatch(new Object[]{aVar, Byte.valueOf(z)}, null, LiveBeautyFragment.f13690a, true, 8122, new Class[]{LiveBeautyFragment.a.class, Boolean.TYPE}, LiveBeautyFragment.class);
            } else {
                LiveBeautyFragment liveBeautyFragment2 = new LiveBeautyFragment();
                liveBeautyFragment2.setArguments(new Bundle());
                liveBeautyFragment2.f13691b = aVar;
                liveBeautyFragment2.h = z;
                liveBeautyFragment = liveBeautyFragment2;
            }
            fragmentTransaction = childFragmentManager.beginTransaction().add(C0906R.id.ai7, liveBeautyFragment, "beautyFragmentTag");
        }
        if (fragmentTransaction != null) {
            fragmentTransaction.commitAllowingStateLoss();
        }
        return view;
    }

    public static LiveBeautyDialogFragment a(LiveBeautyFragment.a aVar, LiveFilterAdapter.a aVar2, boolean z, int i) {
        LiveBeautyFragment.a aVar3 = aVar;
        LiveFilterAdapter.a aVar4 = aVar2;
        if (PatchProxy.isSupport(new Object[]{aVar3, aVar4, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i)}, null, f13684a, true, 8114, new Class[]{LiveBeautyFragment.a.class, LiveFilterAdapter.a.class, Boolean.TYPE, Integer.TYPE}, LiveBeautyDialogFragment.class)) {
            return (LiveBeautyDialogFragment) PatchProxy.accessDispatch(new Object[]{aVar3, aVar4, Byte.valueOf(z), Integer.valueOf(i)}, null, f13684a, true, 8114, new Class[]{LiveBeautyFragment.a.class, LiveFilterAdapter.a.class, Boolean.TYPE, Integer.TYPE}, LiveBeautyDialogFragment.class);
        }
        LiveBeautyDialogFragment liveBeautyDialogFragment = new LiveBeautyDialogFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("bundle_full_screen", z);
        bundle.putInt("bundle_from", i);
        liveBeautyDialogFragment.setArguments(bundle);
        liveBeautyDialogFragment.f13686c = aVar3;
        liveBeautyDialogFragment.f13687d = aVar4;
        return liveBeautyDialogFragment;
    }

    public static LiveBeautyDialogFragment a(LiveBeautyFragment.a aVar, LiveFilterAdapter.a aVar2, boolean z, int i, boolean z2) {
        LiveBeautyFragment.a aVar3 = aVar;
        LiveFilterAdapter.a aVar4 = aVar2;
        if (PatchProxy.isSupport(new Object[]{aVar3, aVar4, (byte) 1, 0, Byte.valueOf(z2 ? (byte) 1 : 0)}, null, f13684a, true, 8113, new Class[]{LiveBeautyFragment.a.class, LiveFilterAdapter.a.class, Boolean.TYPE, Integer.TYPE, Boolean.TYPE}, LiveBeautyDialogFragment.class)) {
            return (LiveBeautyDialogFragment) PatchProxy.accessDispatch(new Object[]{aVar3, aVar4, (byte) 1, 0, Byte.valueOf(z2)}, null, f13684a, true, 8113, new Class[]{LiveBeautyFragment.a.class, LiveFilterAdapter.a.class, Boolean.TYPE, Integer.TYPE, Boolean.TYPE}, LiveBeautyDialogFragment.class);
        }
        LiveBeautyDialogFragment a2 = a(aVar3, aVar4, true, 0);
        a2.f13688e = z2;
        return a2;
    }
}
