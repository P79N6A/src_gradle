package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.Resources;
import com.ss.android.ugc.aweme.C0906R;

public final class zzby {
    private final Resources zzaIw;
    private final String zzaIx = this.zzaIw.getResourcePackageName(C0906R.string.a0c);

    public zzby(Context context) {
        zzbo.zzu(context);
        this.zzaIw = context.getResources();
    }

    public final String getString(String str) {
        int identifier = this.zzaIw.getIdentifier(str, "string", this.zzaIx);
        if (identifier == 0) {
            return null;
        }
        return this.zzaIw.getString(identifier);
    }
}
