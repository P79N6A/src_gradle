package com.bytedance.android.livesdk.widget;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.TextView;
import com.bytedance.android.live.core.rxutils.autodispose.ab;
import com.bytedance.android.live.core.rxutils.autodispose.e;
import com.bytedance.android.live.core.rxutils.i;
import com.bytedance.android.live.uikit.layout.WrapLineFlowLayout;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.model.ae;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.ss.android.ugc.aweme.C0906R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.aspectj.a.a.b;
import org.aspectj.lang.a;

public class LiveTagPicker extends DialogFragment implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f18265a;
    private static final /* synthetic */ a.C0900a i;

    /* renamed from: b  reason: collision with root package name */
    int f18266b = -1;

    /* renamed from: c  reason: collision with root package name */
    WrapLineFlowLayout f18267c;

    /* renamed from: d  reason: collision with root package name */
    View f18268d;

    /* renamed from: e  reason: collision with root package name */
    List<TextView> f18269e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    int f18270f = -1;
    List<ae> g;
    public DialogInterface.OnDismissListener h;

    public interface a {
        void a(ae aeVar);
    }

    /* access modifiers changed from: package-private */
    public void a() {
        if (PatchProxy.isSupport(new Object[0], this, f18265a, false, 14504, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18265a, false, 14504, new Class[0], Void.TYPE);
        } else if (this.g != null) {
            this.f18267c.post(new q(this));
        }
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f18265a, false, 14502, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f18265a, false, 14502, new Class[0], Void.TYPE);
            return;
        }
        super.onResume();
        a();
    }

    static {
        if (PatchProxy.isSupport(new Object[0], null, f18265a, true, 14506, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f18265a, true, 14506, new Class[0], Void.TYPE);
            return;
        }
        b bVar = new b("LiveTagPicker.java", LiveTagPicker.class);
        i = bVar.a("method-execution", bVar.a(PushConstants.PUSH_TYPE_THROUGH_MESSAGE, "onClick", "com.bytedance.android.livesdk.widget.LiveTagPicker", "android.view.View", NotifyType.VIBRATE, "", "void"), 134);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface}, this, f18265a, false, 14505, new Class[]{DialogInterface.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface}, this, f18265a, false, 14505, new Class[]{DialogInterface.class}, Void.TYPE);
            return;
        }
        if (this.h != null) {
            this.h.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    public static LiveTagPicker a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, null, f18265a, true, 14498, new Class[]{Integer.TYPE}, LiveTagPicker.class)) {
            return (LiveTagPicker) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, null, f18265a, true, 14498, new Class[]{Integer.TYPE}, LiveTagPicker.class);
        }
        LiveTagPicker liveTagPicker = new LiveTagPicker();
        Bundle bundle = new Bundle();
        bundle.putInt("INIT_TAG_ID", i2);
        liveTagPicker.setArguments(bundle);
        return liveTagPicker;
    }

    public void onCreate(@Nullable Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f18265a, false, 14499, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f18265a, false, 14499, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        setStyle(1, 16973841);
        if (getArguments() != null) {
            this.f18266b = getArguments().getInt("INIT_TAG_ID", -1);
        }
        ((ab) ((RoomRetrofitApi) j.q().d().a(RoomRetrofitApi.class)).getRoomTags().compose(i.a()).as(e.a((Fragment) this))).a(new o(this), p.f18530b);
    }

    @NonNull
    public Dialog onCreateDialog(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f18265a, false, 14500, new Class[]{Bundle.class}, Dialog.class)) {
            return (Dialog) PatchProxy.accessDispatch(new Object[]{bundle}, this, f18265a, false, 14500, new Class[]{Bundle.class}, Dialog.class);
        }
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        onCreateDialog.setCanceledOnTouchOutside(true);
        onCreateDialog.requestWindowFeature(1);
        Window window = onCreateDialog.getWindow();
        if (window != null) {
            window.setGravity(80);
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.a()).intValue() == 1) {
                window.setLayout(-1, -2);
            } else {
                window.setLayout(-1, -1);
            }
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setSoftInputMode(3);
            window.clearFlags(2);
        }
        return onCreateDialog;
    }

    public void onClick(View view) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{view}, this, f18265a, false, 14503, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f18265a, false, 14503, new Class[]{View.class}, Void.TYPE);
            return;
        }
        com.bytedance.android.livesdk.a.b.a().a(b.a(i, this, this, view));
        if (view.getId() == C0906R.id.dyc) {
            for (Fragment next : getFragmentManager().getFragments()) {
                if (next instanceof a) {
                    if (this.f18270f != -1) {
                        ((a) next).a(this.g.get(this.f18270f));
                    } else {
                        ((a) next).a(null);
                    }
                }
            }
            dismiss();
        } else if (view.getId() == C0906R.id.byh) {
            dismiss();
        } else {
            boolean z2 = !view.isSelected();
            int intValue = ((Integer) view.getTag()).intValue();
            if (!(intValue == this.f18270f || this.f18270f == -1)) {
                this.f18269e.get(this.f18270f).setSelected(false);
            }
            view.setSelected(z2);
            if (!z2) {
                intValue = -1;
            }
            this.f18270f = intValue;
            if (((Integer) LiveSettingKeys.START_LIVE_STYLE.a()).intValue() == 0) {
                View view2 = this.f18268d;
                if (this.f18270f != -1) {
                    z = true;
                } else {
                    z = false;
                }
                view2.setEnabled(z);
            }
            if (this.f18270f != -1) {
                HashMap hashMap = new HashMap();
                hashMap.put("room_tag", this.g.get(this.f18270f).f11092b);
                com.bytedance.android.livesdk.j.a.a().a("room_tag_click", hashMap, new com.bytedance.android.livesdk.j.c.j().c("bottom_tab").b("live").a("live_take_page").f("click"));
            }
        }
    }

    @Nullable
    public View onCreateView(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        int i2;
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        if (PatchProxy.isSupport(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f18265a, false, 14501, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{layoutInflater2, viewGroup2, bundle}, this, f18265a, false, 14501, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        }
        if (((Integer) LiveSettingKeys.START_LIVE_STYLE.a()).intValue() == 1) {
            i2 = C0906R.layout.akw;
        } else {
            i2 = C0906R.layout.akv;
        }
        View inflate = layoutInflater.inflate(i2, viewGroup2, false);
        this.f18268d = inflate.findViewById(C0906R.id.dyc);
        this.f18268d.setOnClickListener(this);
        if (((Integer) LiveSettingKeys.START_LIVE_STYLE.a()).intValue() == 0) {
            inflate.findViewById(C0906R.id.byh).setOnClickListener(this);
        }
        this.f18267c = (WrapLineFlowLayout) inflate.findViewById(C0906R.id.czp);
        return inflate;
    }
}
