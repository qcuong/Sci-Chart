package com.scichart.scishowcase.viewModels.trader;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/scichart/scishowcase/viewModels/trader/MacdViewModel;", "Lcom/scichart/scishowcase/viewModels/ChartViewModel;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "histogramDataSeries", "Lcom/scichart/charting/model/dataSeries/XyDataSeries;", "Ljava/util/Date;", "", "macdDataSeries", "Lcom/scichart/charting/model/dataSeries/XyyDataSeries;", "setData", "", "data", "Lcom/scichart/scishowcase/model/trader/TradeDataPoints;", "app_debug"})
public final class MacdViewModel extends com.scichart.scishowcase.viewModels.ChartViewModel {
    private final com.scichart.charting.model.dataSeries.XyDataSeries<java.util.Date, java.lang.Double> histogramDataSeries = null;
    private final com.scichart.charting.model.dataSeries.XyyDataSeries<java.util.Date, java.lang.Double> macdDataSeries = null;
    
    public final void setData(@org.jetbrains.annotations.NotNull()
    com.scichart.scishowcase.model.trader.TradeDataPoints data) {
    }
    
    public MacdViewModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
}