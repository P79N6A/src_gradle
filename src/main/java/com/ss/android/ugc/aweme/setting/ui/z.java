package com.ss.android.ugc.aweme.setting.ui;

import android.content.DialogInterface;
import android.content.Intent;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.live.LivePlayActivity;

public final /* synthetic */ class z implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64460a;

    /* renamed from: b  reason: collision with root package name */
    private final TestSettingActivity f64461b;

    /* renamed from: c  reason: collision with root package name */
    private final EditText f64462c;

    z(TestSettingActivity testSettingActivity, EditText editText) {
        this.f64461b = testSettingActivity;
        this.f64462c = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64460a, false, 72823, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64460a, false, 72823, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        TestSettingActivity testSettingActivity = this.f64461b;
        EditText editText = this.f64462c;
        if (editText.getText() != null) {
            String obj = editText.getText().toString();
            Intent intent = new Intent(testSettingActivity, LivePlayActivity.class);
            intent.putExtra("room_id", Long.parseLong(obj));
            testSettingActivity.startActivity(intent);
        }
    }
}
