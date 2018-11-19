package com.example.ekagga.incallui.InCallMain

import android.content.Context
import android.support.annotation.NonNull
import com.example.ekagga.incallui.BasePresenter

class InCallMainActivityPresenter(@param:NonNull private val mContext: Context, @param:NonNull private val mView: InCallMainActivityContract.View) : BasePresenter(), InCallMainActivityContract.Presenter {

    init {
        this.mView.setPresenter(this)
    }

   override fun start() {

    }

   override fun stop() {

    }
}
