package com.ss.android.ugc.aweme.main;

import android.content.DialogInterface;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.lib.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IAVService;
import java.util.UUID;

public final /* synthetic */ class s implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54889a;

    /* renamed from: b  reason: collision with root package name */
    private final MainActivity f54890b;

    s(MainActivity mainActivity) {
        this.f54890b = mainActivity;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f54889a, false, 57226, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f54889a, false, 57226, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        MainActivity mainActivity = this.f54890b;
        a.a(mainActivity.getApplicationContext(), "protect", "record_on");
        Intent intent = new Intent(mainActivity, ((IAVService) ServiceManager.get().getService(IAVService.class)).getRecordPermissionActivity());
        intent.putExtra("shoot_way", "restore_crash");
        intent.putExtra("restore", 2);
        intent.putExtra("creation_id", UUID.randomUUID().toString());
        mainActivity.startActivity(intent);
        dialogInterface.dismiss();
    }
}
