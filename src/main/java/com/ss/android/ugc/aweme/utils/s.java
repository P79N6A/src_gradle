package com.ss.android.ugc.aweme.utils;

import android.content.Context;
import android.media.AudioManager;
import com.meituan.robust.ChangeQuickRedirect;

public class s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f75959a;

    /* renamed from: b  reason: collision with root package name */
    public AudioManager f75960b;

    /* renamed from: c  reason: collision with root package name */
    public AudioManager.OnAudioFocusChangeListener f75961c = new AudioManager.OnAudioFocusChangeListener() {
        public final void onAudioFocusChange(int i) {
        }
    };

    public s(Context context) {
        this.f75960b = (AudioManager) context.getApplicationContext().getSystemService("audio");
    }
}
