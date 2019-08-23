package com.ss.android.socialbase.appdownloader.view;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.Formatter;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.ss.android.socialbase.appdownloader.AppDownloader;
import com.ss.android.socialbase.appdownloader.a.a;
import com.ss.android.socialbase.appdownloader.d;
import com.ss.android.socialbase.appdownloader.depend.IAppDownloadDepend;
import com.ss.android.socialbase.appdownloader.depend.IDownloadAlertDialog;
import com.ss.android.socialbase.appdownloader.depend.IDownloadAlertDialogBuilder;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.ugc.aweme.C0906R;
import java.util.LinkedList;
import java.util.Queue;

public class DownloadSizeLimitActivity extends Activity implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    private IDownloadAlertDialog f30789a;

    /* renamed from: b  reason: collision with root package name */
    private Queue<Intent> f30790b = new LinkedList();

    /* renamed from: c  reason: collision with root package name */
    private Intent f30791c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f30792d;

    /* renamed from: e  reason: collision with root package name */
    private int f30793e;

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.socialbase.appdownloader.view.DownloadSizeLimitActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.socialbase.appdownloader.view.DownloadSizeLimitActivity", "onCreate", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.socialbase.appdownloader.view.DownloadSizeLimitActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    private void b() {
        this.f30789a = null;
        this.f30792d = false;
        this.f30793e = 0;
        a();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.socialbase.appdownloader.view.DownloadSizeLimitActivity", "onResume", true);
        super.onResume();
        Intent intent = getIntent();
        if (intent != null) {
            this.f30790b.add(intent);
            setIntent(null);
            a();
        }
        if (this.f30789a != null && !this.f30789a.isShowing()) {
            this.f30789a.show();
        }
        ActivityInstrumentation.onTrace("com.ss.android.socialbase.appdownloader.view.DownloadSizeLimitActivity", "onResume", false);
    }

    private void a() {
        int i;
        if (this.f30789a == null) {
            if (this.f30790b.isEmpty()) {
                finish();
                return;
            }
            this.f30791c = this.f30790b.poll();
            DownloadInfo downloadInfo = Downloader.getInstance(getApplicationContext()).getDownloadInfo(this.f30791c.getIntExtra("extra_click_download_ids", 0));
            if (downloadInfo == null) {
                b();
                return;
            }
            this.f30793e = downloadInfo.getId();
            this.f30792d = downloadInfo.isOnlyWifi();
            String formatFileSize = Formatter.formatFileSize(this, downloadInfo.getTotalBytes());
            boolean useReflectParseRes = AppDownloader.getInstance().useReflectParseRes();
            int i2 = C0906R.string.appdownloader_button_queue_for_wifi;
            if (useReflectParseRes) {
                i = d.b(this, "appdownloader_button_queue_for_wifi");
            } else {
                i = C0906R.string.appdownloader_button_queue_for_wifi;
            }
            String string = getString(i);
            IAppDownloadDepend appDownloadDepend = AppDownloader.getInstance().getAppDownloadDepend();
            if (appDownloadDepend != null) {
                IDownloadAlertDialogBuilder themedAlertDlgBuilder = appDownloadDepend.getThemedAlertDlgBuilder(this);
                if (themedAlertDlgBuilder == null) {
                    themedAlertDlgBuilder = new a(this);
                }
                if (themedAlertDlgBuilder != null) {
                    if (this.f30792d) {
                        int i3 = C0906R.string.appdownloader_wifi_required_title;
                        if (AppDownloader.getInstance().useReflectParseRes()) {
                            i3 = d.b(this, "appdownloader_wifi_required_title");
                        }
                        int i4 = C0906R.string.appdownloader_wifi_required_body;
                        if (AppDownloader.getInstance().useReflectParseRes()) {
                            i4 = d.b(this, "appdownloader_wifi_required_body");
                        }
                        if (AppDownloader.getInstance().useReflectParseRes()) {
                            i2 = d.b(this, "appdownloader_button_queue_for_wifi");
                        }
                        int i5 = C0906R.string.appdownloader_button_cancel_download;
                        if (AppDownloader.getInstance().useReflectParseRes()) {
                            i5 = d.b(this, "appdownloader_button_cancel_download");
                        }
                        themedAlertDlgBuilder.setTitle(i3).setMessage(getString(i4, new Object[]{formatFileSize, string})).setPositiveButton(i2, (DialogInterface.OnClickListener) this).setNegativeButton(i5, (DialogInterface.OnClickListener) this);
                    } else {
                        int i6 = C0906R.string.appdownloader_wifi_recommended_title;
                        if (AppDownloader.getInstance().useReflectParseRes()) {
                            i6 = d.b(this, "appdownloader_wifi_recommended_title");
                        }
                        int i7 = C0906R.string.appdownloader_wifi_recommended_body;
                        if (AppDownloader.getInstance().useReflectParseRes()) {
                            i7 = d.b(this, "appdownloader_wifi_recommended_body");
                        }
                        int i8 = C0906R.string.appdownloader_button_start_now;
                        if (AppDownloader.getInstance().useReflectParseRes()) {
                            i8 = d.b(this, "appdownloader_button_start_now");
                        }
                        if (AppDownloader.getInstance().useReflectParseRes()) {
                            i2 = d.b(this, "appdownloader_button_queue_for_wifi");
                        }
                        themedAlertDlgBuilder.setTitle(i6).setMessage(getString(i7, new Object[]{formatFileSize, string})).setPositiveButton(i8, (DialogInterface.OnClickListener) this).setNegativeButton(i2, (DialogInterface.OnClickListener) this);
                    }
                    this.f30789a = themedAlertDlgBuilder.setOnCancelListener(new DialogInterface.OnCancelListener() {
                        public final void onCancel(DialogInterface dialogInterface) {
                            DownloadSizeLimitActivity.this.finish();
                        }
                    }).show();
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        if (!this.f30792d || i != -2) {
            if (!this.f30792d && i == -1) {
                Downloader.getInstance(getApplicationContext()).forceDownloadIngoreRecommendSize(this.f30793e);
            }
        } else if (this.f30793e != 0) {
            Downloader.getInstance(getApplicationContext()).clearDownloadData(this.f30793e);
        }
        b();
    }
}
