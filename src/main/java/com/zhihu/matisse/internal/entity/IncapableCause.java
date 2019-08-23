package com.zhihu.matisse.internal.entity;

import android.content.Context;
import android.os.Build;
import android.support.v4.app.FragmentActivity;
import android.widget.Toast;
import com.ss.android.ugc.aweme.utils.eq;
import com.zhihu.matisse.internal.ui.widget.IncapableDialog;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class IncapableCause {

    /* renamed from: a  reason: collision with root package name */
    private int f82630a;

    /* renamed from: b  reason: collision with root package name */
    private String f82631b;

    /* renamed from: c  reason: collision with root package name */
    private String f82632c;

    @Retention(RetentionPolicy.SOURCE)
    public @interface Form {
    }

    public IncapableCause(String str) {
        this.f82632c = str;
    }

    public IncapableCause(int i, String str) {
        this.f82630a = 1;
        this.f82632c = str;
    }

    public static void a(Context context, IncapableCause incapableCause) {
        if (incapableCause != null) {
            switch (incapableCause.f82630a) {
                case 1:
                    IncapableDialog.a(incapableCause.f82631b, incapableCause.f82632c).show(((FragmentActivity) context).getSupportFragmentManager(), IncapableDialog.class.getName());
                    return;
                case 2:
                    return;
                default:
                    Toast makeText = Toast.makeText(context, incapableCause.f82632c, 0);
                    if (Build.VERSION.SDK_INT == 25) {
                        eq.a(makeText);
                    }
                    makeText.show();
                    return;
            }
        }
    }
}
