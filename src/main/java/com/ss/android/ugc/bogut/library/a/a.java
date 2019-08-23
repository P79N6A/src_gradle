package com.ss.android.ugc.bogut.library.a;

import android.os.Bundle;
import android.support.annotation.Nullable;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class a<View> {
    private CopyOnWriteArrayList<C0806a> onDestroyListeners = new CopyOnWriteArrayList<>();
    @Nullable
    public View view;

    /* renamed from: com.ss.android.ugc.bogut.library.a.a$a  reason: collision with other inner class name */
    public interface C0806a {
        void a();
    }

    /* access modifiers changed from: protected */
    public void onAttachView(View view2) {
    }

    /* access modifiers changed from: protected */
    public void onCreate(@Nullable Bundle bundle) {
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
    }

    /* access modifiers changed from: protected */
    public void onDropView() {
    }

    /* access modifiers changed from: protected */
    public void onSave(Bundle bundle) {
    }

    public void detachView() {
        onDropView();
        this.view = null;
    }

    public void destroy() {
        Iterator<C0806a> it2 = this.onDestroyListeners.iterator();
        while (it2.hasNext()) {
            it2.next().a();
        }
        onDestroy();
    }

    public void create(Bundle bundle) {
        onCreate(bundle);
    }

    public void save(Bundle bundle) {
        onSave(bundle);
    }

    public void addOnDestroyListener(C0806a aVar) {
        this.onDestroyListeners.add(aVar);
    }

    public void attachView(View view2) {
        this.view = view2;
        onAttachView(view2);
    }

    public void removeOnDestroyListener(C0806a aVar) {
        this.onDestroyListeners.remove(aVar);
    }
}
