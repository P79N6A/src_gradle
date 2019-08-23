package com.bytedance.scene;

import android.content.Intent;
import android.os.Messenger;

public final class k {

    /* renamed from: b  reason: collision with root package name */
    private static String f22144b = "SingeProcessMessengerHandler";

    /* renamed from: a  reason: collision with root package name */
    public Messenger f22145a;

    private k(Messenger messenger) {
        this.f22145a = messenger;
    }

    public static k a(Intent intent) {
        Messenger messenger = (Messenger) intent.getParcelableExtra(f22144b);
        if (messenger != null) {
            return new k(messenger);
        }
        return null;
    }
}
