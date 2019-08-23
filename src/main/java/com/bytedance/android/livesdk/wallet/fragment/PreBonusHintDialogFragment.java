package com.bytedance.android.livesdk.wallet.fragment;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.LiveDialogFragment;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.bytedance.android.live.core.utils.ac;
import com.bytedance.android.live.f.c;
import com.bytedance.android.livesdk.wallet.a.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.util.List;
import org.aspectj.lang.a;

public class PreBonusHintDialogFragment extends LiveDialogFragment {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18094a;

    /* renamed from: b  reason: collision with root package name */
    public c f18095b;

    /* renamed from: c  reason: collision with root package name */
    public a f18096c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f18097d;

    /* renamed from: e  reason: collision with root package name */
    public List<b> f18098e;

    public interface a {
        void a();
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f18094a, false, 14200, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f18094a, false, 14200, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(1, C0906R.style.v0);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f18094a, false, 14203, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f18094a, false, 14203, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        super.onDismiss(dialogInterface);
        if (this.f18095b != null) {
            this.f18095b.a(dialogInterface);
        }
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f18094a, false, 14201, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f18094a, false, 14201, new Class[]{Bundle.class}, Dialog.class);
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            if (this.f18097d) {
                window.setGravity(80);
                window.setLayout(-1, -2);
            } else {
                int b2 = ac.b();
                WindowManager.LayoutParams attributes = window.getAttributes();
                attributes.gravity = 8388693;
                window.setLayout(b2, -2);
                window.setAttributes(attributes);
            }
        }
        return onCreateDialog;
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f18094a, false, 14202, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f18094a, false, 14202, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        View inflate = layoutInflater.inflate(C0906R.layout.ah5, viewGroup2, false);
        String str = null;
        if (getArguments() != null) {
            str = getArguments().getString("KEY_PREBONUS_HINT_TITLE");
        }
        ((TextView) inflate.findViewById(C0906R.id.dgi)).setText(str);
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf("");
        if (this.f18098e != null) {
            for (int i = 0; i < this.f18098e.size(); i++) {
                b bVar = this.f18098e.get(i);
                String str2 = bVar.f17870b;
                String str3 = bVar.f17869a;
                int length = valueOf.length();
                valueOf.append(str2).append(str3).append("   ");
                valueOf.setSpan(new ForegroundColorSpan(ac.b((int) C0906R.color.aa9)), str2.length() + length, length + str2.length() + str3.length(), 33);
            }
        }
        ((TextView) inflate.findViewById(C0906R.id.dgh)).setText(valueOf);
        inflate.findViewById(C0906R.id.d_v).setOnClickListener(new View.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f18099a;

            /* renamed from: c  reason: collision with root package name */
            private static final /* synthetic */ a.C0900a f18100c;

            static {
                if (PatchProxy.isSupport(new Object[0], null, f18099a, true, 14205, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], null, f18099a, true, 14205, new Class[0], Void.TYPE);
                    return;
                }
                org.aspectj.a.a.b bVar = new org.aspectj.a.a.b("PreBonusHintDialogFragment.java", AnonymousClass1.class);
                f18100c = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.wallet.fragment.PreBonusHintDialogFragment$1", "android.view.View", NotifyType.VIBRATE, "", "void"), 116);
            }

            public void onClick(View view) {
                if (PatchProxy.isSupport(new Object[]{view}, this, f18099a, false, 14204, new Class[]{View.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{view}, this, f18099a, false, 14204, new Class[]{View.class}, Void.TYPE);
                    return;
                }
                com.bytedance.android.livesdk.a.b.a().a(org.aspectj.a.a.b.a(f18100c, this, this, view));
                if (PreBonusHintDialogFragment.this.f18096c != null) {
                    PreBonusHintDialogFragment.this.dismissAllowingStateLoss();
                    PreBonusHintDialogFragment.this.f18096c.a();
                    PreBonusHintDialogFragment.this.f18095b = null;
                }
            }
        });
        return inflate;
    }
}
