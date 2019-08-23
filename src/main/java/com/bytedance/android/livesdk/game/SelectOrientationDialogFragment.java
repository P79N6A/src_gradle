package com.bytedance.android.livesdk.game;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class SelectOrientationDialogFragment extends DialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f14653a;

    /* renamed from: b  reason: collision with root package name */
    private ViewGroup f14654b;

    /* renamed from: c  reason: collision with root package name */
    private ViewGroup f14655c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f14656d = true;

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f14653a, false, 9202, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f14653a, false, 9202, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(1, C0906R.style.wj);
        if (getArguments() != null) {
            this.f14656d = getArguments().getBoolean("hotsoon.intent.extra.IS_LANDSCAPE", true);
        }
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f14653a, false, 9203, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f14653a, false, 9203, new Class[]{Bundle.class}, Dialog.class);
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
        }
        return onCreateDialog;
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f14653a, false, 9206, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f14653a, false, 9206, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        a(this.f14655c, !z);
        a(this.f14654b, z);
        if (this.f14656d != z) {
            this.f14656d = z;
        }
    }

    private static void a(ViewGroup viewGroup, boolean z) {
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{viewGroup2, Byte.valueOf(z ? (byte) 1 : 0)}, null, f14653a, true, 9207, new Class[]{ViewGroup.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{viewGroup2, Byte.valueOf(z)}, null, f14653a, true, 9207, new Class[]{ViewGroup.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        viewGroup.setSelected(z);
        for (int i = 0; i < viewGroup.getChildCount(); i++) {
            viewGroup2.getChildAt(i).setSelected(z);
        }
    }

    public void onViewCreated(View view, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{view, bundle}, this, f14653a, false, 9205, new Class[]{View.class, Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view, bundle}, this, f14653a, false, 9205, new Class[]{View.class, Bundle.class}, Void.TYPE);
            return;
        }
        super.onViewCreated(view, bundle);
        this.f14654b = (ViewGroup) view.findViewById(C0906R.id.b96);
        this.f14655c = (ViewGroup) view.findViewById(C0906R.id.b9v);
        a(this.f14656d);
        this.f14654b.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14657a;

            /* renamed from: c  reason: collision with root package name */
            private static final /* synthetic */ a.C0900a f14658c;

            static {
                if (PatchProxy.isSupport(new Object[0], null, f14657a, true, 9209, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, f14657a, true, 9209, new Class[0], Void.TYPE);
                    return;
                }
                b bVar = new b("SelectOrientationDialogFragment.java", AnonymousClass1.class);
                f14658c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.game.SelectOrientationDialogFragment$1", "android.view.View", NotifyType.VIBRATE, "", "void"), 90);
            }

            public void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f14657a, false, 9208, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f14657a, false, 9208, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                com.bytedance.android.livesdk.a.b.a().a(b.a(f14658c, this, this, view));
                SelectOrientationDialogFragment.this.a(true);
            }
        });
        this.f14655c.setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f14660a;

            /* renamed from: c  reason: collision with root package name */
            private static final /* synthetic */ a.C0900a f14661c;

            static {
                if (PatchProxy.isSupport(new Object[0], null, f14660a, true, 9211, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, f14660a, true, 9211, new Class[0], Void.TYPE);
                    return;
                }
                b bVar = new b("SelectOrientationDialogFragment.java", AnonymousClass2.class);
                f14661c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.game.SelectOrientationDialogFragment$2", "android.view.View", NotifyType.VIBRATE, "", "void"), 96);
            }

            public void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f14660a, false, 9210, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f14660a, false, 9210, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                com.bytedance.android.livesdk.a.b.a().a(b.a(f14661c, this, this, view));
                SelectOrientationDialogFragment.this.a(false);
            }
        });
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{layoutInflater, viewGroup, bundle}, this, f14653a, false, 9204, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater, viewGroup, bundle}, this, f14653a, false, 9204, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(getContext()).inflate(C0906R.layout.ahe, null);
        viewGroup2.getChildAt(0).getLayoutParams().width = getResources().getDisplayMetrics().widthPixels;
        return viewGroup2;
    }
}
