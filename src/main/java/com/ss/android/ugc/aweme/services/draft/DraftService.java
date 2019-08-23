package com.ss.android.ugc.aweme.services.draft;

import a.i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.draft.DraftBoxActivity;
import com.ss.android.ugc.aweme.draft.a.c;
import com.ss.android.ugc.aweme.draft.l;
import com.ss.android.ugc.aweme.filter.w;
import com.ss.android.ugc.aweme.services.draft.IDraftService;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.b;
import com.ss.android.ugc.aweme.tools.a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

public class DraftService implements IDraftService {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<IDraftService.DraftListener> draftListeners = new ArrayList();

    public Class<? extends Activity> draftBoxActivity() {
        return DraftBoxActivity.class;
    }

    public ExecutorService getDraftExecutor() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71519, new Class[0], ExecutorService.class)) {
            return a.a();
        }
        return (ExecutorService) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71519, new Class[0], ExecutorService.class);
    }

    public void notifyDraftClean() {
        if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71517, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71517, new Class[0], Void.TYPE);
            return;
        }
        for (IDraftService.DraftListener onDraftClean : this.draftListeners) {
            onDraftClean.onDraftClean();
        }
    }

    public List<c> queryAllDraftList() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71509, new Class[0], List.class)) {
            return l.a().e();
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71509, new Class[0], List.class);
    }

    public List<c> queryList() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71508, new Class[0], List.class)) {
            return l.a().b();
        }
        return (List) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71508, new Class[0], List.class);
    }

    public int queryMyDraftCount() {
        if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 71506, new Class[0], Integer.TYPE)) {
            return l.a().c();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 71506, new Class[0], Integer.TYPE)).intValue();
    }

    public void unregisterDraftListener(@NonNull IDraftService.DraftListener draftListener) {
        if (PatchProxy.isSupport(new Object[]{draftListener}, this, changeQuickRedirect, false, 71514, new Class[]{IDraftService.DraftListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{draftListener}, this, changeQuickRedirect, false, 71514, new Class[]{IDraftService.DraftListener.class}, Void.TYPE);
            return;
        }
        if (this.draftListeners.contains(draftListener)) {
            this.draftListeners.remove(draftListener);
        }
    }

    public void delete(c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, changeQuickRedirect, false, 71510, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, changeQuickRedirect, false, 71510, new Class[]{c.class}, Void.TYPE);
            return;
        }
        l.a().d(cVar2);
        if (PatchProxy.isSupport(new Object[]{cVar2}, null, b.f68504a, true, 78107, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, null, b.f68504a, true, 78107, new Class[]{c.class}, Void.TYPE);
            return;
        }
        if (!(cVar2 == null || cVar.H() == null)) {
            i.a((Callable<TResult>) new com.ss.android.ugc.aweme.shortvideo.mvtemplate.c.c<TResult>(cVar2));
        }
    }

    public void enterDraftBox(Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, changeQuickRedirect, false, 71512, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, changeQuickRedirect, false, 71512, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        w.a();
        if (PatchProxy.isSupport(new Object[]{activity2}, null, DraftBoxActivity.f43399a, true, 38395, new Class[]{Context.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, null, DraftBoxActivity.f43399a, true, 38395, new Class[]{Context.class}, Void.TYPE);
            return;
        }
        if (activity2 != null) {
            activity2.startActivity(new Intent(activity2, DraftBoxActivity.class));
        }
    }

    public void notifyDraftCheckedChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, changeQuickRedirect, false, 71518, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, changeQuickRedirect, false, 71518, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        for (IDraftService.DraftListener onDraftCheckedChanged : this.draftListeners) {
            onDraftCheckedChanged.onDraftCheckedChanged(z);
        }
    }

    public void notifyDraftDelete(@Nullable c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, changeQuickRedirect, false, 71516, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, changeQuickRedirect, false, 71516, new Class[]{c.class}, Void.TYPE);
            return;
        }
        if (this.draftListeners != null) {
            for (int size = this.draftListeners.size() - 1; size >= 0; size--) {
                this.draftListeners.get(size).onDraftDelete(cVar);
            }
        }
    }

    public void notifyDraftUpdate(@NonNull c cVar) {
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{cVar2}, this, changeQuickRedirect, false, 71515, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar2}, this, changeQuickRedirect, false, 71515, new Class[]{c.class}, Void.TYPE);
            return;
        }
        for (IDraftService.DraftListener onDraftUpdate : this.draftListeners) {
            onDraftUpdate.onDraftUpdate(cVar2);
        }
    }

    public c queryDraft(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, changeQuickRedirect, false, 71507, new Class[]{String.class}, c.class)) {
            return l.a().a(str2);
        }
        return (c) PatchProxy.accessDispatch(new Object[]{str2}, this, changeQuickRedirect, false, 71507, new Class[]{String.class}, c.class);
    }

    public void registerDraftListener(@NonNull IDraftService.DraftListener draftListener) {
        if (PatchProxy.isSupport(new Object[]{draftListener}, this, changeQuickRedirect, false, 71513, new Class[]{IDraftService.DraftListener.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{draftListener}, this, changeQuickRedirect, false, 71513, new Class[]{IDraftService.DraftListener.class}, Void.TYPE);
        } else if (!this.draftListeners.contains(draftListener)) {
            this.draftListeners.add(draftListener);
        }
    }

    public long save(c cVar) {
        c cVar2 = cVar;
        if (!PatchProxy.isSupport(new Object[]{cVar2}, this, changeQuickRedirect, false, 71511, new Class[]{c.class}, Long.TYPE)) {
            return l.a().c(cVar2);
        }
        return ((Long) PatchProxy.accessDispatch(new Object[]{cVar2}, this, changeQuickRedirect, false, 71511, new Class[]{c.class}, Long.TYPE)).longValue();
    }
}
