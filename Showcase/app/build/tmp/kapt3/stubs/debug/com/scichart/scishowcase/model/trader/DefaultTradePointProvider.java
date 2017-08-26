package com.scichart.scishowcase.model.trader;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0012\u0013\u0014B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016R\u0016\u0010\u0006\u001a\n \b*\u0004\u0018\u00010\u00070\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n \b*\u0004\u0018\u00010\n0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\r\u00a8\u0006\u0015"}, d2 = {"Lcom/scichart/scishowcase/model/trader/DefaultTradePointProvider;", "Lcom/scichart/scishowcase/model/trader/ITradePointsProvider;", "connectivityObservable", "Lio/reactivex/Observable;", "Lcom/github/pwittchen/reactivenetwork/library/rx2/Connectivity;", "(Lio/reactivex/Observable;)V", "okHttpClient", "Lokhttp3/OkHttpClient;", "kotlin.jvm.PlatformType", "retrofit", "Lretrofit2/Retrofit;", "service", "Lcom/scichart/scishowcase/model/trader/DefaultTradePointProvider$IFinanceService;", "Lcom/scichart/scishowcase/model/trader/DefaultTradePointProvider/IFinanceService;", "getTradePoints", "Lcom/scichart/scishowcase/model/trader/TradeDataPoints;", "tradeConfig", "Lcom/scichart/scishowcase/model/trader/TradeConfig;", "ConnectivityInterceptor", "FinanceConverterFactory", "IFinanceService", "app_debug"})
public final class DefaultTradePointProvider implements com.scichart.scishowcase.model.trader.ITradePointsProvider {
    private final okhttp3.OkHttpClient okHttpClient = null;
    private final retrofit2.Retrofit retrofit = null;
    private final com.scichart.scishowcase.model.trader.DefaultTradePointProvider.IFinanceService service = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.scichart.scishowcase.model.trader.TradeDataPoints getTradePoints(@org.jetbrains.annotations.NotNull()
    com.scichart.scishowcase.model.trader.TradeConfig tradeConfig) {
        return null;
    }
    
    public DefaultTradePointProvider(@org.jetbrains.annotations.NotNull()
    io.reactivex.Observable<com.github.pwittchen.reactivenetwork.library.rx2.Connectivity> connectivityObservable) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bb\u0018\u00002\u00020\u0001J6\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\u00062\b\b\u0003\u0010\n\u001a\u00020\u0006H\'\u00a8\u0006\u000b"}, d2 = {"Lcom/scichart/scishowcase/model/trader/DefaultTradePointProvider$IFinanceService;", "", "listTrades", "Lretrofit2/Call;", "Lokhttp3/ResponseBody;", "stockSymbol", "", "interval", "", "period", "data", "app_debug"})
    static abstract interface IFinanceService {
        
        @org.jetbrains.annotations.NotNull()
        @retrofit2.http.GET(value = "getprices")
        public abstract retrofit2.Call<okhttp3.ResponseBody> listTrades(@org.jetbrains.annotations.NotNull()
        @retrofit2.http.Query(value = "q")
        java.lang.String stockSymbol, @retrofit2.http.Query(value = "i")
        int interval, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Query(value = "p")
        java.lang.String period, @org.jetbrains.annotations.NotNull()
        @retrofit2.http.Query(value = "f")
        java.lang.String data);
        
        @kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 3)
        public static final class DefaultImpls {
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J=\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016\u00a2\u0006\u0002\u0010\rJ=\u0010\u000e\u001a\f\u0012\u0002\b\u0003\u0012\u0004\u0012\u00020\u000f0\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0010\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\n\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016\u00a2\u0006\u0002\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lcom/scichart/scishowcase/model/trader/DefaultTradePointProvider$FinanceConverterFactory;", "Lretrofit2/Converter$Factory;", "()V", "responseBodyConverter", "Lretrofit2/Converter;", "Lokhttp3/ResponseBody;", "type", "Ljava/lang/reflect/Type;", "annotations", "", "", "retrofit", "Lretrofit2/Retrofit;", "(Ljava/lang/reflect/Type;[Ljava/lang/annotation/Annotation;Lretrofit2/Retrofit;)Lretrofit2/Converter;", "stringConverter", "", "app_debug"})
    static final class FinanceConverterFactory extends retrofit2.Converter.Factory {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public retrofit2.Converter<okhttp3.ResponseBody, ?> responseBodyConverter(@org.jetbrains.annotations.Nullable()
        java.lang.reflect.Type type, @org.jetbrains.annotations.Nullable()
        java.lang.annotation.Annotation[] annotations, @org.jetbrains.annotations.Nullable()
        retrofit2.Retrofit retrofit) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public retrofit2.Converter<?, java.lang.String> stringConverter(@org.jetbrains.annotations.Nullable()
        java.lang.reflect.Type type, @org.jetbrains.annotations.Nullable()
        java.lang.annotation.Annotation[] annotations, @org.jetbrains.annotations.Nullable()
        retrofit2.Retrofit retrofit) {
            return null;
        }
        
        public FinanceConverterFactory() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\u0002\u0010\u0005J\u0015\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017\u00a2\u0006\u0002\u0010\fR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/scichart/scishowcase/model/trader/DefaultTradePointProvider$ConnectivityInterceptor;", "Lokhttp3/Interceptor;", "connectivityObservable", "Lio/reactivex/Observable;", "Lcom/github/pwittchen/reactivenetwork/library/rx2/Connectivity;", "(Lio/reactivex/Observable;)V", "isNetworkActive", "", "intercept", "Lokhttp3/Response;", "chain", "Lokhttp3/Interceptor$Chain;", "(Lokhttp3/Interceptor/Chain;)Lokhttp3/Response;", "app_debug"})
    static final class ConnectivityInterceptor implements okhttp3.Interceptor {
        private boolean isNetworkActive;
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public okhttp3.Response intercept(@org.jetbrains.annotations.NotNull()
        okhttp3.Interceptor.Chain chain) throws java.io.IOException {
            return null;
        }
        
        public ConnectivityInterceptor(@org.jetbrains.annotations.NotNull()
        io.reactivex.Observable<com.github.pwittchen.reactivenetwork.library.rx2.Connectivity> connectivityObservable) {
            super();
        }
    }
}