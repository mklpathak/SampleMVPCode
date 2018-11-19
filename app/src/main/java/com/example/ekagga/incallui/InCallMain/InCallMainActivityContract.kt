package com.example.ekagga.incallui.InCallMain

import com.example.ekagga.incallui.BaseContract

//todo create BaseContract and import to this class
interface InCallMainActivityContract {

    interface View : BaseContract.View<Presenter>

    interface Presenter : BaseContract.Presenter
}
