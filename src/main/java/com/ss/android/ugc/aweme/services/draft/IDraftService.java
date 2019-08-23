package com.ss.android.ugc.aweme.services.draft;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.draft.a.c;
import java.util.List;
import java.util.concurrent.ExecutorService;

public interface IDraftService {

    public interface DraftListener {
        void onDraftCheckedChanged(boolean z);

        void onDraftClean();

        void onDraftDelete(@Nullable c cVar);

        void onDraftUpdate(@NonNull c cVar);
    }

    public static class DraftListenerAdapter implements DraftListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        public void onDraftCheckedChanged(boolean z) {
        }

        public void onDraftClean() {
        }

        public void onDraftDelete(@Nullable c cVar) {
        }

        public void onDraftUpdate(@NonNull c cVar) {
        }
    }

    void delete(c cVar);

    Class<? extends Activity> draftBoxActivity();

    void enterDraftBox(Activity activity);

    ExecutorService getDraftExecutor();

    void notifyDraftCheckedChanged(boolean z);

    void notifyDraftClean();

    void notifyDraftDelete(@Nullable c cVar);

    void notifyDraftUpdate(@NonNull c cVar);

    List<c> queryAllDraftList();

    c queryDraft(String str);

    List<c> queryList();

    int queryMyDraftCount();

    void registerDraftListener(@NonNull DraftListener draftListener);

    long save(c cVar);

    void unregisterDraftListener(@NonNull DraftListener draftListener);
}
