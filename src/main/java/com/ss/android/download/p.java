package com.ss.android.download;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Dialog;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.format.Formatter;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.ss.android.ugc.aweme.C0906R;
import java.util.LinkedList;
import java.util.Queue;

public class p extends Activity implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private Dialog f28602a;

    /* renamed from: b  reason: collision with root package name */
    private Queue<Intent> f28603b = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    private Uri f28604c;

    /* renamed from: d  reason: collision with root package name */
    private Intent f28605d;

    private void b() {
        this.f28602a = null;
        this.f28604c = null;
        a();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        Intent intent = getIntent();
        if (intent != null) {
            this.f28603b.add(intent);
            setIntent(null);
            a();
        }
        if (this.f28602a != null && !this.f28602a.isShowing()) {
            this.f28602a.show();
        }
    }

    private void a() {
        if (this.f28602a == null) {
            if (this.f28603b.isEmpty()) {
                finish();
                return;
            }
            this.f28605d = this.f28603b.poll();
            this.f28604c = this.f28605d.getData();
            if (this.f28604c == null) {
                b();
                return;
            }
            Cursor a2 = h.a(getApplicationContext()).a(this.f28604c, (String[]) null, (String) null, (String[]) null, (String) null);
            try {
                if (!a2.moveToFirst()) {
                    b();
                    if (a2 != null) {
                        try {
                            a2.close();
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                a(a2);
                if (a2 != null) {
                    try {
                        a2.close();
                    } catch (Exception unused2) {
                    }
                }
            } catch (Exception unused3) {
                if (a2 != null) {
                    try {
                        a2.close();
                    } catch (Exception unused4) {
                    }
                }
            } catch (Throwable th) {
                if (a2 != null) {
                    try {
                        a2.close();
                    } catch (Exception unused5) {
                    }
                }
                throw th;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @TargetApi(3)
    private void a(Cursor cursor) {
        String formatFileSize = Formatter.formatFileSize(this, (long) cursor.getInt(cursor.getColumnIndexOrThrow("total_bytes")));
        String string = getString(C0906R.string.p1);
        boolean z = this.f28605d.getExtras().getBoolean("isWifiRequired");
        AlertDialog.Builder b2 = k.b((Context) this);
        if (z) {
            b2.setTitle((int) C0906R.string.dty).setMessage((CharSequence) getString(C0906R.string.dtx, new Object[]{formatFileSize, string})).setPositiveButton((int) C0906R.string.p1, (DialogInterface.OnClickListener) this).setNegativeButton((int) C0906R.string.oz, (DialogInterface.OnClickListener) this);
        } else {
            b2.setTitle((int) C0906R.string.dtw).setMessage((CharSequence) getString(C0906R.string.dtv, new Object[]{formatFileSize, string})).setPositiveButton((int) C0906R.string.p2, (DialogInterface.OnClickListener) this).setNegativeButton((int) C0906R.string.p1, (DialogInterface.OnClickListener) this);
        }
        this.f28602a = b2.setOnCancelListener(new DialogInterface.OnCancelListener() {
            public final void onCancel(DialogInterface dialogInterface) {
                p.this.finish();
            }
        }).show();
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        boolean z = this.f28605d.getExtras().getBoolean("isWifiRequired");
        if (z && i == -2) {
            h.a(getApplicationContext()).a(this.f28604c, null, null);
        } else if (!z && i == -1) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("bypass_recommended_size_limit", Boolean.TRUE);
            h.a(getApplicationContext()).a(this.f28604c, contentValues, (String) null, (String[]) null);
        }
        b();
    }
}
