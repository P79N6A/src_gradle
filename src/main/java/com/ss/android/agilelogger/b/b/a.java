package com.ss.android.agilelogger.b.b;

import com.ss.android.agilelogger.b.b;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public final class a implements b<String> {

    /* renamed from: a  reason: collision with root package name */
    private SimpleDateFormat f27883a;

    /* renamed from: b  reason: collision with root package name */
    private Date f27884b;

    public a() {
        this("MM-dd HH:mm:ss");
    }

    public final /* bridge */ /* synthetic */ String a(Object obj) {
        return (String) obj;
    }

    private a(String str) {
        this.f27884b = new Date();
        this.f27883a = new SimpleDateFormat(str, Locale.getDefault());
    }
}
