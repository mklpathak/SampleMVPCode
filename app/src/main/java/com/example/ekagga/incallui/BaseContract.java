package com.example.ekagga.incallui;

public interface BaseContract {

    interface View<T extends Presenter> {
        void setPresenter(T presenter);
    }

    interface Presenter {
        void start();
        void stop();
    }
}