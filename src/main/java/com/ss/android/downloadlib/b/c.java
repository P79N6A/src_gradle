package com.ss.android.downloadlib.b;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.widget.Button;
import com.ss.android.download.api.c.c;
import com.ss.android.downloadlib.addownload.k;
import com.ss.android.socialbase.appdownloader.depend.IAppDownloadDepend;
import com.ss.android.socialbase.appdownloader.depend.IDownloadAlertDialog;
import com.ss.android.socialbase.appdownloader.depend.IDownloadAlertDialogBuilder;

public class c implements IAppDownloadDepend {

    /* renamed from: a  reason: collision with root package name */
    public static String f28862a = "c";

    static class a implements IDownloadAlertDialog {

        /* renamed from: a  reason: collision with root package name */
        private Dialog f28870a;

        public final Button getButton(int i) {
            return null;
        }

        public final boolean isShowing() {
            if (this.f28870a != null) {
                return this.f28870a.isShowing();
            }
            return false;
        }

        public final void show() {
            if (this.f28870a != null) {
                this.f28870a.show();
            }
        }

        public final void dismiss() {
            if (this.f28870a != null) {
                Dialog dialog = this.f28870a;
                if (!com.ss.android.ugc.aweme.g.a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
                    dialog.dismiss();
                    return;
                }
                throw new IllegalStateException("debug check! this method should be called from main thread!");
            }
        }

        public a(Dialog dialog) {
            if (dialog != null) {
                this.f28870a = dialog;
                show();
            }
        }
    }

    public boolean getAllowBootReceiver() {
        return true;
    }

    public boolean getAllowNetwork(Context context) {
        return true;
    }

    public IDownloadAlertDialogBuilder getThemedAlertDlgBuilder(final Context context) {
        return new IDownloadAlertDialogBuilder() {

            /* renamed from: a  reason: collision with root package name */
            public DialogInterface.OnClickListener f28863a;

            /* renamed from: b  reason: collision with root package name */
            public DialogInterface.OnClickListener f28864b;

            /* renamed from: c  reason: collision with root package name */
            public DialogInterface.OnCancelListener f28865c;

            /* renamed from: f  reason: collision with root package name */
            private c.a f28868f = new c.a(context);

            public final IDownloadAlertDialogBuilder setIcon(int i) {
                return this;
            }

            public final IDownloadAlertDialog show() {
                this.f28868f.a((c.b) new c.b() {
                    public final void a(DialogInterface dialogInterface) {
                        if (AnonymousClass1.this.f28863a != null) {
                            AnonymousClass1.this.f28863a.onClick(dialogInterface, -1);
                        }
                    }

                    public final void b(DialogInterface dialogInterface) {
                        if (AnonymousClass1.this.f28864b != null) {
                            AnonymousClass1.this.f28864b.onClick(dialogInterface, -2);
                        }
                    }

                    public final void c(DialogInterface dialogInterface) {
                        if (AnonymousClass1.this.f28865c != null) {
                            AnonymousClass1.this.f28865c.onCancel(dialogInterface);
                        }
                    }
                });
                com.ss.android.downloadlib.c.c.a(c.f28862a, "getThemedAlertDlgBuilder", null);
                return new a(k.d().a(this.f28868f.a()));
            }

            public final IDownloadAlertDialogBuilder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
                this.f28865c = onCancelListener;
                return this;
            }

            public final IDownloadAlertDialogBuilder setCanceledOnTouchOutside(boolean z) {
                this.f28868f.a(z);
                return this;
            }

            public final IDownloadAlertDialogBuilder setIcon(Drawable drawable) {
                this.f28868f.a(drawable);
                return this;
            }

            public final IDownloadAlertDialogBuilder setMessage(String str) {
                this.f28868f.b(str);
                return this;
            }

            public final IDownloadAlertDialogBuilder setTitle(int i) {
                this.f28868f.a(context.getResources().getString(i));
                return this;
            }

            public final IDownloadAlertDialogBuilder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
                this.f28868f.d((String) charSequence);
                this.f28864b = onClickListener;
                return this;
            }

            public final IDownloadAlertDialogBuilder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
                this.f28868f.c((String) charSequence);
                this.f28863a = onClickListener;
                return this;
            }

            public final IDownloadAlertDialogBuilder setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
                this.f28868f.d(context.getResources().getString(i));
                this.f28864b = onClickListener;
                return this;
            }

            public final IDownloadAlertDialogBuilder setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
                this.f28868f.c(context.getResources().getString(i));
                this.f28863a = onClickListener;
                return this;
            }
        };
    }
}
