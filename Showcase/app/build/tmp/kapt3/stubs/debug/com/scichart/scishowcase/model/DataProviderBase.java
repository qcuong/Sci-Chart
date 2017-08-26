package com.scichart.scishowcase.model;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0016J\r\u0010\u000e\u001a\u00028\u0000H$\u00a2\u0006\u0002\u0010\u000fJ\b\u0010\u0010\u001a\u00020\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0011H\u0014J\b\u0010\u0013\u001a\u00020\u0011H\u0002J\b\u0010\u0014\u001a\u00020\u0011H\u0002R2\u0010\b\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000 \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00018\u00008\u0000\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\f8\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/scichart/scishowcase/model/DataProviderBase;", "E", "Lcom/scichart/scishowcase/model/IDataProvider;", "interval", "", "timeUnit", "Ljava/util/concurrent/TimeUnit;", "(JLjava/util/concurrent/TimeUnit;)V", "dataObservable", "Lio/reactivex/Observable;", "kotlin.jvm.PlatformType", "isStarted", "", "getData", "onNext", "()Ljava/lang/Object;", "onStart", "", "onStop", "tryStart", "tryStop", "app_debug"})
public abstract class DataProviderBase<E extends java.lang.Object> implements com.scichart.scishowcase.model.IDataProvider<E> {
    private final io.reactivex.Observable<E> dataObservable = null;
    private volatile boolean isStarted;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Observable<E> getData() {
        return null;
    }
    
    private final void tryStart() {
    }
    
    private final void tryStop() {
    }
    
    protected void onStart() {
    }
    
    protected void onStop() {
    }
    
    protected abstract E onNext();
    
    public DataProviderBase(long interval, @org.jetbrains.annotations.NotNull()
    java.util.concurrent.TimeUnit timeUnit) {
        super();
    }
}