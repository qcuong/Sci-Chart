package com.scichart.scishowcase.viewModels.trader;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0014\u0010\u0013\u001a\u00020\u00142\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0017"}, d2 = {"Lcom/scichart/scishowcase/viewModels/trader/TraderViewModel;", "Lcom/scichart/scishowcase/viewModels/FragmentViewModelBase;", "context", "Landroid/content/Context;", "dataProvider", "Lcom/scichart/scishowcase/model/trader/TraderDataProvider;", "(Landroid/content/Context;Lcom/scichart/scishowcase/model/trader/TraderDataProvider;)V", "macdVM", "Lcom/scichart/scishowcase/viewModels/trader/MacdViewModel;", "getMacdVM", "()Lcom/scichart/scishowcase/viewModels/trader/MacdViewModel;", "rsiVM", "Lcom/scichart/scishowcase/viewModels/trader/RsiViewModel;", "getRsiVM", "()Lcom/scichart/scishowcase/viewModels/trader/RsiViewModel;", "stockVM", "Lcom/scichart/scishowcase/viewModels/trader/StockChartViewModel;", "getStockVM", "()Lcom/scichart/scishowcase/viewModels/trader/StockChartViewModel;", "subscribe", "", "lifecycleProvider", "Lcom/trello/rxlifecycle2/LifecycleProvider;", "app_debug"})
public final class TraderViewModel extends com.scichart.scishowcase.viewModels.FragmentViewModelBase {
    @org.jetbrains.annotations.NotNull()
    private final com.scichart.scishowcase.viewModels.trader.StockChartViewModel stockVM = null;
    @org.jetbrains.annotations.NotNull()
    private final com.scichart.scishowcase.viewModels.trader.RsiViewModel rsiVM = null;
    @org.jetbrains.annotations.NotNull()
    private final com.scichart.scishowcase.viewModels.trader.MacdViewModel macdVM = null;
    private final com.scichart.scishowcase.model.trader.TraderDataProvider dataProvider = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.scichart.scishowcase.viewModels.trader.StockChartViewModel getStockVM() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.scichart.scishowcase.viewModels.trader.RsiViewModel getRsiVM() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.scichart.scishowcase.viewModels.trader.MacdViewModel getMacdVM() {
        return null;
    }
    
    @java.lang.Override()
    public void subscribe(@org.jetbrains.annotations.NotNull()
    com.trello.rxlifecycle2.LifecycleProvider<?> lifecycleProvider) {
    }
    
    public TraderViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.scichart.scishowcase.model.trader.TraderDataProvider dataProvider) {
        super(null);
    }
}