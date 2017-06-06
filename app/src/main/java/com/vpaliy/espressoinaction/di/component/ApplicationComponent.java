package com.vpaliy.espressoinaction.di.component;

import android.content.Context;

import com.vpaliy.espressoinaction.di.module.ApplicationModule;
import com.vpaliy.espressoinaction.di.module.DataModule;
import com.vpaliy.espressoinaction.domain.IRepository;
import com.vpaliy.espressoinaction.domain.model.Coffee;
import com.vpaliy.espressoinaction.domain.model.Order;
import com.vpaliy.espressoinaction.presentation.bus.RxBus;

import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {DataModule.class, ApplicationModule.class})
public interface ApplicationComponent {

    Context context();
    IRepository<Coffee> coffeeRepository();
    IRepository<Order> orderRepository();
    RxBus rxBus();
}
