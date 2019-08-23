package android.arch.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.support.annotation.NonNull;

public class AndroidViewModel extends ViewModel {
    @SuppressLint({"StaticFieldLeak"})
    private Application mApplication;

    @NonNull
    public <T extends Application> T getApplication() {
        return this.mApplication;
    }

    public AndroidViewModel(@NonNull Application application) {
        this.mApplication = application;
    }
}
