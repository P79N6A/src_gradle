package com.bytedance.android.livesdk.chatroom.interact;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.arch.lifecycle.LifecycleOwner;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.LiveDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.uikit.rtl.AutoRTLImageView;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.interact.c.bf;
import com.bytedance.android.livesdk.chatroom.interact.contract.InteractDialogFragmentBaseContract;
import com.bytedance.android.livesdk.chatroom.interact.contract.b;
import com.bytedance.android.livesdk.chatroom.interact.data.LinkAutoMatchModel;
import com.bytedance.android.livesdk.chatroom.interact.fragment.InteractButtonFragment;
import com.bytedance.android.livesdk.chatroom.interact.fragment.InteractPKInviteFragment;
import com.bytedance.android.livesdk.chatroom.interact.fragment.InteractPKMatchFragment;
import com.bytedance.android.livesdk.chatroom.interact.fragment.InteractPKMatchInviteFragment;
import com.bytedance.android.livesdk.chatroom.interact.fragment.InteractPKTypeFragment;
import com.bytedance.android.livesdk.chatroom.interact.fragment.InteractPKUserListFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.common.utility.Lists;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class LinkDialog extends LiveDialogFragment implements b.C0088b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10229a;

    /* renamed from: b  reason: collision with root package name */
    public int f10230b;

    /* renamed from: c  reason: collision with root package name */
    ViewGroup f10231c;

    /* renamed from: d  reason: collision with root package name */
    ViewGroup f10232d;

    /* renamed from: e  reason: collision with root package name */
    ViewGroup f10233e;

    /* renamed from: f  reason: collision with root package name */
    TextView f10234f;
    public DataCenter g;
    public LifecycleOwner h;
    Stack<InteractDialogFragmentBaseContract.View> i = new Stack<>();
    public a j;
    ValueAnimator k;
    boolean l = true;
    private View m;
    private b.a n;
    private List<Runnable> o = new ArrayList();

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f10237a;

        /* renamed from: b  reason: collision with root package name */
        public User f10238b;

        /* renamed from: c  reason: collision with root package name */
        public long f10239c;

        /* renamed from: d  reason: collision with root package name */
        public String f10240d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f10241e;

        /* renamed from: f  reason: collision with root package name */
        public LinkAutoMatchModel f10242f;
        private DataCenter g;
        private LifecycleOwner h;

        public final LinkDialog a() {
            if (!PatchProxy.isSupport(new Object[0], this, f10237a, false, 4343, new Class[0], LinkDialog.class)) {
                return a(4);
            }
            return (LinkDialog) PatchProxy.accessDispatch(new Object[0], this, f10237a, false, 4343, new Class[0], LinkDialog.class);
        }

        public LinkDialog a(int i) {
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, this, f10237a, false, 4346, new Class[]{Integer.TYPE}, LinkDialog.class)) {
                return (LinkDialog) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, this, f10237a, false, 4346, new Class[]{Integer.TYPE}, LinkDialog.class);
            }
            LinkDialog linkDialog = new LinkDialog();
            linkDialog.j = this;
            linkDialog.h = this.h;
            linkDialog.g = this.g;
            linkDialog.f10230b = i;
            return linkDialog;
        }

        public final LinkDialog a(LinkAutoMatchModel linkAutoMatchModel) {
            if (PatchProxy.isSupport(new Object[]{linkAutoMatchModel}, this, f10237a, false, 4339, new Class[]{LinkAutoMatchModel.class}, LinkDialog.class)) {
                return (LinkDialog) PatchProxy.accessDispatch(new Object[]{linkAutoMatchModel}, this, f10237a, false, 4339, new Class[]{LinkAutoMatchModel.class}, LinkDialog.class);
            }
            this.f10242f = linkAutoMatchModel;
            return a(2);
        }

        private a(DataCenter dataCenter, LifecycleOwner lifecycleOwner) {
            this.g = dataCenter;
            this.h = lifecycleOwner;
        }

        /* synthetic */ a(DataCenter dataCenter, LifecycleOwner lifecycleOwner, byte b2) {
            this(dataCenter, lifecycleOwner);
        }
    }

    public final LifecycleOwner d() {
        return this.h;
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f10229a, false, 4319, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10229a, false, 4319, new Class[0], Void.TYPE);
        } else if (getDialog() != null && !this.i.isEmpty()) {
            this.l = true;
            a((Runnable) new d(this));
        }
    }

    public final Room c() {
        if (!PatchProxy.isSupport(new Object[0], this, f10229a, false, 4323, new Class[0], Room.class)) {
            return TTLiveSDKContext.getLiveService().d().a();
        }
        return (Room) PatchProxy.accessDispatch(new Object[0], this, f10229a, false, 4323, new Class[0], Room.class);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f10229a, false, 4318, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10229a, false, 4318, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        this.n.a();
    }

    public void onDestroyView() {
        if (PatchProxy.isSupport(new Object[0], this, f10229a, false, 4317, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10229a, false, 4317, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroyView();
        if (this.k != null) {
            this.k.cancel();
        }
        this.i.removeAllElements();
    }

    public final View b() {
        if (PatchProxy.isSupport(new Object[0], this, f10229a, false, 4322, new Class[0], View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[0], this, f10229a, false, 4322, new Class[0], View.class);
        }
        if (this.m == null) {
            AutoRTLImageView autoRTLImageView = new AutoRTLImageView(getContext());
            autoRTLImageView.setLayoutParams(new ViewGroup.LayoutParams(ac.a(32.0f), ac.a(32.0f)));
            autoRTLImageView.setImageDrawable(ac.c(2130841118));
            autoRTLImageView.setOnClickListener(new f(this));
            this.m = autoRTLImageView;
        }
        return this.m;
    }

    /* access modifiers changed from: package-private */
    public void e() {
        if (PatchProxy.isSupport(new Object[0], this, f10229a, false, 4330, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10229a, false, 4330, new Class[0], Void.TYPE);
            return;
        }
        Dialog dialog = getDialog();
        Context context = getContext();
        if (dialog != null && context != null) {
            View currentFocus = getDialog().getCurrentFocus();
            if (currentFocus != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
                if (inputMethodManager != null && inputMethodManager.isActive()) {
                    inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
                }
            }
        }
    }

    public boolean onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f10229a, false, 4324, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f10229a, false, 4324, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (!this.i.isEmpty()) {
            if (this.i.peek().e() != null) {
                this.i.peek().e().performClick();
                return true;
            } else if (this.i.size() == 1) {
                if (this.l) {
                    dismiss();
                }
                return true;
            }
        }
        return false;
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f10229a, false, 4316, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f10229a, false, 4316, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        if (!Lists.isEmpty(this.o)) {
            for (Runnable run : this.o) {
                run.run();
            }
        }
        this.o.clear();
    }

    /* access modifiers changed from: package-private */
    public void b(InteractDialogFragmentBaseContract.View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f10229a, false, 4327, new Class[]{InteractDialogFragmentBaseContract.View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f10229a, false, 4327, new Class[]{InteractDialogFragmentBaseContract.View.class}, Void.TYPE);
            return;
        }
        a((Runnable) new g(this, view));
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f10229a, false, 4315, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f10229a, false, 4315, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onActivityCreated(bundle);
        Window window = getDialog().getWindow();
        if (window != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.width = -1;
            attributes.height = -1;
            window.setAttributes(attributes);
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f10229a, false, 4311, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f10229a, false, 4311, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(1, C0906R.style.w3);
        this.n = new bf();
    }

    @NonNull
    public Dialog onCreateDialog(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f10229a, false, 4312, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f10229a, false, 4312, new Class[]{Bundle.class}, Dialog.class);
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setOnCancelListener(new b(this));
        onCreateDialog.setCanceledOnTouchOutside(true);
        return onCreateDialog;
    }

    private void a(Runnable runnable) {
        Runnable runnable2 = runnable;
        if (PatchProxy.isSupport(new Object[]{runnable2}, this, f10229a, false, 4329, new Class[]{Runnable.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable2}, this, f10229a, false, 4329, new Class[]{Runnable.class}, Void.TYPE);
        } else if (isResumed()) {
            runnable.run();
        } else {
            this.o.add(runnable2);
        }
    }

    public final void a(InteractDialogFragmentBaseContract.View view) {
        if (PatchProxy.isSupport(new Object[]{view}, this, f10229a, false, 4320, new Class[]{InteractDialogFragmentBaseContract.View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f10229a, false, 4320, new Class[]{InteractDialogFragmentBaseContract.View.class}, Void.TYPE);
        } else if (getDialog() != null && view != null) {
            if (view instanceof InteractPKInviteFragment) {
                this.l = false;
            } else {
                this.l = true;
            }
            a((Runnable) new e(this, view));
        }
    }

    public static a a(DataCenter dataCenter, LifecycleOwner lifecycleOwner) {
        DataCenter dataCenter2 = dataCenter;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (!PatchProxy.isSupport(new Object[]{dataCenter2, lifecycleOwner2}, null, f10229a, true, 4310, new Class[]{DataCenter.class, LifecycleOwner.class}, a.class)) {
            return new a(dataCenter2, lifecycleOwner2, (byte) 0);
        }
        return (a) PatchProxy.accessDispatch(new Object[]{dataCenter2, lifecycleOwner2}, null, f10229a, true, 4310, new Class[]{DataCenter.class, LifecycleOwner.class}, a.class);
    }

    public void onViewCreated(@NonNull View view, Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f10229a, false, 4314, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f10229a, false, 4314, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        getChildFragmentManager().addOnBackStackChangedListener(new LinkDialog$$Lambda$2(this));
        if (this.i.empty()) {
            if (!PatchProxy.isSupport(new Object[0], this, f10229a, false, 4325, new Class[0], Void.TYPE)) {
                switch (this.f10230b) {
                    case 0:
                        a((InteractDialogFragmentBaseContract.View) InteractButtonFragment.a(this, this.g));
                        break;
                    case 1:
                        if (LinkCrossRoomDataHolder.a().p != 1) {
                            this.j.f10240d = getString(C0906R.string.d60);
                            a((InteractDialogFragmentBaseContract.View) InteractPKInviteFragment.a(this, 1, this.j.f10240d, this.j.f10238b, this.j.f10239c, 0, this.g));
                            break;
                        } else {
                            this.j.f10240d = getString(C0906R.string.d6i);
                            a((InteractDialogFragmentBaseContract.View) InteractPKMatchInviteFragment.a(this, 1, this.j.f10240d, this.j.f10238b, this.j.f10239c, 0, this.g));
                            break;
                        }
                    case 2:
                        a((InteractDialogFragmentBaseContract.View) InteractPKMatchFragment.a(this, this.j.f10242f, 3, this.g));
                        break;
                    case 3:
                        a((InteractDialogFragmentBaseContract.View) InteractPKMatchFragment.a(this, this.j.f10242f, 2, this.g));
                        break;
                    case 4:
                        a((InteractDialogFragmentBaseContract.View) InteractPKTypeFragment.a((b.C0088b) this, this.g));
                        break;
                    case 5:
                        a((InteractDialogFragmentBaseContract.View) InteractPKTypeFragment.a((b.C0088b) this, this.g));
                        a((InteractDialogFragmentBaseContract.View) InteractPKMatchFragment.a(this, this.g));
                        break;
                    case 6:
                        a((InteractDialogFragmentBaseContract.View) InteractPKUserListFragment.a(this, 2, this.g, this.j.f10241e));
                        break;
                }
            } else {
                PatchProxy.accessDispatch(new Object[0], this, f10229a, false, 4325, new Class[0], Void.TYPE);
            }
        }
        com.bytedance.android.livesdk.w.b.aI.a(getString(C0906R.string.d7q));
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup2, bundle}, this, f10229a, false, 4313, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup2, bundle}, this, f10229a, false, 4313, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = LayoutInflater.from(getContext()).inflate(C0906R.layout.ai0, viewGroup, false);
        this.f10234f = (TextView) inflate.findViewById(C0906R.id.dkk);
        this.f10232d = (ViewGroup) inflate.findViewById(C0906R.id.b97);
        this.f10233e = (ViewGroup) inflate.findViewById(C0906R.id.b_9);
        this.f10231c = (ViewGroup) inflate.findViewById(C0906R.id.aic);
        inflate.findViewById(C0906R.id.bvx).setOnClickListener(new c(this));
        return inflate;
    }
}
