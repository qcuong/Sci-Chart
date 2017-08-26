package com.scichart.scishowcase.application;

@kotlin.Metadata(mv = {1, 1, 6}, bv = {1, 0, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0081\u0002\u0018\u00002\u00020\u0001B\u001c\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0006R\t\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0000R\t\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0000R\t\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/scichart/scishowcase/application/ExampleDefinition;", "", "title", "", "description", "icon", "", "app_debug"})
@java.lang.annotation.Target(value = {java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(value = java.lang.annotation.RetentionPolicy.RUNTIME)
@kotlin.annotation.Retention(value = kotlin.annotation.AnnotationRetention.RUNTIME)
@kotlin.annotation.Target(allowedTargets = {kotlin.annotation.AnnotationTarget.CLASS})
public abstract @interface ExampleDefinition {
    
    public abstract java.lang.String title();
    
    public abstract java.lang.String description() default "Example description should be here";
    
    public abstract int icon() default 2130837598;
}