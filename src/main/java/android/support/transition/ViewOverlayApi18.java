package android.support.transition;

import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.annotation.RequiresApi;
import android.view.View;
import android.view.ViewOverlay;

@RequiresApi(18)
public class ViewOverlayApi18 implements ViewOverlayImpl {
    private final ViewOverlay mViewOverlay;

    public void clear() {
        this.mViewOverlay.clear();
    }

    public void add(@NonNull Drawable drawable) {
        this.mViewOverlay.add(drawable);
    }

    public void remove(@NonNull Drawable drawable) {
        this.mViewOverlay.remove(drawable);
    }

    ViewOverlayApi18(@NonNull View view) {
        this.mViewOverlay = view.getOverlay();
    }
}
