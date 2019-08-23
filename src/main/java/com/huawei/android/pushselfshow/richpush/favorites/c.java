package com.huawei.android.pushselfshow.richpush.favorites;

import android.content.DialogInterface;

public class c implements DialogInterface.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ FavoritesActivity f25250a;

    c(FavoritesActivity favoritesActivity) {
        this.f25250a = favoritesActivity;
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        this.f25250a.i.setEnabled(false);
        new Thread(new d(this)).start();
    }
}
