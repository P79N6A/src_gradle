package anet.channel.strategy;

public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f1376a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ StrategyInfoHolder f1377b;

    public void run() {
        this.f1377b.a(this.f1376a, true);
    }

    e(StrategyInfoHolder strategyInfoHolder, String str) {
        this.f1377b = strategyInfoHolder;
        this.f1376a = str;
    }
}
