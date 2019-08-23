package android.support.v4.app;

import android.content.DialogInterface;
import android.view.KeyEvent;

public final /* synthetic */ class LiveDialogFragment$$Lambda$0 implements DialogInterface.OnKeyListener {
    private final LiveDialogFragment arg$1;

    LiveDialogFragment$$Lambda$0(LiveDialogFragment liveDialogFragment) {
        this.arg$1 = liveDialogFragment;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        return this.arg$1.lambda$onViewCreated$0$LiveDialogFragment(dialogInterface, i, keyEvent);
    }
}
