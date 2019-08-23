package com.ss.android.downloadlib.addownload;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.download.api.c.c;
import com.ss.android.downloadlib.c.c;
import com.ss.android.downloadlib.core.download.a;
import com.ss.android.downloadlib.core.download.d;
import com.ss.android.downloadlib.e;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.C0906R;

public class AdDownloadDeleteActivity extends Activity {

    /* renamed from: e  reason: collision with root package name */
    private static String f28707e = "AdDownloadDeleteActivity";

    /* renamed from: a  reason: collision with root package name */
    public Uri f28708a;

    /* renamed from: b  reason: collision with root package name */
    public String f28709b;

    /* renamed from: c  reason: collision with root package name */
    public long f28710c;

    /* renamed from: d  reason: collision with root package name */
    public String f28711d;

    /* renamed from: f  reason: collision with root package name */
    private Dialog f28712f;
    private Intent g;
    private boolean h;

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        Intent intent = getIntent();
        this.g = intent;
        if (intent != null && !this.h && this.f28712f == null && this.g != null) {
            this.f28708a = this.g.getData();
            if (this.f28708a != null) {
                d.a((Context) this).f28953c.a(0, new a.C0346a() {
                    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0022 */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final void a(android.database.Cursor r2) {
                        /*
                            r1 = this;
                            boolean r0 = r2.moveToFirst()     // Catch:{ Exception -> 0x0022, all -> 0x001d }
                            if (r0 != 0) goto L_0x000b
                            r2.close()     // Catch:{ Exception -> 0x000a }
                            return
                        L_0x000a:
                            return
                        L_0x000b:
                            com.ss.android.downloadlib.addownload.AdDownloadDeleteActivity r0 = com.ss.android.downloadlib.addownload.AdDownloadDeleteActivity.this     // Catch:{ Exception -> 0x0022, all -> 0x001d }
                            boolean r0 = r0.a(r2)     // Catch:{ Exception -> 0x0022, all -> 0x001d }
                            if (r0 != 0) goto L_0x0018
                            com.ss.android.downloadlib.addownload.AdDownloadDeleteActivity r0 = com.ss.android.downloadlib.addownload.AdDownloadDeleteActivity.this     // Catch:{ Exception -> 0x0022, all -> 0x001d }
                            r0.finish()     // Catch:{ Exception -> 0x0022, all -> 0x001d }
                        L_0x0018:
                            r2.close()     // Catch:{ Exception -> 0x001c }
                            return
                        L_0x001c:
                            return
                        L_0x001d:
                            r0 = move-exception
                            r2.close()     // Catch:{ Exception -> 0x0021 }
                        L_0x0021:
                            throw r0
                        L_0x0022:
                            r2.close()     // Catch:{ Exception -> 0x0026 }
                            return
                        L_0x0026:
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.downloadlib.addownload.AdDownloadDeleteActivity.AnonymousClass1.a(android.database.Cursor):void");
                    }
                }, this.f28708a, null, null, null, null);
            }
        }
        if (this.f28712f != null && !this.f28712f.isShowing()) {
            this.f28712f.show();
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public final boolean a(Cursor cursor) {
        try {
            if (cursor.moveToFirst()) {
                this.f28709b = cursor.getString(cursor.getColumnIndexOrThrow(PushConstants.TITLE));
                this.f28710c = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
                this.f28711d = cursor.getString(cursor.getColumnIndexOrThrow("uri"));
                if (TextUtils.isEmpty(this.f28709b)) {
                    return false;
                }
                String str = f28707e;
                c.a(str, "showDialog mAppName:" + this.f28709b, null);
                this.f28712f = k.d().a(new c.a(this).a(getString(C0906R.string.clc)).b(String.format(getString(C0906R.string.biw), new Object[]{this.f28709b})).c(getString(C0906R.string.b4c)).d(getString(C0906R.string.b49)).a((c.b) new c.b() {
                    public final void b(DialogInterface dialogInterface) {
                        AdDownloadDeleteActivity.this.finish();
                    }

                    public final void c(DialogInterface dialogInterface) {
                        AdDownloadDeleteActivity.this.finish();
                    }

                    public final void a(DialogInterface dialogInterface) {
                        d.a((Context) AdDownloadDeleteActivity.this).a(AdDownloadDeleteActivity.this.f28710c);
                        long j = AdDownloadDeleteActivity.this.f28710c;
                        DownloadInfo a2 = new DownloadInfo.a(AdDownloadDeleteActivity.this.f28711d).a(AdDownloadDeleteActivity.this.f28709b).a();
                        a2.setId((int) j);
                        for (com.ss.android.download.api.b.a.a a3 : e.a().f29049b) {
                            a3.a(a2);
                        }
                        AdDownloadDeleteActivity.this.finish();
                    }
                }).a());
                this.h = true;
                return true;
            }
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception unused) {
                }
            }
            return false;
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
