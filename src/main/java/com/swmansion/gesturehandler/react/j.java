package com.swmansion.gesturehandler.react;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;
import com.facebook.react.views.view.ReactViewGroup;
import com.swmansion.gesturehandler.l;
import com.swmansion.gesturehandler.p;

public final class j implements p {
    public final l a(View view) {
        PointerEvents pointerEvents;
        if (view instanceof ReactPointerEventsView) {
            pointerEvents = ((ReactPointerEventsView) view).getPointerEvents();
        } else {
            pointerEvents = PointerEvents.AUTO;
        }
        if (!view.isEnabled()) {
            if (pointerEvents == PointerEvents.AUTO) {
                return l.BOX_NONE;
            }
            if (pointerEvents == PointerEvents.BOX_ONLY) {
                return l.NONE;
            }
        }
        switch (pointerEvents) {
            case BOX_ONLY:
                return l.BOX_ONLY;
            case BOX_NONE:
                return l.BOX_NONE;
            case NONE:
                return l.NONE;
            default:
                return l.AUTO;
        }
    }

    public final View a(ViewGroup viewGroup, int i) {
        if (viewGroup instanceof ReactViewGroup) {
            return viewGroup.getChildAt(((ReactViewGroup) viewGroup).getZIndexMappedChildIndex(i));
        }
        return viewGroup.getChildAt(i);
    }
}
