package com.ss.android.socialbase.appdownloader.a;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.widget.Button;
import com.ss.android.socialbase.appdownloader.depend.AbsDownloadAlertDialogBuilder;
import com.ss.android.socialbase.appdownloader.depend.IDownloadAlertDialog;
import com.ss.android.socialbase.appdownloader.depend.IDownloadAlertDialogBuilder;

public final class a extends AbsDownloadAlertDialogBuilder {

    /* renamed from: a  reason: collision with root package name */
    private AlertDialog.Builder f30774a;

    /* renamed from: com.ss.android.socialbase.appdownloader.a.a$a  reason: collision with other inner class name */
    static class C0372a implements IDownloadAlertDialog {

        /* renamed from: a  reason: collision with root package name */
        private AlertDialog f30775a;

        public final void dismiss() {
            if (this.f30775a != null) {
                this.f30775a.dismiss();
            }
        }

        public final boolean isShowing() {
            if (this.f30775a != null) {
                return this.f30775a.isShowing();
            }
            return false;
        }

        public final void show() {
            if (this.f30775a != null) {
                this.f30775a.show();
            }
        }

        public C0372a(AlertDialog.Builder builder) {
            if (builder != null) {
                this.f30775a = builder.show();
            }
        }

        public final Button getButton(int i) {
            if (this.f30775a != null) {
                return this.f30775a.getButton(i);
            }
            return null;
        }
    }

    public final IDownloadAlertDialog show() {
        return new C0372a(this.f30774a);
    }

    public a(Context context) {
        this.f30774a = new AlertDialog.Builder(context);
    }

    public final IDownloadAlertDialogBuilder setMessage(String str) {
        if (this.f30774a != null) {
            this.f30774a.setMessage(str);
        }
        return this;
    }

    public final IDownloadAlertDialogBuilder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        if (this.f30774a != null) {
            this.f30774a.setOnCancelListener(onCancelListener);
        }
        return this;
    }

    public final IDownloadAlertDialogBuilder setTitle(int i) {
        if (this.f30774a != null) {
            this.f30774a.setTitle(i);
        }
        return this;
    }

    public final IDownloadAlertDialogBuilder setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        if (this.f30774a != null) {
            this.f30774a.setNegativeButton(i, onClickListener);
        }
        return this;
    }

    public final IDownloadAlertDialogBuilder setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        if (this.f30774a != null) {
            this.f30774a.setPositiveButton(i, onClickListener);
        }
        return this;
    }

    public final IDownloadAlertDialogBuilder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        if (this.f30774a != null) {
            this.f30774a.setNegativeButton(charSequence, onClickListener);
        }
        return this;
    }

    public final IDownloadAlertDialogBuilder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        if (this.f30774a != null) {
            this.f30774a.setPositiveButton(charSequence, onClickListener);
        }
        return this;
    }
}
