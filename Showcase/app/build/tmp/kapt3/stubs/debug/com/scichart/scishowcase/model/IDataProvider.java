package com.scichart.scishowcase.model;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u000e\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/scichart/scishowcase/model/IDataProvider;", "E", "", "getData", "Lio/reactivex/Observable;", "app_debug"})
public abstract interface IDataProvider<E extends java.lang.Object> {
    
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.Observable<E> getData();
}