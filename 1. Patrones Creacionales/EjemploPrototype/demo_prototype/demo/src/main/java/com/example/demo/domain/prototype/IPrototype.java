package com.example.demo.domain.prototype;

public interface IPrototype <T> extends Cloneable {

    T clonacionSimple();
    T clonacionProfunda();


}
