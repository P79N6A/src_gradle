package com.ss.android.download;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;

public class b extends Activity {

    /* renamed from: a  reason: collision with root package name */
    private Dialog f28500a;

    /* renamed from: b  reason: collision with root package name */
    private Uri f28501b;

    /* renamed from: c  reason: collision with root package name */
    private Intent f28502c;

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r0 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0047, code lost:
        if (r0 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0051, code lost:
        if (r0 == null) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onResume() {
        /*
            r7 = this;
            super.onResume()
            android.content.Intent r0 = r7.getIntent()
            r7.f28502c = r0
            if (r0 == 0) goto L_0x0054
            r0 = 0
            r7.setIntent(r0)
            android.app.Dialog r0 = r7.f28500a
            if (r0 != 0) goto L_0x0054
            android.content.Intent r0 = r7.f28502c
            if (r0 != 0) goto L_0x0018
            goto L_0x0054
        L_0x0018:
            android.content.Intent r0 = r7.f28502c
            android.net.Uri r0 = r0.getData()
            r7.f28501b = r0
            android.net.Uri r0 = r7.f28501b
            if (r0 == 0) goto L_0x0054
            android.content.Context r0 = r7.getApplicationContext()
            com.ss.android.download.h r1 = com.ss.android.download.h.a((android.content.Context) r0)
            android.net.Uri r2 = r7.f28501b
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r0 = r1.a((android.net.Uri) r2, (java.lang.String[]) r3, (java.lang.String) r4, (java.lang.String[]) r5, (java.lang.String) r6)
            boolean r1 = r0.moveToFirst()     // Catch:{ Exception -> 0x0051, all -> 0x004a }
            if (r1 != 0) goto L_0x0044
            if (r0 == 0) goto L_0x0054
        L_0x003e:
            r0.close()     // Catch:{ Exception -> 0x0042 }
            goto L_0x0054
        L_0x0042:
            goto L_0x0054
        L_0x0044:
            r7.a(r0)     // Catch:{ Exception -> 0x0051, all -> 0x004a }
            if (r0 == 0) goto L_0x0054
            goto L_0x003e
        L_0x004a:
            r1 = move-exception
            if (r0 == 0) goto L_0x0050
            r0.close()     // Catch:{ Exception -> 0x0050 }
        L_0x0050:
            throw r1
        L_0x0051:
            if (r0 == 0) goto L_0x0054
            goto L_0x003e
        L_0x0054:
            android.app.Dialog r0 = r7.f28500a
            if (r0 == 0) goto L_0x0065
            android.app.Dialog r0 = r7.f28500a
            boolean r0 = r0.isShowing()
            if (r0 != 0) goto L_0x0065
            android.app.Dialog r0 = r7.f28500a
            r0.show()
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.download.b.onResume():void");
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    private void a(Cursor cursor) {
        try {
            if (cursor.moveToFirst()) {
                String string = cursor.getString(cursor.getColumnIndexOrThrow(PushConstants.TITLE));
                final long j = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
                if (!TextUtils.isEmpty(string)) {
                    String format = String.format(getString(C0906R.string.biw), new Object[]{string});
                    AlertDialog.Builder b2 = k.b((Context) this);
                    b2.setTitle((int) C0906R.string.clc).setMessage((CharSequence) format).setPositiveButton((int) C0906R.string.b4c, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            e.a((Context) b.this).a(j);
                            b.this.finish();
                        }
                    }).setNegativeButton((int) C0906R.string.b49, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            b.this.finish();
                        }
                    }).setOnCancelListener(new DialogInterface.OnCancelListener() {
                        public final void onCancel(DialogInterface dialogInterface) {
                            b.this.finish();
                        }
                    });
                    b2.show();
                    return;
                }
                return;
            }
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception unused) {
                }
            }
        } finally {
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception unused2) {
                }
            }
        }
    }
}
