package com.scichart.scishowcase.model.trader;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J6\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001aJ\u0006\u0010\u001f\u001a\u00020\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014\u00a8\u0006 "}, d2 = {"Lcom/scichart/scishowcase/model/trader/TradeDataPoints;", "", "()V", "closeValues", "Lcom/scichart/core/model/DoubleValues;", "getCloseValues", "()Lcom/scichart/core/model/DoubleValues;", "highValues", "getHighValues", "lowValues", "getLowValues", "openValues", "getOpenValues", "volumeValues", "getVolumeValues", "xValues", "Lcom/scichart/core/model/DateValues;", "getXValues", "()Lcom/scichart/core/model/DateValues;", "setXValues", "(Lcom/scichart/core/model/DateValues;)V", "append", "", "x", "", "open", "", "high", "low", "close", "volume", "clear", "app_debug"})
public final class TradeDataPoints {
    @org.jetbrains.annotations.NotNull()
    private com.scichart.core.model.DateValues xValues;
    @org.jetbrains.annotations.NotNull()
    private final com.scichart.core.model.DoubleValues openValues = null;
    @org.jetbrains.annotations.NotNull()
    private final com.scichart.core.model.DoubleValues highValues = null;
    @org.jetbrains.annotations.NotNull()
    private final com.scichart.core.model.DoubleValues lowValues = null;
    @org.jetbrains.annotations.NotNull()
    private final com.scichart.core.model.DoubleValues closeValues = null;
    @org.jetbrains.annotations.NotNull()
    private final com.scichart.core.model.DoubleValues volumeValues = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.scichart.core.model.DateValues getXValues() {
        return null;
    }
    
    public final void setXValues(@org.jetbrains.annotations.NotNull()
    com.scichart.core.model.DateValues p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.scichart.core.model.DoubleValues getOpenValues() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.scichart.core.model.DoubleValues getHighValues() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.scichart.core.model.DoubleValues getLowValues() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.scichart.core.model.DoubleValues getCloseValues() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.scichart.core.model.DoubleValues getVolumeValues() {
        return null;
    }
    
    public final void append(long x, double open, double high, double low, double close, double volume) {
    }
    
    public final void clear() {
    }
    
    public TradeDataPoints() {
        super();
    }
}