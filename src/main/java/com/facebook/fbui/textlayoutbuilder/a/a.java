package com.facebook.fbui.textlayoutbuilder.a;

import android.graphics.Picture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.Layout;

public final class a implements com.facebook.fbui.textlayoutbuilder.a {

    /* renamed from: a  reason: collision with root package name */
    private static C0263a f23771a;

    /* renamed from: com.facebook.fbui.textlayoutbuilder.a.a$a  reason: collision with other inner class name */
    static class C0263a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final Picture f23772a = new Picture();

        public C0263a(Looper looper) {
            super(looper);
        }

        public final void handleMessage(Message message) {
            Layout layout = (Layout) message.obj;
            try {
                Picture picture = this.f23772a;
                int i = 0;
                if (layout != null) {
                    int lineCount = layout.getLineCount();
                    int i2 = 0;
                    while (i < lineCount) {
                        i2 = Math.max(i2, (int) layout.getLineRight(i));
                        i++;
                    }
                    i = i2;
                }
                layout.draw(picture.beginRecording(i, com.facebook.fbui.textlayoutbuilder.b.a.a(layout)));
                this.f23772a.endRecording();
            } catch (Exception unused) {
            }
        }
    }

    public final void a(Layout layout) {
        if (f23771a == null) {
            HandlerThread handlerThread = new HandlerThread("GlyphWarmer");
            handlerThread.start();
            f23771a = new C0263a(handlerThread.getLooper());
        }
        C0263a aVar = f23771a;
        aVar.sendMessage(aVar.obtainMessage(1, layout));
    }
}
