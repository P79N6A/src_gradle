package com.tt.miniapphost;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import com.tt.miniapphost.process.annotation.MiniAppProcess;
import java.io.ByteArrayOutputStream;

public class MiniappHostStackBase extends MiniappHostBase {
    private boolean mInForeground;

    public boolean isInForeground() {
        return this.mInForeground;
    }

    public void onPause() {
        super.onPause();
        this.mInForeground = false;
    }

    public void onResume() {
        super.onResume();
        this.mInForeground = true;
    }

    @MiniAppProcess
    public byte[] generateSnapshot() {
        View findViewById = findViewById(16908290);
        if (findViewById == null) {
            return null;
        }
        Bitmap createBitmap = Bitmap.createBitmap(findViewById.getMeasuredWidth(), findViewById.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        findViewById.draw(new Canvas(createBitmap));
        return compressSnapshot(createBitmap);
    }

    @MiniAppProcess
    private byte[] compressSnapshot(Bitmap bitmap) {
        int i = 100;
        byte[] bArr = null;
        while (i > 60) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.JPEG, i, byteArrayOutputStream);
            bArr = byteArrayOutputStream.toByteArray();
            i -= 20;
            if (bArr.length < 1048576) {
                break;
            }
        }
        return bArr;
    }
}
