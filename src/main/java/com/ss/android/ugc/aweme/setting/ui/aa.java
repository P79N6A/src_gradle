package com.ss.android.ugc.aweme.setting.ui;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.net.Uri;
import android.widget.EditText;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.h;

public final /* synthetic */ class aa implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f64400a;

    /* renamed from: b  reason: collision with root package name */
    private final SharedPreferences.Editor f64401b;

    /* renamed from: c  reason: collision with root package name */
    private final EditText f64402c;

    /* renamed from: d  reason: collision with root package name */
    private final EditText f64403d;

    aa(SharedPreferences.Editor editor, EditText editText, EditText editText2) {
        this.f64401b = editor;
        this.f64402c = editText;
        this.f64403d = editText2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64400a, false, 72824, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f64400a, false, 72824, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
            return;
        }
        SharedPreferences.Editor editor = this.f64401b;
        EditText editText = this.f64402c;
        EditText editText2 = this.f64403d;
        editor.putBoolean("js_bundle_deltas", false);
        editor.putString("debug_http_host", editText.getText().toString());
        editor.putString("test_schema", editText2.getText().toString()).apply();
        String obj = editText2.getText().toString();
        h.a().a(Uri.parse(obj).buildUpon().appendQueryParameter("rn_schema", obj).toString());
    }
}
