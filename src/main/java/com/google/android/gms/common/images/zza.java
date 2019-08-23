package com.google.android.gms.common.images;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.google.android.gms.common.internal.zzc;
import com.google.android.gms.internal.zzbfl;
import com.ss.android.ugc.bytex.a.a.a;

public abstract class zza {
    final zzb zzaGf;
    private int zzaGg;
    protected int zzaGh;
    private boolean zzaGi;
    private boolean zzaGj = true;
    private boolean zzaGk;
    private boolean zzaGl = true;

    public zza(Uri uri, int i) {
        this.zzaGf = new zzb(uri);
        this.zzaGh = i;
    }

    /* access modifiers changed from: package-private */
    public final void zza(Context context, Bitmap bitmap, boolean z) {
        zzc.zzr(bitmap);
        zza(new BitmapDrawable(context.getResources(), bitmap), z, false, true);
    }

    /* access modifiers changed from: package-private */
    public final void zza(Context context, zzbfl zzbfl) {
        if (this.zzaGl) {
            zza(null, false, true, false);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zza(Context context, zzbfl zzbfl, boolean z) {
        Drawable drawable;
        if (this.zzaGh != 0) {
            drawable = a.a(context.getResources(), this.zzaGh);
        } else {
            drawable = null;
        }
        zza(drawable, z, false, false);
    }

    /* access modifiers changed from: protected */
    public abstract void zza(Drawable drawable, boolean z, boolean z2, boolean z3);

    /* access modifiers changed from: protected */
    public final boolean zzc(boolean z, boolean z2) {
        return this.zzaGj && !z2 && !z;
    }
}