package com.ss.android.downloadlib.a;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.NotificationCompat;
import android.widget.Toast;
import com.ss.android.download.api.c.c;
import com.ss.android.download.api.config.h;
import com.ss.android.ugc.aweme.utils.eq;

public final class a implements h {
    public final Notification a(@NonNull NotificationCompat.Builder builder) {
        return builder.build();
    }

    public final Dialog a(@NonNull final c cVar) {
        if (cVar == null) {
            return null;
        }
        AlertDialog show = new AlertDialog.Builder(cVar.f28467a).setTitle(cVar.f28468b).setMessage(cVar.f28469c).setPositiveButton(cVar.f28470d, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (cVar.h != null) {
                    cVar.h.a(dialogInterface);
                }
            }
        }).setNegativeButton(cVar.f28471e, new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                if (cVar.h != null) {
                    cVar.h.b(dialogInterface);
                }
            }
        }).show();
        show.setCanceledOnTouchOutside(cVar.f28472f);
        show.setOnCancelListener(new DialogInterface.OnCancelListener() {
            public final void onCancel(DialogInterface dialogInterface) {
                if (cVar.h != null) {
                    cVar.h.c(dialogInterface);
                }
            }
        });
        if (cVar.g != null) {
            show.setIcon(cVar.g);
        }
        return show;
    }

    public final void a(@Nullable Context context, String str, Drawable drawable, int i) {
        Toast makeText = Toast.makeText(context, str, 0);
        if (Build.VERSION.SDK_INT == 25) {
            eq.a(makeText);
        }
        makeText.show();
    }
}
