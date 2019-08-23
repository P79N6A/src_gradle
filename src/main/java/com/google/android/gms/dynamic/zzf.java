package com.google.android.gms.dynamic;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.view.View;

public final class zzf implements View.OnClickListener {
    private /* synthetic */ Intent zzaSA;
    private /* synthetic */ Context zztH;

    zzf(Context context, Intent intent) {
        this.zztH = context;
        this.zzaSA = intent;
    }

    public final void onClick(View view) {
        try {
            this.zztH.startActivity(this.zzaSA);
        } catch (ActivityNotFoundException unused) {
        }
    }
}
