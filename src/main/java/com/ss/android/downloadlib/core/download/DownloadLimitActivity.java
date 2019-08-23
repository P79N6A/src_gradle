package com.ss.android.downloadlib.core.download;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.text.format.Formatter;
import com.ss.android.download.api.c.c;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.downloadlib.c.c;
import com.ss.android.socialbase.appdownloader.depend.IDownloadAlertDialog;
import com.ss.android.ugc.aweme.C0906R;
import java.util.LinkedList;
import java.util.Queue;

public class DownloadLimitActivity extends Activity {

    /* renamed from: c  reason: collision with root package name */
    private static String f28910c = "DownloadLimitActivity";

    /* renamed from: a  reason: collision with root package name */
    public Uri f28911a;

    /* renamed from: b  reason: collision with root package name */
    public Intent f28912b;

    /* renamed from: d  reason: collision with root package name */
    private IDownloadAlertDialog f28913d;

    /* renamed from: e  reason: collision with root package name */
    private Queue<Intent> f28914e = new LinkedList();

    public final void a() {
        this.f28913d = null;
        this.f28911a = null;
        b();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        Intent intent = getIntent();
        if (intent != null) {
            this.f28914e.add(intent);
            setIntent(null);
            b();
        }
        if (this.f28913d != null && !this.f28913d.isShowing()) {
            this.f28913d.show();
        }
    }

    private void b() {
        if (this.f28913d == null) {
            if (this.f28914e.isEmpty()) {
                finish();
                return;
            }
            this.f28912b = this.f28914e.poll();
            this.f28911a = this.f28912b.getData();
            if (this.f28911a == null) {
                a();
                return;
            }
            Cursor a2 = g.a(getApplicationContext()).a(this.f28911a, (String[]) null, (String) null, (String[]) null, (String) null);
            try {
                if (!a2.moveToFirst()) {
                    a();
                    if (a2 != null) {
                        try {
                            a2.close();
                        } catch (Exception unused) {
                            return;
                        }
                    }
                    return;
                }
                if (this.f28912b.getBooleanExtra("isNetworkDisallow", false)) {
                    c();
                } else {
                    a(a2);
                }
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

    private void c() {
        c.a(f28910c, "showNetworkDisallowDialog:", null);
        k.d().a(new c.a(this).a(getString(C0906R.string.clc)).b(getString(C0906R.string.bg_)).c(getString(C0906R.string.bjh)).a((c.b) new c.b() {
            public final void a(DialogInterface dialogInterface) {
                DownloadLimitActivity.this.finish();
            }

            public final void b(DialogInterface dialogInterface) {
                DownloadLimitActivity.this.finish();
            }

            public final void c(DialogInterface dialogInterface) {
                DownloadLimitActivity.this.finish();
            }
        }).a());
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @TargetApi(3)
    private void a(Cursor cursor) {
        String str;
        String str2;
        String str3;
        String str4;
        String formatFileSize = Formatter.formatFileSize(this, (long) cursor.getInt(cursor.getColumnIndexOrThrow("total_bytes")));
        String string = getString(C0906R.string.p1);
        if (this.f28912b.getExtras().getBoolean("isWifiRequired")) {
            str2 = getString(C0906R.string.dty);
            str = getString(C0906R.string.dtx, new Object[]{formatFileSize, string});
            str4 = getString(C0906R.string.p1);
            str3 = getString(C0906R.string.oz);
        } else {
            str2 = getString(C0906R.string.dtw);
            str = getString(C0906R.string.dtv, new Object[]{formatFileSize, string});
            String string2 = getString(C0906R.string.p2);
            str3 = getString(C0906R.string.p1);
            str4 = string2;
        }
        com.ss.android.downloadlib.c.c.a(f28910c, "showSizeLimitDialog:", null);
        k.d().a(new c.a(this).a(str2).b(str).c(str4).d(str3).a((c.b) new c.b() {
            public final void c(DialogInterface dialogInterface) {
                DownloadLimitActivity.this.finish();
            }

            public final void a(DialogInterface dialogInterface) {
                if (!DownloadLimitActivity.this.f28912b.getExtras().getBoolean("isWifiRequired")) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("bypass_recommended_size_limit", Boolean.TRUE);
                    d.a(DownloadLimitActivity.this.getApplicationContext()).f28953c.a(0, null, DownloadLimitActivity.this.f28911a, contentValues, null, null);
                }
                DownloadLimitActivity.this.a();
            }

            public final void b(DialogInterface dialogInterface) {
                if (DownloadLimitActivity.this.f28912b.getExtras().getBoolean("isWifiRequired")) {
                    d.a(DownloadLimitActivity.this.getApplicationContext()).f28953c.a(0, null, DownloadLimitActivity.this.f28911a, null, null);
                }
                DownloadLimitActivity.this.a();
            }
        }).a());
    }
}
