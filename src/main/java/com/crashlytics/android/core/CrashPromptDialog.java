package com.crashlytics.android.core;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.ScrollView;
import android.widget.TextView;
import io.fabric.sdk.android.services.f.o;
import java.util.concurrent.CountDownLatch;

public class CrashPromptDialog {
    private final AlertDialog.Builder dialog;
    private final OptInLatch latch;

    interface AlwaysSendCallback {
        void sendUserReportsWithoutPrompting(boolean z);
    }

    static class OptInLatch {
        private final CountDownLatch latch;
        private boolean send;

        /* access modifiers changed from: package-private */
        public boolean getOptIn() {
            return this.send;
        }

        /* access modifiers changed from: package-private */
        public void await() {
            try {
                this.latch.await();
            } catch (InterruptedException unused) {
            }
        }

        private OptInLatch() {
            this.latch = new CountDownLatch(1);
        }

        /* access modifiers changed from: package-private */
        public void setOptIn(boolean z) {
            this.send = z;
            this.latch.countDown();
        }
    }

    private static int dipsToPixels(float f2, int i) {
        return (int) (f2 * ((float) i));
    }

    public void await() {
        this.latch.await();
    }

    public boolean getOptIn() {
        return this.latch.getOptIn();
    }

    public void show() {
        this.dialog.show();
    }

    private CrashPromptDialog(AlertDialog.Builder builder, OptInLatch optInLatch) {
        this.latch = optInLatch;
        this.dialog = builder;
    }

    private static ScrollView createDialogView(Activity activity, String str) {
        float f2 = activity.getResources().getDisplayMetrics().density;
        int dipsToPixels = dipsToPixels(f2, 5);
        TextView textView = new TextView(activity);
        textView.setAutoLinkMask(15);
        textView.setText(str);
        textView.setTextAppearance(activity, 16973892);
        textView.setPadding(dipsToPixels, dipsToPixels, dipsToPixels, dipsToPixels);
        textView.setFocusable(false);
        ScrollView scrollView = new ScrollView(activity);
        scrollView.setPadding(dipsToPixels(f2, 14), dipsToPixels(f2, 2), dipsToPixels(f2, 10), dipsToPixels(f2, 12));
        scrollView.addView(textView);
        return scrollView;
    }

    public static CrashPromptDialog create(Activity activity, o oVar, final AlwaysSendCallback alwaysSendCallback) {
        final OptInLatch optInLatch = new OptInLatch();
        DialogStringResolver dialogStringResolver = new DialogStringResolver(activity, oVar);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        ScrollView createDialogView = createDialogView(activity, dialogStringResolver.getMessage());
        builder.setView(createDialogView).setTitle(dialogStringResolver.getTitle()).setCancelable(false).setNeutralButton(dialogStringResolver.getSendButtonTitle(), new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                optInLatch.setOptIn(true);
                dialogInterface.dismiss();
            }
        });
        if (oVar.f83339d) {
            builder.setNegativeButton(dialogStringResolver.getCancelButtonTitle(), new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    optInLatch.setOptIn(false);
                    dialogInterface.dismiss();
                }
            });
        }
        if (oVar.f83341f) {
            builder.setPositiveButton(dialogStringResolver.getAlwaysSendButtonTitle(), new DialogInterface.OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    alwaysSendCallback.sendUserReportsWithoutPrompting(true);
                    optInLatch.setOptIn(true);
                    dialogInterface.dismiss();
                }
            });
        }
        return new CrashPromptDialog(builder, optInLatch);
    }
}
