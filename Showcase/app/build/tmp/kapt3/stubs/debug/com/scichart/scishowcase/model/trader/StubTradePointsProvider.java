package com.scichart.scishowcase.model.trader;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0010"}, d2 = {"Lcom/scichart/scishowcase/model/trader/StubTradePointsProvider;", "Lcom/scichart/scishowcase/model/trader/ITradePointsProvider;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "DATE_FORMAT", "", "EURUSD_DAILY_PATH", "tradePoints", "Lcom/scichart/scishowcase/model/trader/TradeDataPoints;", "getTradePoints", "()Lcom/scichart/scishowcase/model/trader/TradeDataPoints;", "tradePoints$delegate", "Lkotlin/Lazy;", "tradeConfig", "Lcom/scichart/scishowcase/model/trader/TradeConfig;", "app_debug"})
public final class StubTradePointsProvider implements com.scichart.scishowcase.model.trader.ITradePointsProvider {
    private final java.lang.String EURUSD_DAILY_PATH = "data/EURUSD_Daily.csv";
    private final java.lang.String DATE_FORMAT = "yyyy.MM.dd";
    private final kotlin.Lazy tradePoints$delegate = null;
    private final android.content.Context context = null;
    
    private final com.scichart.scishowcase.model.trader.TradeDataPoints getTradePoints() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.scichart.scishowcase.model.trader.TradeDataPoints getTradePoints(@org.jetbrains.annotations.NotNull()
    com.scichart.scishowcase.model.trader.TradeConfig tradeConfig) {
        return null;
    }
    
    public StubTradePointsProvider(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}