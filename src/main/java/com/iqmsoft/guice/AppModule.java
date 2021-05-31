package com.iqmsoft.guice;

import javax.inject.Singleton;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.iqmsoft.HelloService;
import com.iqmsoft.HelloServiceImpl;
import com.iqmsoft.ThrowableMapper;
import com.iqmsoft.HelloResource;

public class AppModule extends AbstractModule {

  @Override
  protected void configure() {
    bind(HelloResource.class);

    bind(ThrowableMapper.class);
  }

  @Provides
  @Singleton
  public HelloService helloService() {
    return new HelloServiceImpl();
  }

}
