package com.scichart.scishowcase.model.trader;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B1\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/scichart/scishowcase/model/trader/TraderDataProvider;", "Lcom/scichart/scishowcase/model/IDataProvider;", "Lcom/scichart/scishowcase/model/trader/TradeDataPoints;", "tradeConfigObservable", "Lio/reactivex/Observable;", "Lcom/scichart/scishowcase/model/trader/TradeConfig;", "connectivityObservable", "Lcom/github/pwittchen/reactivenetwork/library/rx2/Connectivity;", "defaultProvider", "Lcom/scichart/scishowcase/model/trader/ITradePointsProvider;", "stubProvider", "(Lio/reactivex/Observable;Lio/reactivex/Observable;Lcom/scichart/scishowcase/model/trader/ITradePointsProvider;Lcom/scichart/scishowcase/model/trader/ITradePointsProvider;)V", "getData", "app_debug"})
public final class TraderDataProvider implements com.scichart.scishowcase.model.IDataProvider<com.scichart.scishowcase.model.trader.TradeDataPoints> {
    private final io.reactivex.Observable<com.scichart.scishowcase.model.trader.TradeConfig> tradeConfigObservable = null;
    private final io.reactivex.Observable<com.github.pwittchen.reactivenetwork.library.rx2.Connectivity> connectivityObservable = null;
    private final com.scichart.scishowcase.model.trader.ITradePointsProvider defaultProvider = null;
    private final com.scichart.scishowcase.model.trader.ITradePointsProvider stubProvider = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<com.scichart.scishowcase.model.trader.TradeDataPoints> getData() {
        return null;
    }
    
    public TraderDataProvider(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<com.scichart.scishowcase.model.trader.TradeConfig> tradeConfigObservable, @org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<com.github.pwittchen.reactivenetwork.library.rx2.Connectivity> connectivityObservable, @org.jetbrains.annotations.NotNull()
    com.scichart.scishowcase.model.trader.ITradePointsProvider defaultProvider, @org.jetbrains.annotations.NotNull()
    com.scichart.scishowcase.model.trader.ITradePointsProvider stubProvider) {
        super();
    }
}