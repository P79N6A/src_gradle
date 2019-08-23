package com.bytedance.android.livesdk;

import android.content.DialogInterface;
import com.bytedance.android.livesdk.chatroom.model.ae;
import com.bytedance.android.livesdk.w.b;
import com.bytedance.android.livesdk.widget.LiveTagPicker;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;

public final /* synthetic */ class bu implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9657a;

    /* renamed from: b  reason: collision with root package name */
    private final StartLiveFragmentDefault f9658b;

    bu(StartLiveFragmentDefault startLiveFragmentDefault) {
        this.f9658b = startLiveFragmentDefault;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2;
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9657a, false, 2944, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f9657a, false, 2944, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        StartLiveFragmentDefault startLiveFragmentDefault = this.f9658b;
        dialogInterface.dismiss();
        if (startLiveFragmentDefault.getFragmentManager() != null) {
            ae aeVar = (ae) StartLiveFragmentDefault.f8845b.fromJson((String) ((Map) b.C.a()).get(startLiveFragmentDefault.t.name()), ae.class);
            if (aeVar == null) {
                i2 = -1;
            } else {
                i2 = aeVar.f11091a;
            }
            LiveTagPicker a2 = LiveTagPicker.a(i2);
            a2.h = new cq(startLiveFragmentDefault);
            a2.show(startLiveFragmentDefault.getFragmentManager(), "TAG_PICKER");
            startLiveFragmentDefault.e(8);
        }
    }
}
